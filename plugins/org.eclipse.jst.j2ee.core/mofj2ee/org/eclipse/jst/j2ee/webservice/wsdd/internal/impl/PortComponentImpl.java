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
package org.eclipse.jst.j2ee.webservice.wsdd.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jst.j2ee.common.IconType;
import org.eclipse.jst.j2ee.common.internal.impl.J2EEEObjectImpl;
import org.eclipse.jst.j2ee.webservice.wscommon.DescriptionType;
import org.eclipse.jst.j2ee.webservice.wscommon.DisplayNameType;
import org.eclipse.jst.j2ee.webservice.wsdd.Handler;
import org.eclipse.jst.j2ee.webservice.wsdd.PortComponent;
import org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean;
import org.eclipse.jst.j2ee.webservice.wsdd.WSDLPort;
import org.eclipse.jst.j2ee.webservice.wsdd.WsddPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getPortComponentName <em>Port Component Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getServiceEndpointInterface <em>Service Endpoint Interface</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getWsdlPort <em>Wsdl Port</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getServiceImplBean <em>Service Impl Bean</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getDescriptionType <em>Description Type</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getDisplayNameType <em>Display Name Type</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl#getIconType <em>Icon Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortComponentImpl extends J2EEEObjectImpl implements PortComponent
{
	/**
	 * The default value of the '{@link #getPortComponentName() <em>Port Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPortComponentName()
	 * @generated
	 * @ordered
	 */
  protected static final String PORT_COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortComponentName() <em>Port Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPortComponentName()
	 * @generated
	 * @ordered
	 */
  protected String portComponentName = PORT_COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceEndpointInterface() <em>Service Endpoint Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceEndpointInterface()
	 * @generated
	 * @ordered
	 */
  protected static final String SERVICE_ENDPOINT_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceEndpointInterface() <em>Service Endpoint Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceEndpointInterface()
	 * @generated
	 * @ordered
	 */
  protected String serviceEndpointInterface = SERVICE_ENDPOINT_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallIcon() <em>Small Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSmallIcon()
	 * @generated
	 * @ordered
	 */
  protected static final String SMALL_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmallIcon() <em>Small Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSmallIcon()
	 * @generated
	 * @ordered
	 */
  protected String smallIcon = SMALL_ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeIcon() <em>Large Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLargeIcon()
	 * @generated
	 * @ordered
	 */
  protected static final String LARGE_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargeIcon() <em>Large Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLargeIcon()
	 * @generated
	 * @ordered
	 */
  protected String largeIcon = LARGE_ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
  protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
  protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWsdlPort() <em>Wsdl Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWsdlPort()
	 * @generated
	 * @ordered
	 */
  protected WSDLPort wsdlPort = null;

	/**
	 * The cached value of the '{@link #getServiceImplBean() <em>Service Impl Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServiceImplBean()
	 * @generated
	 * @ordered
	 */
  protected ServiceImplBean serviceImplBean = null;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
  protected EList handlers = null;

	/**
	 * The cached value of the '{@link #getDescriptionType() <em>Description Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescriptionType()
	 * @generated
	 * @ordered
	 */
  protected DescriptionType descriptionType = null;

	/**
	 * The cached value of the '{@link #getDisplayNameType() <em>Display Name Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDisplayNameType()
	 * @generated
	 * @ordered
	 */
  protected DisplayNameType displayNameType = null;

	/**
	 * The cached value of the '{@link #getIconType() <em>Icon Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIconType()
	 * @generated
	 * @ordered
	 */
  protected IconType iconType = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PortComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClass eStaticClass() {
		return WsddPackage.Literals.PORT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPortComponentName() {
		return portComponentName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPortComponentName(String newPortComponentName) {
		String oldPortComponentName = portComponentName;
		portComponentName = newPortComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__PORT_COMPONENT_NAME, oldPortComponentName, portComponentName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getServiceEndpointInterface() {
		return serviceEndpointInterface;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setServiceEndpointInterface(String newServiceEndpointInterface) {
		String oldServiceEndpointInterface = serviceEndpointInterface;
		serviceEndpointInterface = newServiceEndpointInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE, oldServiceEndpointInterface, serviceEndpointInterface));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSmallIcon() {
		return smallIcon;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSmallIcon(String newSmallIcon) {
		String oldSmallIcon = smallIcon;
		smallIcon = newSmallIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__SMALL_ICON, oldSmallIcon, smallIcon));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLargeIcon() {
		return largeIcon;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLargeIcon(String newLargeIcon) {
		String oldLargeIcon = largeIcon;
		largeIcon = newLargeIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__LARGE_ICON, oldLargeIcon, largeIcon));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLPort getWsdlPort() {
		return wsdlPort;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWsdlPort(WSDLPort newWsdlPort, NotificationChain msgs) {
		WSDLPort oldWsdlPort = wsdlPort;
		wsdlPort = newWsdlPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__WSDL_PORT, oldWsdlPort, newWsdlPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWsdlPort(WSDLPort newWsdlPort) {
		if (newWsdlPort != wsdlPort) {
			NotificationChain msgs = null;
			if (wsdlPort != null)
				msgs = ((InternalEObject)wsdlPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__WSDL_PORT, null, msgs);
			if (newWsdlPort != null)
				msgs = ((InternalEObject)newWsdlPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__WSDL_PORT, null, msgs);
			msgs = basicSetWsdlPort(newWsdlPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__WSDL_PORT, newWsdlPort, newWsdlPort));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceImplBean getServiceImplBean() {
		return serviceImplBean;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetServiceImplBean(ServiceImplBean newServiceImplBean, NotificationChain msgs) {
		ServiceImplBean oldServiceImplBean = serviceImplBean;
		serviceImplBean = newServiceImplBean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN, oldServiceImplBean, newServiceImplBean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setServiceImplBean(ServiceImplBean newServiceImplBean) {
		if (newServiceImplBean != serviceImplBean) {
			NotificationChain msgs = null;
			if (serviceImplBean != null)
				msgs = ((InternalEObject)serviceImplBean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN, null, msgs);
			if (newServiceImplBean != null)
				msgs = ((InternalEObject)newServiceImplBean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN, null, msgs);
			msgs = basicSetServiceImplBean(newServiceImplBean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN, newServiceImplBean, newServiceImplBean));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList(Handler.class, this, WsddPackage.PORT_COMPONENT__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DescriptionType getDescriptionType() {
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDescriptionType(DescriptionType newDescriptionType, NotificationChain msgs) {
		DescriptionType oldDescriptionType = descriptionType;
		descriptionType = newDescriptionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE, oldDescriptionType, newDescriptionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescriptionType(DescriptionType newDescriptionType) {
		if (newDescriptionType != descriptionType) {
			NotificationChain msgs = null;
			if (descriptionType != null)
				msgs = ((InternalEObject)descriptionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE, null, msgs);
			if (newDescriptionType != null)
				msgs = ((InternalEObject)newDescriptionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE, null, msgs);
			msgs = basicSetDescriptionType(newDescriptionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE, newDescriptionType, newDescriptionType));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplayNameType getDisplayNameType() {
		return displayNameType;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDisplayNameType(DisplayNameType newDisplayNameType, NotificationChain msgs) {
		DisplayNameType oldDisplayNameType = displayNameType;
		displayNameType = newDisplayNameType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE, oldDisplayNameType, newDisplayNameType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDisplayNameType(DisplayNameType newDisplayNameType) {
		if (newDisplayNameType != displayNameType) {
			NotificationChain msgs = null;
			if (displayNameType != null)
				msgs = ((InternalEObject)displayNameType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE, null, msgs);
			if (newDisplayNameType != null)
				msgs = ((InternalEObject)newDisplayNameType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE, null, msgs);
			msgs = basicSetDisplayNameType(newDisplayNameType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE, newDisplayNameType, newDisplayNameType));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IconType getIconType() {
		return iconType;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIconType(IconType newIconType, NotificationChain msgs) {
		IconType oldIconType = iconType;
		iconType = newIconType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__ICON_TYPE, oldIconType, newIconType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIconType(IconType newIconType) {
		if (newIconType != iconType) {
			NotificationChain msgs = null;
			if (iconType != null)
				msgs = ((InternalEObject)iconType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__ICON_TYPE, null, msgs);
			if (newIconType != null)
				msgs = ((InternalEObject)newIconType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WsddPackage.PORT_COMPONENT__ICON_TYPE, null, msgs);
			msgs = basicSetIconType(newIconType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WsddPackage.PORT_COMPONENT__ICON_TYPE, newIconType, newIconType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WsddPackage.PORT_COMPONENT__WSDL_PORT:
				return basicSetWsdlPort(null, msgs);
			case WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN:
				return basicSetServiceImplBean(null, msgs);
			case WsddPackage.PORT_COMPONENT__HANDLERS:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE:
				return basicSetDescriptionType(null, msgs);
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE:
				return basicSetDisplayNameType(null, msgs);
			case WsddPackage.PORT_COMPONENT__ICON_TYPE:
				return basicSetIconType(null, msgs);
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
			case WsddPackage.PORT_COMPONENT__PORT_COMPONENT_NAME:
				return getPortComponentName();
			case WsddPackage.PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE:
				return getServiceEndpointInterface();
			case WsddPackage.PORT_COMPONENT__SMALL_ICON:
				return getSmallIcon();
			case WsddPackage.PORT_COMPONENT__LARGE_ICON:
				return getLargeIcon();
			case WsddPackage.PORT_COMPONENT__DESCRIPTION:
				return getDescription();
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME:
				return getDisplayName();
			case WsddPackage.PORT_COMPONENT__WSDL_PORT:
				return getWsdlPort();
			case WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN:
				return getServiceImplBean();
			case WsddPackage.PORT_COMPONENT__HANDLERS:
				return getHandlers();
			case WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE:
				return getDescriptionType();
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE:
				return getDisplayNameType();
			case WsddPackage.PORT_COMPONENT__ICON_TYPE:
				return getIconType();
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
			case WsddPackage.PORT_COMPONENT__PORT_COMPONENT_NAME:
				setPortComponentName((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__SMALL_ICON:
				setSmallIcon((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__LARGE_ICON:
				setLargeIcon((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__WSDL_PORT:
				setWsdlPort((WSDLPort)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN:
				setServiceImplBean((ServiceImplBean)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE:
				setDescriptionType((DescriptionType)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE:
				setDisplayNameType((DisplayNameType)newValue);
				return;
			case WsddPackage.PORT_COMPONENT__ICON_TYPE:
				setIconType((IconType)newValue);
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
			case WsddPackage.PORT_COMPONENT__PORT_COMPONENT_NAME:
				setPortComponentName(PORT_COMPONENT_NAME_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE:
				setServiceEndpointInterface(SERVICE_ENDPOINT_INTERFACE_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__SMALL_ICON:
				setSmallIcon(SMALL_ICON_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__LARGE_ICON:
				setLargeIcon(LARGE_ICON_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case WsddPackage.PORT_COMPONENT__WSDL_PORT:
				setWsdlPort((WSDLPort)null);
				return;
			case WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN:
				setServiceImplBean((ServiceImplBean)null);
				return;
			case WsddPackage.PORT_COMPONENT__HANDLERS:
				getHandlers().clear();
				return;
			case WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE:
				setDescriptionType((DescriptionType)null);
				return;
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE:
				setDisplayNameType((DisplayNameType)null);
				return;
			case WsddPackage.PORT_COMPONENT__ICON_TYPE:
				setIconType((IconType)null);
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
			case WsddPackage.PORT_COMPONENT__PORT_COMPONENT_NAME:
				return PORT_COMPONENT_NAME_EDEFAULT == null ? portComponentName != null : !PORT_COMPONENT_NAME_EDEFAULT.equals(portComponentName);
			case WsddPackage.PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE:
				return SERVICE_ENDPOINT_INTERFACE_EDEFAULT == null ? serviceEndpointInterface != null : !SERVICE_ENDPOINT_INTERFACE_EDEFAULT.equals(serviceEndpointInterface);
			case WsddPackage.PORT_COMPONENT__SMALL_ICON:
				return SMALL_ICON_EDEFAULT == null ? smallIcon != null : !SMALL_ICON_EDEFAULT.equals(smallIcon);
			case WsddPackage.PORT_COMPONENT__LARGE_ICON:
				return LARGE_ICON_EDEFAULT == null ? largeIcon != null : !LARGE_ICON_EDEFAULT.equals(largeIcon);
			case WsddPackage.PORT_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case WsddPackage.PORT_COMPONENT__WSDL_PORT:
				return wsdlPort != null;
			case WsddPackage.PORT_COMPONENT__SERVICE_IMPL_BEAN:
				return serviceImplBean != null;
			case WsddPackage.PORT_COMPONENT__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case WsddPackage.PORT_COMPONENT__DESCRIPTION_TYPE:
				return descriptionType != null;
			case WsddPackage.PORT_COMPONENT__DISPLAY_NAME_TYPE:
				return displayNameType != null;
			case WsddPackage.PORT_COMPONENT__ICON_TYPE:
				return iconType != null;
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
		result.append(" (portComponentName: ");
		result.append(portComponentName);
		result.append(", serviceEndpointInterface: ");
		result.append(serviceEndpointInterface);
		result.append(", smallIcon: ");
		result.append(smallIcon);
		result.append(", largeIcon: ");
		result.append(largeIcon);
		result.append(", description: ");
		result.append(description);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //PortComponentImpl
