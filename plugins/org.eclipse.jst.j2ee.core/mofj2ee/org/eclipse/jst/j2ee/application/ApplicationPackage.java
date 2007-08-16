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
package org.eclipse.jst.j2ee.application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jst.j2ee.common.CommonPackage;


/**
 * <p>
 * <b>Note:</b> This class/interface is part of an interim API that is still under development and expected to
 * change significantly before reaching stability. It is being made available at this early stage to solicit feedback
 * from pioneering adopters on the understanding that any code that uses this API will almost certainly be broken
 * (repeatedly) as the API evolves.
 * </p>
 *	@since 1.0
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application"; //$NON-NLS-1$

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION = 0;
	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ICONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__ICONS;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DISPLAY_NAMES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTIONS = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTIONS;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__SMALL_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__SMALL_ICON;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__LARGE_ICON = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__LARGE_ICON;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__DESCRIPTION = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTION;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__DISPLAY_NAME = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAME;
	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 0;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__SECURITY_ROLES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 1;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int APPLICATION__MODULES = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP_FEATURE_COUNT + 3;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int MODULE = 1;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int MODULE__URI = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 0;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int MODULE__ALT_DD = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 1;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int MODULE__APPLICATION = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CommonPackage.J2EEE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int WEB_MODULE = 2;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int WEB_MODULE__URI = ApplicationPackage.MODULE__URI;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int WEB_MODULE__ALT_DD = ApplicationPackage.MODULE__ALT_DD;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int WEB_MODULE__APPLICATION = ApplicationPackage.MODULE__APPLICATION;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int WEB_MODULE__CONTEXT_ROOT = ApplicationPackage.MODULE_FEATURE_COUNT + 0;
	/**
	 * The number of structural features of the '<em>Web Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_MODULE_FEATURE_COUNT = ApplicationPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int JAVA_CLIENT_MODULE = 3;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int JAVA_CLIENT_MODULE__URI = ApplicationPackage.MODULE__URI;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int JAVA_CLIENT_MODULE__ALT_DD = ApplicationPackage.MODULE__ALT_DD;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int JAVA_CLIENT_MODULE__APPLICATION = ApplicationPackage.MODULE__APPLICATION;

	/**
	 * The number of structural features of the '<em>Java Client Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLIENT_MODULE_FEATURE_COUNT = ApplicationPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int EJB_MODULE = 4;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int EJB_MODULE__URI = ApplicationPackage.MODULE__URI;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int EJB_MODULE__ALT_DD = ApplicationPackage.MODULE__ALT_DD;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int EJB_MODULE__APPLICATION = ApplicationPackage.MODULE__APPLICATION;

	/**
	 * The number of structural features of the '<em>Ejb Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_MODULE_FEATURE_COUNT = ApplicationPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */


	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int CONNECTOR_MODULE = 5;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int CONNECTOR_MODULE__URI = ApplicationPackage.MODULE__URI;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int CONNECTOR_MODULE__ALT_DD = ApplicationPackage.MODULE__ALT_DD;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	int CONNECTOR_MODULE__APPLICATION = ApplicationPackage.MODULE__APPLICATION;


	/**
	 * The number of structural features of the '<em>Connector Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_MODULE_FEATURE_COUNT = ApplicationPackage.MODULE_FEATURE_COUNT + 0;


	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	String eNS_URI = "application.xmi"; //$NON-NLS-1$
	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.jst.j2ee.application"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl.init();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return Application object
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.j2ee.application.Application#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.jst.j2ee.application.Application#getVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Version();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EReference getApplication_SecurityRoles();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EReference getApplication_Modules();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return Module object
	 */
	EClass getModule();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EAttribute getModule_Uri();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EAttribute getModule_AltDD();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EReference getModule_Application();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return WebModule object
	 */
	EClass getWebModule();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	EAttribute getWebModule_ContextRoot();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return JavaClientModule object
	 */
	EClass getJavaClientModule();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return EjbModule object
	 */
	EClass getEjbModule();

	/**
	 * @generated This field/method will be replaced during code generation 
	 * @return ConnectorModule object
	 */
	EClass getConnectorModule();

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	ApplicationFactory getApplicationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION = eINSTANCE.getApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Security Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SECURITY_ROLES = eINSTANCE.getApplication_SecurityRoles();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODULES = eINSTANCE.getApplication_Modules();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ModuleImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__URI = eINSTANCE.getModule_Uri();

		/**
		 * The meta object literal for the '<em><b>Alt DD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__ALT_DD = eINSTANCE.getModule_AltDD();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__APPLICATION = eINSTANCE.getModule_Application();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.WebModuleImpl <em>Web Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.WebModuleImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getWebModule()
		 * @generated
		 */
		EClass WEB_MODULE = eINSTANCE.getWebModule();

		/**
		 * The meta object literal for the '<em><b>Context Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_MODULE__CONTEXT_ROOT = eINSTANCE.getWebModule_ContextRoot();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.JavaClientModuleImpl <em>Java Client Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.JavaClientModuleImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getJavaClientModule()
		 * @generated
		 */
		EClass JAVA_CLIENT_MODULE = eINSTANCE.getJavaClientModule();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.EjbModuleImpl <em>Ejb Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.EjbModuleImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getEjbModule()
		 * @generated
		 */
		EClass EJB_MODULE = eINSTANCE.getEjbModule();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.j2ee.application.internal.impl.ConnectorModuleImpl <em>Connector Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ConnectorModuleImpl
		 * @see org.eclipse.jst.j2ee.application.internal.impl.ApplicationPackageImpl#getConnectorModule()
		 * @generated
		 */
		EClass CONNECTOR_MODULE = eINSTANCE.getConnectorModule();

	}

} //ApplicationPackage






