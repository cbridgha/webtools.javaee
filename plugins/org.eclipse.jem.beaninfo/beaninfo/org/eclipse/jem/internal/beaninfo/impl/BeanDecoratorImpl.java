/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.beaninfo.impl;
/*


 */


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.logging.Level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jem.beaninfo.common.IBaseBeanInfoConstants;
import org.eclipse.jem.internal.beaninfo.BeanDecorator;
import org.eclipse.jem.internal.beaninfo.BeaninfoPackage;
import org.eclipse.jem.internal.beaninfo.ImplicitItem;

import org.eclipse.jem.internal.beaninfo.common.FeatureAttributeValue;
import org.eclipse.jem.internal.beaninfo.core.*;
import org.eclipse.jem.java.JavaClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isMergeSuperProperties <em>Merge Super Properties</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isMergeSuperMethods <em>Merge Super Methods</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isMergeSuperEvents <em>Merge Super Events</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isIntrospectProperties <em>Introspect Properties</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isIntrospectMethods <em>Introspect Methods</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isIntrospectEvents <em>Introspect Events</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#isDoBeaninfo <em>Do Beaninfo</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#getNotInheritedPropertyNames <em>Not Inherited Property Names</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#getNotInheritedMethodNames <em>Not Inherited Method Names</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#getNotInheritedEventNames <em>Not Inherited Event Names</em>}</li>
 *   <li>{@link org.eclipse.jem.internal.beaninfo.impl.BeanDecoratorImpl#getCustomizerClass <em>Customizer Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */


public class BeanDecoratorImpl extends FeatureDecoratorImpl implements BeanDecorator{
	
	/**
	 * Bits for implicitly set features. This is internal, not meant for clients.
	 */
	public static final long BEAN_CUSTOMIZER_IMPLICIT = 0x1L;
	public static final long BEAN_MERGE_INHERITED_PROPERTIES_IMPLICIT = 0x2L;
	public static final long BEAN_MERGE_INHERITED_OPERATIONS_IMPLICIT = 0x4L;
	public static final long BEAN_MERGE_INHERITED_EVENTS_IMPLICIT = 0x8L;

	/**
	 * The default value of the '{@link #isMergeSuperProperties() <em>Merge Super Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_SUPER_PROPERTIES_EDEFAULT = true;
	
	/**
	 * The flag representing the value of the '{@link #isMergeSuperProperties() <em>Merge Super Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_PROPERTIES_EFLAG = 1 << 18;

	/**
	 * The flag representing whether the Merge Super Properties attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_PROPERTIES_ESETFLAG = 1 << 19;

	/**
	 * The default value of the '{@link #isMergeSuperMethods() <em>Merge Super Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_SUPER_METHODS_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isMergeSuperMethods() <em>Merge Super Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperMethods()
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_METHODS_EFLAG = 1 << 20;

	/**
	 * The flag representing whether the Merge Super Methods attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_METHODS_ESETFLAG = 1 << 21;

	/**
	 * The default value of the '{@link #isMergeSuperEvents() <em>Merge Super Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_SUPER_EVENTS_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isMergeSuperEvents() <em>Merge Super Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMergeSuperEvents()
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_EVENTS_EFLAG = 1 << 22;

	/**
	 * The flag representing whether the Merge Super Events attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MERGE_SUPER_EVENTS_ESETFLAG = 1 << 23;

	/**
	 * The default value of the '{@link #isIntrospectProperties() <em>Introspect Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTROSPECT_PROPERTIES_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isIntrospectProperties() <em>Introspect Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int INTROSPECT_PROPERTIES_EFLAG = 1 << 24;

	/**
	 * The default value of the '{@link #isIntrospectMethods() <em>Introspect Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectMethods()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTROSPECT_METHODS_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isIntrospectMethods() <em>Introspect Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectMethods()
	 * @generated
	 * @ordered
	 */
	protected static final int INTROSPECT_METHODS_EFLAG = 1 << 25;

	/**
	 * The default value of the '{@link #isIntrospectEvents() <em>Introspect Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectEvents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTROSPECT_EVENTS_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isIntrospectEvents() <em>Introspect Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntrospectEvents()
	 * @generated
	 * @ordered
	 */
	protected static final int INTROSPECT_EVENTS_EFLAG = 1 << 26;

	/**
	 * The default value of the '{@link #isDoBeaninfo() <em>Do Beaninfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoBeaninfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DO_BEANINFO_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isDoBeaninfo() <em>Do Beaninfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoBeaninfo()
	 * @generated
	 * @ordered
	 */
	protected static final int DO_BEANINFO_EFLAG = 1 << 27;

	/**
	 * The cached value of the '{@link #getNotInheritedPropertyNames() <em>Not Inherited Property Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotInheritedPropertyNames()
	 * @generated
	 * @ordered
	 */
	protected EList notInheritedPropertyNames = null;

	/**
	 * The cached value of the '{@link #getNotInheritedMethodNames() <em>Not Inherited Method Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotInheritedMethodNames()
	 * @generated
	 * @ordered
	 */
	protected EList notInheritedMethodNames = null;

	/**
	 * The cached value of the '{@link #getNotInheritedEventNames() <em>Not Inherited Event Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotInheritedEventNames()
	 * @generated
	 * @ordered
	 */
	protected EList notInheritedEventNames = null;

	/**
	 * The cached value of the '{@link #getCustomizerClass() <em>Customizer Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizerClass()
	 * @generated
	 * @ordered
	 */
	protected JavaClass customizerClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */	
	protected BeanDecoratorImpl() {
		super();
		eFlags |= MERGE_SUPER_PROPERTIES_EFLAG;
		eFlags |= MERGE_SUPER_METHODS_EFLAG;
		eFlags |= MERGE_SUPER_EVENTS_EFLAG;
		eFlags |= INTROSPECT_PROPERTIES_EFLAG;
		eFlags |= INTROSPECT_METHODS_EFLAG;
		eFlags |= INTROSPECT_EVENTS_EFLAG;
		eFlags |= DO_BEANINFO_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BeaninfoPackage.eINSTANCE.getBeanDecorator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMergeSuperProperties() {
		return (eFlags & MERGE_SUPER_PROPERTIES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeSuperProperties(boolean newMergeSuperProperties) {
		boolean oldMergeSuperProperties = (eFlags & MERGE_SUPER_PROPERTIES_EFLAG) != 0;
		if (newMergeSuperProperties) eFlags |= MERGE_SUPER_PROPERTIES_EFLAG; else eFlags &= ~MERGE_SUPER_PROPERTIES_EFLAG;
		boolean oldMergeSuperPropertiesESet = (eFlags & MERGE_SUPER_PROPERTIES_ESETFLAG) != 0;
		eFlags |= MERGE_SUPER_PROPERTIES_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES, oldMergeSuperProperties, newMergeSuperProperties, !oldMergeSuperPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMergeSuperProperties() {
		boolean oldMergeSuperProperties = (eFlags & MERGE_SUPER_PROPERTIES_EFLAG) != 0;
		boolean oldMergeSuperPropertiesESet = (eFlags & MERGE_SUPER_PROPERTIES_ESETFLAG) != 0;
		if (MERGE_SUPER_PROPERTIES_EDEFAULT) eFlags |= MERGE_SUPER_PROPERTIES_EFLAG; else eFlags &= ~MERGE_SUPER_PROPERTIES_EFLAG;
		eFlags &= ~MERGE_SUPER_PROPERTIES_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES, oldMergeSuperProperties, MERGE_SUPER_PROPERTIES_EDEFAULT, oldMergeSuperPropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMergeSuperProperties() {
		return (eFlags & MERGE_SUPER_PROPERTIES_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMergeSuperMethods() {
		return (eFlags & MERGE_SUPER_METHODS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeSuperMethods(boolean newMergeSuperMethods) {
		boolean oldMergeSuperMethods = (eFlags & MERGE_SUPER_METHODS_EFLAG) != 0;
		if (newMergeSuperMethods) eFlags |= MERGE_SUPER_METHODS_EFLAG; else eFlags &= ~MERGE_SUPER_METHODS_EFLAG;
		boolean oldMergeSuperMethodsESet = (eFlags & MERGE_SUPER_METHODS_ESETFLAG) != 0;
		eFlags |= MERGE_SUPER_METHODS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS, oldMergeSuperMethods, newMergeSuperMethods, !oldMergeSuperMethodsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMergeSuperMethods() {
		boolean oldMergeSuperMethods = (eFlags & MERGE_SUPER_METHODS_EFLAG) != 0;
		boolean oldMergeSuperMethodsESet = (eFlags & MERGE_SUPER_METHODS_ESETFLAG) != 0;
		if (MERGE_SUPER_METHODS_EDEFAULT) eFlags |= MERGE_SUPER_METHODS_EFLAG; else eFlags &= ~MERGE_SUPER_METHODS_EFLAG;
		eFlags &= ~MERGE_SUPER_METHODS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS, oldMergeSuperMethods, MERGE_SUPER_METHODS_EDEFAULT, oldMergeSuperMethodsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMergeSuperMethods() {
		return (eFlags & MERGE_SUPER_METHODS_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMergeSuperEvents() {
		return (eFlags & MERGE_SUPER_EVENTS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeSuperEvents(boolean newMergeSuperEvents) {
		boolean oldMergeSuperEvents = (eFlags & MERGE_SUPER_EVENTS_EFLAG) != 0;
		if (newMergeSuperEvents) eFlags |= MERGE_SUPER_EVENTS_EFLAG; else eFlags &= ~MERGE_SUPER_EVENTS_EFLAG;
		boolean oldMergeSuperEventsESet = (eFlags & MERGE_SUPER_EVENTS_ESETFLAG) != 0;
		eFlags |= MERGE_SUPER_EVENTS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS, oldMergeSuperEvents, newMergeSuperEvents, !oldMergeSuperEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMergeSuperEvents() {
		boolean oldMergeSuperEvents = (eFlags & MERGE_SUPER_EVENTS_EFLAG) != 0;
		boolean oldMergeSuperEventsESet = (eFlags & MERGE_SUPER_EVENTS_ESETFLAG) != 0;
		if (MERGE_SUPER_EVENTS_EDEFAULT) eFlags |= MERGE_SUPER_EVENTS_EFLAG; else eFlags &= ~MERGE_SUPER_EVENTS_EFLAG;
		eFlags &= ~MERGE_SUPER_EVENTS_ESETFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS, oldMergeSuperEvents, MERGE_SUPER_EVENTS_EDEFAULT, oldMergeSuperEventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMergeSuperEvents() {
		return (eFlags & MERGE_SUPER_EVENTS_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntrospectProperties() {
		return (eFlags & INTROSPECT_PROPERTIES_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntrospectProperties(boolean newIntrospectProperties) {
		boolean oldIntrospectProperties = (eFlags & INTROSPECT_PROPERTIES_EFLAG) != 0;
		if (newIntrospectProperties) eFlags |= INTROSPECT_PROPERTIES_EFLAG; else eFlags &= ~INTROSPECT_PROPERTIES_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_PROPERTIES, oldIntrospectProperties, newIntrospectProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntrospectMethods() {
		return (eFlags & INTROSPECT_METHODS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntrospectMethods(boolean newIntrospectMethods) {
		boolean oldIntrospectMethods = (eFlags & INTROSPECT_METHODS_EFLAG) != 0;
		if (newIntrospectMethods) eFlags |= INTROSPECT_METHODS_EFLAG; else eFlags &= ~INTROSPECT_METHODS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_METHODS, oldIntrospectMethods, newIntrospectMethods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntrospectEvents() {
		return (eFlags & INTROSPECT_EVENTS_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntrospectEvents(boolean newIntrospectEvents) {
		boolean oldIntrospectEvents = (eFlags & INTROSPECT_EVENTS_EFLAG) != 0;
		if (newIntrospectEvents) eFlags |= INTROSPECT_EVENTS_EFLAG; else eFlags &= ~INTROSPECT_EVENTS_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_EVENTS, oldIntrospectEvents, newIntrospectEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomizerClass(JavaClass newCustomizerClass) {
		JavaClass oldCustomizerClass = customizerClass;
		customizerClass = newCustomizerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS, oldCustomizerClass, customizerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case BeaninfoPackage.BEAN_DECORATOR__DETAILS:
					return ((InternalEList)getDetails()).basicRemove(otherEnd, msgs);
				case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
					return eBasicSetContainer(null, BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT, msgs);
				case BeaninfoPackage.BEAN_DECORATOR__CONTENTS:
					return ((InternalEList)getContents()).basicRemove(otherEnd, msgs);
				case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES:
					return ((InternalEList)getAttributes()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
					return eContainer.eInverseRemove(this, EcorePackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
				return getEAnnotations();
			case BeaninfoPackage.BEAN_DECORATOR__SOURCE:
				return getSource();
			case BeaninfoPackage.BEAN_DECORATOR__DETAILS:
				return getDetails();
			case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
				return getEModelElement();
			case BeaninfoPackage.BEAN_DECORATOR__CONTENTS:
				return getContents();
			case BeaninfoPackage.BEAN_DECORATOR__REFERENCES:
				return getReferences();
			case BeaninfoPackage.BEAN_DECORATOR__DISPLAY_NAME:
				return getDisplayName();
			case BeaninfoPackage.BEAN_DECORATOR__SHORT_DESCRIPTION:
				return getShortDescription();
			case BeaninfoPackage.BEAN_DECORATOR__CATEGORY:
				return getCategory();
			case BeaninfoPackage.BEAN_DECORATOR__EXPERT:
				return isExpert() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__HIDDEN:
				return isHidden() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__PREFERRED:
				return isPreferred() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_INTROSPECTION:
				return isMergeIntrospection() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES_EXPLICIT_EMPTY:
				return isAttributesExplicitEmpty() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICITLY_SET_BITS:
				return new Long(getImplicitlySetBits());
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICIT_DECORATOR_FLAG:
				return getImplicitDecoratorFlag();
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES:
				return getAttributes();
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES:
				return isMergeSuperProperties() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS:
				return isMergeSuperMethods() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS:
				return isMergeSuperEvents() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_PROPERTIES:
				return isIntrospectProperties() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_METHODS:
				return isIntrospectMethods() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_EVENTS:
				return isIntrospectEvents() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__DO_BEANINFO:
				return isDoBeaninfo() ? Boolean.TRUE : Boolean.FALSE;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_PROPERTY_NAMES:
				return getNotInheritedPropertyNames();
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_METHOD_NAMES:
				return getNotInheritedMethodNames();
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_EVENT_NAMES:
				return getNotInheritedEventNames();
			case BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS:
				if (resolve) return getCustomizerClass();
				return basicGetCustomizerClass();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__SOURCE:
				setSource((String)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DETAILS:
				getDetails().clear();
				getDetails().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CATEGORY:
				setCategory((String)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__EXPERT:
				setExpert(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__HIDDEN:
				setHidden(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__PREFERRED:
				setPreferred(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_INTROSPECTION:
				setMergeIntrospection(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES_EXPLICIT_EMPTY:
				setAttributesExplicitEmpty(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICITLY_SET_BITS:
				setImplicitlySetBits(((Long)newValue).longValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICIT_DECORATOR_FLAG:
				setImplicitDecoratorFlag((ImplicitItem)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES:
				setMergeSuperProperties(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS:
				setMergeSuperMethods(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS:
				setMergeSuperEvents(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_PROPERTIES:
				setIntrospectProperties(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_METHODS:
				setIntrospectMethods(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_EVENTS:
				setIntrospectEvents(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DO_BEANINFO:
				setDoBeaninfo(((Boolean)newValue).booleanValue());
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_PROPERTY_NAMES:
				getNotInheritedPropertyNames().clear();
				getNotInheritedPropertyNames().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_METHOD_NAMES:
				getNotInheritedMethodNames().clear();
				getNotInheritedMethodNames().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_EVENT_NAMES:
				getNotInheritedEventNames().clear();
				getNotInheritedEventNames().addAll((Collection)newValue);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS:
				setCustomizerClass((JavaClass)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DETAILS:
				getDetails().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CONTENTS:
				getContents().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__REFERENCES:
				getReferences().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DISPLAY_NAME:
				unsetDisplayName();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__SHORT_DESCRIPTION:
				unsetShortDescription();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__EXPERT:
				unsetExpert();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__HIDDEN:
				unsetHidden();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__PREFERRED:
				unsetPreferred();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_INTROSPECTION:
				setMergeIntrospection(MERGE_INTROSPECTION_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES_EXPLICIT_EMPTY:
				setAttributesExplicitEmpty(ATTRIBUTES_EXPLICIT_EMPTY_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICITLY_SET_BITS:
				setImplicitlySetBits(IMPLICITLY_SET_BITS_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICIT_DECORATOR_FLAG:
				setImplicitDecoratorFlag(IMPLICIT_DECORATOR_FLAG_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES:
				getAttributes().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES:
				unsetMergeSuperProperties();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS:
				unsetMergeSuperMethods();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS:
				unsetMergeSuperEvents();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_PROPERTIES:
				setIntrospectProperties(INTROSPECT_PROPERTIES_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_METHODS:
				setIntrospectMethods(INTROSPECT_METHODS_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_EVENTS:
				setIntrospectEvents(INTROSPECT_EVENTS_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__DO_BEANINFO:
				setDoBeaninfo(DO_BEANINFO_EDEFAULT);
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_PROPERTY_NAMES:
				getNotInheritedPropertyNames().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_METHOD_NAMES:
				getNotInheritedMethodNames().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_EVENT_NAMES:
				getNotInheritedEventNames().clear();
				return;
			case BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS:
				setCustomizerClass((JavaClass)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.EObject#eIsSet(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BeaninfoPackage.BEAN_DECORATOR__SOURCE:
				return isSourceSet();	// Override so that if set to the same as classname, then it is considered not set.
			default:
				return eIsSetGen(eFeature);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case BeaninfoPackage.BEAN_DECORATOR__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case BeaninfoPackage.BEAN_DECORATOR__DETAILS:
				return details != null && !details.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__EMODEL_ELEMENT:
				return getEModelElement() != null;
			case BeaninfoPackage.BEAN_DECORATOR__CONTENTS:
				return contents != null && !contents.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__REFERENCES:
				return references != null && !references.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__DISPLAY_NAME:
				return isSetDisplayName();
			case BeaninfoPackage.BEAN_DECORATOR__SHORT_DESCRIPTION:
				return isSetShortDescription();
			case BeaninfoPackage.BEAN_DECORATOR__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case BeaninfoPackage.BEAN_DECORATOR__EXPERT:
				return isSetExpert();
			case BeaninfoPackage.BEAN_DECORATOR__HIDDEN:
				return isSetHidden();
			case BeaninfoPackage.BEAN_DECORATOR__PREFERRED:
				return isSetPreferred();
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_INTROSPECTION:
				return ((eFlags & MERGE_INTROSPECTION_EFLAG) != 0) != MERGE_INTROSPECTION_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES_EXPLICIT_EMPTY:
				return ((eFlags & ATTRIBUTES_EXPLICIT_EMPTY_EFLAG) != 0) != ATTRIBUTES_EXPLICIT_EMPTY_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICITLY_SET_BITS:
				return implicitlySetBits != IMPLICITLY_SET_BITS_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__IMPLICIT_DECORATOR_FLAG:
				return implicitDecoratorFlag != IMPLICIT_DECORATOR_FLAG_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_PROPERTIES:
				return isSetMergeSuperProperties();
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_METHODS:
				return isSetMergeSuperMethods();
			case BeaninfoPackage.BEAN_DECORATOR__MERGE_SUPER_EVENTS:
				return isSetMergeSuperEvents();
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_PROPERTIES:
				return ((eFlags & INTROSPECT_PROPERTIES_EFLAG) != 0) != INTROSPECT_PROPERTIES_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_METHODS:
				return ((eFlags & INTROSPECT_METHODS_EFLAG) != 0) != INTROSPECT_METHODS_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__INTROSPECT_EVENTS:
				return ((eFlags & INTROSPECT_EVENTS_EFLAG) != 0) != INTROSPECT_EVENTS_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__DO_BEANINFO:
				return ((eFlags & DO_BEANINFO_EFLAG) != 0) != DO_BEANINFO_EDEFAULT;
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_PROPERTY_NAMES:
				return notInheritedPropertyNames != null && !notInheritedPropertyNames.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_METHOD_NAMES:
				return notInheritedMethodNames != null && !notInheritedMethodNames.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_EVENT_NAMES:
				return notInheritedEventNames != null && !notInheritedEventNames.isEmpty();
			case BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS:
				return customizerClass != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mergeSuperProperties: ");
		if ((eFlags & MERGE_SUPER_PROPERTIES_ESETFLAG) != 0) result.append((eFlags & MERGE_SUPER_PROPERTIES_EFLAG) != 0); else result.append("<unset>");
		result.append(", mergeSuperMethods: ");
		if ((eFlags & MERGE_SUPER_METHODS_ESETFLAG) != 0) result.append((eFlags & MERGE_SUPER_METHODS_EFLAG) != 0); else result.append("<unset>");
		result.append(", mergeSuperEvents: ");
		if ((eFlags & MERGE_SUPER_EVENTS_ESETFLAG) != 0) result.append((eFlags & MERGE_SUPER_EVENTS_EFLAG) != 0); else result.append("<unset>");
		result.append(", introspectProperties: ");
		result.append((eFlags & INTROSPECT_PROPERTIES_EFLAG) != 0);
		result.append(", introspectMethods: ");
		result.append((eFlags & INTROSPECT_METHODS_EFLAG) != 0);
		result.append(", introspectEvents: ");
		result.append((eFlags & INTROSPECT_EVENTS_EFLAG) != 0);
		result.append(", doBeaninfo: ");
		result.append((eFlags & DO_BEANINFO_EFLAG) != 0);
		result.append(", notInheritedPropertyNames: ");
		result.append(notInheritedPropertyNames);
		result.append(", notInheritedMethodNames: ");
		result.append(notInheritedMethodNames);
		result.append(", notInheritedEventNames: ");
		result.append(notInheritedEventNames);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass basicGetCustomizerClass() {
		return customizerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDoBeaninfo() {
		return (eFlags & DO_BEANINFO_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoBeaninfo(boolean newDoBeaninfo) {
		boolean oldDoBeaninfo = (eFlags & DO_BEANINFO_EFLAG) != 0;
		if (newDoBeaninfo) eFlags |= DO_BEANINFO_EFLAG; else eFlags &= ~DO_BEANINFO_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeaninfoPackage.BEAN_DECORATOR__DO_BEANINFO, oldDoBeaninfo, newDoBeaninfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotInheritedPropertyNames() {
		if (notInheritedPropertyNames == null) {
			notInheritedPropertyNames = new EDataTypeUniqueEList(String.class, this, BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_PROPERTY_NAMES);
		}
		return notInheritedPropertyNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotInheritedMethodNames() {
		if (notInheritedMethodNames == null) {
			notInheritedMethodNames = new EDataTypeUniqueEList(String.class, this, BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_METHOD_NAMES);
		}
		return notInheritedMethodNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotInheritedEventNames() {
		if (notInheritedEventNames == null) {
			notInheritedEventNames = new EDataTypeUniqueEList(String.class, this, BeaninfoPackage.BEAN_DECORATOR__NOT_INHERITED_EVENT_NAMES);
		}
		return notInheritedEventNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass getCustomizerClass() {
		if (customizerClass != null && customizerClass.eIsProxy()) {
			JavaClass oldCustomizerClass = customizerClass;
			customizerClass = (JavaClass)eResolveProxy((InternalEObject)customizerClass);
			if (customizerClass != oldCustomizerClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BeaninfoPackage.BEAN_DECORATOR__CUSTOMIZER_CLASS, oldCustomizerClass, customizerClass));
			}
		}
		return customizerClass;
	}

	private URL iconURL;
	private boolean hasQueriedIconURL;
	
	public URL getIconURL(){
		if (!hasQueriedIconURL){
			FeatureAttributeValue value = (FeatureAttributeValue) getAttributes().get(IBaseBeanInfoConstants.ICONCOLOR16X16URL);
			if (value != null) { 
				// Get the value
				Object attr = value.getValue();
				if (attr instanceof String) {
					try {
						hasQueriedIconURL = true;
						iconURL = new URL((String) attr);
					} catch ( MalformedURLException exc ) {
						BeaninfoPlugin.getPlugin().getLogger().log(exc, Level.INFO);
					}
				}
			}			
		}
		return iconURL;
	}
}
