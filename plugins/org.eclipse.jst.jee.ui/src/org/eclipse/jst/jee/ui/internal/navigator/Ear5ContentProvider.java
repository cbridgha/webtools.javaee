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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jst.j2ee.componentcore.util.EARVirtualComponent;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.model.ModelProviderManager;
import org.eclipse.jst.j2ee.project.JavaEEProjectUtilities;
import org.eclipse.jst.javaee.application.Application;
import org.eclipse.jst.jee.ui.internal.navigator.ear.AbstractEarNode;
import org.eclipse.jst.jee.ui.internal.navigator.ear.GroupEARProvider;
import org.eclipse.jst.jee.ui.plugin.JEEUIPlugin;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.internal.util.IModuleConstants;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualReference;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;

/**
 * Application Client 5.0 Content provider is Deployment Descriptor content provider, 
 * used for constructing of the descriptor tree in project explorer. 
 * 
 * @author Dimitar Giormov
 */
public class Ear5ContentProvider extends JEE5ContentProvider {

	public final static String EAR_DEFAULT_LIB = "/lib"; //$NON-NLS-1$

	private List getComponentReferencesAsList(List componentTypes, IVirtualComponent virtualComponent, IPath runtimePath) {
		List components = new ArrayList();
		IVirtualComponent earComponent = virtualComponent;
		if (earComponent != null ) {
			IVirtualReference[] refComponents = earComponent.getReferences();
			for (int i = 0; i < refComponents.length; i++) {
				IVirtualComponent module = refComponents[i].getReferencedComponent();
				if (module == null) continue;
				// if component types passed in is null then return all components
				if (componentTypes == null || componentTypes.size() == 0) {
					components.add(refComponents[i]);
				} else {
					if (componentTypes.contains(JavaEEProjectUtilities.getJ2EEComponentType(module))) {
						components.add(refComponents[i]);
					}
				}
			}
		}
		return components;
	}

	public IVirtualReference[] getUtilityModuleReferences(IVirtualComponent component) {  
		List explicitUtilityReferences = 
			getComponentReferencesAsList(Collections.singletonList(J2EEProjectUtilities.UTILITY), component, null);

		// fetch other Utility Jars attached to the EAR project 
		List implicitUtilityReferenceTypes =
			Arrays.asList(new String[] {  
					IModuleConstants.JST_APPCLIENT_MODULE,
					IModuleConstants.JST_WEB_MODULE,	 
					IModuleConstants.JST_EJB_MODULE 
			});

		List implicitUtilityReferences = 
			getComponentReferencesAsList(implicitUtilityReferenceTypes, component, null);

		List allUtilityModuleReferences = new ArrayList();
		allUtilityModuleReferences.addAll(explicitUtilityReferences);
		allUtilityModuleReferences.addAll(implicitUtilityReferences);

		if(allUtilityModuleReferences.size() > 0)
			return (IVirtualReference[]) allUtilityModuleReferences.toArray(new IVirtualReference[allUtilityModuleReferences.size()]);
		return new IVirtualReference[0];

	}

	public Object[] getChildren(Object aParentElement) {
		IProject project = null;
		List children = new ArrayList();
		if (aParentElement instanceof GroupEARProvider) {
			project = (IProject) ((GroupEARProvider)aParentElement).getProject();

			IVirtualComponent projectComponent = ComponentCore.createComponent(project);
			try {
				IFacetedProject facetedProject = ProjectFacetsManager.create(project);
				if (facetedProject != null && 
						facetedProject.hasProjectFacet(
								ProjectFacetsManager.getProjectFacet(IModuleConstants.JST_EAR_MODULE).getVersion(
										J2EEVersionConstants.VERSION_5_0_TEXT))) {

					List libs = getComponentReferencesAsList(Collections.singletonList(J2EEProjectUtilities.UTILITY), projectComponent,
							new Path("/" + EAR_DEFAULT_LIB)); //$NON-NLS-1$

							ArrayList bundledLibs = new ArrayList();
							ArrayList appLibsInTheRoot = new ArrayList();

							for (int i = 0; i < libs.size(); i++) {
								IVirtualReference reference = (IVirtualReference) libs.get(i);
								IPath runtimePath = reference.getRuntimePath();

								if (runtimePath != null && runtimePath.segment(0) != null && 
//										runtimePath.equals(new Path(EAR_DEFAULT_LIB))) {
									!runtimePath.isRoot()) {
									bundledLibs.add(libs.get(i));
								} else {
									appLibsInTheRoot.add(libs.get(i));
								}
							}
							
							String libDir = EAR_DEFAULT_LIB;
							if (J2EEProjectUtilities.isJEEProject(project)) {
								String oldLibDir = ((Application)ModelProviderManager.getModelProvider(project).getModelObject()).getLibraryDirectory();
								if (oldLibDir == null) oldLibDir = EAR_DEFAULT_LIB;
								libDir = oldLibDir;
							}
//
//							List implicitUtilityReferenceTypes =
//								Arrays.asList(new String[] {  
//										IModuleConstants.JST_APPCLIENT_MODULE,
//										IModuleConstants.JST_WEB_MODULE,
//										IModuleConstants.JST_EJB_MODULE,
//										IModuleConstants.JST_CONNECTOR_MODULE});
//

//							List modules = getComponentReferencesAsList(implicitUtilityReferenceTypes, projectComponent, new Path("/")); //$NON-NLS-1$
//							ModulesNode modulesNode = new ModulesNode(project);

//							children.add(modulesNode);
//							children.add(bundledLibsNode);
				}
			} catch (CoreException e) {
				String msg = "Error in the JEEContentProvider.getChildren() for parent:" +  aParentElement; //$NON-NLS-1$
				JEEUIPlugin.getDefault().logError(msg, e);
			}
		} else if (aParentElement instanceof AbstractEarNode) {
			return ((AbstractEarNode) aParentElement).getModules().toArray();
		} else if (aParentElement instanceof IAdaptable) {
			project = (IProject) ((IAdaptable) aParentElement).getAdapter(IPROJECT_CLASS);
			if (project != null && J2EEProjectUtilities.isEARProject(project)) {
				IFacetedProject facetedProject;
				try {
					facetedProject = ProjectFacetsManager.create(project);
					if (facetedProject != null && 
							facetedProject.hasProjectFacet(
									ProjectFacetsManager.getProjectFacet(IModuleConstants.JST_EAR_MODULE).getVersion(
											J2EEVersionConstants.VERSION_5_0_TEXT))) {
						GroupEARProvider element = (GroupEARProvider) getCachedContentProvider(project);
						children.add(element);
					}
				} catch (CoreException e) {
					String msg = "Error in the JEEContentProvider.getChildren() for parent:" +  aParentElement; //$NON-NLS-1$
					JEEUIPlugin.getDefault().logError(msg, e);
				}
			}
		}
		return children.toArray();
	}

	public boolean hasChildren(Object element) {
		if (element instanceof AbstractEarNode) {
			return ((AbstractEarNode) element).getModules().size() > 0;
		} else if (element instanceof GroupEARProvider){
			return true;
		} else return false;
	}

	public Object getParent(Object object) {
		if (object instanceof AbstractEarNode){
			return ((AbstractEarNode) object).getEarProject(); 
		}
		return null;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	protected AbstractGroupProvider getNewContentProviderInstance(IProject project) {
		return new GroupEARProvider((Application) getCachedModelProvider(project).getModelObject(), (EARVirtualComponent)ComponentCore.createComponent(project));
	}
}
