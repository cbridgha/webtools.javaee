/**
 * <copyright>
 * </copyright>
 *
 * $Id: EjbPackage.java,v 1.1 2007/03/20 18:04:45 jsholl Exp $
 */
package org.eclipse.jst.javaee.ejb.internal.metadata;

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
 *       @(#)ejb-jar_3_0.xsds	1.51 02/23/06
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
 *       Sun, Sun Microsystems, the Sun logo, Solaris, Java, javaee,
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
 * 
 * 	This is the XML Schema for the EJB 3.0 deployment descriptor.
 * 	The deployment descriptor must be named "META-INF/ejb-jar.xml" in
 * 	the EJB's jar file.  All EJB deployment descriptors must indicate
 * 	the ejb-jar schema by using the Java EE namespace:
 * 
 * 	http://java.sun.com/xml/ns/javaee
 * 
 * 	and by indicating the version of the schema by
 * 	using the version element as shown below:
 * 
 * 	    &lt;ejb-jar xmlns="http://java.sun.com/xml/ns/javaee"
 * 	      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * 	      xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
 * 		  http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd"
 * 	      version="3.0"&gt;
 * 	      ...
 * 	    &lt;/ejb-jar&gt;
 * 
 * 	The instance documents may indicate the published version of
 * 	the schema using the xsi:schemaLocation attribute for the
 * 	Java EE namespace with the following location:
 * 
 * 	http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd
 * 
 * 	
 *     
 * 
 * 
 *       The following conventions apply to all Java EE
 *       deployment descriptor elements unless indicated otherwise.
 * 
 *       - In elements that specify a pathname to a file within the
 * 	same JAR file, relative filenames (i.e., those not
 * 	starting with "/") are considered relative to the root of
 * 	the JAR file's namespace.  Absolute filenames (i.e., those
 * 	starting with "/") also specify names in the root of the
 * 	JAR file's namespace.  In general, relative names are
 * 	preferred.  The exception is .war files where absolute
 * 	names are preferred for consistency with the Servlet API.
 * 
 *     
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
 * @see org.eclipse.jst.javaee.ejb.internal.metadata.EjbFactory
 * @generated
 */
public interface EjbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ejb"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://java.sun.com/xml/ns/javaee/ejb"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ejb"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjbPackage eINSTANCE = org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigImpl <em>Activation Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getActivationConfig()
	 * @generated
	 */
	int ACTIVATION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Activation Config Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG__ACTIVATION_CONFIG_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG__ID = 2;

	/**
	 * The number of structural features of the '<em>Activation Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigPropertyImpl <em>Activation Config Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigPropertyImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getActivationConfigProperty()
	 * @generated
	 */
	int ACTIVATION_CONFIG_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Activation Config Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY__ACTIVATION_CONFIG_PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Activation Config Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY__ACTIVATION_CONFIG_PROPERTY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY__ID = 2;

	/**
	 * The number of structural features of the '<em>Activation Config Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_CONFIG_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ApplicationExceptionImpl <em>Application Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.ApplicationExceptionImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getApplicationException()
	 * @generated
	 */
	int APPLICATION_EXCEPTION = 2;

	/**
	 * The feature id for the '<em><b>Exception Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION__EXCEPTION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Rollback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION__ROLLBACK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION__ID = 2;

	/**
	 * The number of structural features of the '<em>Application Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_EXCEPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.AroundInvokeTypeImpl <em>Around Invoke Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.AroundInvokeTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getAroundInvokeType()
	 * @generated
	 */
	int AROUND_INVOKE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Around Invoke Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROUND_INVOKE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.AssemblyDescriptorImpl <em>Assembly Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.AssemblyDescriptorImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getAssemblyDescriptor()
	 * @generated
	 */
	int ASSEMBLY_DESCRIPTOR = 4;

	/**
	 * The feature id for the '<em><b>Security Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__SECURITY_ROLES = 0;

	/**
	 * The feature id for the '<em><b>Method Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__METHOD_PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Container Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__CONTAINER_TRANSACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Interceptor Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__INTERCEPTOR_BINDINGS = 3;

	/**
	 * The feature id for the '<em><b>Message Destinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__MESSAGE_DESTINATIONS = 4;

	/**
	 * The feature id for the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__EXCLUDE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Application Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__APPLICATION_EXCEPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR__ID = 7;

	/**
	 * The number of structural features of the '<em>Assembly Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_DESCRIPTOR_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.CMPFieldImpl <em>CMP Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.CMPFieldImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMPField()
	 * @generated
	 */
	int CMP_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD__FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD__ID = 2;

	/**
	 * The number of structural features of the '<em>CMP Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.CMRFieldImpl <em>CMR Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.CMRFieldImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRField()
	 * @generated
	 */
	int CMR_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Cmr Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD__CMR_FIELD_NAME = 1;

	/**
	 * The feature id for the '<em><b>Cmr Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD__CMR_FIELD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD__ID = 3;

	/**
	 * The number of structural features of the '<em>CMR Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMR_FIELD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.ContainerTransactionTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getContainerTransactionType()
	 * @generated
	 */
	int CONTAINER_TRANSACTION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Trans Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Container Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TRANSACTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBJarImpl <em>EJB Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBJarImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBJar()
	 * @generated
	 */
	int EJB_JAR = 8;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__ENTERPRISE_BEANS = 3;

	/**
	 * The feature id for the '<em><b>Interceptors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__INTERCEPTORS = 4;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__RELATIONSHIPS = 5;

	/**
	 * The feature id for the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__ASSEMBLY_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Ejb Client Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__EJB_CLIENT_JAR = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__ID = 8;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__METADATA_COMPLETE = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR__VERSION = 10;

	/**
	 * The number of structural features of the '<em>EJB Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBJarDeploymentDescriptorImpl <em>EJB Jar Deployment Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBJarDeploymentDescriptorImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBJarDeploymentDescriptor()
	 * @generated
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Ejb Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR__EJB_JAR = 3;

	/**
	 * The number of structural features of the '<em>EJB Jar Deployment Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_JAR_DEPLOYMENT_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationImpl <em>EJB Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBRelation()
	 * @generated
	 */
	int EJB_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION__EJB_RELATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION__EJB_RELATIONSHIP_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION__EJB_RELATIONSHIP_ROLE1 = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION__ID = 4;

	/**
	 * The number of structural features of the '<em>EJB Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationshipRoleImpl <em>EJB Relationship Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationshipRoleImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBRelationshipRole()
	 * @generated
	 */
	int EJB_RELATIONSHIP_ROLE = 11;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relationship Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__EJB_RELATIONSHIP_ROLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__MULTIPLICITY = 2;

	/**
	 * The feature id for the '<em><b>Cascade Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__CASCADE_DELETE = 3;

	/**
	 * The feature id for the '<em><b>Relationship Role Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__RELATIONSHIP_ROLE_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Cmr Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__CMR_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE__ID = 6;

	/**
	 * The number of structural features of the '<em>EJB Relationship Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_RELATIONSHIP_ROLE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EnterpriseBeanImpl <em>Enterprise Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EnterpriseBeanImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEnterpriseBean()
	 * @generated
	 */
	int ENTERPRISE_BEAN = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Session Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__SESSION_BEANS = 1;

	/**
	 * The feature id for the '<em><b>Entity Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__ENTITY_BEANS = 2;

	/**
	 * The feature id for the '<em><b>Message Driven Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__MESSAGE_DRIVEN_BEANS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN__ID = 4;

	/**
	 * The number of structural features of the '<em>Enterprise Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERPRISE_BEAN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEntityBean()
	 * @generated
	 */
	int ENTITY_BEAN = 13;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__EJB_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PERSISTENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Prim Key Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PRIM_KEY_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__REENTRANT = 12;

	/**
	 * The feature id for the '<em><b>Cmp Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__CMP_VERSION = 13;

	/**
	 * The feature id for the '<em><b>Abstract Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ABSTRACT_SCHEMA_NAME = 14;

	/**
	 * The feature id for the '<em><b>Cmp Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__CMP_FIELDS = 15;

	/**
	 * The feature id for the '<em><b>Primkey Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PRIMKEY_FIELD = 16;

	/**
	 * The feature id for the '<em><b>Env Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ENV_ENTRIES = 17;

	/**
	 * The feature id for the '<em><b>Ejb Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__EJB_REFS = 18;

	/**
	 * The feature id for the '<em><b>Ejb Local Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__EJB_LOCAL_REFS = 19;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__SERVICE_REFS = 20;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__RESOURCE_REFS = 21;

	/**
	 * The feature id for the '<em><b>Resource Env Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__RESOURCE_ENV_REFS = 22;

	/**
	 * The feature id for the '<em><b>Message Destination Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__MESSAGE_DESTINATION_REFS = 23;

	/**
	 * The feature id for the '<em><b>Persistence Context Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS = 24;

	/**
	 * The feature id for the '<em><b>Persistence Unit Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PERSISTENCE_UNIT_REFS = 25;

	/**
	 * The feature id for the '<em><b>Post Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__POST_CONSTRUCTS = 26;

	/**
	 * The feature id for the '<em><b>Pre Destroys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__PRE_DESTROYS = 27;

	/**
	 * The feature id for the '<em><b>Security Role Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__SECURITY_ROLE_REFS = 28;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__SECURITY_IDENTITY = 29;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__QUERIES = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN__ID = 31;

	/**
	 * The number of structural features of the '<em>Entity Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_BEAN_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ExcludeListImpl <em>Exclude List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.ExcludeListImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getExcludeList()
	 * @generated
	 */
	int EXCLUDE_LIST = 14;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST__ID = 2;

	/**
	 * The number of structural features of the '<em>Exclude List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_LIST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InitMethodTypeImpl <em>Init Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.InitMethodTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInitMethodType()
	 * @generated
	 */
	int INIT_METHOD_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Create Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__CREATE_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Bean Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__BEAN_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Init Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorBindingTypeImpl <em>Interceptor Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorBindingTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorBindingType()
	 * @generated
	 */
	int INTERCEPTOR_BINDING_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Interceptor Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Interceptor Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Exclude Default Interceptors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS = 4;

	/**
	 * The feature id for the '<em><b>Exclude Class Interceptors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS = 5;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__METHOD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Interceptor Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_BINDING_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorOrderTypeImpl <em>Interceptor Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorOrderTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorOrderType()
	 * @generated
	 */
	int INTERCEPTOR_ORDER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Interceptor Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE__INTERCEPTOR_CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Interceptor Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_ORDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorsTypeImpl <em>Interceptors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorsTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorsType()
	 * @generated
	 */
	int INTERCEPTORS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Interceptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__INTERCEPTORS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Interceptors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTORS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorTypeImpl <em>Interceptor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorType()
	 * @generated
	 */
	int INTERCEPTOR_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Interceptor Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__INTERCEPTOR_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Around Invokes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__AROUND_INVOKES = 2;

	/**
	 * The feature id for the '<em><b>Env Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__ENV_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>Ejb Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__EJB_REFS = 4;

	/**
	 * The feature id for the '<em><b>Ejb Local Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__EJB_LOCAL_REFS = 5;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__SERVICE_REFS = 6;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__RESOURCE_REFS = 7;

	/**
	 * The feature id for the '<em><b>Resource Env Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__RESOURCE_ENV_REFS = 8;

	/**
	 * The feature id for the '<em><b>Message Destination Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REFS = 9;

	/**
	 * The feature id for the '<em><b>Persistence Context Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REFS = 10;

	/**
	 * The feature id for the '<em><b>Persistence Unit Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REFS = 11;

	/**
	 * The feature id for the '<em><b>Post Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__POST_CONSTRUCTS = 12;

	/**
	 * The feature id for the '<em><b>Pre Destroys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PRE_DESTROYS = 13;

	/**
	 * The feature id for the '<em><b>Post Activates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__POST_ACTIVATES = 14;

	/**
	 * The feature id for the '<em><b>Pre Passivates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__PRE_PASSIVATES = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE__ID = 16;

	/**
	 * The number of structural features of the '<em>Interceptor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPTOR_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.MessageDrivenBeanImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMessageDrivenBean()
	 * @generated
	 */
	int MESSAGE_DRIVEN_BEAN = 20;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__EJB_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Messaging Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MESSAGING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__TIMEOUT_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__TRANSACTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Message Destination Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Message Destination Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Activation Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ACTIVATION_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Around Invokes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__AROUND_INVOKES = 12;

	/**
	 * The feature id for the '<em><b>Env Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ENV_ENTRIES = 13;

	/**
	 * The feature id for the '<em><b>Ejb Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__EJB_REFS = 14;

	/**
	 * The feature id for the '<em><b>Ejb Local Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__EJB_LOCAL_REFS = 15;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__SERVICE_REFS = 16;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__RESOURCE_REFS = 17;

	/**
	 * The feature id for the '<em><b>Resource Env Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__RESOURCE_ENV_REFS = 18;

	/**
	 * The feature id for the '<em><b>Message Destination Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_REFS = 19;

	/**
	 * The feature id for the '<em><b>Persistence Context Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__PERSISTENCE_CONTEXT_REFS = 20;

	/**
	 * The feature id for the '<em><b>Persistence Unit Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__PERSISTENCE_UNIT_REFS = 21;

	/**
	 * The feature id for the '<em><b>Post Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__POST_CONSTRUCTS = 22;

	/**
	 * The feature id for the '<em><b>Pre Destroys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__PRE_DESTROYS = 23;

	/**
	 * The feature id for the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__SECURITY_IDENTITY = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN__ID = 25;

	/**
	 * The number of structural features of the '<em>Message Driven Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DRIVEN_BEAN_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodParamsImpl <em>Method Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodParamsImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodParams()
	 * @generated
	 */
	int METHOD_PARAMS = 21;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS__METHOD_PARAMS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS__ID = 1;

	/**
	 * The number of structural features of the '<em>Method Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodPermissionImpl <em>Method Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodPermissionImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodPermission()
	 * @generated
	 */
	int METHOD_PERMISSION = 22;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION__ROLE_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION__UNCHECKED = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION__METHODS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION__ID = 4;

	/**
	 * The number of structural features of the '<em>Method Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PERMISSION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Method Intf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_INTF = 2;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_NAME = 3;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__METHOD_PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.NamedMethodTypeImpl <em>Named Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.NamedMethodTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getNamedMethodType()
	 * @generated
	 */
	int NAMED_METHOD_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__METHOD_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Named Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.QueryImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Result Type Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__RESULT_TYPE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Ejb Ql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__EJB_QL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ID = 4;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.QueryMethodImpl <em>Query Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.QueryMethodImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getQueryMethod()
	 * @generated
	 */
	int QUERY_METHOD = 26;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__METHOD_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD__ID = 2;

	/**
	 * The number of structural features of the '<em>Query Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_METHOD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.RelationshipRoleSourceTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRelationshipRoleSourceType()
	 * @generated
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__EJB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Relationship Role Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_ROLE_SOURCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RelationshipsImpl <em>Relationships</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.RelationshipsImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRelationships()
	 * @generated
	 */
	int RELATIONSHIPS = 28;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Ejb Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS__EJB_RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS__ID = 2;

	/**
	 * The number of structural features of the '<em>Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RemoveMethodTypeImpl <em>Remove Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.RemoveMethodTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRemoveMethodType()
	 * @generated
	 */
	int REMOVE_METHOD_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Bean Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__BEAN_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Retain If Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Remove Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_METHOD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.SecurityIdentityTypeImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSecurityIdentityType()
	 * @generated
	 */
	int SECURITY_IDENTITY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Use Caller Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__RUN_AS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Security Identity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_IDENTITY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.SessionBeanImpl <em>Session Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.SessionBeanImpl
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionBean()
	 * @generated
	 */
	int SESSION_BEAN = 31;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Display Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__DISPLAY_NAMES = 1;

	/**
	 * The feature id for the '<em><b>Icons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__ICONS = 2;

	/**
	 * The feature id for the '<em><b>Ejb Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__EJB_NAME = 3;

	/**
	 * The feature id for the '<em><b>Mapped Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__MAPPED_NAME = 4;

	/**
	 * The feature id for the '<em><b>Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__HOME = 5;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__REMOTE = 6;

	/**
	 * The feature id for the '<em><b>Local Home</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__LOCAL_HOME = 7;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__LOCAL = 8;

	/**
	 * The feature id for the '<em><b>Business Locals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__BUSINESS_LOCALS = 9;

	/**
	 * The feature id for the '<em><b>Business Remotes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__BUSINESS_REMOTES = 10;

	/**
	 * The feature id for the '<em><b>Service Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SERVICE_ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__EJB_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Session Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SESSION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__TIMEOUT_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Init Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__INIT_METHODS = 15;

	/**
	 * The feature id for the '<em><b>Remove Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__REMOVE_METHODS = 16;

	/**
	 * The feature id for the '<em><b>Transaction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__TRANSACTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Around Invokes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__AROUND_INVOKES = 18;

	/**
	 * The feature id for the '<em><b>Env Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__ENV_ENTRIES = 19;

	/**
	 * The feature id for the '<em><b>Ejb Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__EJB_REFS = 20;

	/**
	 * The feature id for the '<em><b>Ejb Local Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__EJB_LOCAL_REFS = 21;

	/**
	 * The feature id for the '<em><b>Service Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SERVICE_REFS = 22;

	/**
	 * The feature id for the '<em><b>Resource Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__RESOURCE_REFS = 23;

	/**
	 * The feature id for the '<em><b>Resource Env Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__RESOURCE_ENV_REFS = 24;

	/**
	 * The feature id for the '<em><b>Message Destination Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__MESSAGE_DESTINATION_REFS = 25;

	/**
	 * The feature id for the '<em><b>Persistence Context Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__PERSISTENCE_CONTEXT_REFS = 26;

	/**
	 * The feature id for the '<em><b>Persistence Unit Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__PERSISTENCE_UNIT_REFS = 27;

	/**
	 * The feature id for the '<em><b>Post Constructs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__POST_CONSTRUCTS = 28;

	/**
	 * The feature id for the '<em><b>Pre Destroys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__PRE_DESTROYS = 29;

	/**
	 * The feature id for the '<em><b>Post Activates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__POST_ACTIVATES = 30;

	/**
	 * The feature id for the '<em><b>Pre Passivates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__PRE_PASSIVATES = 31;

	/**
	 * The feature id for the '<em><b>Security Role Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SECURITY_ROLE_REFS = 32;

	/**
	 * The feature id for the '<em><b>Security Identities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__SECURITY_IDENTITIES = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN__ID = 34;

	/**
	 * The number of structural features of the '<em>Session Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_BEAN_FEATURE_COUNT = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.CmpVersionType <em>Cmp Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCmpVersionType()
	 * @generated
	 */
	int CMP_VERSION_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.CMRFieldType <em>CMR Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRFieldType()
	 * @generated
	 */
	int CMR_FIELD_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.MethodInterfaceType <em>Method Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodInterfaceType()
	 * @generated
	 */
	int METHOD_INTERFACE_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.MultiplicityType <em>Multiplicity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.PersistenceType <em>Persistence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getPersistenceType()
	 * @generated
	 */
	int PERSISTENCE_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.ResultTypeMappingType <em>Result Type Mapping Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getResultTypeMappingType()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.SessionType <em>Session Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.SessionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionType()
	 * @generated
	 */
	int SESSION_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.TransactionAttributeType <em>Transaction Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionAttributeType()
	 * @generated
	 */
	int TRANSACTION_ATTRIBUTE_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.jst.javaee.ejb.TransactionType <em>Transaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.TransactionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 40;

	/**
	 * The meta object id for the '<em>Cmp Version Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCmpVersionTypeObject()
	 * @generated
	 */
	int CMP_VERSION_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>CMR Field Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRFieldTypeObject()
	 * @generated
	 */
	int CMR_FIELD_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEjbClassType()
	 * @generated
	 */
	int EJB_CLASS_TYPE = 43;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEjbNameType()
	 * @generated
	 */
	int EJB_NAME_TYPE = 44;

	/**
	 * The meta object id for the '<em>Method Interface Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodInterfaceTypeObject()
	 * @generated
	 */
	int METHOD_INTERFACE_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Method Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodNameType()
	 * @generated
	 */
	int METHOD_NAME_TYPE = 46;

	/**
	 * The meta object id for the '<em>Multiplicity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMultiplicityTypeObject()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Persistence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getPersistenceTypeObject()
	 * @generated
	 */
	int PERSISTENCE_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Result Type Mapping Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getResultTypeMappingTypeObject()
	 * @generated
	 */
	int RESULT_TYPE_MAPPING_TYPE_OBJECT = 49;

	/**
	 * The meta object id for the '<em>Session Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.SessionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionTypeObject()
	 * @generated
	 */
	int SESSION_TYPE_OBJECT = 50;

	/**
	 * The meta object id for the '<em>Transaction Attribute Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionAttributeTypeObject()
	 * @generated
	 */
	int TRANSACTION_ATTRIBUTE_TYPE_OBJECT = 51;

	/**
	 * The meta object id for the '<em>Transaction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jst.javaee.ejb.TransactionType
	 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionTypeObject()
	 * @generated
	 */
	int TRANSACTION_TYPE_OBJECT = 52;


	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.ActivationConfig <em>Activation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfig
	 * @generated
	 */
	EClass getActivationConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ActivationConfig#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfig#getDescriptions()
	 * @see #getActivationConfig()
	 * @generated
	 */
	EReference getActivationConfig_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ActivationConfig#getActivationConfigProperties <em>Activation Config Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activation Config Properties</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfig#getActivationConfigProperties()
	 * @see #getActivationConfig()
	 * @generated
	 */
	EReference getActivationConfig_ActivationConfigProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ActivationConfig#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfig#getId()
	 * @see #getActivationConfig()
	 * @generated
	 */
	EAttribute getActivationConfig_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.ActivationConfigProperty <em>Activation Config Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Config Property</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfigProperty
	 * @generated
	 */
	EClass getActivationConfigProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getActivationConfigPropertyName <em>Activation Config Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Config Property Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getActivationConfigPropertyName()
	 * @see #getActivationConfigProperty()
	 * @generated
	 */
	EAttribute getActivationConfigProperty_ActivationConfigPropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Config Property Value</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getActivationConfigPropertyValue()
	 * @see #getActivationConfigProperty()
	 * @generated
	 */
	EAttribute getActivationConfigProperty_ActivationConfigPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ActivationConfigProperty#getId()
	 * @see #getActivationConfigProperty()
	 * @generated
	 */
	EAttribute getActivationConfigProperty_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.ApplicationException <em>Application Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Exception</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ApplicationException
	 * @generated
	 */
	EClass getApplicationException();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ApplicationException#getExceptionClass <em>Exception Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ApplicationException#getExceptionClass()
	 * @see #getApplicationException()
	 * @generated
	 */
	EAttribute getApplicationException_ExceptionClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ApplicationException#isRollback <em>Rollback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rollback</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ApplicationException#isRollback()
	 * @see #getApplicationException()
	 * @generated
	 */
	EAttribute getApplicationException_Rollback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ApplicationException#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ApplicationException#getId()
	 * @see #getApplicationException()
	 * @generated
	 */
	EAttribute getApplicationException_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.AroundInvokeType <em>Around Invoke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Around Invoke Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AroundInvokeType
	 * @generated
	 */
	EClass getAroundInvokeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.AroundInvokeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AroundInvokeType#getClass_()
	 * @see #getAroundInvokeType()
	 * @generated
	 */
	EAttribute getAroundInvokeType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.AroundInvokeType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AroundInvokeType#getMethodName()
	 * @see #getAroundInvokeType()
	 * @generated
	 */
	EAttribute getAroundInvokeType_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor
	 * @generated
	 */
	EClass getAssemblyDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getSecurityRoles <em>Security Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Roles</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getSecurityRoles()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_SecurityRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getMethodPermissions <em>Method Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Permissions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getMethodPermissions()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_MethodPermissions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getContainerTransactions <em>Container Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Transactions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getContainerTransactions()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_ContainerTransactions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getInterceptorBindings <em>Interceptor Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptor Bindings</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getInterceptorBindings()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_InterceptorBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getMessageDestinations <em>Message Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destinations</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getMessageDestinations()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_MessageDestinations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude List</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getExcludeList()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_ExcludeList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getApplicationExceptions <em>Application Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Exceptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getApplicationExceptions()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EReference getAssemblyDescriptor_ApplicationExceptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.AssemblyDescriptor#getId()
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	EAttribute getAssemblyDescriptor_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.CMPField <em>CMP Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMP Field</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMPField
	 * @generated
	 */
	EClass getCMPField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.CMPField#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMPField#getDescriptions()
	 * @see #getCMPField()
	 * @generated
	 */
	EReference getCMPField_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.CMPField#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMPField#getFieldName()
	 * @see #getCMPField()
	 * @generated
	 */
	EAttribute getCMPField_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.CMPField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMPField#getId()
	 * @see #getCMPField()
	 * @generated
	 */
	EAttribute getCMPField_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.CMRField <em>CMR Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CMR Field</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRField
	 * @generated
	 */
	EClass getCMRField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.CMRField#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRField#getDescriptions()
	 * @see #getCMRField()
	 * @generated
	 */
	EReference getCMRField_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.CMRField#getCmrFieldName <em>Cmr Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmr Field Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRField#getCmrFieldName()
	 * @see #getCMRField()
	 * @generated
	 */
	EAttribute getCMRField_CmrFieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.CMRField#getCmrFieldType <em>Cmr Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmr Field Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRField#getCmrFieldType()
	 * @see #getCMRField()
	 * @generated
	 */
	EAttribute getCMRField_CmrFieldType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.CMRField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRField#getId()
	 * @see #getCMRField()
	 * @generated
	 */
	EAttribute getCMRField_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.ContainerTransactionType <em>Container Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Transaction Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ContainerTransactionType
	 * @generated
	 */
	EClass getContainerTransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ContainerTransactionType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ContainerTransactionType#getDescriptions()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ContainerTransactionType#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ContainerTransactionType#getMethods()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EReference getContainerTransactionType_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ContainerTransactionType#getTransAttribute <em>Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Attribute</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ContainerTransactionType#getTransAttribute()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_TransAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ContainerTransactionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ContainerTransactionType#getId()
	 * @see #getContainerTransactionType()
	 * @generated
	 */
	EAttribute getContainerTransactionType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EJBJar <em>EJB Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Jar</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar
	 * @generated
	 */
	EClass getEJBJar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EJBJar#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getDescriptions()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EJBJar#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getDisplayNames()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EJBJar#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getIcons()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_Icons();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBJar#getEnterpriseBeans <em>Enterprise Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enterprise Beans</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getEnterpriseBeans()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_EnterpriseBeans();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBJar#getInterceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptors</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getInterceptors()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_Interceptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBJar#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationships</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getRelationships()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_Relationships();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBJar#getAssemblyDescriptor <em>Assembly Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assembly Descriptor</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getAssemblyDescriptor()
	 * @see #getEJBJar()
	 * @generated
	 */
	EReference getEJBJar_AssemblyDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBJar#getEjbClientJar <em>Ejb Client Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Client Jar</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getEjbClientJar()
	 * @see #getEJBJar()
	 * @generated
	 */
	EAttribute getEJBJar_EjbClientJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBJar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getId()
	 * @see #getEJBJar()
	 * @generated
	 */
	EAttribute getEJBJar_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBJar#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#isMetadataComplete()
	 * @see #getEJBJar()
	 * @generated
	 */
	EAttribute getEJBJar_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBJar#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJar#getVersion()
	 * @see #getEJBJar()
	 * @generated
	 */
	EAttribute getEJBJar_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor <em>EJB Jar Deployment Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Jar Deployment Descriptor</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor
	 * @generated
	 */
	EClass getEJBJarDeploymentDescriptor();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getMixed()
	 * @see #getEJBJarDeploymentDescriptor()
	 * @generated
	 */
	EAttribute getEJBJarDeploymentDescriptor_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getXMLNSPrefixMap()
	 * @see #getEJBJarDeploymentDescriptor()
	 * @generated
	 */
	EReference getEJBJarDeploymentDescriptor_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getXSISchemaLocation()
	 * @see #getEJBJarDeploymentDescriptor()
	 * @generated
	 */
	EReference getEJBJarDeploymentDescriptor_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getEjbJar <em>Ejb Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Jar</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBJarDeploymentDescriptor#getEjbJar()
	 * @see #getEJBJarDeploymentDescriptor()
	 * @generated
	 */
	EReference getEJBJarDeploymentDescriptor_EjbJar();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EJBRelation <em>EJB Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Relation</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation
	 * @generated
	 */
	EClass getEJBRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation#getDescriptions()
	 * @see #getEJBRelation()
	 * @generated
	 */
	EReference getEJBRelation_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationName <em>Ejb Relation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Relation Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationName()
	 * @see #getEJBRelation()
	 * @generated
	 */
	EAttribute getEJBRelation_EjbRelationName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole <em>Ejb Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole()
	 * @see #getEJBRelation()
	 * @generated
	 */
	EReference getEJBRelation_EjbRelationshipRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ejb Relationship Role1</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation#getEjbRelationshipRole1()
	 * @see #getEJBRelation()
	 * @generated
	 */
	EReference getEJBRelation_EjbRelationshipRole1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBRelation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelation#getId()
	 * @see #getEJBRelation()
	 * @generated
	 */
	EAttribute getEJBRelation_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole <em>EJB Relationship Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJB Relationship Role</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole
	 * @generated
	 */
	EClass getEJBRelationshipRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getDescriptions()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EReference getEJBRelationshipRole_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Relationship Role Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getEjbRelationshipRoleName()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EAttribute getEJBRelationshipRole_EjbRelationshipRoleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getMultiplicity()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EAttribute getEJBRelationshipRole_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getCascadeDelete <em>Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Delete</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getCascadeDelete()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EReference getEJBRelationshipRole_CascadeDelete();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getRelationshipRoleSource <em>Relationship Role Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Role Source</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getRelationshipRoleSource()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EReference getEJBRelationshipRole_RelationshipRoleSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getCmrField <em>Cmr Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cmr Field</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getCmrField()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EReference getEJBRelationshipRole_CmrField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EJBRelationshipRole#getId()
	 * @see #getEJBRelationshipRole()
	 * @generated
	 */
	EAttribute getEJBRelationshipRole_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean <em>Enterprise Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enterprise Bean</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean
	 * @generated
	 */
	EClass getEnterpriseBean();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean#getGroup()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EAttribute getEnterpriseBean_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean#getSessionBeans <em>Session Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Session Beans</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean#getSessionBeans()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_SessionBeans();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean#getEntityBeans <em>Entity Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Beans</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean#getEntityBeans()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_EntityBeans();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean#getMessageDrivenBeans <em>Message Driven Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Driven Beans</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean#getMessageDrivenBeans()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EReference getEnterpriseBean_MessageDrivenBeans();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EnterpriseBean#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EnterpriseBean#getId()
	 * @see #getEnterpriseBean()
	 * @generated
	 */
	EAttribute getEnterpriseBean_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.EntityBean <em>Entity Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Bean</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean
	 * @generated
	 */
	EClass getEntityBean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getDescriptions()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getDisplayNames()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getIcons()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getEjbName()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getMappedName()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getHome()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Home();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getRemote()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Remote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Home</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getLocalHome()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_LocalHome();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getLocal()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Local();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getEjbClass()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_EjbClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistence Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceType()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_PersistenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimKeyClass <em>Prim Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prim Key Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPrimKeyClass()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_PrimKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#isReentrant <em>Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reentrant</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#isReentrant()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Reentrant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion <em>Cmp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmp Version</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getCmpVersion()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_CmpVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getAbstractSchemaName <em>Abstract Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Schema Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getAbstractSchemaName()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_AbstractSchemaName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getCmpFields <em>Cmp Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmp Fields</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getCmpFields()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_CmpFields();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPrimkeyField <em>Primkey Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primkey Field</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPrimkeyField()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_PrimkeyField();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEnvEntries <em>Env Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entries</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getEnvEntries()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_EnvEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbRefs <em>Ejb Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getEjbRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_EjbRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getEjbLocalRefs <em>Ejb Local Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getEjbLocalRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_EjbLocalRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getServiceRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_ServiceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getResourceRefs <em>Resource Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getResourceRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_ResourceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getResourceEnvRefs <em>Resource Env Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getResourceEnvRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_ResourceEnvRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getMessageDestinationRefs <em>Message Destination Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getMessageDestinationRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_MessageDestinationRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceContextRefs <em>Persistence Context Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceContextRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_PersistenceContextRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPersistenceUnitRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_PersistenceUnitRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPostConstructs <em>Post Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Constructs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPostConstructs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_PostConstructs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getPreDestroys <em>Pre Destroys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroys</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getPreDestroys()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_PreDestroys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getSecurityRoleRefs <em>Security Role Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getSecurityRoleRefs()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_SecurityRoleRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.EntityBean#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getSecurityIdentity()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_SecurityIdentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.EntityBean#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getQueries()
	 * @see #getEntityBean()
	 * @generated
	 */
	EReference getEntityBean_Queries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.EntityBean#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.EntityBean#getId()
	 * @see #getEntityBean()
	 * @generated
	 */
	EAttribute getEntityBean_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.ExcludeList <em>Exclude List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude List</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ExcludeList
	 * @generated
	 */
	EClass getExcludeList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ExcludeList#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ExcludeList#getDescriptions()
	 * @see #getExcludeList()
	 * @generated
	 */
	EReference getExcludeList_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.ExcludeList#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ExcludeList#getMethods()
	 * @see #getExcludeList()
	 * @generated
	 */
	EReference getExcludeList_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.ExcludeList#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ExcludeList#getId()
	 * @see #getExcludeList()
	 * @generated
	 */
	EAttribute getExcludeList_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.InitMethodType <em>Init Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Method Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InitMethodType
	 * @generated
	 */
	EClass getInitMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.InitMethodType#getCreateMethod <em>Create Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InitMethodType#getCreateMethod()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EReference getInitMethodType_CreateMethod();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.InitMethodType#getBeanMethod <em>Bean Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InitMethodType#getBeanMethod()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EReference getInitMethodType_BeanMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InitMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InitMethodType#getId()
	 * @see #getInitMethodType()
	 * @generated
	 */
	EAttribute getInitMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType <em>Interceptor Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Binding Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType
	 * @generated
	 */
	EClass getInterceptorBindingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getDescriptions()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getEjbName()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_EjbName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getInterceptorClasses <em>Interceptor Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interceptor Classes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getInterceptorClasses()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_InterceptorClasses();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getInterceptorOrder <em>Interceptor Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interceptor Order</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getInterceptorOrder()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_InterceptorOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#isExcludeDefaultInterceptors <em>Exclude Default Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Default Interceptors</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#isExcludeDefaultInterceptors()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_ExcludeDefaultInterceptors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#isExcludeClassInterceptors <em>Exclude Class Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Class Interceptors</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#isExcludeClassInterceptors()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_ExcludeClassInterceptors();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getMethod()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EReference getInterceptorBindingType_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorBindingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorBindingType#getId()
	 * @see #getInterceptorBindingType()
	 * @generated
	 */
	EAttribute getInterceptorBindingType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.InterceptorOrderType <em>Interceptor Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Order Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorOrderType
	 * @generated
	 */
	EClass getInterceptorOrderType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.InterceptorOrderType#getInterceptorClasses <em>Interceptor Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interceptor Classes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorOrderType#getInterceptorClasses()
	 * @see #getInterceptorOrderType()
	 * @generated
	 */
	EAttribute getInterceptorOrderType_InterceptorClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorOrderType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorOrderType#getId()
	 * @see #getInterceptorOrderType()
	 * @generated
	 */
	EAttribute getInterceptorOrderType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.InterceptorsType <em>Interceptors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptors Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorsType
	 * @generated
	 */
	EClass getInterceptorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorsType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorsType#getDescriptions()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EReference getInterceptorsType_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorsType#getInterceptors <em>Interceptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interceptors</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorsType#getInterceptors()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EReference getInterceptorsType_Interceptors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorsType#getId()
	 * @see #getInterceptorsType()
	 * @generated
	 */
	EAttribute getInterceptorsType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.InterceptorType <em>Interceptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interceptor Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType
	 * @generated
	 */
	EClass getInterceptorType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getDescriptions()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getInterceptorClass <em>Interceptor Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interceptor Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getInterceptorClass()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EAttribute getInterceptorType_InterceptorClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getAroundInvokes <em>Around Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invokes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getAroundInvokes()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_AroundInvokes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getEnvEntries <em>Env Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entries</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getEnvEntries()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EnvEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getEjbRefs <em>Ejb Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getEjbRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EjbRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getEjbLocalRefs <em>Ejb Local Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getEjbLocalRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_EjbLocalRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getServiceRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ServiceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getResourceRefs <em>Resource Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getResourceRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ResourceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getResourceEnvRefs <em>Resource Env Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getResourceEnvRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_ResourceEnvRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getMessageDestinationRefs <em>Message Destination Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getMessageDestinationRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_MessageDestinationRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPersistenceContextRefs <em>Persistence Context Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPersistenceContextRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PersistenceContextRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPersistenceUnitRefs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PersistenceUnitRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPostConstructs <em>Post Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Constructs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPostConstructs()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PostConstructs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPreDestroys <em>Pre Destroys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroys</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPreDestroys()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PreDestroys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPostActivates <em>Post Activates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Activates</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPostActivates()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PostActivates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getPrePassivates <em>Pre Passivates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Passivates</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getPrePassivates()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EReference getInterceptorType_PrePassivates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.InterceptorType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.InterceptorType#getId()
	 * @see #getInterceptorType()
	 * @generated
	 */
	EAttribute getInterceptorType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean <em>Message Driven Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Driven Bean</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean
	 * @generated
	 */
	EClass getMessageDrivenBean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getDescriptions()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getDisplayNames()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getIcons()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbName()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMappedName()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbClass()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_EjbClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessagingType <em>Messaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messaging Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessagingType()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_MessagingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getTimeoutMethod <em>Timeout Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getTimeoutMethod()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_TimeoutMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getTransactionType()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_TransactionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationType <em>Message Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationType()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_MessageDestinationType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationLink <em>Message Destination Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Destination Link</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationLink()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_MessageDestinationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getActivationConfig <em>Activation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Config</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getActivationConfig()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_ActivationConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getAroundInvokes <em>Around Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invokes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getAroundInvokes()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_AroundInvokes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEnvEntries <em>Env Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entries</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEnvEntries()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_EnvEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbRefs <em>Ejb Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_EjbRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbLocalRefs <em>Ejb Local Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getEjbLocalRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_EjbLocalRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getServiceRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_ServiceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getResourceRefs <em>Resource Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getResourceRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_ResourceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getResourceEnvRefs <em>Resource Env Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getResourceEnvRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_ResourceEnvRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationRefs <em>Message Destination Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getMessageDestinationRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_MessageDestinationRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPersistenceContextRefs <em>Persistence Context Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPersistenceContextRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_PersistenceContextRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPersistenceUnitRefs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_PersistenceUnitRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPostConstructs <em>Post Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Constructs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPostConstructs()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_PostConstructs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPreDestroys <em>Pre Destroys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroys</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getPreDestroys()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_PreDestroys();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getSecurityIdentity <em>Security Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identity</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getSecurityIdentity()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EReference getMessageDrivenBean_SecurityIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MessageDrivenBean#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MessageDrivenBean#getId()
	 * @see #getMessageDrivenBean()
	 * @generated
	 */
	EAttribute getMessageDrivenBean_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.MethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Params</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodParams
	 * @generated
	 */
	EClass getMethodParams();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.MethodParams#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Method Params</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodParams#getMethodParams()
	 * @see #getMethodParams()
	 * @generated
	 */
	EAttribute getMethodParams_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodParams#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodParams#getId()
	 * @see #getMethodParams()
	 * @generated
	 */
	EAttribute getMethodParams_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.MethodPermission <em>Method Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Permission</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission
	 * @generated
	 */
	EClass getMethodPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission#getDescriptions()
	 * @see #getMethodPermission()
	 * @generated
	 */
	EReference getMethodPermission_Descriptions();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getRoleNames <em>Role Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Names</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission#getRoleNames()
	 * @see #getMethodPermission()
	 * @generated
	 */
	EAttribute getMethodPermission_RoleNames();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getUnchecked <em>Unchecked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unchecked</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission#getUnchecked()
	 * @see #getMethodPermission()
	 * @generated
	 */
	EReference getMethodPermission_Unchecked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission#getMethods()
	 * @see #getMethodPermission()
	 * @generated
	 */
	EReference getMethodPermission_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodPermission#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodPermission#getId()
	 * @see #getMethodPermission()
	 * @generated
	 */
	EAttribute getMethodPermission_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType
	 * @generated
	 */
	EClass getMethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.MethodType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getDescriptions()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getEjbName()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodType#getMethodIntf <em>Method Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Intf</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getMethodIntf()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_MethodIntf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getMethodName()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.MethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getMethodParams()
	 * @see #getMethodType()
	 * @generated
	 */
	EReference getMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.MethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodType#getId()
	 * @see #getMethodType()
	 * @generated
	 */
	EAttribute getMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.NamedMethodType <em>Named Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Method Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.NamedMethodType
	 * @generated
	 */
	EClass getNamedMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.NamedMethodType#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.NamedMethodType#getMethodName()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EAttribute getNamedMethodType_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.NamedMethodType#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.jst.javaee.ejb.NamedMethodType#getMethodParams()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EReference getNamedMethodType_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.NamedMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.NamedMethodType#getId()
	 * @see #getNamedMethodType()
	 * @generated
	 */
	EAttribute getNamedMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.Query#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query#getDescription()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.Query#getQueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query#getQueryMethod()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_QueryMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.Query#getResultTypeMapping <em>Result Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type Mapping</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query#getResultTypeMapping()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_ResultTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.Query#getEjbQl <em>Ejb Ql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Ql</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query#getEjbQl()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_EjbQl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.Query#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Query#getId()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.QueryMethod <em>Query Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.QueryMethod
	 * @generated
	 */
	EClass getQueryMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.QueryMethod#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.QueryMethod#getMethodName()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EAttribute getQueryMethod_MethodName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.QueryMethod#getMethodParams <em>Method Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Params</em>'.
	 * @see org.eclipse.jst.javaee.ejb.QueryMethod#getMethodParams()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EReference getQueryMethod_MethodParams();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.QueryMethod#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.QueryMethod#getId()
	 * @see #getQueryMethod()
	 * @generated
	 */
	EAttribute getQueryMethod_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType <em>Relationship Role Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Role Source Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType
	 * @generated
	 */
	EClass getRelationshipRoleSourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getDescriptions()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EReference getRelationshipRoleSourceType_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getEjbName()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EAttribute getRelationshipRoleSourceType_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RelationshipRoleSourceType#getId()
	 * @see #getRelationshipRoleSourceType()
	 * @generated
	 */
	EAttribute getRelationshipRoleSourceType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.Relationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Relationships
	 * @generated
	 */
	EClass getRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.Relationships#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Relationships#getDescriptions()
	 * @see #getRelationships()
	 * @generated
	 */
	EReference getRelationships_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.Relationships#getEjbRelations <em>Ejb Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Relations</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Relationships#getEjbRelations()
	 * @see #getRelationships()
	 * @generated
	 */
	EReference getRelationships_EjbRelations();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.Relationships#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.Relationships#getId()
	 * @see #getRelationships()
	 * @generated
	 */
	EAttribute getRelationships_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.RemoveMethodType <em>Remove Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Method Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RemoveMethodType
	 * @generated
	 */
	EClass getRemoveMethodType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.RemoveMethodType#getBeanMethod <em>Bean Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bean Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RemoveMethodType#getBeanMethod()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EReference getRemoveMethodType_BeanMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.RemoveMethodType#isRetainIfException <em>Retain If Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain If Exception</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RemoveMethodType#isRetainIfException()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EAttribute getRemoveMethodType_RetainIfException();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.RemoveMethodType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.RemoveMethodType#getId()
	 * @see #getRemoveMethodType()
	 * @generated
	 */
	EAttribute getRemoveMethodType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.SecurityIdentityType <em>Security Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Identity Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SecurityIdentityType
	 * @generated
	 */
	EClass getSecurityIdentityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SecurityIdentityType#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SecurityIdentityType#getDescriptions()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_Descriptions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.SecurityIdentityType#getUseCallerIdentity <em>Use Caller Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use Caller Identity</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SecurityIdentityType#getUseCallerIdentity()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_UseCallerIdentity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.SecurityIdentityType#getRunAs <em>Run As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run As</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SecurityIdentityType#getRunAs()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EReference getSecurityIdentityType_RunAs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SecurityIdentityType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SecurityIdentityType#getId()
	 * @see #getSecurityIdentityType()
	 * @generated
	 */
	EAttribute getSecurityIdentityType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.jst.javaee.ejb.SessionBean <em>Session Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Bean</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean
	 * @generated
	 */
	EClass getSessionBean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getDescriptions()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getDisplayNames <em>Display Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Display Names</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getDisplayNames()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_DisplayNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getIcons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icons</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getIcons()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_Icons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getEjbName <em>Ejb Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getEjbName()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_EjbName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getMappedName <em>Mapped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped Name</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getMappedName()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_MappedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getHome <em>Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getHome()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_Home();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getRemote()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_Remote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getLocalHome <em>Local Home</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Home</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getLocalHome()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_LocalHome();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getLocal()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_Local();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getBusinessLocals <em>Business Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Business Locals</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getBusinessLocals()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_BusinessLocals();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getBusinessRemotes <em>Business Remotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Business Remotes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getBusinessRemotes()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_BusinessRemotes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Endpoint</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getServiceEndpoint()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_ServiceEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getEjbClass <em>Ejb Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ejb Class</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getEjbClass()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_EjbClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getSessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getSessionType()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_SessionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.SessionBean#getTimeoutMethod <em>Timeout Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Method</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getTimeoutMethod()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_TimeoutMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getInitMethods <em>Init Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Methods</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getInitMethods()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_InitMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getRemoveMethods <em>Remove Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remove Methods</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getRemoveMethods()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_RemoveMethods();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getTransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getTransactionType()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_TransactionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getAroundInvokes <em>Around Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Around Invokes</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getAroundInvokes()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_AroundInvokes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getEnvEntries <em>Env Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Entries</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getEnvEntries()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_EnvEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getEjbRefs <em>Ejb Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getEjbRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_EjbRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getEjbLocalRefs <em>Ejb Local Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ejb Local Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getEjbLocalRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_EjbLocalRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getServiceRefs <em>Service Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getServiceRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_ServiceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getResourceRefs <em>Resource Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getResourceRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_ResourceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getResourceEnvRefs <em>Resource Env Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Env Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getResourceEnvRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_ResourceEnvRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getMessageDestinationRefs <em>Message Destination Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Destination Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getMessageDestinationRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_MessageDestinationRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPersistenceContextRefs <em>Persistence Context Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Context Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPersistenceContextRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PersistenceContextRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPersistenceUnitRefs <em>Persistence Unit Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persistence Unit Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPersistenceUnitRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PersistenceUnitRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPostConstructs <em>Post Constructs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Constructs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPostConstructs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PostConstructs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPreDestroys <em>Pre Destroys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Destroys</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPreDestroys()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PreDestroys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPostActivates <em>Post Activates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Activates</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPostActivates()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PostActivates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getPrePassivates <em>Pre Passivates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Passivates</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getPrePassivates()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_PrePassivates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.jst.javaee.ejb.SessionBean#getSecurityRoleRefs <em>Security Role Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Role Refs</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getSecurityRoleRefs()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_SecurityRoleRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.jst.javaee.ejb.SessionBean#getSecurityIdentities <em>Security Identities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Identities</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getSecurityIdentities()
	 * @see #getSessionBean()
	 * @generated
	 */
	EReference getSessionBean_SecurityIdentities();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.jst.javaee.ejb.SessionBean#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionBean#getId()
	 * @see #getSessionBean()
	 * @generated
	 */
	EAttribute getSessionBean_Id();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.CmpVersionType <em>Cmp Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmp Version Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @generated
	 */
	EEnum getCmpVersionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.CMRFieldType <em>CMR Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CMR Field Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
	 * @generated
	 */
	EEnum getCMRFieldType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.MethodInterfaceType <em>Method Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Interface Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
	 * @generated
	 */
	EEnum getMethodInterfaceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
	 * @generated
	 */
	EEnum getMultiplicityType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.PersistenceType <em>Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Persistence Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @generated
	 */
	EEnum getPersistenceType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.ResultTypeMappingType <em>Result Type Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type Mapping Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
	 * @generated
	 */
	EEnum getResultTypeMappingType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.SessionType <em>Session Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Session Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionType
	 * @generated
	 */
	EEnum getSessionType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.TransactionAttributeType <em>Transaction Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Attribute Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
	 * @generated
	 */
	EEnum getTransactionAttributeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.jst.javaee.ejb.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Type</em>'.
	 * @see org.eclipse.jst.javaee.ejb.TransactionType
	 * @generated
	 */
	EEnum getTransactionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.CmpVersionType <em>Cmp Version Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cmp Version Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
	 * @generated
	 */
	EDataType getCmpVersionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.CMRFieldType <em>CMR Field Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CMR Field Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
	 * @generated
	 */
	EDataType getCMRFieldTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getEjbClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getEjbNameType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.MethodInterfaceType <em>Method Interface Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Interface Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
	 * @generated
	 */
	EDataType getMethodInterfaceTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Method Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Method Name Type</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	EDataType getMethodNameType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.MultiplicityType <em>Multiplicity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
	 * @generated
	 */
	EDataType getMultiplicityTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.PersistenceType <em>Persistence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Persistence Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.PersistenceType
	 * @generated
	 */
	EDataType getPersistenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.ResultTypeMappingType <em>Result Type Mapping Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Mapping Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
	 * @generated
	 */
	EDataType getResultTypeMappingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.SessionType <em>Session Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Session Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.SessionType
	 * @generated
	 */
	EDataType getSessionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.TransactionAttributeType <em>Transaction Attribute Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Attribute Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
	 * @generated
	 */
	EDataType getTransactionAttributeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jst.javaee.ejb.TransactionType <em>Transaction Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transaction Type Object</em>'.
	 * @see org.eclipse.jst.javaee.ejb.TransactionType
	 * @generated
	 */
	EDataType getTransactionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EjbFactory getEjbFactory();

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
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigImpl <em>Activation Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getActivationConfig()
		 * @generated
		 */
		EClass ACTIVATION_CONFIG = eINSTANCE.getActivationConfig();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG__DESCRIPTIONS = eINSTANCE.getActivationConfig_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Activation Config Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_CONFIG__ACTIVATION_CONFIG_PROPERTIES = eINSTANCE.getActivationConfig_ActivationConfigProperties();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG__ID = eINSTANCE.getActivationConfig_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigPropertyImpl <em>Activation Config Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.ActivationConfigPropertyImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getActivationConfigProperty()
		 * @generated
		 */
		EClass ACTIVATION_CONFIG_PROPERTY = eINSTANCE.getActivationConfigProperty();

		/**
		 * The meta object literal for the '<em><b>Activation Config Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG_PROPERTY__ACTIVATION_CONFIG_PROPERTY_NAME = eINSTANCE.getActivationConfigProperty_ActivationConfigPropertyName();

		/**
		 * The meta object literal for the '<em><b>Activation Config Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG_PROPERTY__ACTIVATION_CONFIG_PROPERTY_VALUE = eINSTANCE.getActivationConfigProperty_ActivationConfigPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_CONFIG_PROPERTY__ID = eINSTANCE.getActivationConfigProperty_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ApplicationExceptionImpl <em>Application Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.ApplicationExceptionImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getApplicationException()
		 * @generated
		 */
		EClass APPLICATION_EXCEPTION = eINSTANCE.getApplicationException();

		/**
		 * The meta object literal for the '<em><b>Exception Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_EXCEPTION__EXCEPTION_CLASS = eINSTANCE.getApplicationException_ExceptionClass();

		/**
		 * The meta object literal for the '<em><b>Rollback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_EXCEPTION__ROLLBACK = eINSTANCE.getApplicationException_Rollback();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_EXCEPTION__ID = eINSTANCE.getApplicationException_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.AroundInvokeTypeImpl <em>Around Invoke Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.AroundInvokeTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getAroundInvokeType()
		 * @generated
		 */
		EClass AROUND_INVOKE_TYPE = eINSTANCE.getAroundInvokeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AROUND_INVOKE_TYPE__CLASS = eINSTANCE.getAroundInvokeType_Class();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AROUND_INVOKE_TYPE__METHOD_NAME = eINSTANCE.getAroundInvokeType_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.AssemblyDescriptorImpl <em>Assembly Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.AssemblyDescriptorImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getAssemblyDescriptor()
		 * @generated
		 */
		EClass ASSEMBLY_DESCRIPTOR = eINSTANCE.getAssemblyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Security Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__SECURITY_ROLES = eINSTANCE.getAssemblyDescriptor_SecurityRoles();

		/**
		 * The meta object literal for the '<em><b>Method Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__METHOD_PERMISSIONS = eINSTANCE.getAssemblyDescriptor_MethodPermissions();

		/**
		 * The meta object literal for the '<em><b>Container Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__CONTAINER_TRANSACTIONS = eINSTANCE.getAssemblyDescriptor_ContainerTransactions();

		/**
		 * The meta object literal for the '<em><b>Interceptor Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__INTERCEPTOR_BINDINGS = eINSTANCE.getAssemblyDescriptor_InterceptorBindings();

		/**
		 * The meta object literal for the '<em><b>Message Destinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__MESSAGE_DESTINATIONS = eINSTANCE.getAssemblyDescriptor_MessageDestinations();

		/**
		 * The meta object literal for the '<em><b>Exclude List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__EXCLUDE_LIST = eINSTANCE.getAssemblyDescriptor_ExcludeList();

		/**
		 * The meta object literal for the '<em><b>Application Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY_DESCRIPTOR__APPLICATION_EXCEPTIONS = eINSTANCE.getAssemblyDescriptor_ApplicationExceptions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_DESCRIPTOR__ID = eINSTANCE.getAssemblyDescriptor_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.CMPFieldImpl <em>CMP Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.CMPFieldImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMPField()
		 * @generated
		 */
		EClass CMP_FIELD = eINSTANCE.getCMPField();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_FIELD__DESCRIPTIONS = eINSTANCE.getCMPField_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_FIELD__FIELD_NAME = eINSTANCE.getCMPField_FieldName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_FIELD__ID = eINSTANCE.getCMPField_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.CMRFieldImpl <em>CMR Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.CMRFieldImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRField()
		 * @generated
		 */
		EClass CMR_FIELD = eINSTANCE.getCMRField();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMR_FIELD__DESCRIPTIONS = eINSTANCE.getCMRField_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD__CMR_FIELD_NAME = eINSTANCE.getCMRField_CmrFieldName();

		/**
		 * The meta object literal for the '<em><b>Cmr Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD__CMR_FIELD_TYPE = eINSTANCE.getCMRField_CmrFieldType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMR_FIELD__ID = eINSTANCE.getCMRField_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ContainerTransactionTypeImpl <em>Container Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.ContainerTransactionTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getContainerTransactionType()
		 * @generated
		 */
		EClass CONTAINER_TRANSACTION_TYPE = eINSTANCE.getContainerTransactionType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TRANSACTION_TYPE__DESCRIPTIONS = eINSTANCE.getContainerTransactionType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_TRANSACTION_TYPE__METHODS = eINSTANCE.getContainerTransactionType_Methods();

		/**
		 * The meta object literal for the '<em><b>Trans Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TRANSACTION_TYPE__TRANS_ATTRIBUTE = eINSTANCE.getContainerTransactionType_TransAttribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TRANSACTION_TYPE__ID = eINSTANCE.getContainerTransactionType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBJarImpl <em>EJB Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBJarImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBJar()
		 * @generated
		 */
		EClass EJB_JAR = eINSTANCE.getEJBJar();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__DESCRIPTIONS = eINSTANCE.getEJBJar_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__DISPLAY_NAMES = eINSTANCE.getEJBJar_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__ICONS = eINSTANCE.getEJBJar_Icons();

		/**
		 * The meta object literal for the '<em><b>Enterprise Beans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__ENTERPRISE_BEANS = eINSTANCE.getEJBJar_EnterpriseBeans();

		/**
		 * The meta object literal for the '<em><b>Interceptors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__INTERCEPTORS = eINSTANCE.getEJBJar_Interceptors();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__RELATIONSHIPS = eINSTANCE.getEJBJar_Relationships();

		/**
		 * The meta object literal for the '<em><b>Assembly Descriptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR__ASSEMBLY_DESCRIPTOR = eINSTANCE.getEJBJar_AssemblyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Ejb Client Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR__EJB_CLIENT_JAR = eINSTANCE.getEJBJar_EjbClientJar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR__ID = eINSTANCE.getEJBJar_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR__METADATA_COMPLETE = eINSTANCE.getEJBJar_MetadataComplete();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR__VERSION = eINSTANCE.getEJBJar_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBJarDeploymentDescriptorImpl <em>EJB Jar Deployment Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBJarDeploymentDescriptorImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBJarDeploymentDescriptor()
		 * @generated
		 */
		EClass EJB_JAR_DEPLOYMENT_DESCRIPTOR = eINSTANCE.getEJBJarDeploymentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_JAR_DEPLOYMENT_DESCRIPTOR__MIXED = eINSTANCE.getEJBJarDeploymentDescriptor_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_DEPLOYMENT_DESCRIPTOR__XMLNS_PREFIX_MAP = eINSTANCE.getEJBJarDeploymentDescriptor_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_DEPLOYMENT_DESCRIPTOR__XSI_SCHEMA_LOCATION = eINSTANCE.getEJBJarDeploymentDescriptor_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Ejb Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_JAR_DEPLOYMENT_DESCRIPTOR__EJB_JAR = eINSTANCE.getEJBJarDeploymentDescriptor_EjbJar();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationImpl <em>EJB Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBRelation()
		 * @generated
		 */
		EClass EJB_RELATION = eINSTANCE.getEJBRelation();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION__DESCRIPTIONS = eINSTANCE.getEJBRelation_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Relation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATION__EJB_RELATION_NAME = eINSTANCE.getEJBRelation_EjbRelationName();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION__EJB_RELATIONSHIP_ROLE = eINSTANCE.getEJBRelation_EjbRelationshipRole();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATION__EJB_RELATIONSHIP_ROLE1 = eINSTANCE.getEJBRelation_EjbRelationshipRole1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATION__ID = eINSTANCE.getEJBRelation_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationshipRoleImpl <em>EJB Relationship Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EJBRelationshipRoleImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEJBRelationshipRole()
		 * @generated
		 */
		EClass EJB_RELATIONSHIP_ROLE = eINSTANCE.getEJBRelationshipRole();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE__DESCRIPTIONS = eINSTANCE.getEJBRelationshipRole_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Relationship Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE__EJB_RELATIONSHIP_ROLE_NAME = eINSTANCE.getEJBRelationshipRole_EjbRelationshipRoleName();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE__MULTIPLICITY = eINSTANCE.getEJBRelationshipRole_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Cascade Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE__CASCADE_DELETE = eINSTANCE.getEJBRelationshipRole_CascadeDelete();

		/**
		 * The meta object literal for the '<em><b>Relationship Role Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE__RELATIONSHIP_ROLE_SOURCE = eINSTANCE.getEJBRelationshipRole_RelationshipRoleSource();

		/**
		 * The meta object literal for the '<em><b>Cmr Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EJB_RELATIONSHIP_ROLE__CMR_FIELD = eINSTANCE.getEJBRelationshipRole_CmrField();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EJB_RELATIONSHIP_ROLE__ID = eINSTANCE.getEJBRelationshipRole_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EnterpriseBeanImpl <em>Enterprise Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EnterpriseBeanImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEnterpriseBean()
		 * @generated
		 */
		EClass ENTERPRISE_BEAN = eINSTANCE.getEnterpriseBean();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN__GROUP = eINSTANCE.getEnterpriseBean_Group();

		/**
		 * The meta object literal for the '<em><b>Session Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__SESSION_BEANS = eINSTANCE.getEnterpriseBean_SessionBeans();

		/**
		 * The meta object literal for the '<em><b>Entity Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__ENTITY_BEANS = eINSTANCE.getEnterpriseBean_EntityBeans();

		/**
		 * The meta object literal for the '<em><b>Message Driven Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTERPRISE_BEAN__MESSAGE_DRIVEN_BEANS = eINSTANCE.getEnterpriseBean_MessageDrivenBeans();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERPRISE_BEAN__ID = eINSTANCE.getEnterpriseBean_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EntityBeanImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEntityBean()
		 * @generated
		 */
		EClass ENTITY_BEAN = eINSTANCE.getEntityBean();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__DESCRIPTIONS = eINSTANCE.getEntityBean_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__DISPLAY_NAMES = eINSTANCE.getEntityBean_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__ICONS = eINSTANCE.getEntityBean_Icons();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__EJB_NAME = eINSTANCE.getEntityBean_EjbName();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__MAPPED_NAME = eINSTANCE.getEntityBean_MappedName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__HOME = eINSTANCE.getEntityBean_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__REMOTE = eINSTANCE.getEntityBean_Remote();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__LOCAL_HOME = eINSTANCE.getEntityBean_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__LOCAL = eINSTANCE.getEntityBean_Local();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__EJB_CLASS = eINSTANCE.getEntityBean_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Persistence Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__PERSISTENCE_TYPE = eINSTANCE.getEntityBean_PersistenceType();

		/**
		 * The meta object literal for the '<em><b>Prim Key Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__PRIM_KEY_CLASS = eINSTANCE.getEntityBean_PrimKeyClass();

		/**
		 * The meta object literal for the '<em><b>Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__REENTRANT = eINSTANCE.getEntityBean_Reentrant();

		/**
		 * The meta object literal for the '<em><b>Cmp Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__CMP_VERSION = eINSTANCE.getEntityBean_CmpVersion();

		/**
		 * The meta object literal for the '<em><b>Abstract Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__ABSTRACT_SCHEMA_NAME = eINSTANCE.getEntityBean_AbstractSchemaName();

		/**
		 * The meta object literal for the '<em><b>Cmp Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__CMP_FIELDS = eINSTANCE.getEntityBean_CmpFields();

		/**
		 * The meta object literal for the '<em><b>Primkey Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__PRIMKEY_FIELD = eINSTANCE.getEntityBean_PrimkeyField();

		/**
		 * The meta object literal for the '<em><b>Env Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__ENV_ENTRIES = eINSTANCE.getEntityBean_EnvEntries();

		/**
		 * The meta object literal for the '<em><b>Ejb Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__EJB_REFS = eINSTANCE.getEntityBean_EjbRefs();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__EJB_LOCAL_REFS = eINSTANCE.getEntityBean_EjbLocalRefs();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__SERVICE_REFS = eINSTANCE.getEntityBean_ServiceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__RESOURCE_REFS = eINSTANCE.getEntityBean_ResourceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Env Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__RESOURCE_ENV_REFS = eINSTANCE.getEntityBean_ResourceEnvRefs();

		/**
		 * The meta object literal for the '<em><b>Message Destination Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__MESSAGE_DESTINATION_REFS = eINSTANCE.getEntityBean_MessageDestinationRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__PERSISTENCE_CONTEXT_REFS = eINSTANCE.getEntityBean_PersistenceContextRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__PERSISTENCE_UNIT_REFS = eINSTANCE.getEntityBean_PersistenceUnitRefs();

		/**
		 * The meta object literal for the '<em><b>Post Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__POST_CONSTRUCTS = eINSTANCE.getEntityBean_PostConstructs();

		/**
		 * The meta object literal for the '<em><b>Pre Destroys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__PRE_DESTROYS = eINSTANCE.getEntityBean_PreDestroys();

		/**
		 * The meta object literal for the '<em><b>Security Role Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__SECURITY_ROLE_REFS = eINSTANCE.getEntityBean_SecurityRoleRefs();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__SECURITY_IDENTITY = eINSTANCE.getEntityBean_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_BEAN__QUERIES = eINSTANCE.getEntityBean_Queries();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_BEAN__ID = eINSTANCE.getEntityBean_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.ExcludeListImpl <em>Exclude List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.ExcludeListImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getExcludeList()
		 * @generated
		 */
		EClass EXCLUDE_LIST = eINSTANCE.getExcludeList();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_LIST__DESCRIPTIONS = eINSTANCE.getExcludeList_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUDE_LIST__METHODS = eINSTANCE.getExcludeList_Methods();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_LIST__ID = eINSTANCE.getExcludeList_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InitMethodTypeImpl <em>Init Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.InitMethodTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInitMethodType()
		 * @generated
		 */
		EClass INIT_METHOD_TYPE = eINSTANCE.getInitMethodType();

		/**
		 * The meta object literal for the '<em><b>Create Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_METHOD_TYPE__CREATE_METHOD = eINSTANCE.getInitMethodType_CreateMethod();

		/**
		 * The meta object literal for the '<em><b>Bean Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_METHOD_TYPE__BEAN_METHOD = eINSTANCE.getInitMethodType_BeanMethod();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_METHOD_TYPE__ID = eINSTANCE.getInitMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorBindingTypeImpl <em>Interceptor Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorBindingTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorBindingType()
		 * @generated
		 */
		EClass INTERCEPTOR_BINDING_TYPE = eINSTANCE.getInterceptorBindingType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_BINDING_TYPE__DESCRIPTIONS = eINSTANCE.getInterceptorBindingType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_BINDING_TYPE__EJB_NAME = eINSTANCE.getInterceptorBindingType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Interceptor Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASSES = eINSTANCE.getInterceptorBindingType_InterceptorClasses();

		/**
		 * The meta object literal for the '<em><b>Interceptor Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER = eINSTANCE.getInterceptorBindingType_InterceptorOrder();

		/**
		 * The meta object literal for the '<em><b>Exclude Default Interceptors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS = eINSTANCE.getInterceptorBindingType_ExcludeDefaultInterceptors();

		/**
		 * The meta object literal for the '<em><b>Exclude Class Interceptors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS = eINSTANCE.getInterceptorBindingType_ExcludeClassInterceptors();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_BINDING_TYPE__METHOD = eINSTANCE.getInterceptorBindingType_Method();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_BINDING_TYPE__ID = eINSTANCE.getInterceptorBindingType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorOrderTypeImpl <em>Interceptor Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorOrderTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorOrderType()
		 * @generated
		 */
		EClass INTERCEPTOR_ORDER_TYPE = eINSTANCE.getInterceptorOrderType();

		/**
		 * The meta object literal for the '<em><b>Interceptor Classes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_ORDER_TYPE__INTERCEPTOR_CLASSES = eINSTANCE.getInterceptorOrderType_InterceptorClasses();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_ORDER_TYPE__ID = eINSTANCE.getInterceptorOrderType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorsTypeImpl <em>Interceptors Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorsTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorsType()
		 * @generated
		 */
		EClass INTERCEPTORS_TYPE = eINSTANCE.getInterceptorsType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTORS_TYPE__DESCRIPTIONS = eINSTANCE.getInterceptorsType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Interceptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTORS_TYPE__INTERCEPTORS = eINSTANCE.getInterceptorsType_Interceptors();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTORS_TYPE__ID = eINSTANCE.getInterceptorsType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.InterceptorTypeImpl <em>Interceptor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.InterceptorTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getInterceptorType()
		 * @generated
		 */
		EClass INTERCEPTOR_TYPE = eINSTANCE.getInterceptorType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__DESCRIPTIONS = eINSTANCE.getInterceptorType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Interceptor Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_TYPE__INTERCEPTOR_CLASS = eINSTANCE.getInterceptorType_InterceptorClass();

		/**
		 * The meta object literal for the '<em><b>Around Invokes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__AROUND_INVOKES = eINSTANCE.getInterceptorType_AroundInvokes();

		/**
		 * The meta object literal for the '<em><b>Env Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__ENV_ENTRIES = eINSTANCE.getInterceptorType_EnvEntries();

		/**
		 * The meta object literal for the '<em><b>Ejb Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__EJB_REFS = eINSTANCE.getInterceptorType_EjbRefs();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__EJB_LOCAL_REFS = eINSTANCE.getInterceptorType_EjbLocalRefs();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__SERVICE_REFS = eINSTANCE.getInterceptorType_ServiceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__RESOURCE_REFS = eINSTANCE.getInterceptorType_ResourceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Env Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__RESOURCE_ENV_REFS = eINSTANCE.getInterceptorType_ResourceEnvRefs();

		/**
		 * The meta object literal for the '<em><b>Message Destination Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REFS = eINSTANCE.getInterceptorType_MessageDestinationRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REFS = eINSTANCE.getInterceptorType_PersistenceContextRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REFS = eINSTANCE.getInterceptorType_PersistenceUnitRefs();

		/**
		 * The meta object literal for the '<em><b>Post Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__POST_CONSTRUCTS = eINSTANCE.getInterceptorType_PostConstructs();

		/**
		 * The meta object literal for the '<em><b>Pre Destroys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__PRE_DESTROYS = eINSTANCE.getInterceptorType_PreDestroys();

		/**
		 * The meta object literal for the '<em><b>Post Activates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__POST_ACTIVATES = eINSTANCE.getInterceptorType_PostActivates();

		/**
		 * The meta object literal for the '<em><b>Pre Passivates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPTOR_TYPE__PRE_PASSIVATES = eINSTANCE.getInterceptorType_PrePassivates();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCEPTOR_TYPE__ID = eINSTANCE.getInterceptorType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MessageDrivenBeanImpl <em>Message Driven Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.MessageDrivenBeanImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMessageDrivenBean()
		 * @generated
		 */
		EClass MESSAGE_DRIVEN_BEAN = eINSTANCE.getMessageDrivenBean();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__DESCRIPTIONS = eINSTANCE.getMessageDrivenBean_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__DISPLAY_NAMES = eINSTANCE.getMessageDrivenBean_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__ICONS = eINSTANCE.getMessageDrivenBean_Icons();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__EJB_NAME = eINSTANCE.getMessageDrivenBean_EjbName();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__MAPPED_NAME = eINSTANCE.getMessageDrivenBean_MappedName();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__EJB_CLASS = eINSTANCE.getMessageDrivenBean_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Messaging Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__MESSAGING_TYPE = eINSTANCE.getMessageDrivenBean_MessagingType();

		/**
		 * The meta object literal for the '<em><b>Timeout Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__TIMEOUT_METHOD = eINSTANCE.getMessageDrivenBean_TimeoutMethod();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__TRANSACTION_TYPE = eINSTANCE.getMessageDrivenBean_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_TYPE = eINSTANCE.getMessageDrivenBean_MessageDestinationType();

		/**
		 * The meta object literal for the '<em><b>Message Destination Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_LINK = eINSTANCE.getMessageDrivenBean_MessageDestinationLink();

		/**
		 * The meta object literal for the '<em><b>Activation Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__ACTIVATION_CONFIG = eINSTANCE.getMessageDrivenBean_ActivationConfig();

		/**
		 * The meta object literal for the '<em><b>Around Invokes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__AROUND_INVOKES = eINSTANCE.getMessageDrivenBean_AroundInvokes();

		/**
		 * The meta object literal for the '<em><b>Env Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__ENV_ENTRIES = eINSTANCE.getMessageDrivenBean_EnvEntries();

		/**
		 * The meta object literal for the '<em><b>Ejb Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__EJB_REFS = eINSTANCE.getMessageDrivenBean_EjbRefs();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__EJB_LOCAL_REFS = eINSTANCE.getMessageDrivenBean_EjbLocalRefs();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__SERVICE_REFS = eINSTANCE.getMessageDrivenBean_ServiceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__RESOURCE_REFS = eINSTANCE.getMessageDrivenBean_ResourceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Env Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__RESOURCE_ENV_REFS = eINSTANCE.getMessageDrivenBean_ResourceEnvRefs();

		/**
		 * The meta object literal for the '<em><b>Message Destination Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__MESSAGE_DESTINATION_REFS = eINSTANCE.getMessageDrivenBean_MessageDestinationRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__PERSISTENCE_CONTEXT_REFS = eINSTANCE.getMessageDrivenBean_PersistenceContextRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__PERSISTENCE_UNIT_REFS = eINSTANCE.getMessageDrivenBean_PersistenceUnitRefs();

		/**
		 * The meta object literal for the '<em><b>Post Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__POST_CONSTRUCTS = eINSTANCE.getMessageDrivenBean_PostConstructs();

		/**
		 * The meta object literal for the '<em><b>Pre Destroys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__PRE_DESTROYS = eINSTANCE.getMessageDrivenBean_PreDestroys();

		/**
		 * The meta object literal for the '<em><b>Security Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_DRIVEN_BEAN__SECURITY_IDENTITY = eINSTANCE.getMessageDrivenBean_SecurityIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DRIVEN_BEAN__ID = eINSTANCE.getMessageDrivenBean_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodParamsImpl <em>Method Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodParamsImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodParams()
		 * @generated
		 */
		EClass METHOD_PARAMS = eINSTANCE.getMethodParams();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMS__METHOD_PARAMS = eINSTANCE.getMethodParams_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMS__ID = eINSTANCE.getMethodParams_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodPermissionImpl <em>Method Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodPermissionImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodPermission()
		 * @generated
		 */
		EClass METHOD_PERMISSION = eINSTANCE.getMethodPermission();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION__DESCRIPTIONS = eINSTANCE.getMethodPermission_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Role Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PERMISSION__ROLE_NAMES = eINSTANCE.getMethodPermission_RoleNames();

		/**
		 * The meta object literal for the '<em><b>Unchecked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION__UNCHECKED = eINSTANCE.getMethodPermission_Unchecked();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PERMISSION__METHODS = eINSTANCE.getMethodPermission_Methods();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PERMISSION__ID = eINSTANCE.getMethodPermission_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.MethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.MethodTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodType()
		 * @generated
		 */
		EClass METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__DESCRIPTIONS = eINSTANCE.getMethodType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__EJB_NAME = eINSTANCE.getMethodType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Method Intf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__METHOD_INTF = eINSTANCE.getMethodType_MethodIntf();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__METHOD_NAME = eINSTANCE.getMethodType_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_TYPE__METHOD_PARAMS = eINSTANCE.getMethodType_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_TYPE__ID = eINSTANCE.getMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.NamedMethodTypeImpl <em>Named Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.NamedMethodTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getNamedMethodType()
		 * @generated
		 */
		EClass NAMED_METHOD_TYPE = eINSTANCE.getNamedMethodType();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_METHOD_TYPE__METHOD_NAME = eINSTANCE.getNamedMethodType_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_METHOD_TYPE__METHOD_PARAMS = eINSTANCE.getNamedMethodType_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_METHOD_TYPE__ID = eINSTANCE.getNamedMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.QueryImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__DESCRIPTION = eINSTANCE.getQuery_Description();

		/**
		 * The meta object literal for the '<em><b>Query Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__QUERY_METHOD = eINSTANCE.getQuery_QueryMethod();

		/**
		 * The meta object literal for the '<em><b>Result Type Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__RESULT_TYPE_MAPPING = eINSTANCE.getQuery_ResultTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Ejb Ql</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__EJB_QL = eINSTANCE.getQuery_EjbQl();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__ID = eINSTANCE.getQuery_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.QueryMethodImpl <em>Query Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.QueryMethodImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getQueryMethod()
		 * @generated
		 */
		EClass QUERY_METHOD = eINSTANCE.getQueryMethod();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_METHOD__METHOD_NAME = eINSTANCE.getQueryMethod_MethodName();

		/**
		 * The meta object literal for the '<em><b>Method Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_METHOD__METHOD_PARAMS = eINSTANCE.getQueryMethod_MethodParams();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_METHOD__ID = eINSTANCE.getQueryMethod_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RelationshipRoleSourceTypeImpl <em>Relationship Role Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.RelationshipRoleSourceTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRelationshipRoleSourceType()
		 * @generated
		 */
		EClass RELATIONSHIP_ROLE_SOURCE_TYPE = eINSTANCE.getRelationshipRoleSourceType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_ROLE_SOURCE_TYPE__DESCRIPTIONS = eINSTANCE.getRelationshipRoleSourceType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ROLE_SOURCE_TYPE__EJB_NAME = eINSTANCE.getRelationshipRoleSourceType_EjbName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_ROLE_SOURCE_TYPE__ID = eINSTANCE.getRelationshipRoleSourceType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RelationshipsImpl <em>Relationships</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.RelationshipsImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRelationships()
		 * @generated
		 */
		EClass RELATIONSHIPS = eINSTANCE.getRelationships();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS__DESCRIPTIONS = eINSTANCE.getRelationships_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Ejb Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS__EJB_RELATIONS = eINSTANCE.getRelationships_EjbRelations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIPS__ID = eINSTANCE.getRelationships_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.RemoveMethodTypeImpl <em>Remove Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.RemoveMethodTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getRemoveMethodType()
		 * @generated
		 */
		EClass REMOVE_METHOD_TYPE = eINSTANCE.getRemoveMethodType();

		/**
		 * The meta object literal for the '<em><b>Bean Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_METHOD_TYPE__BEAN_METHOD = eINSTANCE.getRemoveMethodType_BeanMethod();

		/**
		 * The meta object literal for the '<em><b>Retain If Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION = eINSTANCE.getRemoveMethodType_RetainIfException();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_METHOD_TYPE__ID = eINSTANCE.getRemoveMethodType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.SecurityIdentityTypeImpl <em>Security Identity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.SecurityIdentityTypeImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSecurityIdentityType()
		 * @generated
		 */
		EClass SECURITY_IDENTITY_TYPE = eINSTANCE.getSecurityIdentityType();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__DESCRIPTIONS = eINSTANCE.getSecurityIdentityType_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Use Caller Identity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY = eINSTANCE.getSecurityIdentityType_UseCallerIdentity();

		/**
		 * The meta object literal for the '<em><b>Run As</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_IDENTITY_TYPE__RUN_AS = eINSTANCE.getSecurityIdentityType_RunAs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_IDENTITY_TYPE__ID = eINSTANCE.getSecurityIdentityType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.internal.impl.SessionBeanImpl <em>Session Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.SessionBeanImpl
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionBean()
		 * @generated
		 */
		EClass SESSION_BEAN = eINSTANCE.getSessionBean();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__DESCRIPTIONS = eINSTANCE.getSessionBean_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Display Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__DISPLAY_NAMES = eINSTANCE.getSessionBean_DisplayNames();

		/**
		 * The meta object literal for the '<em><b>Icons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__ICONS = eINSTANCE.getSessionBean_Icons();

		/**
		 * The meta object literal for the '<em><b>Ejb Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__EJB_NAME = eINSTANCE.getSessionBean_EjbName();

		/**
		 * The meta object literal for the '<em><b>Mapped Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__MAPPED_NAME = eINSTANCE.getSessionBean_MappedName();

		/**
		 * The meta object literal for the '<em><b>Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__HOME = eINSTANCE.getSessionBean_Home();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__REMOTE = eINSTANCE.getSessionBean_Remote();

		/**
		 * The meta object literal for the '<em><b>Local Home</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__LOCAL_HOME = eINSTANCE.getSessionBean_LocalHome();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__LOCAL = eINSTANCE.getSessionBean_Local();

		/**
		 * The meta object literal for the '<em><b>Business Locals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__BUSINESS_LOCALS = eINSTANCE.getSessionBean_BusinessLocals();

		/**
		 * The meta object literal for the '<em><b>Business Remotes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__BUSINESS_REMOTES = eINSTANCE.getSessionBean_BusinessRemotes();

		/**
		 * The meta object literal for the '<em><b>Service Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__SERVICE_ENDPOINT = eINSTANCE.getSessionBean_ServiceEndpoint();

		/**
		 * The meta object literal for the '<em><b>Ejb Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__EJB_CLASS = eINSTANCE.getSessionBean_EjbClass();

		/**
		 * The meta object literal for the '<em><b>Session Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__SESSION_TYPE = eINSTANCE.getSessionBean_SessionType();

		/**
		 * The meta object literal for the '<em><b>Timeout Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__TIMEOUT_METHOD = eINSTANCE.getSessionBean_TimeoutMethod();

		/**
		 * The meta object literal for the '<em><b>Init Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__INIT_METHODS = eINSTANCE.getSessionBean_InitMethods();

		/**
		 * The meta object literal for the '<em><b>Remove Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__REMOVE_METHODS = eINSTANCE.getSessionBean_RemoveMethods();

		/**
		 * The meta object literal for the '<em><b>Transaction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__TRANSACTION_TYPE = eINSTANCE.getSessionBean_TransactionType();

		/**
		 * The meta object literal for the '<em><b>Around Invokes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__AROUND_INVOKES = eINSTANCE.getSessionBean_AroundInvokes();

		/**
		 * The meta object literal for the '<em><b>Env Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__ENV_ENTRIES = eINSTANCE.getSessionBean_EnvEntries();

		/**
		 * The meta object literal for the '<em><b>Ejb Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__EJB_REFS = eINSTANCE.getSessionBean_EjbRefs();

		/**
		 * The meta object literal for the '<em><b>Ejb Local Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__EJB_LOCAL_REFS = eINSTANCE.getSessionBean_EjbLocalRefs();

		/**
		 * The meta object literal for the '<em><b>Service Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__SERVICE_REFS = eINSTANCE.getSessionBean_ServiceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__RESOURCE_REFS = eINSTANCE.getSessionBean_ResourceRefs();

		/**
		 * The meta object literal for the '<em><b>Resource Env Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__RESOURCE_ENV_REFS = eINSTANCE.getSessionBean_ResourceEnvRefs();

		/**
		 * The meta object literal for the '<em><b>Message Destination Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__MESSAGE_DESTINATION_REFS = eINSTANCE.getSessionBean_MessageDestinationRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Context Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__PERSISTENCE_CONTEXT_REFS = eINSTANCE.getSessionBean_PersistenceContextRefs();

		/**
		 * The meta object literal for the '<em><b>Persistence Unit Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__PERSISTENCE_UNIT_REFS = eINSTANCE.getSessionBean_PersistenceUnitRefs();

		/**
		 * The meta object literal for the '<em><b>Post Constructs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__POST_CONSTRUCTS = eINSTANCE.getSessionBean_PostConstructs();

		/**
		 * The meta object literal for the '<em><b>Pre Destroys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__PRE_DESTROYS = eINSTANCE.getSessionBean_PreDestroys();

		/**
		 * The meta object literal for the '<em><b>Post Activates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__POST_ACTIVATES = eINSTANCE.getSessionBean_PostActivates();

		/**
		 * The meta object literal for the '<em><b>Pre Passivates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__PRE_PASSIVATES = eINSTANCE.getSessionBean_PrePassivates();

		/**
		 * The meta object literal for the '<em><b>Security Role Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__SECURITY_ROLE_REFS = eINSTANCE.getSessionBean_SecurityRoleRefs();

		/**
		 * The meta object literal for the '<em><b>Security Identities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_BEAN__SECURITY_IDENTITIES = eINSTANCE.getSessionBean_SecurityIdentities();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_BEAN__ID = eINSTANCE.getSessionBean_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.CmpVersionType <em>Cmp Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCmpVersionType()
		 * @generated
		 */
		EEnum CMP_VERSION_TYPE = eINSTANCE.getCmpVersionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.CMRFieldType <em>CMR Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRFieldType()
		 * @generated
		 */
		EEnum CMR_FIELD_TYPE = eINSTANCE.getCMRFieldType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.MethodInterfaceType <em>Method Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodInterfaceType()
		 * @generated
		 */
		EEnum METHOD_INTERFACE_TYPE = eINSTANCE.getMethodInterfaceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.MultiplicityType <em>Multiplicity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMultiplicityType()
		 * @generated
		 */
		EEnum MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.PersistenceType <em>Persistence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.PersistenceType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getPersistenceType()
		 * @generated
		 */
		EEnum PERSISTENCE_TYPE = eINSTANCE.getPersistenceType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.ResultTypeMappingType <em>Result Type Mapping Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getResultTypeMappingType()
		 * @generated
		 */
		EEnum RESULT_TYPE_MAPPING_TYPE = eINSTANCE.getResultTypeMappingType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.SessionType <em>Session Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.SessionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionType()
		 * @generated
		 */
		EEnum SESSION_TYPE = eINSTANCE.getSessionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.TransactionAttributeType <em>Transaction Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionAttributeType()
		 * @generated
		 */
		EEnum TRANSACTION_ATTRIBUTE_TYPE = eINSTANCE.getTransactionAttributeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.jst.javaee.ejb.TransactionType <em>Transaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.TransactionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionType()
		 * @generated
		 */
		EEnum TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '<em>Cmp Version Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.CmpVersionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCmpVersionTypeObject()
		 * @generated
		 */
		EDataType CMP_VERSION_TYPE_OBJECT = eINSTANCE.getCmpVersionTypeObject();

		/**
		 * The meta object literal for the '<em>CMR Field Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.CMRFieldType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getCMRFieldTypeObject()
		 * @generated
		 */
		EDataType CMR_FIELD_TYPE_OBJECT = eINSTANCE.getCMRFieldTypeObject();

		/**
		 * The meta object literal for the '<em>Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEjbClassType()
		 * @generated
		 */
		EDataType EJB_CLASS_TYPE = eINSTANCE.getEjbClassType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getEjbNameType()
		 * @generated
		 */
		EDataType EJB_NAME_TYPE = eINSTANCE.getEjbNameType();

		/**
		 * The meta object literal for the '<em>Method Interface Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.MethodInterfaceType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodInterfaceTypeObject()
		 * @generated
		 */
		EDataType METHOD_INTERFACE_TYPE_OBJECT = eINSTANCE.getMethodInterfaceTypeObject();

		/**
		 * The meta object literal for the '<em>Method Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMethodNameType()
		 * @generated
		 */
		EDataType METHOD_NAME_TYPE = eINSTANCE.getMethodNameType();

		/**
		 * The meta object literal for the '<em>Multiplicity Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.MultiplicityType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getMultiplicityTypeObject()
		 * @generated
		 */
		EDataType MULTIPLICITY_TYPE_OBJECT = eINSTANCE.getMultiplicityTypeObject();

		/**
		 * The meta object literal for the '<em>Persistence Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.PersistenceType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getPersistenceTypeObject()
		 * @generated
		 */
		EDataType PERSISTENCE_TYPE_OBJECT = eINSTANCE.getPersistenceTypeObject();

		/**
		 * The meta object literal for the '<em>Result Type Mapping Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.ResultTypeMappingType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getResultTypeMappingTypeObject()
		 * @generated
		 */
		EDataType RESULT_TYPE_MAPPING_TYPE_OBJECT = eINSTANCE.getResultTypeMappingTypeObject();

		/**
		 * The meta object literal for the '<em>Session Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.SessionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getSessionTypeObject()
		 * @generated
		 */
		EDataType SESSION_TYPE_OBJECT = eINSTANCE.getSessionTypeObject();

		/**
		 * The meta object literal for the '<em>Transaction Attribute Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.TransactionAttributeType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionAttributeTypeObject()
		 * @generated
		 */
		EDataType TRANSACTION_ATTRIBUTE_TYPE_OBJECT = eINSTANCE.getTransactionAttributeTypeObject();

		/**
		 * The meta object literal for the '<em>Transaction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jst.javaee.ejb.TransactionType
		 * @see org.eclipse.jst.javaee.ejb.internal.impl.EjbPackageImpl#getTransactionTypeObject()
		 * @generated
		 */
		EDataType TRANSACTION_TYPE_OBJECT = eINSTANCE.getTransactionTypeObject();

	}

} //EjbPackage
