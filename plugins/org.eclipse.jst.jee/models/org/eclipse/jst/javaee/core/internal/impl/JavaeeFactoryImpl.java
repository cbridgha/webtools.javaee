/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaeeFactoryImpl.java,v 1.1 2007/03/20 18:04:35 jsholl Exp $
 */
package org.eclipse.jst.javaee.core.internal.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.jst.javaee.core.*;

import org.eclipse.jst.javaee.core.internal.metadata.JavaeeFactory;
import org.eclipse.jst.javaee.core.internal.metadata.JavaeePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaeeFactoryImpl extends EFactoryImpl implements JavaeeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaeeFactory init() {
		try {
			JavaeeFactory theJavaeeFactory = (JavaeeFactory)EPackage.Registry.INSTANCE.getEFactory("http://java.sun.com/xml/ns/javaee"); //$NON-NLS-1$ 
			if (theJavaeeFactory != null) {
				return theJavaeeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaeeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaeeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaeePackage.DESCRIPTION: return (EObject)createDescription();
			case JavaeePackage.DISPLAY_NAME: return (EObject)createDisplayName();
			case JavaeePackage.EJB_LOCAL_REF: return (EObject)createEjbLocalRef();
			case JavaeePackage.EJB_REF: return (EObject)createEjbRef();
			case JavaeePackage.EMPTY_TYPE: return (EObject)createEmptyType();
			case JavaeePackage.ENV_ENTRY: return (EObject)createEnvEntry();
			case JavaeePackage.ICON: return (EObject)createIcon();
			case JavaeePackage.INJECTION_TARGET: return (EObject)createInjectionTarget();
			case JavaeePackage.LIFECYCLE_CALLBACK: return (EObject)createLifecycleCallback();
			case JavaeePackage.LISTENER: return (EObject)createListener();
			case JavaeePackage.MESSAGE_DESTINATION: return (EObject)createMessageDestination();
			case JavaeePackage.MESSAGE_DESTINATION_REF: return (EObject)createMessageDestinationRef();
			case JavaeePackage.PARAM_VALUE: return (EObject)createParamValue();
			case JavaeePackage.PERSISTENCE_CONTEXT_REF: return (EObject)createPersistenceContextRef();
			case JavaeePackage.PERSISTENCE_UNIT_REF: return (EObject)createPersistenceUnitRef();
			case JavaeePackage.PORT_COMPONENT_REF: return (EObject)createPortComponentRef();
			case JavaeePackage.PROPERTY_TYPE: return (EObject)createPropertyType();
			case JavaeePackage.RESOURCE_ENV_REF: return (EObject)createResourceEnvRef();
			case JavaeePackage.RESOURCE_REF: return (EObject)createResourceRef();
			case JavaeePackage.RUN_AS: return (EObject)createRunAs();
			case JavaeePackage.SECURITY_ROLE: return (EObject)createSecurityRole();
			case JavaeePackage.SECURITY_ROLE_REF: return (EObject)createSecurityRoleRef();
			case JavaeePackage.SERVICE_REF: return (EObject)createServiceRef();
			case JavaeePackage.SERVICE_REF_HANDLER: return (EObject)createServiceRefHandler();
			case JavaeePackage.SERVICE_REF_HANDLER_CHAIN: return (EObject)createServiceRefHandlerChain();
			case JavaeePackage.SERVICE_REF_HANDLER_CHAINS: return (EObject)createServiceRefHandlerChains();
			case JavaeePackage.URL_PATTERN_TYPE: return (EObject)createUrlPatternType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JavaeePackage.EJB_REF_TYPE:
				return createEjbRefTypeFromString(eDataType, initialValue);
			case JavaeePackage.ENV_ENTRY_TYPE:
				return createEnvEntryTypeFromString(eDataType, initialValue);
			case JavaeePackage.MESSAGE_DESTINATION_USAGE_TYPE:
				return createMessageDestinationUsageTypeFromString(eDataType, initialValue);
			case JavaeePackage.PERSISTENCE_CONTEXT_TYPE:
				return createPersistenceContextTypeFromString(eDataType, initialValue);
			case JavaeePackage.RES_AUTH_TYPE:
				return createResAuthTypeFromString(eDataType, initialValue);
			case JavaeePackage.RES_SHARING_SCOPE_TYPE:
				return createResSharingScopeTypeFromString(eDataType, initialValue);
			case JavaeePackage.DEWEY_VERSION_TYPE:
				return createDeweyVersionTypeFromString(eDataType, initialValue);
			case JavaeePackage.EJB_LINK:
				return createEJBLinkFromString(eDataType, initialValue);
			case JavaeePackage.EJB_REF_NAME_TYPE:
				return createEjbRefNameTypeFromString(eDataType, initialValue);
			case JavaeePackage.EJB_REF_TYPE_OBJECT:
				return createEjbRefTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.ENV_ENTRY_TYPE_OBJECT:
				return createEnvEntryTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.FULLY_QUALIFIED_CLASS_TYPE:
				return createFullyQualifiedClassTypeFromString(eDataType, initialValue);
			case JavaeePackage.HOME:
				return createHomeFromString(eDataType, initialValue);
			case JavaeePackage.JAVA_IDENTIFIER:
				return createJavaIdentifierFromString(eDataType, initialValue);
			case JavaeePackage.JAVA_TYPE:
				return createJavaTypeFromString(eDataType, initialValue);
			case JavaeePackage.JNDI_NAME:
				return createJNDINameFromString(eDataType, initialValue);
			case JavaeePackage.LOCAL:
				return createLocalFromString(eDataType, initialValue);
			case JavaeePackage.LOCAL_HOME:
				return createLocalHomeFromString(eDataType, initialValue);
			case JavaeePackage.MESSAGE_DESTINATION_LINK:
				return createMessageDestinationLinkFromString(eDataType, initialValue);
			case JavaeePackage.MESSAGE_DESTINATION_TYPE_TYPE:
				return createMessageDestinationTypeTypeFromString(eDataType, initialValue);
			case JavaeePackage.MESSAGE_DESTINATION_USAGE_TYPE_OBJECT:
				return createMessageDestinationUsageTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.PATH_TYPE:
				return createPathTypeFromString(eDataType, initialValue);
			case JavaeePackage.PERSISTENCE_CONTEXT_TYPE_OBJECT:
				return createPersistenceContextTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.REMOTE:
				return createRemoteFromString(eDataType, initialValue);
			case JavaeePackage.RES_AUTH_TYPE_OBJECT:
				return createResAuthTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.RES_SHARING_SCOPE_TYPE_OBJECT:
				return createResSharingScopeTypeObjectFromString(eDataType, initialValue);
			case JavaeePackage.ROLE_NAME:
				return createRoleNameFromString(eDataType, initialValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return createServiceRefProtocolBindingListTypeFromString(eDataType, initialValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return createServiceRefProtocolBindingTypeFromString(eDataType, initialValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return createServiceRefProtocolURIAliasTypeFromString(eDataType, initialValue);
			case JavaeePackage.SERVICE_REF_QNAME_PATTERN:
				return createServiceRefQnamePatternFromString(eDataType, initialValue);
			case JavaeePackage.TRUE_FALSE_TYPE:
				return createTrueFalseTypeFromString(eDataType, initialValue);
			case JavaeePackage.TRUE_FALSE_TYPE_OBJECT:
				return createTrueFalseTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JavaeePackage.EJB_REF_TYPE:
				return convertEjbRefTypeToString(eDataType, instanceValue);
			case JavaeePackage.ENV_ENTRY_TYPE:
				return convertEnvEntryTypeToString(eDataType, instanceValue);
			case JavaeePackage.MESSAGE_DESTINATION_USAGE_TYPE:
				return convertMessageDestinationUsageTypeToString(eDataType, instanceValue);
			case JavaeePackage.PERSISTENCE_CONTEXT_TYPE:
				return convertPersistenceContextTypeToString(eDataType, instanceValue);
			case JavaeePackage.RES_AUTH_TYPE:
				return convertResAuthTypeToString(eDataType, instanceValue);
			case JavaeePackage.RES_SHARING_SCOPE_TYPE:
				return convertResSharingScopeTypeToString(eDataType, instanceValue);
			case JavaeePackage.DEWEY_VERSION_TYPE:
				return convertDeweyVersionTypeToString(eDataType, instanceValue);
			case JavaeePackage.EJB_LINK:
				return convertEJBLinkToString(eDataType, instanceValue);
			case JavaeePackage.EJB_REF_NAME_TYPE:
				return convertEjbRefNameTypeToString(eDataType, instanceValue);
			case JavaeePackage.EJB_REF_TYPE_OBJECT:
				return convertEjbRefTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.ENV_ENTRY_TYPE_OBJECT:
				return convertEnvEntryTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.FULLY_QUALIFIED_CLASS_TYPE:
				return convertFullyQualifiedClassTypeToString(eDataType, instanceValue);
			case JavaeePackage.HOME:
				return convertHomeToString(eDataType, instanceValue);
			case JavaeePackage.JAVA_IDENTIFIER:
				return convertJavaIdentifierToString(eDataType, instanceValue);
			case JavaeePackage.JAVA_TYPE:
				return convertJavaTypeToString(eDataType, instanceValue);
			case JavaeePackage.JNDI_NAME:
				return convertJNDINameToString(eDataType, instanceValue);
			case JavaeePackage.LOCAL:
				return convertLocalToString(eDataType, instanceValue);
			case JavaeePackage.LOCAL_HOME:
				return convertLocalHomeToString(eDataType, instanceValue);
			case JavaeePackage.MESSAGE_DESTINATION_LINK:
				return convertMessageDestinationLinkToString(eDataType, instanceValue);
			case JavaeePackage.MESSAGE_DESTINATION_TYPE_TYPE:
				return convertMessageDestinationTypeTypeToString(eDataType, instanceValue);
			case JavaeePackage.MESSAGE_DESTINATION_USAGE_TYPE_OBJECT:
				return convertMessageDestinationUsageTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.PATH_TYPE:
				return convertPathTypeToString(eDataType, instanceValue);
			case JavaeePackage.PERSISTENCE_CONTEXT_TYPE_OBJECT:
				return convertPersistenceContextTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.REMOTE:
				return convertRemoteToString(eDataType, instanceValue);
			case JavaeePackage.RES_AUTH_TYPE_OBJECT:
				return convertResAuthTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.RES_SHARING_SCOPE_TYPE_OBJECT:
				return convertResSharingScopeTypeObjectToString(eDataType, instanceValue);
			case JavaeePackage.ROLE_NAME:
				return convertRoleNameToString(eDataType, instanceValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE:
				return convertServiceRefProtocolBindingListTypeToString(eDataType, instanceValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_BINDING_TYPE:
				return convertServiceRefProtocolBindingTypeToString(eDataType, instanceValue);
			case JavaeePackage.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE:
				return convertServiceRefProtocolURIAliasTypeToString(eDataType, instanceValue);
			case JavaeePackage.SERVICE_REF_QNAME_PATTERN:
				return convertServiceRefQnamePatternToString(eDataType, instanceValue);
			case JavaeePackage.TRUE_FALSE_TYPE:
				return convertTrueFalseTypeToString(eDataType, instanceValue);
			case JavaeePackage.TRUE_FALSE_TYPE_OBJECT:
				return convertTrueFalseTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayName createDisplayName() {
		DisplayNameImpl displayName = new DisplayNameImpl();
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLocalRef createEjbLocalRef() {
		EjbLocalRefImpl ejbLocalRef = new EjbLocalRefImpl();
		return ejbLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRef createEjbRef() {
		EjbRefImpl ejbRef = new EjbRefImpl();
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType createEmptyType() {
		EmptyTypeImpl emptyType = new EmptyTypeImpl();
		return emptyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntry createEnvEntry() {
		EnvEntryImpl envEntry = new EnvEntryImpl();
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionTarget createInjectionTarget() {
		InjectionTargetImpl injectionTarget = new InjectionTargetImpl();
		return injectionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecycleCallback createLifecycleCallback() {
		LifecycleCallbackImpl lifecycleCallback = new LifecycleCallbackImpl();
		return lifecycleCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listener createListener() {
		ListenerImpl listener = new ListenerImpl();
		return listener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestination createMessageDestination() {
		MessageDestinationImpl messageDestination = new MessageDestinationImpl();
		return messageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationRef createMessageDestinationRef() {
		MessageDestinationRefImpl messageDestinationRef = new MessageDestinationRefImpl();
		return messageDestinationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValue createParamValue() {
		ParamValueImpl paramValue = new ParamValueImpl();
		return paramValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextRef createPersistenceContextRef() {
		PersistenceContextRefImpl persistenceContextRef = new PersistenceContextRefImpl();
		return persistenceContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitRef createPersistenceUnitRef() {
		PersistenceUnitRefImpl persistenceUnitRef = new PersistenceUnitRefImpl();
		return persistenceUnitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortComponentRef createPortComponentRef() {
		PortComponentRefImpl portComponentRef = new PortComponentRefImpl();
		return portComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRef createResourceEnvRef() {
		ResourceEnvRefImpl resourceEnvRef = new ResourceEnvRefImpl();
		return resourceEnvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRef createResourceRef() {
		ResourceRefImpl resourceRef = new ResourceRefImpl();
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAs createRunAs() {
		RunAsImpl runAs = new RunAsImpl();
		return runAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRole createSecurityRole() {
		SecurityRoleImpl securityRole = new SecurityRoleImpl();
		return securityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRef createSecurityRoleRef() {
		SecurityRoleRefImpl securityRoleRef = new SecurityRoleRefImpl();
		return securityRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRef createServiceRef() {
		ServiceRefImpl serviceRef = new ServiceRefImpl();
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandler createServiceRefHandler() {
		ServiceRefHandlerImpl serviceRefHandler = new ServiceRefHandlerImpl();
		return serviceRefHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerChain createServiceRefHandlerChain() {
		ServiceRefHandlerChainImpl serviceRefHandlerChain = new ServiceRefHandlerChainImpl();
		return serviceRefHandlerChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRefHandlerChains createServiceRefHandlerChains() {
		ServiceRefHandlerChainsImpl serviceRefHandlerChains = new ServiceRefHandlerChainsImpl();
		return serviceRefHandlerChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlPatternType createUrlPatternType() {
		UrlPatternTypeImpl urlPatternType = new UrlPatternTypeImpl();
		return urlPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType createEjbRefTypeFromString(EDataType eDataType, String initialValue) {
		EjbRefType result = EjbRefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType createEnvEntryTypeFromString(EDataType eDataType, String initialValue) {
		EnvEntryType result = EnvEntryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageType createMessageDestinationUsageTypeFromString(EDataType eDataType, String initialValue) {
		MessageDestinationUsageType result = MessageDestinationUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextType createPersistenceContextTypeFromString(EDataType eDataType, String initialValue) {
		PersistenceContextType result = PersistenceContextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType createResAuthTypeFromString(EDataType eDataType, String initialValue) {
		ResAuthType result = ResAuthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType createResSharingScopeTypeFromString(EDataType eDataType, String initialValue) {
		ResSharingScopeType result = ResSharingScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDeweyVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeweyVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEJBLinkFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJBLinkToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEjbRefNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefNameTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType createEjbRefTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (EjbRefType)createEjbRefTypeFromString(JavaeePackage.Literals.EJB_REF_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEjbRefTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEjbRefTypeToString(JavaeePackage.Literals.EJB_REF_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType createEnvEntryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (EnvEntryType)createEnvEntryTypeFromString(JavaeePackage.Literals.ENV_ENTRY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvEntryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnvEntryTypeToString(JavaeePackage.Literals.ENV_ENTRY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFullyQualifiedClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullyQualifiedClassTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHomeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHomeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJavaTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createJNDINameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJNDINameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalHomeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalHomeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationLinkFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationLinkToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMessageDestinationTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageType createMessageDestinationUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (MessageDestinationUsageType)createMessageDestinationUsageTypeFromString(JavaeePackage.Literals.MESSAGE_DESTINATION_USAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDestinationUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageDestinationUsageTypeToString(JavaeePackage.Literals.MESSAGE_DESTINATION_USAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceContextType createPersistenceContextTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (PersistenceContextType)createPersistenceContextTypeFromString(JavaeePackage.Literals.PERSISTENCE_CONTEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPersistenceContextTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPersistenceContextTypeToString(JavaeePackage.Literals.PERSISTENCE_CONTEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRemoteFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType createResAuthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ResAuthType)createResAuthTypeFromString(JavaeePackage.Literals.RES_AUTH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResAuthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResAuthTypeToString(JavaeePackage.Literals.RES_AUTH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType createResSharingScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (ResSharingScopeType)createResSharingScopeTypeFromString(JavaeePackage.Literals.RES_SHARING_SCOPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResSharingScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResSharingScopeTypeToString(JavaeePackage.Literals.RES_SHARING_SCOPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoleNameFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createServiceRefProtocolBindingListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List result = new ArrayList();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createServiceRefProtocolBindingTypeFromString(JavaeePackage.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List list = (List)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Iterator i = list.iterator(); i.hasNext(); ) {
			result.append(convertServiceRefProtocolBindingTypeToString(JavaeePackage.Literals.SERVICE_REF_PROTOCOL_BINDING_TYPE, i.next()));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolBindingTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)createServiceRefProtocolURIAliasTypeFromString(JavaeePackage.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolBindingTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		if (JavaeePackage.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertServiceRefProtocolURIAliasTypeToString(JavaeePackage.Literals.SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefProtocolURIAliasTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefProtocolURIAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createServiceRefQnamePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRefQnamePatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTrueFalseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (Boolean)createTrueFalseTypeFromString(JavaeePackage.Literals.TRUE_FALSE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrueFalseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTrueFalseTypeToString(JavaeePackage.Literals.TRUE_FALSE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaeePackage getJavaeePackage() {
		return (JavaeePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static JavaeePackage getPackage() {
		return JavaeePackage.eINSTANCE;
	}

} //JavaeeFactoryImpl
