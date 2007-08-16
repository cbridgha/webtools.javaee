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
package org.eclipse.jst.j2ee.webservice.jaxrpcmap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jst.j2ee.common.J2EEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Endpoint Method Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The service-endpoint-method-mapping element defines the mapping of Java methods to operations (which are not uniquely qualified by qnames).
 * 
 * The wsdl-operation should be interpreted with respect to the portType and binding in which this definition is embedded within. See the definitions for service-endpoint-interface-mapping and 
 * service-interface-mapping to acquire the proper context. The wrapped-element indicator should only be specified when a WSDL message wraps an element type.  The wsdl-return-value-mapping is not specified for one-way operations.
 * 
 * Used in: service-endpoint-interface-mapping
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getJavaMethodName <em>Java Method Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getWsdlOperation <em>Wsdl Operation</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#isWrappedElement <em>Wrapped Element</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getMethodParamPartsMappings <em>Method Param Parts Mappings</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getWsdlReturnValueMapping <em>Wsdl Return Value Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping()
 * @model
 * @generated
 */
public interface ServiceEndpointMethodMapping extends J2EEEObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_Id()
	 * @model
	 * @generated
	 */
  String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(String value);

	/**
	 * Returns the value of the '<em><b>Java Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Method Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The java-method-name element defines the name of a Java method within an interface.
	 * 
	 * Used in: service-endpoint-method-mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java Method Name</em>' attribute.
	 * @see #setJavaMethodName(String)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_JavaMethodName()
	 * @model
	 * @generated
	 */
  String getJavaMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getJavaMethodName <em>Java Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Method Name</em>' attribute.
	 * @see #getJavaMethodName()
	 * @generated
	 */
  void setJavaMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wsdl Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The wsdl-operation element defines an operation within a WSDL document. It must be interpreted with respect to a port type.
	 * 
	 * Used in: service-endpoint-method-mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wsdl Operation</em>' attribute.
	 * @see #setWsdlOperation(String)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_WsdlOperation()
	 * @model
	 * @generated
	 */
  String getWsdlOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getWsdlOperation <em>Wsdl Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Operation</em>' attribute.
	 * @see #getWsdlOperation()
	 * @generated
	 */
  void setWsdlOperation(String value);

	/**
	 * Returns the value of the '<em><b>Wrapped Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrapped Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Element</em>' attribute.
	 * @see #isSetWrappedElement()
	 * @see #unsetWrappedElement()
	 * @see #setWrappedElement(boolean)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_WrappedElement()
	 * @model unsettable="true"
	 * @generated
	 */
  boolean isWrappedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#isWrappedElement <em>Wrapped Element</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Element</em>' attribute.
	 * @see #isSetWrappedElement()
	 * @see #unsetWrappedElement()
	 * @see #isWrappedElement()
	 * @generated
	 */
  void setWrappedElement(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#isWrappedElement <em>Wrapped Element</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetWrappedElement()
	 * @see #isWrappedElement()
	 * @see #setWrappedElement(boolean)
	 * @generated
	 */
  void unsetWrappedElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#isWrappedElement <em>Wrapped Element</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Element</em>' attribute is set.
	 * @see #unsetWrappedElement()
	 * @see #isWrappedElement()
	 * @see #setWrappedElement(boolean)
	 * @generated
	 */
  boolean isSetWrappedElement();

	/**
	 * Returns the value of the '<em><b>Method Param Parts Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.MethodParamPartsMapping}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Param Parts Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Param Parts Mappings</em>' containment reference list.
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_MethodParamPartsMappings()
	 * @model type="org.eclipse.jst.j2ee.webservice.jaxrpcmap.MethodParamPartsMapping" containment="true"
	 * @generated
	 */
  EList getMethodParamPartsMappings();

	/**
	 * Returns the value of the '<em><b>Wsdl Return Value Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wsdl Return Value Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Return Value Mapping</em>' containment reference.
	 * @see #setWsdlReturnValueMapping(WSDLReturnValueMapping)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getServiceEndpointMethodMapping_WsdlReturnValueMapping()
	 * @model containment="true"
	 * @generated
	 */
  WSDLReturnValueMapping getWsdlReturnValueMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping#getWsdlReturnValueMapping <em>Wsdl Return Value Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Return Value Mapping</em>' containment reference.
	 * @see #getWsdlReturnValueMapping()
	 * @generated
	 */
  void setWsdlReturnValueMapping(WSDLReturnValueMapping value);

} // ServiceEndpointMethodMapping
