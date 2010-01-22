/*******************************************************************************
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Mar 29, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package org.eclipse.jst.j2ee.internal.deploy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jem.util.RegistryReader;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;

/**
 * @author cbridgha
 * 
 * To change the template for this generated type comment go to Window - Preferences - Java - Code
 * Generation - Code and Comments
 */
public class DeployerRegistryReader extends RegistryReader {
	/**
	 * @param registry
	 * @param plugin
	 * @param extensionPoint
	 */
	static final String J2EE_DEPLOYER_EXTENSION_POINT = "DeployerExtension"; //$NON-NLS-1$
	static final String TARGET_SERVER_RUNTIME_ID = "runtime_server_id"; //$NON-NLS-1$
	static final String RUNTIME = "runtime"; //$NON-NLS-1$
	static final String DEPLOYER = "deployer"; //$NON-NLS-1$
	public static final String DEPLOYER_CLASS = "deployer_class"; //$NON-NLS-1$
	static final String MODULE_TYPE_NATURE_ID = "module_nature_id"; //$NON-NLS-1$
	static final String NATURE = "nature"; //$NON-NLS-1$
	static final String COMPONENT_TYPE_ID = "component_type"; //$NON-NLS-1$
	static final String COMPONENT = "component"; //$NON-NLS-1$
	static final String FACET_EXCLUSIONS = "facetExclusions"; //$NON-NLS-1$
	static final String FACET_ID = "facet_id"; //$NON-NLS-1$

	public DeployerRegistryReader() {
		super(J2EEPlugin.PLUGIN_ID, J2EE_DEPLOYER_EXTENSION_POINT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.wst.common.frameworks.internal.RegistryReader#readElement(org.eclipse.core.runtime.IConfigurationElement)
	 */
	public boolean readElement(IConfigurationElement element) {
		if (!element.getName().equals(DEPLOYER))
			return false;
		List runtimeList = new ArrayList();
		List natureandcomponents = new ArrayList();
		List facetExclusions = new ArrayList();
		IConfigurationElement[] runtimes = element.getChildren(RUNTIME);
		for (int i = 0; i < runtimes.length; i++) {
			IConfigurationElement runtime = runtimes[i];
			String serverTarget = runtime.getAttribute(TARGET_SERVER_RUNTIME_ID);
			runtimeList.add(serverTarget);
		}
		IConfigurationElement[] natures = element.getChildren(NATURE);
		for (int i = 0; i < natures.length; i++) {
			IConfigurationElement nature = natures[i];
			String natureID = nature.getAttribute(MODULE_TYPE_NATURE_ID);
			natureandcomponents.add(natureID);
		}
		IConfigurationElement[] components = element.getChildren(COMPONENT);
		for (int i = 0; i < components.length; i++) {
			IConfigurationElement component = components[i];
			String compType = component.getAttribute(COMPONENT_TYPE_ID);
			natureandcomponents.add(compType);
		}
		IConfigurationElement[] exclusions = element.getChildren(FACET_EXCLUSIONS);
		for (int i = 0; i < exclusions.length; i++) {
			IConfigurationElement exclusion = exclusions[i];
			String compType = exclusion.getAttribute(FACET_ID);
			facetExclusions.add(compType);
		}

		String deployer = element.getAttribute(DEPLOYER_CLASS);
		if (deployer != null) {
			DeployerRegistry.instance().register(element, runtimeList, natureandcomponents,facetExclusions);
			return true;
		}
		return false;
	}

}
