package org.eclipse.jst.servlet.ui.internal.actions;

/*
 * Licensed Material - Property of IBM (C) Copyright IBM Corp. 2000, 2002 - All
 * Rights Reserved. US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationDataModel;
import org.eclipse.jst.j2ee.internal.actions.AbstractOpenWizardWorkbenchAction;
import org.eclipse.jst.j2ee.internal.project.IWebNatureConstants;
import org.eclipse.jst.j2ee.internal.web.archive.operations.WebModuleCreationDataModel;
import org.eclipse.jst.j2ee.internal.web.operations.ConvertWebProjectDataModel;
import org.eclipse.jst.j2ee.internal.web.util.WebArtifactEdit;
import org.eclipse.jst.servlet.ui.internal.wizard.ConvertToWebModuleTypeWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.wst.common.internal.emfworkbench.operation.EditModelOperationDataModel;
import org.eclipse.wst.common.modulecore.ModuleCore;
import org.eclipse.wst.web.internal.operation.StaticWebNatureRuntime;

import com.ibm.wtp.common.logger.proxy.Logger;

public class ConvertToWebModuleTypeAction extends AbstractOpenWizardWorkbenchAction
{

	IStructuredSelection fSelection = null;
	IProject project = null;
	IWorkbenchWindow fWindow;

	/**
	 * ConvertLinksDialog constructor comment.
	 */
	public ConvertToWebModuleTypeAction()
	{
		super();
	}

	public ConvertToWebModuleTypeAction(IWorkbench workbench, String label,
			Class[] acceptedTypes)
	{
		super(workbench, label, acceptedTypes, false);
	}

	protected Wizard createWizard()
	{
		ConvertToWebModuleTypeWizard wizard = new ConvertToWebModuleTypeWizard(
				new ConvertWebProjectDataModel());
		WebModuleCreationDataModel model = (WebModuleCreationDataModel) wizard
				.getModel();
		model.setProperty(EditModelOperationDataModel.PROJECT_NAME, project
				.getName());
		model.setBooleanProperty(J2EEModuleCreationDataModel.ADD_TO_EAR, true);

		StaticWebNatureRuntime nature;
		try
		{
			nature = (StaticWebNatureRuntime) project
					.getNature(IWebNatureConstants.STATIC_NATURE_ID);
			String webContent = nature.getRootPublishableFolder().getName();
			String contextRoot = nature.getContextRoot();
			model.setProperty(WebModuleCreationDataModel.WEB_CONTENT,
					webContent);
			model.setProperty(WebModuleCreationDataModel.CONTEXT_ROOT,
					contextRoot);
		}
		catch( CoreException e )
		{
			// TODO Auto-generated catch block
			Logger.getLogger().logError(e);
		}

		//		wizard.setWindowTitle("Convert to Dynamic Web Project");

		return wizard;
	}

	/**
	 * Is this a web project?
	 */
	boolean isAWebProject(IProject aProject)
	{
		if( aProject == null ) return false;
		try
		{
			aProject.getNature(IWebNatureConstants.J2EE_NATURE_ID);
		}
		catch( CoreException coe )
		{
			return false;
		}
		return true;
	}

	/**
	 * make sure a web project is selected.
	 */
	public boolean isValidProject(IProject aProject)
	{
		WebArtifactEdit webEdit = null;
		try {
			webEdit = (WebArtifactEdit) ModuleCore.getFirstArtifactEditForRead(aProject);
			return webEdit!=null;
		} finally {
			if (webEdit != null)
				webEdit.dispose();
		}
	}

	/**
	 * selectionChanged method comment.
	 */
	public void selectionChanged(IAction action, ISelection selection)
	{
		boolean bEnable = false;
		if( selection instanceof IStructuredSelection )
		{
			fSelection = (IStructuredSelection) selection;
			bEnable = validateSelected(fSelection);
		}
		((Action) action).setEnabled(bEnable);
	}

	/**
	 * selectionChanged method comment.
	 */
	public boolean validateSelected(ISelection selection)
	{
		if( !(selection instanceof IStructuredSelection) ) return false;

		fSelection = (IStructuredSelection) selection;

		Object selectedProject = fSelection.getFirstElement();
		if( !(selectedProject instanceof IProject) ) return false;

		project = (IProject) selectedProject;
		return isValidProject(project);
	}
}