/**
 * <copyright>
 * </copyright>
 *
 * $Id: ServiceRefHandler.java,v 1.1 2007/03/20 18:04:35 jsholl Exp $
 */
package org.eclipse.jst.javaee.core;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Ref Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	Declares the handler for a port-component. Handlers can access the
 * 	init-param name/value pairs using the HandlerInfo interface. If
 * 	port-name is not specified, the handler is assumed to be associated
 * 	with all ports of the service.
 * 
 * 	Used in: service-ref
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getDisplayNames <em>Display Names</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getIcons <em>Icons</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerClass <em>Handler Class</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getInitParams <em>Init Params</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapHeaders <em>Soap Headers</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapRoles <em>Soap Roles</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getPortNames <em>Port Names</em>}</li>
 *   <li>{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler()
 * @extends JavaEEObject
 * @generated
 */
public interface ServiceRefHandler extends JavaEEObject {
	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_Descriptions()
	 * @generated
	 */
	List getDescriptions();

	/**
	 * Returns the value of the '<em><b>Display Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.DisplayName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Names</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_DisplayNames()
	 * @generated
	 */
	List getDisplayNames();

	/**
	 * Returns the value of the '<em><b>Icons</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.Icon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icons</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_Icons()
	 * @generated
	 */
	List getIcons();

	/**
	 * Returns the value of the '<em><b>Handler Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Defines the name of the handler. The name must be unique
	 * 	    within the module.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Name</em>' attribute.
	 * @see #setHandlerName(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_HandlerName()
	 * @generated
	 */
	String getHandlerName();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerName <em>Handler Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Name</em>' attribute.
	 * @see #getHandlerName()
	 * @generated
	 */
	void setHandlerName(String value);

	/**
	 * Returns the value of the '<em><b>Handler Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Defines a fully qualified class name for the handler
	 * 	    implementation.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Class</em>' attribute.
	 * @see #setHandlerClass(String)
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_HandlerClass()
	 * @generated
	 */
	String getHandlerClass();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerClass <em>Handler Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Class</em>' attribute.
	 * @see #getHandlerClass()
	 * @generated
	 */
	void setHandlerClass(String value);

	/**
	 * Returns the value of the '<em><b>Init Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.javaee.core.ParamValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Params</em>' containment reference list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_InitParams()
	 * @generated
	 */
	List getInitParams();

	/**
	 * Returns the value of the '<em><b>Soap Headers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Defines the QName of a SOAP header that will be processed
	 * 	    by the handler.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap Headers</em>' attribute list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_SoapHeaders()
	 * @generated
	 */
	List getSoapHeaders();

	/**
	 * Returns the value of the '<em><b>Soap Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The soap-role element contains a SOAP actor definition that
	 * 	    the Handler will play as a role.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soap Roles</em>' attribute list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_SoapRoles()
	 * @generated
	 */
	List getSoapRoles();

	/**
	 * Returns the value of the '<em><b>Port Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The port-name element defines the WSDL port-name that a
	 * 	    handler should be associated with.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Names</em>' attribute list.
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_PortNames()
	 * @generated
	 */
	List getPortNames();

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
	 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage#getServiceRefHandler_Id()
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServiceRefHandler