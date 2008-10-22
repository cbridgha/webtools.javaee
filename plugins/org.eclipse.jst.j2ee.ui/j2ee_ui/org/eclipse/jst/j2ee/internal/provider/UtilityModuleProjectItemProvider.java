/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.provider;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;

public class UtilityModuleProjectItemProvider extends J2EEItemProvider {

	private IProject utilProject;

	public UtilityModuleProjectItemProvider(AdapterFactory adapterFactory, IProject project, Object parent) {
		super(adapterFactory);
		setParent(parent);
		utilProject = project;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see ItemProviderAdapter#getImage(Object)
	 */
	public Object getImage(Object object) {
		return J2EEPlugin.getPlugin().getImage("icons/full/obj16/prjutiljar_obj"); //$NON-NLS-1$
	}

	/**
	 * @see ItemProviderAdapter#getText(Object)
	 */
	public String getText(Object object) {
		
		return utilProject.getName();
	}

	@Override
	public Collection<?> getChildren(Object object) {
		// TODO Auto-generated method stub
		return super.getChildren(object);
	}

}
