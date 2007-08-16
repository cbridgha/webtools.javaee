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
package org.eclipse.jem.internal.plugin;
/*
 * $RCSfile: JavaEMFNature.java,v $ $Revision: 1.17 $ $Date: 2006/09/14 18:31:08 $
 */

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.JavaCore;

import org.eclipse.jem.internal.adapters.jdom.JavaJDOMAdapterFactory;
import org.eclipse.jem.internal.java.adapters.*;
import org.eclipse.jem.java.adapters.JavaXMIFactory;
import org.eclipse.jem.util.emf.workbench.EMFWorkbenchContextBase;
import org.eclipse.jem.util.emf.workbench.WorkbenchURIConverter;
import org.eclipse.jem.util.emf.workbench.nature.EMFNature;
import org.eclipse.jem.workbench.utility.IJavaEMFNature;
import org.eclipse.jem.workbench.utility.JemProjectUtilities;

public class JavaEMFNature extends EMFNature implements IJavaEMFNature {
/**
 * JavaMOFNatureRuntime constructor comment.
 */
public JavaEMFNature() {
	super();
}
/**
 * Get a IJavaMOFNatureRuntime that corresponds to the supplied project.
 * @return IJavaMOFNatureRuntime
 * @param project com.ibm.itp.core.api.resources.IProject
 */
public static JavaEMFNature createRuntime(IProject project) throws CoreException {
	if(!hasRuntime(project))
		if (JavaCore.create(project).exists())
			addNatureToProject(project, IJavaEMFNature.NATURE_ID);
		else
			return null;

	return getRuntime(project);
}

/**
 * Return the nature's ID.
 */
public java.lang.String getNatureID() {
	return IJavaEMFNature.NATURE_ID;
}
/**
 * Return the ID of the plugin that this nature is contained within.
 */
protected java.lang.String getPluginID() {
	return JavaPlugin.getDefault().getBundle().getSymbolicName();
}
/**
 * Get a IJavaMOFNatureRuntime that corresponds to the supplied project.
 * First check for registered natures.
 * @return IJavaMOFNatureRuntime
 * @param project com.ibm.itp.core.api.resources.IProject
 */
public static JavaEMFNature getRuntime(IProject project) {
	JavaEMFNature nature = null;
	List runtimes = EMFNature.getRegisteredRuntimes(project);
	for (int i=0; i<runtimes.size(); i++) {
		if (runtimes.get(i) instanceof JavaEMFNature)
			nature = (JavaEMFNature) runtimes.get(i);
	}
	if (nature == null)
		nature = primGetRuntime(project);
	return nature;
}
/**
 * Return whether or not the project has a runtime created on it.
 * Check for registered natures first.
 * @return boolean
 * @param project com.ibm.itp.core.api.resources.IProject
 */
public static boolean hasRuntime(IProject project) {
	JavaEMFNature nature = null;
	List runtimes = EMFNature.getRegisteredRuntimes(project);
	for (int i=0; i<runtimes.size(); i++) {
		if (runtimes.get(i) instanceof JavaEMFNature)
			nature = (JavaEMFNature) runtimes.get(i);
	}
	if (nature == null)
		return primHasRuntime(project);
	else
		return true;

}
/**
 * Get a IJavaMOFNatureRuntime that corresponds to the supplied project.
 * Do not check for other registered types.
 * @return IJavaMOFNatureRuntime
 * @param project com.ibm.itp.core.api.resources.IProject
 */
public static JavaEMFNature primGetRuntime(IProject project) {
	try {
		return (JavaEMFNature) project.getNature(IJavaEMFNature.NATURE_ID);
	} catch (CoreException e) {
		return null;
	}
}
/**
 * Return whether or not the project has a runtime created on it.
 * Do not check for registered nature ids.
 * @return boolean
 * @param project com.ibm.itp.core.api.resources.IProject
 */
public static boolean primHasRuntime(IProject project) {
	try {
		return project.hasNature(IJavaEMFNature.NATURE_ID);
	} catch (CoreException e) {
		return false;
	}
}

/**
 * primary contribute to context
 */
public void primaryContributeToContext(EMFWorkbenchContextBase aNature) {
	if (emfContext == aNature) return;
	emfContext = aNature;
	ResourceSet set = aNature.getResourceSet();
	set.getResourceFactoryRegistry().getProtocolToFactoryMap().put(JavaXMIFactory.SCHEME, JavaXMIFactory.INSTANCE);	
	WorkbenchURIConverter conv = (WorkbenchURIConverter) set.getURIConverter();
	configureURIConverter(conv);
	addAdapterFactories(set);	
}

/**
 * secondary contribute to context
 */
public void secondaryContributeToContext(EMFWorkbenchContextBase aNature) {
	primaryContributeToContext(aNature);
}

/**
 * Remove the project as a container from the converter and add
 * the source folder.
 */
protected void configureURIConverter(WorkbenchURIConverter conv) {
	conv.removeInputContainer(getProject());
	conv.addInputContainer(getEMFRoot());
}

/**
 * Add Adaptor factories to aContext which is now
 * being used for this nature.
 */
protected void addAdapterFactories(ResourceSet aSet) {
	addJavaReflectionAdapterFactories(aSet);
}

protected void addJavaReflectionAdapterFactories(ResourceSet aSet) {
	List factories = aSet.getAdapterFactories();
	// The context may already have a JavaReflection adaptor factory, so remove it
	// This should maybe be considered a logic error, but we can recover easily
	if (!factories.isEmpty()) {
		AdapterFactory factory = EcoreUtil.getAdapterFactory(factories, ReadAdaptor.TYPE_KEY);
		if (factory != null)
			factories.remove(factory);
	}

	factories.add(adapterFactory);
}

private JavaJDOMAdapterFactory adapterFactory;

/* (non-Javadoc)
 * @see org.eclipse.jem.util.emf.workbench.nature.EMFNature#setProject(org.eclipse.core.resources.IProject)
 */
public void setProject(IProject newProject) {
	super.setProject(newProject);
	adapterFactory = new JavaJDOMAdapterFactory(JemProjectUtilities.getJavaProject(project));
}

}
