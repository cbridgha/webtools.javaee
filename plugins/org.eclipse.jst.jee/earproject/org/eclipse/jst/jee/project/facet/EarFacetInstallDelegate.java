/******************************************************************************
 * Copyright (c) 2005 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial API and implementation
 ******************************************************************************/

package org.eclipse.jst.jee.project.facet;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.common.project.facet.WtpUtils;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.earcreation.IEarFacetInstallDataModelProperties;
import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetInstallDataModelProperties;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.datamodel.FacetDataModelProvider;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public final class EarFacetInstallDelegate implements IDelegate {

	public void execute(final IProject project, final IProjectFacetVersion fv, final Object cfg, final IProgressMonitor monitor) throws CoreException {
		if (monitor != null) {
			monitor.beginTask("", 1); //$NON-NLS-1$
		}

		try {
			IDataModel model = (IDataModel) cfg;

			if (monitor != null) {
				monitor.worked(1);
			}
			// Add WTP natures.

			WtpUtils.addNaturestoEAR(project);

			final IVirtualComponent c = ComponentCore.createComponent(project, false);
			c.create(0, null);

			final IVirtualFolder earroot = c.getRootFolder();
			earroot.createLink(new Path("/" + model.getStringProperty(IEarFacetInstallDataModelProperties.CONTENT_DIR)), 0, null); //$NON-NLS-1$

			try {
				((IDataModelOperation) model.getProperty(FacetDataModelProvider.NOTIFICATION_OPERATION)).execute(monitor, null);
			} catch (ExecutionException e) {
				Logger.getLogger().logError(e);
			}
			if(model.getBooleanProperty(IJ2EEFacetInstallDataModelProperties.GENERATE_DD)){
				// Create the deployment descriptor (web.xml) if one doesn't exist
				IFile appXmlFile = earroot.getUnderlyingFolder().getFile(new Path(J2EEConstants.APPLICATION_DD_URI));
				if (!appXmlFile.exists()) {
					try {
						if(!appXmlFile.getParent().exists()
								&& (appXmlFile.getParent().getType() ==  IResource.FOLDER)){
							((IFolder)appXmlFile.getParent()).create(true, true, monitor);
						}
						final String appXmlContents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<application id=\"Application_ID\" version=\"5\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_5.xsd\">\n <display-name> \n" + project.getName() +  "</display-name> \n </application> "; //$NON-NLS-1$
						appXmlFile.create(new ByteArrayInputStream(appXmlContents.getBytes("UTF-8")), true, monitor); //$NON-NLS-1$
					} catch (UnsupportedEncodingException e) {
						Logger.getLogger().logError(e);
					}
				}
			}

		}

		finally {
			if (monitor != null) {
				monitor.done();
			}
		}
	}

}
