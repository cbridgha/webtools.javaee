package org.eclipse.jst.j2ee.application.operations;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.jst.j2ee.internal.modulecore.util.EARArtifactEditOperationDataModel;
import org.eclipse.wst.common.frameworks.operations.WTPOperation;

public class AddComponentToEnterpriseApplicationDataModel extends EARArtifactEditOperationDataModel {
	//Used for adding module components to an Enterprise Application during EAR component creation
	public static final String MODULE_LIST = "AddComponentToEnterpriseApplicationDataModel.MODULE_LIST"; //$NON-NLS-1$
	
	public static final String EAR_MODULE_NAME = "AddComponentToEnterpriseApplicationDataModel.EAR_MODULE_NAME";
	//Used for adding module componenet to Enterprise Application during module creation
	public static final String ARCHIVE_MODULE = "AddComponentToEnterpriseApplicationDataModel.ARCHIVE_PROJECT"; //$NON-NLS-1$

	public AddComponentToEnterpriseApplicationDataModel() {
		super();
		
	}
	protected void initValidBaseProperties() {
		super.initValidBaseProperties();
		addValidBaseProperty(MODULE_LIST);
		addValidBaseProperty(EAR_MODULE_NAME);
		addValidBaseProperty(ARCHIVE_MODULE);
	}
	
	public WTPOperation getDefaultOperation() {
		return new AddComponentToEnterpriseApplicationOperation(this);
	}
	
	protected Object getDefaultProperty(String propertyName) {
	if (propertyName.equals(MODULE_LIST) ) 
			return new ArrayList();
	 return super.getDefaultProperty(propertyName);
	}

}
