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
package org.eclipse.jst.j2ee.web.datamodel.properties;
/**
 * <p>
 * IWebComponentCreationDataModelProperties provides properties to the 
 * WebComponentCreationDataModelProvider as well as all extending interfaces extending 
 * IWebComponentCreationDataModelProperties 
 * @see org.eclipse.jst.j2ee.internal.web.archive.operations.WebComponentCreationDataModelProvider
 * </p>
 * <p>
 * This interface is not intended to be implemented by clients.
 * </p>
 * 
 * @see org.eclipse.wst.common.frameworks.datamodel.IDataModelProvider
 * @see org.eclipse.wst.common.frameworks.datamodel.DataModelFactory
 * @see org.eclipse.wst.common.frameworks.datamodel.IDataModelProperties
 * @see org.eclipse.jst.j2ee.datamodel.properties.IJavaComponentCreationDataModelProperties
 * @see org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentCreationDataModelProperties
 * @plannedfor 1.0
 */
import org.eclipse.jst.j2ee.datamodel.properties.IAddWebComponentToEnterpriseApplicationDataModelProperties;
import org.eclipse.jst.j2ee.datamodel.properties.IJ2EEComponentCreationDataModelProperties;
import org.eclipse.jst.j2ee.web.project.facet.IWebFacetInstallDataModelProperties;
import org.eclipse.wst.common.frameworks.internal.DoNotUseMeThisWillBeDeletedPost15;

/**
 * This has been slated for removal post WTP 1.5. Do not use this class/interface
 * 
 * @deprecated
 * 
 * @see IWebFacetInstallDataModelProperties
 */
public interface IWebComponentCreationDataModelProperties extends IJ2EEComponentCreationDataModelProperties, DoNotUseMeThisWillBeDeletedPost15 {

     /**
     * Required, type String, the user defined name of the context root for the web component
     */
    public static final String CONTEXT_ROOT = IAddWebComponentToEnterpriseApplicationDataModelProperties.CONTEXT_ROOT;

    /**
     * Optional, type String, the user defined name of web contents folder
     */
    public static final String WEBCONTENT_FOLDER = "IWebComponentCreationDataModelProperties.WEBCONTENT_FOLDER";    

}
