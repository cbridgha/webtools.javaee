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
package org.eclipse.jst.j2ee.jsp.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.jst.j2ee.common.internal.impl.CompatibilityDescriptionGroupImpl;
import org.eclipse.jst.j2ee.jsp.JSPPropertyGroup;
import org.eclipse.jst.j2ee.jsp.JspPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSP Property Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#isElIgnored <em>El Ignored</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#getPageEncoding <em>Page Encoding</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#isScriptingInvalid <em>Scripting Invalid</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#isIsXML <em>Is XML</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#getIncludePreludes <em>Include Preludes</em>}</li>
 *   <li>{@link org.eclipse.jst.j2ee.jsp.internal.impl.JSPPropertyGroupImpl#getIncludeCodas <em>Include Codas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSPPropertyGroupImpl extends CompatibilityDescriptionGroupImpl implements JSPPropertyGroup {
	/**
	 * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected EList urlPattern = null;

	/**
	 * The default value of the '{@link #isElIgnored() <em>El Ignored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElIgnored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EL_IGNORED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isElIgnored() <em>El Ignored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElIgnored()
	 * @generated
	 * @ordered
	 */
	protected boolean elIgnored = EL_IGNORED_EDEFAULT;

	/**
	 * This is true if the El Ignored attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elIgnoredESet = false;

	/**
	 * The default value of the '{@link #getPageEncoding() <em>Page Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageEncoding() <em>Page Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageEncoding()
	 * @generated
	 * @ordered
	 */
	protected String pageEncoding = PAGE_ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #isScriptingInvalid() <em>Scripting Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScriptingInvalid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCRIPTING_INVALID_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isScriptingInvalid() <em>Scripting Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScriptingInvalid()
	 * @generated
	 * @ordered
	 */
	protected boolean scriptingInvalid = SCRIPTING_INVALID_EDEFAULT;

	/**
	 * This is true if the Scripting Invalid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scriptingInvalidESet = false;

	/**
	 * The default value of the '{@link #isIsXML() <em>Is XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsXML()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_XML_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsXML() <em>Is XML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsXML()
	 * @generated
	 * @ordered
	 */
	protected boolean isXML = IS_XML_EDEFAULT;

	/**
	 * This is true if the Is XML attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isXMLESet = false;

	/**
	 * The cached value of the '{@link #getIncludePreludes() <em>Include Preludes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePreludes()
	 * @generated
	 * @ordered
	 */
	protected EList includePreludes = null;

	/**
	 * The cached value of the '{@link #getIncludeCodas() <em>Include Codas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCodas()
	 * @generated
	 * @ordered
	 */
	protected EList includeCodas = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSPPropertyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JspPackage.Literals.JSP_PROPERTY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUrlPattern() {
		if (urlPattern == null) {
			urlPattern = new EDataTypeUniqueEList(String.class, this, JspPackage.JSP_PROPERTY_GROUP__URL_PATTERN);
		}
		return urlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElIgnored() {
		return elIgnored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElIgnored(boolean newElIgnored) {
		boolean oldElIgnored = elIgnored;
		elIgnored = newElIgnored;
		boolean oldElIgnoredESet = elIgnoredESet;
		elIgnoredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED, oldElIgnored, elIgnored, !oldElIgnoredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElIgnored() {
		boolean oldElIgnored = elIgnored;
		boolean oldElIgnoredESet = elIgnoredESet;
		elIgnored = EL_IGNORED_EDEFAULT;
		elIgnoredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED, oldElIgnored, EL_IGNORED_EDEFAULT, oldElIgnoredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElIgnored() {
		return elIgnoredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageEncoding() {
		return pageEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageEncoding(String newPageEncoding) {
		String oldPageEncoding = pageEncoding;
		pageEncoding = newPageEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.JSP_PROPERTY_GROUP__PAGE_ENCODING, oldPageEncoding, pageEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScriptingInvalid() {
		return scriptingInvalid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptingInvalid(boolean newScriptingInvalid) {
		boolean oldScriptingInvalid = scriptingInvalid;
		scriptingInvalid = newScriptingInvalid;
		boolean oldScriptingInvalidESet = scriptingInvalidESet;
		scriptingInvalidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID, oldScriptingInvalid, scriptingInvalid, !oldScriptingInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScriptingInvalid() {
		boolean oldScriptingInvalid = scriptingInvalid;
		boolean oldScriptingInvalidESet = scriptingInvalidESet;
		scriptingInvalid = SCRIPTING_INVALID_EDEFAULT;
		scriptingInvalidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID, oldScriptingInvalid, SCRIPTING_INVALID_EDEFAULT, oldScriptingInvalidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScriptingInvalid() {
		return scriptingInvalidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsXML() {
		return isXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsXML(boolean newIsXML) {
		boolean oldIsXML = isXML;
		isXML = newIsXML;
		boolean oldIsXMLESet = isXMLESet;
		isXMLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JspPackage.JSP_PROPERTY_GROUP__IS_XML, oldIsXML, isXML, !oldIsXMLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsXML() {
		boolean oldIsXML = isXML;
		boolean oldIsXMLESet = isXMLESet;
		isXML = IS_XML_EDEFAULT;
		isXMLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, JspPackage.JSP_PROPERTY_GROUP__IS_XML, oldIsXML, IS_XML_EDEFAULT, oldIsXMLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsXML() {
		return isXMLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludePreludes() {
		if (includePreludes == null) {
			includePreludes = new EDataTypeUniqueEList(String.class, this, JspPackage.JSP_PROPERTY_GROUP__INCLUDE_PRELUDES);
		}
		return includePreludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncludeCodas() {
		if (includeCodas == null) {
			includeCodas = new EDataTypeUniqueEList(String.class, this, JspPackage.JSP_PROPERTY_GROUP__INCLUDE_CODAS);
		}
		return includeCodas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JspPackage.JSP_PROPERTY_GROUP__URL_PATTERN:
				return getUrlPattern();
			case JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED:
				return isElIgnored() ? Boolean.TRUE : Boolean.FALSE;
			case JspPackage.JSP_PROPERTY_GROUP__PAGE_ENCODING:
				return getPageEncoding();
			case JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID:
				return isScriptingInvalid() ? Boolean.TRUE : Boolean.FALSE;
			case JspPackage.JSP_PROPERTY_GROUP__IS_XML:
				return isIsXML() ? Boolean.TRUE : Boolean.FALSE;
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_PRELUDES:
				return getIncludePreludes();
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_CODAS:
				return getIncludeCodas();
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
			case JspPackage.JSP_PROPERTY_GROUP__URL_PATTERN:
				getUrlPattern().clear();
				getUrlPattern().addAll((Collection)newValue);
				return;
			case JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED:
				setElIgnored(((Boolean)newValue).booleanValue());
				return;
			case JspPackage.JSP_PROPERTY_GROUP__PAGE_ENCODING:
				setPageEncoding((String)newValue);
				return;
			case JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID:
				setScriptingInvalid(((Boolean)newValue).booleanValue());
				return;
			case JspPackage.JSP_PROPERTY_GROUP__IS_XML:
				setIsXML(((Boolean)newValue).booleanValue());
				return;
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_PRELUDES:
				getIncludePreludes().clear();
				getIncludePreludes().addAll((Collection)newValue);
				return;
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_CODAS:
				getIncludeCodas().clear();
				getIncludeCodas().addAll((Collection)newValue);
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
			case JspPackage.JSP_PROPERTY_GROUP__URL_PATTERN:
				getUrlPattern().clear();
				return;
			case JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED:
				unsetElIgnored();
				return;
			case JspPackage.JSP_PROPERTY_GROUP__PAGE_ENCODING:
				setPageEncoding(PAGE_ENCODING_EDEFAULT);
				return;
			case JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID:
				unsetScriptingInvalid();
				return;
			case JspPackage.JSP_PROPERTY_GROUP__IS_XML:
				unsetIsXML();
				return;
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_PRELUDES:
				getIncludePreludes().clear();
				return;
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_CODAS:
				getIncludeCodas().clear();
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
			case JspPackage.JSP_PROPERTY_GROUP__URL_PATTERN:
				return urlPattern != null && !urlPattern.isEmpty();
			case JspPackage.JSP_PROPERTY_GROUP__EL_IGNORED:
				return isSetElIgnored();
			case JspPackage.JSP_PROPERTY_GROUP__PAGE_ENCODING:
				return PAGE_ENCODING_EDEFAULT == null ? pageEncoding != null : !PAGE_ENCODING_EDEFAULT.equals(pageEncoding);
			case JspPackage.JSP_PROPERTY_GROUP__SCRIPTING_INVALID:
				return isSetScriptingInvalid();
			case JspPackage.JSP_PROPERTY_GROUP__IS_XML:
				return isSetIsXML();
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_PRELUDES:
				return includePreludes != null && !includePreludes.isEmpty();
			case JspPackage.JSP_PROPERTY_GROUP__INCLUDE_CODAS:
				return includeCodas != null && !includeCodas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (urlPattern: ");
		result.append(urlPattern);
		result.append(", elIgnored: ");
		if (elIgnoredESet) result.append(elIgnored); else result.append("<unset>");
		result.append(", pageEncoding: ");
		result.append(pageEncoding);
		result.append(", scriptingInvalid: ");
		if (scriptingInvalidESet) result.append(scriptingInvalid); else result.append("<unset>");
		result.append(", isXML: ");
		if (isXMLESet) result.append(isXML); else result.append("<unset>");
		result.append(", includePreludes: ");
		result.append(includePreludes);
		result.append(", includeCodas: ");
		result.append(includeCodas);
		result.append(')');
		return result.toString();
	}

} //JSPPropertyGroupImpl
