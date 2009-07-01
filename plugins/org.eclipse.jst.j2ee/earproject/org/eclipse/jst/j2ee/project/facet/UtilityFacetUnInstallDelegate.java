/******************************************************************************
 * Copyright (c) 2005 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial API and implementation
 ******************************************************************************/

package org.eclipse.jst.j2ee.project.facet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jst.common.project.facet.WtpUtils;
import org.eclipse.jst.common.project.facet.core.ClasspathHelper;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.internal.StructureEdit;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public final class UtilityFacetUnInstallDelegate implements IDelegate {

	public void execute(final IProject project, final IProjectFacetVersion fv, final Object cfg, final IProgressMonitor monitor) throws CoreException {
		if (monitor != null) {
			monitor.beginTask("", 1); //$NON-NLS-1$
		}

		try{
			//remove .component  file
			IFile file = project.getFile( StructureEdit.MODULE_META_FILE_NAME );
			file.delete( true, monitor );
			
			//remove manifest file
			final IVirtualComponent c = ComponentCore.createComponent(project);
			final IVirtualFolder root = c.getRootFolder();
			IContainer container = null;

			if (root.getProjectRelativePath().segmentCount() == 0) {
				container = project;
			} else {
				container = project.getFolder(root.getProjectRelativePath());
			}
			
			IFile manifestFile = container.getFile(new Path(J2EEConstants.MANIFEST_URI));
			manifestFile.delete( true, monitor );
			
			IFolder manifestFolder = container.getFolder( new Path(J2EEConstants.META_INF) );
			manifestFolder.delete( true, monitor );
		     
			//remove  module core nature
			WtpUtils.removeNatures( project );
			
			//remove server class path container
			ClasspathHelper.removeClasspathEntries( project, fv );
			
		}finally {
			if (monitor != null) {
				monitor.done();
			}
		}
	}
}
