/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.archive.operations;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jem.util.emf.workbench.WorkbenchByteArrayOutputStream;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jem.workbench.utility.JemProjectUtilities;
import org.eclipse.jst.j2ee.commonarchivecore.internal.File;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.SaveFailureException;
import org.eclipse.jst.j2ee.commonarchivecore.internal.helpers.ArchiveManifest;
import org.eclipse.jst.j2ee.commonarchivecore.internal.util.ArchiveUtil;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFile;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;

public abstract class J2EEComponentSaveStrategyImpl extends ComponentSaveStrategyImpl {

	public J2EEComponentSaveStrategyImpl(IVirtualComponent vComponent) {
		super(vComponent);
	}

	protected void saveFiles() throws SaveFailureException {
		setImportedClassFilesIfNecessary();
		super.saveFiles();
		linkImportedClassesFolderIfNecessary();
	}

	public boolean endsWithClassType(String aFileName) {
		if (aFileName.endsWith(".class")) //$NON-NLS-1$
			return true;
		return false;
	}


	protected boolean shouldSave(File aFile) {
		String uri = aFile.getURI();
		if (endsWithClassType(uri))
			return false;
		return super.shouldSave(aFile);
	}

	public void save(ArchiveManifest aManifest) throws SaveFailureException {
		IVirtualFolder rootFolder = vComponent.getRootFolder();
		IVirtualFile vFile = rootFolder.getFile(new Path(J2EEConstants.MANIFEST_URI));
		IFile iFile = vFile.getUnderlyingFile();
		validateEdit(iFile);
		OutputStream out = new WorkbenchByteArrayOutputStream(iFile);
		try {
			aManifest.write(out);
		} catch (IOException e) {
			Logger.getLogger().logError(e);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				Logger.getLogger().logError(e);
			}
		}
	}

	protected Map importedClassFiles;
	protected IFolder importedClassesFolder;

	protected void linkImportedClassesFolderIfNecessary() {
		if (importedClassesFolder != null) {
			try {
				vComponent.getRootFolder().getFolder(getImportedClassesRuntimePath()).createLink(importedClassesFolder.getProjectRelativePath(), 0, null);
			} catch (CoreException e) {
				Logger.getLogger().logError(e);
			}
		}
	}

	/**
	 * Import class files into the project.
	 */
	protected void setImportedClassFilesIfNecessary() throws SaveFailureException {
		Map classFiles = getClassFilesWithoutSource();

		if (classFiles == null || classFiles.isEmpty())
			return;

		importedClassFiles = classFiles;

		IContainer jarParent = vComponent.getRootFolder().getUnderlyingFolder().getParent();
		String folderName = "ImportedClasses";
		importedClassesFolder = jarParent.getFolder(new Path(folderName));
		try {
			importedClassesFolder.create(true, true, null);

		} catch (CoreException e1) {
			Logger.getLogger().logError(e1);
		}
		IJavaProject javaProject = null;
		try {
			Iterator keys = importedClassFiles.keySet().iterator();
			String uri = null;
			File file = null;
			IFile iFile = null;
			InputStream inputStream = null;
			while (keys.hasNext()) {
				uri = (String) keys.next();
				file = (File) importedClassFiles.get(uri);
				try {
					iFile = importedClassesFolder.getFile(new Path(uri));
					inputStream = file.getInputStream();
					saveToIFile(iFile, inputStream);
				} catch (Exception e) {
					Logger.getLogger().logError(e);
				} finally {
					if (inputStream != null) {
						inputStream.close();
					}
				}
			}
			importedClassesFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
			if (shouldAddImportedClassesToClasspath()) {
				if (JemProjectUtilities.getJavaProject(vComponent.getProject()) != null) {
					javaProject = JavaCore.create(vComponent.getProject());
					IClasspathEntry[] javaClasspath = javaProject.getRawClasspath();
					IClasspathEntry[] newJavaClasspath = new IClasspathEntry[javaClasspath.length + 1];
					System.arraycopy(javaClasspath, 0, newJavaClasspath, 0, javaClasspath.length);
					newJavaClasspath[newJavaClasspath.length - 1] = JavaCore.newLibraryEntry(importedClassesFolder.getFullPath(), null, null, true);
					javaProject.setRawClasspath(newJavaClasspath, new NullProgressMonitor());
				}
			}
		} catch (IOException e) {
			Logger.getLogger().logError(e);
		} catch (JavaModelException e) {
			Logger.getLogger().logError(e);
		} catch (CoreException e) {
			Logger.getLogger().logError(e);
		} finally {
			try {
				if (javaProject != null)
					javaProject.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException ex) {
				Logger.getLogger().logError(ex);
			}
		}
	}

	protected boolean shouldAddImportedClassesToClasspath() {
		return true;
	}

	protected IPath getImportedClassesRuntimePath() {
		return new Path("/");
	}

	protected Map getClassFilesWithoutSource() {
		List files = archive.getFiles();
		Map result = new HashMap();
		for (int i = 0; i < files.size(); i++) {
			File aFile = (File) files.get(i);
			if (isClassWithoutSource(aFile)) {
				result.put(getImportedClassesURI(aFile), aFile);
			}
		}
		return result;
	}

	protected String getImportedClassesURI(File aFile) {
		return aFile.getURI();
	}


	protected boolean isClassWithoutSource(File aFile) {
		String javaUri = ArchiveUtil.classUriToJavaUri(aFile.getURI());
		if (javaUri == null)
			return false;
		return !archive.containsFile(javaUri);
	}
}
