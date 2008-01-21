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
package org.eclipse.jst.j2ee.ejb.internal.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jst.j2ee.ejb.ContainerManagedEntity;

/**
 * This filter will return a subset of the persistentAttributes from the
 * ContainerManagedEntityExtension that is passed as an argument to the filter
 * method. It will remove any persistentAttributes that are held by
 * EjbRelationshipRole objects (including inherited EjbRelationshipRole
 * attributes). That means the returned list of CMPAttributes will be attributes
 * that were defined locally and all inherited attributes minus any attributes
 * pointed to by EjbRelationshipRoles, thus the attributes will only be
 * attributes that were defined by the user. 
 */
public class ModelledPersistentAttributeFilter extends
		ContainerManagedEntityFilter {
	
	private static ModelledPersistentAttributeFilter singleton;

	protected List filterNotcached(ContainerManagedEntity cmp) {
		return getSourceAttributes(cmp);
	}

	/**
	 * Return the proper list of attributes from cmpExt. Return all attributes
	 * minus those added due to Relationship Roles.
	 */
	protected List getSourceAttributes(ContainerManagedEntity cmp) {
		List all, roleAttributes;
		all = new ArrayList(cmp.getPersistentAttributes());
		roleAttributes = cmp
				.getFilteredFeatures(RelationshipRoleAttributeFilter
						.singleton());
		filterRoleAttributesByName(all, roleAttributes);
		return all;
	}

	/**
	 * Insert the method's description here. Creation date: (11/28/2000 5:36:00
	 * PM)
	 * 
	 * @return com.ibm.ejs.models.base.extensions.ejbext.impl.ModelledPersistentAttributeFilter
	 */
	public static ModelledPersistentAttributeFilter singleton() {
		if (singleton == null)
			singleton = new ModelledPersistentAttributeFilter();
		return singleton;
	}
}
