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
package org.eclipse.jst.j2ee.webservice.wsclient;

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
 * @see org.eclipse.jst.j2ee.webservice.wsclient.Webservice_clientFactory
 * @model kind="package"
 * @generated
 */
public interface Webservice_clientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wsclient";//$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "webservice_client.xmi";//$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.jst.j2ee.webservice.wsclient";//$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Webservice_clientPackage eINSTANCE = org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ServiceRefImpl <em>Service Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ServiceRefImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getServiceRef()
	 * @generated
	 */
	int SERVICE_REF = 0;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__ICONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__ICONS;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DISPLAY_NAMES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DESCRIPTIONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SMALL_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__SMALL_ICON;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__LARGE_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__LARGE_ICON;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DESCRIPTION = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DISPLAY_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_INTERFACE = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_REF_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__WSDL_FILE = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__JAXRPC_MAPPING_FILE = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Component Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__PORT_COMPONENT_REFS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__HANDLERS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_QNAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_FEATURE_COUNT = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.PortComponentRefImpl <em>Port Component Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.PortComponentRefImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getPortComponentRef()
	 * @generated
	 */
	int PORT_COMPONENT_REF = 1;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__PORT_COMPONENT_LINK = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__SERVICE_ENDPOINT_INTERFACE = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Component Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.HandlerImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 2;

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
	 * The feature id for the '<em><b>Soap Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__SOAP_ROLES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__PORT_NAMES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__HANDLER_CLASS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__INIT_PARAMS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Soap Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__SOAP_HEADERS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.WebServicesClientImpl <em>Web Services Client</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.WebServicesClientImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getWebServicesClient()
	 * @generated
	 */
    int WEB_SERVICES_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Component Scoped Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WEB_SERVICES_CLIENT__COMPONENT_SCOPED_REFS = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WEB_SERVICES_CLIENT__SERVICE_REFS = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Services Client</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WEB_SERVICES_CLIENT_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ComponentScopedRefsImpl <em>Component Scoped Refs</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ComponentScopedRefsImpl
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getComponentScopedRefs()
	 * @generated
	 */
    int COMPONENT_SCOPED_REFS = 4;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPONENT_SCOPED_REFS__COMPONENT_NAME = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPONENT_SCOPED_REFS__SERVICE_REFS = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Scoped Refs</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPONENT_SCOPED_REFS_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef
	 * @generated
	 */
	EClass getServiceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceRefName <em>Service Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Ref Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceRefName()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ServiceRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl File</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getWsdlFile()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_WsdlFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getJaxrpcMappingFile()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Interface</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceInterface()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_ServiceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getPortComponentRefs <em>Port Component Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Component Refs</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getPortComponentRefs()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_PortComponentRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getHandlers()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Qname</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ServiceRef#getServiceQname()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_ServiceQname();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef <em>Port Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef
	 * @generated
	 */
	EClass getPortComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef#getPortComponentLink <em>Port Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Component Link</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef#getPortComponentLink()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EAttribute getPortComponentRef_PortComponentLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.PortComponentRef#getServiceEndpointInterface()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EReference getPortComponentRef_ServiceEndpointInterface();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getHandlerName()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_HandlerName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getSoapHeaders <em>Soap Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soap Headers</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getSoapHeaders()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_SoapHeaders();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getSoapRoles <em>Soap Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Soap Roles</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getSoapRoles()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_SoapRoles();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getPortNames <em>Port Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Port Names</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getPortNames()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_PortNames();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler Class</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getHandlerClass()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.Handler#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.Handler#getInitParams()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_InitParams();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient <em>Web Services Client</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Services Client</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient
	 * @generated
	 */
    EClass getWebServicesClient();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient#getComponentScopedRefs <em>Component Scoped Refs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Scoped Refs</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient#getComponentScopedRefs()
	 * @see #getWebServicesClient()
	 * @generated
	 */
    EReference getWebServicesClient_ComponentScopedRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.WebServicesClient#getServiceRefs()
	 * @see #getWebServicesClient()
	 * @generated
	 */
    EReference getWebServicesClient_ServiceRefs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs <em>Component Scoped Refs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Scoped Refs</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs
	 * @generated
	 */
    EClass getComponentScopedRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs#getComponentName()
	 * @see #getComponentScopedRefs()
	 * @generated
	 */
    EAttribute getComponentScopedRefs_ComponentName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.j2ee.webservice.wsclient.ComponentScopedRefs#getServiceRefs()
	 * @see #getComponentScopedRefs()
	 * @generated
	 */
    EReference getComponentScopedRefs_ServiceRefs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Webservice_clientFactory getWebservice_clientFactory();

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
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ServiceRefImpl <em>Service Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ServiceRefImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getServiceRef()
		 * @generated
		 */
		EClass SERVICE_REF = eINSTANCE.getServiceRef();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__SERVICE_INTERFACE = eINSTANCE.getServiceRef_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Service Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__SERVICE_REF_NAME = eINSTANCE.getServiceRef_ServiceRefName();

		/**
		 * The meta object literal for the '<em><b>Wsdl File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__WSDL_FILE = eINSTANCE.getServiceRef_WsdlFile();

		/**
		 * The meta object literal for the '<em><b>Jaxrpc Mapping File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__JAXRPC_MAPPING_FILE = eINSTANCE.getServiceRef_JaxrpcMappingFile();

		/**
		 * The meta object literal for the '<em><b>Port Component Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__PORT_COMPONENT_REFS = eINSTANCE.getServiceRef_PortComponentRefs();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__HANDLERS = eINSTANCE.getServiceRef_Handlers();

		/**
		 * The meta object literal for the '<em><b>Service Qname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__SERVICE_QNAME = eINSTANCE.getServiceRef_ServiceQname();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.PortComponentRefImpl <em>Port Component Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.PortComponentRefImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getPortComponentRef()
		 * @generated
		 */
		EClass PORT_COMPONENT_REF = eINSTANCE.getPortComponentRef();

		/**
		 * The meta object literal for the '<em><b>Port Component Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF__PORT_COMPONENT_LINK = eINSTANCE.getPortComponentRef_PortComponentLink();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COMPONENT_REF__SERVICE_ENDPOINT_INTERFACE = eINSTANCE.getPortComponentRef_ServiceEndpointInterface();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.HandlerImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getHandler()
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
		 * The meta object literal for the '<em><b>Soap Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__SOAP_ROLES = eINSTANCE.getHandler_SoapRoles();

		/**
		 * The meta object literal for the '<em><b>Port Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__PORT_NAMES = eINSTANCE.getHandler_PortNames();

		/**
		 * The meta object literal for the '<em><b>Handler Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__HANDLER_CLASS = eINSTANCE.getHandler_HandlerClass();

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
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.WebServicesClientImpl <em>Web Services Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.WebServicesClientImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getWebServicesClient()
		 * @generated
		 */
		EClass WEB_SERVICES_CLIENT = eINSTANCE.getWebServicesClient();

		/**
		 * The meta object literal for the '<em><b>Component Scoped Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICES_CLIENT__COMPONENT_SCOPED_REFS = eINSTANCE.getWebServicesClient_ComponentScopedRefs();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICES_CLIENT__SERVICE_REFS = eINSTANCE.getWebServicesClient_ServiceRefs();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ComponentScopedRefsImpl <em>Component Scoped Refs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.ComponentScopedRefsImpl
		 * @see org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl#getComponentScopedRefs()
		 * @generated
		 */
		EClass COMPONENT_SCOPED_REFS = eINSTANCE.getComponentScopedRefs();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SCOPED_REFS__COMPONENT_NAME = eINSTANCE.getComponentScopedRefs_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SCOPED_REFS__SERVICE_REFS = eINSTANCE.getComponentScopedRefs_ServiceRefs();

	}

} //Webservice_clientPackage
