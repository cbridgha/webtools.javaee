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
package org.eclipse.jst.j2ee.internal.common;

import org.eclipse.wst.project.facet.IProductConstants;
import org.eclipse.wst.project.facet.ProductManager;

public interface CreationConstants {

	String DEFAULT_WEB_SOURCE_FOLDER =	"src"; //$NON-NLS-1$ 
	String DEFAULT_EJB_SOURCE_FOLDER = ProductManager.getProperty(IProductConstants.EJB_CONTENT_FOLDER);
	String DEFAULT_CONNECTOR_SOURCE_FOLDER = ProductManager.getProperty(IProductConstants.JCA_CONTENT_FOLDER);
	String DEFAULT_APPCLIENT_SOURCE_FOLDER = ProductManager.getProperty(IProductConstants.APP_CLIENT_CONTENT_FOLDER); 
	String EJB_CLIENT_NAME ="ClientProject";//$NON-NLS-1$ 
	String CLIENT_JAR_URI="ClientJARURI";//$NON-NLS-1$ 
}
