/*******************************************************************************
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.application.internal.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jst.j2ee.internal.earcreation.IDefaultJ2EEComponentCreationDataModelProperties;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;
import org.eclipse.wst.common.componentcore.datamodel.FacetProjectCreationDataModelProvider;
import org.eclipse.wst.common.componentcore.internal.operation.FacetProjectCreationOperation;
import org.eclipse.wst.common.frameworks.datamodel.AbstractDataModelOperation;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.activities.WTPActivityBridge;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;

public class DefaultJ2EEComponentCreationOperation extends AbstractDataModelOperation implements IDefaultJ2EEComponentCreationDataModelProperties {

    public static final String JCA_DEV_ACTIVITY_ID = "com.ibm.wtp.jca.development"; //$NON-NLS-1$

    public static final String WEB_DEV_ACTIVITY_ID = "com.ibm.wtp.web.development"; //$NON-NLS-1$

    public static final String ENTERPRISE_JAVA = "com.ibm.wtp.ejb.development"; //$NON-NLS-1$

    public DefaultJ2EEComponentCreationOperation(IDataModel model) {
        super(model);
    }

    @Override
	public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        try {
            if (model.getBooleanProperty(CREATE_EJB)) {
                IDataModel projectModel = model.getNestedModel(NESTED_MODEL_EJB);
                createEJBComponent(projectModel, monitor);
            }
            if (model.getBooleanProperty(CREATE_WEB)) {
                IDataModel projectModel = model.getNestedModel(NESTED_MODEL_WEB);
                createWebJ2EEComponent(projectModel, monitor);
            }
            if (model.getBooleanProperty(CREATE_CONNECTOR)) {
                IDataModel projectModel = model.getNestedModel(NESTED_MODEL_JCA);
                createRarJ2EEComponent(projectModel, monitor);
            }
            if (model.getBooleanProperty(CREATE_APPCLIENT)) {
                IDataModel projectModel = model.getNestedModel(NESTED_MODEL_CLIENT);
                createAppClientComponent(projectModel, monitor);
            }
        } catch (Exception e) {
        	J2EEPlugin.logError(e);
        }
        return OK_STATUS;
    }

    /**
     * @param model
     */
    private void createEJBComponent(IDataModel model, IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException, ExecutionException {
        model.getDefaultOperation().execute(monitor, null);
        addDefaultFacets(model);
        WTPActivityBridge.getInstance().enableActivity(ENTERPRISE_JAVA, true);
    }

    /**
     * @param model
     */
    private void createWebJ2EEComponent(IDataModel model, IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException, ExecutionException {
        model.getDefaultOperation().execute(monitor, null);
        addDefaultFacets(model);
        WTPActivityBridge.getInstance().enableActivity(WEB_DEV_ACTIVITY_ID, true);
    }

    /**
     * @param model
     */
    private void createRarJ2EEComponent(IDataModel model, IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException, ExecutionException {
        model.getDefaultOperation().execute(monitor, null);
        addDefaultFacets(model);
        WTPActivityBridge.getInstance().enableActivity(ENTERPRISE_JAVA, true);
    }

    /**
     * @param model
     */
    private void createAppClientComponent(IDataModel model, IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException, ExecutionException {
        model.getDefaultOperation().execute(monitor, null);
        addDefaultFacets(model);
        WTPActivityBridge.getInstance().enableActivity(ENTERPRISE_JAVA, true);

    }

    private void addDefaultFacets(IDataModel model) throws CoreException{
        IRuntime runtime = (IRuntime) model.getProperty(FacetProjectCreationDataModelProvider.FACET_RUNTIME);        
        String projectName = model.getStringProperty(FacetProjectCreationDataModelProvider.FACET_PROJECT_NAME);
        IProject project = ProjectUtilities.getProject( projectName );
		IFacetedProject facetedProject = null;
		try {
			facetedProject = ProjectFacetsManager.create(project);
		} catch (CoreException e) {

		}
		
		if( facetedProject != null && runtime != null ){
			try {
				FacetProjectCreationOperation.addDefaultFactets( facetedProject, runtime );
			} catch (ExecutionException e) {
				J2EEPlugin.logError(e);
			}
		}    	
    }
    
    @Override
	public IStatus redo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        return null;
    }

    @Override
	public IStatus undo(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        return null;
    }

}
