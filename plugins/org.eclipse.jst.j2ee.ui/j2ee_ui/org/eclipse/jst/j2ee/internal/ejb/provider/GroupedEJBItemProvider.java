/*******************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.ejb.provider;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jem.util.emf.workbench.WorkbenchResourceHelperBase;
import org.eclipse.jst.j2ee.ejb.EJBJar;
import org.eclipse.jst.j2ee.internal.provider.J2EEItemProvider;



/**
 * This class is the item provider for EJB groups
 */
public abstract class GroupedEJBItemProvider extends J2EEItemProvider {

	public GroupedEJBItemProvider(AdapterFactory adapterFactory, String text, Object image, Object parent, Collection children) {
		super(adapterFactory, text, image, parent, children);
	}
	
	public IFile getAssociatedFile() {

		try {
			EJBJar ejbJar = (EJBJar) getParent();
			if(ejbJar != null && ejbJar.eResource() != null) {
				return WorkbenchResourceHelperBase.getIFile(ejbJar.eResource().getURI());
			}
		} catch (Throwable t) {
			
		}
		return null;		
	}

	public abstract String getText(Object object);
}