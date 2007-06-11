/*******************************************************************************
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.web.archive.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jst.j2ee.application.internal.operations.J2EEComponentImportDataModelProvider;
import org.eclipse.jst.j2ee.application.internal.operations.J2EEUtilityJarImportDataModelProvider;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchiveFactory;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.OpenFailureException;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.jst.j2ee.internal.archive.ArchiveWrapper;
import org.eclipse.jst.j2ee.internal.common.J2EEVersionUtil;
import org.eclipse.jst.j2ee.internal.common.XMLResource;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.web.datamodel.properties.IWebComponentImportDataModelProperties;
import org.eclipse.jst.j2ee.web.project.facet.IWebFacetInstallDataModelProperties;
import org.eclipse.jst.jee.util.internal.JavaEEQuickPeek;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties.FacetDataModelMap;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.frameworks.internal.plugin.WTPCommonPlugin;

/**
 * This dataModel is used for to import Web Modules (from WAR files) into the workspace.
 * 
 * This class (and all its fields and methods) is likely to change during the WTP 1.0 milestones as
 * the new project structures are adopted. Use at your own risk.
 * 
 * @plannedfor WTP 1.0
 */
public final class WebComponentImportDataModelProvider extends J2EEComponentImportDataModelProvider implements IWebComponentImportDataModelProperties {

	public Set getPropertyNames() {
		Set propertyNames = super.getPropertyNames();
		propertyNames.add(WEB_LIB_MODELS);
		propertyNames.add(WEB_LIB_ARCHIVES_SELECTED);
		propertyNames.add(CONTEXT_ROOT);
		return propertyNames;
	}

	public Object getDefaultProperty(String propertyName) {
		if (propertyName.equals(WEB_LIB_MODELS) || propertyName.equals(WEB_LIB_ARCHIVES_SELECTED)) {
			return Collections.EMPTY_LIST;
		}
		return super.getDefaultProperty(propertyName);
	}

	protected int getType() {
		return XMLResource.WEB_APP_TYPE;
	}
	
	protected void handleUnknownType(JavaEEQuickPeek jqp) {
		jqp.setType(J2EEVersionConstants.WEB_TYPE);
		jqp.setVersion(J2EEVersionConstants.WEB_2_5_ID);
		jqp.setJavaEEVersion(J2EEVersionConstants.JEE_5_0_ID);
	}


	protected IStatus validateModuleType() {
		if (getArchiveWrapper().getJavaEEQuickPeek().getType() == J2EEConstants.WEB_TYPE)
			return OK_STATUS;

		// TODO: STRING MOVE
		return WTPCommonPlugin.createErrorStatus(WTPCommonPlugin.getResourceString("Temp String for none WARFile")); //$NON-NLS-1$);
	}

	public boolean propertySet(String propertyName, Object propertyValue) {
		super.propertySet(propertyName, propertyValue);
		if (propertyName.equals(ARCHIVE_WRAPPER)) {
			
			IDataModel moduleDM = model.getNestedModel(NESTED_MODEL_J2EE_COMPONENT_CREATION);
			if (getArchiveWrapper() != null) {
				
				FacetDataModelMap map = (FacetDataModelMap) moduleDM.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
				IDataModel webFacetDataModel = map.getFacetDataModel( J2EEProjectUtilities.DYNAMIC_WEB );
				
				int version = getModuleSpecVersion();
				String versionText = J2EEVersionUtil.getServletTextVersion( version );
				webFacetDataModel.setStringProperty(IFacetDataModelProperties.FACET_VERSION_STR, versionText);
				updateJavaFacetVersion();
				model.notifyPropertyChange(PROJECT_NAME, IDataModel.VALID_VALUES_CHG);
			}			
			
			ArchiveWrapper archiveWrapper = (ArchiveWrapper) propertyValue;
			if (null != archiveWrapper) {
				List <ArchiveWrapper> libs = archiveWrapper.getWebLibs();
				List nestedModels = new ArrayList();
				for (int i = 0; i < libs.size(); i++) {
					IDataModel localModel = DataModelFactory.createDataModel(new J2EEUtilityJarImportDataModelProvider());
					localModel.setProperty(ARCHIVE_WRAPPER, libs.get(i));
					localModel.setProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME, getProperty(IFacetProjectCreationDataModelProperties.FACET_RUNTIME));
					nestedModels.add(localModel);
				}
				setProperty(WEB_LIB_MODELS, nestedModels);
			}
		}else if(propertyName.equals(CONTEXT_ROOT)){
			IDataModel creationModel = model.getNestedModel(NESTED_MODEL_J2EE_COMPONENT_CREATION);
			FacetDataModelMap map = (FacetDataModelMap) creationModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
			IDataModel webFacetDataModel = map.getFacetDataModel( J2EEProjectUtilities.DYNAMIC_WEB );
			webFacetDataModel.setStringProperty(IWebFacetInstallDataModelProperties.CONTEXT_ROOT, (String)propertyValue);
		}
		return true;
	}

	protected Archive openArchive(String uri) throws OpenFailureException {
		Archive archive = CommonarchiveFactory.eINSTANCE.openWARFile(getArchiveOptions(), uri);
		return archive;
	}

	protected IDataModel createJ2EEComponentCreationDataModel() {
		return DataModelFactory.createDataModel(new WebFacetProjectCreationDataModelProvider());
	}

	public IDataModelOperation getDefaultOperation() {
		return new WebComponentImportOperation(model);
	}

}