/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Nov 6, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.eclipse.jst.j2ee.internal.web.archive.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jst.j2ee.application.operations.IAnnotationsDataModel;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationDataModel;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationOperation;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.project.J2EEModuleWorkbenchURIConverterImpl;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.internal.web.operations.J2EEWebNatureRuntime;
import org.eclipse.jst.j2ee.internal.web.operations.WebEditModel;
import org.eclipse.jst.j2ee.internal.web.operations.WebSettingsMigrator;
import org.eclipse.jst.j2ee.internal.web.util.WebArtifactEdit;
import org.eclipse.wst.common.frameworks.internal.WTPProjectUtilities;
import org.eclipse.wst.common.internal.emfworkbench.operation.EditModelOperation;
import org.eclipse.wst.common.modulecore.ModuleCore;
import org.eclipse.wst.common.modulecore.ModuleCoreFactory;
import org.eclipse.wst.common.modulecore.ModuleType;
import org.eclipse.wst.common.modulecore.ProjectModules;
import org.eclipse.wst.common.modulecore.WorkbenchModule;
import org.eclipse.wst.common.modulecore.WorkbenchModuleResource;
import org.eclipse.wst.common.modulecore.internal.util.IModuleConstants;

import com.ibm.wtp.emf.workbench.ProjectResourceSet;

public class WebModuleCreationOperation extends J2EEModuleCreationOperation {
	public WebModuleCreationOperation(WebModuleCreationDataModel dataModel) {
		super(dataModel);
	}

	public WebModuleCreationOperation() {
		super();
	}

	protected void createProject(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		super.createProject(monitor);
		//TODO add contextRoot and contentName to workbechModule
		//J2EEWebNatureRuntime nature = J2EEWebNatureRuntime.getRuntime(((WebModuleCreationDataModel)operationDataModel).getTargetProject());
		//WebArtifactEdit webArtifactEdit = (WebArtifactEdit)ModuleCore.getFirstArtifactEditForRead(((WebModuleCreationDataModel)operationDataModel).getTargetProject());
		//nature.getWebSettings().setWebContentName(operationDataModel.getStringProperty(WebModuleCreationDataModel.WEB_CONTENT));
		//nature.getWebSettings().setContextRoot(operationDataModel.getStringProperty(webArtifactEdit.getContextRoot()));
		//URIConverter uriConverter = ((ProjectResourceSet) nature.getResourceSet()).getURIConverter();
		//dont need this, keeps nature in synch with websetting file
		//if (uriConverter instanceof J2EEModuleWorkbenchURIConverterImpl)
		//	((J2EEModuleWorkbenchURIConverterImpl) uriConverter).recomputeContainersIfNecessary();
	}

	protected void createDeploymentDescriptor(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		EditModelOperation op = new EditModelOperation((J2EEModuleCreationDataModel) operationDataModel) {
			protected void execute(IProgressMonitor amonitor) throws CoreException, InvocationTargetException, InterruptedException {
				WebEditModel model = (WebEditModel) editModel;
				WebArtifactEdit webArtifactEdit = (WebArtifactEdit)ModuleCore.getFirstArtifactEditForRead(model.getProject());
				IFolder metainf = webArtifactEdit.getMetaInfFolder();
				if (!metainf.exists()) {
					IFolder parent = metainf.getParent().getFolder(null);
					if (!parent.exists()) {
						parent.create(true, true, null);
					}
					metainf.create(true, true, null);
				}
				IFolder webinf = (IFolder)webArtifactEdit.getWebInfFolder();
				if (!webinf.exists()) {
					webinf.create(true, true, null);
				}
				IFolder lib = webinf.getFolder("lib"); //$NON-NLS-1$
				if (!lib.exists()) {
					lib.create(true, true, null);
				}
				model.makeDeploymentDescriptorWithRoot();
			}
		};
		op.doRun(monitor);
	}

	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		super.execute(monitor);
		J2EEModuleCreationDataModel dataModel = (J2EEModuleCreationDataModel) operationDataModel;
		if (dataModel.getBooleanProperty(WebModuleCreationDataModel.MIGRATE_WEB_SETTINGS)) {
			IProject project = dataModel.getProjectDataModel().getProject();	
			//webNature.getWebSettings().write();
			//project.getFile(webNature.getWebSettingsPath()).refreshLocal(0, monitor);
			//WebSettingsMigrator migrator = new WebSettingsMigrator();
			//migrator.migrate(project);
		}
		//By default we do not create a flexible project
		if(dataModel.getBooleanProperty(J2EEModuleCreationDataModel.IS_FLEXIBLE_PROJECT)) {
		    WTPProjectUtilities.addNatureToProjectLast(dataModel.getProjectDataModel().getProject(), IModuleConstants.MODULE_NATURE_ID);
		    createInitialWTPModulesFile();
		}
		if (((WebModuleCreationDataModel) operationDataModel).getBooleanProperty(IAnnotationsDataModel.USE_ANNOTATIONS))
			addAnnotationsBuilder();
	}

    /**
     * 
     */
    private void createInitialWTPModulesFile() {
    	ModuleCore moduleCore = null;
		try {
			IProject containingProject = getProject();
			moduleCore = ModuleCore.getModuleCoreForWrite(containingProject);
			moduleCore.prepareProjectModulesIfNecessary(); 
			ProjectModules projectModules = moduleCore.getModuleModelRoot();
			addContent(projectModules);
			moduleCore.saveIfNecessary(null); 
		} finally {
			if(moduleCore != null)
				moduleCore.dispose();
		}     
    }
	/**
	 * @param projectModules
	 */
	private void addContent(ProjectModules projectModules) {
	    WorkbenchModule webModule = addWorkbenchModule(projectModules, getModuleName()+".war", createModuleURI()); //$NON-NLS-1$
		addResource(webModule, getModuleRelativeFile(getWebContentSourcePath(), getProject()), getWebContentDeployPath());
		addResource(webModule, getModuleRelativeFile(getJavaSourceSourcePath(), getProject()), getJavaSourceDeployPath());
	}
	
	/**
	 * @return
	 */
	private URI createModuleURI() {
		return URI.createURI("module:/resource/"+getProject().getName()+IPath.SEPARATOR+getModuleName()+".war"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public void addResource(WorkbenchModule aModule, IResource aSourceFile, String aDeployPath) {
		WorkbenchModuleResource resource = ModuleCoreFactory.eINSTANCE.createWorkbenchModuleResource();		
		resource.setSourcePath(URI.createURI(aSourceFile.getFullPath().toString()));
		resource.setDeployedPath(URI.createURI(aDeployPath));
		aModule.getResources().add(resource);
	}
	public WorkbenchModule addWorkbenchModule(ProjectModules theModules, String aDeployedName, URI aHandle) {
		WorkbenchModule module = ModuleCoreFactory.eINSTANCE.createWorkbenchModule();
		module.setHandle(aHandle);  
		module.setDeployedName(aDeployedName);  
		ModuleType type = ModuleCoreFactory.eINSTANCE.createModuleType();
		type.setModuleTypeId(IModuleConstants.JST_WEB_MODULE);
		module.setModuleType(type);
		theModules.getWorkbenchModules().add(module);
		return module;
	}
	public IFile getModuleRelativeFile(String aModuleRelativePath, IProject project) {
		return getProject().getFile(new Path(IPath.SEPARATOR + aModuleRelativePath));
	}
	
	public IProject getProject() {
	    J2EEModuleCreationDataModel dataModel = (J2EEModuleCreationDataModel) operationDataModel;
	    return dataModel.getProjectDataModel().getProject();
	}

	/**
	 * @return
	 */
	public String getJavaSourceSourcePath() {
		return "/JavaSource"; //$NON-NLS-1$
	}
	
	/**
	 * @return
	 */
	public String getJavaSourceDeployPath() {
		return "/WEB-INF/classes"; //$NON-NLS-1$
	}
	
	/**
	 * @return
	 */
	public String getWebContentSourcePath() {
		return "/WebContent"; //$NON-NLS-1$
	}
	
	/**
	 * @return
	 */
	public String getWebContentDeployPath() {
		return "/"; //$NON-NLS-1$
	}
	
	public String getModuleName() {
		return getProject().getName();
	}
}