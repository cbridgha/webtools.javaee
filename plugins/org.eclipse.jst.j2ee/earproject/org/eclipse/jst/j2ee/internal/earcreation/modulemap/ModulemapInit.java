/***************************************************************************************************
 * Copyright (c) 2003, 2004 IBM Corporation and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 **************************************************************************************************/
package org.eclipse.jst.j2ee.internal.earcreation.modulemap;


import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.earcreation.EAREditModel;
import org.eclipse.wst.common.internal.emf.utilities.ExtendedEcoreUtil;
import org.eclipse.wst.common.internal.emf.utilities.ResourceDependencyRegister;


public class ModulemapInit {
	protected static boolean initialized = false;

	public static void init() {
		init(true);
	}

	public static void init(boolean shouldPreRegisterPackages) {
		if (!initialized) {
			initialized = true;
			invokePrereqInits(shouldPreRegisterPackages);
			if (shouldPreRegisterPackages) {
				ExtendedEcoreUtil.preRegisterPackage("modulemap.xmi", new EPackage.Descriptor() { //$NON-NLS-1$
								public EPackage getEPackage() {
									return ModulemapPackage.eINSTANCE;
								}
							});
			}
			ResourceDependencyRegister.registerDependency(J2EEConstants.APPLICATION_DD_URI_OBJ, EAREditModel.MODULE_MAP_URI_OBJ);
		}
	}

	public static void invokePrereqInits(boolean shouldPreRegisterPackages) {
		//TODO Should remove....
		//com.ibm.ejs.models.base.extensions.init.ExtensionsInit.init(shouldPreRegisterPackages);
	}
}