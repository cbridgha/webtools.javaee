/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
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

import org.eclipse.jst.j2ee.commonarchivecore.internal.RARFile;
import org.eclipse.jst.j2ee.jca.Connector;
import org.eclipse.wst.validation.core.IFileDelta;
import org.eclipse.wst.validation.core.IHelper;
import org.eclipse.wst.validation.core.IMessage;
import org.eclipse.wst.validation.core.IReporter;
import org.eclipse.wst.validation.core.ValidationException;
import org.eclispe.wst.validation.internal.core.Message;


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
		public void validate(IHelper inHelper, IReporter inReporter,IFileDelta[] changedFiles)
		throws ValidationException {
			super.validate(inHelper, inReporter, changedFiles);
			try {
				setRarFile( (RARFile) inHelper.loadModel(CONNECTOR_MODEL_NAME));
				if ( rarFile != null ) {
					setConnectorDD( rarFile.getDeploymentDescriptor() );
				} else {
					IMessage errorMsg = new Message(getBaseName(), IMessage.HIGH_SEVERITY, ERROR_INVALID_CONNECTOR_FILE);
					throw new ValidationException(errorMsg);
				}// if
			} catch (ValidationException ex) {
				throw ex;
			} catch (Exception e) {
				IMessage errorMsg = new Message(getBaseName(), IMessage.HIGH_SEVERITY, ERROR_CONNECTOR_VALIDATION_FAILED);
				throw new ValidationException(errorMsg, e);
			}// try 
		}// validate
		

}
