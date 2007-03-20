/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecurityRole.java,v 1.1 2007/03/20 18:04:35 jsholl Exp $
 */
package org.eclipse.jst.javaee.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	
 * 
 * 	  The security-roleType contains the definition of a security
 * 	  role. The definition consists of an optional description of
 * 	  the security role, and the security role name.
 * 
 * 	  Example:
 * 
 * 	      &lt;security-role&gt;
 * 	      &lt;description&gt;
 * 		  This role includes all employees who are authorized
 * 		  to access the employee service application.
 * 	      &lt;/description&gt;
 * 	      &lt;role-name&gt;employee&lt;/role-name&gt;
 * 	      &lt;/security-role&gt;
 * 
 * 	  
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.core.SecurityRole#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.SecurityRole#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.SecurityRole#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getSecurityRole()
 * @extends JavaEEObject
 * @generated
 */
public interface SecurityRole extends JavaEEObject {
	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getSecurityRole_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getSecurityRole_RoleName()
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.SecurityRole#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

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
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getSecurityRole_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.SecurityRole#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SecurityRole