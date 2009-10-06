/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.beaninfo;
/*


 */


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.jem.java.Field;
import org.eclipse.jem.java.JavaClass;
import org.eclipse.jem.java.Method;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Equivalent to PropertyDecorator in java.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isBound <em>Bound</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isConstrained <em>Constrained</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isDesignTime <em>Design Time</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isAlwaysIncompatible <em>Always Incompatible</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getFilterFlags <em>Filter Flags</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isFieldReadOnly <em>Field Read Only</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getPropertyEditorClass <em>Property Editor Class</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getReadMethod <em>Read Method</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getWriteMethod <em>Write Method</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator()
 * @model
 * @generated
 */


public interface PropertyDecorator extends FeatureDecorator{
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #isSetBound()
	 * @see #unsetBound()
	 * @see #setBound(boolean)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_Bound()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isBound();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #isSetBound()
	 * @see #unsetBound()
	 * @see #isBound()
	 * @generated
	 */
	void setBound(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBound()
	 * @see #isBound()
	 * @see #setBound(boolean)
	 * @generated
	 */
	void unsetBound();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isBound <em>Bound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bound</em>' attribute is set.
	 * @see #unsetBound()
	 * @see #isBound()
	 * @see #setBound(boolean)
	 * @generated
	 */
	boolean isSetBound();

	/**
	 * Returns the value of the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained</em>' attribute.
	 * @see #isSetConstrained()
	 * @see #unsetConstrained()
	 * @see #setConstrained(boolean)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_Constrained()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isConstrained();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isConstrained <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained</em>' attribute.
	 * @see #isSetConstrained()
	 * @see #unsetConstrained()
	 * @see #isConstrained()
	 * @generated
	 */
	void setConstrained(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isConstrained <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstrained()
	 * @see #isConstrained()
	 * @see #setConstrained(boolean)
	 * @generated
	 */
	void unsetConstrained();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isConstrained <em>Constrained</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constrained</em>' attribute is set.
	 * @see #unsetConstrained()
	 * @see #isConstrained()
	 * @see #setConstrained(boolean)
	 * @generated
	 */
	boolean isSetConstrained();

	/**
	 * Returns the value of the '<em><b>Design Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not set, then normal default processing.
	 * 
	 * If set true, then this property is a design time property. This means it will show up in the property sheet, but it won't be able to be connected to at runtime. It may not even be a true bean property but instead the builder will know how to handle it.
	 * 
	 * If set false, then this property will not show up on the property sheet, but will be able to be connected to for runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Time</em>' attribute.
	 * @see #isSetDesignTime()
	 * @see #unsetDesignTime()
	 * @see #setDesignTime(boolean)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_DesignTime()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isDesignTime();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isDesignTime <em>Design Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Time</em>' attribute.
	 * @see #isSetDesignTime()
	 * @see #unsetDesignTime()
	 * @see #isDesignTime()
	 * @generated
	 */
	void setDesignTime(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isDesignTime <em>Design Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesignTime()
	 * @see #isDesignTime()
	 * @see #setDesignTime(boolean)
	 * @generated
	 */
	void unsetDesignTime();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isDesignTime <em>Design Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Design Time</em>' attribute is set.
	 * @see #unsetDesignTime()
	 * @see #isDesignTime()
	 * @see #setDesignTime(boolean)
	 * @generated
	 */
	boolean isSetDesignTime();

	/**
	 * Returns the value of the '<em><b>Always Incompatible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Always Incompatible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set true, then when multiple objects are selected, this property is always incompatible with each other. So in this case the property will not show up on the property sheet if more than one object has been selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Always Incompatible</em>' attribute.
	 * @see #setAlwaysIncompatible(boolean)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_AlwaysIncompatible()
	 * @model
	 * @generated
	 */
	boolean isAlwaysIncompatible();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isAlwaysIncompatible <em>Always Incompatible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Incompatible</em>' attribute.
	 * @see #isAlwaysIncompatible()
	 * @generated
	 */
	void setAlwaysIncompatible(boolean value);

	/**
	 * Returns the value of the '<em><b>Filter Flags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Flags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Flags</em>' attribute list.
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_FilterFlags()
	 * @model type="java.lang.String"
	 * @generated
	 */
	EList getFilterFlags();

	/**
	 * Returns the value of the '<em><b>Field Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this field read-only (i.e. is a "final" field). This is only referenced if the field reference is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Read Only</em>' attribute.
	 * @see #setFieldReadOnly(boolean)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_FieldReadOnly()
	 * @model
	 * @generated
	 */
	boolean isFieldReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#isFieldReadOnly <em>Field Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Read Only</em>' attribute.
	 * @see #isFieldReadOnly()
	 * @generated
	 */
	void setFieldReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Editor Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Editor Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Editor Class</em>' reference.
	 * @see #setPropertyEditorClass(JavaClass)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_PropertyEditorClass()
	 * @model
	 * @generated
	 */
	JavaClass getPropertyEditorClass();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getPropertyEditorClass <em>Property Editor Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Editor Class</em>' reference.
	 * @see #getPropertyEditorClass()
	 * @generated
	 */
	void setPropertyEditorClass(JavaClass value);

	/**
	 * Returns the value of the '<em><b>Read Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Method</em>' reference.
	 * @see #isSetReadMethod()
	 * @see #unsetReadMethod()
	 * @see #setReadMethod(Method)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_ReadMethod()
	 * @model unsettable="true"
	 * @generated
	 */
	Method getReadMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getReadMethod <em>Read Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Method</em>' reference.
	 * @see #isSetReadMethod()
	 * @see #unsetReadMethod()
	 * @see #getReadMethod()
	 * @generated
	 */
	void setReadMethod(Method value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getReadMethod <em>Read Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadMethod()
	 * @see #getReadMethod()
	 * @see #setReadMethod(Method)
	 * @generated
	 */
	void unsetReadMethod();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getReadMethod <em>Read Method</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Method</em>' reference is set.
	 * @see #unsetReadMethod()
	 * @see #getReadMethod()
	 * @see #setReadMethod(Method)
	 * @generated
	 */
	boolean isSetReadMethod();

	/**
	 * Returns the value of the '<em><b>Write Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Method</em>' reference.
	 * @see #isSetWriteMethod()
	 * @see #unsetWriteMethod()
	 * @see #setWriteMethod(Method)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_WriteMethod()
	 * @model unsettable="true"
	 * @generated
	 */
	Method getWriteMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getWriteMethod <em>Write Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Method</em>' reference.
	 * @see #isSetWriteMethod()
	 * @see #unsetWriteMethod()
	 * @see #getWriteMethod()
	 * @generated
	 */
	void setWriteMethod(Method value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getWriteMethod <em>Write Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteMethod()
	 * @see #getWriteMethod()
	 * @see #setWriteMethod(Method)
	 * @generated
	 */
	void unsetWriteMethod();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getWriteMethod <em>Write Method</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Method</em>' reference is set.
	 * @see #unsetWriteMethod()
	 * @see #getWriteMethod()
	 * @see #setWriteMethod(Method)
	 * @generated
	 */
	boolean isSetWriteMethod();

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is set, then this property is a field and not a getter/setter property. This is an extension that the Visual Editor uses to the BeanInfo model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #setField(Field)
	 * @see org.eclipse.jem.internal.beaninfo.BeaninfoPackage#getPropertyDecorator_Field()
	 * @model unsettable="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #isSetField()
	 * @see #unsetField()
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetField()
	 * @see #getField()
	 * @see #setField(Field)
	 * @generated
	 */
	void unsetField();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jem.internal.beaninfo.PropertyDecorator#getField <em>Field</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Field</em>' reference is set.
	 * @see #unsetField()
	 * @see #getField()
	 * @see #setField(Field)
	 * @generated
	 */
	boolean isSetField();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the property type.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClassifier getPropertyType();

	/**
	 * <!-- begin-user-doc -->
	 * This property type is not persisted if this class is serialized into an XMI file. Nor is 
	 * it a property that can be set from an XMI file. It is an operation. It is used by
	 * clients which want a PropertyDecorator that is not part of a BeanInfo model.
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set the property type.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setPropertyType(EClassifier propertyType);

	/**
	 * @return boolean for whether this property is writeable or not
	 * It could have a write method or it could have a field (e.g. java.awt.Insets.top)
	 */
	boolean isWriteable();

	/**
	 * @return boolean for whether this property is readable or not
	 * It could have a read method or it could have a field (e.g. java.awt.Insets.top)
	 */
	boolean isReadable();

}
