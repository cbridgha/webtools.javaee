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

import org.eclipse.jem.java.Field;
import org.eclipse.jem.java.JavaClass;
import org.eclipse.jem.java.JavaHelpers;
import org.eclipse.jst.j2ee.ejb.EnterpriseBean;
import org.eclipse.wst.validation.internal.core.ValidationException;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;


/**
 */
public abstract class ASessionBeanClassVRule extends ABeanClassVRule {
	public final void validateTransientField(IEJBValidationContext vc, EnterpriseBean bean, JavaClass clazz, Field field) throws ValidationCancelledException, InvalidInputException, ValidationException {
		if(field.isTransient()) {
			// IWAD4025 = Transient fields are discouraged. Read section 7.4.1 of the EJB 2.0 specification.
			IMessage message = MessageUtility.getUtility().getMessage(vc, IMessagePrefixEjb20Constants.CHKJ2453, IEJBValidationContext.INFO, bean, clazz, field, this);		
			vc.addMessage(message);
			
			JavaHelpers javaxEjbSessionContext = ValidationRuleUtility.getType(ITypeConstants.CLASSNAME_JAVAX_EJB_SESSIONCONTEXT, bean);
			JavaHelpers javaxTransactionUsertransaction = ValidationRuleUtility.getType(ITypeConstants.CLASSNAME_JAVAX_TRANSACTION_USERTRANSACTION, bean);
			JavaHelpers javaxNamingContext = ValidationRuleUtility.getType(ITypeConstants.CLASSNAME_JAVAX_NAMING_CONTEXT, bean);
			if(ValidationRuleUtility.isAssignableFrom(ValidationRuleUtility.getType(field), javaxEjbSessionContext) ||
				ValidationRuleUtility.isAssignableFrom(ValidationRuleUtility.getType(field), javaxTransactionUsertransaction) ||
				ValidationRuleUtility.isLocalType(bean, ValidationRuleUtility.getType(field)) ||
				//ValidationRuleUtility.isJNDINamingContext(field))
				ValidationRuleUtility.isAssignableFrom(ValidationRuleUtility.getType(field), javaxNamingContext))
			{
				// IWAD4024 = A transient field should not be the {0} type. Read section 7.4.1 of the EJB 2.0 specification.
				message = MessageUtility.getUtility().getMessage(vc, IMessagePrefixEjb20Constants.CHKJ2452, IEJBValidationContext.WARNING, bean, clazz, field, this);		
				vc.addMessage(message);
			}
		}
	}
}
