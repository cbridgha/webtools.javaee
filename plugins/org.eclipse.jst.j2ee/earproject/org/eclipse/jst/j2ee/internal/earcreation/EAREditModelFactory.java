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
package org.eclipse.jst.j2ee.internal.earcreation;

import java.util.Map;

import org.eclipse.wst.common.emfworkbench.EMFWorkbenchContext;
import org.eclipse.wst.common.emfworkbench.integration.EditModel;
import org.eclipse.wst.common.emfworkbench.integration.EditModelFactory;



/**
 * @author Administrator
 * 
 *  
 */
public class EAREditModelFactory extends EditModelFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.emfworkbench.integration.EditModelFactory#createEditModelForRead(java.lang.Object,
	 *      org.eclipse.wst.common.emfworkbench.EMFWorkbenchContext)
	 */
	public EditModel createEditModelForRead(String editModelID, EMFWorkbenchContext context, Map params) {
		return new EAREditModel(editModelID, context, true, isLoadKnownResourcesAsReadOnly());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.emfworkbench.integration.EditModelFactory#createEditModelForWrite(java.lang.Object,
	 *      org.eclipse.wst.common.emfworkbench.EMFWorkbenchContext)
	 */
	public EditModel createEditModelForWrite(String editModelID, EMFWorkbenchContext context, Map params) {
		return new EAREditModel(editModelID, context, false, isLoadKnownResourcesAsReadOnly());
	}

}