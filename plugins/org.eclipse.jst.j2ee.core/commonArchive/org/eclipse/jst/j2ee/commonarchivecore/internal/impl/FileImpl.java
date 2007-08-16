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
package org.eclipse.jst.j2ee.commonarchivecore.internal.impl;



import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jst.j2ee.common.internal.impl.J2EEEObjectImpl;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonArchiveFactoryRegistry;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchiveFactory;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchivePackage;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Container;
import org.eclipse.jst.j2ee.commonarchivecore.internal.File;
import org.eclipse.jst.j2ee.commonarchivecore.internal.util.ArchiveUtil;



/**
 * @generated
 */
public class FileImpl extends J2EEEObjectImpl implements File {

	/**
	 * The default value of the '{@link #getURI() <em>URI</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getURI()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String uri = URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_MODIFIED_EDEFAULT = 0L;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected long lastModified = LAST_MODIFIED_EDEFAULT;
	/**
	 * This is true if the Last Modified attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifiedESet = false;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected long size = SIZE_EDEFAULT;
	/**
	 * This is true if the Size attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet = false;

	/**
	 * The default value of the '{@link #isDirectoryEntry() <em>Directory Entry</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDirectoryEntry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTORY_ENTRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectoryEntry() <em>Directory Entry</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDirectoryEntry()
	 * @generated
	 * @ordered
	 */
	protected boolean directoryEntry = DIRECTORY_ENTRY_EDEFAULT;

	/**
	 * This is true if the Directory Entry attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directoryEntryESet = false;

	/**
	 * The default value of the '{@link #getOriginalURI() <em>Original URI</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOriginalURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_URI_EDEFAULT = null;

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected String originalURI = ORIGINAL_URI_EDEFAULT;
	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	protected Container loadingContainer = null;

	public FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CommonarchivePackage.Literals.FILE;
	}

	public CommonarchiveFactory getCommonArchiveFactory() {
		return CommonArchiveFactoryRegistry.INSTANCE.getCommonArchiveFactory();
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public java.lang.String getDirectoryURI() {
		return ArchiveUtil.getFileNameParent(getURI());
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public java.io.InputStream getInputStream() throws java.io.FileNotFoundException, java.io.IOException {
		return getLoadingContainer().primGetInputStream(getOriginalURI());
	}

	public String getName() {
		return ArchiveUtil.getFileNameTail(getURI());
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isApplicationClientFile() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isArchive() {
		return false;
	}

	/**
	 * isContainer method comment.
	 */
	public boolean isContainer() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isEARFile() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isEJBJarFile() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isModuleFile() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isRARFile() {
		return false;
	}

	/**
	 * isReadOnlyDirectory method comment.
	 */
	public boolean isReadOnlyDirectory() {
		return false;
	}

	/**
	 * @see com.ibm.etools.commonarchive.File
	 */
	public boolean isWARFile() {
		return false;
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public String getURI() {
		return uri;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setURI(String newURI) {
		String oldURI = uri;
		uri = newURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__URI, oldURI, uri));
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public long getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(long newLastModified) {
		long oldLastModified = lastModified;
		lastModified = newLastModified;
		boolean oldLastModifiedESet = lastModifiedESet;
		lastModifiedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__LAST_MODIFIED, oldLastModified, lastModified, !oldLastModifiedESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLastModified() {
		long oldLastModified = lastModified;
		boolean oldLastModifiedESet = lastModifiedESet;
		lastModified = LAST_MODIFIED_EDEFAULT;
		lastModifiedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CommonarchivePackage.FILE__LAST_MODIFIED, oldLastModified, LAST_MODIFIED_EDEFAULT, oldLastModifiedESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLastModified() {
		return lastModifiedESet;
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		long oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CommonarchivePackage.FILE__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectoryEntry() {
		return directoryEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectoryEntry(boolean newDirectoryEntry) {
		boolean oldDirectoryEntry = directoryEntry;
		directoryEntry = newDirectoryEntry;
		boolean oldDirectoryEntryESet = directoryEntryESet;
		directoryEntryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__DIRECTORY_ENTRY, oldDirectoryEntry, directoryEntry, !oldDirectoryEntryESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirectoryEntry() {
		boolean oldDirectoryEntry = directoryEntry;
		boolean oldDirectoryEntryESet = directoryEntryESet;
		directoryEntry = DIRECTORY_ENTRY_EDEFAULT;
		directoryEntryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CommonarchivePackage.FILE__DIRECTORY_ENTRY, oldDirectoryEntry, DIRECTORY_ENTRY_EDEFAULT, oldDirectoryEntryESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectoryEntry() {
		return directoryEntryESet;
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public String getOriginalURI() {
		return originalURI;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setOriginalURI(String newOriginalURI) {
		String oldOriginalURI = originalURI;
		originalURI = newOriginalURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__ORIGINAL_URI, oldOriginalURI, originalURI));
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public Container getLoadingContainer() {
		if (loadingContainer != null && loadingContainer.eIsProxy()) {
			InternalEObject oldLoadingContainer = (InternalEObject)loadingContainer;
			loadingContainer = (Container)eResolveProxy(oldLoadingContainer);
			if (loadingContainer != oldLoadingContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonarchivePackage.FILE__LOADING_CONTAINER, oldLoadingContainer, loadingContainer));
			}
		}
		return loadingContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Container basicGetLoadingContainer() {
		return loadingContainer;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setLoadingContainer(Container newLoadingContainer) {
		Container oldLoadingContainer = loadingContainer;
		loadingContainer = newLoadingContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__LOADING_CONTAINER, oldLoadingContainer, loadingContainer));
	}

	/**
	 * @generated This field/method will be replaced during code generation
	 */
	public Container getContainer() {
		if (eContainerFeatureID != CommonarchivePackage.FILE__CONTAINER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, CommonarchivePackage.FILE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public void setContainer(Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID != CommonarchivePackage.FILE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, CommonarchivePackage.CONTAINER__FILES, Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonarchivePackage.FILE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonarchivePackage.FILE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Container)otherEnd, msgs);
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
			case CommonarchivePackage.FILE__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case CommonarchivePackage.FILE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, CommonarchivePackage.CONTAINER__FILES, Container.class, msgs);
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
			case CommonarchivePackage.FILE__URI:
				return getURI();
			case CommonarchivePackage.FILE__LAST_MODIFIED:
				return new Long(getLastModified());
			case CommonarchivePackage.FILE__SIZE:
				return new Long(getSize());
			case CommonarchivePackage.FILE__DIRECTORY_ENTRY:
				return isDirectoryEntry() ? Boolean.TRUE : Boolean.FALSE;
			case CommonarchivePackage.FILE__ORIGINAL_URI:
				return getOriginalURI();
			case CommonarchivePackage.FILE__LOADING_CONTAINER:
				if (resolve) return getLoadingContainer();
				return basicGetLoadingContainer();
			case CommonarchivePackage.FILE__CONTAINER:
				return getContainer();
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
			case CommonarchivePackage.FILE__URI:
				setURI((String)newValue);
				return;
			case CommonarchivePackage.FILE__LAST_MODIFIED:
				setLastModified(((Long)newValue).longValue());
				return;
			case CommonarchivePackage.FILE__SIZE:
				setSize(((Long)newValue).longValue());
				return;
			case CommonarchivePackage.FILE__DIRECTORY_ENTRY:
				setDirectoryEntry(((Boolean)newValue).booleanValue());
				return;
			case CommonarchivePackage.FILE__ORIGINAL_URI:
				setOriginalURI((String)newValue);
				return;
			case CommonarchivePackage.FILE__LOADING_CONTAINER:
				setLoadingContainer((Container)newValue);
				return;
			case CommonarchivePackage.FILE__CONTAINER:
				setContainer((Container)newValue);
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
			case CommonarchivePackage.FILE__URI:
				setURI(URI_EDEFAULT);
				return;
			case CommonarchivePackage.FILE__LAST_MODIFIED:
				unsetLastModified();
				return;
			case CommonarchivePackage.FILE__SIZE:
				unsetSize();
				return;
			case CommonarchivePackage.FILE__DIRECTORY_ENTRY:
				unsetDirectoryEntry();
				return;
			case CommonarchivePackage.FILE__ORIGINAL_URI:
				setOriginalURI(ORIGINAL_URI_EDEFAULT);
				return;
			case CommonarchivePackage.FILE__LOADING_CONTAINER:
				setLoadingContainer((Container)null);
				return;
			case CommonarchivePackage.FILE__CONTAINER:
				setContainer((Container)null);
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
			case CommonarchivePackage.FILE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case CommonarchivePackage.FILE__LAST_MODIFIED:
				return isSetLastModified();
			case CommonarchivePackage.FILE__SIZE:
				return isSetSize();
			case CommonarchivePackage.FILE__DIRECTORY_ENTRY:
				return isSetDirectoryEntry();
			case CommonarchivePackage.FILE__ORIGINAL_URI:
				return ORIGINAL_URI_EDEFAULT == null ? originalURI != null : !ORIGINAL_URI_EDEFAULT.equals(originalURI);
			case CommonarchivePackage.FILE__LOADING_CONTAINER:
				return loadingContainer != null;
			case CommonarchivePackage.FILE__CONTAINER:
				return getContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated This field/method will be replaced during code generation.
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (URI: ");
		result.append(uri);
		result.append(", lastModified: ");
		if (lastModifiedESet) result.append(lastModified); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", directoryEntry: ");
		if (directoryEntryESet) result.append(directoryEntry); else result.append("<unset>");
		result.append(", originalURI: ");
		result.append(originalURI);
		result.append(')');
		return result.toString();
	}

	/*
	 * @see File#isFARFile()
	 */
	public boolean isFARFile() {
		return false;
	}

}
