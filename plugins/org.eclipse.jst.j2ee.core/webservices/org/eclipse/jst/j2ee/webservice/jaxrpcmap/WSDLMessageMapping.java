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

import org.eclipse.jst.j2ee.common.J2EEEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WSDL Message Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The wsdl-message-mapping element defines the mapping to a specific message and its part. Together they define uniquely the mapping for a specific parameter. Parts within a message context are uniquely 
 * identified with their names.
 * 
 * The parameter-mode is defined by the mapping to indicate whether the mapping will be IN, OUT, or INOUT..  The presence of the soap-header
 * element indicates that the parameter is mapped to a soap header only. When absent, it means that the wsdl-message is mapped to a Java parameter. The soap headers are interpreted in the order they are
 * provided in the mapping.
 * 
 * Used in: method-param-parts-mapping
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getWsdlMessagePartName <em>Wsdl Message Part Name</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getParameterMode <em>Parameter Mode</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#isSoapHeader <em>Soap Header</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getWsdlMessage <em>Wsdl Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping()
 * @model
 * @generated
 */
public interface WSDLMessageMapping extends J2EEEObject {
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
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping_Id()
	 * @model
	 * @generated
	 */
  String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(String value);

	/**
	 * Returns the value of the '<em><b>Wsdl Message Part Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wsdl Message Part Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interpretation of the wsdl-message-part-name element depends on whether or not wrapped-element has been defined in the service-endpoint-method-mapping.  If wrapped-element is not specified, wsdl-message-part-name defines a WSDL message part. It should always be interpreter with respect to a wsdl-message element. If wrapped-element is specified, wsdl-message-part-name refers to an element
	 * name of the element type.
	 * 
	 * Used in: wsdl-message-mapping, wsdl-return-value-mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wsdl Message Part Name</em>' attribute.
	 * @see #setWsdlMessagePartName(String)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping_WsdlMessagePartName()
	 * @model
	 * @generated
	 */
  String getWsdlMessagePartName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getWsdlMessagePartName <em>Wsdl Message Part Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Message Part Name</em>' attribute.
	 * @see #getWsdlMessagePartName()
	 * @generated
	 */
  void setWsdlMessagePartName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter-mode  element defines the mode of the parameter. It can have only three values, IN, OUT, INOUT.
	 * 
	 * Used in: wsdl-message-mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Mode</em>' attribute.
	 * @see #setParameterMode(String)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping_ParameterMode()
	 * @model
	 * @generated
	 */
  String getParameterMode();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getParameterMode <em>Parameter Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Mode</em>' attribute.
	 * @see #getParameterMode()
	 * @generated
	 */
  void setParameterMode(String value);

	/**
	 * Returns the value of the '<em><b>Soap Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Soap Header</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Header</em>' attribute.
	 * @see #isSetSoapHeader()
	 * @see #unsetSoapHeader()
	 * @see #setSoapHeader(boolean)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping_SoapHeader()
	 * @model unsettable="true"
	 * @generated
	 */
  boolean isSoapHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#isSoapHeader <em>Soap Header</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Header</em>' attribute.
	 * @see #isSetSoapHeader()
	 * @see #unsetSoapHeader()
	 * @see #isSoapHeader()
	 * @generated
	 */
  void setSoapHeader(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#isSoapHeader <em>Soap Header</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isSetSoapHeader()
	 * @see #isSoapHeader()
	 * @see #setSoapHeader(boolean)
	 * @generated
	 */
  void unsetSoapHeader();

	/**
	 * Returns whether the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#isSoapHeader <em>Soap Header</em>}' attribute is set.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soap Header</em>' attribute is set.
	 * @see #unsetSoapHeader()
	 * @see #isSoapHeader()
	 * @see #setSoapHeader(boolean)
	 * @generated
	 */
  boolean isSetSoapHeader();

	/**
	 * Returns the value of the '<em><b>Wsdl Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wsdl Message</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdl Message</em>' containment reference.
	 * @see #setWsdlMessage(WSDLMessage)
	 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage#getWSDLMessageMapping_WsdlMessage()
	 * @model containment="true" required="true"
	 * @generated
	 */
  WSDLMessage getWsdlMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping#getWsdlMessage <em>Wsdl Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl Message</em>' containment reference.
	 * @see #getWsdlMessage()
	 * @generated
	 */
  void setWsdlMessage(WSDLMessage value);

} // WSDLMessageMapping
