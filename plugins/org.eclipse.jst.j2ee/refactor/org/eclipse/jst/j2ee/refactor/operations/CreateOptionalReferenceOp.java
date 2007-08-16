/*******************************************************************************
 * Copyright (c) 2005 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * rfrost@bea.com - initial API and implementation
 *******************************************************************************/

package org.eclipse.jst.j2ee.refactor.operations;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.common.componentcore.internal.operation.CreateReferenceComponentsOp;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;

/**
 * Extension of <code>CreateReferenceComponentsOp</code> that supports the optional creation of
 * the component and project references.
 */
public class CreateOptionalReferenceOp extends CreateReferenceComponentsOp {
	
	public CreateOptionalReferenceOp(final IDataModel model) {
		super(model);
	}
	
	public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!validateEdit().isOK())
			return Status.CANCEL_STATUS;
		if (model.getBooleanProperty(CreateOptionalReferenceOpDataModelProvider.CREATE_COMPONENT_REF)) {
			addReferencedComponents(monitor);
		}
		if (model.getBooleanProperty(CreateOptionalReferenceOpDataModelProvider.CREATE_PROJECT_REF)) {
			addProjectReferences();
		}
		return OK_STATUS;
	}
	
}
