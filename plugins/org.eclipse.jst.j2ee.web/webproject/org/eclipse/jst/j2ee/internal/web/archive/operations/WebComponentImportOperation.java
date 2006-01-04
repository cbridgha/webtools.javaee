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
package org.eclipse.jst.j2ee.internal.web.archive.operations;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.strategy.SaveStrategy;
import org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentImportDataModelProperties;
import org.eclipse.jst.j2ee.internal.archive.operations.J2EEArtifactImportOperation;
import org.eclipse.jst.j2ee.web.componentcore.util.WebArtifactEdit;
import org.eclipse.jst.j2ee.web.datamodel.properties.IWebComponentImportDataModelProperties;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.internal.ReferencedComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.web.internal.operation.ILibModule;
import org.eclipse.wst.web.internal.operation.LibModule;

public class WebComponentImportOperation extends J2EEArtifactImportOperation {
	/**
	 * @param model
	 */
	public WebComponentImportOperation(IDataModel model) {
		super(model);
	}

	protected void doExecute(IProgressMonitor monitor) throws ExecutionException {
		super.doExecute(monitor);
		IVirtualFolder libFolder = virtualComponent.getRootFolder().getFolder(WebArtifactEdit.WEBLIB);
		if (!libFolder.exists()) {
			try {
				libFolder.create(IResource.FORCE, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			addExtraClasspathEntries(monitor);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void addExtraClasspathEntries(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException, CoreException, JavaModelException, ExecutionException {
		List extraEntries = null;
		IJavaProject javaProject = JavaCore.create(virtualComponent.getProject());
		extraEntries = new ArrayList();
		importWebLibraryProjects(monitor, extraEntries, javaProject);
	}

	private void importWebLibraryProjects(IProgressMonitor monitor, List extraEntries, IJavaProject javaProject) throws InvocationTargetException, InterruptedException, ExecutionException {
		List selectedLibs = (List) model.getProperty(IWebComponentImportDataModelProperties.WEB_LIB_ARCHIVES_SELECTED);
		List libProjects = (List) model.getProperty(IWebComponentImportDataModelProperties.WEB_LIB_MODELS);
		IDataModel importModel = null;
		IVirtualComponent nestedComponent = null;
		ArrayList libModules = new ArrayList();
		String jarName = null;
		Archive libArchive = null;
		for (int i = 0; null != libProjects && i < libProjects.size(); i++) {
			importModel = (IDataModel) libProjects.get(i);
			libArchive = (Archive) importModel.getProperty(IJ2EEComponentImportDataModelProperties.FILE);
			if (selectedLibs.contains(libArchive)) {
				jarName = libArchive.getName();
				importModel.getDefaultOperation().execute(monitor, info);
				nestedComponent = (IVirtualComponent) importModel.getProperty(IJ2EEComponentImportDataModelProperties.COMPONENT);
				libModules.add(new LibModule(jarName, nestedComponent.getProject().getName()));
				if (extraEntries != null) {
					if (!javaProject.isOnClasspath(nestedComponent.getProject())) {
						extraEntries.add(JavaCore.newProjectEntry(nestedComponent.getProject().getFullPath()));
					}
				}
				ComponentCore.createReference(virtualComponent, nestedComponent, new Path("/WEB-INF/lib/")).create(0, monitor); //$NON-NLS-1$
			}
		}


		LibModule[] libModulesArray = new LibModule[libModules.size()];
		for (int i = 0; i < libModules.size(); i++) {
			libModulesArray[i] = (LibModule) libModules.get(i);
		}
		setLibModules(javaProject.getProject(), libModulesArray);
	}

	protected void setLibModules(IProject project, ILibModule[] modules) {
		// TODO this will throw class cast exception, do we still use ILibModule?
		WebArtifactEdit webArtifactEdit = null;
		try {
			// TODO migrate to flex projects
			// webArtifactEdit =
			// (WebArtifactEdit)StructureEdit.getFirstArtifactEditForRead(project);
			if (webArtifactEdit != null)
				webArtifactEdit.addLibModules((ReferencedComponent[]) modules);
		} finally {
			if (webArtifactEdit != null)
				webArtifactEdit.dispose();
		}
	}

	protected SaveStrategy createSaveStrategy(IVirtualComponent aVirtualComponent) {
		return new WebComponentSaveStrategyImpl(aVirtualComponent);
	}
}
