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
package org.eclipse.jst.j2ee.commonarchivecore.internal.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.jst.j2ee.client.ApplicationClient;
import org.eclipse.jst.j2ee.commonarchivecore.internal.ClientModuleRef;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchivePackage;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.ArchiveWrappedException;

/**
 * @generated
 */
public class ClientModuleRefImpl extends ModuleRefImpl implements ClientModuleRef {
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected ClientModuleRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CommonarchivePackage.Literals.CLIENT_MODULE_REF;
	}

	public ApplicationClient getApplicationClient() throws ArchiveWrappedException {
		return (ApplicationClient) getDeploymentDescriptor();
	}


	/*
	 * @see ModuleRef#isClient()
	 */
	public boolean isClient() {
		return true;
	}

} //ClientModuleRefImpl



