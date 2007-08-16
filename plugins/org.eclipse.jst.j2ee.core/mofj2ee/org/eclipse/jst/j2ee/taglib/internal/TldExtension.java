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
package org.eclipse.jst.j2ee.taglib.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jst.j2ee.common.J2EEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tld Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.taglib.internal.TldExtension#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.taglib.internal.TldExtension#getExtensionElements <em>Extension Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.j2ee.taglib.TaglibPackage#getTldExtension()
 * @model
 * @generated
 */
public interface TldExtension extends J2EEEObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.eclipse.jst.j2ee.taglib.TaglibPackage#getTldExtension_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.taglib.internal.TldExtension#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Extension Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.j2ee.taglib.internal.ExtensibleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Elements</em>' containment reference list.
	 * @see org.eclipse.jst.j2ee.taglib.TaglibPackage#getTldExtension_ExtensionElements()
	 * @model type="org.eclipse.jst.j2ee.taglib.internal.ExtensibleType" containment="true" required="true"
	 * @generated
	 */
	EList getExtensionElements();

} // TldExtension
