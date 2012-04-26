/*******************************************************************************
 * Copyright (c) 2001, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.taglib.internal.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jem.java.JavaRefPackage;
import org.eclipse.jst.j2ee.common.CommonPackage;
import org.eclipse.jst.j2ee.core.internal.plugin.J2EECorePlugin;
import org.eclipse.jst.j2ee.internal.J2EEInit;
import org.eclipse.jst.j2ee.taglib.internal.BodyContentType;
import org.eclipse.jst.j2ee.taglib.internal.ExtensibleType;
import org.eclipse.jst.j2ee.taglib.internal.Function;
import org.eclipse.jst.j2ee.taglib.internal.JSPScriptingVariableScope;
import org.eclipse.jst.j2ee.taglib.internal.JSPTag;
import org.eclipse.jst.j2ee.taglib.internal.JSPTagAttribute;
import org.eclipse.jst.j2ee.taglib.internal.JSPVariable;
import org.eclipse.jst.j2ee.taglib.internal.TagFile;
import org.eclipse.jst.j2ee.taglib.internal.TagLib;
import org.eclipse.jst.j2ee.taglib.internal.TaglibFactory;
import org.eclipse.jst.j2ee.taglib.internal.TaglibPackage;
import org.eclipse.jst.j2ee.taglib.internal.TldExtension;
import org.eclipse.jst.j2ee.taglib.internal.Validator;
import org.eclipse.jst.j2ee.webapplication.WebapplicationPackage;


public class TaglibPackageImpl extends EPackageImpl implements TaglibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspTagAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jspVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tldExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensibleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodyContentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jspScriptingVariableScopeEEnum = null;

		   /**
		 * @generated This field/method will be replaced during code generation.
		 */
	private TaglibPackageImpl() {
		super(eNS_URI, TaglibFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private volatile static boolean isInited = false;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public static TaglibPackage init() {
		if (isInited) return (TaglibPackage)EPackage.Registry.INSTANCE.getEPackage(TaglibPackage.eNS_URI);

		// Obtain or create and register package
		TaglibPackageImpl theTaglibPackage = 
			(TaglibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof
					TaglibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new
							TaglibPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		JavaRefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaglibPackage.createPackageContents();

		// Initialize created meta-data
		theTaglibPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaglibPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaglibPackage.eNS_URI, theTaglibPackage);

		J2EEInit.initEMFModels();

		return theTaglibPackage;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getTagLib() {
		return tagLibEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getTagLib_TagLibVersion() {
		return (EAttribute)tagLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getTagLib_JspVersion() {
		return (EAttribute)tagLibEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getTagLib_ShortName() {
		return (EAttribute)tagLibEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getTagLib_Uri() {
		return (EAttribute)tagLibEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getTagLib_Tags() {
		return (EReference)tagLibEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getTagLib_Validator() {
		return (EReference)tagLibEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getTagLib_Listeners() {
		return (EReference)tagLibEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagLib_Functions() {
		return (EReference)tagLibEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagLib_TaglibExtensions() {
		return (EReference)tagLibEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getValidator() {
		return validatorEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getValidator_ValidatorClass() {
		return (EReference)validatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getValidator_InitParams() {
		return (EReference)validatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidator_Descriptions() {
		return (EReference)validatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getJSPTag() {
		return jspTagEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPTag_BodyContent() {
		return (EAttribute)jspTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPTag_Example() {
		return (EAttribute)jspTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSPTag_Name() {
		return (EAttribute)jspTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSPTag_DynamicAttributes() {
		return (EAttribute)jspTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPTag_Attributes() {
		return (EReference)jspTagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPTag_Variables() {
		return (EReference)jspTagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPTag_TagClass() {
		return (EReference)jspTagEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPTag_TeiClass() {
		return (EReference)jspTagEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getJSPTagAttribute() {
		return jspTagAttributeEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPTagAttribute_Name() {
		return (EAttribute)jspTagAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPTagAttribute_Required() {
		return (EAttribute)jspTagAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPTagAttribute_RtExprValue() {
		return (EAttribute)jspTagAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJSPTagAttribute_Fragment() {
		return (EAttribute)jspTagAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPTagAttribute_Type() {
		return (EReference)jspTagAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSPTagAttribute_Descriptions() {
		return (EReference)jspTagAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EClass getJSPVariable() {
		return jspVariableEClass;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPVariable_NameGiven() {
		return (EAttribute)jspVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPVariable_NameFromAttribute() {
		return (EAttribute)jspVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPVariable_Declare() {
		return (EAttribute)jspVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EAttribute getJSPVariable_Scope() {
		return (EAttribute)jspVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EReference getJSPVariable_VariableClass() {
		return (EReference)jspVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJSPVariable_Descriptions() {
		return (EReference)jspVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Name() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Signature() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Example() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FunctionClass() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_FunctionExtensions() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagFile() {
		return tagFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagFile_Name() {
		return (EAttribute)tagFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagFile_Path() {
		return (EAttribute)tagFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagFile_Example() {
		return (EAttribute)tagFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagFile_TagExtensions() {
		return (EReference)tagFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTldExtension() {
		return tldExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTldExtension_Namespace() {
		return (EAttribute)tldExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTldExtension_ExtensionElements() {
		return (EReference)tldExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensibleType() {
		return extensibleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensibleType_Value() {
		return (EAttribute)extensibleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getBodyContentType() {
		return bodyContentTypeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public EEnum getJSPScriptingVariableScope() {
		return jspScriptingVariableScopeEEnum;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public TaglibFactory getTaglibFactory() {
		return (TaglibFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private volatile boolean isCreated = false;

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
		tagLibEClass = createEClass(TAG_LIB);
		createEAttribute(tagLibEClass, TAG_LIB__TAG_LIB_VERSION);
		createEAttribute(tagLibEClass, TAG_LIB__JSP_VERSION);
		createEAttribute(tagLibEClass, TAG_LIB__SHORT_NAME);
		createEAttribute(tagLibEClass, TAG_LIB__URI);
		createEReference(tagLibEClass, TAG_LIB__TAGS);
		createEReference(tagLibEClass, TAG_LIB__VALIDATOR);
		createEReference(tagLibEClass, TAG_LIB__LISTENERS);
		createEReference(tagLibEClass, TAG_LIB__FUNCTIONS);
		createEReference(tagLibEClass, TAG_LIB__TAGLIB_EXTENSIONS);

		jspTagEClass = createEClass(JSP_TAG);
		createEAttribute(jspTagEClass, JSP_TAG__BODY_CONTENT);
		createEAttribute(jspTagEClass, JSP_TAG__EXAMPLE);
		createEAttribute(jspTagEClass, JSP_TAG__NAME);
		createEAttribute(jspTagEClass, JSP_TAG__DYNAMIC_ATTRIBUTES);
		createEReference(jspTagEClass, JSP_TAG__ATTRIBUTES);
		createEReference(jspTagEClass, JSP_TAG__VARIABLES);
		createEReference(jspTagEClass, JSP_TAG__TAG_CLASS);
		createEReference(jspTagEClass, JSP_TAG__TEI_CLASS);

		jspTagAttributeEClass = createEClass(JSP_TAG_ATTRIBUTE);
		createEAttribute(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__NAME);
		createEAttribute(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__REQUIRED);
		createEAttribute(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__RT_EXPR_VALUE);
		createEAttribute(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__FRAGMENT);
		createEReference(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__TYPE);
		createEReference(jspTagAttributeEClass, JSP_TAG_ATTRIBUTE__DESCRIPTIONS);

		validatorEClass = createEClass(VALIDATOR);
		createEReference(validatorEClass, VALIDATOR__VALIDATOR_CLASS);
		createEReference(validatorEClass, VALIDATOR__INIT_PARAMS);
		createEReference(validatorEClass, VALIDATOR__DESCRIPTIONS);

		jspVariableEClass = createEClass(JSP_VARIABLE);
		createEAttribute(jspVariableEClass, JSP_VARIABLE__NAME_GIVEN);
		createEAttribute(jspVariableEClass, JSP_VARIABLE__NAME_FROM_ATTRIBUTE);
		createEAttribute(jspVariableEClass, JSP_VARIABLE__DECLARE);
		createEAttribute(jspVariableEClass, JSP_VARIABLE__SCOPE);
		createEReference(jspVariableEClass, JSP_VARIABLE__VARIABLE_CLASS);
		createEReference(jspVariableEClass, JSP_VARIABLE__DESCRIPTIONS);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__NAME);
		createEAttribute(functionEClass, FUNCTION__SIGNATURE);
		createEAttribute(functionEClass, FUNCTION__EXAMPLE);
		createEReference(functionEClass, FUNCTION__FUNCTION_CLASS);
		createEReference(functionEClass, FUNCTION__FUNCTION_EXTENSIONS);

		tagFileEClass = createEClass(TAG_FILE);
		createEAttribute(tagFileEClass, TAG_FILE__NAME);
		createEAttribute(tagFileEClass, TAG_FILE__PATH);
		createEAttribute(tagFileEClass, TAG_FILE__EXAMPLE);
		createEReference(tagFileEClass, TAG_FILE__TAG_EXTENSIONS);

		tldExtensionEClass = createEClass(TLD_EXTENSION);
		createEAttribute(tldExtensionEClass, TLD_EXTENSION__NAMESPACE);
		createEReference(tldExtensionEClass, TLD_EXTENSION__EXTENSION_ELEMENTS);

		extensibleTypeEClass = createEClass(EXTENSIBLE_TYPE);
		createEAttribute(extensibleTypeEClass, EXTENSIBLE_TYPE__VALUE);

		// Create enums
		bodyContentTypeEEnum = createEEnum(BODY_CONTENT_TYPE);
		jspScriptingVariableScopeEEnum = createEEnum(JSP_SCRIPTING_VARIABLE_SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private volatile boolean isInitialized = false;

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
		WebapplicationPackage theWebapplicationPackage = (WebapplicationPackage)EPackage.Registry.INSTANCE.getEPackage(WebapplicationPackage.eNS_URI);

		boolean hasLock = false;
		try {
			hasLock = J2EEInit.aquireInitializePackageContentsLock();
		} catch (InterruptedException e) {
			J2EECorePlugin.logError(e);
		}		
		
		try{
			// Add supertypes to classes
			tagLibEClass.getESuperTypes().add(theCommonPackage.getCompatibilityDescriptionGroup());
			jspTagEClass.getESuperTypes().add(theCommonPackage.getDescriptionGroup());
			jspTagAttributeEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
			validatorEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
			jspVariableEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
			functionEClass.getESuperTypes().add(theCommonPackage.getDescriptionGroup());
			tagFileEClass.getESuperTypes().add(theCommonPackage.getDescriptionGroup());
			tldExtensionEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
			extensibleTypeEClass.getESuperTypes().add(theCommonPackage.getJ2EEEObject());
	
			// Initialize classes and features; add operations and parameters
			initEClass(tagLibEClass, TagLib.class, "TagLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getTagLib_TagLibVersion(), ecorePackage.getEString(), "tagLibVersion", null, 0, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getTagLib_JspVersion(), ecorePackage.getEString(), "jspVersion", null, 0, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getTagLib_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getTagLib_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagLib_Tags(), this.getJSPTag(), null, "tags", null, 1, -1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagLib_Validator(), this.getValidator(), null, "validator", null, 0, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagLib_Listeners(), theCommonPackage.getListener(), null, "listeners", null, 0, -1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagLib_Functions(), this.getFunction(), null, "functions", null, 0, -1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagLib_TaglibExtensions(), this.getTldExtension(), null, "taglibExtensions", null, 0, -1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(jspTagEClass, JSPTag.class, "JSPTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getJSPTag_BodyContent(), this.getBodyContentType(), "bodyContent", null, 0, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPTag_Example(), ecorePackage.getEString(), "example", null, 0, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPTag_DynamicAttributes(), ecorePackage.getEBoolean(), "dynamicAttributes", null, 0, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTag_Attributes(), this.getJSPTagAttribute(), null, "attributes", null, 0, -1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTag_Variables(), this.getJSPVariable(), null, "variables", null, 0, -1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTag_TagClass(), theJavaRefPackage.getJavaClass(), null, "tagClass", null, 1, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTag_TeiClass(), theJavaRefPackage.getJavaClass(), null, "teiClass", null, 1, 1, JSPTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(jspTagAttributeEClass, JSPTagAttribute.class, "JSPTagAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getJSPTagAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPTagAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPTagAttribute_RtExprValue(), ecorePackage.getEBoolean(), "rtExprValue", "false", 0, 1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
			initEAttribute(getJSPTagAttribute_Fragment(), ecorePackage.getEBoolean(), "fragment", null, 0, 1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTagAttribute_Type(), theJavaRefPackage.getJavaClass(), null, "type", null, 0, 1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPTagAttribute_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, JSPTagAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEReference(getValidator_ValidatorClass(), theJavaRefPackage.getJavaClass(), null, "validatorClass", null, 0, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getValidator_InitParams(), theWebapplicationPackage.getInitParam(), null, "initParams", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getValidator_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(jspVariableEClass, JSPVariable.class, "JSPVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getJSPVariable_NameGiven(), ecorePackage.getEString(), "nameGiven", null, 0, 1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPVariable_NameFromAttribute(), ecorePackage.getEString(), "nameFromAttribute", null, 0, 1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPVariable_Declare(), ecorePackage.getEBoolean(), "declare", null, 0, 1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getJSPVariable_Scope(), this.getJSPScriptingVariableScope(), "scope", null, 0, 1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPVariable_VariableClass(), theJavaRefPackage.getJavaClass(), null, "variableClass", null, 0, 1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getJSPVariable_Descriptions(), theCommonPackage.getDescription(), null, "descriptions", null, 0, -1, JSPVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getFunction_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getFunction_Example(), ecorePackage.getEString(), "example", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getFunction_FunctionClass(), theJavaRefPackage.getJavaClass(), null, "functionClass", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getFunction_FunctionExtensions(), this.getTldExtension(), null, "functionExtensions", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(tagFileEClass, TagFile.class, "TagFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getTagFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, TagFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getTagFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, TagFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEAttribute(getTagFile_Example(), ecorePackage.getEString(), "example", null, 0, 1, TagFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTagFile_TagExtensions(), this.getTldExtension(), null, "tagExtensions", null, 0, -1, TagFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(tldExtensionEClass, TldExtension.class, "TldExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getTldExtension_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, TldExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
			initEReference(getTldExtension_ExtensionElements(), this.getExtensibleType(), null, "extensionElements", null, 1, -1, TldExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			initEClass(extensibleTypeEClass, ExtensibleType.class, "ExtensibleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
			initEAttribute(getExtensibleType_Value(), ecorePackage.getEString(), "value", null, 0, 1, ExtensibleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
	
			// Initialize enums and add enum literals
			initEEnum(bodyContentTypeEEnum, BodyContentType.class, "BodyContentType"); //$NON-NLS-1$
			addEEnumLiteral(bodyContentTypeEEnum, BodyContentType.TAGDEPENDENT_LITERAL);
			addEEnumLiteral(bodyContentTypeEEnum, BodyContentType.JSP_LITERAL);
			addEEnumLiteral(bodyContentTypeEEnum, BodyContentType.EMPTY_LITERAL);
			addEEnumLiteral(bodyContentTypeEEnum, BodyContentType.SCRIPTLESS_LITERAL);
	
			initEEnum(jspScriptingVariableScopeEEnum, JSPScriptingVariableScope.class, "JSPScriptingVariableScope"); //$NON-NLS-1$
			addEEnumLiteral(jspScriptingVariableScopeEEnum, JSPScriptingVariableScope.NESTED_LITERAL);
			addEEnumLiteral(jspScriptingVariableScopeEEnum, JSPScriptingVariableScope.AT_BEGIN_LITERAL);
			addEEnumLiteral(jspScriptingVariableScopeEEnum, JSPScriptingVariableScope.AT_END_LITERAL);
	
			// Create resource
			createResource(eNS_URI);
		}finally{
			if( hasLock )
				J2EEInit.releaseInitializePackageContentsLock();
		}
	}

	@Override
	public void freeze()
	{
		// since EClassImpl.freeze() does a clear() on all of the subClasses, we need to protect initializePackageContents() against it.
		boolean hasLock = false;
		try {
			hasLock = J2EEInit.aquireInitializePackageContentsLock();
		} catch (InterruptedException e) {
			J2EECorePlugin.logError(e);
		}
		finally {
			super.freeze();
			if( hasLock )
				J2EEInit.releaseInitializePackageContentsLock();
		}
	}

} //TaglibPackageImpl







