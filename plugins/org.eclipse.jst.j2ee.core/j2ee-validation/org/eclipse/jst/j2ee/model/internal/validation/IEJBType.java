/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.model.internal.validation;



/**
 * @version 	1.0
 * @author
 */
public interface IEJBType extends ITypeConstants, IMethodAndFieldConstants {
	public static int REMOTE = 0x1;
	public static int LOCAL = 0x2;
	public static int NEITHER = 0x4;
	
	public long[] getSupertypes();
	public long[] getShouldNotBeSupertypes();
	
	/**
	 * If the name of the method does not match one of the method names which this
	 * rule validates, what type should the method be considered? (e.g. home or business).
	 */
	public long getDefaultMethodType();
	public long[] getKnownMethodTypes();

	public long[] getMethodsWhichMustExist();
	public long[] getMethodsWhichMustNotExist();
	
	public int isRemote();
}
