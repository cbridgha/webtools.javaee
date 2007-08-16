/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.java.init;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jem.java.JavaRefPackage;
import org.eclipse.jem.internal.java.adapters.JavaXMIFactoryImpl;

/**
 * Initialize the Java Reflection mechanisms. 
 */
public class JavaInit {
	protected static boolean initialized = false;
	protected static boolean plugin_initialized = false;

	public static void init() {
		init(true);
	}

	public static void init(boolean shouldPreRegisterPackages) {
		if (!initialized) {
			initialized = true;
			if (shouldPreRegisterPackages) {
				preRegisterPackages();
				setDefaultResourceFactory();
			}
			//Register resource factory
			JavaXMIFactoryImpl.register();
		}
	}

	private static void preRegisterPackages() {
		//ecore
		if (!EPackage.Registry.INSTANCE.containsKey("ecore.xmi")) //$NON-NLS-1$
			EPackage.Registry.INSTANCE.put("ecore.xmi", EcorePackage.eINSTANCE); //$NON-NLS-1$
		//java
		if (!EPackage.Registry.INSTANCE.containsKey("java.xmi")) //$NON-NLS-1$
			EPackage.Registry.INSTANCE.put("java.xmi", JavaRefPackage.eINSTANCE); //$NON-NLS-1$
	}
	protected static void setDefaultResourceFactory() {
		//This is not done outside of Eclipse
		if (Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(Resource.Factory.Registry.DEFAULT_EXTENSION) == null)
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
	}

	public static void setPluginInit(boolean bPluginInit) {
		// Here's where the configuration file would be read.
		plugin_initialized = bPluginInit;
	}

}
