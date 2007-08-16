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
package org.eclipse.jst.j2ee.webapplication.internal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jst.j2ee.common.internal.impl.J2EEEObjectImpl;
import org.eclipse.jst.j2ee.webapplication.WebType;
import org.eclipse.jst.j2ee.webapplication.WebapplicationPackage;

/**
 * @generated
 */
public abstract class WebTypeImpl extends J2EEEObjectImpl implements WebType {

	public WebTypeImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WebapplicationPackage.Literals.WEB_TYPE;
	}

/**
 * isJspType method comment.
 */
public boolean isJspType() {
	return false;
}
/**
 * isServletType method comment.
 */
public boolean isServletType() {
	return false;
}
}














