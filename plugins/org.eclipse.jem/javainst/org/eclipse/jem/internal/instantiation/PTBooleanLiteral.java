/*******************************************************************************
 * Copyright (c)  2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 *  $RCSfile: PTBooleanLiteral.java,v $
 *  $Revision: 1.3 $  $Date: 2004/02/03 23:25:15 $ 
 */
package org.eclipse.jem.internal.instantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents a primitive boolean literal, i.e. true or false directly in the code.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jem.internal.instantiation.PTBooleanLiteral#isBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jem.internal.instantiation.InstantiationPackage#getPTBooleanLiteral()
 * @model 
 * @generated
 */
public interface PTBooleanLiteral extends PTExpression{
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the literal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(boolean)
	 * @see org.eclipse.jem.internal.instantiation.InstantiationPackage#getPTBooleanLiteral_BooleanValue()
	 * @model 
	 * @generated
	 */
	boolean isBooleanValue();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.instantiation.PTBooleanLiteral#isBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #isBooleanValue()
	 * @generated
	 */
	void setBooleanValue(boolean value);

} // BooleanLiteral
