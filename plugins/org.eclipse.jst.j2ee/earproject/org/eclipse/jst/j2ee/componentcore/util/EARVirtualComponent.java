/*******************************************************************************
 * Copyright (c) 2003, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.componentcore.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jem.util.emf.workbench.ISynchronizerExtender;
import org.eclipse.jem.util.emf.workbench.ProjectResourceSet;
import org.eclipse.jem.util.emf.workbench.WorkbenchResourceHelperBase;
import org.eclipse.jst.j2ee.componentcore.J2EEModuleVirtualArchiveComponent;
import org.eclipse.jst.j2ee.internal.plugin.IJ2EEModuleConstants;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;
import org.eclipse.jst.j2ee.project.JavaEEProjectUtilities;
import org.eclipse.jst.jee.application.ICommonModule;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.internal.ReferencedComponent;
import org.eclipse.wst.common.componentcore.internal.StructureEdit;
import org.eclipse.wst.common.componentcore.internal.WorkbenchComponent;
import org.eclipse.wst.common.componentcore.internal.builder.IDependencyGraph;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualArchiveComponent;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualComponent;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualReference;
import org.eclipse.wst.common.componentcore.internal.util.IComponentImplFactory;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFile;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;
import org.eclipse.wst.common.componentcore.resources.IVirtualReference;
import org.eclipse.wst.common.componentcore.resources.IVirtualResource;

public class EARVirtualComponent extends VirtualComponent implements IComponentImplFactory, ISynchronizerExtender{
	
	private IVirtualReference[] cachedReferences;
	private Map cachedEarComponents = new HashMap();
	private long depGraphModStamp;
	public EARVirtualComponent() {
		super();
	}

	public EARVirtualComponent(IProject aProject, IPath aRuntimePath) {
		super(aProject, aRuntimePath);
	}

	public IVirtualComponent createArchiveComponent(IProject aProject, String archiveLocation, IPath aRuntimePath) {
		return new J2EEModuleVirtualArchiveComponent(aProject, archiveLocation, aRuntimePath);
	}
	
	public synchronized IVirtualComponent createComponent(IProject aProject) {
		EARVirtualComponent comp = null;
		comp = (EARVirtualComponent)getCachedEarComponents().get(aProject);
		if (comp == null) {
			comp = new EARVirtualComponent(aProject, new Path("/")); //$NON-NLS-1$
			getCachedEarComponents().put(aProject, comp);
			registerListener(aProject);
		}
		return comp;
	}
	
	private void registerListener(IProject aProject) {
		ProjectResourceSet resSet = getResourceSet(aProject);
		if (resSet == null)
			return;
		resSet.getSynchronizer().addExtender(this);
	}

	public IVirtualFolder createFolder(IProject aProject, IPath aRuntimePath) {
		return new EARVirtualRootFolder(aProject, aRuntimePath);
	}

	private static String getJarURI(final ReferencedComponent ref, final IVirtualComponent moduleComp) {
		String uri = ref.getArchiveName();
		if (uri == null || uri.length() < 0) {
			if(moduleComp.isBinary()){
				uri = new Path(moduleComp.getName()).lastSegment();
			} else {
				uri = moduleComp.getName() + IJ2EEModuleConstants.JAR_EXT;
			}
		} else {
			String prefix = ref.getRuntimePath().makeRelative().toString();
			if (prefix.length() > 0) {
				uri = prefix + "/" + uri; //$NON-NLS-1$
			}
		}
		return uri;
	}

	private static List getHardReferences(IVirtualComponent earComponent) {
		StructureEdit core = null;
		List hardReferences = new ArrayList();
		try {
			core = StructureEdit.getStructureEditForRead(earComponent.getProject());
			if (core != null && core.getComponent() != null) {
				WorkbenchComponent component = core.getComponent();
				if (component != null) {
					List referencedComponents = component.getReferencedComponents();
					for (Iterator iter = referencedComponents.iterator(); iter.hasNext();) {
						ReferencedComponent referencedComponent = (ReferencedComponent) iter.next();
						if (referencedComponent == null)
							continue;
						IVirtualReference vReference = StructureEdit.createVirtualReference(earComponent, referencedComponent);
						if (vReference != null) {
							IVirtualComponent referencedIVirtualComponent = vReference.getReferencedComponent();
							if (referencedIVirtualComponent != null && referencedIVirtualComponent.exists()) {
								String archiveName = null;
								if (referencedComponent.getDependentObject() != null) {
									archiveName = ((ICommonModule) referencedComponent.getDependentObject()).getUri();
								} else {
									if (referencedIVirtualComponent.isBinary()) {
										archiveName = getJarURI(referencedComponent, referencedIVirtualComponent);
										if (J2EEModuleVirtualArchiveComponent.class.isInstance(referencedIVirtualComponent)){
											((J2EEModuleVirtualArchiveComponent)referencedIVirtualComponent).setDeploymentPath(vReference.getRuntimePath());
										}
									} else if(referencedComponent.getArchiveName() != null){
										archiveName = referencedComponent.getArchiveName();
									} else {
										IProject referencedProject = referencedIVirtualComponent.getProject();
										// If dependent object is not set, assume
										// compname is module name + proper
										// extension
										if (JavaEEProjectUtilities.isDynamicWebProject(referencedProject) || JavaEEProjectUtilities.isStaticWebProject(referencedProject)) {
											archiveName = referencedIVirtualComponent.getName() + IJ2EEModuleConstants.WAR_EXT;
										} else if (JavaEEProjectUtilities.isJCAProject(referencedProject)) {
											archiveName = referencedIVirtualComponent.getName() + IJ2EEModuleConstants.RAR_EXT;
										} else if (JavaEEProjectUtilities.isUtilityProject(referencedProject)) {
											archiveName = getJarURI(referencedComponent, referencedIVirtualComponent);
										} else {
											archiveName = referencedIVirtualComponent.getName() + IJ2EEModuleConstants.JAR_EXT;
										}
									}
								}
								vReference.setArchiveName(archiveName);
								hardReferences.add(vReference);
							}
						}
					}
				}
			}
		} finally {
			if (core != null)
				core.dispose();
		}
		return hardReferences;
	}

	/**
	 * Returns the resulting list of referenced components based off the hard references and archives mapping to the root folder.
	 * 
	 * @param earComponent
	 * @param hardReferences
	 * @param membersToIgnore
	 * @return
	 */
	private static List getLooseArchiveReferences(EARVirtualComponent earComponent, List hardReferences) {
		return  getLooseArchiveReferences(earComponent, hardReferences, null, (EARVirtualRootFolder)earComponent.getRootFolder());
	}
	
	private static List getLooseArchiveReferences(EARVirtualComponent earComponent, List hardReferences, List dynamicReferences, EARVirtualRootFolder folder) {
		List innerDynamicReferences = dynamicReferences;
		try {
			IVirtualResource[] members = folder.superMembers();
			for (int i = 0; i < members.length; i++) {
				if (IVirtualResource.FILE == members[i].getType()) {
					if(folder.isDynamicComponent((IVirtualFile)members[i])){
						String archiveName = members[i].getRuntimePath().toString().substring(1);
						boolean shouldInclude = true;
						for (int j = 0; j < hardReferences.size() && shouldInclude; j++) {
							String tempArchiveName = ((IVirtualReference) hardReferences.get(j)).getArchiveName();
							if (null != tempArchiveName && tempArchiveName.equals(archiveName)) {
								shouldInclude = false;
							}
						}
						if (shouldInclude) {
							IResource iResource = members[i].getUnderlyingResource();
							IVirtualComponent dynamicComponent = ComponentCore.createArchiveComponent(earComponent.getProject(), VirtualArchiveComponent.LIBARCHIVETYPE + iResource.getFullPath().toString());
							IVirtualReference dynamicRef = ComponentCore.createReference(earComponent, dynamicComponent);
							((VirtualReference)dynamicRef).setDerived(true);
							if( dynamicComponent instanceof J2EEModuleVirtualArchiveComponent)
								((J2EEModuleVirtualArchiveComponent)dynamicComponent).setDeploymentPath(members[i].getRuntimePath());
							dynamicRef.setArchiveName(archiveName);
							if (null == innerDynamicReferences) {
								innerDynamicReferences = new ArrayList();
							}
							innerDynamicReferences.add(dynamicRef);
						}
					}
				} else if(IVirtualResource.FOLDER == members[i].getType()){
					innerDynamicReferences = getLooseArchiveReferences(earComponent, hardReferences, innerDynamicReferences, (EARVirtualRootFolder)members[i]);
				}
			}
		} catch (CoreException e) {
			J2EEPlugin.logError(e);
		}
		return innerDynamicReferences;
	}

	@Override
	public IVirtualReference[] getReferences() {
		
		IVirtualReference[] cached = getCachedReferences();
		if (cached != null)
			return cached;
		List hardReferences = getHardReferences(this);
		List dynamicReferences = getLooseArchiveReferences(this, hardReferences);

		if (dynamicReferences != null) {
			hardReferences.addAll(dynamicReferences);
		}
		cachedReferences = (IVirtualReference[]) hardReferences.toArray(new IVirtualReference[hardReferences.size()]);
		return cachedReferences;
	}
	// Returns cache if still valid or null
	public IVirtualReference[] getCachedReferences() {
		if (cachedReferences != null && checkIfStillValid())
			return cachedReferences;
		depGraphModStamp = IDependencyGraph.INSTANCE.getModStamp();
		return null;
	}

	private boolean checkIfStillValid() {
		return IDependencyGraph.INSTANCE.getModStamp() == depGraphModStamp;
	}

	public void projectChanged(IResourceDelta delta) {
		// TODO Auto-generated method stub
		
	}

	public synchronized void projectClosed() {
		getCachedEarComponents().clear();
		
	}

	protected Map getCachedEarComponents() {
		return cachedEarComponents;
	}
	protected ProjectResourceSet getResourceSet(IProject proj) {
		return (ProjectResourceSet)WorkbenchResourceHelperBase.getResourceSet(proj);
	}
}
