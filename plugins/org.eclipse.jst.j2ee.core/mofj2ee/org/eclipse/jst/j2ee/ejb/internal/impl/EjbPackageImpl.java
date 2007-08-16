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
package org.eclipse.jst.j2ee.ejb.internal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jem.java.JavaRefPackage;
import org.eclipse.jst.j2ee.application.ApplicationPackage;
import org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl;
import org.eclipse.jst.j2ee.client.ClientPackage;
import org.eclipse.jst.j2ee.client.internal.impl.ClientPackageImpl;
import org.eclipse.jst.j2ee.common.CommonPackage;
import org.eclipse.jst.j2ee.common.internal.impl.CommonPackageImpl;
import org.eclipse.jst.j2ee.ejb.AcknowledgeMode;
import org.eclipse.jst.j2ee.ejb.ActivationConfig;
import org.eclipse.jst.j2ee.ejb.ActivationConfigProperty;
import org.eclipse.jst.j2ee.ejb.AssemblyDescriptor;
import org.eclipse.jst.j2ee.ejb.CMPAttribute;
import org.eclipse.jst.j2ee.ejb.CMRField;
import org.eclipse.jst.j2ee.ejb.ContainerManagedEntity;
import org.eclipse.jst.j2ee.ejb.DestinationType;
import org.eclipse.jst.j2ee.ejb.EJBJar;
import org.eclipse.jst.j2ee.ejb.EJBMethodCategory;
import org.eclipse.jst.j2ee.ejb.EJBRelation;
import org.eclipse.jst.j2ee.ejb.EJBRelationshipRole;
import org.eclipse.jst.j2ee.ejb.EjbFactory;
import org.eclipse.jst.j2ee.ejb.EjbPackage;
import org.eclipse.jst.j2ee.ejb.EnterpriseBean;
import org.eclipse.jst.j2ee.ejb.Entity;
import org.eclipse.jst.j2ee.ejb.ExcludeList;
import org.eclipse.jst.j2ee.ejb.MessageDriven;
import org.eclipse.jst.j2ee.ejb.MessageDrivenDestination;
import org.eclipse.jst.j2ee.ejb.MethodElement;
import org.eclipse.jst.j2ee.ejb.MethodElementKind;
import org.eclipse.jst.j2ee.ejb.MethodPermission;
import org.eclipse.jst.j2ee.ejb.MethodTransaction;
import org.eclipse.jst.j2ee.ejb.MultiplicityKind;
import org.eclipse.jst.j2ee.ejb.Query;
import org.eclipse.jst.j2ee.ejb.QueryMethod;
import org.eclipse.jst.j2ee.ejb.Relationships;
import org.eclipse.jst.j2ee.ejb.ReturnTypeMapping;
import org.eclipse.jst.j2ee.ejb.RoleSource;
import org.eclipse.jst.j2ee.ejb.Session;
import org.eclipse.jst.j2ee.ejb.SessionType;
import org.eclipse.jst.j2ee.ejb.SubscriptionDurabilityKind;
import org.eclipse.jst.j2ee.ejb.TransactionAttributeType;
import org.eclipse.jst.j2ee.ejb.TransactionType;
import org.eclipse.jst.j2ee.jca.JcaPackage;
import org.eclipse.jst.j2ee.jca.internal.impl.JcaPackageImpl;
import org.eclipse.jst.j2ee.jsp.JspPackage;
import org.eclipse.jst.j2ee.jsp.internal.impl.JspPackageImpl;
import org.eclipse.jst.j2ee.taglib.internal.TaglibPackage;
import org.eclipse.jst.j2ee.taglib.internal.impl.TaglibPackageImpl;
import org.eclipse.jst.j2ee.webapplication.WebapplicationPackage;
import org.eclipse.jst.j2ee.webapplication.internal.impl.WebapplicationPackageImpl;
import org.eclipse.jst.j2ee.webservice.wsclient.Webservice_clientPackage;
import org.eclipse.jst.j2ee.webservice.wsclient.internal.impl.Webservice_clientPackageImpl;
import org.eclipse.jst.j2ee.webservice.wscommon.WscommonPackage;
import org.eclipse.jst.j2ee.webservice.wscommon.internal.impl.WscommonPackageImpl;
import org.eclipse.jst.j2ee.webservice.wsdd.WsddPackage;
import org.eclipse.jst.j2ee.webservice.wsdd.internal.impl.WsddPackageImpl;


public class EjbPackageImpl extends EPackageImpl implements EjbPackage, EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerManagedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodPermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enterpriseBeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbMethodCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbJarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmpAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbRelationshipRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmrFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDrivenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDrivenDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConfigPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionAttributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sessionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodElementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acknowledgeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionDurabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnTypeMappingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum destinationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityKindEEnum = null;

		   /**
		 * @generated This field/method will be replaced during code generation.
		 */
	private EjbPackageImpl() {
		super(eNS_URI, EjbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public static EjbPackage init() {
		if (isInited) return (EjbPackage)EPackage.Registry.INSTANCE.getEPackage(EjbPackage.eNS_URI);

		// Obtain or create and register package
		EjbPackageImpl theEjbPackage = (EjbPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EjbPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EjbPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		JavaRefPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ClientPackageImpl theClientPackage = (ClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI) instanceof ClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI) : ClientPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage_1 = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		TaglibPackageImpl theTaglibPackage = (TaglibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaglibPackage.eNS_URI) instanceof TaglibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaglibPackage.eNS_URI) : TaglibPackage.eINSTANCE);
		WebapplicationPackageImpl theWebapplicationPackage = (WebapplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WebapplicationPackage.eNS_URI) instanceof WebapplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WebapplicationPackage.eNS_URI) : WebapplicationPackage.eINSTANCE);
		JcaPackageImpl theJcaPackage = (JcaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) instanceof JcaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JcaPackage.eNS_URI) : JcaPackage.eINSTANCE);
		Webservice_clientPackageImpl theWebservice_clientPackage = (Webservice_clientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Webservice_clientPackage.eNS_URI) instanceof Webservice_clientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Webservice_clientPackage.eNS_URI) : Webservice_clientPackage.eINSTANCE);
		JspPackageImpl theJspPackage = (JspPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JspPackage.eNS_URI) instanceof JspPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JspPackage.eNS_URI) : JspPackage.eINSTANCE);
		WscommonPackageImpl theWscommonPackage = (WscommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WscommonPackage.eNS_URI) instanceof WscommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WscommonPackage.eNS_URI) : WscommonPackage.eINSTANCE);
		WsddPackageImpl theWsddPackage = (WsddPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WsddPackage.eNS_URI) instanceof WsddPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WsddPackage.eNS_URI) : WsddPackage.eINSTANCE);

		// Create package meta-data objects
		theEjbPackage.createPackageContents();
		theClientPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theApplicationPackage_1.createPackageContents();
		theCommonPackage.createPackageContents();
		theTaglibPackage.createPackageContents();
		theWebapplicationPackage.createPackageContents();
		theJcaPackage.createPackageContents();
		theWebservice_clientPackage.createPackageContents();
		theJspPackage.createPackageContents();
		theWscommonPackage.createPackageContents();
		theWsddPackage.createPackageContents();

		// Initialize created meta-data
		theEjbPackage.initializePackageContents();
		theClientPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theApplicationPackage_1.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theTaglibPackage.initializePackageContents();
		theWebapplicationPackage.initializePackageContents();
		theJcaPackage.initializePackageContents();
		theWebservice_clientPackage.initializePackageContents();
		theJspPackage.initializePackageContents();
		theWscommonPackage.initializePackageContents();
		theWsddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEjbPackage.freeze();

		return theEjbPackage;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getMethodPermission() {
		return methodPermissionEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodPermission_Description() {
		return (EAttribute)methodPermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodPermission_Unchecked() {
		return (EAttribute)methodPermissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodPermission_AssemblyDescriptor() {
		return (EReference)methodPermissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodPermission_Roles() {
		return (EReference)methodPermissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodPermission_MethodElements() {
		return (EReference)methodPermissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodPermission_Descriptions() {
		return (EReference)methodPermissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getAssemblyDescriptor() {
		return assemblyDescriptorEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getAssemblyDescriptor_MethodPermissions() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getAssemblyDescriptor_MethodTransactions() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getAssemblyDescriptor_EjbJar() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getAssemblyDescriptor_SecurityRoles() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getAssemblyDescriptor_ExcludeList() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyDescriptor_MessageDestinations() {
		return (EReference)assemblyDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getMethodTransaction() {
		return methodTransactionEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodTransaction_TransactionAttribute() {
		return (EAttribute)methodTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodTransaction_Description() {
		return (EAttribute)methodTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodTransaction_AssemblyDescriptor() {
		return (EReference)methodTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodTransaction_MethodElements() {
		return (EReference)methodTransactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodTransaction_Descriptions() {
		return (EReference)methodTransactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEnterpriseBean() {
		return enterpriseBeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnterpriseBean_Name() {
		return (EAttribute)enterpriseBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_SecurityRoleRefs() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_EjbClass() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_HomeInterface() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_RemoteInterface() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_EjbJar() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_SecurityIdentity() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_LocalHomeInterface() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEnterpriseBean_LocalInterface() {
		return (EReference)enterpriseBeanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Reentrant() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEntity_PrimaryKey() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getContainerManagedEntity() {
		return containerManagedEntityEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getContainerManagedEntity_Version() {
		return (EAttribute)containerManagedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getContainerManagedEntity_AbstractSchemaName() {
		return (EAttribute)containerManagedEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getContainerManagedEntity_PersistentAttributes() {
		return (EReference)containerManagedEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getContainerManagedEntity_KeyAttributes() {
		return (EReference)containerManagedEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerManagedEntity_Queries() {
		return (EReference)containerManagedEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerManagedEntity_CMPAttribute() {
		return (EReference)containerManagedEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerManagedEntity_PrimKeyField() {
		return (EReference)containerManagedEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getCMPAttribute() {
		return cmpAttributeEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getCMPAttribute_Description() {
		return (EAttribute)cmpAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCMPAttribute_Descriptions() {
		return (EReference)cmpAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getCMRField() {
		return cmrFieldEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getCMRField_Role() {
		return (EReference)cmrFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getCMRField_CollectionType() {
		return (EReference)cmrFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEJBRelationshipRole() {
		return ejbRelationshipRoleEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelationshipRole_Description() {
		return (EAttribute)ejbRelationshipRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelationshipRole_RoleName() {
		return (EAttribute)ejbRelationshipRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelationshipRole_Multiplicity() {
		return (EAttribute)ejbRelationshipRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelationshipRole_CascadeDelete() {
		return (EAttribute)ejbRelationshipRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBRelationshipRole_Relationship() {
		return (EReference)ejbRelationshipRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBRelationshipRole_Source() {
		return (EReference)ejbRelationshipRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBRelationshipRole_CmrField() {
		return (EReference)ejbRelationshipRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJBRelationshipRole_Descriptions() {
		return (EReference)ejbRelationshipRoleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEJBRelation() {
		return ejbRelationEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelation_Description() {
		return (EAttribute)ejbRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBRelation_Name() {
		return (EAttribute)ejbRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBRelation_RelationshipList() {
		return (EReference)ejbRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBRelation_RelationshipRoles() {
		return (EReference)ejbRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEJBRelation_Descriptions() {
		return (EReference)ejbRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getRelationships() {
		return relationshipsEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getRelationships_Description() {
		return (EAttribute)relationshipsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getRelationships_EjbJar() {
		return (EReference)relationshipsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getRelationships_EjbRelations() {
		return (EReference)relationshipsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationships_Descriptions() {
		return (EReference)relationshipsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEJBJar() {
		return ejbJarEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getEJBJar_EjbClientJar() {
		return (EAttribute)ejbJarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEJBJar_Version() {
		return (EAttribute)ejbJarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBJar_AssemblyDescriptor() {
		return (EReference)ejbJarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBJar_EnterpriseBeans() {
		return (EReference)ejbJarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getEJBJar_RelationshipList() {
		return (EReference)ejbJarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getRoleSource() {
		return roleSourceEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getRoleSource_Description() {
		return (EAttribute)roleSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getRoleSource_Role() {
		return (EReference)roleSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getRoleSource_EntityBean() {
		return (EReference)roleSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSource_Descriptions() {
		return (EReference)roleSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getQuery_Description() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getQuery_EjbQL() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getQuery_ReturnTypeMapping() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getQuery_QueryMethod() {
		return (EReference)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getQuery_Entity() {
		return (EReference)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Descriptions() {
		return (EReference)queryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getQueryMethod() {
		return queryMethodEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getQueryMethod_Query() {
		return (EReference)queryMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfigProperty() {
		return activationConfigPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigProperty_Value() {
		return (EAttribute)activationConfigPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConfigProperty_Name() {
		return (EAttribute)activationConfigPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConfig() {
		return activationConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfig_ConfigProperties() {
		return (EReference)activationConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationConfig_Descriptions() {
		return (EReference)activationConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getMethodElement() {
		return methodElementEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodElement_Name() {
		return (EAttribute)methodElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodElement_Parms() {
		return (EAttribute)methodElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodElement_Type() {
		return (EAttribute)methodElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMethodElement_Description() {
		return (EAttribute)methodElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMethodElement_EnterpriseBean() {
		return (EReference)methodElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodElement_Descriptions() {
		return (EReference)methodElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getExcludeList() {
		return excludeListEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getExcludeList_Description() {
		return (EAttribute)excludeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getExcludeList_MethodElements() {
		return (EReference)excludeListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcludeList_Descriptions() {
		return (EReference)excludeListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getSession_TransactionType() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getSession_SessionType() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_ServiceEndpoint() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getMessageDriven() {
		return messageDrivenEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMessageDriven_TransactionType() {
		return (EAttribute)messageDrivenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMessageDriven_MessageSelector() {
		return (EAttribute)messageDrivenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMessageDriven_AcknowledgeMode() {
		return (EAttribute)messageDrivenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMessageDriven_Destination() {
		return (EReference)messageDrivenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDriven_ActivationConfig() {
		return (EReference)messageDrivenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDriven_MessageDestination() {
		return (EReference)messageDrivenEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageDriven_Link() {
		return (EAttribute)messageDrivenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageDriven_MessagingType() {
		return (EReference)messageDrivenEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getMessageDrivenDestination() {
		return messageDrivenDestinationEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMessageDrivenDestination_Type() {
		return (EAttribute)messageDrivenDestinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getMessageDrivenDestination_SubscriptionDurability() {
		return (EAttribute)messageDrivenDestinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getMessageDrivenDestination_Bean() {
		return (EReference)messageDrivenDestinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getEJBMethodCategory() {
		return ejbMethodCategoryEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getTransactionAttributeType() {
		return transactionAttributeTypeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getMultiplicityKind() {
		return multiplicityKindEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getReturnTypeMapping() {
		return returnTypeMappingEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getMethodElementKind() {
		return methodElementKindEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getTransactionType() {
		return transactionTypeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getAcknowledgeMode() {
		return acknowledgeModeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getDestinationType() {
		return destinationTypeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getSubscriptionDurabilityKind() {
		return subscriptionDurabilityKindEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getSessionType() {
		return sessionTypeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EjbFactory getEjbFactory() {
		return (EjbFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		containerManagedEntityEClass = createEClass(CONTAINER_MANAGED_ENTITY);
		createEAttribute(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__VERSION);
		createEAttribute(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__ABSTRACT_SCHEMA_NAME);
		createEReference(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__PERSISTENT_ATTRIBUTES);
		createEReference(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__KEY_ATTRIBUTES);
		createEReference(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__QUERIES);
		createEReference(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__CMP_ATTRIBUTE);
		createEReference(containerManagedEntityEClass, CONTAINER_MANAGED_ENTITY__PRIM_KEY_FIELD);

		methodPermissionEClass = createEClass(METHOD_PERMISSION);
		createEAttribute(methodPermissionEClass, METHOD_PERMISSION__DESCRIPTION);
		createEAttribute(methodPermissionEClass, METHOD_PERMISSION__UNCHECKED);
		createEReference(methodPermissionEClass, METHOD_PERMISSION__ASSEMBLY_DESCRIPTOR);
		createEReference(methodPermissionEClass, METHOD_PERMISSION__ROLES);
		createEReference(methodPermissionEClass, METHOD_PERMISSION__METHOD_ELEMENTS);
		createEReference(methodPermissionEClass, METHOD_PERMISSION__DESCRIPTIONS);

		assemblyDescriptorEClass = createEClass(ASSEMBLY_DESCRIPTOR);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__METHOD_PERMISSIONS);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__METHOD_TRANSACTIONS);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__EJB_JAR);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__SECURITY_ROLES);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__EXCLUDE_LIST);
		createEReference(assemblyDescriptorEClass, ASSEMBLY_DESCRIPTOR__MESSAGE_DESTINATIONS);

		methodTransactionEClass = createEClass(METHOD_TRANSACTION);
		createEAttribute(methodTransactionEClass, METHOD_TRANSACTION__TRANSACTION_ATTRIBUTE);
		createEAttribute(methodTransactionEClass, METHOD_TRANSACTION__DESCRIPTION);
		createEReference(methodTransactionEClass, METHOD_TRANSACTION__ASSEMBLY_DESCRIPTOR);
		createEReference(methodTransactionEClass, METHOD_TRANSACTION__METHOD_ELEMENTS);
		createEReference(methodTransactionEClass, METHOD_TRANSACTION__DESCRIPTIONS);

		sessionEClass = createEClass(SESSION);
		createEAttribute(sessionEClass, SESSION__TRANSACTION_TYPE);
		createEAttribute(sessionEClass, SESSION__SESSION_TYPE);
		createEReference(sessionEClass, SESSION__SERVICE_ENDPOINT);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__REENTRANT);
		createEReference(entityEClass, ENTITY__PRIMARY_KEY);

		enterpriseBeanEClass = createEClass(ENTERPRISE_BEAN);
		createEAttribute(enterpriseBeanEClass, ENTERPRISE_BEAN__NAME);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__SECURITY_ROLE_REFS);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__EJB_CLASS);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__HOME_INTERFACE);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__REMOTE_INTERFACE);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__EJB_JAR);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__SECURITY_IDENTITY);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__LOCAL_HOME_INTERFACE);
		createEReference(enterpriseBeanEClass, ENTERPRISE_BEAN__LOCAL_INTERFACE);

		ejbMethodCategoryEClass = createEClass(EJB_METHOD_CATEGORY);

		ejbJarEClass = createEClass(EJB_JAR);
		createEAttribute(ejbJarEClass, EJB_JAR__EJB_CLIENT_JAR);
		createEAttribute(ejbJarEClass, EJB_JAR__VERSION);
		createEReference(ejbJarEClass, EJB_JAR__ASSEMBLY_DESCRIPTOR);
		createEReference(ejbJarEClass, EJB_JAR__ENTERPRISE_BEANS);
		createEReference(ejbJarEClass, EJB_JAR__RELATIONSHIP_LIST);

		methodElementEClass = createEClass(METHOD_ELEMENT);
		createEAttribute(methodElementEClass, METHOD_ELEMENT__NAME);
		createEAttribute(methodElementEClass, METHOD_ELEMENT__PARMS);
		createEAttribute(methodElementEClass, METHOD_ELEMENT__TYPE);
		createEAttribute(methodElementEClass, METHOD_ELEMENT__DESCRIPTION);
		createEReference(methodElementEClass, METHOD_ELEMENT__ENTERPRISE_BEAN);
		createEReference(methodElementEClass, METHOD_ELEMENT__DESCRIPTIONS);

		cmpAttributeEClass = createEClass(CMP_ATTRIBUTE);
		createEAttribute(cmpAttributeEClass, CMP_ATTRIBUTE__DESCRIPTION);
		createEReference(cmpAttributeEClass, CMP_ATTRIBUTE__DESCRIPTIONS);

		relationshipsEClass = createEClass(RELATIONSHIPS);
		createEAttribute(relationshipsEClass, RELATIONSHIPS__DESCRIPTION);
		createEReference(relationshipsEClass, RELATIONSHIPS__EJB_JAR);
		createEReference(relationshipsEClass, RELATIONSHIPS__EJB_RELATIONS);
		createEReference(relationshipsEClass, RELATIONSHIPS__DESCRIPTIONS);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__DESCRIPTION);
		createEAttribute(queryEClass, QUERY__EJB_QL);
		createEAttribute(queryEClass, QUERY__RETURN_TYPE_MAPPING);
		createEReference(queryEClass, QUERY__QUERY_METHOD);
		createEReference(queryEClass, QUERY__ENTITY);
		createEReference(queryEClass, QUERY__DESCRIPTIONS);

		ejbRelationEClass = createEClass(EJB_RELATION);
		createEAttribute(ejbRelationEClass, EJB_RELATION__DESCRIPTION);
		createEAttribute(ejbRelationEClass, EJB_RELATION__NAME);
		createEReference(ejbRelationEClass, EJB_RELATION__RELATIONSHIP_LIST);
		createEReference(ejbRelationEClass, EJB_RELATION__RELATIONSHIP_ROLES);
		createEReference(ejbRelationEClass, EJB_RELATION__DESCRIPTIONS);

		ejbRelationshipRoleEClass = createEClass(EJB_RELATIONSHIP_ROLE);
		createEAttribute(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__DESCRIPTION);
		createEAttribute(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__ROLE_NAME);
		createEAttribute(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__MULTIPLICITY);
		createEAttribute(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__CASCADE_DELETE);
		createEReference(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__RELATIONSHIP);
		createEReference(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__SOURCE);
		createEReference(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__CMR_FIELD);
		createEReference(ejbRelationshipRoleEClass, EJB_RELATIONSHIP_ROLE__DESCRIPTIONS);

		roleSourceEClass = createEClass(ROLE_SOURCE);
		createEAttribute(roleSourceEClass, ROLE_SOURCE__DESCRIPTION);
		createEReference(roleSourceEClass, ROLE_SOURCE__ROLE);
		createEReference(roleSourceEClass, ROLE_SOURCE__ENTITY_BEAN);
		createEReference(roleSourceEClass, ROLE_SOURCE__DESCRIPTIONS);

		cmrFieldEClass = createEClass(CMR_FIELD);
		createEReference(cmrFieldEClass, CMR_FIELD__ROLE);
		createEReference(cmrFieldEClass, CMR_FIELD__COLLECTION_TYPE);

		messageDrivenEClass = createEClass(MESSAGE_DRIVEN);
		createEAttribute(messageDrivenEClass, MESSAGE_DRIVEN__TRANSACTION_TYPE);
		createEAttribute(messageDrivenEClass, MESSAGE_DRIVEN__MESSAGE_SELECTOR);
		createEAttribute(messageDrivenEClass, MESSAGE_DRIVEN__ACKNOWLEDGE_MODE);
		createEAttribute(messageDrivenEClass, MESSAGE_DRIVEN__LINK);
		createEReference(messageDrivenEClass, MESSAGE_DRIVEN__DESTINATION);
		createEReference(messageDrivenEClass, MESSAGE_DRIVEN__ACTIVATION_CONFIG);
		createEReference(messageDrivenEClass, MESSAGE_DRIVEN__MESSAGE_DESTINATION);
		createEReference(messageDrivenEClass, MESSAGE_DRIVEN__MESSAGING_TYPE);

		messageDrivenDestinationEClass = createEClass(MESSAGE_DRIVEN_DESTINATION);
		createEAttribute(messageDrivenDestinationEClass, MESSAGE_DRIVEN_DESTINATION__TYPE);
		createEAttribute(messageDrivenDestinationEClass, MESSAGE_DRIVEN_DESTINATION__SUBSCRIPTION_DURABILITY);
		createEReference(messageDrivenDestinationEClass, MESSAGE_DRIVEN_DESTINATION__BEAN);

		excludeListEClass = createEClass(EXCLUDE_LIST);
		createEAttribute(excludeListEClass, EXCLUDE_LIST__DESCRIPTION);
		createEReference(excludeListEClass, EXCLUDE_LIST__METHOD_ELEMENTS);
		createEReference(excludeListEClass, EXCLUDE_LIST__DESCRIPTIONS);

		queryMethodEClass = createEClass(QUERY_METHOD);
		createEReference(queryMethodEClass, QUERY_METHOD__QUERY);

		activationConfigPropertyEClass = createEClass(ACTIVATION_CONFIG_PROPERTY);
		createEAttribute(activationConfigPropertyEClass, ACTIVATION_CONFIG_PROPERTY__VALUE);
		createEAttribute(activationConfigPropertyEClass, ACTIVATION_CONFIG_PROPERTY__NAME);

		activationConfigEClass = createEClass(ACTIVATION_CONFIG);
		createEReference(activationConfigEClass, ACTIVATION_CONFIG__CONFIG_PROPERTIES);
		createEReference(activationConfigEClass, ACTIVATION_CONFIG__DESCRIPTIONS);

		// Create enums
		transactionAttributeTypeEEnum = createEEnum(TRANSACTION_ATTRIBUTE_TYPE);
		transactionTypeEEnum = createEEnum(TRANSACTION_TYPE);
		sessionTypeEEnum = createEEnum(SESSION_TYPE);
		methodElementKindEEnum = createEEnum(METHOD_ELEMENT_KIND);
		acknowledgeModeEEnum = createEEnum(ACKNOWLEDGE_MODE);
		subscriptionDurabilityKindEEnum = createEEnum(SUBSCRIPTION_DURABILITY_KIND);
		returnTypeMappingEEnum = createEEnum(RETURN_TYPE_MAPPING);
		destinationTypeEEnum = createEEnum(DESTINATION_TYPE);
		multiplicityKindEEnum = createEEnum(MULTIPLICITY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		JavaRefPackage theJavaRefPackage = (JavaRefPackage)EPackage.Registry.INSTANCE.getEPackage(JavaRefPackage.eNS_URI);

		// Add supertypes to classes
		containerManagedEntityEClass.getESuperTypes().add(this.getEntity());
		methodPermissionEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		assemblyDescriptorEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		methodTransactionEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		sessionEClass.getESuperTypes().add(this.getEnterpriseBean());
		entityEClass.getESuperTypes().add(this.getEnterpriseBean());
		enterpriseBeanEClass.getESuperTypes().add(theCommonPackage.getJNDIEnvRefsGroup());
		ejbMethodCategoryEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		ejbJarEClass.getESuperTypes().add(theCommonPackage.getCompatibilityDescriptionGroup());
		methodElementEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		cmpAttributeEClass.getESuperTypes().add(theCommonPackage.getJ2EEEAttribute());
		relationshipsEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		queryEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		ejbRelationEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		ejbRelationshipRoleEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		roleSourceEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		cmrFieldEClass.getESuperTypes().add(this.getCMPAttribute());
		messageDrivenEClass.getESuperTypes().add(this.getEnterpriseBean());
		messageDrivenDestinationEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		excludeListEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		queryMethodEClass.getESuperTypes().add(this.getMethodElement());
		activationConfigPropertyEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
		activationConfigEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());

		// Initialize classes and features; add operations and parameters
		initEClass(containerManagedEntityEClass, ContainerManagedEntity.class, "ContainerManagedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerManagedEntity_Version(), ecorePackage.getEString(), "version", "2.x", 0, 1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerManagedEntity_AbstractSchemaName(), ecorePackage.getEString(), "abstractSchemaName", null, 0, 1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerManagedEntity_PersistentAttributes(), this.getCMPAttribute(), null, "persistentAttributes", null, 0, -1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerManagedEntity_KeyAttributes(), this.getCMPAttribute(), null, "keyAttributes", null, 0, -1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerManagedEntity_Queries(), this.getQuery(), this.getQuery_Entity(), "queries", null, 0, -1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerManagedEntity_CMPAttribute(), this.getCMPAttribute(), null, "CMPAttribute", null, 0, -1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerManagedEntity_PrimKeyField(), this.getCMPAttribute(), null, "primKeyField", null, 0, 1, ContainerManagedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodPermissionEClass, MethodPermission.class, "MethodPermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodPermission_Description(), ecorePackage.getEString(), "description", null, 0, 1, MethodPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodPermission_Unchecked(), ecorePackage.getEBoolean(), "unchecked", null, 0, 1, MethodPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPermission_AssemblyDescriptor(), this.getAssemblyDescriptor(), this.getAssemblyDescriptor_MethodPermissions(), "assemblyDescriptor", null, 1, 1, MethodPermission.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPermission_Roles(), theCommonPackage.getSecurityRole(), null, "roles", null, 1, -1, MethodPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPermission_MethodElements(), this.getMethodElement(), null, "methodElements", null, 1, -1, MethodPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodPermission_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, MethodPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyDescriptorEClass, AssemblyDescriptor.class, "AssemblyDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyDescriptor_MethodPermissions(), this.getMethodPermission(), this.getMethodPermission_AssemblyDescriptor(), "methodPermissions", null, 0, -1, AssemblyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDescriptor_MethodTransactions(), this.getMethodTransaction(), this.getMethodTransaction_AssemblyDescriptor(), "methodTransactions", null, 0, -1, AssemblyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDescriptor_EjbJar(), this.getEJBJar(), this.getEJBJar_AssemblyDescriptor(), "ejbJar", null, 0, 1, AssemblyDescriptor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDescriptor_SecurityRoles(), theCommonPackage.getSecurityRole(), null, "securityRoles", null, 0, -1, AssemblyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDescriptor_ExcludeList(), this.getExcludeList(), null, "excludeList", null, 0, 1, AssemblyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyDescriptor_MessageDestinations(), theCommonPackage.getMessageDestination(), null, "messageDestinations", null, 0, -1, AssemblyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodTransactionEClass, MethodTransaction.class, "MethodTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodTransaction_TransactionAttribute(), this.getTransactionAttributeType(), "transactionAttribute", null, 0, 1, MethodTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodTransaction_Description(), ecorePackage.getEString(), "description", null, 0, 1, MethodTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodTransaction_AssemblyDescriptor(), this.getAssemblyDescriptor(), this.getAssemblyDescriptor_MethodTransactions(), "assemblyDescriptor", null, 1, 1, MethodTransaction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodTransaction_MethodElements(), this.getMethodElement(), null, "methodElements", null, 1, -1, MethodTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodTransaction_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, MethodTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSession_TransactionType(), this.getTransactionType(), "transactionType", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSession_SessionType(), this.getSessionType(), "sessionType", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_ServiceEndpoint(), theJavaRefPackage.getJavaClass(), null, "serviceEndpoint", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Reentrant(), ecorePackage.getEBoolean(), "reentrant", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_PrimaryKey(), theJavaRefPackage.getJavaClass(), null, "primaryKey", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enterpriseBeanEClass, EnterpriseBean.class, "EnterpriseBean", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnterpriseBean_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_SecurityRoleRefs(), theCommonPackage.getSecurityRoleRef(), null, "securityRoleRefs", null, 0, -1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_EjbClass(), theJavaRefPackage.getJavaClass(), null, "ejbClass", null, 1, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_HomeInterface(), theJavaRefPackage.getJavaClass(), null, "homeInterface", null, 1, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_RemoteInterface(), theJavaRefPackage.getJavaClass(), null, "remoteInterface", null, 1, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_EjbJar(), this.getEJBJar(), this.getEJBJar_EnterpriseBeans(), "ejbJar", null, 1, 1, EnterpriseBean.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_SecurityIdentity(), theCommonPackage.getSecurityIdentity(), null, "securityIdentity", null, 0, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_LocalHomeInterface(), theJavaRefPackage.getJavaClass(), null, "localHomeInterface", null, 0, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnterpriseBean_LocalInterface(), theJavaRefPackage.getJavaClass(), null, "localInterface", null, 0, 1, EnterpriseBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbMethodCategoryEClass, EJBMethodCategory.class, "EJBMethodCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ejbJarEClass, EJBJar.class, "EJBJar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJBJar_EjbClientJar(), ecorePackage.getEString(), "ejbClientJar", null, 0, 1, EJBJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBJar_Version(), ecorePackage.getEString(), "version", null, 0, 1, EJBJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBJar_AssemblyDescriptor(), this.getAssemblyDescriptor(), this.getAssemblyDescriptor_EjbJar(), "assemblyDescriptor", null, 0, 1, EJBJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBJar_EnterpriseBeans(), this.getEnterpriseBean(), this.getEnterpriseBean_EjbJar(), "enterpriseBeans", null, 1, -1, EJBJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBJar_RelationshipList(), this.getRelationships(), this.getRelationships_EjbJar(), "relationshipList", null, 0, 1, EJBJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodElementEClass, MethodElement.class, "MethodElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodElement_Parms(), ecorePackage.getEString(), "parms", null, 0, 1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodElement_Type(), this.getMethodElementKind(), "type", null, 0, 1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodElement_EnterpriseBean(), this.getEnterpriseBean(), null, "enterpriseBean", null, 1, 1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodElement_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, MethodElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmpAttributeEClass, CMPAttribute.class, "CMPAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCMPAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, CMPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMPAttribute_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, CMPAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipsEClass, Relationships.class, "Relationships", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationships_Description(), ecorePackage.getEString(), "description", null, 0, 1, Relationships.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_EjbJar(), this.getEJBJar(), this.getEJBJar_RelationshipList(), "ejbJar", null, 1, 1, Relationships.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_EjbRelations(), this.getEJBRelation(), this.getEJBRelation_RelationshipList(), "ejbRelations", null, 0, -1, Relationships.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationships_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, Relationships.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Description(), ecorePackage.getEString(), "description", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_EjbQL(), ecorePackage.getEString(), "ejbQL", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_ReturnTypeMapping(), this.getReturnTypeMapping(), "returnTypeMapping", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_QueryMethod(), this.getQueryMethod(), this.getQueryMethod_Query(), "queryMethod", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Entity(), this.getContainerManagedEntity(), this.getContainerManagedEntity_Queries(), "entity", null, 0, 1, Query.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbRelationEClass, EJBRelation.class, "EJBRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJBRelation_Description(), ecorePackage.getEString(), "description", null, 0, 1, EJBRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EJBRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelation_RelationshipList(), this.getRelationships(), this.getRelationships_EjbRelations(), "relationshipList", null, 0, 1, EJBRelation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelation_RelationshipRoles(), this.getEJBRelationshipRole(), this.getEJBRelationshipRole_Relationship(), "relationshipRoles", null, 2, 2, EJBRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelation_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, EJBRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbRelationshipRoleEClass, EJBRelationshipRole.class, "EJBRelationshipRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEJBRelationshipRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBRelationshipRole_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBRelationshipRole_Multiplicity(), this.getMultiplicityKind(), "multiplicity", null, 0, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEJBRelationshipRole_CascadeDelete(), ecorePackage.getEBoolean(), "cascadeDelete", null, 0, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelationshipRole_Relationship(), this.getEJBRelation(), this.getEJBRelation_RelationshipRoles(), "relationship", null, 1, 1, EJBRelationshipRole.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelationshipRole_Source(), this.getRoleSource(), this.getRoleSource_Role(), "source", null, 1, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelationshipRole_CmrField(), this.getCMRField(), this.getCMRField_Role(), "cmrField", null, 1, 1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEJBRelationshipRole_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, EJBRelationshipRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleSourceEClass, RoleSource.class, "RoleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleSource_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoleSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSource_Role(), this.getEJBRelationshipRole(), this.getEJBRelationshipRole_Source(), "role", null, 1, 1, RoleSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSource_EntityBean(), this.getContainerManagedEntity(), null, "entityBean", null, 1, 1, RoleSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSource_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, RoleSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmrFieldEClass, CMRField.class, "CMRField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCMRField_Role(), this.getEJBRelationshipRole(), this.getEJBRelationshipRole_CmrField(), "role", null, 0, 1, CMRField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCMRField_CollectionType(), theJavaRefPackage.getJavaClass(), null, "collectionType", null, 0, 1, CMRField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDrivenEClass, MessageDriven.class, "MessageDriven", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDriven_TransactionType(), this.getTransactionType(), "transactionType", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDriven_MessageSelector(), ecorePackage.getEString(), "messageSelector", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDriven_AcknowledgeMode(), this.getAcknowledgeMode(), "acknowledgeMode", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDriven_Link(), ecorePackage.getEString(), "link", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDriven_Destination(), this.getMessageDrivenDestination(), this.getMessageDrivenDestination_Bean(), "destination", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDriven_ActivationConfig(), this.getActivationConfig(), null, "activationConfig", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDriven_MessageDestination(), theJavaRefPackage.getJavaClass(), null, "messageDestination", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDriven_MessagingType(), theJavaRefPackage.getJavaClass(), null, "messagingType", null, 0, 1, MessageDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageDrivenDestinationEClass, MessageDrivenDestination.class, "MessageDrivenDestination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageDrivenDestination_Type(), this.getDestinationType(), "type", null, 0, 1, MessageDrivenDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageDrivenDestination_SubscriptionDurability(), this.getSubscriptionDurabilityKind(), "subscriptionDurability", null, 0, 1, MessageDrivenDestination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageDrivenDestination_Bean(), this.getMessageDriven(), this.getMessageDriven_Destination(), "bean", null, 1, 1, MessageDrivenDestination.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeListEClass, ExcludeList.class, "ExcludeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcludeList_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExcludeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcludeList_MethodElements(), this.getMethodElement(), null, "methodElements", null, 1, -1, ExcludeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcludeList_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, ExcludeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryMethodEClass, QueryMethod.class, "QueryMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryMethod_Query(), this.getQuery(), this.getQuery_QueryMethod(), "query", null, 1, 1, QueryMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationConfigPropertyEClass, ActivationConfigProperty.class, "ActivationConfigProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationConfigProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, ActivationConfigProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationConfigProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivationConfigProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationConfigEClass, ActivationConfig.class, "ActivationConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivationConfig_ConfigProperties(), this.getActivationConfigProperty(), null, "configProperties", null, 1, -1, ActivationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationConfig_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, ActivationConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transactionAttributeTypeEEnum, TransactionAttributeType.class, "TransactionAttributeType");
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.NOT_SUPPORTED_LITERAL);
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.SUPPORTS_LITERAL);
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.REQUIRED_LITERAL);
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.REQUIRES_NEW_LITERAL);
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.MANDATORY_LITERAL);
		addEEnumLiteral(transactionAttributeTypeEEnum, TransactionAttributeType.NEVER_LITERAL);

		initEEnum(transactionTypeEEnum, TransactionType.class, "TransactionType");
		addEEnumLiteral(transactionTypeEEnum, TransactionType.BEAN_LITERAL);
		addEEnumLiteral(transactionTypeEEnum, TransactionType.CONTAINER_LITERAL);

		initEEnum(sessionTypeEEnum, SessionType.class, "SessionType");
		addEEnumLiteral(sessionTypeEEnum, SessionType.STATEFUL_LITERAL);
		addEEnumLiteral(sessionTypeEEnum, SessionType.STATELESS_LITERAL);

		initEEnum(methodElementKindEEnum, MethodElementKind.class, "MethodElementKind");
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.UNSPECIFIED_LITERAL);
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.REMOTE_LITERAL);
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.HOME_LITERAL);
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.LOCAL_LITERAL);
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.LOCAL_HOME_LITERAL);
		addEEnumLiteral(methodElementKindEEnum, MethodElementKind.SERVICE_ENDPOINT_LITERAL);

		initEEnum(acknowledgeModeEEnum, AcknowledgeMode.class, "AcknowledgeMode");
		addEEnumLiteral(acknowledgeModeEEnum, AcknowledgeMode.AUTO_ACKNOWLEDGE_LITERAL);
		addEEnumLiteral(acknowledgeModeEEnum, AcknowledgeMode.DUPS_OK_ACKNOWLEDGE_LITERAL);

		initEEnum(subscriptionDurabilityKindEEnum, SubscriptionDurabilityKind.class, "SubscriptionDurabilityKind");
		addEEnumLiteral(subscriptionDurabilityKindEEnum, SubscriptionDurabilityKind.DURABLE_LITERAL);
		addEEnumLiteral(subscriptionDurabilityKindEEnum, SubscriptionDurabilityKind.NON_DURABLE_LITERAL);

		initEEnum(returnTypeMappingEEnum, ReturnTypeMapping.class, "ReturnTypeMapping");
		addEEnumLiteral(returnTypeMappingEEnum, ReturnTypeMapping.LOCAL_LITERAL);
		addEEnumLiteral(returnTypeMappingEEnum, ReturnTypeMapping.REMOTE_LITERAL);

		initEEnum(destinationTypeEEnum, DestinationType.class, "DestinationType");
		addEEnumLiteral(destinationTypeEEnum, DestinationType.QUEUE_LITERAL);
		addEEnumLiteral(destinationTypeEEnum, DestinationType.TOPIC_LITERAL);

		initEEnum(multiplicityKindEEnum, MultiplicityKind.class, "MultiplicityKind");
		addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.ONE_LITERAL);
		addEEnumLiteral(multiplicityKindEEnum, MultiplicityKind.MANY_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //EjbPackageImpl








