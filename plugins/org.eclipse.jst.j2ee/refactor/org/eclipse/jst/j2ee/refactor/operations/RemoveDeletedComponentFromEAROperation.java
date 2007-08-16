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
package org.eclipse.jst.j2ee.refactor.operations;

import java.util.Map;

import org.eclipse.jst.j2ee.application.internal.operations.RemoveComponentFromEnterpriseApplicationOperation;
import org.eclipse.jst.j2ee.componentcore.util.EARArtifactEdit;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;

public class RemoveDeletedComponentFromEAROperation extends RemoveComponentFromEnterpriseApplicationOperation {

	public RemoveDeletedComponentFromEAROperation(IDataModel model) {
		super(model);
	}
		
	protected String getModuleURI(final EARArtifactEdit earEdit, final IVirtualComponent targetComponent) {
		String uri = earEdit.getModuleURI(targetComponent);
		if (uri == null) {
			Map compToURI = (Map) model.getProperty(RemoveDeletedComponentFromEARDataModelProvider.TARGET_COMPONENTS_TO_URI_MAP); 
			uri = (String) compToURI.get(targetComponent);
		}
		return uri;
	}
}
