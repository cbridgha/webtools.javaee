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
 *  $RCSfile: IDEObjectBeanProxy.java,v $
 *  $Revision: 1.2.4.1 $  $Date: 2004/06/24 18:19:03 $ 
 */

import org.eclipse.jem.internal.proxy.core.*;

public class IDEObjectBeanProxy extends IDEBeanProxy {

	protected IBeanTypeProxy fBeanTypeProxy; // Cache the type proxy for speed
	
protected IDEObjectBeanProxy(IDEProxyFactoryRegistry aRegistry){
	super(aRegistry);
}
/**
 * Constructor that lets the bean type be set on creation.
 * This saves the overhead of it being looked up the first time it is asked for.
 *
 * This is protected because the only person
 * who should use it is the IDEBeanTypeProxy or a subclass.  Making it package protected stops people from
 * writing bogus code and doing casts and slamming new beans in without going through the proper API
 * that is based around any kind of VM artifact being proxied to support target VMs and pluggable JDK
 * levels 
 */
protected IDEObjectBeanProxy(IDEProxyFactoryRegistry aRegistry, Object aBean, IBeanTypeProxy aBeanTypeProxy){
	
	this(aRegistry, aBean);
	fBeanTypeProxy = aBeanTypeProxy;
	
}
/**
 * Set the bean we are proxying.  We are a proxy for a bean running on the same IDE
 * so we hold the bean directly and can return it. 
 */
protected IDEObjectBeanProxy(IDEProxyFactoryRegistry aRegistry, Object aBean){
	this(aRegistry);
	
	fBean = aBean;
	
}
/**
 * The type proxy is got from our class name
 * If we have the type return it, otherwise go the factory for it
 * Don't new it up because the factory must be responsible for creating type proxies as it
 * has to perform instance management on them
 */
public IBeanTypeProxy getTypeProxy() {

	if ( fBeanTypeProxy == null ) {	
		fBeanTypeProxy = fProxyFactoryRegistry.getBeanTypeProxyFactory().getBeanTypeProxy( fBean.getClass().getName() );
	}
	return fBeanTypeProxy;
}
}
