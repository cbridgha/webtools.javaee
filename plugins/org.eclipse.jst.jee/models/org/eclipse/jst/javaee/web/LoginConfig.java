/**
 * <copyright>
 * </copyright>
 *
 * $Id: LoginConfig.java,v 1.1 2007/03/20 18:04:39 jsholl Exp $
 */
package org.eclipse.jst.javaee.web;

import org.eclipse.jst.javaee.core.JavaEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The login-configType is used to configure the authentication
 * 	method that should be used, the realm name that should be
 * 	used for this application, and the attributes that are
 * 	needed by the form login mechanism.
 * 
 * 	Used in: web-app
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.web.LoginConfig#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.web.LoginConfig#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.web.LoginConfig#getFormLoginConfig <em>Form Login Config</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.web.LoginConfig#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage#getLoginConfig()
 * @extends JavaEEObject
 * @generated
 */
public interface LoginConfig extends JavaEEObject {
	/**
	 * Returns the value of the '<em><b>Auth Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Method</em>' attribute.
	 * @see #setAuthMethod(String)
	 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage#getLoginConfig_AuthMethod()
	 * @generated
	 */
	String getAuthMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.web.LoginConfig#getAuthMethod <em>Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Method</em>' attribute.
	 * @see #getAuthMethod()
	 * @generated
	 */
	void setAuthMethod(String value);

	/**
	 * Returns the value of the '<em><b>Realm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The realm name element specifies the realm name to
	 * 	    use in HTTP Basic authorization.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realm Name</em>' attribute.
	 * @see #setRealmName(String)
	 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage#getLoginConfig_RealmName()
	 * @generated
	 */
	String getRealmName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.web.LoginConfig#getRealmName <em>Realm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm Name</em>' attribute.
	 * @see #getRealmName()
	 * @generated
	 */
	void setRealmName(String value);

	/**
	 * Returns the value of the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Login Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Login Config</em>' containment reference.
	 * @see #setFormLoginConfig(FormLoginConfig)
	 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage#getLoginConfig_FormLoginConfig()
	 * @generated
	 */
	FormLoginConfig getFormLoginConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.web.LoginConfig#getFormLoginConfig <em>Form Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Config</em>' containment reference.
	 * @see #getFormLoginConfig()
	 * @generated
	 */
	void setFormLoginConfig(FormLoginConfig value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage#getLoginConfig_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.web.LoginConfig#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LoginConfig