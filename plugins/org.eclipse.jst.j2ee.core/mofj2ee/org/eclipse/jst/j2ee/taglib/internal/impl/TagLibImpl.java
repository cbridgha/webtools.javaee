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
package org.eclipse.jst.j2ee.taglib.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jst.j2ee.common.Listener;
import org.eclipse.jst.j2ee.common.internal.impl.CompatibilityDescriptionGroupImpl;
import org.eclipse.jst.j2ee.internal.common.J2EEVersionResource;
import org.eclipse.jst.j2ee.taglib.internal.Function;
import org.eclipse.jst.j2ee.taglib.internal.JSPTag;
import org.eclipse.jst.j2ee.taglib.internal.TagLib;
import org.eclipse.jst.j2ee.taglib.internal.TaglibPackage;
import org.eclipse.jst.j2ee.taglib.internal.TldExtension;
import org.eclipse.jst.j2ee.taglib.internal.Validator;


/**
 * The taglib tag is the document root.

 */
public class TagLibImpl extends CompatibilityDescriptionGroupImpl implements TagLib {

	/**
	 * The default value of the '{@link #getTagLibVersion() <em>Tag Lib Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagLibVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_LIB_VERSION_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String tagLibVersion = TAG_LIB_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getJspVersion() <em>Jsp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJspVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String JSP_VERSION_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String jspVersion = JSP_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String uri = URI_EDEFAULT;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected EList tags = null;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected Validator validator = null;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected EList listeners = null;
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList functions = null;

	/**
	 * The cached value of the '{@link #getTaglibExtensions() <em>Taglib Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaglibExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList taglibExtensions = null;

	public TagLibImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TaglibPackage.Literals.TAG_LIB;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * Describes this version number of the tag library (dewey decimal).
	 * @regexp [0-9]*{ "."[0-9] }0..3
	 */
	public String getTagLibVersion() {
		return tagLibVersion;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setTagLibVersion(String newTagLibVersion) {
		String oldTagLibVersion = tagLibVersion;
		tagLibVersion = newTagLibVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__TAG_LIB_VERSION, oldTagLibVersion, tagLibVersion));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * Describes the JSP version (number) this tag library requires in order to
	 * function (dewey decimal).  Default is 1.2
	 * @regexp [0-9]*{ "."[0-9] }0..3
	 */
	public String getJspVersion() {
		return jspVersion;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setJspVersion(String newJspVersion) {
		String oldJspVersion = jspVersion;
		jspVersion = newJspVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__JSP_VERSION, oldJspVersion, jspVersion));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The value of the short-name element is a name that could be used by a JSP
	 * authoring tool to create names with a mnemonic value; for example, it may be
	 * used as the prefered prefix value in taglib directives. Do not use white space, 
	 * and do not start with digits or underscore.
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The value of the uri element is a public URI that uniquely identifies the exact 
	 * semantics of this taglibrary.
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__URI, oldUri, uri));
	}

	/**
	 *
	 */
	public void setDisplayName(String newDisplayName) {
		super.setDisplayName(displayName);
	}
	
	/**
	This returns the module version id. Compare with J2EEVersionConstants to determine module level
	 */
	public int getVersionID() throws IllegalStateException {
		J2EEVersionResource res = (J2EEVersionResource) eResource();
		if (res == null) throw new IllegalStateException();
		return res.getModuleVersionID();
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public EList getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList(JSPTag.class, this, TaglibPackage.TAG_LIB__TAGS);
		}
		return tags;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 * The validator element provides information on an optional validator that can be 
	 * used to validate the conformance of a JSP page to using this tag library.

	 */
	public Validator getValidator() {
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidator(Validator newValidator, NotificationChain msgs) {
		Validator oldValidator = validator;
		validator = newValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__VALIDATOR, oldValidator, newValidator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setValidator(Validator newValidator) {
		if (newValidator != validator) {
			NotificationChain msgs = null;
			if (validator != null)
				msgs = ((InternalEObject)validator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaglibPackage.TAG_LIB__VALIDATOR, null, msgs);
			if (newValidator != null)
				msgs = ((InternalEObject)newValidator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaglibPackage.TAG_LIB__VALIDATOR, null, msgs);
			msgs = basicSetValidator(newValidator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaglibPackage.TAG_LIB__VALIDATOR, newValidator, newValidator));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public EList getListeners() {
		if (listeners == null) {
			listeners = new EObjectContainmentEList(Listener.class, this, TaglibPackage.TAG_LIB__LISTENERS);
		}
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList(Function.class, this, TaglibPackage.TAG_LIB__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTaglibExtensions() {
		if (taglibExtensions == null) {
			taglibExtensions = new EObjectContainmentEList(TldExtension.class, this, TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS);
		}
		return taglibExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaglibPackage.TAG_LIB__TAGS:
				return ((InternalEList)getTags()).basicRemove(otherEnd, msgs);
			case TaglibPackage.TAG_LIB__VALIDATOR:
				return basicSetValidator(null, msgs);
			case TaglibPackage.TAG_LIB__LISTENERS:
				return ((InternalEList)getListeners()).basicRemove(otherEnd, msgs);
			case TaglibPackage.TAG_LIB__FUNCTIONS:
				return ((InternalEList)getFunctions()).basicRemove(otherEnd, msgs);
			case TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS:
				return ((InternalEList)getTaglibExtensions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaglibPackage.TAG_LIB__TAG_LIB_VERSION:
				return getTagLibVersion();
			case TaglibPackage.TAG_LIB__JSP_VERSION:
				return getJspVersion();
			case TaglibPackage.TAG_LIB__SHORT_NAME:
				return getShortName();
			case TaglibPackage.TAG_LIB__URI:
				return getUri();
			case TaglibPackage.TAG_LIB__TAGS:
				return getTags();
			case TaglibPackage.TAG_LIB__VALIDATOR:
				return getValidator();
			case TaglibPackage.TAG_LIB__LISTENERS:
				return getListeners();
			case TaglibPackage.TAG_LIB__FUNCTIONS:
				return getFunctions();
			case TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS:
				return getTaglibExtensions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaglibPackage.TAG_LIB__TAG_LIB_VERSION:
				setTagLibVersion((String)newValue);
				return;
			case TaglibPackage.TAG_LIB__JSP_VERSION:
				setJspVersion((String)newValue);
				return;
			case TaglibPackage.TAG_LIB__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case TaglibPackage.TAG_LIB__URI:
				setUri((String)newValue);
				return;
			case TaglibPackage.TAG_LIB__TAGS:
				getTags().clear();
				getTags().addAll((Collection)newValue);
				return;
			case TaglibPackage.TAG_LIB__VALIDATOR:
				setValidator((Validator)newValue);
				return;
			case TaglibPackage.TAG_LIB__LISTENERS:
				getListeners().clear();
				getListeners().addAll((Collection)newValue);
				return;
			case TaglibPackage.TAG_LIB__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection)newValue);
				return;
			case TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS:
				getTaglibExtensions().clear();
				getTaglibExtensions().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaglibPackage.TAG_LIB__TAG_LIB_VERSION:
				setTagLibVersion(TAG_LIB_VERSION_EDEFAULT);
				return;
			case TaglibPackage.TAG_LIB__JSP_VERSION:
				setJspVersion(JSP_VERSION_EDEFAULT);
				return;
			case TaglibPackage.TAG_LIB__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case TaglibPackage.TAG_LIB__URI:
				setUri(URI_EDEFAULT);
				return;
			case TaglibPackage.TAG_LIB__TAGS:
				getTags().clear();
				return;
			case TaglibPackage.TAG_LIB__VALIDATOR:
				setValidator((Validator)null);
				return;
			case TaglibPackage.TAG_LIB__LISTENERS:
				getListeners().clear();
				return;
			case TaglibPackage.TAG_LIB__FUNCTIONS:
				getFunctions().clear();
				return;
			case TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS:
				getTaglibExtensions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaglibPackage.TAG_LIB__TAG_LIB_VERSION:
				return TAG_LIB_VERSION_EDEFAULT == null ? tagLibVersion != null : !TAG_LIB_VERSION_EDEFAULT.equals(tagLibVersion);
			case TaglibPackage.TAG_LIB__JSP_VERSION:
				return JSP_VERSION_EDEFAULT == null ? jspVersion != null : !JSP_VERSION_EDEFAULT.equals(jspVersion);
			case TaglibPackage.TAG_LIB__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case TaglibPackage.TAG_LIB__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case TaglibPackage.TAG_LIB__TAGS:
				return tags != null && !tags.isEmpty();
			case TaglibPackage.TAG_LIB__VALIDATOR:
				return validator != null;
			case TaglibPackage.TAG_LIB__LISTENERS:
				return listeners != null && !listeners.isEmpty();
			case TaglibPackage.TAG_LIB__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case TaglibPackage.TAG_LIB__TAGLIB_EXTENSIONS:
				return taglibExtensions != null && !taglibExtensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tagLibVersion: ");
		result.append(tagLibVersion);
		result.append(", jspVersion: ");
		result.append(jspVersion);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

}














