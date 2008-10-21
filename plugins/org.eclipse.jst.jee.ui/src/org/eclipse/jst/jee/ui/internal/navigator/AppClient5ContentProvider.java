/***********************************************************************
 * Copyright (c) 2008 by SAP AG, Walldorf. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 ***********************************************************************/
package org.eclipse.jst.jee.ui.internal.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.project.JavaEEProjectUtilities;
import org.eclipse.jst.javaee.applicationclient.ApplicationClient;
import org.eclipse.jst.jee.ui.internal.navigator.appclient.GroupAppClientProvider;
import org.eclipse.jst.jee.ui.internal.navigator.ear.ModulesNode;

/**
 * Ear 5.0 Content provider is Deployment Descriptor content provider, 
 * used for constructing of the descriptor tree in project explorer. 
 * 
 * @author Dimitar Giormov
 */
public class AppClient5ContentProvider extends JEE5ContentProvider {

	
	public Object[] getChildren(Object aParentElement) {
		IProject project = null;
		List children = new ArrayList();
		if (aParentElement instanceof GroupAppClientProvider) {
			children.addAll(((GroupAppClientProvider) aParentElement).getChildren());
		} else if (aParentElement instanceof IAdaptable) {
			project = (IProject) ((IAdaptable) aParentElement).getAdapter(IPROJECT_CLASS);
			if (project != null && JavaEEProjectUtilities.isApplicationClientProject(project) &&
					J2EEProjectUtilities.isJEEProject(project)) {
				children.add((GroupAppClientProvider) getCachedContentProvider(project));
			}
		}
		return children.toArray();
	}



	public boolean hasChildren(Object element) {
		if (element instanceof GroupAppClientProvider) {
			return !((GroupAppClientProvider) element).getChildren().isEmpty();
		} else 
			return false;
	}

	public Object getParent(Object object) {
		if (object instanceof ModulesNode){
			return ((ModulesNode) object).getEarProject(); 
		}
		return null;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}



	@Override
	protected AbstractGroupProvider getNewContentProviderInstance(IProject project) {
		return new GroupAppClientProvider((ApplicationClient) getCachedModelProvider(project).getModelObject(), project);
	}




}
