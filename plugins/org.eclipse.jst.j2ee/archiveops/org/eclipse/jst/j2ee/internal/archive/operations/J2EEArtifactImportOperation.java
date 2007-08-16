/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.archive.operations;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.strategy.SaveStrategy;
import org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentImportDataModelProperties;
import org.eclipse.jst.j2ee.internal.common.classpath.J2EEComponentClasspathUpdater;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.internal.project.ProjectSupportResourceHandler;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.internal.operation.CreateReferenceComponentsOp;
import org.eclipse.wst.common.componentcore.internal.util.ComponentUtilities;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.frameworks.datamodel.AbstractDataModelOperation;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.DoNotUseMeThisWillBeDeletedPost15;
import org.eclipse.wst.common.frameworks.internal.enablement.nonui.WFTWrappedException;

public abstract class J2EEArtifactImportOperation extends AbstractDataModelOperation {

	protected Archive moduleFile;
	protected IVirtualComponent virtualComponent;
	protected IAdaptable info;
	protected final int PROJECT_CREATION_WORK = 30;

	public J2EEArtifactImportOperation(IDataModel model) {
		super(model);
	}

	public IStatus execute(IProgressMonitor monitor, IAdaptable anInfo) throws ExecutionException {
		try {
			J2EEComponentClasspathUpdater.getInstance().pauseUpdates();
			this.info = anInfo;
			moduleFile = (Archive) model.getProperty(IJ2EEComponentImportDataModelProperties.FILE);
			monitor.beginTask(ProjectSupportResourceHandler.getString(ProjectSupportResourceHandler.Importing_archive, new Object [] { moduleFile.getURI() }), computeTotalWork());
			doExecute(monitor);
			return OK_STATUS;
		} finally {
			try {
				if (virtualComponent != null) {
					J2EEComponentClasspathUpdater.getInstance().queueUpdate(virtualComponent.getProject());
				}
			} finally {
				J2EEComponentClasspathUpdater.getInstance().resumeUpdates();
				model.dispose();
				monitor.done();
			}
		}
	}

	protected int computeTotalWork() {
		return PROJECT_CREATION_WORK + moduleFile.getFiles().size();
	}
	
	/**
	 * Subclasses overriding this method should also override {@link #computeTotalWork()}
	 * @param monitor
	 * @throws ExecutionException
	 */
	protected void doExecute(IProgressMonitor monitor) throws ExecutionException {
		virtualComponent = createVirtualComponent(model.getNestedModel(IJ2EEComponentImportDataModelProperties.NESTED_MODEL_J2EE_COMPONENT_CREATION), new SubProgressMonitor(monitor, PROJECT_CREATION_WORK));

		try {
			importModuleFile(new SubProgressMonitor(monitor, moduleFile.getFiles().size()));
		} catch (InvocationTargetException e) {
			throw new ExecutionException(e.getMessage(), e);
		} catch (InterruptedException e) {
			throw new ExecutionException(e.getMessage(), e);
		}
	}

	/**
	 * {@link DoNotUseMeThisWillBeDeletedPost15}
	 * 
	 */
	protected void fixupManifestRefs() {
	}

	protected IVirtualComponent createVirtualComponent(IDataModel aModel, IProgressMonitor monitor) throws ExecutionException {
		try {
			aModel.getDefaultOperation().execute(monitor, info);
			String projectName = aModel.getStringProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME);
			IProject project = ProjectUtilities.getProject(projectName);
			return ComponentCore.createComponent(project);
		} finally {
			monitor.done();
		}
	}

	/**
	 * Creates the appropriate save strategy. Subclases should overwrite this method to create the
	 * appropriate save startegy for the kind of J2EE module project to import the archive
	 */
	protected abstract SaveStrategy createSaveStrategy(IVirtualComponent vc);

	protected void modifyStrategy(SaveStrategy saveStrat) {
	}

	/**
	 * perform the archive import operation
	 * 
	 * @throws java.lang.reflect.InvocationTargetException
	 * @throws java.lang.InterruptedException
	 */
	protected void importModuleFile(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		try {
			monitor.beginTask(null, moduleFile.getFiles().size());
			ComponentSaveStrategyImpl aStrategy = (ComponentSaveStrategyImpl) createSaveStrategy(virtualComponent);
			aStrategy.setProgressMonitor(monitor);
			aStrategy.setOverwriteHandler((IOverwriteHandler) model.getProperty(IJ2EEComponentImportDataModelProperties.OVERWRITE_HANDLER));
			aStrategy.setDataModel(model);
			modifyStrategy(aStrategy);
			moduleFile.save(aStrategy);
		} catch (OverwriteHandlerException oe) {
			throw new InterruptedException();
		} catch (Exception ex) {
			throw new WFTWrappedException(ex, EJBArchiveOpsResourceHandler.ERROR_IMPORTING_MODULE_FILE);
		} finally {
			monitor.done();
		}
	}

	/**
	 * {@link DoNotUseMeThisWillBeDeletedPost15}
	 * 
	 * @deprecated this will be deleted do not use this method
	 */
	protected static void addToClasspath(IDataModel importModel, List extraEntries) throws JavaModelException {
		if (extraEntries.size() > 0) {
			IJavaProject javaProject = JavaCore.create(((IVirtualComponent) importModel.getProperty(IJ2EEComponentImportDataModelProperties.COMPONENT)).getProject());
			IClasspathEntry[] javaClasspath = javaProject.getRawClasspath();
			List nonDuplicateList = new ArrayList();
			for (int i = 0; i < extraEntries.size(); i++) {
				IClasspathEntry extraEntry = (IClasspathEntry) extraEntries.get(i);
				boolean include = true;
				for (int j = 0; include && j < javaClasspath.length; j++) {
					if (extraEntry.equals(javaClasspath[j])) {
						include = false;
					}
				}
				if (include) {
					nonDuplicateList.add(extraEntry);
				}
			}
			if (nonDuplicateList.size() > 0) {
				IClasspathEntry[] newJavaClasspath = new IClasspathEntry[javaClasspath.length + nonDuplicateList.size()];
				System.arraycopy(javaClasspath, 0, newJavaClasspath, 0, javaClasspath.length);
				for (int j = 0; j < nonDuplicateList.size(); j++) {
					newJavaClasspath[javaClasspath.length + j] = (IClasspathEntry) nonDuplicateList.get(j);
				}
				javaProject.setRawClasspath(newJavaClasspath, new NullProgressMonitor());
			}
		}
	}

	// Assumes that the project exists with the same name as the
	// entry in the manifest.

	/**
	 * {@link DoNotUseMeThisWillBeDeletedPost15}
	 * 
	 * @deprecated this will be deleted do not use this method
	 */
	protected void fixModuleReference(IDataModel importModel, String[] manifestEntries) {
		IVirtualComponent comp = (IVirtualComponent) importModel.getProperty(IJ2EEComponentImportDataModelProperties.COMPONENT);

		if (J2EEProjectUtilities.isEJBProject(comp.getProject()) && manifestEntries.length > 0) {
			for (int j = 0; j < manifestEntries.length; j++) {
				String name = manifestEntries[j];
				int endIndex = name.length() - 4; // lop off .jar
				if (endIndex < 1) {
					continue;
				}
				name = name.substring(0, endIndex);
				IProject project = null;
				try {
					project = ProjectUtilities.getProject(name);
				} catch (IllegalArgumentException e) {
					continue;
				}
				if (project != null && project.isAccessible() && project.exists()) {
					IVirtualComponent refcomp = ComponentCore.createComponent(project);
					if (refcomp.exists()) {
						ArrayList list = new ArrayList();
						list.add(refcomp);
						CreateReferenceComponentsOp op = ComponentUtilities.createReferenceComponentOperation(comp, list);
						try {
							op.execute(null, null);
						} catch (ExecutionException e) {
							Logger.getLogger().logError(e);
						}
					}
				}
			}
		}
	}

}
