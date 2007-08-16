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
package org.eclipse.jst.j2ee.taglib.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jem.java.JavaClass;
import org.eclipse.jst.j2ee.common.internal.impl.DescriptionGroupImpl;
import org.eclipse.jst.j2ee.taglib.internal.BodyContentType;
import org.eclipse.jst.j2ee.taglib.internal.JSPTag;
import org.eclipse.jst.j2ee.taglib.internal.JSPTagAttribute;
import org.eclipse.jst.j2ee.taglib.internal.JSPVariable;
import org.eclipse.jst.j2ee.taglib.internal.TaglibPackage;


/**
 * The tag element defines an action in this tag library. The tag element has one attribute, id.
 * The tag element may have several subelements defining:
 * name -- The unique action name
 * tag-class -- The tag handler class implementing javax.servlet.jsp.tagext.Tag
 * tei-class -- An optional subclass of javax.servlet.jsp.tagext.TagExtraInfo
 * body-content -- The body content type
 * display-name -- A short name that is intended to be displayed by tools
 * small-icon -- Optional small-icon that can be used by tools
 * large-icon -- Optional large-icon that can be used by tools
 * description -- Optional tag-specific information
 * variable -- Optional scripting variable information
 * attribute -- All attributes of this action
 * example -- Optional informal description of an example of a use of this action.

 */
public class JSPTagImpl extends DescriptionGroupImpl implements JSPTag {

	/**
	 * The default value of the '{@link #getBodyContent() <em>Body Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyContent()
	 * @generated
	 * @ordered
	 */
	protected static final BodyContentType BODY_CONTENT_EDEFAULT = BodyContentType.TAGDEPENDENT_LITERAL;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected BodyContentType bodyContent = BODY_CONTENT_EDEFAULT;
	/**
	 * This is true if the Body Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bodyContentESet = false;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String example = EXAMPLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicAttributes() <em>Dynamic Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_ATTRIBUTES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicAttributes() <em>Dynamic Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicAttributes()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicAttributes = DYNAMIC_ATTRIBUTES_EDEFAULT;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected EList attributes = null;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected EList variables = null;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected JavaClass tagClass = null;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected JavaClass teiClass = null;
	public JSPTagImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TaglibPackage.Literals.JSP_TAG;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * Provides a hint as to the content of the body of this tag. Primarily intended
	 * for use by page composition tools.There are currently three values specified:
	 * 
	 * tagdependent - The body of the tag is interpreted by the tag implementation
	 * itself, and is most likely in a		different "langage", e.g embedded SQL
	 * statements.
	 * 
	 * JSP - The body of the tag contains nested JSP syntax
	 * 
	 * empty - The body must be emptyThe default (if not defined) is JSP#PCDATA ::= 
	 * tagdependent | JSP | empty
	 */
	public BodyContentType getBodyContent() {
		return bodyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyContent(BodyContentType newBodyContent) {
		BodyContentType oldBodyContent = bodyContent;
		bodyContent = newBodyContent == null ? BODY_CONTENT_EDEFAULT : newBodyContent;
		boolean oldBodyContentESet = bodyContentESet;
		bodyContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__BODY_CONTENT, oldBodyContent, bodyContent, !oldBodyContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBodyContent() {
		BodyContentType oldBodyContent = bodyContent;
		boolean oldBodyContentESet = bodyContentESet;
		bodyContent = BODY_CONTENT_EDEFAULT;
		bodyContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TaglibPackage.JSP_TAG__BODY_CONTENT, oldBodyContent, BODY_CONTENT_EDEFAULT, oldBodyContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBodyContent() {
		return bodyContentESet;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The example element provides an informal description of an example of the use
	 * of a tag.
	 */
	public String getExample() {
		return example;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicAttributes() {
		return dynamicAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicAttributes(boolean newDynamicAttributes) {
		boolean oldDynamicAttributes = dynamicAttributes;
		dynamicAttributes = newDynamicAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__DYNAMIC_ATTRIBUTES, oldDynamicAttributes, dynamicAttributes));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public EList getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList(JSPTagAttribute.class, this, TaglibPackage.JSP_TAG__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The variable element provides information on the scripting variables defined by 
	 * this tag.
	 * It is a (translation time) error for an action that has one or more variable
	 * subelements to have a TagExtraInfo class that returns a non-null object.
	 * The subelements of variable are of the form:
	 * name-given -- The variable name as a constant
	 * name-from-attribute -- The name of an attribute whose (translation time) value
	 * will give the name of the variable. One of name-given or namefrom-attribute is
	 * required.
	 * variable-class -- Name of the class of the variable. java.lang.String is
	 * default.
	 * declare -- Whether the variable is declared or not. True is the default.
	 * scope -- The scope of the scripting variable defined. NESTED is default.

	 */
	public EList getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList(JSPVariable.class, this, TaglibPackage.JSP_TAG__VARIABLES);
		}
		return variables;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The tag-class element indicates the subclass of javax.serlvet.jsp.tagext.Tag
	 * that implements the request time semantics for this tag. This element is
	 * required.
	 * @regexp fully qualified Java class name

	 */
	public JavaClass getTagClass() {
		if (tagClass != null && tagClass.eIsProxy()) {
			InternalEObject oldTagClass = (InternalEObject)tagClass;
			tagClass = (JavaClass)eResolveProxy(oldTagClass);
			if (tagClass != oldTagClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaglibPackage.JSP_TAG__TAG_CLASS, oldTagClass, tagClass));
			}
		}
		return tagClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass basicGetTagClass() {
		return tagClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setTagClass(JavaClass newTagClass) {
		JavaClass oldTagClass = tagClass;
		tagClass = newTagClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__TAG_CLASS, oldTagClass, tagClass));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The tei-class element indicates the subclass of
	 * javax.servlet.jsp.tagext.TagExtraInfo for this tag. The class is instantiated
	 * at translation time. This element is optional.
	 * @regexp fully qualified Java class name
	 */
	public JavaClass getTeiClass() {
		if (teiClass != null && teiClass.eIsProxy()) {
			InternalEObject oldTeiClass = (InternalEObject)teiClass;
			teiClass = (JavaClass)eResolveProxy(oldTeiClass);
			if (teiClass != oldTeiClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaglibPackage.JSP_TAG__TEI_CLASS, oldTeiClass, teiClass));
			}
		}
		return teiClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass basicGetTeiClass() {
		return teiClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setTeiClass(JavaClass newTeiClass) {
		JavaClass oldTeiClass = teiClass;
		teiClass = newTeiClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.JSP_TAG__TEI_CLASS, oldTeiClass, teiClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaglibPackage.JSP_TAG__ATTRIBUTES:
				return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
			case TaglibPackage.JSP_TAG__VARIABLES:
				return ((InternalEList)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaglibPackage.JSP_TAG__BODY_CONTENT:
				return getBodyContent();
			case TaglibPackage.JSP_TAG__EXAMPLE:
				return getExample();
			case TaglibPackage.JSP_TAG__NAME:
				return getName();
			case TaglibPackage.JSP_TAG__DYNAMIC_ATTRIBUTES:
				return isDynamicAttributes() ? Boolean.TRUE : Boolean.FALSE;
			case TaglibPackage.JSP_TAG__ATTRIBUTES:
				return getAttributes();
			case TaglibPackage.JSP_TAG__VARIABLES:
				return getVariables();
			case TaglibPackage.JSP_TAG__TAG_CLASS:
				if (resolve) return getTagClass();
				return basicGetTagClass();
			case TaglibPackage.JSP_TAG__TEI_CLASS:
				if (resolve) return getTeiClass();
				return basicGetTeiClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaglibPackage.JSP_TAG__BODY_CONTENT:
				setBodyContent((BodyContentType)newValue);
				return;
			case TaglibPackage.JSP_TAG__EXAMPLE:
				setExample((String)newValue);
				return;
			case TaglibPackage.JSP_TAG__NAME:
				setName((String)newValue);
				return;
			case TaglibPackage.JSP_TAG__DYNAMIC_ATTRIBUTES:
				setDynamicAttributes(((Boolean)newValue).booleanValue());
				return;
			case TaglibPackage.JSP_TAG__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case TaglibPackage.JSP_TAG__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection)newValue);
				return;
			case TaglibPackage.JSP_TAG__TAG_CLASS:
				setTagClass((JavaClass)newValue);
				return;
			case TaglibPackage.JSP_TAG__TEI_CLASS:
				setTeiClass((JavaClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaglibPackage.JSP_TAG__BODY_CONTENT:
				unsetBodyContent();
				return;
			case TaglibPackage.JSP_TAG__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case TaglibPackage.JSP_TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaglibPackage.JSP_TAG__DYNAMIC_ATTRIBUTES:
				setDynamicAttributes(DYNAMIC_ATTRIBUTES_EDEFAULT);
				return;
			case TaglibPackage.JSP_TAG__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TaglibPackage.JSP_TAG__VARIABLES:
				getVariables().clear();
				return;
			case TaglibPackage.JSP_TAG__TAG_CLASS:
				setTagClass((JavaClass)null);
				return;
			case TaglibPackage.JSP_TAG__TEI_CLASS:
				setTeiClass((JavaClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaglibPackage.JSP_TAG__BODY_CONTENT:
				return isSetBodyContent();
			case TaglibPackage.JSP_TAG__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case TaglibPackage.JSP_TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaglibPackage.JSP_TAG__DYNAMIC_ATTRIBUTES:
				return dynamicAttributes != DYNAMIC_ATTRIBUTES_EDEFAULT;
			case TaglibPackage.JSP_TAG__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TaglibPackage.JSP_TAG__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TaglibPackage.JSP_TAG__TAG_CLASS:
				return tagClass != null;
			case TaglibPackage.JSP_TAG__TEI_CLASS:
				return teiClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bodyContent: ");
		if (bodyContentESet) result.append(bodyContent); else result.append("<unset>");
		result.append(", example: ");
		result.append(example);
		result.append(", name: ");
		result.append(name);
		result.append(", dynamicAttributes: ");
		result.append(dynamicAttributes);
		result.append(')');
		return result.toString();
	}

}














