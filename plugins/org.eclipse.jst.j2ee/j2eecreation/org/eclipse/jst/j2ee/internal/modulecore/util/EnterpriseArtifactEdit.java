/***************************************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 **************************************************************************************************/

package org.eclipse.jst.j2ee.internal.modulecore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.wst.common.modulecore.ArtifactEdit;
import org.eclipse.wst.common.modulecore.ArtifactEditModel;
import org.eclipse.wst.common.modulecore.ModuleCoreNature;
import org.eclipse.wst.common.modulecore.WorkbenchModule;

/**
 * <p>
 * EnterpriseArtifactEdit obtains a type-specific J2EE metamodel from the managed
 * {@see org.eclipse.wst.common.modulecore.ArtifactEditModel}. The underlying EditModel maintains
 * {@see org.eclipse.emf.ecore.resource.Resource}s, such as the J2EE deployment descriptor
 * resource. The defined methods extract data or manipulate the contents of the underlying resource.
 * </p>
 * 
 * <p>
 * This class is an abstract class, and clients are intended to subclass and own their
 * implementation.
 * </p>
 */
public abstract class EnterpriseArtifactEdit extends ArtifactEdit {

	/**
	 * <p>
	 * Creates an instance facade for the given {@see ArtifactEditModel}.
	 * </p>
	 * <p>
	 * Clients that use this constructor are required to release their access of the EditModel when
	 * finished. Calling {@see ArtifactEdit#dispose()}will not touch the supplied EditModel.
	 * </p>
	 * 
	 * @param anArtifactEditModel
	 *            A valid, properly-accessed EditModel
	 */
	public EnterpriseArtifactEdit(ArtifactEditModel model) {
		super(model);
	}

	/**
	 * <p>
	 * Creates an instance facade for the given {@see WorkbenchModule}.
	 * </p>
	 * <p>
	 * Instances of EnterpriseArtifactEdit that are returned through this method must be
	 * {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * 
	 * @param aNature
	 *            A non-null {@see ModuleCoreNature}&nbsp;for an accessible project
	 * @param aModule
	 *            A non-null {@see WorkbenchModule}&nbsp;pointing to a module from the given
	 *            {@see ModuleCoreNature}
	 */

	public EnterpriseArtifactEdit(ModuleCoreNature aNature, WorkbenchModule aModule, boolean toAccessAsReadOnly) {
		super(aNature, aModule, toAccessAsReadOnly);
	}

	/**
	 * <p>
	 * Retrieves J2EE version information from deployment descriptor resource.
	 * </p>
	 * 
	 * @return An the J2EE Specification version of the underlying {@see WorkbenchModule}
	 *  
	 */
	public abstract int getJ2EEVersion();

	/**
	 * <p>
	 * Retrieves a deployment descriptor resource from {@see ArtifactEditModel}using a defined URI.
	 * </p>
	 * 
	 * @return The correct deployment descriptor resource for the underlying {@see WorkbenchModule}
	 *  
	 */
	public abstract Resource getDeploymentDescriptorResource();

	/**
	 * <p>
	 * Obtains the root object from a deployment descriptor resource, the root object contains all
	 * other resource defined objects. Examples of a deployment descriptor root include:
	 * {@see org.eclipse.jst.j2ee.webapplication.WebApp},
	 * {@see org.eclipse.jst.j2ee.application.Application}, and
	 * {@see org.eclipse.jst.j2ee.ejb.EJBJar}
	 * </p>
	 * <p>
	 * Subclasses may extend this method to perform their own deployment descriptor creataion/
	 * retrieval.
	 * </p>
	 * 
	 * @return An EMF metamodel object representing the J2EE deployment descriptor
	 *  
	 */

	public EObject getDeploymentDescriptorRoot() {
		Resource res = getDeploymentDescriptorResource();
		return (EObject) res.getContents().get(0);
	}
	
	/**
	 * <p>
	 * Create an deployment descriptor resource if one does not get and return it.
	 * Subclasses should overwrite this method to create their own type of deployment descriptor
	 * </p>
	 * 
	 * @return an EObject
	 */
	
	public abstract EObject createModelRoot();
}