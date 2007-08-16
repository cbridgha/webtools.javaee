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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jst.j2ee.common.internal.impl.J2EEEObjectImpl;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ExceptionMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.InterfaceMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaWSDLMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaXMLTypeMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.PackageMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java WSDL Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.JavaWSDLMappingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.JavaWSDLMappingImpl#getPackageMappings <em>Package Mappings</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.JavaWSDLMappingImpl#getJavaXMLTypeMappings <em>Java XML Type Mappings</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.JavaWSDLMappingImpl#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.impl.JavaWSDLMappingImpl#getInterfaceMappings <em>Interface Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaWSDLMappingImpl extends J2EEEObjectImpl implements JavaWSDLMapping
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
	 * The cached value of the '{@link #getPackageMappings() <em>Package Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPackageMappings()
	 * @generated
	 * @ordered
	 */
  protected EList packageMappings = null;

	/**
	 * The cached value of the '{@link #getJavaXMLTypeMappings() <em>Java XML Type Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getJavaXMLTypeMappings()
	 * @generated
	 * @ordered
	 */
  protected EList javaXMLTypeMappings = null;

	/**
	 * The cached value of the '{@link #getExceptionMappings() <em>Exception Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExceptionMappings()
	 * @generated
	 * @ordered
	 */
  protected EList exceptionMappings = null;

	/**
	 * The cached value of the '{@link #getInterfaceMappings() <em>Interface Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInterfaceMappings()
	 * @generated
	 * @ordered
	 */
  protected EList interfaceMappings = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected JavaWSDLMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClass eStaticClass() {
		return JaxrpcmapPackage.Literals.JAVA_WSDL_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JaxrpcmapPackage.JAVA_WSDL_MAPPING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList getPackageMappings() {
		if (packageMappings == null) {
			packageMappings = new EObjectContainmentEList(PackageMapping.class, this, JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS);
		}
		return packageMappings;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList getJavaXMLTypeMappings() {
		if (javaXMLTypeMappings == null) {
			javaXMLTypeMappings = new EObjectContainmentEList(JavaXMLTypeMapping.class, this, JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS);
		}
		return javaXMLTypeMappings;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList getExceptionMappings() {
		if (exceptionMappings == null) {
			exceptionMappings = new EObjectContainmentEList(ExceptionMapping.class, this, JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS);
		}
		return exceptionMappings;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList getInterfaceMappings() {
		if (interfaceMappings == null) {
			interfaceMappings = new EObjectContainmentEList(InterfaceMapping.class, this, JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS);
		}
		return interfaceMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS:
				return ((InternalEList)getPackageMappings()).basicRemove(otherEnd, msgs);
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS:
				return ((InternalEList)getJavaXMLTypeMappings()).basicRemove(otherEnd, msgs);
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS:
				return ((InternalEList)getExceptionMappings()).basicRemove(otherEnd, msgs);
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS:
				return ((InternalEList)getInterfaceMappings()).basicRemove(otherEnd, msgs);
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
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__ID:
				return getId();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS:
				return getPackageMappings();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS:
				return getJavaXMLTypeMappings();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS:
				return getExceptionMappings();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS:
				return getInterfaceMappings();
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
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__ID:
				setId((String)newValue);
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS:
				getPackageMappings().clear();
				getPackageMappings().addAll((Collection)newValue);
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS:
				getJavaXMLTypeMappings().clear();
				getJavaXMLTypeMappings().addAll((Collection)newValue);
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS:
				getExceptionMappings().clear();
				getExceptionMappings().addAll((Collection)newValue);
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS:
				getInterfaceMappings().clear();
				getInterfaceMappings().addAll((Collection)newValue);
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
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__ID:
				setId(ID_EDEFAULT);
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS:
				getPackageMappings().clear();
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS:
				getJavaXMLTypeMappings().clear();
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS:
				getExceptionMappings().clear();
				return;
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS:
				getInterfaceMappings().clear();
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
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__PACKAGE_MAPPINGS:
				return packageMappings != null && !packageMappings.isEmpty();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__JAVA_XML_TYPE_MAPPINGS:
				return javaXMLTypeMappings != null && !javaXMLTypeMappings.isEmpty();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__EXCEPTION_MAPPINGS:
				return exceptionMappings != null && !exceptionMappings.isEmpty();
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING__INTERFACE_MAPPINGS:
				return interfaceMappings != null && !interfaceMappings.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //JavaWSDLMappingImpl
