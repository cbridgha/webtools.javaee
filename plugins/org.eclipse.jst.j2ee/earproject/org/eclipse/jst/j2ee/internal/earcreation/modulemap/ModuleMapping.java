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
package org.eclipse.jst.j2ee.internal.earcreation.modulemap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jst.j2ee.application.Module;



/**
 * @lastgen interface ModuleMapping extends EObject {}
 */
public interface ModuleMapping extends EObject {
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
	 * @return The Module reference
	 */
	Module getModule();

	/**
	 * @generated This field/method will be replaced during code generation
	 * @param l
	 *            The new value of the Module reference
	 */
	void setModule(Module value);

} //ModuleMapping
