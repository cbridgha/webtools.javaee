/**
 * <copyright>
 * </copyright>
 *
 * $Id: EJBRelation.java,v 1.1 2007/03/20 18:04:36 jsholl Exp $
 */
package org.eclipse.jst.javaee.ejb;

import java.util.List;

import org.eclipse.jst.javaee.core.JavaEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJB Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The ejb-relationType describes a relationship between two
 * 	entity beans with container-managed persistence.  It is used
 * 	by ejb-relation elements. It contains a description; an
 * 	optional ejb-relation-name element; and exactly two
 * 	relationship role declarations, defined by the
 * 	ejb-relationship-role elements. The name of the
 * 	relationship, if specified, is unique within the ejb-jar
 * 	file.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EJBRelation#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationName <em>Ejb Relation Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole <em>Ejb Relationship Role</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.ejb.EJBRelation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation()
 * @extends JavaEEObject
 * @generated
 */
public interface EJBRelation extends JavaEEObject {
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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Ejb Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The ejb-relation-name element provides a unique name
	 * 	    within the ejb-jar file for a relationship.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ejb Relation Name</em>' attribute.
	 * @see #setEjbRelationName(String)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation_EjbRelationName()
	 * @generated
	 */
	String getEjbRelationName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationName <em>Ejb Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relation Name</em>' attribute.
	 * @see #getEjbRelationName()
	 * @generated
	 */
	void setEjbRelationName(String value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #setEjbRelationshipRole(EJBRelationshipRole)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation_EjbRelationshipRole()
	 * @generated
	 */
	EJBRelationshipRole getEjbRelationshipRole();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole <em>Ejb Relationship Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #getEjbRelationshipRole()
	 * @generated
	 */
	void setEjbRelationshipRole(EJBRelationshipRole value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role1</em>' containment reference.
	 * @see #setEjbRelationshipRole1(EJBRelationshipRole)
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation_EjbRelationshipRole1()
	 * @generated
	 */
	EJBRelationshipRole getEjbRelationshipRole1();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role1</em>' containment reference.
	 * @see #getEjbRelationshipRole1()
	 * @generated
	 */
	void setEjbRelationshipRole1(EJBRelationshipRole value);

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
	 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbPackage#getEJBRelation_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EJBRelation