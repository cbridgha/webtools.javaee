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
/*
 * Created on Nov 10, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.eclipse.jst.j2ee.internal.wizard;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPlugin;
import org.eclipse.jst.j2ee.project.facet.IJ2EEModuleFacetInstallDataModelProperties;
import org.eclipse.jst.j2ee.ui.project.facet.EarSelectionPanel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.DataModelPropertyDescriptor;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.web.ui.internal.wizards.DataModelFacetCreationWizardPage;

public abstract class J2EEComponentFacetCreationWizardPage extends DataModelFacetCreationWizardPage implements IFacetProjectCreationDataModelProperties {

    private static final String STORE_LABEL = "LASTEARNAME_"; //$NON-NLS-1$
    private static final String LAST_RUNTIME_STORE = "LAST_RUNTIME"; //$NON-NLS-1$
    
	protected EarSelectionPanel earPanel;
  
	public J2EEComponentFacetCreationWizardPage(IDataModel dataModel, String pageName) {
		super(dataModel, pageName);
	}

	protected Composite createTopLevelComposite(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(top, getInfopopID());
		top.setLayout(new GridLayout());
		top.setLayoutData(new GridData(GridData.FILL_BOTH));
		createProjectGroup(top);
		Composite composite = new Composite(top, SWT.NONE);
		composite.setLayoutData(gdhfill());
		GridLayout layout = new GridLayout(3, false);
		composite.setLayout(layout);
		createServerTargetComposite(composite);
		createEarComposite(composite);
		return top;
	}

	private void createEarComposite(Composite composite) {
		FacetDataModelMap map = (FacetDataModelMap) model.getProperty(FACET_DM_MAP);
		IDataModel facetModel = (IDataModel) map.get(getModuleFacetID());
		earPanel = new EarSelectionPanel(facetModel, composite);
	}

	protected abstract String getModuleFacetID();

	public void dispose() {
		super.dispose();
		if (earPanel != null)
			earPanel.dispose();
	}
	
    public void storeDefaultSettings() {
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
        	FacetDataModelMap map = (FacetDataModelMap)model.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
	    	String facetID = getModuleFacetID();
	    	IDataModel j2eeModel = map.getFacetDataModel(facetID);
        	if(j2eeModel.getBooleanProperty(IJ2EEModuleFacetInstallDataModelProperties.ADD_TO_EAR)){
	        	String lastEARName = j2eeModel.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.EAR_PROJECT_NAME);
	            settings.put(STORE_LABEL, lastEARName);
        	}
        	IRuntime runtime = (IRuntime)model.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME);
        	String runtimeName = runtime == null ? "" : runtime.getName(); //$NON-NLS-1$
            settings.put(LAST_RUNTIME_STORE, runtimeName);
        }
    }
    
    public void restoreDefaultSettings() {
        IDialogSettings settings = getDialogSettings();
        if (settings != null) {
            String lastEARName = settings.get(STORE_LABEL);
            if (lastEARName != null){
            	FacetDataModelMap map = (FacetDataModelMap)model.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
            	String facetID = getModuleFacetID();
            	IDataModel j2eeModel = map.getFacetDataModel(facetID);
                j2eeModel.setProperty(IJ2EEModuleFacetInstallDataModelProperties.LAST_EAR_NAME, lastEARName);
            }
            if(!model.isPropertySet(IFacetProjectCreationDataModelProperties.FACET_RUNTIME)){
            	boolean runtimeSet = false;
	            String lastRuntimeName = settings.get(LAST_RUNTIME_STORE);
	            DataModelPropertyDescriptor [] descriptors = model.getValidPropertyDescriptors(IFacetProjectCreationDataModelProperties.FACET_RUNTIME);
	        	if( lastRuntimeName != null){
	            	for(int i=0;i<descriptors.length && !runtimeSet; i++){
	            		if(lastRuntimeName.equals(descriptors[i].getPropertyDescription())){
	            			model.setProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME, descriptors[i].getPropertyValue());
	            			runtimeSet = true;
	            		}
	            	}
	            } 
	        	if(!runtimeSet && descriptors.length > 0){
	        		model.setProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME, descriptors[0].getPropertyValue());
	        	}
            }
        }
    }
    
	protected IDialogSettings getDialogSettings() {
        return J2EEUIPlugin.getDefault().getDialogSettings();
    }  	
}
