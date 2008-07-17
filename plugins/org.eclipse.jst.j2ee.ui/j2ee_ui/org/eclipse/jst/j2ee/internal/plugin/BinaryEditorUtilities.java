/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.jst.j2ee.internal.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.jdt.core.IJavaModelStatusConstants;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.JavaModelManager;
import org.eclipse.jdt.internal.core.JavaModelStatus;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualArchiveComponent;

public class BinaryEditorUtilities {

	private static class JarEntryFile extends PlatformObject implements
			IStorage {
		private String entryName;
		private String zipName;
		private IPath path;

		public JarEntryFile(String entryName, String zipName) {
			this.entryName = entryName;
			this.zipName = zipName;
			this.path = new Path(this.entryName);
		}

		public InputStream getContents() throws CoreException {

			try {
				if (JavaModelManager.ZIP_ACCESS_VERBOSE) {
					//$ANALYSIS-IGNORE
					System.out.println("(" + Thread.currentThread() + ") [JarEntryFile.getContents()] Creating ZipFile on " + this.zipName);
				}
				ZipFile zipFile = new ZipFile(this.zipName);
				ZipEntry zipEntry = zipFile.getEntry(this.entryName);
				if (zipEntry == null) {
					throw new JavaModelException(new JavaModelStatus(
							IJavaModelStatusConstants.INVALID_PATH,
							this.entryName));
				}
				return zipFile.getInputStream(zipEntry);
			} catch (IOException e) {
				throw new JavaModelException(e,
						IJavaModelStatusConstants.IO_EXCEPTION);
			}
		}

		/**
		 * @see IStorage#getFullPath
		 */
		public IPath getFullPath() {
			return this.path;
		}

		/**
		 * @see IStorage#getName
		 */
		public String getName() {
			return this.path.lastSegment();
		}

		/**
		 * @see IStorage#isReadOnly()
		 */
		public boolean isReadOnly() {
			return true;
		}

		/**
		 * @see IStorage#isReadOnly()
		 */
		public String toString() {
			return "JarEntryFile[" + this.zipName + "::" + this.entryName + "]"; //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-1$
		}
	}

	private static class JarEntryEditorInput implements IStorageEditorInput {

		private IStorage fJarEntryFile;

		public JarEntryEditorInput(IStorage jarEntryFile) {
			fJarEntryFile = jarEntryFile;
		}

		/*
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof JarEntryEditorInput))
				return false;
			JarEntryEditorInput other = (JarEntryEditorInput) obj;
			return fJarEntryFile.equals(other.fJarEntryFile);
		}

		/*
		 * @see IEditorInput#getPersistable()
		 */
		public IPersistableElement getPersistable() {
			return null;
		}

		/*
		 * @see IEditorInput#getName()
		 */
		public String getName() {
			return fJarEntryFile.getName();
		}

		/*
		 * @see IEditorInput#getFullPath()
		 */
		public String getFullPath() {
			return fJarEntryFile.getFullPath().toString();
		}

		/*
		 * @see IEditorInput#getContentType()
		 */
		public String getContentType() {
			return fJarEntryFile.getFullPath().getFileExtension();
		}

		/*
		 * @see IEditorInput#getToolTipText()
		 */
		public String getToolTipText() {
			return fJarEntryFile.getFullPath().toString();
		}

		/*
		 * @see IEditorInput#getImageDescriptor()
		 */
		public ImageDescriptor getImageDescriptor() {
			IEditorRegistry registry = PlatformUI.getWorkbench()
					.getEditorRegistry();
			return registry.getImageDescriptor(fJarEntryFile.getFullPath()
					.getFileExtension());
		}

		/*
		 * @see IEditorInput#exists()
		 */
		public boolean exists() {
			// JAR entries can't be deleted
			return true;
		}

		/*
		 * @see IAdaptable#getAdapter(Class)
		 */
		public Object getAdapter(Class adapter) {
			return null;
		}

		/*
		 * see IStorageEditorInput#getStorage()
		 */
		public IStorage getStorage() {
			return fJarEntryFile;
		}
	}

	public static IEditorInput getBinaryEditorInput(
			VirtualArchiveComponent component, String archiveRelativePath) {
		
		IEditorInput input = null;
		IPath archivePath = component.getWorkspaceRelativePath();
		
		//[Bug 238616] if there is no workspace relative path then the archive is outside
		//	the workspace so get the OS path directly from the file
		if(archivePath != null) {
			input = getBinaryEditorInput(archivePath, archiveRelativePath);
		} else {
			String archiveOSPath = component.getUnderlyingDiskFile().getPath();
			input = getBinaryEditorInput(archiveOSPath, archiveRelativePath);
		}
		
		return input;
	}

	public static IEditorInput getBinaryEditorInput(IPath archivePath,
			String archiveRelativePath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IResource resource = root.findMember(archivePath);
		if (resource == null) {
			return null;
		}
		String archiveOSPath = resource.getLocation().toOSString();
		IEditorInput editorInput = getBinaryEditorInput(archiveOSPath, archiveRelativePath);
		return editorInput;
	}
	
	/**
	 * [Bug 238616]
	 * 
	 * Gets binary editor input given an OS relative path to an archive and
	 * 	the archive relative path to a file
	 * 
	 * @param archiveOSPath the OS relative path to the archive
	 * @param archiveRelativePath the archive relative path to the file to get binary editor input for
	 * @return
	 */
	public static IEditorInput getBinaryEditorInput(String archiveOSPath,
			String archiveRelativePath) {
		JarEntryFile jarFile = new JarEntryFile(archiveRelativePath, archiveOSPath);
		JarEntryEditorInput editorInput = new JarEntryEditorInput(jarFile);
		return editorInput;
	}

}
