/**
 * <copyright>
 * </copyright>
 *
 * $Id: MethodPermission.java,v 1.1 2007/03/20 18:04:36 jsholl Exp $
 */
package org.eclipse.jst.javaee.ejb;

import java.util.List;

import org.eclipse.jst.javaee.core.EmptyType;
import org.eclipse.jst.javaee.core.JavaEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The method-permissionType specifies that one or more
 * 	security roles are allowed to invoke one or more enterprise
 * 	bean methods. The method-permissionType consists of an
 * 	optional description, a list of security role names or an
 * 	indicator to state that the method is unchecked for
 * 	authorization, and a list of method elements.
 * 
 * 	The security roles used in the method-permissionType
 * 	must be defined in the security-role elements of the
 * 	deployment descriptor, and the methods must be methods
 * 	defined in the enterprise bean's business, home, component
 *         and/or web service endpoint interfaces.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.ejb.MethodPermission#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.MethodPermission#getRoleNames <em>Role Names</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.MethodPermission#getUnchecked <em>Unchecked</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.MethodPermission#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.MethodPermission#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission()
 * @extends JavaEEObject
 * @generated
 */
public interface MethodPermission extends JavaEEObject {
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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Role Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Names</em>' attribute list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission_RoleNames()
	 * @generated
	 */
	List getRoleNames();

	/**
	 * Returns the value of the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	      The unchecked element specifies that a method is
	 * 	      not checked for authorization by the container
	 * 	      prior to invocation of the method.
	 * 
	 * 	    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unchecked</em>' containment reference.
	 * @see #setUnchecked(EmptyType)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission_Unchecked()
	 * @generated
	 */
	EmptyType getUnchecked();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getUnchecked <em>Unchecked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unchecked</em>' containment reference.
	 * @see #getUnchecked()
	 * @generated
	 */
	void setUnchecked(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.ejb.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission_Methods()
	 * @generated
	 */
	List getMethods();

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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getMethodPermission_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MethodPermission