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
package org.eclipse.jem.internal.proxy.core;
/*
 *  $RCSfile: IBeanTypeProxy.java,v $
 *  $Revision: 1.2.2.1 $  $Date: 2004/06/24 18:19:03 $ 
 */


/**
 * A proxy for a BeanType (i.e. Java type/class).
 * Creation date: (12/3/99 11:38:06 AM)
 * @author: Joe Winchester
 */
public interface IBeanTypeProxy extends IBeanProxy {
/**
 * Return the constructor proxy on the receiver with the specified arguments
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IConstructorProxy getConstructorProxy(String[] argumentClassNames);
/**
 * Return the constructor proxy on the receiver with the specified types
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IConstructorProxy getConstructorProxy(IBeanTypeProxy[] argumentTypes);
/**
 * Return the fieldproxy on the receiver with the specified  name
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IFieldProxy getFieldProxy(String fieldName);
/**
 * Return the declared fieldproxy on the receiver with the specified  name
 */
public IFieldProxy getDeclaredFieldProxy(String fieldName);

/**
 * Return the method proxy on the receiver with the specified  name and no arguments
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IMethodProxy getMethodProxy(String methodName);
/**
 * Return the method proxy on the receiver with the qualified class names as string arguments
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IMethodProxy getMethodProxy(String methodName, String[] argumentClassNames);
/**
 * Return the method proxy on the receiver with the specified  name and one argument
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IMethodProxy getMethodProxy(String methodName, String argumentClassName);
/**
 * Return the method proxy on the receiver with the beanTypes as arguments
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IMethodProxy getMethodProxy(String methodName, IBeanTypeProxy[] argumentTypes);

/**
 * Return the constructor proxy on the receiver with no arguments
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IConstructorProxy getNullConstructorProxy();

/**
 * Return the Proxy Factory Registry so that users of this
 * instance can get to the correct factories for this type.
 * Creation date: (3/13/00 4:53:25 PM)
 * @return org.eclipse.jem.internal.proxy.core.ProxyFactoryRegistry
 */
ProxyFactoryRegistry getProxyFactoryRegistry();
/**
 * Answer the type proxy for the superclass
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IBeanTypeProxy getSuperBeanTypeProxy();
/**
 * Answer the name of the type we are proxying
 * This is the fully qualified name.
 * For arrays it will return the format: [Lclassname;
 * Creation date: (12/3/99 2:25:07 PM)
 */
public String getTypeName();

/**
 * Answer the formal format type name. For normal classes, this 
 * just the same as getTypeName(), but for arrays, it is
 * of the format classname[]
 */
public String getFormalTypeName();
/**
 * Answer a boolean as to whether we are an array type.
 */
public boolean isArray();
/**
 * Answer a boolean as to whether we are a type or an interface
 * Creation date: (12/3/99 2:25:07 PM)
 */
public boolean isInterface();
/**
 * Answer a boolean as to whether we are a primitive or not.
 */
public boolean isPrimitive();
/**
 * Answer a boolean as to whether we are a kind of the argument
 * We can either be it, inherit from it, or implement it
 */
public boolean isKindOf(IBeanTypeProxy aBeanProxyType);
/**
 * Return a new instance
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IBeanProxy newInstance() throws ThrowableProxy;
/**
 * Return a new instance of this type using the initialization string to
 * create the proxy. ClassCastException is thrown if the initstring doesn't
 * result in an object compatible with this type. InstantiationException is
 * thrown when the initialization string cannot be parsed correctly.
 * Creation date: (12/3/99 2:25:07 PM)
 */
public IBeanProxy newInstance(String initializationString) throws ThrowableProxy, ClassCastException, InstantiationException;

/**
 * Return the exception message that happened when trying to find this bean type.
 * Class not found is not such an exception. In that case the bean type will be returned as a null instead.
 * An example of such is an initialization error during loading the class, i.e. it was found but some static failed to initialize.
 * 
 * Return null if there is no initialization error.
 */
public String getInitializationError();
}
