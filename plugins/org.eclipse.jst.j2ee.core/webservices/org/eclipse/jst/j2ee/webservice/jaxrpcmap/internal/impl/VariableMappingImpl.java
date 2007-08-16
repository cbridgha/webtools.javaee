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
package org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jst.j2ee.common.internal.impl.J2EEEObjectImpl;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.VariableMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#getJavaVariableName <em>Java Variable Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#getXmlElementName <em>Xml Element Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#isDataMember <em>Data Member</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#getXmlAttributeName <em>Xml Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.VariableMappingImpl#isXmlWildcard <em>Xml Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableMappingImpl extends J2EEEObjectImpl implements VariableMapping
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaVariableName() <em>Java Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getJavaVariableName()
	 * @generated
	 * @ordered
	 */
  protected static final String JAVA_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaVariableName() <em>Java Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getJavaVariableName()
	 * @generated
	 * @ordered
	 */
  protected String javaVariableName = JAVA_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlElementName() <em>Xml Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXmlElementName()
	 * @generated
	 * @ordered
	 */
  protected static final String XML_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlElementName() <em>Xml Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXmlElementName()
	 * @generated
	 * @ordered
	 */
  protected String xmlElementName = XML_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDataMember() <em>Data Member</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isDataMember()
	 * @generated
	 * @ordered
	 */
  protected static final boolean DATA_MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataMember() <em>Data Member</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isDataMember()
	 * @generated
	 * @ordered
	 */
  protected boolean dataMember = DATA_MEMBER_EDEFAULT;

	/**
	 * This is true if the Data Member attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean dataMemberESet = false;

	/**
	 * The default value of the '{@link #getXmlAttributeName() <em>Xml Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXmlAttributeName()
	 * @generated
	 * @ordered
	 */
  protected static final String XML_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlAttributeName() <em>Xml Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXmlAttributeName()
	 * @generated
	 * @ordered
	 */
  protected String xmlAttributeName = XML_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isXmlWildcard() <em>Xml Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isXmlWildcard()
	 * @generated
	 * @ordered
	 */
  protected static final boolean XML_WILDCARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXmlWildcard() <em>Xml Wildcard</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isXmlWildcard()
	 * @generated
	 * @ordered
	 */
  protected boolean xmlWildcard = XML_WILDCARD_EDEFAULT;

	/**
	 * This is true if the Xml Wildcard attribute has been set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean xmlWildcardESet = false;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClass eStaticClass() {
		return JaxrpcmapPackage.Literals.VARIABLE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getJavaVariableName() {
		return javaVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setJavaVariableName(String newJavaVariableName) {
		String oldJavaVariableName = javaVariableName;
		javaVariableName = newJavaVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__JAVA_VARIABLE_NAME, oldJavaVariableName, javaVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getXmlElementName() {
		return xmlElementName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXmlElementName(String newXmlElementName) {
		String oldXmlElementName = xmlElementName;
		xmlElementName = newXmlElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__XML_ELEMENT_NAME, oldXmlElementName, xmlElementName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isDataMember() {
		return dataMember;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataMember(boolean newDataMember) {
		boolean oldDataMember = dataMember;
		dataMember = newDataMember;
		boolean oldDataMemberESet = dataMemberESet;
		dataMemberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER, oldDataMember, dataMember, !oldDataMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetDataMember() {
		boolean oldDataMember = dataMember;
		boolean oldDataMemberESet = dataMemberESet;
		dataMember = DATA_MEMBER_EDEFAULT;
		dataMemberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER, oldDataMember, DATA_MEMBER_EDEFAULT, oldDataMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetDataMember() {
		return dataMemberESet;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getXmlAttributeName() {
		return xmlAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXmlAttributeName(String newXmlAttributeName) {
		String oldXmlAttributeName = xmlAttributeName;
		xmlAttributeName = newXmlAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__XML_ATTRIBUTE_NAME, oldXmlAttributeName, xmlAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isXmlWildcard() {
		return xmlWildcard;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXmlWildcard(boolean newXmlWildcard) {
		boolean oldXmlWildcard = xmlWildcard;
		xmlWildcard = newXmlWildcard;
		boolean oldXmlWildcardESet = xmlWildcardESet;
		xmlWildcardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD, oldXmlWildcard, xmlWildcard, !oldXmlWildcardESet));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetXmlWildcard() {
		boolean oldXmlWildcard = xmlWildcard;
		boolean oldXmlWildcardESet = xmlWildcardESet;
		xmlWildcard = XML_WILDCARD_EDEFAULT;
		xmlWildcardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD, oldXmlWildcard, XML_WILDCARD_EDEFAULT, oldXmlWildcardESet));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetXmlWildcard() {
		return xmlWildcardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JaxrpcmapPackage.VARIABLE_MAPPING__ID:
				return getId();
			case JaxrpcmapPackage.VARIABLE_MAPPING__JAVA_VARIABLE_NAME:
				return getJavaVariableName();
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ELEMENT_NAME:
				return getXmlElementName();
			case JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER:
				return isDataMember() ? Boolean.TRUE : Boolean.FALSE;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ATTRIBUTE_NAME:
				return getXmlAttributeName();
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD:
				return isXmlWildcard() ? Boolean.TRUE : Boolean.FALSE;
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
			case JaxrpcmapPackage.VARIABLE_MAPPING__ID:
				setId((String)newValue);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__JAVA_VARIABLE_NAME:
				setJavaVariableName((String)newValue);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ELEMENT_NAME:
				setXmlElementName((String)newValue);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER:
				setDataMember(((Boolean)newValue).booleanValue());
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ATTRIBUTE_NAME:
				setXmlAttributeName((String)newValue);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD:
				setXmlWildcard(((Boolean)newValue).booleanValue());
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
			case JaxrpcmapPackage.VARIABLE_MAPPING__ID:
				setId(ID_EDEFAULT);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__JAVA_VARIABLE_NAME:
				setJavaVariableName(JAVA_VARIABLE_NAME_EDEFAULT);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ELEMENT_NAME:
				setXmlElementName(XML_ELEMENT_NAME_EDEFAULT);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER:
				unsetDataMember();
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ATTRIBUTE_NAME:
				setXmlAttributeName(XML_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD:
				unsetXmlWildcard();
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
			case JaxrpcmapPackage.VARIABLE_MAPPING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JaxrpcmapPackage.VARIABLE_MAPPING__JAVA_VARIABLE_NAME:
				return JAVA_VARIABLE_NAME_EDEFAULT == null ? javaVariableName != null : !JAVA_VARIABLE_NAME_EDEFAULT.equals(javaVariableName);
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ELEMENT_NAME:
				return XML_ELEMENT_NAME_EDEFAULT == null ? xmlElementName != null : !XML_ELEMENT_NAME_EDEFAULT.equals(xmlElementName);
			case JaxrpcmapPackage.VARIABLE_MAPPING__DATA_MEMBER:
				return isSetDataMember();
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_ATTRIBUTE_NAME:
				return XML_ATTRIBUTE_NAME_EDEFAULT == null ? xmlAttributeName != null : !XML_ATTRIBUTE_NAME_EDEFAULT.equals(xmlAttributeName);
			case JaxrpcmapPackage.VARIABLE_MAPPING__XML_WILDCARD:
				return isSetXmlWildcard();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", javaVariableName: ");
		result.append(javaVariableName);
		result.append(", xmlElementName: ");
		result.append(xmlElementName);
		result.append(", dataMember: ");
		if (dataMemberESet) result.append(dataMember); else result.append("<unset>");
		result.append(", xmlAttributeName: ");
		result.append(xmlAttributeName);
		result.append(", xmlWildcard: ");
		if (xmlWildcardESet) result.append(xmlWildcard); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VariableMappingImpl
