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
package org.eclipse.jst.j2ee.applicationclient.internal.creation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jst.common.project.facet.IJavaFacetInstallDataModelProperties;
import org.eclipse.jst.common.project.facet.JavaFacetInstallDataModelProvider;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.project.facet.AppClientFacetInstallDataModelProvider;
import org.eclipse.jst.j2ee.project.facet.IJ2EEModuleFacetInstallDataModelProperties;
import org.eclipse.jst.j2ee.project.facet.J2EEFacetProjectCreationDataModelProvider;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.frameworks.datamodel.DataModelEvent;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelListener;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;
import org.eclipse.wst.project.facet.ProductManager;

public class AppClientFacetProjectCreationDataModelProvider extends J2EEFacetProjectCreationDataModelProvider {

	public AppClientFacetProjectCreationDataModelProvider() {
		super();
	}
	
	public void init() {
		super.init();
		FacetDataModelMap map = (FacetDataModelMap) getProperty(FACET_DM_MAP);
		IDataModel javaFacet = DataModelFactory.createDataModel(new JavaFacetInstallDataModelProvider());
		map.add(javaFacet);
		IDataModel appClientFacet = DataModelFactory.createDataModel(new AppClientFacetInstallDataModelProvider());
		map.add(appClientFacet);
		String appClientRoot = appClientFacet.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER);
		javaFacet.setProperty(IJavaFacetInstallDataModelProperties.SOURCE_FOLDER_NAME, appClientRoot);
		// If using optimized single root structure, set the output folder to the content root
		if (ProductManager.shouldUseSingleRootStructure())
			javaFacet.setProperty(IJavaFacetInstallDataModelProperties.DEFAULT_OUTPUT_FOLDER_NAME, appClientRoot);
		appClientFacet.addListener(new IDataModelListener() {
			public void propertyChanged(DataModelEvent event) {
				if (IJ2EEModuleFacetInstallDataModelProperties.EAR_PROJECT_NAME.equals(event.getPropertyName())) {
					if (isPropertySet(EAR_PROJECT_NAME))
						setProperty(EAR_PROJECT_NAME, (String)event.getProperty());
					else
						model.notifyPropertyChange(EAR_PROJECT_NAME, IDataModel.DEFAULT_CHG);
				}else if (IJ2EEModuleFacetInstallDataModelProperties.ADD_TO_EAR.equals(event.getPropertyName())) {
					setProperty(ADD_TO_EAR, event.getProperty());
				}
			}
		});	
		
		Collection requiredFacets = new ArrayList();
		requiredFacets.add(ProjectFacetsManager.getProjectFacet(javaFacet.getStringProperty(IFacetDataModelProperties.FACET_ID)));
		requiredFacets.add(ProjectFacetsManager.getProjectFacet(appClientFacet.getStringProperty(IFacetDataModelProperties.FACET_ID)));
		setProperty(REQUIRED_FACETS_COLLECTION, requiredFacets);
	}
	
	public boolean propertySet(String propertyName, Object propertyValue) {
		if( propertyName.equals( MODULE_URI )){
			FacetDataModelMap map = (FacetDataModelMap) getProperty(FACET_DM_MAP);
			IDataModel appFacet = map.getFacetDataModel( J2EEProjectUtilities.APPLICATION_CLIENT );	
			appFacet.setProperty( IJ2EEModuleFacetInstallDataModelProperties.MODULE_URI, propertyValue );
		}
		return super.propertySet(propertyName, propertyValue);
	}		
}
