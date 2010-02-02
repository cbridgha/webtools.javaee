/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.jee.model.internal;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.javaee.core.DisplayName;
import org.eclipse.jst.javaee.core.JavaeeFactory;
import org.eclipse.jst.javaee.web.IWebResource;
import org.eclipse.jst.javaee.web.WebApp;
import org.eclipse.jst.javaee.web.WebAppDeploymentDescriptor;
import org.eclipse.jst.javaee.web.WebAppVersionType;
import org.eclipse.jst.javaee.web.WebFactory;

public class Web25ModelProvider extends JEE5ModelProvider {
	
	private IWebResource webResource = null;
	private static final String WAR25_CONTENT_TYPE = "org.eclipse.jst.jee.ee5webDD"; //$NON-NLS-1$
	public Web25ModelProvider(IProject proj) {
		super();
		this.proj = proj;
		setDefaultResourcePath(new Path(J2EEConstants.WEBAPP_DD_URI));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jst.j2ee.model.IModelProvider#getModelObject(org.eclipse.core.runtime.IPath)
	 */
	public Object getModelObject(IPath modelPath) {
		IWebResource webRes = (IWebResource)getModelResource(modelPath);
		if (webRes != null && webRes.getRootObject() != null) 
			return webRes.getWebApp();
		return null;
	}
	protected String getContentTypeDescriber() {
		return WAR25_CONTENT_TYPE;
	}
	public void populateRoot(XMLResourceImpl res, String name) {
		WebAppDeploymentDescriptor dd = WebFactory.eINSTANCE.createWebAppDeploymentDescriptor();
		dd.getXMLNSPrefixMap().put("", J2EEConstants.JAVAEE_NS_URL);  //$NON-NLS-1$
		dd.getXMLNSPrefixMap().put("xsi", J2EEConstants.XSI_NS_URL); //$NON-NLS-1$
		dd.getXSISchemaLocation().put(J2EEConstants.JAVAEE_NS_URL, J2EEConstants.WEB_APP_SCHEMA_LOC_2_5);
		WebApp war = WebFactory.eINSTANCE.createWebApp();
		DisplayName dn = JavaeeFactory.eINSTANCE.createDisplayName();
		dn.setValue(name);
		war.getDisplayNames().add(dn);
		dd.setWebApp(war);
		war.setVersion(WebAppVersionType._25_LITERAL);
		res.getContents().add((EObject) dd);
	}

}
