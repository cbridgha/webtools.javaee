/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.common.internal.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jst.j2ee.common.CommonPackage;
import org.eclipse.jst.j2ee.common.CompatibilityDescriptionGroup;
import org.eclipse.jst.j2ee.internal.common.CommonEditResourceHandler;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;


/**
 * This is the item provider adpater for a
 * {@link org.eclipse.jst.j2ee.internal.internal.common.CompatibilityDescriptionGroup}object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompatibilityDescriptionGroupItemProvider extends DescriptionGroupItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CompatibilityDescriptionGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSmallIconPropertyDescriptor(object);
			addLargeIconPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Small Icon feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *  
	 */
	protected void addSmallIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_smallIcon_feature"), //$NON-NLS-1$
					CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_smallIcon_feature_desc"), //$NON-NLS-1$
					CommonPackage.eINSTANCE.getCompatibilityDescriptionGroup_SmallIcon(), false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Large Icon feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *  
	 */
	protected void addLargeIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_largeIcon_feature"), //$NON-NLS-1$
					CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_largeIcon_feature_desc"), //$NON-NLS-1$
					CommonPackage.eINSTANCE.getCompatibilityDescriptionGroup_LargeIcon(), false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *  
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_description_feature"), //$NON-NLS-1$
					CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_description_feature_desc"), //$NON-NLS-1$
					CommonPackage.eINSTANCE.getCompatibilityDescriptionGroup_Description(), true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}

	/**
	 * This adds a property descriptor for the Display Name feature. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *  
	 */
	protected void addDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_displayName_feature"), //$NON-NLS-1$
					CommonEditResourceHandler.getString("_UI_CompatibilityDescriptionGroup_displayName_feature_desc"), //$NON-NLS-1$
					CommonPackage.eINSTANCE.getCompatibilityDescriptionGroup_DisplayName(), true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
	}


	/**
	 * This returns CompatibilityDescriptionGroup.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object getImage(Object object) {
		return getResourceLocator().getImage("full/obj16/CompatibilityDescriptionGroup"); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CompatibilityDescriptionGroup) object).getDisplayName();
		return label == null || label.length() == 0 ? getString("_UI_CompatibilityDescriptionGroup_type") : //$NON-NLS-1$
					getString("_UI_CompatibilityDescriptionGroup_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles notification by calling {@link #fireNotifyChanged fireNotifyChanged}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		switch (notification.getFeatureID(CompatibilityDescriptionGroup.class)) {
			case CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__SMALL_ICON :
			case CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__LARGE_ICON :
			case CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DESCRIPTION :
			case CommonPackage.COMPATIBILITY_DESCRIPTION_GROUP__DISPLAY_NAME : {
				fireNotifyChanged(notification);
				return;
			}
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *  
	 */
	public ResourceLocator getResourceLocator() {
		return J2EEPlugin.getDefault();
	}
}
