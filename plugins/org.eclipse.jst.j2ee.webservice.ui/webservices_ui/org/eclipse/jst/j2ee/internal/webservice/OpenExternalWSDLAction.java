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

package org.eclipse.jst.j2ee.internal.webservice;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jst.j2ee.internal.actions.AbstractOpenAction;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIPlugin;
import org.eclipse.jst.j2ee.internal.webservice.helper.WebServicesManager;
import org.eclipse.jst.j2ee.internal.webservice.plugin.WebServiceUIPlugin;
import org.eclipse.jst.j2ee.internal.webservices.WSDLServiceExtManager;
import org.eclipse.jst.j2ee.internal.webservices.WSDLServiceHelper;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author jlanuti
 */
public class OpenExternalWSDLAction extends AbstractOpenAction {

	String uri = ""; //$NON-NLS-1$

	/**
	 * @param text
	 */
	public OpenExternalWSDLAction(String text) {
		super(text);
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(J2EEUIPlugin.PLUGIN_ID, "icons/web_type.gif")); //$NON-NLS-1$
	}

	public void run() {
		try {
			IWorkbenchBrowserSupport browserSupport = WebServiceUIPlugin.getDefault().getWorkbench().getBrowserSupport(); 
			IWebBrowser browser = browserSupport.createBrowser(IWorkbenchBrowserSupport.LOCATION_BAR | IWorkbenchBrowserSupport.NAVIGATION_BAR,"WSDL","",""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			browser.openURL(new URL(uri));
		} catch (Exception e) {
			//Ignore
		}
	}

	public boolean updateSelection(IStructuredSelection s) {
		Object obj = s.getFirstElement();
		WSDLServiceHelper serviceHelper = WSDLServiceExtManager.getServiceHelper();
		if (serviceHelper.isWSDLResource(obj))
			uri = ((Resource) obj).getURI().toString();
		else if (serviceHelper.isService(obj))
			uri = WebServicesManager.getInstance().getWSDLResource((EObject)obj).getURI().toString();
		return super.updateSelection(s);
	}
}
