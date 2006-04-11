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
package org.eclipse.jst.common.internal.annotations.controller;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jem.util.emf.workbench.ProjectUtilities;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jem.workbench.utility.JemProjectUtilities;
import org.eclipse.jst.common.internal.annotations.core.AnnotationsAdapter;
import org.eclipse.jst.common.internal.annotations.core.AnnotationsProviderManager;
import org.eclipse.jst.common.internal.annotations.core.IAnnotationsProvider;

/**
 * @author mdelder
 *  
 */
public class AnnotationsControllerHelper {
	public static final AnnotationsControllerHelper INSTANCE = new AnnotationsControllerHelper();

	protected AnnotationsControllerHelper() {
		super();
	}

	/**
	 * 
	 * @param eObject the annotated? model object
	 * @return true only if the object has annotations
	 */
	public boolean isAnnotated(EObject eObject) {
		if (AnnotationsAdapter.getAnnotations(eObject, AnnotationsAdapter.GENERATED) != null)
			return true;
		List annotationsProviders = AnnotationsProviderManager.INSTANCE.getAnnotationsProviders();
		for (int i=0; i<annotationsProviders.size(); i++) {
			IAnnotationsProvider provider = (IAnnotationsProvider) annotationsProviders.get(i);
			if (provider!=null && provider.isAnnotated(eObject))
				return true;
		}
		return false;
	}

	/**
	 * A convenience method to tag a model object as annotated
	 * 
	 * @param eObject
	 * @param value
	 */
	public void setAnnotated(EObject eObject, String value) {
		AnnotationsAdapter.addAnnotations(eObject, AnnotationsAdapter.GENERATED, value);
	}

	/**
	 * A convenience method to tag a model object as annotated Annotations Adapters can hold extra
	 * information.
	 * 
	 * @param eObject
	 * @param name
	 *            A string key
	 * @param value
	 *            A String value
	 */
	public void addAnnotations(EObject eObject, String name, Object value) {
		AnnotationsAdapter.addAnnotations(eObject, name, value);
	}

	/**
	 * A convenience method to tag a model object as annotated Annotations Adapters can hold extra
	 * information.
	 * 
	 * @param eObject
	 * @param name
	 *            A string key
	 * @param value
	 *            A String value
	 */
	public Object getAnnotations(EObject eObject, String name) {
		return AnnotationsAdapter.getAnnotations(eObject, name);
	}

	/**
	 * Acquires the generated annotation comment and parses the Fragment URL of the following form
	 * to return the tagset name:
	 * 
	 * com.acme.ejbs.MyEJB# <tagset>/ <fragment>. <fragment-pointer>
	 * 
	 * @param eObject
	 *            The annotated object
	 * @return the value of <tagset>in the URL example
	 */
	public String getTagset(EObject eObject) {
		String tagset = getTagsetFromProviders(eObject);
		if (tagset == null) {
			tagset = getTagsetFromFragment(eObject);
		}
		return tagset;
	}
	
	/**
	 * Acquires the generated annotation comment and parses the Fragment URL of the following form
	 * to return the tagset name:
	 * 
	 * com.acme.ejbs.MyEJB# <tagset>/ <fragment>. <fragment-pointer>
	 * 
	 * @param eObject
	 *            The annotated object
	 * @return the value of <tagset>in the URL example
	 */
	private String getTagsetFromFragment(EObject eObject) {

		String generatedComment = (String) AnnotationsAdapter.getAnnotations(eObject, AnnotationsAdapter.GENERATED);
		if (generatedComment == null || generatedComment.length() == 0)
			return null;
		int poundit = generatedComment.indexOf('#');
		int slash = generatedComment.indexOf('/');
		if (poundit < 0 || slash < 0 || poundit >= slash)
			return null;
		return generatedComment.substring(poundit + 1, slash);

	}
	
	/**
	 * Detect the primary tagset used to create an eObject using the providers.
	 * 
	 * @since 1.0.2
	 * @param eObject - An {@link EObject} that may be annotated.
	 * @return a String array of the used tagset names.
	 */
	private String getTagsetFromProviders(EObject eObject) {
		String tagset = null;
		List annotationProviders = AnnotationsProviderManager.INSTANCE.getAnnotationsProviders();
		int size = annotationProviders.size();
		for (int i=0; i < size && tagset == null; i++) {
			IAnnotationsProvider provider = (IAnnotationsProvider) annotationProviders.get(i);
			tagset = provider != null ? provider.getPrimaryTagset(eObject) : null;
		}
		return tagset;
	}

	/**
	 * Returns the CompilationUnit associated with the given model object
	 * 
	 * @param eObject
	 *            an Annotated model Object
	 * @return The compilation unit which was responsible for the generation of the model object
	 */
	public ICompilationUnit getAnnotatedCU(EObject eObject) {
		String fragementString = (String) AnnotationsAdapter.getAnnotations(eObject, AnnotationsAdapter.GENERATED);
		if (fragementString == null)
			return null;

		String typeString = fragementString.substring(0, fragementString.indexOf('#'));
		IType itype;

		if (typeString != null && (itype = findType(typeString, eObject)) != null) {
			return itype.getCompilationUnit();
		}
		return null;
	}
	
	/**
	 * Need to delegate the retrieval of the annotated {@link ICompilationUnit} for
	 * the passed eObject.  There could be multiple but in this case the first will be returned.
	 * 
	 * <p>
	 * This API would need to be revisited in the future if there is a requirement to show
	 * all {@link ICompilationUnit} elements that contribute to the eObject via annotations.
	 * </p>
	 * 
	 * @param eObject - an instance of an {@link EObject} that may be annotated.
	 * @since 1.0.2
	 */
	private ICompilationUnit getAnnotatedCUFromProvider(EObject eObject) {
		ICompilationUnit primaryCU = null;
		List annotationProviders = AnnotationsProviderManager.INSTANCE.getAnnotationsProviders();
		int size = annotationProviders.size();
		for (int i=0; i < size && primaryCU == null; i++) {
			IAnnotationsProvider provider = (IAnnotationsProvider) annotationProviders.get(i);
			primaryCU = provider != null ? provider.getPrimaryAnnotatedCompilationUnit(eObject) : null;
		}
		return primaryCU;
	}

	protected IType findType(String type, EObject eObject) {
		IType result = null;
		IProject project = ProjectUtilities.getProject(eObject);
		IJavaProject javaProject = JemProjectUtilities.getJavaProject(project);
		if (javaProject != null)
			try {
				result = javaProject.findType(type);
			} catch (JavaModelException e) {
				Logger.getLogger().logError(e);
			}
		return result;
	}

	/**
	 * Return true if <code>project</code> has annotation support enabled on it.
	 * 
	 * @return
	 */
	public boolean hasAnnotationSupport(IProject project) {
		return AnnotationsControllerManager.INSTANCE.hasAnnotationsBuilder(project);
	}
}