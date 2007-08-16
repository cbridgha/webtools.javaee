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
package org.eclipse.jem.java.internal.impl;

/*
 *  $RCSfile: JavaParameterImpl.java,v $
 *  $Revision: 1.2 $  $Date: 2005/09/15 20:28:04 $ 
 */
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EParameterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;


import org.eclipse.jem.internal.java.adapters.IJavaMethodAdapter;
import org.eclipse.jem.internal.java.adapters.ReadAdaptor;
import org.eclipse.jem.java.JavaHelpers;
import org.eclipse.jem.java.JavaParameter;
import org.eclipse.jem.java.JavaParameterKind;
import org.eclipse.jem.java.JavaRefPackage;
import org.eclipse.jem.java.Method;

/**
 * @generated
 */
public class JavaParameterImpl extends EParameterImpl implements JavaParameter{

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final int FINAL_EFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #getParameterKind() <em>Parameter Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterKind()
	 * @generated
	 * @ordered
	 */
	protected static final JavaParameterKind PARAMETER_KIND_EDEFAULT = JavaParameterKind.IN_LITERAL;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected JavaParameterKind parameterKind = PARAMETER_KIND_EDEFAULT;
	protected JavaParameterImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaRefPackage.eINSTANCE.getJavaParameter();
	}

	public JavaHelpers getJavaType() {
		return (JavaHelpers)getEType();
	}
  public String getQualifiedName() {
    return (eContainer() instanceof Method) ? ((Method)eContainer()).getName() + "." + this.getName() : this.getName();
  }
	/**
	 * Is this parameter type an array type.
	 */
	public boolean isArray() {
		return getJavaType().isArray();
	}
	/**
	 * Is this a return parameter.
	 */
	public boolean isReturn() {
		return JavaParameterKind.RETURN == getParameterKind().getValue();
	}
	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public boolean isFinal() {
		return (eFlags & FINAL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = (eFlags & FINAL_EFLAG) != 0;
		if (newFinal) eFlags |= FINAL_EFLAG; else eFlags &= ~FINAL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.JAVA_PARAMETER__FINAL, oldFinal, newFinal));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public JavaParameterKind getParameterKind() {
		return parameterKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterKind(JavaParameterKind newParameterKind) {
		JavaParameterKind oldParameterKind = parameterKind;
		parameterKind = newParameterKind == null ? PARAMETER_KIND_EDEFAULT : newParameterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.JAVA_PARAMETER__PARAMETER_KIND, oldParameterKind, parameterKind));
	}

	/*
	 * This is not meant to be used outside of the reflection adapters.
	 */
	public synchronized ReadAdaptor getReadAdapter() {
		return (ReadAdaptor) EcoreUtil.getRegisteredAdapter(eContainer(), ReadAdaptor.TYPE_KEY);
	}
	
	private static final int  REFLECTED_BASE = 0x1, REFLECTED_PARAM_NAME = 0x2;

	protected int reflectionStatus = REFLECTED_BASE;  // At this time base reflection
													  // is performed at creation.

	protected void reflectParamName() {
		// We only want the testing of the hasReflected and get readadapter to be sync(this) so that
		// it is short and no deadlock possibility (this is because the the method reflection adapter may go
		// back to the containing java class to get its reflection adapter, which would lock on itself. So
		// we need to keep the sections that are sync(this) to not be deadlockable by not doing significant work
		// during the sync.
		ReadAdaptor readAdaptor = null;
		synchronized (this) {
			if ((reflectionStatus & REFLECTED_PARAM_NAME) == 0) {
				readAdaptor = getReadAdapter();
			}
		}
		if (readAdaptor != null) {
			boolean setReflected = ((IJavaMethodAdapter) readAdaptor).reflectParamNamesIfNecessary();
			synchronized (this) {
				// Don't want to set it false. That is job of reflection adapter. Otherwise we could have a race.
				// Normally we wouldn't need to set this because it would be set during the reflectParamNamesIfNecessary, but
				// in case there was a problem we mark it still reflected so we don't try again.
				if (setReflected)
					reflectionStatus |= (REFLECTED_BASE | REFLECTED_PARAM_NAME); // We can be certain base will be done by reflect generated if not already
																			  // done.
			}
		}
	}
	
	public String getName() {
		reflectParamName();
		return super.getName();
	}
	
	public void setName(String name) {
		super.setName(name);
		synchronized (this) {
		   reflectionStatus |= (REFLECTED_PARAM_NAME);
		}
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case JavaRefPackage.JAVA_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaRefPackage.JAVA_PARAMETER__ORDERED:
				return ((eFlags & ORDERED_EFLAG) != 0) != ORDERED_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__UNIQUE:
				return ((eFlags & UNIQUE_EFLAG) != 0) != UNIQUE_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__MANY:
				return isMany() != MANY_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__REQUIRED:
				return isRequired() != REQUIRED_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__ETYPE:
				return eType != null;
			case JavaRefPackage.JAVA_PARAMETER__EOPERATION:
				return getEOperation() != null;
			case JavaRefPackage.JAVA_PARAMETER__FINAL:
				return ((eFlags & FINAL_EFLAG) != 0) != FINAL_EDEFAULT;
			case JavaRefPackage.JAVA_PARAMETER__PARAMETER_KIND:
				return parameterKind != PARAMETER_KIND_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case JavaRefPackage.JAVA_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case JavaRefPackage.JAVA_PARAMETER__ORDERED:
				setOrdered(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_PARAMETER__UNIQUE:
				setUnique(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_PARAMETER__LOWER_BOUND:
				setLowerBound(((Integer)newValue).intValue());
				return;
			case JavaRefPackage.JAVA_PARAMETER__UPPER_BOUND:
				setUpperBound(((Integer)newValue).intValue());
				return;
			case JavaRefPackage.JAVA_PARAMETER__ETYPE:
				setEType((EClassifier)newValue);
				return;
			case JavaRefPackage.JAVA_PARAMETER__FINAL:
				setFinal(((Boolean)newValue).booleanValue());
				return;
			case JavaRefPackage.JAVA_PARAMETER__PARAMETER_KIND:
				setParameterKind((JavaParameterKind)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case JavaRefPackage.JAVA_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__ETYPE:
				setEType((EClassifier)null);
				return;
			case JavaRefPackage.JAVA_PARAMETER__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaRefPackage.JAVA_PARAMETER__PARAMETER_KIND:
				setParameterKind(PARAMETER_KIND_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (final: ");
		result.append((eFlags & FINAL_EFLAG) != 0);
		result.append(", parameterKind: ");
		result.append(parameterKind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case JavaRefPackage.JAVA_PARAMETER__EOPERATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, JavaRefPackage.JAVA_PARAMETER__EOPERATION, msgs);
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
				case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case JavaRefPackage.JAVA_PARAMETER__EOPERATION:
					return eBasicSetContainer(null, JavaRefPackage.JAVA_PARAMETER__EOPERATION, msgs);
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
				case JavaRefPackage.JAVA_PARAMETER__EOPERATION:
					return eContainer.eInverseRemove(this, EcorePackage.EOPERATION__EPARAMETERS, EOperation.class, msgs);
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
			case JavaRefPackage.JAVA_PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case JavaRefPackage.JAVA_PARAMETER__NAME:
				return getName();
			case JavaRefPackage.JAVA_PARAMETER__ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_PARAMETER__UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_PARAMETER__LOWER_BOUND:
				return new Integer(getLowerBound());
			case JavaRefPackage.JAVA_PARAMETER__UPPER_BOUND:
				return new Integer(getUpperBound());
			case JavaRefPackage.JAVA_PARAMETER__MANY:
				return isMany() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_PARAMETER__REQUIRED:
				return isRequired() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_PARAMETER__ETYPE:
				if (resolve) return getEType();
				return basicGetEType();
			case JavaRefPackage.JAVA_PARAMETER__EOPERATION:
				return getEOperation();
			case JavaRefPackage.JAVA_PARAMETER__FINAL:
				return isFinal() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.JAVA_PARAMETER__PARAMETER_KIND:
				return getParameterKind();
		}
		return eDynamicGet(eFeature, resolve);
	}

}





