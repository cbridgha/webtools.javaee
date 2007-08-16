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
/*
 * Created on Dec 4, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package org.eclipse.jst.j2ee.internal.plugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.wst.common.frameworks.internal.enablement.IGroupInitializer;


/**
 * @author schacher
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class J2EEGroupInitializer implements IGroupInitializer {

	/**
	 *  
	 */
	public J2EEGroupInitializer() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.frameworks.internal.group.IGroupInitializer#isGroupEnabled(org.eclipse.core.resources.IProject)
	 */
	public boolean isGroupEnabled(IProject project) {
		return true;
	}

}
