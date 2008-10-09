/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.web.operations;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jst.j2ee.web.datamodel.properties.IConvertStaticWebToDyamnicDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.AbstractDataModelProvider;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;

public class ConvertStaticWebToDyamnicDataModelProvider extends  AbstractDataModelProvider implements IConvertStaticWebToDyamnicDataModelProperties {
	
	
	public ConvertStaticWebToDyamnicDataModelProvider() {
		super();
	}

	public IDataModelOperation getDefaultOperation() {
		return new ConvertStaticWebToDyamnicOperation(model);
	}


	public Set getPropertyNames() {
		Set propertyNames = new HashSet();
		propertyNames.add(PROJECT);
		propertyNames.add(CONVERT_TO_WEB_VERSION);
		return propertyNames;
	}

}
