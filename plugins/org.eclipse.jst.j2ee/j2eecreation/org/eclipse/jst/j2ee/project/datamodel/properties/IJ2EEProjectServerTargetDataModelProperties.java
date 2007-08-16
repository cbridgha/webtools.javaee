/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.project.datamodel.properties;

import org.eclipse.wst.common.frameworks.datamodel.IDataModelProperties;

public interface IJ2EEProjectServerTargetDataModelProperties extends IDataModelProperties{

	/**
	 * required, type String
	 */
	public static final String PROJECT_NAME = "IJ2EEProjectServerTargetDataModelProperties.PROJECT_NAME"; //$NON-NLS-1$
	/**
	 * required, not defaulted. If null, will not run.
	 */
	public static final String RUNTIME_TARGET_ID = "IJ2EEProjectServerTargetDataModelProperties.RUNTIME_TARGET_ID"; //$NON-NLS-1$
	/**
	 * Optional - This needs to be set if the PROJECT_NAME does not exist.
	 * 
	 * @link J2EEVersionConstants
	 */
	public static final String J2EE_VERSION_ID = "IJ2EEProjectServerTargetDataModelProperties.J2EE_VERSION_ID"; //$NON-NLS-1$

	/**
	 * optional, default true, type Boolean. Set this to true if the operation is supposed to update
	 * all dependent modules and projects in an ear if the passed project name is an ear project
	 */
	public static final String UPDATE_MODULES = "IJ2EEProjectServerTargetDataModelProperties.UPDATE_MODULES"; //$NON-NLS-1$

	/**
	 * Optional - This needs to be set if the PROJECT_NAME does not exist.
	 * 
	 * @link XMLResource#APP_CLIENT_TYPE
	 * @link XMLResource#APPLICATION_TYPE
	 * @link XMLResource#EJB_TYPE
	 * @link XMLResource#RAR_TYPE
	 * @link XMLResource#WEB_APP_TYPE
	 */
	public static final String DEPLOYMENT_TYPE_ID = "IJ2EEProjectServerTargetDataModelProperties.DD_TYPE_ID"; //$NON-NLS-1$


}
