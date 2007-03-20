/**
 * <copyright>
 * </copyright>
 *
 * $Id: JavaeePackage.java,v 1.1 2007/03/20 18:04:38 jsholl Exp $
 */
package org.eclipse.jst.javaee.core.internal.metadata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       @(#)javaee_5.xsds	1.65 06/02/17
 *     
 * 
 * 
 *       Copyright 2003-2006 Sun Microsystems, Inc.
 *       4150 Network Circle
 *       Santa Clara, California 95054
 *       U.S.A
 *       All rights reserved.
 * 
 *       Sun Microsystems, Inc. has intellectual property rights
 *       relating to technology described in this document. In
 *       particular, and without limitation, these intellectual
 *       property rights may include one or more of the U.S. patents
 *       listed at http://www.sun.com/patents and one or more
 *       additional patents or pending patent applications in the
 *       U.S. and other countries.
 * 
 *       This document and the technology which it describes are
 *       distributed under licenses restricting their use, copying,
 *       distribution, and decompilation. No part of this document
 *       may be reproduced in any form by any means without prior
 *       written authorization of Sun and its licensors, if any.
 * 
 *       Third-party software, including font technology, is
 *       copyrighted and licensed from Sun suppliers.
 * 
 *       Sun, Sun Microsystems, the Sun logo, Solaris, Java, J2EE,
 *       JavaServer Pages, Enterprise JavaBeans and the Java Coffee
 *       Cup logo are trademarks or registered trademarks of Sun
 *       Microsystems, Inc. in the U.S. and other countries.
 * 
 *       Federal Acquisitions: Commercial Software - Government Users
 *       Subject to Standard License Terms and Conditions.
 * 
 *     
 * 
 * 
 * The following definitions that appear in the common
 * shareable schema(s) of J2EE deployment descriptors should be
 * interpreted with respect to the context they are included:
 * 
 * Deployment Component may indicate one of the following:
 *     j2ee application;
 *     application client;
 *     web application;
 *     enterprise bean;
 *     resource adapter;
 * 
 * Deployment File may indicate one of the following:
 *     ear file;
 *     war file;
 *     jar file;
 *     rar file;
 * 
 * 
 * 
 *       @(#)javaee_web_services_client_1_2.xsds	1.19 02/13/06
 *     
 * 
 * 
 *       Copyright 2003-2006 Sun Microsystems, Inc.
 *       4150 Network Circle
 *       Santa Clara, California 95054
 *       U.S.A
 *       All rights reserved.
 * 
 *       Sun Microsystems, Inc. has intellectual property rights
 *       relating to technology described in this document. In
 *       particular, and without limitation, these intellectual
 *       property rights may include one or more of the U.S. patents
 *       listed at http://www.sun.com/patents and one or more
 *       additional patents or pending patent applications in the
 *       U.S. and other countries.
 * 
 *       This document and the technology which it describes are
 *       distributed under licenses restricting their use, copying,
 *       distribution, and decompilation. No part of this document
 *       may be reproduced in any form by any means without prior
 *       written authorization of Sun and its licensors, if any.
 * 
 *       Third-party software, including font technology, is
 *       copyrighted and licensed from Sun suppliers.
 * 
 *       Sun, Sun Microsystems, the Sun logo, Solaris, Java, J2EE,
 *       JavaServer Pages, Enterprise JavaBeans and the Java Coffee
 *       Cup logo are trademarks or registered trademarks of Sun
 *       Microsystems, Inc. in the U.S. and other countries.
 * 
 *       Federal Acquisitions: Commercial Software - Government Users
 *       Subject to Standard License Terms and Conditions.
 * 
 *     
 * 
 * 
 *       (C) Copyright International Business Machines Corporation 2002
 * 
 *     
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          The xml:id specification is not yet a W3C Recommendation,
 *          but this attribute is included here to facilitate experimentation
 *          with the mechanisms it proposes.  Note that it is _not_ included
 *          in the specialAttrs attribute group.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang, xml:space or xml:id
 *         attributes on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2005/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2005/08/xml.xsd will not change.
 *   
 * <!-- end-model-doc -->
 * @see org.eclipse.jst.javaee.core.internal.metadata.JavaeeFactory
 * @generated
 */
public interface JavaeePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://java.sun.com/xml/ns/javaee"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaee"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaeePackage eINSTANCE = org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.DescriptionImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__LANG = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.DisplayNameImpl <em>Display Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.DisplayNameImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDisplayName()
	 * @generated
	 */
	int DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__LANG = 1;

	/**
	 * The number of structural features of the '<em>Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.EjbLocalRefImpl <em>Ejb Local Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.EjbLocalRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbLocalRef()
	 * @generated
	 */
	int EJB_LOCAL_REF = 2;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__LOCAL_HOME = 3;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__LOCAL = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__INJECTION_TARGETS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF__ID = 8;

	/**
	 * The number of structural features of the '<em>Ejb Local Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_LOCAL_REF_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.EjbRefImpl <em>Ejb Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.EjbRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRef()
	 * @generated
	 */
	int EJB_REF = 3;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__EJB_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__EJB_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__HOME = 3;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__REMOTE = 4;

	/**
	 * The feature id for the '<em><b>Ejb Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__EJB_LINK = 5;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__MAPPED_NAME = 6;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__INJECTION_TARGETS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF__ID = 8;

	/**
	 * The number of structural features of the '<em>Ejb Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_REF_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.EmptyTypeImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.EnvEntryImpl <em>Env Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.EnvEntryImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntry()
	 * @generated
	 */
	int ENV_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Env Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__ENV_ENTRY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Env Entry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__ENV_ENTRY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Env Entry Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__ENV_ENTRY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__INJECTION_TARGETS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY__ID = 6;

	/**
	 * The number of structural features of the '<em>Env Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_ENTRY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.IconImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 6;

	/**
	 * The feature id for the '<em><b>Small Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__SMALL_ICON = 0;

	/**
	 * The feature id for the '<em><b>Large Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LARGE_ICON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__ID = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LANG = 3;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.InjectionTargetImpl <em>Injection Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.InjectionTargetImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getInjectionTarget()
	 * @generated
	 */
	int INJECTION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Injection Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET__INJECTION_TARGET_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Injection Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET__INJECTION_TARGET_NAME = 1;

	/**
	 * The number of structural features of the '<em>Injection Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INJECTION_TARGET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.LifecycleCallbackImpl <em>Lifecycle Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.LifecycleCallbackImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLifecycleCallback()
	 * @generated
	 */
	int LIFECYCLE_CALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK__LIFECYCLE_CALLBACK_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Lifecycle Callback Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK__LIFECYCLE_CALLBACK_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Lifecycle Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFECYCLE_CALLBACK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ListenerImpl <em>Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ListenerImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getListener()
	 * @generated
	 */
	int LISTENER = 9;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Listener Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__LISTENER_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER__ID = 4;

	/**
	 * The number of structural features of the '<em>Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTENER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.MessageDestinationImpl <em>Message Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.MessageDestinationImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestination()
	 * @generated
	 */
	int MESSAGE_DESTINATION = 10;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__MESSAGE_DESTINATION_NAME = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION__ID = 5;

	/**
	 * The number of structural features of the '<em>Message Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.MessageDestinationRefImpl <em>Message Destination Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.MessageDestinationRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationRef()
	 * @generated
	 */
	int MESSAGE_DESTINATION_REF = 11;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Message Destination Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Message Destination Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_USAGE = 3;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_LINK = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__INJECTION_TARGETS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF__ID = 7;

	/**
	 * The number of structural features of the '<em>Message Destination Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DESTINATION_REF_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ParamValueImpl <em>Param Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ParamValueImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getParamValue()
	 * @generated
	 */
	int PARAM_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__PARAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Param Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__PARAM_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE__ID = 3;

	/**
	 * The number of structural features of the '<em>Param Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.PersistenceContextRefImpl <em>Persistence Context Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.PersistenceContextRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextRef()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_REF = 13;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Persistence Context Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__PERSISTENCE_CONTEXT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Persistence Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__PERSISTENCE_CONTEXT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Persistence Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__PERSISTENCE_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__INJECTION_TARGETS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF__ID = 7;

	/**
	 * The number of structural features of the '<em>Persistence Context Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CONTEXT_REF_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.PersistenceUnitRefImpl <em>Persistence Unit Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.PersistenceUnitRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceUnitRef()
	 * @generated
	 */
	int PERSISTENCE_UNIT_REF = 14;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__PERSISTENCE_UNIT_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__PERSISTENCE_UNIT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__INJECTION_TARGETS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF__ID = 5;

	/**
	 * The number of structural features of the '<em>Persistence Unit Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_REF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.PortComponentRefImpl <em>Port Component Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.PortComponentRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPortComponentRef()
	 * @generated
	 */
	int PORT_COMPONENT_REF = 15;

	/**
	 * The feature id for the '<em><b>Service Endpoint Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__SERVICE_ENDPOINT_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Enable Mtom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__ENABLE_MTOM = 1;

	/**
	 * The feature id for the '<em><b>Port Component Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__PORT_COMPONENT_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF__ID = 3;

	/**
	 * The number of structural features of the '<em>Port Component Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COMPONENT_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.PropertyTypeImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ResourceEnvRefImpl <em>Resource Env Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ResourceEnvRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResourceEnvRef()
	 * @generated
	 */
	int RESOURCE_ENV_REF = 17;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__RESOURCE_ENV_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Env Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__RESOURCE_ENV_REF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__MAPPED_NAME = 3;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__INJECTION_TARGETS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF__ID = 5;

	/**
	 * The number of structural features of the '<em>Resource Env Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ENV_REF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ResourceRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResourceRef()
	 * @generated
	 */
	int RESOURCE_REF = 18;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Res Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_REF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Res Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Res Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_AUTH = 3;

	/**
	 * The feature id for the '<em><b>Res Sharing Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__RES_SHARING_SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__MAPPED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__INJECTION_TARGETS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF__ID = 7;

	/**
	 * The number of structural features of the '<em>Resource Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REF_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.RunAsImpl <em>Run As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.RunAsImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRunAs()
	 * @generated
	 */
	int RUN_AS = 19;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS__ID = 2;

	/**
	 * The number of structural features of the '<em>Run As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_AS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.SecurityRoleImpl <em>Security Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.SecurityRoleImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getSecurityRole()
	 * @generated
	 */
	int SECURITY_ROLE = 20;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE__ID = 2;

	/**
	 * The number of structural features of the '<em>Security Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.SecurityRoleRefImpl <em>Security Role Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.SecurityRoleRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getSecurityRoleRef()
	 * @generated
	 */
	int SECURITY_ROLE_REF = 21;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF__ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Role Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF__ROLE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Role Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ROLE_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefImpl <em>Service Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRef()
	 * @generated
	 */
	int SERVICE_REF = 22;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Service Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_REF_NAME = 3;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Service Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_REF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Wsdl File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__WSDL_FILE = 6;

	/**
	 * The feature id for the '<em><b>Jaxrpc Mapping File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__JAXRPC_MAPPING_FILE = 7;

	/**
	 * The feature id for the '<em><b>Service Qname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__SERVICE_QNAME = 8;

	/**
	 * The feature id for the '<em><b>Port Component Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__PORT_COMPONENT_REFS = 9;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__HANDLERS = 10;

	/**
	 * The feature id for the '<em><b>Handler Chains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__HANDLER_CHAINS = 11;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__MAPPED_NAME = 12;

	/**
	 * The feature id for the '<em><b>Injection Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__INJECTION_TARGETS = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__ID = 14;

	/**
	 * The number of structural features of the '<em>Service Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerImpl <em>Service Ref Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandler()
	 * @generated
	 */
	int SERVICE_REF_HANDLER = 23;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Handler Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__HANDLER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Handler Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__HANDLER_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Init Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__INIT_PARAMS = 5;

	/**
	 * The feature id for the '<em><b>Soap Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__SOAP_HEADERS = 6;

	/**
	 * The feature id for the '<em><b>Soap Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__SOAP_ROLES = 7;

	/**
	 * The feature id for the '<em><b>Port Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__PORT_NAMES = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER__ID = 9;

	/**
	 * The number of structural features of the '<em>Service Ref Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainImpl <em>Service Ref Handler Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandlerChain()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_CHAIN = 24;

	/**
	 * The feature id for the '<em><b>Service Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN__SERVICE_NAME_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Port Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN__PORT_NAME_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Protocol Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN__PROTOCOL_BINDINGS = 2;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN__HANDLERS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN__ID = 4;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAIN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainsImpl <em>Service Ref Handler Chains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainsImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandlerChains()
	 * @generated
	 */
	int SERVICE_REF_HANDLER_CHAINS = 25;

	/**
	 * The feature id for the '<em><b>Handler Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS__HANDLER_CHAINS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS__ID = 1;

	/**
	 * The number of structural features of the '<em>Service Ref Handler Chains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_HANDLER_CHAINS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.internal.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.UrlPatternTypeImpl
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getUrlPatternType()
	 * @generated
	 */
	int URL_PATTERN_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Url Pattern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PATTERN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.EjbRefType <em>Ejb Ref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefType()
	 * @generated
	 */
	int EJB_REF_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.EnvEntryType <em>Env Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.EnvEntryType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntryType()
	 * @generated
	 */
	int ENV_ENTRY_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.MessageDestinationUsageType <em>Message Destination Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationUsageType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.PersistenceContextType <em>Persistence Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.PersistenceContextType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextType()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.ResAuthType <em>Res Auth Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.ResAuthType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResAuthType()
	 * @generated
	 */
	int RES_AUTH_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.core.ResSharingScopeType <em>Res Sharing Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResSharingScopeType()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE = 32;

	/**
	 * The meta object id for the '<em>Dewey Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDeweyVersionType()
	 * @generated
	 */
	int DEWEY_VERSION_TYPE = 33;

	/**
	 * The meta object id for the '<em>EJB Link</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEJBLink()
	 * @generated
	 */
	int EJB_LINK = 34;

	/**
	 * The meta object id for the '<em>Ejb Ref Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefNameType()
	 * @generated
	 */
	int EJB_REF_NAME_TYPE = 35;

	/**
	 * The meta object id for the '<em>Ejb Ref Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefTypeObject()
	 * @generated
	 */
	int EJB_REF_TYPE_OBJECT = 36;

	/**
	 * The meta object id for the '<em>Env Entry Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.EnvEntryType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntryTypeObject()
	 * @generated
	 */
	int ENV_ENTRY_TYPE_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Fully Qualified Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getFullyQualifiedClassType()
	 * @generated
	 */
	int FULLY_QUALIFIED_CLASS_TYPE = 38;

	/**
	 * The meta object id for the '<em>Home</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getHome()
	 * @generated
	 */
	int HOME = 39;

	/**
	 * The meta object id for the '<em>Java Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJavaIdentifier()
	 * @generated
	 */
	int JAVA_IDENTIFIER = 40;

	/**
	 * The meta object id for the '<em>Java Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJavaType()
	 * @generated
	 */
	int JAVA_TYPE = 41;

	/**
	 * The meta object id for the '<em>JNDI Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJNDIName()
	 * @generated
	 */
	int JNDI_NAME = 42;

	/**
	 * The meta object id for the '<em>Local</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLocal()
	 * @generated
	 */
	int LOCAL = 43;

	/**
	 * The meta object id for the '<em>Local Home</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLocalHome()
	 * @generated
	 */
	int LOCAL_HOME = 44;

	/**
	 * The meta object id for the '<em>Message Destination Link</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationLink()
	 * @generated
	 */
	int MESSAGE_DESTINATION_LINK = 45;

	/**
	 * The meta object id for the '<em>Message Destination Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationTypeType()
	 * @generated
	 */
	int MESSAGE_DESTINATION_TYPE_TYPE = 46;

	/**
	 * The meta object id for the '<em>Message Destination Usage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationUsageTypeObject()
	 * @generated
	 */
	int MESSAGE_DESTINATION_USAGE_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Path Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPathType()
	 * @generated
	 */
	int PATH_TYPE = 48;

	/**
	 * The meta object id for the '<em>Persistence Context Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.PersistenceContextType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextTypeObject()
	 * @generated
	 */
	int PERSISTENCE_CONTEXT_TYPE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Remote</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRemote()
	 * @generated
	 */
	int REMOTE = 50;

	/**
	 * The meta object id for the '<em>Res Auth Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.ResAuthType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResAuthTypeObject()
	 * @generated
	 */
	int RES_AUTH_TYPE_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Res Sharing Scope Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResSharingScopeTypeObject()
	 * @generated
	 */
	int RES_SHARING_SCOPE_TYPE_OBJECT = 52;

	/**
	 * The meta object id for the '<em>Role Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRoleName()
	 * @generated
	 */
	int ROLE_NAME = 53;

	/**
	 * The meta object id for the '<em>Service Ref Protocol Binding List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolBindingListType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE = 54;

	/**
	 * The meta object id for the '<em>Service Ref Protocol Binding Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolBindingType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_BINDING_TYPE = 55;

	/**
	 * The meta object id for the '<em>Service Ref Protocol URI Alias Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolURIAliasType()
	 * @generated
	 */
	int SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE = 56;

	/**
	 * The meta object id for the '<em>Service Ref Qname Pattern</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefQnamePattern()
	 * @generated
	 */
	int SERVICE_REF_QNAME_PATTERN = 57;

	/**
	 * The meta object id for the '<em>True False Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getTrueFalseType()
	 * @generated
	 */
	int TRUE_FALSE_TYPE = 58;

	/**
	 * The meta object id for the '<em>True False Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getTrueFalseTypeObject()
	 * @generated
	 */
	int TRUE_FALSE_TYPE_OBJECT = 59;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.jst.javaee.core.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jst.javaee.core.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Description#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.jst.javaee.core.Description#getLang()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.DisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name</em>'.
	 * @see org.eclipse.jst.javaee.core.DisplayName
	 * @generated
	 */
	EClass getDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.DisplayName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jst.javaee.core.DisplayName#getValue()
	 * @see #getDisplayName()
	 * @generated
	 */
	EAttribute getDisplayName_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.DisplayName#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.jst.javaee.core.DisplayName#getLang()
	 * @see #getDisplayName()
	 * @generated
	 */
	EAttribute getDisplayName_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.EjbLocalRef <em>Ejb Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Local Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef
	 * @generated
	 */
	EClass getEjbLocalRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getDescriptions()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EReference getEjbLocalRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefName()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_EjbRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getEjbRefType()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_EjbRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Home</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getLocalHome()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_LocalHome();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getLocal()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_Local();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Link</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getEjbLink()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getMappedName()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getInjectionTargets()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EReference getEjbLocalRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbLocalRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbLocalRef#getId()
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	EAttribute getEjbLocalRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.EjbRef <em>Ejb Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef
	 * @generated
	 */
	EClass getEjbRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EjbRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getDescriptions()
	 * @see #getEjbRef()
	 * @generated
	 */
	EReference getEjbRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getEjbRefName <em>Ejb Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getEjbRefName()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_EjbRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getEjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getEjbRefType()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_EjbRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getHome()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_Home();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getRemote()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_Remote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getEjbLink <em>Ejb Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Link</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getEjbLink()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_EjbLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getMappedName()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EjbRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getInjectionTargets()
	 * @see #getEjbRef()
	 * @generated
	 */
	EReference getEjbRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EjbRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRef#getId()
	 * @see #getEjbRef()
	 * @generated
	 */
	EAttribute getEjbRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EmptyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.EmptyType#getId()
	 * @see #getEmptyType()
	 * @generated
	 */
	EAttribute getEmptyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.EnvEntry <em>Env Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Entry</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry
	 * @generated
	 */
	EClass getEnvEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EnvEntry#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getDescriptions()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EReference getEnvEntry_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryName <em>Env Entry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Entry Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryName()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_EnvEntryName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Entry Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryType()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_EnvEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryValue <em>Env Entry Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Entry Value</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getEnvEntryValue()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_EnvEntryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EnvEntry#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getMappedName()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.EnvEntry#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getInjectionTargets()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EReference getEnvEntry_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.EnvEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntry#getId()
	 * @see #getEnvEntry()
	 * @generated
	 */
	EAttribute getEnvEntry_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see org.eclipse.jst.javaee.core.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Icon#getSmallIcon <em>Small Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Icon</em>'.
	 * @see org.eclipse.jst.javaee.core.Icon#getSmallIcon()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_SmallIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Icon#getLargeIcon <em>Large Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Icon</em>'.
	 * @see org.eclipse.jst.javaee.core.Icon#getLargeIcon()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_LargeIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Icon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.Icon#getId()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Icon#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.jst.javaee.core.Icon#getLang()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Lang();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.InjectionTarget <em>Injection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Injection Target</em>'.
	 * @see org.eclipse.jst.javaee.core.InjectionTarget
	 * @generated
	 */
	EClass getInjectionTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.InjectionTarget#getInjectionTargetClass <em>Injection Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injection Target Class</em>'.
	 * @see org.eclipse.jst.javaee.core.InjectionTarget#getInjectionTargetClass()
	 * @see #getInjectionTarget()
	 * @generated
	 */
	EAttribute getInjectionTarget_InjectionTargetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.InjectionTarget#getInjectionTargetName <em>Injection Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injection Target Name</em>'.
	 * @see org.eclipse.jst.javaee.core.InjectionTarget#getInjectionTargetName()
	 * @see #getInjectionTarget()
	 * @generated
	 */
	EAttribute getInjectionTarget_InjectionTargetName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.LifecycleCallback <em>Lifecycle Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifecycle Callback</em>'.
	 * @see org.eclipse.jst.javaee.core.LifecycleCallback
	 * @generated
	 */
	EClass getLifecycleCallback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.LifecycleCallback#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Callback Class</em>'.
	 * @see org.eclipse.jst.javaee.core.LifecycleCallback#getLifecycleCallbackClass()
	 * @see #getLifecycleCallback()
	 * @generated
	 */
	EAttribute getLifecycleCallback_LifecycleCallbackClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.LifecycleCallback#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifecycle Callback Method</em>'.
	 * @see org.eclipse.jst.javaee.core.LifecycleCallback#getLifecycleCallbackMethod()
	 * @see #getLifecycleCallback()
	 * @generated
	 */
	EAttribute getLifecycleCallback_LifecycleCallbackMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.Listener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listener</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener
	 * @generated
	 */
	EClass getListener();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.Listener#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener#getDescriptions()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.Listener#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener#getDisplayNames()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.Listener#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener#getIcons()
	 * @see #getListener()
	 * @generated
	 */
	EReference getListener_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Listener#getListenerClass <em>Listener Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listener Class</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener#getListenerClass()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_ListenerClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.Listener#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.Listener#getId()
	 * @see #getListener()
	 * @generated
	 */
	EAttribute getListener_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.MessageDestination <em>Message Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination
	 * @generated
	 */
	EClass getMessageDestination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.MessageDestination#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getDescriptions()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EReference getMessageDestination_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.MessageDestination#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getDisplayNames()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EReference getMessageDestination_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.MessageDestination#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getIcons()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EReference getMessageDestination_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestination#getMessageDestinationName <em>Message Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Name</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getMessageDestinationName()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EAttribute getMessageDestination_MessageDestinationName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestination#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getMappedName()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EAttribute getMessageDestination_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestination#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestination#getId()
	 * @see #getMessageDestination()
	 * @generated
	 */
	EAttribute getMessageDestination_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.MessageDestinationRef <em>Message Destination Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Destination Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef
	 * @generated
	 */
	EClass getMessageDestinationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getDescriptions()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EReference getMessageDestinationRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationRefName <em>Message Destination Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationRefName()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_MessageDestinationRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Type</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationType()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_MessageDestinationType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationUsage <em>Message Destination Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Usage</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationUsage()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_MessageDestinationUsage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Link</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getMessageDestinationLink()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_MessageDestinationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getMappedName()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getInjectionTargets()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EReference getMessageDestinationRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.MessageDestinationRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationRef#getId()
	 * @see #getMessageDestinationRef()
	 * @generated
	 */
	EAttribute getMessageDestinationRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value</em>'.
	 * @see org.eclipse.jst.javaee.core.ParamValue
	 * @generated
	 */
	EClass getParamValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ParamValue#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.ParamValue#getDescriptions()
	 * @see #getParamValue()
	 * @generated
	 */
	EReference getParamValue_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ParamValue#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ParamValue#getParamName()
	 * @see #getParamValue()
	 * @generated
	 */
	EAttribute getParamValue_ParamName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ParamValue#getParamValue <em>Param Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Value</em>'.
	 * @see org.eclipse.jst.javaee.core.ParamValue#getParamValue()
	 * @see #getParamValue()
	 * @generated
	 */
	EAttribute getParamValue_ParamValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ParamValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ParamValue#getId()
	 * @see #getParamValue()
	 * @generated
	 */
	EAttribute getParamValue_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.PersistenceContextRef <em>Persistence Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Context Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef
	 * @generated
	 */
	EClass getPersistenceContextRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getDescriptions()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EReference getPersistenceContextRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Context Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceContextRefName()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EAttribute getPersistenceContextRef_PersistenceContextRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceUnitName()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EAttribute getPersistenceContextRef_PersistenceUnitName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceContextType <em>Persistence Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Context Type</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceContextType()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EAttribute getPersistenceContextRef_PersistenceContextType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceProperties <em>Persistence Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Properties</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getPersistenceProperties()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EReference getPersistenceContextRef_PersistenceProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getMappedName()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EAttribute getPersistenceContextRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getInjectionTargets()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EReference getPersistenceContextRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceContextRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextRef#getId()
	 * @see #getPersistenceContextRef()
	 * @generated
	 */
	EAttribute getPersistenceContextRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef <em>Persistence Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef
	 * @generated
	 */
	EClass getPersistenceUnitRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getDescriptions()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EReference getPersistenceUnitRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getPersistenceUnitRefName <em>Persistence Unit Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getPersistenceUnitRefName()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EAttribute getPersistenceUnitRef_PersistenceUnitRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getPersistenceUnitName <em>Persistence Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Unit Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getPersistenceUnitName()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EAttribute getPersistenceUnitRef_PersistenceUnitName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getMappedName()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EAttribute getPersistenceUnitRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getInjectionTargets()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EReference getPersistenceUnitRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PersistenceUnitRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceUnitRef#getId()
	 * @see #getPersistenceUnitRef()
	 * @generated
	 */
	EAttribute getPersistenceUnitRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.PortComponentRef <em>Port Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Component Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.PortComponentRef
	 * @generated
	 */
	EClass getPortComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PortComponentRef#getServiceEndpointInterface <em>Service Endpoint Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Endpoint Interface</em>'.
	 * @see org.eclipse.jst.javaee.core.PortComponentRef#getServiceEndpointInterface()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EAttribute getPortComponentRef_ServiceEndpointInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PortComponentRef#isEnableMtom <em>Enable Mtom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Mtom</em>'.
	 * @see org.eclipse.jst.javaee.core.PortComponentRef#isEnableMtom()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EAttribute getPortComponentRef_EnableMtom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PortComponentRef#getPortComponentLink <em>Port Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Component Link</em>'.
	 * @see org.eclipse.jst.javaee.core.PortComponentRef#getPortComponentLink()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EAttribute getPortComponentRef_PortComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PortComponentRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.PortComponentRef#getId()
	 * @see #getPortComponentRef()
	 * @generated
	 */
	EAttribute getPortComponentRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see org.eclipse.jst.javaee.core.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.jst.javaee.core.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jst.javaee.core.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.PropertyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.PropertyType#getId()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ResourceEnvRef <em>Resource Env Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Env Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef
	 * @generated
	 */
	EClass getResourceEnvRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getDescriptions()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EReference getResourceEnvRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getResourceEnvRefName <em>Resource Env Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Env Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getResourceEnvRefName()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EAttribute getResourceEnvRef_ResourceEnvRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getResourceEnvRefType <em>Resource Env Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Env Ref Type</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getResourceEnvRefType()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EAttribute getResourceEnvRef_ResourceEnvRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getMappedName()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EAttribute getResourceEnvRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getInjectionTargets()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EReference getResourceEnvRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceEnvRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceEnvRef#getId()
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	EAttribute getResourceEnvRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef
	 * @generated
	 */
	EClass getResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ResourceRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getDescriptions()
	 * @see #getResourceRef()
	 * @generated
	 */
	EReference getResourceRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getResRefName <em>Res Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getResRefName()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getResType <em>Res Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Type</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getResType()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getResAuth <em>Res Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Auth</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getResAuth()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getResSharingScope <em>Res Sharing Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Sharing Scope</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getResSharingScope()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_ResSharingScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getMappedName()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ResourceRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getInjectionTargets()
	 * @see #getResourceRef()
	 * @generated
	 */
	EReference getResourceRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ResourceRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ResourceRef#getId()
	 * @see #getResourceRef()
	 * @generated
	 */
	EAttribute getResourceRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.RunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run As</em>'.
	 * @see org.eclipse.jst.javaee.core.RunAs
	 * @generated
	 */
	EClass getRunAs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.RunAs#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.RunAs#getDescriptions()
	 * @see #getRunAs()
	 * @generated
	 */
	EReference getRunAs_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.RunAs#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.eclipse.jst.javaee.core.RunAs#getRoleName()
	 * @see #getRunAs()
	 * @generated
	 */
	EAttribute getRunAs_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.RunAs#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.RunAs#getId()
	 * @see #getRunAs()
	 * @generated
	 */
	EAttribute getRunAs_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.SecurityRole <em>Security Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRole
	 * @generated
	 */
	EClass getSecurityRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.SecurityRole#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRole#getDescriptions()
	 * @see #getSecurityRole()
	 * @generated
	 */
	EReference getSecurityRole_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.SecurityRole#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRole#getRoleName()
	 * @see #getSecurityRole()
	 * @generated
	 */
	EAttribute getSecurityRole_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.SecurityRole#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRole#getId()
	 * @see #getSecurityRole()
	 * @generated
	 */
	EAttribute getSecurityRole_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.SecurityRoleRef <em>Security Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Role Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRoleRef
	 * @generated
	 */
	EClass getSecurityRoleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.SecurityRoleRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRoleRef#getDescriptions()
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	EReference getSecurityRoleRef_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.SecurityRoleRef#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRoleRef#getRoleName()
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	EAttribute getSecurityRoleRef_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.SecurityRoleRef#getRoleLink <em>Role Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Link</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRoleRef#getRoleLink()
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	EAttribute getSecurityRoleRef_RoleLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.SecurityRoleRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.SecurityRoleRef#getId()
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	EAttribute getSecurityRoleRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef
	 * @generated
	 */
	EClass getServiceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getDescriptions()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getDisplayNames()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getIcons()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getServiceRefName <em>Service Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Ref Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getServiceRefName()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ServiceRefName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Interface</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getServiceInterface()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getServiceRefType <em>Service Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Ref Type</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getServiceRefType()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ServiceRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getWsdlFile <em>Wsdl File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdl File</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getWsdlFile()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_WsdlFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jaxrpc Mapping File</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getJaxrpcMappingFile()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_JaxrpcMappingFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getServiceQname <em>Service Qname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Qname</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getServiceQname()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ServiceQname();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getPortComponentRefs <em>Port Component Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Component Refs</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getPortComponentRefs()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_PortComponentRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getHandlers()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.core.ServiceRef#getHandlerChains <em>Handler Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Chains</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getHandlerChains()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_HandlerChains();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getMappedName()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_MappedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRef#getInjectionTargets <em>Injection Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injection Targets</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getInjectionTargets()
	 * @see #getServiceRef()
	 * @generated
	 */
	EReference getServiceRef_InjectionTargets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRef#getId()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ServiceRefHandler <em>Service Ref Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler
	 * @generated
	 */
	EClass getServiceRefHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getDescriptions()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EReference getServiceRefHandler_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getDisplayNames()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EReference getServiceRefHandler_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getIcons()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EReference getServiceRefHandler_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerName <em>Handler Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Name</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerName()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_HandlerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerClass <em>Handler Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Class</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getHandlerClass()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_HandlerClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getInitParams <em>Init Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Params</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getInitParams()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EReference getServiceRefHandler_InitParams();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapHeaders <em>Soap Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Soap Headers</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapHeaders()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_SoapHeaders();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapRoles <em>Soap Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Soap Roles</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getSoapRoles()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_SoapRoles();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getPortNames <em>Port Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Port Names</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getPortNames()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_PortNames();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandler#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandler#getId()
	 * @see #getServiceRefHandler()
	 * @generated
	 */
	EAttribute getServiceRefHandler_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain <em>Service Ref Handler Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Chain</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain
	 * @generated
	 */
	EClass getServiceRefHandlerChain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getServiceNamePattern <em>Service Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name Pattern</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getServiceNamePattern()
	 * @see #getServiceRefHandlerChain()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChain_ServiceNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getPortNamePattern <em>Port Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Name Pattern</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getPortNamePattern()
	 * @see #getServiceRefHandlerChain()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChain_PortNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getProtocolBindings <em>Protocol Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Bindings</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getProtocolBindings()
	 * @see #getServiceRefHandlerChain()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChain_ProtocolBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getHandlers()
	 * @see #getServiceRefHandlerChain()
	 * @generated
	 */
	EReference getServiceRefHandlerChain_Handlers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChain#getId()
	 * @see #getServiceRefHandlerChain()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChain_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChains <em>Service Ref Handler Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref Handler Chains</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChains
	 * @generated
	 */
	EClass getServiceRefHandlerChains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChains#getHandlerChains <em>Handler Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler Chains</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChains#getHandlerChains()
	 * @see #getServiceRefHandlerChains()
	 * @generated
	 */
	EReference getServiceRefHandlerChains_HandlerChains();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.ServiceRefHandlerChains#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.core.ServiceRefHandlerChains#getId()
	 * @see #getServiceRefHandlerChains()
	 * @generated
	 */
	EAttribute getServiceRefHandlerChains_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.core.UrlPatternType <em>Url Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Pattern Type</em>'.
	 * @see org.eclipse.jst.javaee.core.UrlPatternType
	 * @generated
	 */
	EClass getUrlPatternType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.core.UrlPatternType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.jst.javaee.core.UrlPatternType#getValue()
	 * @see #getUrlPatternType()
	 * @generated
	 */
	EAttribute getUrlPatternType_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.EjbRefType <em>Ejb Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ejb Ref Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @generated
	 */
	EEnum getEjbRefType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.EnvEntryType <em>Env Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Env Entry Type</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntryType
	 * @generated
	 */
	EEnum getEnvEntryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.MessageDestinationUsageType <em>Message Destination Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Destination Usage Type</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
	 * @generated
	 */
	EEnum getMessageDestinationUsageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.PersistenceContextType <em>Persistence Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Context Type</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextType
	 * @generated
	 */
	EEnum getPersistenceContextType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.ResAuthType <em>Res Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Auth Type</em>'.
	 * @see org.eclipse.jst.javaee.core.ResAuthType
	 * @generated
	 */
	EEnum getResAuthType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.core.ResSharingScopeType <em>Res Sharing Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Res Sharing Scope Type</em>'.
	 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
	 * @generated
	 */
	EEnum getResSharingScopeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dewey Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dewey Version Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getDeweyVersionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EJB Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJB Link</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getEJBLink();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ejb Ref Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Name Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getEjbRefNameType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.EjbRefType <em>Ejb Ref Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ejb Ref Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.EjbRefType
	 * @generated
	 */
	EDataType getEjbRefTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.EnvEntryType <em>Env Entry Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Env Entry Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.EnvEntryType
	 * @generated
	 */
	EDataType getEnvEntryTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Fully Qualified Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fully Qualified Class Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getFullyQualifiedClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Home</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getHome();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Identifier</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getJavaIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Java Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getJavaType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>JNDI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JNDI Name</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getJNDIName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getLocal();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Home</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getLocalHome();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Link</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getMessageDestinationLink();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Message Destination Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Type Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getMessageDestinationTypeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.MessageDestinationUsageType <em>Message Destination Usage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Destination Usage Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
	 * @generated
	 */
	EDataType getMessageDestinationUsageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getPathType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.PersistenceContextType <em>Persistence Context Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Context Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.PersistenceContextType
	 * @generated
	 */
	EDataType getPersistenceContextTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Remote</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getRemote();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.ResAuthType <em>Res Auth Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Auth Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.ResAuthType
	 * @generated
	 */
	EDataType getResAuthTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.core.ResSharingScopeType <em>Res Sharing Scope Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Res Sharing Scope Type Object</em>'.
	 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
	 * @generated
	 */
	EDataType getResSharingScopeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role Name</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getRoleName();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Service Ref Protocol Binding List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol Binding List Type</em>'.
	 * @see java.util.List
	 * @generated
	 */
	EDataType getServiceRefProtocolBindingListType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Protocol Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol Binding Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getServiceRefProtocolBindingType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Protocol URI Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Protocol URI Alias Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getServiceRefProtocolURIAliasType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Service Ref Qname Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Ref Qname Pattern</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getServiceRefQnamePattern();

	/**
	 * Returns the meta object for data type '<em>True False Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>True False Type</em>'.
	 * @generated
	 */
	EDataType getTrueFalseType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>True False Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>True False Type Object</em>'.
	 * @see java.lang.Boolean
	 * @generated
	 */
	EDataType getTrueFalseTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaeeFactory getJavaeeFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.DescriptionImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__LANG = eINSTANCE.getDescription_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.DisplayNameImpl <em>Display Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.DisplayNameImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDisplayName()
		 * @generated
		 */
		EClass DISPLAY_NAME = eINSTANCE.getDisplayName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME__VALUE = eINSTANCE.getDisplayName_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME__LANG = eINSTANCE.getDisplayName_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.EjbLocalRefImpl <em>Ejb Local Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.EjbLocalRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbLocalRef()
		 * @generated
		 */
		EClass EJB_LOCAL_REF = eINSTANCE.getEjbLocalRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF__DESCRIPTIONS = eINSTANCE.getEjbLocalRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__EJB_REF_NAME = eINSTANCE.getEjbLocalRef_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__EJB_REF_TYPE = eINSTANCE.getEjbLocalRef_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__LOCAL_HOME = eINSTANCE.getEjbLocalRef_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__LOCAL = eINSTANCE.getEjbLocalRef_Local();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__EJB_LINK = eINSTANCE.getEjbLocalRef_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__MAPPED_NAME = eINSTANCE.getEjbLocalRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_LOCAL_REF__INJECTION_TARGETS = eINSTANCE.getEjbLocalRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_LOCAL_REF__ID = eINSTANCE.getEjbLocalRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.EjbRefImpl <em>Ejb Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.EjbRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRef()
		 * @generated
		 */
		EClass EJB_REF = eINSTANCE.getEjbRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF__DESCRIPTIONS = eINSTANCE.getEjbRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__EJB_REF_NAME = eINSTANCE.getEjbRef_EjbRefName();

		/**
		 * The meta object literal for the '<em><b>Ejb Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__EJB_REF_TYPE = eINSTANCE.getEjbRef_EjbRefType();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__HOME = eINSTANCE.getEjbRef_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__REMOTE = eINSTANCE.getEjbRef_Remote();

		/**
		 * The meta object literal for the '<em><b>Ejb Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__EJB_LINK = eINSTANCE.getEjbRef_EjbLink();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__MAPPED_NAME = eINSTANCE.getEjbRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_REF__INJECTION_TARGETS = eINSTANCE.getEjbRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_REF__ID = eINSTANCE.getEjbRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.EmptyTypeImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEmptyType()
		 * @generated
		 */
		EClass EMPTY_TYPE = eINSTANCE.getEmptyType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_TYPE__ID = eINSTANCE.getEmptyType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.EnvEntryImpl <em>Env Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.EnvEntryImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntry()
		 * @generated
		 */
		EClass ENV_ENTRY = eINSTANCE.getEnvEntry();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY__DESCRIPTIONS = eINSTANCE.getEnvEntry_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Env Entry Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__ENV_ENTRY_NAME = eINSTANCE.getEnvEntry_EnvEntryName();

		/**
		 * The meta object literal for the '<em><b>Env Entry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__ENV_ENTRY_TYPE = eINSTANCE.getEnvEntry_EnvEntryType();

		/**
		 * The meta object literal for the '<em><b>Env Entry Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__ENV_ENTRY_VALUE = eINSTANCE.getEnvEntry_EnvEntryValue();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__MAPPED_NAME = eINSTANCE.getEnvEntry_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_ENTRY__INJECTION_TARGETS = eINSTANCE.getEnvEntry_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_ENTRY__ID = eINSTANCE.getEnvEntry_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.IconImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Small Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__SMALL_ICON = eINSTANCE.getIcon_SmallIcon();

		/**
		 * The meta object literal for the '<em><b>Large Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__LARGE_ICON = eINSTANCE.getIcon_LargeIcon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__ID = eINSTANCE.getIcon_Id();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__LANG = eINSTANCE.getIcon_Lang();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.InjectionTargetImpl <em>Injection Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.InjectionTargetImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getInjectionTarget()
		 * @generated
		 */
		EClass INJECTION_TARGET = eINSTANCE.getInjectionTarget();

		/**
		 * The meta object literal for the '<em><b>Injection Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INJECTION_TARGET__INJECTION_TARGET_CLASS = eINSTANCE.getInjectionTarget_InjectionTargetClass();

		/**
		 * The meta object literal for the '<em><b>Injection Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INJECTION_TARGET__INJECTION_TARGET_NAME = eINSTANCE.getInjectionTarget_InjectionTargetName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.LifecycleCallbackImpl <em>Lifecycle Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.LifecycleCallbackImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLifecycleCallback()
		 * @generated
		 */
		EClass LIFECYCLE_CALLBACK = eINSTANCE.getLifecycleCallback();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Callback Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_CALLBACK__LIFECYCLE_CALLBACK_CLASS = eINSTANCE.getLifecycleCallback_LifecycleCallbackClass();

		/**
		 * The meta object literal for the '<em><b>Lifecycle Callback Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFECYCLE_CALLBACK__LIFECYCLE_CALLBACK_METHOD = eINSTANCE.getLifecycleCallback_LifecycleCallbackMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ListenerImpl <em>Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ListenerImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getListener()
		 * @generated
		 */
		EClass LISTENER = eINSTANCE.getListener();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__DESCRIPTIONS = eINSTANCE.getListener_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__DISPLAY_NAMES = eINSTANCE.getListener_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTENER__ICONS = eINSTANCE.getListener_Icons();

		/**
		 * The meta object literal for the '<em><b>Listener Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__LISTENER_CLASS = eINSTANCE.getListener_ListenerClass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTENER__ID = eINSTANCE.getListener_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.MessageDestinationImpl <em>Message Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.MessageDestinationImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestination()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION = eINSTANCE.getMessageDestination();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION__DESCRIPTIONS = eINSTANCE.getMessageDestination_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION__DISPLAY_NAMES = eINSTANCE.getMessageDestination_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION__ICONS = eINSTANCE.getMessageDestination_Icons();

		/**
		 * The meta object literal for the '<em><b>Message Destination Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION__MESSAGE_DESTINATION_NAME = eINSTANCE.getMessageDestination_MessageDestinationName();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION__MAPPED_NAME = eINSTANCE.getMessageDestination_MappedName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION__ID = eINSTANCE.getMessageDestination_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.MessageDestinationRefImpl <em>Message Destination Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.MessageDestinationRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationRef()
		 * @generated
		 */
		EClass MESSAGE_DESTINATION_REF = eINSTANCE.getMessageDestinationRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF__DESCRIPTIONS = eINSTANCE.getMessageDestinationRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Message Destination Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_REF_NAME = eINSTANCE.getMessageDestinationRef_MessageDestinationRefName();

		/**
		 * The meta object literal for the '<em><b>Message Destination Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDestinationRef_MessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_USAGE = eINSTANCE.getMessageDestinationRef_MessageDestinationUsage();

		/**
		 * The meta object literal for the '<em><b>Message Destination Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDestinationRef_MessageDestinationLink();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__MAPPED_NAME = eINSTANCE.getMessageDestinationRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DESTINATION_REF__INJECTION_TARGETS = eINSTANCE.getMessageDestinationRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DESTINATION_REF__ID = eINSTANCE.getMessageDestinationRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ParamValueImpl <em>Param Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ParamValueImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getParamValue()
		 * @generated
		 */
		EClass PARAM_VALUE = eINSTANCE.getParamValue();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE__DESCRIPTIONS = eINSTANCE.getParamValue_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE__PARAM_NAME = eINSTANCE.getParamValue_ParamName();

		/**
		 * The meta object literal for the '<em><b>Param Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE__PARAM_VALUE = eINSTANCE.getParamValue_ParamValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_VALUE__ID = eINSTANCE.getParamValue_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.PersistenceContextRefImpl <em>Persistence Context Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.PersistenceContextRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextRef()
		 * @generated
		 */
		EClass PERSISTENCE_CONTEXT_REF = eINSTANCE.getPersistenceContextRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_CONTEXT_REF__DESCRIPTIONS = eINSTANCE.getPersistenceContextRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONTEXT_REF__PERSISTENCE_CONTEXT_REF_NAME = eINSTANCE.getPersistenceContextRef_PersistenceContextRefName();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONTEXT_REF__PERSISTENCE_UNIT_NAME = eINSTANCE.getPersistenceContextRef_PersistenceUnitName();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONTEXT_REF__PERSISTENCE_CONTEXT_TYPE = eINSTANCE.getPersistenceContextRef_PersistenceContextType();

		/**
		 * The meta object literal for the '<em><b>Persistence Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_CONTEXT_REF__PERSISTENCE_PROPERTIES = eINSTANCE.getPersistenceContextRef_PersistenceProperties();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONTEXT_REF__MAPPED_NAME = eINSTANCE.getPersistenceContextRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_CONTEXT_REF__INJECTION_TARGETS = eINSTANCE.getPersistenceContextRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CONTEXT_REF__ID = eINSTANCE.getPersistenceContextRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.PersistenceUnitRefImpl <em>Persistence Unit Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.PersistenceUnitRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceUnitRef()
		 * @generated
		 */
		EClass PERSISTENCE_UNIT_REF = eINSTANCE.getPersistenceUnitRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_REF__DESCRIPTIONS = eINSTANCE.getPersistenceUnitRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_REF__PERSISTENCE_UNIT_REF_NAME = eINSTANCE.getPersistenceUnitRef_PersistenceUnitRefName();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_REF__PERSISTENCE_UNIT_NAME = eINSTANCE.getPersistenceUnitRef_PersistenceUnitName();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_REF__MAPPED_NAME = eINSTANCE.getPersistenceUnitRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_UNIT_REF__INJECTION_TARGETS = eINSTANCE.getPersistenceUnitRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_UNIT_REF__ID = eINSTANCE.getPersistenceUnitRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.PortComponentRefImpl <em>Port Component Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.PortComponentRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPortComponentRef()
		 * @generated
		 */
		EClass PORT_COMPONENT_REF = eINSTANCE.getPortComponentRef();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF__SERVICE_ENDPOINT_INTERFACE = eINSTANCE.getPortComponentRef_ServiceEndpointInterface();

		/**
		 * The meta object literal for the '<em><b>Enable Mtom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF__ENABLE_MTOM = eINSTANCE.getPortComponentRef_EnableMtom();

		/**
		 * The meta object literal for the '<em><b>Port Component Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF__PORT_COMPONENT_LINK = eINSTANCE.getPortComponentRef_PortComponentLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_COMPONENT_REF__ID = eINSTANCE.getPortComponentRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.PropertyTypeImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__ID = eINSTANCE.getPropertyType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ResourceEnvRefImpl <em>Resource Env Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ResourceEnvRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResourceEnvRef()
		 * @generated
		 */
		EClass RESOURCE_ENV_REF = eINSTANCE.getResourceEnvRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF__DESCRIPTIONS = eINSTANCE.getResourceEnvRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF__RESOURCE_ENV_REF_NAME = eINSTANCE.getResourceEnvRef_ResourceEnvRefName();

		/**
		 * The meta object literal for the '<em><b>Resource Env Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF__RESOURCE_ENV_REF_TYPE = eINSTANCE.getResourceEnvRef_ResourceEnvRefType();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF__MAPPED_NAME = eINSTANCE.getResourceEnvRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ENV_REF__INJECTION_TARGETS = eINSTANCE.getResourceEnvRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ENV_REF__ID = eINSTANCE.getResourceEnvRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ResourceRefImpl <em>Resource Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ResourceRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResourceRef()
		 * @generated
		 */
		EClass RESOURCE_REF = eINSTANCE.getResourceRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF__DESCRIPTIONS = eINSTANCE.getResourceRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Res Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_REF_NAME = eINSTANCE.getResourceRef_ResRefName();

		/**
		 * The meta object literal for the '<em><b>Res Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_TYPE = eINSTANCE.getResourceRef_ResType();

		/**
		 * The meta object literal for the '<em><b>Res Auth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_AUTH = eINSTANCE.getResourceRef_ResAuth();

		/**
		 * The meta object literal for the '<em><b>Res Sharing Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__RES_SHARING_SCOPE = eINSTANCE.getResourceRef_ResSharingScope();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__MAPPED_NAME = eINSTANCE.getResourceRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REF__INJECTION_TARGETS = eINSTANCE.getResourceRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REF__ID = eINSTANCE.getResourceRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.RunAsImpl <em>Run As</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.RunAsImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRunAs()
		 * @generated
		 */
		EClass RUN_AS = eINSTANCE.getRunAs();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_AS__DESCRIPTIONS = eINSTANCE.getRunAs_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_AS__ROLE_NAME = eINSTANCE.getRunAs_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_AS__ID = eINSTANCE.getRunAs_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.SecurityRoleImpl <em>Security Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.SecurityRoleImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getSecurityRole()
		 * @generated
		 */
		EClass SECURITY_ROLE = eINSTANCE.getSecurityRole();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE__DESCRIPTIONS = eINSTANCE.getSecurityRole_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE__ROLE_NAME = eINSTANCE.getSecurityRole_RoleName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE__ID = eINSTANCE.getSecurityRole_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.SecurityRoleRefImpl <em>Security Role Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.SecurityRoleRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getSecurityRoleRef()
		 * @generated
		 */
		EClass SECURITY_ROLE_REF = eINSTANCE.getSecurityRoleRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ROLE_REF__DESCRIPTIONS = eINSTANCE.getSecurityRoleRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_REF__ROLE_NAME = eINSTANCE.getSecurityRoleRef_RoleName();

		/**
		 * The meta object literal for the '<em><b>Role Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_REF__ROLE_LINK = eINSTANCE.getSecurityRoleRef_RoleLink();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ROLE_REF__ID = eINSTANCE.getSecurityRoleRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefImpl <em>Service Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRef()
		 * @generated
		 */
		EClass SERVICE_REF = eINSTANCE.getServiceRef();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__DESCRIPTIONS = eINSTANCE.getServiceRef_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__DISPLAY_NAMES = eINSTANCE.getServiceRef_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__ICONS = eINSTANCE.getServiceRef_Icons();

		/**
		 * The meta object literal for the '<em><b>Service Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__SERVICE_REF_NAME = eINSTANCE.getServiceRef_ServiceRefName();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__SERVICE_INTERFACE = eINSTANCE.getServiceRef_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Service Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__SERVICE_REF_TYPE = eINSTANCE.getServiceRef_ServiceRefType();

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
		 * The meta object literal for the '<em><b>Service Qname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__SERVICE_QNAME = eINSTANCE.getServiceRef_ServiceQname();

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
		 * The meta object literal for the '<em><b>Handler Chains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__HANDLER_CHAINS = eINSTANCE.getServiceRef_HandlerChains();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__MAPPED_NAME = eINSTANCE.getServiceRef_MappedName();

		/**
		 * The meta object literal for the '<em><b>Injection Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF__INJECTION_TARGETS = eINSTANCE.getServiceRef_InjectionTargets();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF__ID = eINSTANCE.getServiceRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerImpl <em>Service Ref Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandler()
		 * @generated
		 */
		EClass SERVICE_REF_HANDLER = eINSTANCE.getServiceRefHandler();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER__DESCRIPTIONS = eINSTANCE.getServiceRefHandler_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER__DISPLAY_NAMES = eINSTANCE.getServiceRefHandler_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER__ICONS = eINSTANCE.getServiceRefHandler_Icons();

		/**
		 * The meta object literal for the '<em><b>Handler Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__HANDLER_NAME = eINSTANCE.getServiceRefHandler_HandlerName();

		/**
		 * The meta object literal for the '<em><b>Handler Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__HANDLER_CLASS = eINSTANCE.getServiceRefHandler_HandlerClass();

		/**
		 * The meta object literal for the '<em><b>Init Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER__INIT_PARAMS = eINSTANCE.getServiceRefHandler_InitParams();

		/**
		 * The meta object literal for the '<em><b>Soap Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__SOAP_HEADERS = eINSTANCE.getServiceRefHandler_SoapHeaders();

		/**
		 * The meta object literal for the '<em><b>Soap Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__SOAP_ROLES = eINSTANCE.getServiceRefHandler_SoapRoles();

		/**
		 * The meta object literal for the '<em><b>Port Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__PORT_NAMES = eINSTANCE.getServiceRefHandler_PortNames();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER__ID = eINSTANCE.getServiceRefHandler_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainImpl <em>Service Ref Handler Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandlerChain()
		 * @generated
		 */
		EClass SERVICE_REF_HANDLER_CHAIN = eINSTANCE.getServiceRefHandlerChain();

		/**
		 * The meta object literal for the '<em><b>Service Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_CHAIN__SERVICE_NAME_PATTERN = eINSTANCE.getServiceRefHandlerChain_ServiceNamePattern();

		/**
		 * The meta object literal for the '<em><b>Port Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_CHAIN__PORT_NAME_PATTERN = eINSTANCE.getServiceRefHandlerChain_PortNamePattern();

		/**
		 * The meta object literal for the '<em><b>Protocol Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_CHAIN__PROTOCOL_BINDINGS = eINSTANCE.getServiceRefHandlerChain_ProtocolBindings();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_CHAIN__HANDLERS = eINSTANCE.getServiceRefHandlerChain_Handlers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_CHAIN__ID = eINSTANCE.getServiceRefHandlerChain_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainsImpl <em>Service Ref Handler Chains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.ServiceRefHandlerChainsImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefHandlerChains()
		 * @generated
		 */
		EClass SERVICE_REF_HANDLER_CHAINS = eINSTANCE.getServiceRefHandlerChains();

		/**
		 * The meta object literal for the '<em><b>Handler Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REF_HANDLER_CHAINS__HANDLER_CHAINS = eINSTANCE.getServiceRefHandlerChains_HandlerChains();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REF_HANDLER_CHAINS__ID = eINSTANCE.getServiceRefHandlerChains_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.internal.impl.UrlPatternTypeImpl <em>Url Pattern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.UrlPatternTypeImpl
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getUrlPatternType()
		 * @generated
		 */
		EClass URL_PATTERN_TYPE = eINSTANCE.getUrlPatternType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PATTERN_TYPE__VALUE = eINSTANCE.getUrlPatternType_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.EjbRefType <em>Ejb Ref Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.EjbRefType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefType()
		 * @generated
		 */
		EEnum EJB_REF_TYPE = eINSTANCE.getEjbRefType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.EnvEntryType <em>Env Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.EnvEntryType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntryType()
		 * @generated
		 */
		EEnum ENV_ENTRY_TYPE = eINSTANCE.getEnvEntryType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.MessageDestinationUsageType <em>Message Destination Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationUsageType()
		 * @generated
		 */
		EEnum MESSAGE_DESTINATION_USAGE_TYPE = eINSTANCE.getMessageDestinationUsageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.PersistenceContextType <em>Persistence Context Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.PersistenceContextType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextType()
		 * @generated
		 */
		EEnum PERSISTENCE_CONTEXT_TYPE = eINSTANCE.getPersistenceContextType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.ResAuthType <em>Res Auth Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.ResAuthType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResAuthType()
		 * @generated
		 */
		EEnum RES_AUTH_TYPE = eINSTANCE.getResAuthType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.core.ResSharingScopeType <em>Res Sharing Scope Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResSharingScopeType()
		 * @generated
		 */
		EEnum RES_SHARING_SCOPE_TYPE = eINSTANCE.getResSharingScopeType();

		/**
		 * The meta object literal for the '<em>Dewey Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getDeweyVersionType()
		 * @generated
		 */
		EDataType DEWEY_VERSION_TYPE = eINSTANCE.getDeweyVersionType();

		/**
		 * The meta object literal for the '<em>EJB Link</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEJBLink()
		 * @generated
		 */
		EDataType EJB_LINK = eINSTANCE.getEJBLink();

		/**
		 * The meta object literal for the '<em>Ejb Ref Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefNameType()
		 * @generated
		 */
		EDataType EJB_REF_NAME_TYPE = eINSTANCE.getEjbRefNameType();

		/**
		 * The meta object literal for the '<em>Ejb Ref Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.EjbRefType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEjbRefTypeObject()
		 * @generated
		 */
		EDataType EJB_REF_TYPE_OBJECT = eINSTANCE.getEjbRefTypeObject();

		/**
		 * The meta object literal for the '<em>Env Entry Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.EnvEntryType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getEnvEntryTypeObject()
		 * @generated
		 */
		EDataType ENV_ENTRY_TYPE_OBJECT = eINSTANCE.getEnvEntryTypeObject();

		/**
		 * The meta object literal for the '<em>Fully Qualified Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getFullyQualifiedClassType()
		 * @generated
		 */
		EDataType FULLY_QUALIFIED_CLASS_TYPE = eINSTANCE.getFullyQualifiedClassType();

		/**
		 * The meta object literal for the '<em>Home</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getHome()
		 * @generated
		 */
		EDataType HOME = eINSTANCE.getHome();

		/**
		 * The meta object literal for the '<em>Java Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJavaIdentifier()
		 * @generated
		 */
		EDataType JAVA_IDENTIFIER = eINSTANCE.getJavaIdentifier();

		/**
		 * The meta object literal for the '<em>Java Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJavaType()
		 * @generated
		 */
		EDataType JAVA_TYPE = eINSTANCE.getJavaType();

		/**
		 * The meta object literal for the '<em>JNDI Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getJNDIName()
		 * @generated
		 */
		EDataType JNDI_NAME = eINSTANCE.getJNDIName();

		/**
		 * The meta object literal for the '<em>Local</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLocal()
		 * @generated
		 */
		EDataType LOCAL = eINSTANCE.getLocal();

		/**
		 * The meta object literal for the '<em>Local Home</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getLocalHome()
		 * @generated
		 */
		EDataType LOCAL_HOME = eINSTANCE.getLocalHome();

		/**
		 * The meta object literal for the '<em>Message Destination Link</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationLink()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDestinationLink();

		/**
		 * The meta object literal for the '<em>Message Destination Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationTypeType()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_TYPE_TYPE = eINSTANCE.getMessageDestinationTypeType();

		/**
		 * The meta object literal for the '<em>Message Destination Usage Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.MessageDestinationUsageType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getMessageDestinationUsageTypeObject()
		 * @generated
		 */
		EDataType MESSAGE_DESTINATION_USAGE_TYPE_OBJECT = eINSTANCE.getMessageDestinationUsageTypeObject();

		/**
		 * The meta object literal for the '<em>Path Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPathType()
		 * @generated
		 */
		EDataType PATH_TYPE = eINSTANCE.getPathType();

		/**
		 * The meta object literal for the '<em>Persistence Context Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.PersistenceContextType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getPersistenceContextTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_CONTEXT_TYPE_OBJECT = eINSTANCE.getPersistenceContextTypeObject();

		/**
		 * The meta object literal for the '<em>Remote</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRemote()
		 * @generated
		 */
		EDataType REMOTE = eINSTANCE.getRemote();

		/**
		 * The meta object literal for the '<em>Res Auth Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.ResAuthType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResAuthTypeObject()
		 * @generated
		 */
		EDataType RES_AUTH_TYPE_OBJECT = eINSTANCE.getResAuthTypeObject();

		/**
		 * The meta object literal for the '<em>Res Sharing Scope Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.ResSharingScopeType
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getResSharingScopeTypeObject()
		 * @generated
		 */
		EDataType RES_SHARING_SCOPE_TYPE_OBJECT = eINSTANCE.getResSharingScopeTypeObject();

		/**
		 * The meta object literal for the '<em>Role Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getRoleName()
		 * @generated
		 */
		EDataType ROLE_NAME = eINSTANCE.getRoleName();

		/**
		 * The meta object literal for the '<em>Service Ref Protocol Binding List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolBindingListType()
		 * @generated
		 */
		EDataType SERVICE_REF_PROTOCOL_BINDING_LIST_TYPE = eINSTANCE.getServiceRefProtocolBindingListType();

		/**
		 * The meta object literal for the '<em>Service Ref Protocol Binding Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolBindingType()
		 * @generated
		 */
		EDataType SERVICE_REF_PROTOCOL_BINDING_TYPE = eINSTANCE.getServiceRefProtocolBindingType();

		/**
		 * The meta object literal for the '<em>Service Ref Protocol URI Alias Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefProtocolURIAliasType()
		 * @generated
		 */
		EDataType SERVICE_REF_PROTOCOL_URI_ALIAS_TYPE = eINSTANCE.getServiceRefProtocolURIAliasType();

		/**
		 * The meta object literal for the '<em>Service Ref Qname Pattern</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getServiceRefQnamePattern()
		 * @generated
		 */
		EDataType SERVICE_REF_QNAME_PATTERN = eINSTANCE.getServiceRefQnamePattern();

		/**
		 * The meta object literal for the '<em>True False Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getTrueFalseType()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE = eINSTANCE.getTrueFalseType();

		/**
		 * The meta object literal for the '<em>True False Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.jst.javaee.core.internal.impl.JavaeePackageImpl#getTrueFalseTypeObject()
		 * @generated
		 */
		EDataType TRUE_FALSE_TYPE_OBJECT = eINSTANCE.getTrueFalseTypeObject();

	}

} //JavaeePackage
