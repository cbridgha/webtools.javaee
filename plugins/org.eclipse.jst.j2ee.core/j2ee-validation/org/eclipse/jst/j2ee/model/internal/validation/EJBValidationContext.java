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
package org.eclipse.jst.j2ee.model.internal.validation;


import org.eclipse.jem.util.logger.LogEntry;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.wst.validation.internal.core.Message;
import org.eclipse.wst.validation.internal.core.MessageFilter;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;
import org.eclipse.wst.validation.internal.provisional.core.IValidationContext;
import org.eclipse.wst.validation.internal.provisional.core.IValidator;

/**
 * @version 	1.0
 * @author
 */
public class EJBValidationContext implements IEJBValidationContext {
	private IValidator _validator = null;
	private IValidationContext _helper = null;
	private IReporter _reporter = null;
	private LogEntry logEntry = null;
//	private IMessage _message = null;
	
	public EJBValidationContext(IValidator v, IValidationContext h, IReporter r) {
		setValidator(v);
		setHelper(h);
		setReporter(r);
	}
	
	public IValidator getValidator() {
		return _validator;
	}
	
	public void setValidator(IValidator v) {
		_validator = v;
	}
	
	public IValidationContext getHelper() {
		return _helper;
	}
	
	public void setHelper(IValidationContext h) {
		_helper = h;
	}
	
	public IReporter getReporter() {
		return _reporter;
	}
	
	public void setReporter(IReporter r) {
		_reporter = r;
	}
	
 	/*
 	 * Returns an empty Message which can be reused.
 	 */
 	public IMessage getMessage() {
 		IMessage message = new Message();
 		message.setBundleName(IEJBValidatorConstants.BUNDLE_NAME);
 		return message;
 		/*
 		if(_message == null) {
 			_message = new Message();
 		}
 		
 		reset(_message);
 		_message.setBundleName(IEJBValidatorConstants.BUNDLE_NAME);
 		
		return _message;
		*/
	}
	
		/**
	 * If, for performance reasons, an IMessage is reused instead of creating
	 * a new one each time, this method resets the internal fields to the default.
	 * 
	 * This method should really be on the IMessage implementation itself, but
	 * this'll do for now.
	 */
	protected void reset(IMessage message) {
		message.setId(null);
		message.setParams(null);
		message.setSeverity(MessageFilter.ANY_SEVERITY);
		message.setTargetObject(null);
		message.setBundleName(null);
		message.setGroupName(null);
		message.setLineNo(IMessage.LINENO_UNSET);
		message.setOffset(IMessage.OFFSET_UNSET);
		message.setLength(IMessage.OFFSET_UNSET);
	}
	
	
	
	public Logger getMsgLogger() {
		return Logger.getLogger(IEJBValidatorConstants.J2EE_CORE_PLUGIN);
	}
	
	public LogEntry getLogEntry() {
	    if(logEntry == null)
	        logEntry = new LogEntry(IEJBValidatorConstants.BUNDLE_NAME);
		return logEntry;
	}

	public Object loadModel(String symbolicName) {
		return getHelper().loadModel(symbolicName);
	}
	
	public Object loadModel(String symbolicName, Object[] parms) {
		return getHelper().loadModel(symbolicName, parms);
	}
	
	public void removeAllMessages() {
		getReporter().removeAllMessages(getValidator());
	}
	
	public void removeMessages(Object target) {
		getReporter().removeAllMessages(getValidator(), target);
	}
	
	public void removeMessages(Object target, String groupIdentifier) {
		getReporter().removeMessageSubset(getValidator(), target, groupIdentifier);
	}
	
	public void addMessage(IMessage message) {
		if(message == null) {
			return;
		}
		getReporter().addMessage(getValidator(), message);
	}
	
	public void addMessage(int severity, String messageId) {
		IMessage message = new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId);
		getReporter().addMessage(getValidator(), message);
	}
	
	public void addMessage(int severity, String messageId, String[] parms) {
		IMessage message = new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId,parms);
		getReporter().addMessage(getValidator(), message);
	}
	
	public void addMessage(int severity, String messageId, Object target) {
		IMessage message =  new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId,null,target);
		getReporter().addMessage(getValidator(), message);
	}
	
	public void addMessage(int severity, String messageId, String[] parms, Object target) {
		IMessage message =  new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId,parms,target);
		getReporter().addMessage(getValidator(), message);
	}
	
	public void addMessage(int severity, String messageId, Object target, String groupName) {
		/**
		 * 11/28/05 Commenting the following line to get rid of Warning message
		 * Quite possibly the getRoporter().addMessage needs to be used.
		 * 
		 */
		
		//IMessage message =  new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId,null,target,groupName);
	}
	
	public void addMessage(int severity, String messageId, String[] parms, Object target, String groupName) {
		IMessage message = new Message(IEJBValidatorConstants.BUNDLE_NAME,severity,messageId,parms,target,groupName);
		getReporter().addMessage(getValidator(), message);
	}

	public void terminateIfCancelled() throws ValidationCancelledException {
		if(getReporter().isCancelled()) {
			throw new ValidationCancelledException();
		}
	}

	public void subtask(String messageId) {
		subtask(messageId, null);
	}
	
	public void subtask(String messageId, String[] parms) {
		if((messageId == null) || (messageId.equals(""))) { //$NON-NLS-1$
			return;
		}
		IMessage message = getMessage();
		message.setId(messageId);
		message.setParams(parms);
		getReporter().displaySubtask(getValidator(), message);
	}

	public String[] getURIs() {
		return null;
	}
}
