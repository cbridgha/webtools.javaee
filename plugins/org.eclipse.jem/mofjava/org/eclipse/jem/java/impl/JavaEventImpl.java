package org.eclipse.jem.java.impl;
/*******************************************************************************
 * Copyright (c)  2001, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 *  $RCSfile: JavaEventImpl.java,v $
 *  $Revision: 1.2 $  $Date: 2004/01/13 16:25:08 $ 
 */
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jem.java.JavaEvent;
import org.eclipse.jem.java.JavaRefPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class JavaEventImpl extends EStructuralFeatureImpl implements JavaEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaRefPackage.eINSTANCE.getJavaEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS, msgs);
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
				case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS:
					return eBasicSetContainer(null, JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS, msgs);
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
				case JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS:
					return ((InternalEObject)eContainer).eInverseRemove(this, EcorePackage.ECLASS__ESTRUCTURAL_FEATURES, EClass.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return ((InternalEObject)eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
				return getEAnnotations();
			case JavaRefPackage.JAVA_EVENT__NAME:
				return getName();
			case JavaRefPackage.JAVA_EVENT__ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__LOWER_BOUND:
				return new Integer(getLowerBound());
			case JavaRefPackage.JAVA_EVENT__UPPER_BOUND:
				return new Integer(getUpperBound());
			case JavaRefPackage.JAVA_EVENT__MANY:
				return isMany() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__REQUIRED:
				return isRequired() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
			case JavaRefPackage.JAVA_EVENT__CHANGEABLE:
				return isChangeable() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__VOLATILE:
				return isVolatile() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__TRANSIENT:
				return isTransient() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE:
				return getDefaultValue();
			case JavaRefPackage.JAVA_EVENT__UNSETTABLE:
				return isUnsettable() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS:
				return getEContainingClass();
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
			case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case JavaRefPackage.JAVA_EVENT__NAME:
				setName((String)newValue);
				return;
			case JavaRefPackage.JAVA_EVENT__ORDERED:
				setOrdered(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__UNIQUE:
				setUnique(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__LOWER_BOUND:
				setLowerBound(((Integer)newValue).intValue());
				return;
			case JavaRefPackage.JAVA_EVENT__UPPER_BOUND:
				setUpperBound(((Integer)newValue).intValue());
				return;
			case JavaRefPackage.JAVA_EVENT__ETYPE:
				setEType((EClassifier)newValue);
				return;
			case JavaRefPackage.JAVA_EVENT__CHANGEABLE:
				setChangeable(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__VOLATILE:
				setVolatile(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__TRANSIENT:
				setTransient(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case JavaRefPackage.JAVA_EVENT__UNSETTABLE:
				setUnsettable(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_EVENT__DERIVED:
				setDerived(((Boolean)newValue).booleanValue());
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
			case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case JavaRefPackage.JAVA_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__ETYPE:
				setEType((EClassifier)null);
				return;
			case JavaRefPackage.JAVA_EVENT__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__UNSETTABLE:
				setUnsettable(UNSETTABLE_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_EVENT__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.JAVA_EVENT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case JavaRefPackage.JAVA_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaRefPackage.JAVA_EVENT__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__MANY:
				return isMany() != false;
			case JavaRefPackage.JAVA_EVENT__REQUIRED:
				return isRequired() != false;
			case JavaRefPackage.JAVA_EVENT__ETYPE:
				return eType != null;
			case JavaRefPackage.JAVA_EVENT__CHANGEABLE:
				return changeable != CHANGEABLE_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case JavaRefPackage.JAVA_EVENT__DEFAULT_VALUE:
				return getDefaultValue() != null;
			case JavaRefPackage.JAVA_EVENT__UNSETTABLE:
				return unsettable != UNSETTABLE_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case JavaRefPackage.JAVA_EVENT__ECONTAINING_CLASS:
				return getEContainingClass() != null;
		}
		return eDynamicIsSet(eFeature);
	}

}