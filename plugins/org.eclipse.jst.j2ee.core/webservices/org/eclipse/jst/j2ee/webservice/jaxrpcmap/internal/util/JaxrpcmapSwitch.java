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
package org.eclipse.jst.j2ee.webservice.jaxrpcmap.internal.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jst.j2ee.common.J2EEEObject;
import org.eclipse.jst.j2ee.common.QName;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ConstructorParameterOrder;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ElementName;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ExceptionMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.InterfaceMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaWSDLMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaXMLTypeMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.MethodParamPartsMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.PackageMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.PortMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.RootTypeQname;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointInterfaceMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceEndpointMethodMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ServiceInterfaceMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.VariableMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLBinding;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessage;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessageMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLMessagePartName;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLOperation;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLPortType;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLReturnValueMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.WSDLServiceName;



/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapPackage
 * @generated
 */
public class JaxrpcmapSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static JaxrpcmapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JaxrpcmapSwitch() {
		if (modelPackage == null) {
			modelPackage = JaxrpcmapPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING: {
				JavaWSDLMapping javaWSDLMapping = (JavaWSDLMapping)theEObject;
				Object result = caseJavaWSDLMapping(javaWSDLMapping);
				if (result == null) result = caseJ2EEEObject(javaWSDLMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.PACKAGE_MAPPING: {
				PackageMapping packageMapping = (PackageMapping)theEObject;
				Object result = casePackageMapping(packageMapping);
				if (result == null) result = caseJ2EEEObject(packageMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.JAVA_XML_TYPE_MAPPING: {
				JavaXMLTypeMapping javaXMLTypeMapping = (JavaXMLTypeMapping)theEObject;
				Object result = caseJavaXMLTypeMapping(javaXMLTypeMapping);
				if (result == null) result = caseJ2EEEObject(javaXMLTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.EXCEPTION_MAPPING: {
				ExceptionMapping exceptionMapping = (ExceptionMapping)theEObject;
				Object result = caseExceptionMapping(exceptionMapping);
				if (result == null) result = caseJ2EEEObject(exceptionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.SERVICE_INTERFACE_MAPPING: {
				ServiceInterfaceMapping serviceInterfaceMapping = (ServiceInterfaceMapping)theEObject;
				Object result = caseServiceInterfaceMapping(serviceInterfaceMapping);
				if (result == null) result = caseInterfaceMapping(serviceInterfaceMapping);
				if (result == null) result = caseJ2EEEObject(serviceInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.SERVICE_ENDPOINT_INTERFACE_MAPPING: {
				ServiceEndpointInterfaceMapping serviceEndpointInterfaceMapping = (ServiceEndpointInterfaceMapping)theEObject;
				Object result = caseServiceEndpointInterfaceMapping(serviceEndpointInterfaceMapping);
				if (result == null) result = caseInterfaceMapping(serviceEndpointInterfaceMapping);
				if (result == null) result = caseJ2EEEObject(serviceEndpointInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.ROOT_TYPE_QNAME: {
				RootTypeQname rootTypeQname = (RootTypeQname)theEObject;
				Object result = caseRootTypeQname(rootTypeQname);
				if (result == null) result = caseQName(rootTypeQname);
				if (result == null) result = caseJ2EEEObject(rootTypeQname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.VARIABLE_MAPPING: {
				VariableMapping variableMapping = (VariableMapping)theEObject;
				Object result = caseVariableMapping(variableMapping);
				if (result == null) result = caseJ2EEEObject(variableMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_MESSAGE: {
				WSDLMessage wsdlMessage = (WSDLMessage)theEObject;
				Object result = caseWSDLMessage(wsdlMessage);
				if (result == null) result = caseQName(wsdlMessage);
				if (result == null) result = caseJ2EEEObject(wsdlMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.CONSTRUCTOR_PARAMETER_ORDER: {
				ConstructorParameterOrder constructorParameterOrder = (ConstructorParameterOrder)theEObject;
				Object result = caseConstructorParameterOrder(constructorParameterOrder);
				if (result == null) result = caseJ2EEEObject(constructorParameterOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.ELEMENT_NAME: {
				ElementName elementName = (ElementName)theEObject;
				Object result = caseElementName(elementName);
				if (result == null) result = caseJ2EEEObject(elementName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_SERVICE_NAME: {
				WSDLServiceName wsdlServiceName = (WSDLServiceName)theEObject;
				Object result = caseWSDLServiceName(wsdlServiceName);
				if (result == null) result = caseQName(wsdlServiceName);
				if (result == null) result = caseJ2EEEObject(wsdlServiceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.PORT_MAPPING: {
				PortMapping portMapping = (PortMapping)theEObject;
				Object result = casePortMapping(portMapping);
				if (result == null) result = caseJ2EEEObject(portMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_PORT_TYPE: {
				WSDLPortType wsdlPortType = (WSDLPortType)theEObject;
				Object result = caseWSDLPortType(wsdlPortType);
				if (result == null) result = caseQName(wsdlPortType);
				if (result == null) result = caseJ2EEEObject(wsdlPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_BINDING: {
				WSDLBinding wsdlBinding = (WSDLBinding)theEObject;
				Object result = caseWSDLBinding(wsdlBinding);
				if (result == null) result = caseQName(wsdlBinding);
				if (result == null) result = caseJ2EEEObject(wsdlBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.SERVICE_ENDPOINT_METHOD_MAPPING: {
				ServiceEndpointMethodMapping serviceEndpointMethodMapping = (ServiceEndpointMethodMapping)theEObject;
				Object result = caseServiceEndpointMethodMapping(serviceEndpointMethodMapping);
				if (result == null) result = caseJ2EEEObject(serviceEndpointMethodMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_OPERATION: {
				WSDLOperation wsdlOperation = (WSDLOperation)theEObject;
				Object result = caseWSDLOperation(wsdlOperation);
				if (result == null) result = caseJ2EEEObject(wsdlOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.METHOD_PARAM_PARTS_MAPPING: {
				MethodParamPartsMapping methodParamPartsMapping = (MethodParamPartsMapping)theEObject;
				Object result = caseMethodParamPartsMapping(methodParamPartsMapping);
				if (result == null) result = caseJ2EEEObject(methodParamPartsMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_RETURN_VALUE_MAPPING: {
				WSDLReturnValueMapping wsdlReturnValueMapping = (WSDLReturnValueMapping)theEObject;
				Object result = caseWSDLReturnValueMapping(wsdlReturnValueMapping);
				if (result == null) result = caseJ2EEEObject(wsdlReturnValueMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_MESSAGE_MAPPING: {
				WSDLMessageMapping wsdlMessageMapping = (WSDLMessageMapping)theEObject;
				Object result = caseWSDLMessageMapping(wsdlMessageMapping);
				if (result == null) result = caseJ2EEEObject(wsdlMessageMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.WSDL_MESSAGE_PART_NAME: {
				WSDLMessagePartName wsdlMessagePartName = (WSDLMessagePartName)theEObject;
				Object result = caseWSDLMessagePartName(wsdlMessagePartName);
				if (result == null) result = caseJ2EEEObject(wsdlMessagePartName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JaxrpcmapPackage.INTERFACE_MAPPING: {
				InterfaceMapping interfaceMapping = (InterfaceMapping)theEObject;
				Object result = caseInterfaceMapping(interfaceMapping);
				if (result == null) result = caseJ2EEEObject(interfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Java WSDL Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Java WSDL Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseJavaWSDLMapping(JavaWSDLMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Package Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Package Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object casePackageMapping(PackageMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Java XML Type Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Java XML Type Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseJavaXMLTypeMapping(JavaXMLTypeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Exception Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Exception Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseExceptionMapping(ExceptionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseServiceInterfaceMapping(ServiceInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Endpoint Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Endpoint Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseServiceEndpointInterfaceMapping(ServiceEndpointInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Root Type Qname</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Root Type Qname</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseRootTypeQname(RootTypeQname object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Variable Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Variable Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseVariableMapping(VariableMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Message</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLMessage(WSDLMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Constructor Parameter Order</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Constructor Parameter Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseConstructorParameterOrder(ConstructorParameterOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Element Name</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Element Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseElementName(ElementName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Service Name</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Service Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLServiceName(WSDLServiceName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Port Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object casePortMapping(PortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Port Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLPortType(WSDLPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLBinding(WSDLBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service Endpoint Method Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service Endpoint Method Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseServiceEndpointMethodMapping(ServiceEndpointMethodMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Operation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLOperation(WSDLOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Method Param Parts Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Method Param Parts Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseMethodParamPartsMapping(MethodParamPartsMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Return Value Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Return Value Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLReturnValueMapping(WSDLReturnValueMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Message Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Message Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLMessageMapping(WSDLMessageMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>WSDL Message Part Name</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>WSDL Message Part Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseWSDLMessagePartName(WSDLMessagePartName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Interface Mapping</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Interface Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseInterfaceMapping(InterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>J2EEE Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>J2EEE Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseJ2EEEObject(J2EEEObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>QName</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>QName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public Object caseQName(QName object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  public Object defaultCase(EObject object) {
		return null;
	}

} //JaxrpcmapSwitch
