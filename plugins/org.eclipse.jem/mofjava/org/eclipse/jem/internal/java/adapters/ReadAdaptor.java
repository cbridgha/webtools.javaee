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
package org.eclipse.jem.internal.java.adapters;
/*
 *  $RCSfile: ReadAdaptor.java,v $
 *  $Revision: 1.4 $  $Date: 2005/08/24 20:20:25 $ 
 */

import org.eclipse.emf.ecore.EObject;
/**
 * Extended Adaptor interface which adds support for an adapter
 * providing default values for attributes.
 * Creation date: (6/6/2000 4:41:19 PM)
 * @author: Scott Rich
 */
public interface ReadAdaptor extends org.eclipse.emf.common.notify.Adapter {
	public static final String TYPE_KEY = "JavaReflection"; //$NON-NLS-1$
	public Object getValueIn(EObject object, EObject attribute);
	public boolean reflectValuesIfNecessary(); //FB
}




