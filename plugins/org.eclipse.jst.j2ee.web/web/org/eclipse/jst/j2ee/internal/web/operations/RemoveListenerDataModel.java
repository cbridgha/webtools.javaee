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
/*
 * Created on Jun 8, 2004
 *
 */
package org.eclipse.jst.j2ee.internal.web.operations;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jst.j2ee.common.operations.J2EEModelModifierOperationDataModel;
import org.eclipse.wst.common.framework.operation.WTPOperation;
import org.eclispe.wst.common.framework.plugin.WTPCommonPlugin;

/**
 * @author jialin
 *  
 */
public class RemoveListenerDataModel extends J2EEModelModifierOperationDataModel {
	public static final String REMOVE_JAVA_CLASS = "RemoveListenerDataModel.REMOVE_JAVA_CLASS"; //$NON-NLS-1$
	public static final String LISTENER_LIST = "RemoveListenerDataModel.LISTENER_LIST"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.framework.operation.WTPOperationDataModel#getDefaultOperation()
	 */
	public WTPOperation getDefaultOperation() {
		return new RemoveListenerOperation(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.internal.emfworkbench.operation.ModelModifierOperationDataModel#initValidBaseProperties()
	 */
	protected void initValidBaseProperties() {
		super.initValidBaseProperties();
		addValidBaseProperty(REMOVE_JAVA_CLASS);
		addValidBaseProperty(LISTENER_LIST);
	}

	protected Object getDefaultProperty(String propertyName) {
		if (propertyName.equals(REMOVE_JAVA_CLASS)) {
			return Boolean.FALSE;
		}
		return super.getDefaultProperty(propertyName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.framework.operation.WTPOperationDataModel#doValidateProperty(java.lang.String)
	 */
	protected IStatus doValidateProperty(String propertyName) {
		if (propertyName.equals(LISTENER_LIST))
			return validateListenerList((List) getProperty(propertyName));
		return super.doValidateProperty(propertyName);
	}

	private IStatus validateListenerList(List prop) {
		if (prop == null || prop.isEmpty()) {
			String msg = WebMessages.getResourceString(WebMessages.ERR_LISTENER_LIST_EMPTY);
			return WTPCommonPlugin.createErrorStatus(msg);
		}
		return WTPCommonPlugin.OK_STATUS;
	}
}