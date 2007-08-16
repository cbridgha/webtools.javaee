/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Mar 31, 2003
 *
 * To change this generated comment go to 
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.eclipse.jst.j2ee.jca;

import org.eclipse.jst.j2ee.internal.common.XMLResource;

/**
 *@since 1.0
 */
public interface ConnectorResource extends XMLResource {
	
	/**
	 * Returns the deployment descriptor model
	 * @return Connector
	 */
	public Connector getConnector() ;
}
