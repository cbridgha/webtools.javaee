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
package org.eclipse.wst.web.ui.internal.wizards;

import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.DataModelPropertyDescriptor;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.datamodel.ui.DataModelWizardPage;
import org.eclipse.wst.common.frameworks.internal.operations.IProjectCreationPropertiesNew;
import org.eclipse.wst.common.frameworks.internal.ui.NewProjectGroup;
import org.eclipse.wst.common.project.facet.core.runtime.IRuntime;
import org.eclipse.wst.server.ui.ServerUIUtil;
import org.eclipse.wst.web.internal.ResourceHandler;

public class DataModelFacetCreationWizardPage extends DataModelWizardPage implements IFacetProjectCreationDataModelProperties {

	private static final String LAST_RUNTIME_STORE = "LAST_RUNTIME"; //$NON-NLS-1$


	protected static GridData gdhfill() {
		return new GridData(GridData.FILL_HORIZONTAL);
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
		return top;
	}

	public static boolean launchNewRuntimeWizard(Shell shell, IDataModel model) {
		DataModelPropertyDescriptor[] preAdditionDescriptors = model.getValidPropertyDescriptors(FACET_RUNTIME);
		boolean isOK = ServerUIUtil.showNewRuntimeWizard(shell, "", ""); //$NON-NLS-1$  //$NON-NLS-2$
		if (isOK && model != null) {

			DataModelPropertyDescriptor[] postAdditionDescriptors = model.getValidPropertyDescriptors(FACET_RUNTIME);
			Object[] preAddition = new Object[preAdditionDescriptors.length];
			for (int i = 0; i < preAddition.length; i++) {
				preAddition[i] = preAdditionDescriptors[i].getPropertyValue();
			}
			Object[] postAddition = new Object[postAdditionDescriptors.length];
			for (int i = 0; i < postAddition.length; i++) {
				postAddition[i] = postAdditionDescriptors[i].getPropertyValue();
			}
			Object newAddition = ProjectUtilities.getNewObject(preAddition, postAddition);

			model.notifyPropertyChange(FACET_RUNTIME, IDataModel.VALID_VALUES_CHG);
			if (newAddition != null)
				model.setProperty(FACET_RUNTIME, newAddition);
			else
				return false;
		}
		return isOK;
	}

	protected Combo serverTargetCombo;
	protected NewProjectGroup projectNameGroup;

	public DataModelFacetCreationWizardPage(IDataModel dataModel, String pageName) {
		super(dataModel, pageName);
	}

	protected void createServerTargetComposite(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(ResourceHandler.TargetRuntime);
		serverTargetCombo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY);
		serverTargetCombo.setLayoutData(gdhfill());
		Button newServerTargetButton = new Button(parent, SWT.NONE);
		newServerTargetButton.setText(ResourceHandler.NewDotDotDot);
		newServerTargetButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				if (!launchNewRuntimeWizard(getShell(), model)) {
					setErrorMessage(ResourceHandler.InvalidServerTarget);
				}
			}
		});
		Control[] deps = new Control[]{label, newServerTargetButton};
		synchHelper.synchCombo(serverTargetCombo, FACET_RUNTIME, deps);
		if (serverTargetCombo.getSelectionIndex() == -1 && serverTargetCombo.getVisibleItemCount() != 0)
			serverTargetCombo.select(0);
	}

	protected void createProjectGroup(Composite parent) {
		IDataModel nestedProjectDM = model.getNestedModel(NESTED_PROJECT_DM);
		nestedProjectDM.addListener(this);
		projectNameGroup = new NewProjectGroup(parent, nestedProjectDM);
	}

	protected String[] getValidationPropertyNames() {
		return new String[]{IProjectCreationPropertiesNew.PROJECT_NAME, IProjectCreationPropertiesNew.PROJECT_LOCATION, FACET_RUNTIME};
	}

	public void dispose() {
		super.dispose();
		if (projectNameGroup != null)
			projectNameGroup.dispose();
	}

	public void storeDefaultSettings() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			IRuntime runtime = (IRuntime) model.getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME);
			String runtimeName = runtime == null ? "" : runtime.getName(); //$NON-NLS-1$
			settings.put(LAST_RUNTIME_STORE, runtimeName);
		}
	}

	public void restoreDefaultSettings() {
		IDialogSettings settings = getDialogSettings();
		if (settings != null) {
			if (!model.isPropertySet(IFacetProjectCreationDataModelProperties.FACET_RUNTIME)) {
				boolean runtimeSet = false;
				String lastRuntimeName = settings.get(LAST_RUNTIME_STORE);
				DataModelPropertyDescriptor[] descriptors = model.getValidPropertyDescriptors(IFacetProjectCreationDataModelProperties.FACET_RUNTIME);
				if (lastRuntimeName != null) {
					for (int i = 0; i < descriptors.length && !runtimeSet; i++) {
						if (lastRuntimeName.equals(descriptors[i].getPropertyDescription())) {
							model.setProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME, descriptors[i].getPropertyValue());
							runtimeSet = true;
						}
					}
				}
				if (!runtimeSet && descriptors.length > 0) {
					model.setProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME, descriptors[0].getPropertyValue());
				}
			}
		}
	}
}
