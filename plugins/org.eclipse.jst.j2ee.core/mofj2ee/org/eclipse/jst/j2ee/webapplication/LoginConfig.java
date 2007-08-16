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
package org.eclipse.jst.j2ee.webapplication;

import org.eclipse.jst.j2ee.common.J2EEEObject;

/**
 * The login-config element is used to configure the authentication method that should be used, the realm name that should be used for this application, and the attributes that are needed by the form login
 * mechanism.
 * @generated
 */
public interface LoginConfig extends J2EEEObject {
	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return The value of the AuthMethod attribute
	 * The auth-method element is used to configure the authentication mechanism for
	 * the web application. As a prerequisite to gaining access to any web resources
	 * which are protected by an authorization constraint, a user must have
	 * authenticated using the configured mechanism. Legal values for this element are 
	 * "BASIC", "DIGEST", "FORM", or "CLIENT-CERT".
	 */
	AuthMethodKind getAuthMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webapplication.LoginConfig#getAuthMethod <em>Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Method</em>' attribute.
	 * @see org.eclipse.jst.j2ee.webapplication.AuthMethodKind
	 * @see #isSetAuthMethod()
	 * @see #unsetAuthMethod()
	 * @see #getAuthMethod()
	 * @generated
	 */
	void setAuthMethod(AuthMethodKind value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.j2ee.webapplication.LoginConfig#getAuthMethod <em>Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthMethod()
	 * @see #getAuthMethod()
	 * @see #setAuthMethod(AuthMethodKind)
	 * @generated
	 */
	void unsetAuthMethod();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.j2ee.webapplication.LoginConfig#getAuthMethod <em>Auth Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auth Method</em>' attribute is set.
	 * @see #unsetAuthMethod()
	 * @see #getAuthMethod()
	 * @see #setAuthMethod(AuthMethodKind)
	 * @generated
	 */
	boolean isSetAuthMethod();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return The value of the RealmName attribute
	 * The realm name element specifies the realm name to use in HTTP Basic
	 * authorization
	 */
	String getRealmName();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @param value The new value of the RealmName attribute
	 */
	void setRealmName(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @version J2EE1.4
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Method</em>' attribute.
	 * @see #setAuthorizationMethod(String)
	 * @see org.eclipse.jst.j2ee.webapplication.WebapplicationPackage#getLoginConfig_AuthorizationMethod()
	 * @model
	 * @generated
	 */
	String getAuthorizationMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webapplication.LoginConfig#getAuthorizationMethod <em>Authorization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Method</em>' attribute.
	 * @see #getAuthorizationMethod()
	 * @generated
	 */
	void setAuthorizationMethod(String value);

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return The WebApp reference
	 */
	WebApp getWebApp();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @param l The new value of the WebApp reference
	 */
	void setWebApp(WebApp value);

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return The FormLoginConfig reference
	 */
	FormLoginConfig getFormLoginConfig();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @param l The new value of the FormLoginConfig reference
	 */
	void setFormLoginConfig(FormLoginConfig value);

}














