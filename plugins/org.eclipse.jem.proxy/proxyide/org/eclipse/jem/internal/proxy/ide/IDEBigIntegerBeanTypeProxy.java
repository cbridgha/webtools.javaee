/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.proxy.ide;
/*
 *  $RCSfile: IDEBigIntegerBeanTypeProxy.java,v $
 *  $Revision: 1.2.4.1 $  $Date: 2004/06/24 18:19:03 $ 
 */

import org.eclipse.jem.internal.proxy.core.*;
import java.math.*;
/**
 * IDE Implementation of IIntegerBeanTypeProxy
 */
final class IDEBigIntegerBeanTypeProxy extends IDENumberBeanTypeProxy {
// Some values are cache'd for speed
IDEBigIntegerBeanTypeProxy(IDEProxyFactoryRegistry aRegistry, Class aClass) {
	super(aRegistry, aClass, new BigInteger("0")); //$NON-NLS-1$
}
/**
 * Static helper to create a bean proxy
 * Package protected because everyone should go through the factory API
 * that is defined as part of IBeanProxyFactory
 */
INumberBeanProxy createBigIntegerBeanProxy(BigInteger aBigInteger) {
	if ( aBigInteger == null || aBigInteger.intValue() == 0 ) {
		return zeroProxy;
	} else {
		return new IDENumberBeanProxy(fProxyFactoryRegistry,aBigInteger,this);
	}
}
}

