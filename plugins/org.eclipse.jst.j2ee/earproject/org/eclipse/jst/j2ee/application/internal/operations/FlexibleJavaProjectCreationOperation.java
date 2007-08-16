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
package org.eclipse.jst.j2ee.application.internal.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jem.internal.plugin.JavaEMFNature;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.common.project.facet.JavaProjectFacetCreationDataModelProvider;
import org.eclipse.jst.j2ee.project.datamodel.properties.IFlexibleJavaProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.internal.operation.FlexibleProjectCreationOperation;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.frameworks.internal.DoNotUseMeThisWillBeDeletedPost15;

/**
 * This has been slated for removal post WTP 1.5. Do not use this class/interface
 * 
 * @deprecated
 * 
 * @see JavaProjectFacetCreationDataModelProvider
 */
public class FlexibleJavaProjectCreationOperation extends FlexibleProjectCreationOperation implements IFlexibleJavaProjectCreationDataModelProperties, DoNotUseMeThisWillBeDeletedPost15{

    public FlexibleJavaProjectCreationOperation(IDataModel model) {
        super(model);
    }
    private void addServerTarget(IProgressMonitor monitor)  throws CoreException, InvocationTargetException, InterruptedException, ExecutionException{
        IDataModel serverModel = model.getNestedModel(NESTED_MODEL_SERVER_TARGET);
        IDataModelOperation op = serverModel.getDefaultOperation();
        op.execute(monitor, null);
    }
    
    public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
        IStatus status = super.execute(monitor, info);
        try {
        	createJavaEMFNature();
            addServerTarget(monitor);
        } catch (ExecutionException e) {
        	Logger.getLogger().log(e);
        } catch (CoreException e) {
        	Logger.getLogger().log(e);
        } catch (InvocationTargetException e) {
        	Logger.getLogger().log(e);
        } catch (InterruptedException e) {
        	Logger.getLogger().log(e);
        }
        return status;
    }
	protected void createJavaEMFNature() throws CoreException {
		JavaEMFNature nature = JavaEMFNature.createRuntime(getProject());
		nature.getResourceSet();
	}
}
