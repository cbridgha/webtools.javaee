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
package org.eclipse.jst.j2ee.internal.earcreation.modulemap;


import org.eclipse.emf.ecore.EObject;


/**
 * @lastgen interface UtilityJARMapping extends EObject {}
 * @deprecated
 * Use
 * <p>
 * 		Need to use the ModuleCore and WorkbenchComponent Api to get to the referenced modules
 * as with the Flexible project changes a .modulemaps file will not exist in an EAR module and
 * all the info that was captured in .modulemaps file will is now captured in the .component file
 */
public interface UtilityJARMapping extends EObject {
	/**
	 * @generated This field/method will be replaced during code generation
	 * @return The value of the ProjectName attribute
	 */
	String getProjectName();

	/**
	 * @generated This field/method will be replaced during code generation
	 * @param value
	 *            The new value of the ProjectName attribute
	 */
	void setProjectName(String value);

	/**
	 * @generated This field/method will be replaced during code generation
	 * @return The value of the Uri attribute
	 */
	String getUri();

	/**
	 * @generated This field/method will be replaced during code generation
	 * @param value
	 *            The new value of the Uri attribute
	 */
	void setUri(String value);

} //UtilityJARMapping
