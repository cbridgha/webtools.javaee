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
package org.eclipse.jst.j2ee.jca;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jst.j2ee.common.J2EEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Config Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * @version J2EE1.4
 * The required-config-propertyType contains a declaration
 * of a single configuration property used for specifying a
 * required configuration property name. It is used
 * by required-config-property elements.
 * 
 * Example:
 * 
 * <required-config-property>Destination</required-config-property>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.jca.RequiredConfigPropertyType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jca.RequiredConfigPropertyType#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.j2ee.jca.JcaPackage#getRequiredConfigPropertyType()
 * @model
 * @generated
 */
public interface RequiredConfigPropertyType extends J2EEEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.jst.j2ee.jca.JcaPackage#getRequiredConfigPropertyType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.jca.RequiredConfigPropertyType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.j2ee.common.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.eclipse.jst.j2ee.jca.JcaPackage#getRequiredConfigPropertyType_Descriptions()
	 * @model type="org.eclipse.jst.j2ee.common.Description" containment="true"
	 * @generated
	 */
	EList getDescriptions();

} // RequiredConfigPropertyType
