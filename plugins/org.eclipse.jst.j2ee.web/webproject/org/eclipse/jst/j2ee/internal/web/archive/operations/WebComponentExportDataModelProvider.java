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
package org.eclipse.jst.j2ee.internal.web.archive.operations;

import java.util.Set;

import org.eclipse.jst.j2ee.application.internal.operations.J2EEComponentExportDataModelProvider;
import org.eclipse.jst.j2ee.internal.earcreation.EARCreationResourceHandler;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.web.datamodel.properties.IWebComponentExportDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;

public class WebComponentExportDataModelProvider extends J2EEComponentExportDataModelProvider implements IWebComponentExportDataModelProperties {

	public WebComponentExportDataModelProvider() {
		super();
	}

	public IDataModelOperation getDefaultOperation() {
		return new WebComponentExportOperation(model);
	}

	public Set getPropertyNames() {
		Set propertyNames = super.getPropertyNames();
		propertyNames.add(EXCLUDE_COMPILE_JSP);
		return propertyNames;
	}

	public Object getDefaultProperty(String propertyName) {
		if (EXCLUDE_COMPILE_JSP.equals(propertyName)) {
			return Boolean.FALSE;
		}
		return super.getDefaultProperty(propertyName);
	}

	protected String getProjectType() {
		return J2EEProjectUtilities.DYNAMIC_WEB;
	}

	protected String getWrongComponentTypeString(String projectName) {
		return EARCreationResourceHandler.getString(EARCreationResourceHandler.NOT_A_WAR, new Object[]{projectName});
	}

	protected String getModuleExtension() {
		return ".war"; //$NON-NLS-1$
	}
	/**
	 * Exports the specified Web Module project to the specified WAR file.
	 * 
	 * @param webProjectName
	 *            The name of the Web Module project to export.
	 * @param warFileName
	 *            The fully qualified WAR file location to export the specified Web Module project.
	 * @param overwriteExisting
	 *            If this is <code>true</code> then an existing file at the location specified by
	 *            <code>earFileName</code> will be overwritten.
	 * @param exportSource
	 *            If this is <code>true</code> then all source files in the specified Web Module
	 *            will be included in the resulting WAR file.
	 * @plannedfor WTP 1.0
	 */
	// TODO: determine plan for new DM Provider
	// public static void exportProject(String webProjectName, String warFileName, boolean
	// overwriteExisting, boolean exportSource) {
	// WebModuleExportDataModel dataModel = new WebModuleExportDataModel();
	// dataModel.setProperty(PROJECT_NAME, webProjectName);
	// dataModel.setBooleanProperty(OVERWRITE_EXISTING, overwriteExisting);
	// dataModel.setProperty(ARCHIVE_DESTINATION, warFileName);
	// dataModel.setBooleanProperty(EXPORT_SOURCE_FILES, exportSource);
	// try {
	// dataModel.getDefaultOperation().run(null);
	// } catch (InvocationTargetException e) {
	// Logger.getLogger().logError(e);
	// } catch (InterruptedException e) {
	// Logger.getLogger().logError(e);
	// }
	// }
}
