/***************************************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 **************************************************************************************************/
/*
 * Created on Sep 29, 2003
 * 
 * To change the template for this generated file go to Window&gt;Preferences&gt;Java&gt;Code
 * Generation&gt;Code and Comments
 */
package org.eclipse.jst.j2ee.jca.plugin;

import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationDataModel;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationOperation;
import org.eclipse.jst.j2ee.application.operations.J2EEModuleImportDataModel;
import org.eclipse.jst.j2ee.internal.earcreation.UpdateModuleReferencesInEARProjectCommand;
import org.eclipse.jst.j2ee.internal.jca.operations.ConnectorProjectCreationDataModel;
import org.eclipse.jst.j2ee.internal.jca.operations.ConnectorProjectCreationOperation;
import org.eclipse.jst.j2ee.internal.jca.operations.RARImportDataModel;
import org.eclipse.jst.j2ee.internal.project.IConnectorNatureConstants;
import org.eclipse.jst.j2ee.internal.project.J2EENature;
import org.eclipse.jst.j2ee.moduleextension.EarModuleExtensionImpl;
import org.eclipse.jst.j2ee.moduleextension.JcaModuleExtension;


public class JcaModuleExtensionImpl extends EarModuleExtensionImpl implements JcaModuleExtension {

	/**
	 *  
	 */
	public JcaModuleExtensionImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.JcaModuleExtension#initializeEjbReferencesToModule(org.eclipse.jst.j2ee.j2eeproject.J2EENature,
	 *      org.eclipse.jst.j2ee.internal.earcreation.UpdateModuleReferencesInEARProjectCommand)
	 */
	public void initializeEjbReferencesToModule(J2EENature moduleNature, UpdateModuleReferencesInEARProjectCommand cmd) {
		//no references to EJBs
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.JcaModuleExtension#createProjectInfo()
	 */
	//	public J2EEJavaProjectInfo createProjectInfo() {
	//		return new ConnectorProjectInfo();
	//	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.JcaModuleExtension#createImportOperation(org.eclipse.core.resources.IProject,
	 *      org.eclipse.jst.j2ee.commonarchivecore.RARFile)
	 */
	//	public J2EEImportOperation createImportOperation(IProject proj, RARFile rarFile){
	//		return new RARImportOperation(proj, rarFile);
	//	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.EarModuleExtension#getNatureID()
	 */
	public String getNatureID() {
		return IConnectorNatureConstants.NATURE_ID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.EarModuleExtension#createProjectCreationOperation(org.eclipse.jst.j2ee.application.operations.J2EEModuleCreationDataModel)
	 */
	public J2EEModuleCreationOperation createProjectCreationOperation(J2EEModuleCreationDataModel dataModel) {
		return new ConnectorProjectCreationOperation((ConnectorProjectCreationDataModel) dataModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.EarModuleExtension#createProjectDataModel()
	 */
	public J2EEModuleCreationDataModel createProjectDataModel() {
		return new ConnectorProjectCreationDataModel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jst.j2ee.moduleextension.EarModuleExtension#createImportDataModel()
	 */
	public J2EEModuleImportDataModel createImportDataModel() {
		return new RARImportDataModel();
	}
}