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
package org.eclipse.jst.j2ee.application.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jst.j2ee.application.ApplicationPackage;
import org.eclipse.jst.j2ee.application.ConnectorModule;

/**
 * Specifies the URI of a resource adapter archive file, relative to the top level of the application package.
 * @generated
 */
public class ConnectorModuleImpl extends ModuleImpl implements ConnectorModule {

	public ConnectorModuleImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.CONNECTOR_MODULE;
	}

public boolean isConnectorModule() {
		return true;
}
}





