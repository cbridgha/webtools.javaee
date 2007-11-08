/*******************************************************************************
 * Copyright (c) 2003, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.web.internal.operation;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.wst.common.frameworks.internal.DoNotUseMeThisWillBeDeletedPost15;
import org.eclipse.wst.web.internal.ISimpleWebModuleConstants;

/**
 * This has been slated for removal post WTP 1.5. Do not use this class/interface/method/field
 * 
 * @deprecated
 * 
 */
public class LibModule implements ILibModule, DoNotUseMeThisWillBeDeletedPost15 {
	protected static final IPath LIB_PATH = new Path(ISimpleWebModuleConstants.INFO_DIRECTORY).append(ISimpleWebModuleConstants.LIBRARY_DIRECTORY);

	private String jarName;
	private String projectName;

	public LibModule(String jarName, String projectName) {
		this.jarName = jarName;
		this.projectName = projectName;
	}

	/*
	 * @see ILibModule#getJarName()
	 */
	public String getJarName() {
		return jarName;
	}

	/*
	 * @see ILibModule#getProjectName()
	 */
	public String getProjectName() {
		return projectName;
	}

	/*
	 * @see ILibModule#getProject()
	 */
	public IProject getProject() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}

	/**
	 * @see ILibModule#getURI()
	 */
	public String getURI() {
		return IPath.SEPARATOR + LIB_PATH.append(getJarName()).toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ILibModule)) {
			return false;
		}
		ILibModule module = (ILibModule) obj;
		return getJarName().equals(module.getJarName()) && getProjectName().equals(module.getProjectName()) && getURI().equals(module.getURI()) && getProject().equals(module.getProject());
	}

}
