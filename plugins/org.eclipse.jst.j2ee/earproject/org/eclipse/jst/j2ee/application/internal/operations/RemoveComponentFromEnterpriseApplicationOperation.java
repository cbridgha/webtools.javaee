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
package org.eclipse.jst.j2ee.application.internal.operations;

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.j2ee.application.Application;
import org.eclipse.jst.j2ee.application.Module;
import org.eclipse.jst.j2ee.componentcore.util.EARArtifactEdit;
import org.eclipse.jst.j2ee.internal.common.classpath.J2EEComponentClasspathUpdater;
import org.eclipse.wst.common.componentcore.datamodel.properties.ICreateReferenceComponentsDataModelProperties;
import org.eclipse.wst.common.componentcore.internal.operation.RemoveReferenceComponentOperation;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFile;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;

public class RemoveComponentFromEnterpriseApplicationOperation extends RemoveReferenceComponentOperation {


	public RemoveComponentFromEnterpriseApplicationOperation(IDataModel model) {
		super(model);
	}

	public IStatus execute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		try {
			J2EEComponentClasspathUpdater.getInstance().pauseUpdates();
			updateEARDD(monitor);
			super.execute(monitor, info);
			return OK_STATUS;
		} finally {
			J2EEComponentClasspathUpdater.getInstance().resumeUpdates();
		}
	}

	protected void updateEARDD(IProgressMonitor monitor) {
		EARArtifactEdit earEdit = null;
		try {
			IVirtualComponent comp = (IVirtualComponent) model.getProperty(ICreateReferenceComponentsDataModelProperties.SOURCE_COMPONENT);
			if (!comp.getProject().isAccessible())
				return;
			J2EEComponentClasspathUpdater.getInstance().queueUpdateEAR(comp.getProject());
			earEdit = EARArtifactEdit.getEARArtifactEditForWrite(comp.getProject());
			if (earEdit != null) {
				Application application = earEdit.getApplication();
				List list = (List) model.getProperty(ICreateReferenceComponentsDataModelProperties.TARGET_COMPONENT_LIST);
				if (list != null && list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						IVirtualComponent wc = (IVirtualComponent) list.get(i);
						String moduleURI = getModuleURI(earEdit, wc);
						removeModule(application, moduleURI); 
						IVirtualFile vFile = comp.getRootFolder().getFile(moduleURI);
						IFile iFile = vFile.getUnderlyingFile();
						if(iFile.exists()){
							iFile.delete(true, monitor);
						}
					}
				}
			}
			earEdit.saveIfNecessary(monitor);
		} catch (Exception e) {
			Logger.getLogger().logError(e);
		} finally {
			if (earEdit != null)
				earEdit.dispose();
		}
	}
	
	protected String getModuleURI(final EARArtifactEdit earEdit, final IVirtualComponent targetComponent) {
		return earEdit.getModuleURI(targetComponent);
	}

	protected void removeModule(final Application application, final String moduleURI) {
		Module module = application.getFirstModule(moduleURI);
		application.getModules().remove(module);
	}

}
