/*******************************************************************************
 * Copyright (c) 2007, 2008 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Kaloyan Raev, kaloyan.raev@sap.com - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.servlet.ui.internal.wizard;

import static org.eclipse.jst.j2ee.internal.common.operations.INewJavaClassDataModelProperties.PROJECT;
import static org.eclipse.jst.j2ee.internal.web.operations.INewWebClassDataModelProperties.USE_EXISTING_CLASS;
import static org.eclipse.jst.servlet.ui.internal.wizard.IWebWizardConstants.CHOOSE_FILTER_CLASS;
import static org.eclipse.jst.servlet.ui.internal.wizard.IWebWizardConstants.NEW_FILTER_WIZARD_WINDOW_TITLE;
import static org.eclipse.jst.servlet.ui.internal.wizard.IWebWizardConstants.USE_EXISTING_FILTER_CLASS;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jface.window.Window;
import org.eclipse.jst.j2ee.internal.war.ui.util.WebFiltersGroupItemProvider;
import org.eclipse.jst.j2ee.webapplication.WebApp;
import org.eclipse.jst.jee.ui.internal.navigator.web.GroupFiltersItemProvider;
import org.eclipse.jst.jee.ui.internal.navigator.web.WebAppProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;

public class NewFilterClassWizardPage extends NewWebClassWizardPage {
	
    private final static String[] FILTEREXTENSIONS = { "java" }; //$NON-NLS-1$
    
	public NewFilterClassWizardPage(IDataModel model, String pageName, String pageDesc, String pageTitle, String moduleType) {
		super(model, pageName, pageDesc, pageTitle, moduleType);
	}
	
	@Override
	protected String getUseExistingCheckboxText() {
		return USE_EXISTING_FILTER_CLASS;
	}
	
	@Override
	protected String getUseExistingProperty() {
		return USE_EXISTING_CLASS;
	}
	
	@Override
	protected IProject getExtendedSelectedProject(Object selection) {
		if (selection instanceof WebFiltersGroupItemProvider) {
			WebApp webApp = (WebApp)((WebFiltersGroupItemProvider) selection).getParent();
			return ProjectUtilities.getProject(webApp);
		}else if(selection instanceof WebAppProvider){
			return ((WebAppProvider) selection).getProject();
		} if(selection instanceof GroupFiltersItemProvider){
			org.eclipse.jst.javaee.web.WebApp webApp = (org.eclipse.jst.javaee.web.WebApp) ((GroupFiltersItemProvider) selection).getJavaEEObject();
			return ProjectUtilities.getProject(webApp);
		}
		
		return super.getExtendedSelectedProject(selection);
	}
	
	@Override
	protected void handleClassButtonSelected() {
        getControl().setCursor(new Cursor(getShell().getDisplay(), SWT.CURSOR_WAIT));
        IProject project = (IProject) model.getProperty(PROJECT);
        IVirtualComponent component = ComponentCore.createComponent(project);
        MultiSelectFilteredFilterFileSelectionDialog ms = new MultiSelectFilteredFilterFileSelectionDialog(
                getShell(),
                NEW_FILTER_WIZARD_WINDOW_TITLE,
                CHOOSE_FILTER_CLASS, 
                FILTEREXTENSIONS, 
                false, 
                project);
        IContainer root = component.getRootFolder().getUnderlyingFolder();
        ms.setInput(root);
        ms.open();
        if (ms.getReturnCode() == Window.OK) {
            String qualifiedClassName = ""; //$NON-NLS-1$
            IType type = (IType) ms.getFirstResult();
            if (type != null) {
                qualifiedClassName = type.getFullyQualifiedName();
            }
            existingClassText.setText(qualifiedClassName);
        }
        getControl().setCursor(null);
    }
	
}