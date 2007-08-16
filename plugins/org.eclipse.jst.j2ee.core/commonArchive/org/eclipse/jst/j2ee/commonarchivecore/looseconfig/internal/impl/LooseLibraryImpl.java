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
package org.eclipse.jst.j2ee.commonarchivecore.looseconfig.internal.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jst.j2ee.commonarchivecore.looseconfig.internal.LooseLibrary;
import org.eclipse.jst.j2ee.commonarchivecore.looseconfig.internal.LooseWARFile;
import org.eclipse.jst.j2ee.commonarchivecore.looseconfig.internal.LooseconfigPackage;

/**
 * @generated
 */
public class LooseLibraryImpl extends LooseArchiveImpl implements LooseLibrary {
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected LooseLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LooseconfigPackage.Literals.LOOSE_LIBRARY;
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public LooseWARFile getLooseWAR() {
		if (eContainerFeatureID != LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR) return null;
		return (LooseWARFile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLooseWAR(LooseWARFile newLooseWAR, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLooseWAR, LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR, msgs);
		return msgs;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setLooseWAR(LooseWARFile newLooseWAR) {
		if (newLooseWAR != eInternalContainer() || (eContainerFeatureID != LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR && newLooseWAR != null)) {
			if (EcoreUtil.isAncestor(this, newLooseWAR))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLooseWAR != null)
				msgs = ((InternalEObject)newLooseWAR).eInverseAdd(this, LooseconfigPackage.LOOSE_WAR_FILE__LOOSE_LIBS, LooseWARFile.class, msgs);
			msgs = basicSetLooseWAR(newLooseWAR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR, newLooseWAR, newLooseWAR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLooseWAR((LooseWARFile)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				return basicSetLooseWAR(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				return eInternalContainer().eInverseRemove(this, LooseconfigPackage.LOOSE_WAR_FILE__LOOSE_LIBS, LooseWARFile.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				return getLooseWAR();
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
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				setLooseWAR((LooseWARFile)newValue);
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
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				setLooseWAR((LooseWARFile)null);
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
			case LooseconfigPackage.LOOSE_LIBRARY__LOOSE_WAR:
				return getLooseWAR() != null;
		}
		return super.eIsSet(featureID);
	}

} //LooseLibraryImpl



