/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.jee.project.facet;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jst.common.project.facet.WtpUtils;
import org.eclipse.jst.common.project.facet.core.ClasspathHelper;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetInstallDataModelProperties;
import org.eclipse.jst.j2ee.project.facet.IJ2EEModuleFacetInstallDataModelProperties;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.datamodel.FacetDataModelProvider;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualFolder;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.project.facet.core.IDelegate;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;

public class AppClientFacetInstallDelegate extends JEEFacetInstallDelegate implements IDelegate {

	public void execute(IProject project, IProjectFacetVersion fv, Object config, IProgressMonitor monitor) throws CoreException {
		if (monitor != null)
			monitor.beginTask("", 1); //$NON-NLS-1$
		try {
			IDataModel model = (IDataModel) config;
			final IJavaProject jproj = JavaCore.create(project);

			// Add WTP natures.
			WtpUtils.addNatures(project);

			// Setup the flexible project structure.
			final IVirtualComponent c = createFlexibleProject(monitor, project, model, jproj);

			// Setup the classpath.
			ClasspathHelper.removeClasspathEntries(project, fv);
			if (!ClasspathHelper.addClasspathEntries(project, fv)) {
				// TODO: Support the no runtime case.
				// ClasspathHelper.addClasspathEntries( project, fv, <something> );
			}


//			// Add main class if necessary
//			if (model.getBooleanProperty(IAppClientFacetInstallDataModelProperties.CREATE_DEFAULT_MAIN_CLASS))
//				addMainClass(monitor, model, project);

			try {
				((IDataModelOperation) model.getProperty(FacetDataModelProvider.NOTIFICATION_OPERATION)).execute(monitor, null);
			} catch (ExecutionException e) {
				Logger.getLogger().logError(e);
			}

			if (monitor != null)
				monitor.worked(1);
		} catch (Exception e) {
			Logger.getLogger().logError(e);
		} finally {
			if (monitor != null)
				monitor.done();
		}
	}

	protected IVirtualComponent createFlexibleProject(IProgressMonitor monitor, IProject project, IDataModel model, IJavaProject jproj) throws Exception {
		// Create the directory structure.
		final IWorkspace ws = ResourcesPlugin.getWorkspace();
		final IPath pjpath = project.getFullPath();

		final IVirtualComponent c = ComponentCore.createComponent(project);
		c.create(0, null);
		setOutputFolder(model, c);
		final IVirtualFolder root = c.getRootFolder();
		
		IFolder sourceFolder = null;
		String configFolder = null;
		configFolder = model.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER);
		root.createLink(new Path("/" + configFolder), 0, null); //$NON-NLS-1$
		String configFolderName = model.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER);
		IPath configFolderpath = pjpath.append(configFolderName);
		sourceFolder = ws.getRoot().getFolder(configFolderpath);

		if(model.getBooleanProperty(IJ2EEFacetInstallDataModelProperties.GENERATE_DD)){
			// Create the deployment descriptor (web.xml) if one doesn't exist
			IFile appClientFile = sourceFolder.getFile(new Path(J2EEConstants.APP_CLIENT_DD_URI));
			if (!appClientFile.exists()) {
				try {
					if(!appClientFile.getParent().exists()
							&& (appClientFile.getParent().getType() ==  IResource.FOLDER)){
						((IFolder)appClientFile.getParent()).create(true, true, monitor);
					}
					final String appClientXmlContents = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<application-client version=\"5\" xmlns=\"http://java.sun.com/xml/ns/javaee\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application-client_5.xsd\">\n</application-client>"; //$NON-NLS-1$
					appClientFile.create(new ByteArrayInputStream(appClientXmlContents.getBytes("UTF-8")), true, monitor); //$NON-NLS-1$
				} catch (UnsupportedEncodingException e) {
					Logger.getLogger().logError(e);
				}			
			}
		}

		// add source folder maps
		final IClasspathEntry[] cp = jproj.getRawClasspath();
		for (int i = 0; i < cp.length; i++) {
			final IClasspathEntry cpe = cp[i];
			if (cpe.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
				root.createLink(cpe.getPath().removeFirstSegments(1), 0, null);
			}
		}
		return c;
	}

//	private void addMainClass(IProgressMonitor monitor, IDataModel model, IProject project) {
//		try {
//			IDataModel mainClassDataModel = DataModelFactory.createDataModel(NewJavaClassDataModelProvider.class);
//			mainClassDataModel.setProperty(IArtifactEditOperationDataModelProperties.PROJECT_NAME, project.getName());
//			mainClassDataModel.setProperty(INewJavaClassDataModelProperties.CLASS_NAME, "Main"); //$NON-NLS-1$
//			mainClassDataModel.setBooleanProperty(INewJavaClassDataModelProperties.MAIN_METHOD, true);
//			String projRelativeSourcePath = IPath.SEPARATOR + project.getName() + IPath.SEPARATOR + model.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER);
//			mainClassDataModel.setProperty(INewJavaClassDataModelProperties.SOURCE_FOLDER, projRelativeSourcePath);
//			IJavaProject javaProject = JemProjectUtilities.getJavaProject(project);
//			mainClassDataModel.setProperty(INewJavaClassDataModelProperties.JAVA_PACKAGE_FRAGMENT_ROOT, javaProject.getPackageFragmentRoots()[0]);
//			mainClassDataModel.getDefaultOperation().execute(monitor, null);
//			createManifestEntryForMainClass(monitor, model, project);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	protected void createManifestEntryForMainClass(IProgressMonitor monitor, IDataModel model, IProject project) throws CoreException, InvocationTargetException, InterruptedException {
//		IVirtualComponent appClientComponent = ComponentCore.createComponent(project);
//		IVirtualFile vf = appClientComponent.getRootFolder().getFile(new Path(J2EEConstants.MANIFEST_URI));
//		IFile manifestmf = vf.getUnderlyingFile();
//		if (manifestmf == null || !manifestmf.exists()) {
//			try {
//				createManifest(project, appClientComponent.getRootFolder().getUnderlyingFolder(), monitor);
//			} catch (Exception e) {
//				Logger.getLogger().logError(e);
//			}
//			String manifestFolder = IPath.SEPARATOR + model.getStringProperty(IJ2EEModuleFacetInstallDataModelProperties.CONFIG_FOLDER) + IPath.SEPARATOR + J2EEConstants.META_INF;
//			IContainer container = project.getFolder(manifestFolder);
//			manifestmf = container.getFile(new Path(J2EEConstants.MANIFEST_SHORT_NAME));
//		}
//		if (model.getBooleanProperty(IAppClientFacetInstallDataModelProperties.CREATE_DEFAULT_MAIN_CLASS)) {
//			IDataModel dm = DataModelFactory.createDataModel(UpdateManifestDataModelProvider.class);
//			dm.setProperty(UpdateManifestDataModelProperties.PROJECT_NAME, project.getName());
//			dm.setBooleanProperty(UpdateManifestDataModelProperties.MERGE, false);
//			dm.setProperty(UpdateManifestDataModelProperties.MANIFEST_FILE, manifestmf);
//			dm.setProperty(UpdateManifestDataModelProperties.MAIN_CLASS, "Main"); //$NON-NLS-1$
//			try {
//				dm.getDefaultOperation().execute(monitor, null);
//			} catch (Exception e) {
//				// Ignore
//			}
//		}
//	}
}