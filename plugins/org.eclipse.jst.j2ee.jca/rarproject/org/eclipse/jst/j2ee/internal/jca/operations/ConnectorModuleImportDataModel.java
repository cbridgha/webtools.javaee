/***************************************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 **************************************************************************************************/
package org.eclipse.jst.j2ee.internal.jca.operations;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jst.j2ee.application.operations.J2EEArtifactCreationDataModelOld;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationDataModelOld;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleImportDataModel;
import org.eclipse.jst.j2ee.common.XMLResource;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchiveFactory;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.OpenFailureException;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.wst.common.frameworks.operations.WTPOperation;

import com.ibm.wtp.common.logger.proxy.Logger;

/**
 * This dataModel is used for to import Connector Modules (from RAR files) into the workspace.
 * 
 * This class (and all its fields and methods) is likely to change during the WTP 1.0 milestones as
 * the new project structures are adopted. Use at your own risk.
 * 
 * @since WTP 1.0
 */
public final class ConnectorModuleImportDataModel extends J2EEModuleImportDataModel {

	/**
	 * Imports the specified RAR file into the specified Connector Module project.
	 * 
	 * @param rarFileName
	 *            The path to the RAR file.
	 * @param connectorProjectName
	 *            The name of the Connector project where the Connector Module should be imported.
	 * @param addToEar
	 *            If this is <code>true</code> then Connector project specified by
	 *            <code>connectorProjectName</code> will be added to the Enterprise Application
	 *            project specified by <code>earProjectName</code>.
	 * @param earProjectName
	 *            The name of the Enterprise Application project to add the specified Connector
	 *            project to. This field is only relevant if <code>addToEar</code> is set to
	 *            <code>true</code>. If this is set to <code>null</code> then a default name
	 *            computed from the <code>connectorProjectName</code> will be used.
	 * @since WTP 1.0
	 */
	public static void importArchive(String rarFileName, String connectorProjectName, boolean addToEar, String earProjectName) {
		ConnectorModuleImportDataModel dataModel = new ConnectorModuleImportDataModel();
		dataModel.setProperty(FILE_NAME, rarFileName);
		dataModel.setProperty(PROJECT_NAME, connectorProjectName);
		dataModel.setBooleanProperty(ADD_TO_EAR, addToEar);
		if (earProjectName != null) {
			dataModel.setProperty(EAR_PROJECT, earProjectName);
		}
		try {
			dataModel.getDefaultOperation().run(null);
		} catch (InvocationTargetException e) {
			Logger.getLogger().logError(e);
		} catch (InterruptedException e) {
			Logger.getLogger().logError(e);
		}
	}

	protected void init() {
		super.init();
		setIntProperty(J2EEModuleCreationDataModelOld.J2EE_VERSION, J2EEVersionConstants.J2EE_1_3_ID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.internal.internal.application.operations.J2EEImportDataModel#createJ2EEProjectCreationDataModel()
	 */
	protected J2EEArtifactCreationDataModelOld createJ2EEProjectCreationDataModel() {
		return new ConnectorModuleCreationDataModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.internal.internal.application.operations.J2EEImportDataModel#getType()
	 */
	protected int getType() {
		return XMLResource.RAR_TYPE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.internal.internal.application.operations.J2EEImportDataModel#setUpArchiveFile()
	 */
	protected boolean openArchive(String uri) throws OpenFailureException {
		setArchiveFile(CommonarchiveFactory.eINSTANCE.openRARFile(getArchiveOptions(), uri));
		if (getArchiveFile() == null)
			return false;
		return true;
	}

	protected boolean doSetProperty(String propertyName, Object propertyValue) {
		if (propertyName.equals(PRESERVE_PROJECT_METADATA) && ((Boolean) propertyValue).booleanValue()) {
			setBooleanProperty(propertyName, false);
			return true;
		}
		return super.doSetProperty(propertyName, propertyValue);
	}

	public WTPOperation getDefaultOperation() {
		return new ConnectorModuleImportOperation(this);
	}
}