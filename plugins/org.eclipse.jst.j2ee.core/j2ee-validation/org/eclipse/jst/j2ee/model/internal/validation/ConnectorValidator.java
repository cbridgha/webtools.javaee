/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Jan 22, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package org.eclipse.jst.j2ee.model.internal.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jst.j2ee.commonarchivecore.internal.RARFile;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.jst.j2ee.jca.Connector;
import org.eclipse.wst.validation.internal.core.Message;
import org.eclipse.wst.validation.internal.core.ValidationException;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;
import org.eclipse.wst.validation.internal.provisional.core.IValidationContext;


/**
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class ConnectorValidator extends J2EEValidator implements ConnectorMessageConstants {
	protected RARFile rarFile;
	protected Connector connectorDD;
	/**
	 * 
	 */
	public ConnectorValidator() {
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jst.j2ee.internal.model.validation.J2EEValidator#getBaseName()
	 */
	public String getBaseName() {
		return "rarvalidation"; //$NON-NLS-1$
	}
	/**
	 * @return Returns the connectorDD.
	 */
	protected Connector getConnectorDD() {
		return connectorDD;
	}

	/**
	 * @param connectorDD The connectorDD to set.
	 */
	protected void setConnectorDD(Connector connectorDD) {
		this.connectorDD = connectorDD;
	}

	/**
	 * @return Returns the rarFile.
	 */
	protected RARFile getRarFile() {
		return rarFile;
	}

	/**
	 * @param rarFile The rarFile to set.
	 */
	protected void setRarFile(RARFile rarFile) {
		this.rarFile = rarFile;
	}
		
	/**
	 * Does the validation.
	 * 
	 * @throws ValidationException
	 */
	public void validate(IValidationContext inHelper, IReporter inReporter) throws ValidationException {
		validateInJob(inHelper, inReporter);		
	}	

	protected void validateJ2EE14DocType() {
	
		if ( getConnectorDD().getVersionID() < J2EEVersionConstants.JCA_1_5_ID) {
			String[] params = new String[3];
			params[0] = DOCTYPE_1_4;
			//params[1] = helper.getProject().getName();
			params[2] = DOCTYPE_1_3;
			addError(getBaseName(), CONNECTOR_INVALID_DOC_TYPE_ERROR_, params);
		} else if (getConnectorDD().getVersionID() != J2EEVersionConstants.JCA_1_0_ID) {
			String[] params = new String[3];
			params[0] = DOCTYPE_1_3;
			//params[1] = helper.getProject().getName();
			params[2] = DOCTYPE_1_4;
			addError(getBaseName(), CONNECTOR_INVALID_DOC_TYPE_ERROR_, params);
		}// if
	}// validateDocTypeVsNature
	
	public ISchedulingRule getSchedulingRule(IValidationContext helper) {
		return null;
	}
	
	public IStatus validateInJob(IValidationContext helper, IReporter reporter) throws ValidationException{
	
		super.validateInJob(helper, reporter);
		
		// First remove all previous msg. for this project
		_reporter.removeAllMessages(this, null); // Note the WarHelper will return web.xml with a null object as well
	
		try {
			setRarFile((RARFile) helper.loadModel(CONNECTOR_MODEL_NAME));
			if (rarFile != null) {
				setConnectorDD( rarFile.getDeploymentDescriptor() );
				//validateJ2EE14DocType();
			} else {
				IMessage errorMsg = new Message(getBaseName(), IMessage.HIGH_SEVERITY, ERROR_INVALID_CONNECTOR_FILE);
				throw new ValidationException(errorMsg);
			}
	
		} catch (ValidationException ex) {
			throw ex;
		} catch (Exception e) {
			IMessage errorMsg = new Message(getBaseName(), IMessage.HIGH_SEVERITY, ERROR_CONNECTOR_VALIDATION_FAILED);
			throw new ValidationException(errorMsg, e);
		}
		return status;		
	}

	public void cleanup(IReporter reporter) {
		rarFile = null;
		connectorDD = null;
		super.cleanup(reporter);
	}	
}
