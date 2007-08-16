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
package org.eclipse.jst.j2ee.webservice.wsdd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jst.j2ee.common.CommonPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * /**
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under development and expected to
 * change significantly before reaching stability. It is being made available at this early stage to solicit feedback
 * from pioneering adopters on the understanding that any code that uses this API will almost certainly be broken
 * (repeatedly) as the API evolves.
 * </p>
 *
 *
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.j2ee.webservice.wsdd.WsddFactory
 * @model kind="package"
 * @generated
 */
public interface WsddPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "wsdd";//$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "wsdd.xmi";//$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "org.eclipse.jst.j2ee.webservice.wsdd";//$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  WsddPackage eINSTANCE = org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServicesImpl <em>Web Services</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServicesImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWebServices()
	 * @generated
	 */
  int WEB_SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__ICONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__ICONS;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__DISPLAY_NAMES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__DESCRIPTIONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__SMALL_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__LARGE_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__DESCRIPTION = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__DISPLAY_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Web Service Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES__WEB_SERVICE_DESCRIPTIONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Services</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICES_FEATURE_COUNT = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServiceDescriptionImpl <em>Web Service Description</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServiceDescriptionImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWebServiceDescription()
	 * @generated
	 */
  int WEB_SERVICE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__JAXRPC_MAPPING_FILE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Web Service Description Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__WEB_SERVICE_DESCRIPTION_NAME = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__WSDL_FILE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__SMALL_ICON = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__LARGE_ICON = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__DESCRIPTION = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__DISPLAY_NAME = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__PORT_COMPONENTS = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__DESCRIPTION_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Display Name Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__DISPLAY_NAME_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Icon Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION__ICON_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Web Service Description</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WEB_SERVICE_DESCRIPTION_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl <em>Port Component</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getPortComponent()
	 * @generated
	 */
  int PORT_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Port Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__PORT_COMPONENT_NAME = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__SMALL_ICON = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__LARGE_ICON = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__DESCRIPTION = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__DISPLAY_NAME = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Wsdl Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__WSDL_PORT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Impl Bean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__SERVICE_IMPL_BEAN = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__HANDLERS = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__DESCRIPTION_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Name Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__DISPLAY_NAME_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Icon Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT__ICON_TYPE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Port Component</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PORT_COMPONENT_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WSDLPortImpl <em>WSDL Port</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WSDLPortImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWSDLPort()
	 * @generated
	 */
  int WSDL_PORT = 3;

	/**
	 * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WSDL_PORT__NAMESPACE_URI = CommonPackage.QNAME__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Local Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WSDL_PORT__LOCAL_PART = CommonPackage.QNAME__LOCAL_PART;

	/**
	 * The feature id for the '<em><b>Combined QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WSDL_PORT__COMBINED_QNAME = CommonPackage.QNAME__COMBINED_QNAME;

	/**
	 * The feature id for the '<em><b>Internal Prefix Or Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WSDL_PORT__INTERNAL_PREFIX_OR_NS_URI = CommonPackage.QNAME__INTERNAL_PREFIX_OR_NS_URI;

	/**
	 * The number of structural features of the '<em>WSDL Port</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WSDL_PORT_FEATURE_COUNT = CommonPackage.QNAME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServiceImplBeanImpl <em>Service Impl Bean</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServiceImplBeanImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getServiceImplBean()
	 * @generated
	 */
  int SERVICE_IMPL_BEAN = 4;

	/**
	 * The feature id for the '<em><b>EEJB Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVICE_IMPL_BEAN__EEJB_LINK = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EServlet Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVICE_IMPL_BEAN__ESERVLET_LINK = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bean Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVICE_IMPL_BEAN__BEAN_LINK = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Impl Bean</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVICE_IMPL_BEAN_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.BeanLinkImpl <em>Bean Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.BeanLinkImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getBeanLink()
	 * @generated
	 */
  int BEAN_LINK = 8;

	/**
	 * The number of structural features of the '<em>Bean Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BEAN_LINK_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServletLinkImpl <em>Servlet Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServletLinkImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getServletLink()
	 * @generated
	 */
  int SERVLET_LINK = 5;

	/**
	 * The feature id for the '<em><b>Servlet Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVLET_LINK__SERVLET_LINK = BEAN_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servlet Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SERVLET_LINK_FEATURE_COUNT = BEAN_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.EJBLinkImpl <em>EJB Link</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.EJBLinkImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getEJBLink()
	 * @generated
	 */
  int EJB_LINK = 6;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EJB_LINK__EJB_LINK = BEAN_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EJB Link</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EJB_LINK_FEATURE_COUNT = BEAN_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.HandlerImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getHandler()
	 * @generated
	 */
  int HANDLER = 7;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__ICONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__ICONS;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__DISPLAY_NAMES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__DESCRIPTIONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__SMALL_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__LARGE_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__DESCRIPTION = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__DISPLAY_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__HANDLER_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__HANDLER_CLASS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__INIT_PARAMS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soap Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__SOAP_HEADERS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Soap Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER__SOAP_ROLES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HANDLER_FEATURE_COUNT = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServices <em>Web Services</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Services</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServices
	 * @generated
	 */
  EClass getWebServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServices#getWebServiceDescriptions <em>Web Service Descriptions</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Service Descriptions</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServices#getWebServiceDescriptions()
	 * @see #getWebServices()
	 * @generated
	 */
  EReference getWebServices_WebServiceDescriptions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription <em>Web Service Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service Description</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription
	 * @generated
	 */
  EClass getWebServiceDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getJaxrpcMappingFile()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getWebServiceDescriptionName <em>Web Service Description Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Service Description Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getWebServiceDescriptionName()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_WebServiceDescriptionName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl File</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getWsdlFile()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_WsdlFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Icon</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getSmallIcon()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_SmallIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Icon</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getLargeIcon()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDescription()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDisplayName()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EAttribute getWebServiceDescription_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getPortComponents <em>Port Components</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Components</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getPortComponents()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EReference getWebServiceDescription_PortComponents();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDescriptionType()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EReference getWebServiceDescription_DescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getDisplayNameType()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EReference getWebServiceDescription_DisplayNameType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getIconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WebServiceDescription#getIconType()
	 * @see #getWebServiceDescription()
	 * @generated
	 */
  EReference getWebServiceDescription_IconType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent <em>Port Component</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent
	 * @generated
	 */
  EClass getPortComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getPortComponentName <em>Port Component Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Component Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getPortComponentName()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_PortComponentName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getServiceEndpointInterface()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Icon</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getSmallIcon()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_SmallIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Icon</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getLargeIcon()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDescription()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDisplayName()
	 * @see #getPortComponent()
	 * @generated
	 */
  EAttribute getPortComponent_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getWsdlPort <em>Wsdl Port</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wsdl Port</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getWsdlPort()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_WsdlPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getServiceImplBean <em>Service Impl Bean</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Impl Bean</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getServiceImplBean()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_ServiceImplBean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getHandlers()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDescriptionType()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_DescriptionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getDisplayNameType()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_DisplayNameType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getIconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Type</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.PortComponent#getIconType()
	 * @see #getPortComponent()
	 * @generated
	 */
  EReference getPortComponent_IconType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.WSDLPort <em>WSDL Port</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSDL Port</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.WSDLPort
	 * @generated
	 */
  EClass getWSDLPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean <em>Service Impl Bean</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Impl Bean</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean
	 * @generated
	 */
  EClass getServiceImplBean();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getEEJBLink <em>EEJB Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EEJB Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getEEJBLink()
	 * @see #getServiceImplBean()
	 * @generated
	 */
  EReference getServiceImplBean_EEJBLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getEServletLink <em>EServlet Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EServlet Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getEServletLink()
	 * @see #getServiceImplBean()
	 * @generated
	 */
  EReference getServiceImplBean_EServletLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getBeanLink <em>Bean Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServiceImplBean#getBeanLink()
	 * @see #getServiceImplBean()
	 * @generated
	 */
  EReference getServiceImplBean_BeanLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServletLink <em>Servlet Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servlet Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServletLink
	 * @generated
	 */
  EClass getServletLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.ServletLink#getServletLink <em>Servlet Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Servlet Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.ServletLink#getServletLink()
	 * @see #getServletLink()
	 * @generated
	 */
  EAttribute getServletLink_ServletLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.EJBLink <em>EJB Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.EJBLink
	 * @generated
	 */
  EClass getEJBLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.EJBLink#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.EJBLink#getEjbLink()
	 * @see #getEJBLink()
	 * @generated
	 */
  EAttribute getEJBLink_EjbLink();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler
	 * @generated
	 */
  EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler#getHandlerName()
	 * @see #getHandler()
	 * @generated
	 */
  EAttribute getHandler_HandlerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Class</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler#getHandlerClass()
	 * @see #getHandler()
	 * @generated
	 */
  EAttribute getHandler_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler#getInitParams()
	 * @see #getHandler()
	 * @generated
	 */
  EReference getHandler_InitParams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler#getSoapHeaders <em>Soap Headers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Headers</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler#getSoapHeaders()
	 * @see #getHandler()
	 * @generated
	 */
  EReference getHandler_SoapHeaders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsdd.Handler#getSoapRoles <em>Soap Roles</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Roles</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.Handler#getSoapRoles()
	 * @see #getHandler()
	 * @generated
	 */
  EReference getHandler_SoapRoles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsdd.BeanLink <em>Bean Link</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsdd.BeanLink
	 * @generated
	 */
  EClass getBeanLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  WsddFactory getWsddFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServicesImpl <em>Web Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServicesImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWebServices()
		 * @generated
		 */
		EClass WEB_SERVICES = eINSTANCE.getWebServices();

		/**
		 * The meta object literal for the '<em><b>Web Service Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICES__WEB_SERVICE_DESCRIPTIONS = eINSTANCE.getWebServices_WebServiceDescriptions();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServiceDescriptionImpl <em>Web Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WebServiceDescriptionImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWebServiceDescription()
		 * @generated
		 */
		EClass WEB_SERVICE_DESCRIPTION = eINSTANCE.getWebServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Jaxrpc Mapping File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__JAXRPC_MAPPING_FILE = eINSTANCE.getWebServiceDescription_JaxrpcMappingFile();

		/**
		 * The meta object literal for the '<em><b>Web Service Description Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__WEB_SERVICE_DESCRIPTION_NAME = eINSTANCE.getWebServiceDescription_WebServiceDescriptionName();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__WSDL_FILE = eINSTANCE.getWebServiceDescription_WsdlFile();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__SMALL_ICON = eINSTANCE.getWebServiceDescription_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__LARGE_ICON = eINSTANCE.getWebServiceDescription_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__DESCRIPTION = eINSTANCE.getWebServiceDescription_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVICE_DESCRIPTION__DISPLAY_NAME = eINSTANCE.getWebServiceDescription_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Port Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE_DESCRIPTION__PORT_COMPONENTS = eINSTANCE.getWebServiceDescription_PortComponents();

		/**
		 * The meta object literal for the '<em><b>Description Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE_DESCRIPTION__DESCRIPTION_TYPE = eINSTANCE.getWebServiceDescription_DescriptionType();

		/**
		 * The meta object literal for the '<em><b>Display Name Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE_DESCRIPTION__DISPLAY_NAME_TYPE = eINSTANCE.getWebServiceDescription_DisplayNameType();

		/**
		 * The meta object literal for the '<em><b>Icon Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE_DESCRIPTION__ICON_TYPE = eINSTANCE.getWebServiceDescription_IconType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl <em>Port Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.PortComponentImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getPortComponent()
		 * @generated
		 */
		EClass PORT_COMPONENT = eINSTANCE.getPortComponent();

		/**
		 * The meta object literal for the '<em><b>Port Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__PORT_COMPONENT_NAME = eINSTANCE.getPortComponent_PortComponentName();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__SERVICE_ENDPOINT_INTERFACE = eINSTANCE.getPortComponent_ServiceEndpointInterface();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__SMALL_ICON = eINSTANCE.getPortComponent_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__LARGE_ICON = eINSTANCE.getPortComponent_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__DESCRIPTION = eINSTANCE.getPortComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT__DISPLAY_NAME = eINSTANCE.getPortComponent_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Wsdl Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__WSDL_PORT = eINSTANCE.getPortComponent_WsdlPort();

		/**
		 * The meta object literal for the '<em><b>Service Impl Bean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__SERVICE_IMPL_BEAN = eINSTANCE.getPortComponent_ServiceImplBean();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__HANDLERS = eINSTANCE.getPortComponent_Handlers();

		/**
		 * The meta object literal for the '<em><b>Description Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__DESCRIPTION_TYPE = eINSTANCE.getPortComponent_DescriptionType();

		/**
		 * The meta object literal for the '<em><b>Display Name Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__DISPLAY_NAME_TYPE = eINSTANCE.getPortComponent_DisplayNameType();

		/**
		 * The meta object literal for the '<em><b>Icon Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT__ICON_TYPE = eINSTANCE.getPortComponent_IconType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WSDLPortImpl <em>WSDL Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WSDLPortImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getWSDLPort()
		 * @generated
		 */
		EClass WSDL_PORT = eINSTANCE.getWSDLPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServiceImplBeanImpl <em>Service Impl Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServiceImplBeanImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getServiceImplBean()
		 * @generated
		 */
		EClass SERVICE_IMPL_BEAN = eINSTANCE.getServiceImplBean();

		/**
		 * The meta object literal for the '<em><b>EEJB Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL_BEAN__EEJB_LINK = eINSTANCE.getServiceImplBean_EEJBLink();

		/**
		 * The meta object literal for the '<em><b>EServlet Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL_BEAN__ESERVLET_LINK = eINSTANCE.getServiceImplBean_EServletLink();

		/**
		 * The meta object literal for the '<em><b>Bean Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL_BEAN__BEAN_LINK = eINSTANCE.getServiceImplBean_BeanLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServletLinkImpl <em>Servlet Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.ServletLinkImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getServletLink()
		 * @generated
		 */
		EClass SERVLET_LINK = eINSTANCE.getServletLink();

		/**
		 * The meta object literal for the '<em><b>Servlet Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVLET_LINK__SERVLET_LINK = eINSTANCE.getServletLink_ServletLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.EJBLinkImpl <em>EJB Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.EJBLinkImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getEJBLink()
		 * @generated
		 */
		EClass EJB_LINK = eINSTANCE.getEJBLink();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LINK__EJB_LINK = eINSTANCE.getEJBLink_EjbLink();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.HandlerImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Handler Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__HANDLER_NAME = eINSTANCE.getHandler_HandlerName();

		/**
		 * The meta object literal for the '<em><b>Handler Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__HANDLER_CLASS = eINSTANCE.getHandler_HandlerClass();

		/**
		 * The meta object literal for the '<em><b>Init Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__INIT_PARAMS = eINSTANCE.getHandler_InitParams();

		/**
		 * The meta object literal for the '<em><b>Soap Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__SOAP_HEADERS = eINSTANCE.getHandler_SoapHeaders();

		/**
		 * The meta object literal for the '<em><b>Soap Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__SOAP_ROLES = eINSTANCE.getHandler_SoapRoles();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.BeanLinkImpl <em>Bean Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.BeanLinkImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl#getBeanLink()
		 * @generated
		 */
		EClass BEAN_LINK = eINSTANCE.getBeanLink();

	}

} //WsddPackage
