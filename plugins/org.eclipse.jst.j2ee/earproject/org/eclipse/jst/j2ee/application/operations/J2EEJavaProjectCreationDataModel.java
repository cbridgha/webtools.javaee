/*******************************************************************************
 * Copyright (c) 2003, 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.application.operations;

import org.eclipse.jst.common.jdt.internal.integration.JavaProjectCreationDataModel;

public class J2EEJavaProjectCreationDataModel extends J2EEProjectCreationDataModel {
	protected void initProjectModel() {
	    setProjectDataModel(new JavaProjectCreationDataModel());
	}
}
