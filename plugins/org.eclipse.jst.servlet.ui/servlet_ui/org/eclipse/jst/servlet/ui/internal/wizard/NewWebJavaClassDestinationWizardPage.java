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
package org.eclipse.jst.servlet.ui.internal.wizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jst.j2ee.internal.web.util.WebArtifactEdit;
import org.eclipse.wst.common.frameworks.operations.WTPOperationDataModel;
import org.eclipse.wst.common.modulecore.ModuleCore;

import com.ibm.wtp.emf.workbench.ProjectUtilities;

public class NewWebJavaClassDestinationWizardPage extends NewJavaClassDestinationWizardPage {
	public NewWebJavaClassDestinationWizardPage(WTPOperationDataModel model, String pageName,
			String pageDesc, String pageTitle) {
		super(model, pageName, pageDesc, pageTitle);
	}

	/**
	 * Returns a new instance of the Selection Listner for the Container Selection Dialog
	 */
	protected ViewerFilter getContainerDialogViewerFilter() {
		return new ViewerFilter() {
			public boolean select(Viewer viewer, Object parent, Object element) {
				boolean ret = false;
				if (element instanceof IProject) {
					WebArtifactEdit webEdit = null;
					try {
						IProject project = (IProject) element;
						webEdit = (WebArtifactEdit) ModuleCore.getFirstArtifactEditForRead(project);
						ret = webEdit!=null;
					} finally {
						if (webEdit != null)
							webEdit.dispose();
					}
				} else if (element instanceof IFolder) {
					IFolder folder = (IFolder) element;
					// only show source folders
					if (ProjectUtilities.getSourceContainers(folder.getProject()).contains(folder))
						ret = true;
				}
				return ret;
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see com.ibm.wtp.common.ui.wizard.WTPWizardPage#enter()
	 */
	protected void enter() {
		String className = classText.getText();
		// Synch class name with display name only when it is not set
		if (className == null || className.trim().length() == 0) {
			IWizardPage firstPage = getWizard().getStartingPage();
			if (firstPage != null && firstPage instanceof AddServletWizardPage) {
				String displayName = ((AddServletWizardPage)firstPage).getDisplayName();
				setClassNameToDisplayName(displayName);
			}
			/*else if (firstPage instanceof AddFilterWizardPage) {
				String displayName = ((AddFilterWizardPage)firstPage).getDisplayName();
				setClassNameToDisplayName(displayName);
			}
			else if (firstPage instanceof AddListenerWizardPage) {
				String displayName = ((AddListenerWizardPage)firstPage).getDisplayName();
				if (displayName !=null && displayName.trim().length()>0)
				    setClassNameToDisplayName(displayName);
			}*/
		}
		super.enter();
	}
	
	private void setClassNameToDisplayName(String displayName) {
		char[] textChar = displayName.toCharArray();
		textChar[0] = Character.toUpperCase(textChar[0]);
		String className = String.valueOf(textChar);
		classText.setText(className);
	}

}