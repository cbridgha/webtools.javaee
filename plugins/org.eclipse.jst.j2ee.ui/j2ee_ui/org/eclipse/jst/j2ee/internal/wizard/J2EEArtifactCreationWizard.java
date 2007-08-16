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
package org.eclipse.jst.j2ee.internal.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPlugin;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IPluginContribution;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.eclipse.wst.common.componentcore.datamodel.properties.IComponentCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.internal.DoNotUseMeThisWillBeDeletedPost15;
import org.eclipse.wst.common.frameworks.internal.datamodel.ui.DataModelWizard;
import org.eclipse.wst.web.internal.DelegateConfigurationElement;

/**
 * <p>
 * Serves as a base class for the Wizards which create J2EE artifact structures. An Artifact can be
 * a J2EE application, module, or utility component.
 * </p>
 * <p>
 * Creation wizards must define the abstract methods from
 * {@link org.eclipse.wst.common.frameworks.ui.ExtendableWizard}which include the following:
 * <ul>
 * <li> {@link org.eclipse.wst.common.frameworks.ui.ExtendableWizard#doAddPages()}
 * <li> {@link org.eclipse.wst.common.frameworks.ui.ExtendableWizard#canFinish()}
 * <li> {@link org.eclipse.wst.common.frameworks.ui.ExtendableWizard#createBaseOperation()}
 * <li>{@link com.ibm.etools.j2ee.common.wizard.datamodel.WTPWizard#createDefaultModel()}
 * </ul>
 * </p>
 * <p>
 * And optionally, they can override the following methods:
 * <ul>
 * <li>{@link #getFinalPerspectiveID()}
 * <li>{@link #doInit()}
 * <li>{@link #doDispose()}
 * <li>{@link #doSetInitializeData(IConfigurationElement, String, Object)}
 * </ul>
 * 
 * @see org.eclipse.wst.common.frameworks.ui.ExtendableWizard
 */
/**
 * This has been slated for removal post WTP 1.5. Do not use this class/interface
 * 
 * @deprecated
 */
public abstract class J2EEArtifactCreationWizard extends DataModelWizard implements INewWizard, IExecutableExtension, IPluginContribution, DoNotUseMeThisWillBeDeletedPost15 {

	/**
	 * <p>
	 * Constant used to identify the key of the main page of the Wizard.
	 * </p>
	 */
	protected static final String MAIN_PG = "main"; //$NON-NLS-1$

	private IStructuredSelection selection;
	private IConfigurationElement configurationElement;

	/**
	 * <p>
	 * Creates a default instance of the wizard with no configuration data, no selection, and no
	 * operation data model.
	 * </p>
	 */
	public J2EEArtifactCreationWizard() {
		super();
	}

	/**
	 * <p>
	 * The model is used to prepopulate wizard controls and to collect data from the user. The model
	 * will eventually be used to run the operation, if the user does not cancel the Wizard.
	 * </p>
	 * 
	 * @param model
	 *            used to collect information and interface with the WTP Operation
	 */
	public J2EEArtifactCreationWizard(IDataModel model) {
		super(model);
	}


	/**
	 * <p>
	 * The selection is used to pre-populate values in the Wizard dialog controls.
	 * </p>
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 * 
	 * @param workbench
	 *            the current workbench parent of the wizard
	 * @param aSelection
	 *            the selection from the view used to start the wizard (if any)
	 */
	public final void init(IWorkbench workbench, IStructuredSelection aSelection) {
		setNeedsProgressMonitor(true);
		this.selection = aSelection;
		doInit();
	}

	/**
	 * <p>
	 * Calls {@link #doDispose()}and then nulls out fields that are no longer needed once the
	 * wizard completes.
	 * </p>
	 * 
	 * @see com.ibm.etools.j2ee.common.wizard.datamodel.WTPWizard#dispose()
	 */
	public final void dispose() {
		super.dispose();
		doDispose();
		this.selection = null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * The configuration element is saved to use when the wizard completes in order to change the
	 * current perspective using either (1) the value specified by {@link #getFinalPerspectiveID()}
	 * or (2) the value specified by the finalPerspective attribute in the Wizard's configuration
	 * element.
	 * </p>
	 * 
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
	 *      java.lang.String, java.lang.Object)
	 */
	public final void setInitializationData(IConfigurationElement aConfigurationElement, String aPropertyName, Object theData) throws CoreException {
		configurationElement = aConfigurationElement;
		doSetInitializeData(aConfigurationElement, aPropertyName, theData);

	}

	/**
	 * <p>
	 * Override method for clients that wish to take advantage of the information provided by
	 * {@see #setInitializationData(IConfigurationElement, String, Object)}.
	 * </p>
	 * 
	 * @param aConfigurationElement
	 *            The configuration element provided from the templated method.
	 * @param aPropertyName
	 *            The property name provided from the templated method.
	 * @param theData
	 *            The data provided from the templated method.
	 */
	protected void doSetInitializeData(IConfigurationElement aConfigurationElement, String aPropertyName, Object theData) {
		// Default do nothing
	}

	/**
	 * <p>
	 * Invoked from init(IWorkbench, IStructuredSelection) once the workbench and selection have
	 * been safely stored away.
	 * </p>
	 * <p>
	 * No-op by default.
	 * </p>
	 */
	protected void doInit() {
		// init
	}

	/**
	 * <p>
	 * Invoked from {@link #dispose()}. Should be used to handle any specific Wizard disposal.
	 * </p>
	 */
	protected void doDispose() {
		// dispose
	}

	/**
	 * <p>
	 * Override to return the final perspective ID (if any). The final perspective ID can be
	 * hardcoded by the subclass or determined programmatically (possibly using the value of a field
	 * on the Wizard's WTP Operation Data Model).
	 * </p>
	 * <p>
	 * Default return value is <b>null </b>.
	 * </p>
	 * 
	 * @return Returns the ID of the Perspective which is preferred by this wizard upon completion.
	 */
	protected String getFinalPerspectiveID() {
		return null;
	}

	/**
	 * 
	 * <p>
	 * Invoked after the user has clicked the "Finish" button of the wizard. The default
	 * implementation will attempt to update the final perspective to the value specified by
	 * {@link #getFinalPerspectiveID() }
	 * </p>
	 * 
	 * @throws InvocationTargetException
	 * 
	 * @see org.eclipse.wst.common.frameworks.internal.ui.wizard.WTPWizard#postPerformFinish()
	 */
	protected void postPerformFinish() throws InvocationTargetException {
		super.postPerformFinish();
		if (getFinalPerspectiveID() != null && getFinalPerspectiveID().length() > 0) {

			IConfigurationElement element = new DelegateConfigurationElement(configurationElement) {
				public String getAttribute(String aName) {
					if (aName.equals("finalPerspective")) { //$NON-NLS-1$
						return getFinalPerspectiveID();
					}
					return super.getAttribute(aName);
				}
			};
			BasicNewProjectResourceWizard.updatePerspective(element);
		} else
			BasicNewProjectResourceWizard.updatePerspective(configurationElement);
		String projName = getDataModel().getStringProperty(IComponentCreationDataModelProperties.PROJECT_NAME);
		BasicNewResourceWizard.selectAndReveal(ProjectUtilities.getProject(projName), J2EEUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow());
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.WizardPage#getDialogSettings()
	 * @return Returns the saved settings from the previous use of the Wizard
	 */
	public final IDialogSettings getDialogSettings() {
		return J2EEUIPlugin.getDefault().getDialogSettings();
	}

	/**
	 * @return Returns the selection from the current view used to spawn the wizard
	 */
	protected final IStructuredSelection getSelection() {
		return selection;
	}


	/**
	 * <p>
	 * Returns the value specified by {@link #getWizardId()}
	 * </p>
	 * 
	 * @return Returns the an id component used for Activity filtering.
	 */
	public final String getLocalId() {
		return getWizardID();
	}

	/**
	 * <p>
	 * Returns the an id component used for Activity filtering.
	 * </p>
	 * 
	 * <p>
	 * The Plugin ID is determined from the configuration element specified in
	 * {@see #setInitializationData(IConfigurationElement, String, Object)}.
	 * </p>
	 * 
	 * @return Returns the plugin id associated with this wizard
	 */
	public final String getPluginId() {
		return (configurationElement != null) ? configurationElement.getNamespace() : ""; //$NON-NLS-1$
	}



	protected final IConfigurationElement getConfigurationElement() {
		return configurationElement;
	}


}
