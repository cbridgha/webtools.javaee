/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 *  $RCSfile: FieldImpl.java,v $
 *  $Revision: 1.4.2.1 $  $Date: 2004/06/24 18:17:07 $ 
 */
package org.eclipse.jem.java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.ETypedElementImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jem.java.Block;
import org.eclipse.jem.java.Field;
import org.eclipse.jem.java.JavaClass;
import org.eclipse.jem.java.JavaHelpers;
import org.eclipse.jem.java.JavaRefPackage;
import org.eclipse.jem.java.JavaURL;
import org.eclipse.jem.java.JavaVisibilityKind;
import org.eclipse.jem.internal.java.adapters.ReadAdaptor;

/**
 * @generated
 */
public class FieldImpl extends ETypedElementImpl implements Field {

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
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaVisibility() <em>Java Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final JavaVisibilityKind JAVA_VISIBILITY_EDEFAULT = JavaVisibilityKind.PUBLIC_LITERAL;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected JavaVisibilityKind javaVisibility = JAVA_VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Block initializer = null;

	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return JavaRefPackage.eINSTANCE.getField();
	}

	/**
	 * createFieldRef - return a JavaURL reference to the named field in the named Java class in the form "package.class_field"
	 */
	public static Field createFieldRef(String className, String fieldName) {
		Field ref = JavaRefFactoryImpl.getActiveFactory().createField();
		JavaURL javaurl = new JavaURL(className + "/" + fieldName);
		((InternalEObject) ref).eSetProxyURI(URI.createURI(javaurl.getFullString()));
		return ref;
	}

	/**
	 * Get the class that this field is within.
	 */
	public JavaClass getContainingJavaClass() {
		return (JavaClass) this.getJavaClass();
	}

	/**
	 * Overrides to perform lazy initializations/reflection.
	 */
	public EClassifier getEType() {
		reflectValues();
		return super.getEType();
	}

	public Block getInitializer() {
		reflectValues();
		return getInitializerGen();
	}

	public boolean isFinal() {
		reflectValues();
		return isFinalGen();
	}

	public boolean isStatic() {
		reflectValues();
		return isStaticGen();
	}

	public boolean isTransient() {
		reflectValues();
		return isTransientGen();
	}
	
	public boolean isVolatile() {
		reflectValues();
		return isVolatileGen();
	}	

	public JavaHelpers getJavaType() {
		return (JavaHelpers) getEType();
	}

	public JavaVisibilityKind getJavaVisibility() {
		reflectValues();
		return getJavaVisibilityGen();
	}

	protected synchronized ReadAdaptor getReadAdapter() {
		return (ReadAdaptor) EcoreUtil.getRegisteredAdapter(this, ReadAdaptor.TYPE_KEY);
	}

	protected boolean hasReflected = false;

	protected void reflectValues() {
		// We only want the testing of the hasReflected and get readadapter to be sync(this) so that
		// it is short and no deadlock possibility (this is because the the method reflection adapter may go
		// back to the containing java class to get its reflection adapter, which would lock on itself. So
		// we need to keep the sections that are sync(this) to not be deadlockable by not doing significant work
		// during the sync.
		ReadAdaptor readAdaptor = null;
		synchronized (this) {
			if (!hasReflected) {
				readAdaptor = getReadAdapter();
			}
		}
		if (readAdaptor != null) {
			boolean setReflected = readAdaptor.reflectValuesIfNecessary();
			synchronized (this) {
				// Don't want to set it false. That is job of reflection adapter. Otherwise we could have a race.
				if (setReflected)
					hasReflected = setReflected;
			}
		}
	}

	/*
	 * Used by reflection adapter to clear the reflection. This not intended to be used by others.
	 */
	public synchronized void setReflected(boolean reflected) {
		hasReflected = reflected;
	}

	/**
	 * Is this field an array type.
	 */
	public boolean isArray() {
		return getJavaType().isArray();
	}

	/**
	 * Overridden to prevent the reflection of the class.
	 */
	public EList eContents() {
		EList results = new BasicEList();
		//FB
		//FB EList containments = eClass().getEAllContainments();
		//FB if (containments != null) {
		//FB Iterator i = containments.iterator();
		//FB while (i.hasNext()) {
		//FB EStructuralFeature sf = (EStructuralFeature) i.next();
		//FB //Change from super to primRefValue
		//FB Object value = primRefValue(sf);
		//FB //EndChange
		//FB if (value != null)
		//FB if (sf.isMany())
		//FB results.addAll((Collection) value);
		//FB else
		//FB results.add(value);
		//FB }
		//FB }
		if (getInitializerGen() != null)
			results.add(getInitializerGen()); //FB
		return results;
	}

	public String toString() {
		return getClass().getName() + " " + "(" + getName() + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaVisibilityKind getJavaVisibilityGen() {
		return javaVisibility;
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public boolean isFinalGen() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__FINAL, oldFinal, final_));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public boolean isStaticGen() {
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatic(boolean newStatic) {
		boolean oldStatic = static_;
		static_ = newStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaVisibility(JavaVisibilityKind newJavaVisibility) {
		JavaVisibilityKind oldJavaVisibility = javaVisibility;
		javaVisibility = newJavaVisibility == null ? JAVA_VISIBILITY_EDEFAULT : newJavaVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__JAVA_VISIBILITY, oldJavaVisibility, javaVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransientGen() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatileGen() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__VOLATILE, oldVolatile, volatile_));
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public JavaClass getJavaClass() {
		if (eContainerFeatureID != JavaRefPackage.FIELD__JAVA_CLASS)
			return null;
		return (JavaClass) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaClass(JavaClass newJavaClass) {
		if (newJavaClass != eContainer || (eContainerFeatureID != JavaRefPackage.FIELD__JAVA_CLASS && newJavaClass != null)) {
			if (EcoreUtil.isAncestor(this, newJavaClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newJavaClass != null)
				msgs = ((InternalEObject) newJavaClass).eInverseAdd(this, JavaRefPackage.JAVA_CLASS__FIELDS, JavaClass.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newJavaClass, JavaRefPackage.FIELD__JAVA_CLASS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__JAVA_CLASS, newJavaClass, newJavaClass));
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.FIELD__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case JavaRefPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaRefPackage.FIELD__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case JavaRefPackage.FIELD__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case JavaRefPackage.FIELD__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case JavaRefPackage.FIELD__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case JavaRefPackage.FIELD__MANY:
				return isMany() != false;
			case JavaRefPackage.FIELD__REQUIRED:
				return isRequired() != false;
			case JavaRefPackage.FIELD__ETYPE:
				return eType != null;
			case JavaRefPackage.FIELD__FINAL:
				return final_ != FINAL_EDEFAULT;
			case JavaRefPackage.FIELD__STATIC:
				return static_ != STATIC_EDEFAULT;
			case JavaRefPackage.FIELD__JAVA_VISIBILITY:
				return javaVisibility != JAVA_VISIBILITY_EDEFAULT;
			case JavaRefPackage.FIELD__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case JavaRefPackage.FIELD__VOLATILE:
				return volatile_ != VOLATILE_EDEFAULT;
			case JavaRefPackage.FIELD__JAVA_CLASS:
				return getJavaClass() != null;
			case JavaRefPackage.FIELD__INITIALIZER:
				return initializer != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.FIELD__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case JavaRefPackage.FIELD__NAME:
				setName((String) newValue);
				return;
			case JavaRefPackage.FIELD__ORDERED:
				setOrdered(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__UNIQUE:
				setUnique(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__LOWER_BOUND:
				setLowerBound(((Integer) newValue).intValue());
				return;
			case JavaRefPackage.FIELD__UPPER_BOUND:
				setUpperBound(((Integer) newValue).intValue());
				return;
			case JavaRefPackage.FIELD__ETYPE:
				setEType((EClassifier) newValue);
				return;
			case JavaRefPackage.FIELD__FINAL:
				setFinal(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__STATIC:
				setStatic(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__JAVA_VISIBILITY:
				setJavaVisibility((JavaVisibilityKind) newValue);
				return;
			case JavaRefPackage.FIELD__TRANSIENT:
				setTransient(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__VOLATILE:
				setVolatile(((Boolean) newValue).booleanValue());
				return;
			case JavaRefPackage.FIELD__JAVA_CLASS:
				setJavaClass((JavaClass) newValue);
				return;
			case JavaRefPackage.FIELD__INITIALIZER:
				setInitializer((Block) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.FIELD__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case JavaRefPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__ETYPE:
				setEType((EClassifier) null);
				return;
			case JavaRefPackage.FIELD__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__JAVA_VISIBILITY:
				setJavaVisibility(JAVA_VISIBILITY_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
				return;
			case JavaRefPackage.FIELD__JAVA_CLASS:
				setJavaClass((JavaClass) null);
				return;
			case JavaRefPackage.FIELD__INITIALIZER:
				setInitializer((Block) null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * @generated This field/method will be replaced during code generation 
	 */
	public Block getInitializerGen() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Block newInitializer, NotificationChain msgs) {
		Block oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__INITIALIZER, oldInitializer,
					newInitializer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Block newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject) initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaRefPackage.FIELD__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject) newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaRefPackage.FIELD__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaRefPackage.FIELD__INITIALIZER, newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case JavaRefPackage.FIELD__EANNOTATIONS:
					return ((InternalEList) getEAnnotations()).basicAdd(otherEnd, msgs);
				case JavaRefPackage.FIELD__JAVA_CLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, JavaRefPackage.FIELD__JAVA_CLASS, msgs);
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
				case JavaRefPackage.FIELD__EANNOTATIONS:
					return ((InternalEList) getEAnnotations()).basicRemove(otherEnd, msgs);
				case JavaRefPackage.FIELD__JAVA_CLASS:
					return eBasicSetContainer(null, JavaRefPackage.FIELD__JAVA_CLASS, msgs);
				case JavaRefPackage.FIELD__INITIALIZER:
					return basicSetInitializer(null, msgs);
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
				case JavaRefPackage.FIELD__JAVA_CLASS:
					return ((InternalEObject) eContainer).eInverseRemove(this, JavaRefPackage.JAVA_CLASS__FIELDS, JavaClass.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return ((InternalEObject) eContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case JavaRefPackage.FIELD__EANNOTATIONS:
				return getEAnnotations();
			case JavaRefPackage.FIELD__NAME:
				return getName();
			case JavaRefPackage.FIELD__ORDERED:
				return isOrdered() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__LOWER_BOUND:
				return new Integer(getLowerBound());
			case JavaRefPackage.FIELD__UPPER_BOUND:
				return new Integer(getUpperBound());
			case JavaRefPackage.FIELD__MANY:
				return isMany() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__REQUIRED:
				return isRequired() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__ETYPE:
				if (resolve)
					return getEType();
				return basicGetEType();
			case JavaRefPackage.FIELD__FINAL:
				return isFinal() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__STATIC:
				return isStatic() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__JAVA_VISIBILITY:
				return getJavaVisibility();
			case JavaRefPackage.FIELD__TRANSIENT:
				return isTransient() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__VOLATILE:
				return isVolatile() ? Boolean.TRUE : Boolean.FALSE;
			case JavaRefPackage.FIELD__JAVA_CLASS:
				return getJavaClass();
			case JavaRefPackage.FIELD__INITIALIZER:
				return getInitializer();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public String toStringGen() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (final: ");
		result.append(final_);
		result.append(", static: ");
		result.append(static_);
		result.append(", javaVisibility: ");
		result.append(javaVisibility);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", volatile: ");
		result.append(volatile_);
		result.append(')');
		return result.toString();
	}

}

