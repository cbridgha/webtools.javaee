/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Mar 23, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.eclipse.jst.j2ee.internal.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jst.j2ee.applicationclient.internal.creation.AppClientFacetProjectCreationDataModelProvider;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.jst.j2ee.internal.actions.IJ2EEUIContextIds;
import org.eclipse.jst.j2ee.internal.earcreation.IDefaultJ2EEComponentCreationDataModelProperties;
import org.eclipse.jst.j2ee.internal.moduleextension.EarModuleManager;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIMessages;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.project.facet.J2EEModuleFacetInstallDataModelProvider;
import org.eclipse.jst.j2ee.ui.project.facet.appclient.AppClientProjectWizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPluginContribution;
import org.eclipse.ui.activities.WorkbenchActivityHelper;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.ui.wizards.IWizardRegistry;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties.FacetDataModelMap;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.datamodel.ui.DataModelWizardPage;
import org.eclipse.wst.common.frameworks.internal.ui.GenericWizardNode;
import org.eclipse.wst.web.ui.internal.wizards.NewProjectDataModelFacetWizard;

public class NewJ2EEComponentSelectionPage extends DataModelWizardPage implements IDefaultJ2EEComponentCreationDataModelProperties {
    private Button defaultModulesButton;

    private Composite defaultModulesComposite;

    private Composite newModulesComposite;

    private Button appClientRadioButton;

    private Button ejbRadioButton;

    private Button webRadioButton;

    private Button connectorRadioButton;

    private GenericWizardNode appClientNode;

    private GenericWizardNode ejbNode;

    private GenericWizardNode webNode;

    private GenericWizardNode connectorNode;

    private GenericWizardNode selectedNode;

    private StackLayout stackLayout;

    /**
     * @param model
     * @param pageName
     */
    protected NewJ2EEComponentSelectionPage(IDataModel model, String pageName) {
        super(model, pageName);
        setTitle(J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_TITLE));
        setDescription(J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_DESC));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.J2EEWizardPage#getValidationPropertyNames()
     */
    protected String[] getValidationPropertyNames() {
        return new String[] { CREATE_APPCLIENT, APPCLIENT_COMPONENT_NAME, CREATE_CONNECTOR, CONNECTOR_COMPONENT_NAME, CREATE_EJB, EJB_COMPONENT_NAME, CREATE_WEB, WEB_COMPONENT_NAME, MODULE_NAME_COLLISIONS_VALIDATION, ENABLED };
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.J2EEWizardPage#createTopLevelComposite(org.eclipse.swt.widgets.Composite)
     */
    protected Composite createTopLevelComposite(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        composite.setLayout(layout);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        setInfopopID(IJ2EEUIContextIds.EAR_NEW_MODULE_PROJECTS_PAGE);
        createDefaultCheckBox(composite);
        Composite forStackComposite = new Composite(composite, SWT.NULL);
        layout = new GridLayout();
        forStackComposite.setLayout(layout);
        forStackComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        Composite stackComposite = createStackLayoutComposite(forStackComposite);
        createDefaultModulesComposite(stackComposite);
        createModuleSelectionComposite(stackComposite);
        stackLayout.topControl = defaultModulesComposite;
        setButtonEnablement();
        return composite;
    }

    protected Composite createStackLayoutComposite(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        stackLayout = new StackLayout();
        composite.setLayout(stackLayout);
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        return composite;
    }

    private void createDefaultModulesComposite(Composite parent) {
        defaultModulesComposite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginHeight = 0;
        defaultModulesComposite.setLayout(layout);
        defaultModulesComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        // Default Module Controls creation
        createAppClientDefaultModuleControl();
        if (J2EEPlugin.isEJBSupportAvailable())
            createEJBDefaultModuleControl();
        createWebDefaultModuleControl();
        if (J2EEPlugin.isEJBSupportAvailable())
            createConnectorDefaultModuleControl();
    }

    /**
     * @param parent
     */
    private void createModuleSelectionComposite(Composite parent) {
        newModulesComposite = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        layout.numColumns = 1;
        newModulesComposite.setLayout(layout);
        newModulesComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        appClientRadioButton = new Button(newModulesComposite, SWT.RADIO);

        appClientRadioButton.setText(J2EEUIMessages.getResourceString("NewModuleSelectionPage.appClient")); //$NON-NLS-1$
        appClientRadioButton.addListener(SWT.Selection, this);
        if (EarModuleManager.getEJBModuleExtension() != null) {
            ejbRadioButton = new Button(newModulesComposite, SWT.RADIO);
            ejbRadioButton.setText(J2EEUIMessages.getResourceString("NewModuleSelectionPage.ejb")); //$NON-NLS-1$
            ejbRadioButton.addListener(SWT.Selection, this);
        }
        if (EarModuleManager.getWebModuleExtension() != null) {
            webRadioButton = new Button(newModulesComposite, SWT.RADIO);
            webRadioButton.setText(J2EEUIMessages.getResourceString("NewModuleSelectionPage.web")); //$NON-NLS-1$
            webRadioButton.addListener(SWT.Selection, this);
        }
        if (EarModuleManager.getJCAModuleExtension() != null) {
            connectorRadioButton = new Button(newModulesComposite, SWT.RADIO);
            connectorRadioButton.setText(J2EEUIMessages.getResourceString("NewModuleSelectionPage.jca")); //$NON-NLS-1$
            connectorRadioButton.addListener(SWT.Selection, this);
        }
    }

    /**
     * 
     */
    private void createConnectorDefaultModuleControl() {
        if (EarModuleManager.getJCAModuleExtension() != null) {
            String label = J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_JCA_MODULE_LBL);
            createJ2EEComponentControl(label, CREATE_CONNECTOR, CONNECTOR_COMPONENT_NAME);
        }
    }

    /**
     * 
     */
    private void createWebDefaultModuleControl() {
        if (EarModuleManager.getWebModuleExtension() != null) {
            String label = J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_WEB_MODULE_LBL);
            createJ2EEComponentControl(label, CREATE_WEB, WEB_COMPONENT_NAME);
        }
    }

    /**
     * 
     */
    private void createEJBDefaultModuleControl() {
        if (EarModuleManager.getEJBModuleExtension() != null) {
            String label = J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_EJB_MODULE_LBL);
            createJ2EEComponentControl(label, CREATE_EJB, EJB_COMPONENT_NAME);
        }
    }

    private void createAppClientDefaultModuleControl() {
        String label = J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_APPCLIENT_MODULE_LBL);
        createJ2EEComponentControl(label, CREATE_APPCLIENT, APPCLIENT_COMPONENT_NAME);
    }

    private void createJ2EEComponentControl(String label, String createProperty, String projectProperty) {
        final Button checkBox = new Button(defaultModulesComposite, SWT.CHECK);
        checkBox.setSelection(true);
        checkBox.setText(label);

        final Text textField = new Text(defaultModulesComposite, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        textField.setLayoutData(data);
        synchHelper.synchCheckbox(checkBox, createProperty, null);
        synchHelper.synchText(textField, projectProperty, null);
    }

    private void createDefaultCheckBox(Composite composite) {
        Composite checkBoxComposite = new Composite(composite, SWT.NULL);
        GridLayout layout = new GridLayout();
        checkBoxComposite.setLayout(layout);
        checkBoxComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        defaultModulesButton = new Button(checkBoxComposite, SWT.CHECK);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        data.horizontalIndent = 0;
        defaultModulesButton.setLayoutData(data);
        defaultModulesButton.setText(J2EEUIMessages.getResourceString(J2EEUIMessages.DEFAULT_COMPONENT_PAGE_NEW_MOD_SEL_PG_DEF_BTN));
        defaultModulesButton.setSelection(true);
        defaultModulesButton.addListener(SWT.Selection, this);
        synchHelper.synchCheckbox(defaultModulesButton, ENABLED, null);
        createControlsSeparatorLine(checkBoxComposite);    
        }

    protected void createControlsSeparatorLine(Composite parent) {
        // add a horizontal line
        Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
        GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
        separator.setLayoutData(data);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
     */
    public void handleEvent(Event evt) {
        if (evt.widget == defaultModulesButton)
            handleDefaultModulesButtonPressed();
        else if (!defaultModulesButton.getSelection()) {
            if (evt.widget == appClientRadioButton && appClientRadioButton.getSelection())
                setSelectedNode(getAppClientNode());
            else if (evt.widget == ejbRadioButton && ejbRadioButton.getSelection())
                setSelectedNode(getEjbNode());
            else if (evt.widget == webRadioButton && webRadioButton.getSelection())
                setSelectedNode(getWebNode());
            else if (evt.widget == connectorRadioButton && connectorRadioButton.getSelection())
                setSelectedNode(getConnectorNode());
            validatePage();
        }
        super.handleEvent(evt);
    }

    /**
     * 
     */
    private void handleDefaultModulesButtonPressed() {
        if (defaultModulesButton.getSelection()) {
            setSelectedNode(null);
            showDefaultModulesComposite();
            setDefaultModulesSelection(true);
        } else {
            setDefaultModulesSelection(false);
            showNewModulesCompsite();
        }
        setButtonEnablement();
        validatePage();
    }

    private void setDefaultModulesSelection(boolean selection) {
        getDataModel().setBooleanProperty(CREATE_APPCLIENT, selection);
        getDataModel().setBooleanProperty(CREATE_CONNECTOR, selection);
        getDataModel().setBooleanProperty(CREATE_EJB, selection);
        getDataModel().setBooleanProperty(CREATE_WEB, selection);
    }

    private void showDefaultModulesComposite() {
        defaultModulesComposite.setVisible(true);
        newModulesComposite.setVisible(false);
        stackLayout.topControl = defaultModulesComposite;
    }

    /**
     * This is done based on the J2EE version. We need to disable Connectors if
     * not j2ee 1.3 or higher.
     */
    private void setButtonEnablement() {
        if (!defaultModulesButton.getSelection() && connectorRadioButton != null) {
            int version = getDataModel().getIntProperty(J2EE_VERSION);
            connectorRadioButton.setEnabled(version > J2EEVersionConstants.J2EE_1_2_ID);
        }
    }

    /**
     * 
     */
    private void showNewModulesCompsite() {
        defaultModulesComposite.setVisible(false);
        newModulesComposite.setVisible(true);
        if (!isAnyModuleRadioSelected())
            appClientRadioButton.setSelection(true);
        setSelectedNode(getWizardNodeFromSelection());
        stackLayout.topControl = newModulesComposite;
    }

    /**
     * @return
     */
    private GenericWizardNode getWizardNodeFromSelection() {
        if (appClientRadioButton.getSelection())
            return getAppClientNode();
        if (connectorRadioButton != null && connectorRadioButton.getSelection())
            return getConnectorNode();
        if (ejbRadioButton != null && ejbRadioButton.getSelection())
            return getEjbNode();
        if (webRadioButton != null && webRadioButton.getSelection())
            return getWebNode();
        return null;
    }

    /**
     * @return
     */
    private boolean isAnyModuleRadioSelected() {
        return appClientRadioButton.getSelection() || (connectorRadioButton != null && connectorRadioButton.getSelection()) || (ejbRadioButton != null && ejbRadioButton.getSelection()) || (webRadioButton != null && webRadioButton.getSelection());
    }

    /**
     * @return Returns the appClientNode.
     */
    private GenericWizardNode getAppClientNode() {
        if (appClientNode == null) {
            appClientNode = new GenericWizardNode() {
                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.GenericWizardNode#createWizard()
                 */
                protected IWizard createWizard() {
                    IDataModel dm = DataModelFactory.createDataModel(new AppClientFacetProjectCreationDataModelProvider());
                    FacetDataModelMap map = (FacetDataModelMap) dm.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
                    IDataModel model = map.getFacetDataModel(J2EEProjectUtilities.APPLICATION_CLIENT);
                    model.setBooleanProperty(J2EEModuleFacetInstallDataModelProvider.PROHIBIT_ADD_TO_EAR, true);
                    
                    IDataModel nestedAppClientModel = getDataModel().getNestedModel(NESTED_MODEL_CLIENT);
                    model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_RUNTIME, nestedAppClientModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME));
    				IDataModel appClientFacetModel = ((FacetDataModelMap)nestedAppClientModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP)).getFacetDataModel(J2EEProjectUtilities.APPLICATION_CLIENT);
                    model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_VERSION, appClientFacetModel.getProperty(IFacetDataModelProperties.FACET_VERSION));
                    
                    return new AppClientProjectWizard(dm);
                }
            };
        }
        return appClientNode;
    }

    /**
     * @return Returns the connectorNode.
     */
    private GenericWizardNode getConnectorNode() {
        if (connectorNode == null) {
            connectorNode = new GenericWizardNode() {
                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.GenericWizardNode#createWizard()
                 */
                protected IWizard createWizard() {
                    NewProjectDataModelFacetWizard result = null;

                    IWizardRegistry newWizardRegistry = WorkbenchPlugin.getDefault().getNewWizardRegistry();
                    IWizardDescriptor descriptor = newWizardRegistry.findWizard("org.eclipse.jst.j2ee.jca.ui.internal.wizard.ConnectorProjectWizard"); //$NON-NLS-1$
                    try {
                        result = (NewProjectDataModelFacetWizard)descriptor.createWizard();
                        IDataModel dm = result.getDataModel();
                        FacetDataModelMap map = (FacetDataModelMap) dm.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
                        IDataModel model = map.getFacetDataModel(J2EEProjectUtilities.JCA);
                        model.setBooleanProperty(J2EEModuleFacetInstallDataModelProvider.PROHIBIT_ADD_TO_EAR, true);
                        
                        IDataModel nestedJCAModel = getDataModel().getNestedModel(NESTED_MODEL_JCA);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_RUNTIME, nestedJCAModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME));
        				IDataModel jcaFacetModel = ((FacetDataModelMap)nestedJCAModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP)).getFacetDataModel(J2EEProjectUtilities.JCA);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_VERSION, jcaFacetModel.getProperty(IFacetDataModelProperties.FACET_VERSION));
                        
                    } catch (CoreException ce) {
                        Logger.getLogger().log(ce);
                    }
                    return result;
                }
            };
        }
        return connectorNode;
    }

    /**
     * @return Returns the ejbNode.
     */
    private GenericWizardNode getEjbNode() {
        if (ejbNode == null) {
            ejbNode = new GenericWizardNode() {
                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.GenericWizardNode#createWizard()
                 */
                protected IWizard createWizard() {
                	NewProjectDataModelFacetWizard result = null;

                    IWizardRegistry newWizardRegistry = WorkbenchPlugin.getDefault().getNewWizardRegistry();
                    IWizardDescriptor descriptor = newWizardRegistry.findWizard("org.eclipse.jst.ejb.ui.project.facet.EjbProjectWizard"); //$NON-NLS-1$
                    try {
                        result = (NewProjectDataModelFacetWizard)descriptor.createWizard();
                        IDataModel dm = result.getDataModel();
                        FacetDataModelMap map = (FacetDataModelMap) dm.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
                        IDataModel model = map.getFacetDataModel(J2EEProjectUtilities.EJB);
                        model.setBooleanProperty(J2EEModuleFacetInstallDataModelProvider.PROHIBIT_ADD_TO_EAR, true);
                        
                        IDataModel nestedEjbModel = getDataModel().getNestedModel(NESTED_MODEL_EJB);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_RUNTIME, nestedEjbModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME));
        				IDataModel ejbFacetModel = ((FacetDataModelMap)nestedEjbModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP)).getFacetDataModel(J2EEProjectUtilities.EJB);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_VERSION, ejbFacetModel.getProperty(IFacetDataModelProperties.FACET_VERSION));
                        
                    } catch (CoreException ce) {
                        Logger.getLogger().log(ce);
                    }
                    return result;
                }
            };
        }
        return ejbNode;
    }

    /**
     * @return Returns the webNode.
     */
    private GenericWizardNode getWebNode() {
        if (webNode == null) {
            webNode = new GenericWizardNode() {
                /*
                 * (non-Javadoc)
                 * 
                 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.GenericWizardNode#createWizard()
                 */
                protected IWizard createWizard() {
                	NewProjectDataModelFacetWizard result = null;
                    IWizardRegistry newWizardRegistry = WorkbenchPlugin.getDefault().getNewWizardRegistry();
                    IWizardDescriptor servletWizardDescriptor = newWizardRegistry.findWizard("org.eclipse.jst.servlet.ui.project.facet.WebProjectWizard"); //$NON-NLS-1$
                    try {
                        result = (NewProjectDataModelFacetWizard)servletWizardDescriptor.createWizard();
                        IDataModel dm = result.getDataModel();
                        FacetDataModelMap map = (FacetDataModelMap) dm.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
                        IDataModel model = map.getFacetDataModel(J2EEProjectUtilities.DYNAMIC_WEB);
                        model.setBooleanProperty(J2EEModuleFacetInstallDataModelProvider.PROHIBIT_ADD_TO_EAR, true);
                        
                        IDataModel nestedWebModel = getDataModel().getNestedModel(NESTED_MODEL_WEB);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_RUNTIME, nestedWebModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME));
        				IDataModel webFacetModel = ((FacetDataModelMap)nestedWebModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP)).getFacetDataModel(J2EEProjectUtilities.DYNAMIC_WEB);
                        model.setProperty(J2EEModuleFacetInstallDataModelProvider.FACET_VERSION, webFacetModel.getProperty(IFacetDataModelProperties.FACET_VERSION));
                         
                    } catch (CoreException ce) {
                        Logger.getLogger().log(ce);
                    }
                    return result;
                }
            };
        }
        return webNode;
    }

    /**
     * @param selectedNode
     *            The selectedNode to set.
     */
    private void setSelectedNode(GenericWizardNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.WizardPage#canFlipToNextPage()
     */
    public boolean canFlipToNextPage() {
        if (!defaultModulesButton.getSelection())
            return selectedNode != null;
        return false;
    }

    /**
     * The <code>WizardSelectionPage</code> implementation of this
     * <code>IWizardPage</code> method returns the first page of the currently
     * selected wizard if there is one.
     */
    public IWizardPage getNextPage() {
        if (selectedNode == null)
            return null;
        IPluginContribution pluginContribution = new IPluginContribution() {
            public String getLocalId() {
                String id = null;
                if (selectedNode == appClientNode) {
                    id = "org.eclipse.jst.j2ee.internal.internal.internal.appclientProjectWizard"; //$NON-NLS-1$
                } else if (selectedNode == ejbNode) {
                    id = "org.eclipse.jst.j2ee.internal.internal.internal.ejb.ui.util.ejbProjectWizard"; //$NON-NLS-1$
                } else if (selectedNode == connectorNode) {
                    id = "org.eclipse.jst.j2ee.internal.internal.internal.jcaProjectWizard"; //$NON-NLS-1$
                } else if (selectedNode == webNode) {
                    id = "org.eclipse.jst.j2ee.internal.internal.internal.webProjectWizard"; //$NON-NLS-1$
                }
                return id;
            }

            public String getPluginId() {
                return "org.eclipse.jst.j2ee.internal.internal.internal.ui"; //$NON-NLS-1$
            }
        };

        if (!WorkbenchActivityHelper.allowUseOf(null,pluginContribution)) {
            return null;
        }

        boolean isCreated = selectedNode.isContentCreated();
        IWizard wizard = selectedNode.getWizard();
        if (wizard == null) {
            setSelectedNode(null);
            return null;
        }
        if (!isCreated) // Allow the wizard to create its pages
            wizard.addPages();

        return wizard.getStartingPage();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.J2EEWizardPage#validatePage()
     */
    protected void validatePage() {
        if (!defaultModulesButton.getSelection()) {
            setPageComplete(false);
            setErrorMessage(null);
        } else
            super.validatePage();
    }

}