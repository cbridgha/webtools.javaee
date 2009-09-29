/*******************************************************************************
 * Copyright (c) 2001, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Nov 24, 2003
 * 
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.eclipse.jst.j2ee.model.internal.validation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.internal.core.ValidationException;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.validation.internal.provisional.core.IReporter;
import org.eclipse.wst.validation.internal.provisional.core.IValidationContext;
import org.eclipse.wst.validation.internal.provisional.core.IValidatorExtender;
/**
 * @author vijayb
 * 
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public abstract class AbstractEJBValidator extends J2EEValidator implements IValidatorExtender {
	protected Map _validated = null;
	/**
	 *  
	 */
	public AbstractEJBValidator() {
		super();
		_validated = new HashMap();
	}
	
	private Map getValidatedMap(){
		if( _validated == null ){
			_validated = new HashMap();
		}
		return _validated;
	}
	
	protected void logMissingRule(IEJBValidationContext vc, Object ruleId) {
		Logger logger = vc.getMsgLogger();
		if (logger != null && logger.isLoggingLevel(Level.SEVERE)) {
			logger.write(Level.SEVERE, ruleId + " = null"); //$NON-NLS-1$
		}
		addInternalErrorMessage(vc);
	}
	protected void addInternalErrorMessage(IEJBValidationContext vc) {
			addInternalErrorMessage(vc, null);
	}
	
	protected void addInternalErrorMessage(IEJBValidationContext vc, Throwable exc) {
		IMessage mssg = vc.getMessage();
		mssg.setId(internalErrorMessage());
		vc.addMessage(mssg);
		if(exc != null) {
			Logger logger = vc.getMsgLogger();
			if (logger != null && logger.isLoggingLevel(Level.SEVERE)) {
				logger.write(Level.SEVERE, exc);
			}
		}
	}
	
	protected Map removeOldMessages(IEJBValidationContext vc,Map targets) throws ValidationException {
			if(vc.getURIs() == null) {
				// Full validation
				vc.removeAllMessages(); // Remove messages from the EJBJar.
				vc.loadModel(removeOldMessagesString(), new Object[]{vc.getReporter(), null}); // Remove messages from any EJB client JAR files or Java Utility JAR files.
				return null;
			}
			preRemoveOldMessages(vc,targets); // Get the list of targets to be validated, and remove messages from all of them.

			// Remove the messages from all of the changed files and their dependents.
			vc.loadModel(removeOldMessagesString(), new Object[]{vc.getReporter(), targets});
			return targets;
		}
	/**
	 * @param vc
	 * @param delta
	 * @param targets
	 */
	protected void preRemoveOldMessages(IEJBValidationContext vc,Map targets) throws ValidationException {
		//Default
	}
	/**
	 * @return
	 */
	protected String removeOldMessagesString() {
		return null;
	}
	/**
	* @return
	*/
	private String internalErrorMessage() {
			return null;
		}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.validation.internal.core.core.IValidator#validate(org.eclipse.wst.validation.internal.core.core.IHelper,
	 *      org.eclipse.wst.validation.internal.core.core.IReporter,
	 *      org.eclipse.wst.validation.internal.core.core.IFileDelta[])
	 */
	public void validate(IValidationContext helper, IReporter reporter) throws ValidationException {
		//Default
		super.validate(helper, reporter);
	}
	
    public void run(IValidationRule rule, Object targetParent, Object target) throws ValidationException {
    	if(isValidated(rule.getId(), targetParent, target)) {
    		// Whether or not this is a full or incremental run, don't revalidate this target
    		// if it has already been validated. (e.g. if a class is used by more than one bean,
    		// and say one bean is stateless and one is stateful, and everything else about the
    		// beans are identical, don't validate that class again.)
    		return;
    	}
    	
    	try {
    		rule.preValidate(getValidationContext(), targetParent, target);
    		rule.validate(getValidationContext(), targetParent, target);
    		rule.postValidate(getValidationContext(), targetParent, target);
    	}
    	catch(ValidationCancelledException exc) {
    		// Clean up the messages which are on the task list? Or is it nicer to leave them behind?
    	}
    	catch(ValidationException e) {
    		throw e;
    	}
    	catch(Throwable exc) {
    		addInternalErrorMessage(getValidationContext(), exc);
    	}
    	finally {
    		setValidated(rule.getId(), targetParent, target);
    		releaseRules(rule);
    	}
    }

    /**
     * @param rule
     */
    protected abstract void releaseRules(IValidationRule rule); 

    private IEJBValidationContext _vc = null;

    protected IEJBValidationContext getValidationContext() {
    	return _vc;
    }
    protected void setValidationContext(IEJBValidationContext vc) {
    	_vc = vc;
    }
	
	/**
	 *  This class is public only for the EJBHelper.
	 */
	public class TargetObject {
		private Object _parent = null;
		private Object _target = null;
		
		public TargetObject() {
			//Default
		}
		
		public Object getTargetParent() {
			return _parent;
		}
		
		public Object getTarget() {
			return _target;
		}
		
		public void setTargetParent(Object tp) {
			_parent = tp;
		}
		
		public void setTarget(Object t) {
			_target = t;
		}
		
		public int hashCode() {
			int parent = (getTargetParent() == null) ? 0 : getTargetParent().hashCode();
			int target = (getTarget() == null) ? 0 : getTarget().hashCode();
			return parent + target;
		}
		
		public boolean equals(Object o) {
			if(o == null) {
				return false;
			}
			
			if(this == o) {
				return true;
			}
			
			if(!(o instanceof TargetObject)) {
				return false;
			}
			
			Object thisParent = this.getTargetParent();
			Object oParent = ((TargetObject)o).getTargetParent();
			Object thisTarget = this.getTarget();
			Object oTarget = ((TargetObject)o).getTarget();
			
			if((thisParent == null) && (oParent == null)) {
				// check target
			}
			else if((thisParent != null) && (oParent != null)) {
				if(thisParent.equals(oParent)) {
					// check target
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
			
			if((thisTarget == null) && (oTarget == null)) {
				return true;
			}
			else if((thisTarget != null) && (oTarget != null)) {
				return (thisTarget.equals(oTarget));
			}
			else {
				return false;
			}
		}
	}


    public void setValidated(Object key, Object targetParent, Object target) {
    	Set done = null;
    	if(getValidatedMap().containsKey(key)) {
    		done = (Set)getValidatedMap().get(key);
    	}
    	else {
    		done = new HashSet();
    	}
    	
    	done.add(getTargetObjectPool().getTargetObject(targetParent, target));
    	getValidatedMap().put(key, done);
    }


	protected class TargetObjectPool {
		private int _growSize = 0;
		private Vector _pool = null;
		
		public TargetObjectPool(int initialSize) {
			_growSize = initialSize;
			_pool = new Vector(initialSize, _growSize);
			grow();
		}
		
		private void grow() {
			for(int i=0; i<_growSize; i++) {
				_pool.add(new TargetObject());
			}
		}
		
		public TargetObject getTargetObject(Object targetParent, Object target) {
			if(_pool.size() <= 0) {
				grow();
			}
			TargetObject obj = (TargetObject)_pool.remove(0);
			obj.setTargetParent(targetParent);
			obj.setTarget(target);
			return obj;
		}
		
		public void release(TargetObject obj) {
			obj.setTargetParent(null);
			obj.setTarget(null);
			_pool.add(obj);
		}
	}
	
	protected abstract TargetObjectPool getTargetObjectPool();

    public boolean isValidated(Object key, Object targetParent, Object target) {
    	if(!getValidatedMap().containsKey(key)) {
    		return false;
    	}
    
    
    	Set done = (Set)getValidatedMap().get(key);
    	TargetObject temp = getTargetObjectPool().getTargetObject(targetParent, target);
    	try {
    		if(done.contains(temp)) {
    			return true;
    		}
    		
    		return false;
    	}
    	finally {
    		getTargetObjectPool().release(temp);
    	}
    }
    
    public void cleanup(IReporter reporter) {
    	//cleanup has been moved to the validationFinishing method below.  See bugzilla 290581 for details.
    }

	public void validationFinishing(IProject project, ValidationState state, IProgressMonitor monitor) {
		if( _validated != null ){
	    	Iterator iterator = _validated.keySet().iterator();
	    	while(iterator.hasNext()) {
	    		Set done = (Set)_validated.get(iterator.next());
	    		Iterator toIterator = done.iterator();
	    		while(toIterator.hasNext()) {
	    			TargetObject to = (TargetObject)toIterator.next();
	    			getTargetObjectPool().release(to);
	    		}
	    		done.clear();
	    	}
	    	_validated.clear();
	    	_validated = null;
		}
		setValidationContext(null);
	}

}
