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
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchivePackage;
import org.eclipse.jst.j2ee.commonarchivecore.internal.EJBModuleRef;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.ArchiveWrappedException;
import org.eclipse.jst.j2ee.ejb.EJBJar;

/**
 * @generated
 */
public class EJBModuleRefImpl extends ModuleRefImpl implements EJBModuleRef {


	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected EJBModuleRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CommonarchivePackage.Literals.EJB_MODULE_REF;
	}

	public EJBJar getEJBJar() throws ArchiveWrappedException {
		return (EJBJar) getDeploymentDescriptor();
	}

	/*
	 * @see ModuleRef#isEJB()
	 */
	public boolean isEJB() {
		return true;
	}

} //EJBModuleRefImpl



