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
package org.eclipse.jst.j2ee.ejb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jem.java.Field;
import org.eclipse.jem.java.JavaHelpers;
import org.eclipse.jst.j2ee.common.J2EEEAttribute;
/**
 * Describes a container-managed field. The field element includes an optional description of the field, and the name of the field.
 * @generated
 * @since 1.0 */
public interface CMPAttribute extends J2EEEAttribute {

	/**
	 * @deprecated - With EJB 2.0, assuming a Java field is no longer safe.
	 * 		Use getType() and getName() to get the most common field info.
	 *		Or use getEjbClass() to get additional Java info.
	 *@return the Field value
	 */

	Field getField() ;
	
	/**
	 * The name of the get method corresponding to this attrribute
	 * @return the String value
	 */
	String getGetterName();
	/**
	 * Return the type of this attribute in its original form (i.e., unwrapped if
	 * the type has been wrapped).
	 * @return JavaHelpers value
	 */
	public JavaHelpers getOriginatingType() ;
	
	/**
	 * The name of the set method corresponding to this attrribute
	 * @return the String value
	 */
	String getSetterName();
	
	/**
	 * Returns the Java Type of the attribute
	 * @return the JavaHelpers
	 */
	JavaHelpers getType() ;
	
	/**
	 * Returns true if the attribute is a CMR field
	 * @return boolean value
	 */
	boolean isCMRField() ;
	
	/**
	 * Returns true if the attribute is the key field of the bean
	 * @return boolean value
	 */
	boolean isKey() ;
	/**
	 * Returns true if this field is a primkey-field in the deployment descriptor.
	 * @return boolean value
	 */
	public boolean isPrimKeyField();
	
	/**
	 * Sets the originating Java type
	 * @param newOriginatingType the JavaHelpers
	 */
	public void setOriginatingType(JavaHelpers newOriginatingType) ;
	
	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return The value of the Description attribute
	 * The description is used by the ejb-jar file producer to provide text describing 
	 * the cmr field.
	 * 
	 * The description should include any information that the ejb-jar file producer
	 * wants to provide to the consumer of the ejb-jar file (i.e. to the Deployer).
	 * Typically, the tools used by the ejb-jar file consumer will display the
	 * description when processing the list of dependents.
	 */
	String getDescription();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @param value The new value of the Description attribute
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.j2ee.common.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @version J2EE1.4
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.eclipse.jst.j2ee.ejb.EjbPackage#getCMPAttribute_Descriptions()
	 * @model type="org.eclipse.jst.j2ee.common.Description" containment="true"
	 * @generated
	 */
	EList getDescriptions();

	/**
	 * Return true if a targetAttribute exists.
	 * @return boolean value
	 */
	boolean isDerived();
	
	/**
	 * Sets the attribute as a derived attribute
	 * @param aBoolean the boolean value
	 */
	void setDerived(boolean aBoolean);
	
}






