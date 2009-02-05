/*******************************************************************************
 * Copyright (c) 2003, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 * Stefan Dimov, stefan.dimov@sap.com - bug 207826
 * Kaloyan Raev, kaloyan.raev@sap.com - bug 220912
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.archive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jst.j2ee.classpathdep.IClasspathDependencyConstants;
import org.eclipse.jst.j2ee.componentcore.J2EEModuleVirtualComponent;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.classpathdep.ClasspathDependencyVirtualComponent;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.jee.archive.ArchiveOpenFailureException;
import org.eclipse.jst.jee.archive.IArchive;
import org.eclipse.jst.jee.archive.IArchiveLoadAdapter;
import org.eclipse.jst.jee.archive.IArchiveResource;
import org.eclipse.jst.jee.archive.internal.ArchiveUtil;
import org.eclipse.jst.jee.util.internal.JavaEEQuickPeek;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualArchiveComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualReference;

public class EARComponentArchiveLoadAdapter extends ComponentArchiveLoadAdapter {

	// Optimization to directly copy binary files
	private Map<IArchiveResource, File> binaryResourcesToDiskFiles = new HashMap<IArchiveResource, File>();

	public EARComponentArchiveLoadAdapter(IVirtualComponent vComponent) {
		super(vComponent);
	}

	public EARComponentArchiveLoadAdapter(IVirtualComponent vComponent, boolean includeClasspathComponents) {
		super(vComponent, includeClasspathComponents);
	}

	public List<IArchiveResource> getArchiveResources() {
		aggregateSourceFiles();
		addModulesAndUtilities();
		List<IArchiveResource> files = filesHolder.getFiles();
		IPath manifestPath = new Path(J2EEConstants.MANIFEST_URI);
		if (!filesHolder.contains(manifestPath)) {
			IArchiveResource manifest = createManifest(manifestPath);
			files.add(manifest);
		}
		return files;
	}

	public InputStream getInputStream(IArchiveResource archiveResource) throws IOException, FileNotFoundException {
		if (binaryResourcesToDiskFiles.containsKey(archiveResource)) {
			java.io.File diskFile = binaryResourcesToDiskFiles.get(archiveResource);
			return new FileInputStream(diskFile);
		}
		return super.getInputStream(archiveResource);
	}

	public void addModulesAndUtilities() {
		IVirtualReference[] components = J2EEProjectUtilities.getComponentReferences(vComponent);
		for (int i = 0; i < components.length; i++) {
			IVirtualReference reference = components[i];
			IVirtualComponent referencedComponent = reference.getReferencedComponent();
			if(vComponent.equals(referencedComponent)){
				continue;
			}
			try {
				IArchive nestedModuleArchive = JavaEEArchiveUtilities.INSTANCE.openArchive(referencedComponent);
				String sPath = reference.getArchiveName();
				String srtp = reference.getRuntimePath().toString();
				if (srtp.startsWith("" + IPath.SEPARATOR)) srtp = srtp.substring(1);
				String spt = srtp + IPath.SEPARATOR + sPath;
				if (spt.startsWith("" + IPath.SEPARATOR)) spt = spt.substring(1);
				nestedModuleArchive.setPath(new Path(spt));
				nestedModuleArchive.setArchive(archive);
				filesHolder.addFile(nestedModuleArchive);

				if (referencedComponent.isBinary()) {
					java.io.File diskFile = null;
					diskFile = ((VirtualArchiveComponent) referencedComponent).getUnderlyingDiskFile();
					if (!diskFile.exists()) {
						IFile wbFile = ((VirtualArchiveComponent) referencedComponent).getUnderlyingWorkbenchFile();
						diskFile = new File(wbFile.getLocation().toOSString());
					}
					binaryResourcesToDiskFiles.put(nestedModuleArchive, diskFile);
				} else {
					// Bug 220912 - set "export source" flag before calling JavaEEQuickPeek
					if (nestedModuleArchive.getType() == IArchive.ARCHIVE_TYPE) {
						IArchiveLoadAdapter nestedLoadAdapter = (IArchiveLoadAdapter)((IArchive)nestedModuleArchive).getLoadAdapter();
						if(nestedLoadAdapter instanceof ComponentArchiveLoadAdapter){
							((ComponentArchiveLoadAdapter)nestedLoadAdapter).setExportSource(isExportSource());
						}
					}
					
					JavaEEQuickPeek quickPeek = JavaEEArchiveUtilities.INSTANCE.getJavaEEQuickPeek(nestedModuleArchive);
					switch (quickPeek.getType()) {
					case JavaEEQuickPeek.CONNECTOR_TYPE:
					case JavaEEQuickPeek.EJB_TYPE:
					case JavaEEQuickPeek.WEB_TYPE:
						((ComponentArchiveLoadAdapter) nestedModuleArchive.getLoadAdapter()).setIncludeClasspathComponents(includeClasspathComponents);
						addClasspathComponentDependencies(referencedComponent);
					}

				}
			} catch (ArchiveOpenFailureException e) {
				ArchiveUtil.warn(e);
			}
		}
	}

	private void addClasspathComponentDependencies(final IVirtualComponent referencedComponent) {
		// retrieve all Java classpath component dependencies
		if (includeClasspathComponents && referencedComponent instanceof J2EEModuleVirtualComponent) {
			final IVirtualReference[] cpRefs = ((J2EEModuleVirtualComponent) referencedComponent).getJavaClasspathReferences();
			for (int j = 0; j < cpRefs.length; j++) {
				final IVirtualReference ref = cpRefs[j];
				// only ../ runtime paths contribute to the EAR
				if (ref.getRuntimePath().equals(IClasspathDependencyConstants.RUNTIME_MAPPING_INTO_CONTAINER_PATH)) {
					if (ref.getReferencedComponent() instanceof ClasspathDependencyVirtualComponent) {
						final ClasspathDependencyVirtualComponent comp = (ClasspathDependencyVirtualComponent) ref.getReferencedComponent();
						File cpEntryFile = comp.getUnderlyingDiskFile();
						if (!cpEntryFile.exists()) {
							final IFile wbFile = comp.getUnderlyingWorkbenchFile();
							cpEntryFile = new File(wbFile.getLocation().toOSString());
						}
						addExternalFile(new Path(ref.getArchiveName()), cpEntryFile);
					}
				}
			}
		}
	}
	
	@Override
	protected IPath getDefaultModelObjectPath() {
		return new Path(J2EEConstants.APPLICATION_DD_URI);
	}

}
