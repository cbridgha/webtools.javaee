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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ConstructorParameterOrder;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ElementName;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.ExceptionMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.InterfaceMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaWSDLMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JavaXMLTypeMapping;
import org.eclipse.jst.j2ee.webservice.jaxrpcmap.JaxrpcmapFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JaxrpcmapFactoryImpl extends EFactoryImpl implements JaxrpcmapFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JaxrpcmapFactory init() {
		try {
			JaxrpcmapFactory theJaxrpcmapFactory = (JaxrpcmapFactory)EPackage.Registry.INSTANCE.getEFactory("jaxrpcmap.xmi"); 
			if (theJaxrpcmapFactory != null) {
				return theJaxrpcmapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JaxrpcmapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JaxrpcmapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JaxrpcmapPackage.JAVA_WSDL_MAPPING: return createJavaWSDLMapping();
			case JaxrpcmapPackage.PACKAGE_MAPPING: return createPackageMapping();
			case JaxrpcmapPackage.JAVA_XML_TYPE_MAPPING: return createJavaXMLTypeMapping();
			case JaxrpcmapPackage.EXCEPTION_MAPPING: return createExceptionMapping();
			case JaxrpcmapPackage.SERVICE_INTERFACE_MAPPING: return createServiceInterfaceMapping();
			case JaxrpcmapPackage.SERVICE_ENDPOINT_INTERFACE_MAPPING: return createServiceEndpointInterfaceMapping();
			case JaxrpcmapPackage.ROOT_TYPE_QNAME: return createRootTypeQname();
			case JaxrpcmapPackage.VARIABLE_MAPPING: return createVariableMapping();
			case JaxrpcmapPackage.WSDL_MESSAGE: return createWSDLMessage();
			case JaxrpcmapPackage.CONSTRUCTOR_PARAMETER_ORDER: return createConstructorParameterOrder();
			case JaxrpcmapPackage.ELEMENT_NAME: return createElementName();
			case JaxrpcmapPackage.WSDL_SERVICE_NAME: return createWSDLServiceName();
			case JaxrpcmapPackage.PORT_MAPPING: return createPortMapping();
			case JaxrpcmapPackage.WSDL_PORT_TYPE: return createWSDLPortType();
			case JaxrpcmapPackage.WSDL_BINDING: return createWSDLBinding();
			case JaxrpcmapPackage.SERVICE_ENDPOINT_METHOD_MAPPING: return createServiceEndpointMethodMapping();
			case JaxrpcmapPackage.WSDL_OPERATION: return createWSDLOperation();
			case JaxrpcmapPackage.METHOD_PARAM_PARTS_MAPPING: return createMethodParamPartsMapping();
			case JaxrpcmapPackage.WSDL_RETURN_VALUE_MAPPING: return createWSDLReturnValueMapping();
			case JaxrpcmapPackage.WSDL_MESSAGE_MAPPING: return createWSDLMessageMapping();
			case JaxrpcmapPackage.WSDL_MESSAGE_PART_NAME: return createWSDLMessagePartName();
			case JaxrpcmapPackage.INTERFACE_MAPPING: return createInterfaceMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JavaWSDLMapping createJavaWSDLMapping() {
		JavaWSDLMappingImpl javaWSDLMapping = new JavaWSDLMappingImpl();
		return javaWSDLMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PackageMapping createPackageMapping() {
		PackageMappingImpl packageMapping = new PackageMappingImpl();
		return packageMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JavaXMLTypeMapping createJavaXMLTypeMapping() {
		JavaXMLTypeMappingImpl javaXMLTypeMapping = new JavaXMLTypeMappingImpl();
		return javaXMLTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExceptionMapping createExceptionMapping() {
		ExceptionMappingImpl exceptionMapping = new ExceptionMappingImpl();
		return exceptionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceInterfaceMapping createServiceInterfaceMapping() {
		ServiceInterfaceMappingImpl serviceInterfaceMapping = new ServiceInterfaceMappingImpl();
		return serviceInterfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceEndpointInterfaceMapping createServiceEndpointInterfaceMapping() {
		ServiceEndpointInterfaceMappingImpl serviceEndpointInterfaceMapping = new ServiceEndpointInterfaceMappingImpl();
		return serviceEndpointInterfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RootTypeQname createRootTypeQname() {
		RootTypeQnameImpl rootTypeQname = new RootTypeQnameImpl();
		return rootTypeQname;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableMapping createVariableMapping() {
		VariableMappingImpl variableMapping = new VariableMappingImpl();
		return variableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLMessage createWSDLMessage() {
		WSDLMessageImpl wsdlMessage = new WSDLMessageImpl();
		return wsdlMessage;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConstructorParameterOrder createConstructorParameterOrder() {
		ConstructorParameterOrderImpl constructorParameterOrder = new ConstructorParameterOrderImpl();
		return constructorParameterOrder;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ElementName createElementName() {
		ElementNameImpl elementName = new ElementNameImpl();
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLServiceName createWSDLServiceName() {
		WSDLServiceNameImpl wsdlServiceName = new WSDLServiceNameImpl();
		return wsdlServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PortMapping createPortMapping() {
		PortMappingImpl portMapping = new PortMappingImpl();
		return portMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLPortType createWSDLPortType() {
		WSDLPortTypeImpl wsdlPortType = new WSDLPortTypeImpl();
		return wsdlPortType;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLBinding createWSDLBinding() {
		WSDLBindingImpl wsdlBinding = new WSDLBindingImpl();
		return wsdlBinding;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ServiceEndpointMethodMapping createServiceEndpointMethodMapping() {
		ServiceEndpointMethodMappingImpl serviceEndpointMethodMapping = new ServiceEndpointMethodMappingImpl();
		return serviceEndpointMethodMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLOperation createWSDLOperation() {
		WSDLOperationImpl wsdlOperation = new WSDLOperationImpl();
		return wsdlOperation;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MethodParamPartsMapping createMethodParamPartsMapping() {
		MethodParamPartsMappingImpl methodParamPartsMapping = new MethodParamPartsMappingImpl();
		return methodParamPartsMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLReturnValueMapping createWSDLReturnValueMapping() {
		WSDLReturnValueMappingImpl wsdlReturnValueMapping = new WSDLReturnValueMappingImpl();
		return wsdlReturnValueMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLMessageMapping createWSDLMessageMapping() {
		WSDLMessageMappingImpl wsdlMessageMapping = new WSDLMessageMappingImpl();
		return wsdlMessageMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WSDLMessagePartName createWSDLMessagePartName() {
		WSDLMessagePartNameImpl wsdlMessagePartName = new WSDLMessagePartNameImpl();
		return wsdlMessagePartName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InterfaceMapping createInterfaceMapping() {
		InterfaceMappingImpl interfaceMapping = new InterfaceMappingImpl();
		return interfaceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JaxrpcmapPackage getJaxrpcmapPackage() {
		return (JaxrpcmapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  public static JaxrpcmapPackage getPackage() {
		return JaxrpcmapPackage.eINSTANCE;
	}

} //JaxrpcmapFactoryImpl
