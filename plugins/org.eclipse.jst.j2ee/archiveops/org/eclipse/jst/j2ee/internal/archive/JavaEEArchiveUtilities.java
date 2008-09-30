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
package org.eclipse.jst.j2ee.internal.archive;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.util.IAnnotation;
import org.eclipse.jdt.core.util.IClassFileAttribute;
import org.eclipse.jdt.core.util.IClassFileReader;
import org.eclipse.jdt.core.util.IRuntimeVisibleAnnotationsAttribute;
import org.eclipse.jst.j2ee.componentcore.J2EEModuleVirtualArchiveComponent;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.J2EEVersionConstants;
import org.eclipse.jst.j2ee.internal.componentcore.JavaEEBinaryComponentLoadAdapter;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.jst.j2ee.project.EarUtilities;
import org.eclipse.jst.j2ee.project.JavaEEProjectUtilities;
import org.eclipse.jst.jee.archive.ArchiveModelLoadException;
import org.eclipse.jst.jee.archive.ArchiveOpenFailureException;
import org.eclipse.jst.jee.archive.ArchiveOptions;
import org.eclipse.jst.jee.archive.IArchive;
import org.eclipse.jst.jee.archive.IArchiveFactory;
import org.eclipse.jst.jee.archive.IArchiveLoadAdapter;
import org.eclipse.jst.jee.archive.IArchiveResource;
import org.eclipse.jst.jee.archive.internal.ArchiveFactoryImpl;
import org.eclipse.jst.jee.archive.internal.ArchiveImpl;
import org.eclipse.jst.jee.archive.internal.ArchiveUtil;
import org.eclipse.jst.jee.archive.internal.ZipFileArchiveLoadAdapterImpl;
import org.eclipse.jst.jee.util.internal.JavaEEQuickPeek;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;

public class JavaEEArchiveUtilities extends ArchiveFactoryImpl implements IArchiveFactory {

	/**
	 * Default value = Boolean.TRUE Valid values = Boolean.TRUE or Boolean.FALSE
	 * 
	 * An ArchiveOption used to specify whether
	 * {@link #openArchive(ArchiveOptions)} should attempt to discriminate
	 * between different Java EE archive types. The default behavior is to
	 * always discriminate fully for all types except EJB 3.0 archives
	 * {@link #DISCRIMINATE_EJB_ANNOTATIONS}. In order to fully discriminate
	 * EJB 3.0 archives, it is necessary to set both this flag and
	 * {@link #DISCRIMINATE_EJB_ANNOTATIONS} to true.
	 */
	public static final String DISCRIMINATE_JAVA_EE = "DISCRIMINATE_EJB"; //$NON-NLS-1$

	/**
	 * Default value = Boolean.TRUE Valid values = Boolean.TRUE or Boolean.FALSE
	 * 
	 * An ArchiveOption used to specify whether
	 * {@link #openArchive(ArchiveOptions)} should attempt to fully discriminate
	 * a JAR file from an EJB JAR file. This option is only relevant if the
	 * {@link #DISCRIMINATE_JAVA_EE} option is also set to Boolean.TRUE. If both
	 * options are set to true then as a last resort all .class files byte codes
	 * will be analyzed for EJB annotations in order to discriminate whether the
	 * specified IArchive is an EJB 3.0 jar.
	 */
	public static final String DISCRIMINATE_EJB_ANNOTATIONS = "DISCRIMINATE_EJB_ANNOTATIONS"; //$NON-NLS-1$

	/**
	 * Default value = null
	 * 
	 * An ArchiveOption used to specify the original load adapter in the case it
	 * swapped out with an {@link #JavaEEWrappingLoadAdapter}.
	 */
	public static final String WRAPPED_LOAD_ADAPTER = "WRAPPED_LOAD_ADAPTER"; //$NON-NLS-1$

	private JavaEEArchiveUtilities() {
	}

	public static JavaEEArchiveUtilities INSTANCE = new JavaEEArchiveUtilities();

	public static final String DOT_JAVA = ".java"; //$NON-NLS-1$

	public static final String DOT_CLASS = ".class"; //$NON-NLS-1$

	public static boolean isJava(IFile iFile) {
		return hasExtension(iFile, DOT_JAVA);
	}

	public static boolean isClass(IFile iFile) {
		return hasExtension(iFile, DOT_CLASS);
	}

	public static boolean hasExtension(IFile iFile, String ext) {
		String name = iFile.getName();
		return hasExtension(name, ext);
	}

	public static boolean hasExtension(String name, String ext) {
		int offset = ext.length();
		return name.regionMatches(true, name.length() - offset, ext, 0, offset);
	}

	public IArchive openArchive(IVirtualComponent virtualComponent) throws ArchiveOpenFailureException {
		if (virtualComponent.isBinary()) {
			J2EEModuleVirtualArchiveComponent archiveComponent = (J2EEModuleVirtualArchiveComponent) virtualComponent;
			JavaEEBinaryComponentLoadAdapter loadAdapter = new JavaEEBinaryComponentLoadAdapter(archiveComponent);
			ArchiveOptions archiveOptions = new ArchiveOptions();
			archiveOptions.setOption(ArchiveOptions.LOAD_ADAPTER, loadAdapter);
			archiveOptions.setOption(ArchiveOptions.ARCHIVE_PATH, loadAdapter.getArchivePath());
			IArchive parentEARArchive = null;
			try {
				if(archiveComponent.isLinkedToEAR()){
					try {
						IProject earProject = virtualComponent.getProject();
						if(earProject != null && EarUtilities.isEARProject(earProject)){
							IVirtualComponent earComponent = ComponentCore.createComponent(virtualComponent.getProject());
							if(earComponent != null) {
								parentEARArchive = openArchive(earComponent);
								if(parentEARArchive != null) {
									archiveOptions.setOption(ArchiveOptions.PARENT_ARCHIVE, parentEARArchive);
								}
							}
						}
					} catch(ArchiveOpenFailureException e) {
						org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin.logError(e);
					}
				}
				return openArchive(archiveOptions);
			} finally {
				if(parentEARArchive != null){
					archiveOptions.removeOption(ArchiveOptions.PARENT_ARCHIVE);
					closeArchive(parentEARArchive);
				}
			}
		}
		int type = J2EEVersionConstants.UNKNOWN;
		IArchiveLoadAdapter archiveLoadAdapter = null;
		if (J2EEProjectUtilities.isEARProject(virtualComponent.getProject())) {
			archiveLoadAdapter = new EARComponentArchiveLoadAdapter(virtualComponent);
			type = J2EEVersionConstants.APPLICATION_TYPE;
		} else if (J2EEProjectUtilities.isEJBComponent(virtualComponent)) {
			archiveLoadAdapter = new EJBComponentArchiveLoadAdapter(virtualComponent);
			type = J2EEVersionConstants.EJB_TYPE;
		} else if (J2EEProjectUtilities.isApplicationClientComponent(virtualComponent)) {
			archiveLoadAdapter = new AppClientComponentArchiveLoadAdapter(virtualComponent);
			type = J2EEVersionConstants.APPLICATION_CLIENT_TYPE;
		} else if (J2EEProjectUtilities.isJCAComponent(virtualComponent)) {
			archiveLoadAdapter = new ConnectorComponentArchiveLoadAdapter(virtualComponent);
			type = J2EEVersionConstants.CONNECTOR_TYPE;
		} else if (J2EEProjectUtilities.isDynamicWebComponent(virtualComponent)) {
			archiveLoadAdapter = new WebComponentArchiveLoadAdapter(virtualComponent);
			type = J2EEVersionConstants.WEB_TYPE;
		} else if (J2EEProjectUtilities.isUtilityProject(virtualComponent.getProject())) {
			archiveLoadAdapter = new JavaComponentArchiveLoadAdapter(virtualComponent);
		}

		if (archiveLoadAdapter != null) {
			ArchiveOptions options = new ArchiveOptions();
			options.setOption(ArchiveOptions.LOAD_ADAPTER, archiveLoadAdapter);
			IArchive archive = super.openArchive(options);
			if (type != J2EEVersionConstants.UNKNOWN) {
				int version = J2EEVersionConstants.UNKNOWN;
				String versionStr = JavaEEProjectUtilities.getJ2EEDDProjectVersion(virtualComponent.getProject());
				if(versionStr == null){
					versionStr = J2EEProjectUtilities.getJ2EEProjectVersion(virtualComponent.getProject());
				}
				switch (type) {
				case J2EEVersionConstants.APPLICATION_CLIENT_TYPE:
				case J2EEVersionConstants.APPLICATION_TYPE:
					if (versionStr.equals(J2EEVersionConstants.VERSION_1_2_TEXT)) {
						version = J2EEVersionConstants.J2EE_1_2_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_1_3_TEXT)) {
						version = J2EEVersionConstants.J2EE_1_3_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_1_4_TEXT)) {
						version = J2EEVersionConstants.J2EE_1_4_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_5_0_TEXT)) {
						version = J2EEVersionConstants.JEE_5_0_ID;
					}
					break;
				case J2EEVersionConstants.CONNECTOR_TYPE:
					if (versionStr.equals(J2EEVersionConstants.VERSION_1_0_TEXT)) {
						version = J2EEVersionConstants.JCA_1_0_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_1_5_TEXT)) {
						version = J2EEVersionConstants.JCA_1_5_ID;
					}
					break;
				case J2EEVersionConstants.EJB_TYPE:
					if (versionStr.equals(J2EEVersionConstants.VERSION_1_1_TEXT)) {
						version = J2EEVersionConstants.EJB_1_1_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_2_0_TEXT)) {
						version = J2EEVersionConstants.EJB_2_0_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_2_1_TEXT)) {
						version = J2EEVersionConstants.EJB_2_1_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_3_0_TEXT)) {
						version = J2EEVersionConstants.EJB_3_0_ID;
					}
					break;
				case J2EEVersionConstants.WEB_TYPE:
					if (versionStr.equals(J2EEVersionConstants.VERSION_2_2_TEXT)) {
						version = J2EEVersionConstants.WEB_2_2_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_2_3_TEXT)) {
						version = J2EEVersionConstants.WEB_2_3_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_2_4_TEXT)) {
						version = J2EEVersionConstants.WEB_2_4_ID;
					} else if (versionStr.equals(J2EEVersionConstants.VERSION_2_5_TEXT)) {
						version = J2EEVersionConstants.WEB_2_5_ID;
					}
					break;
				}
				if (version != J2EEVersionConstants.UNKNOWN) {
					archiveToJavaEEQuickPeek.put(archive, new JavaEEQuickPeek(type, version));
				}
			}
			return archive;
		}
		return null;
	}

	private Map<IArchive, JavaEEQuickPeek> archiveToJavaEEQuickPeek = new WeakHashMap<IArchive, JavaEEQuickPeek>();

	/**
	 * Returns a utility for getting the type of Java EE archive, the Java EE
	 * version, and the Module version
	 * 
	 * @param archive
	 * @return
	 */
	public JavaEEQuickPeek getJavaEEQuickPeek(IArchive archive) {
		if (archiveToJavaEEQuickPeek.containsKey(archive)) {
			return archiveToJavaEEQuickPeek.get(archive);
		} else {
			String[] deploymentDescriptorsToCheck = new String[] { J2EEConstants.APPLICATION_DD_URI, J2EEConstants.APP_CLIENT_DD_URI, J2EEConstants.EJBJAR_DD_URI, J2EEConstants.WEBAPP_DD_URI,
					J2EEConstants.RAR_DD_URI };
			for (int i = 0; i < deploymentDescriptorsToCheck.length; i++) {
				final IPath deploymentDescriptorPath = new Path(deploymentDescriptorsToCheck[i]);
				if (archive.containsArchiveResource(deploymentDescriptorPath)) {
					InputStream in = null;
					IArchiveResource dd;
					try {
						dd = archive.getArchiveResource(deploymentDescriptorPath);
						in = dd.getInputStream();
						JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(in);
						archiveToJavaEEQuickPeek.put(archive, quickPeek);
						return quickPeek;
					} catch (FileNotFoundException e) {
						ArchiveUtil.warn(e);
					} catch (IOException e) {
						ArchiveUtil.warn(e);
					}
				}
			}
			JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(null);
			archiveToJavaEEQuickPeek.put(archive, quickPeek);
			return quickPeek;
		}
	}

	/**
	 * Returns an IArchive. This method will attempt to discriminate the
	 * specific Java EE archive type based on the following simple rules. Please
	 * note that these rules do not adhere exactly to the Java EE specification
	 * because they are written for a tooling environment rather than a runtime
	 * environment. Thus these rules attempt to compensate for user error with
	 * the understanding that other areas of the tooling environment will help
	 * detect and correct these errors.
	 * 
	 * <ol>
	 * <li> An archive containing a deployment descriptor is considered to be of
	 * that type </li>
	 * <li> An archive whose name ends with '.ear' is considered an EAR </li>
	 * <li> An archive whose name ends with '.war' is considered a WAR </li>
	 * <li> An archive whose name ends with '.jar' and which contains a
	 * META-INF/MANIFEST.MF file containing a Main-class attribute is considered
	 * an Application Client </li>
	 * <li> If the ArchiveOptions specify the
	 * {@link #DISCRIMINATE_EJB_ANNOTATIONS} as Boolean.TRUE then if the archive
	 * contains any .class file with EJB annotations it is considered an EJB
	 * JAR. Be warned that this full check does have performance implications
	 * and is not done by default.</li>
	 * An archive whose name ends with '.jar' is considered a Utility </li>
	 * </ol>
	 */
	public IArchive openArchive(ArchiveOptions archiveOptions) throws ArchiveOpenFailureException {
		IArchive simpleArchive = super.openArchive(archiveOptions);
		Object discriminateJavaEE = archiveOptions.getOption(DISCRIMINATE_JAVA_EE);
		if (discriminateJavaEE != null && !((Boolean) discriminateJavaEE).booleanValue()) {
			return simpleArchive;
		}
		return refineForJavaEE(simpleArchive);
	}

	private static final String DOT_EAR = ".ear";//$NON-NLS-1$

	private static final String DOT_WAR = ".war";//$NON-NLS-1$

	private static final String DOT_JAR = ".jar";//$NON-NLS-1$

	private IArchive refineForJavaEE(final IArchive simpleArchive) {
		//Check to see if this archive is actually being opened as a nested archive from within an EAR
		//if it is then the EAR's DD needs to be checked to see exactly what type of archive this is.
		if (simpleArchive.getArchiveOptions().hasOption(ArchiveOptions.PARENT_ARCHIVE)) {
			IArchive parent = (IArchive) simpleArchive.getArchiveOptions().getOption(ArchiveOptions.PARENT_ARCHIVE);
			JavaEEQuickPeek qp = getJavaEEQuickPeek(parent);

			if (qp.getType() == JavaEEQuickPeek.APPLICATION_TYPE) {
				IPath ddPath = new Path(J2EEConstants.APPLICATION_DD_URI);
				if (parent.containsArchiveResource(ddPath)) {
					try {
						Object ddObj = parent.getModelObject(ddPath);
						IPath archivePath = simpleArchive.getPath();
						if (archivePath == null) {
							Object obj = simpleArchive.getArchiveOptions().getOption(ArchiveOptions.ARCHIVE_PATH);
							if (null != obj) {
								archivePath = (IPath) obj;
							}
						}
						int definedType = J2EEVersionConstants.UNKNOWN;
						if (qp.getVersion() == JavaEEQuickPeek.JEE_5_0_ID) {
							org.eclipse.jst.javaee.application.Application app = (org.eclipse.jst.javaee.application.Application) ddObj;
							org.eclipse.jst.javaee.application.Module module = app.getFirstModule(archivePath.toString());
							//if the archive isn't found, do a smart search for it
							if(module == null){
								IPath noDevicePath = archivePath.setDevice(null);
								for(int i=1; i<noDevicePath.segmentCount() && module == null; i++){
									String stringPath = noDevicePath.removeFirstSegments(i).toString();
									module = app.getFirstModule(stringPath);
								}
							}
							if (null != module) {
								if (module.getEjb() != null) {
									definedType = J2EEVersionConstants.EJB_TYPE;
								} else if (module.getConnector() != null) {
									definedType = J2EEVersionConstants.CONNECTOR_TYPE;
								} else if (module.getJava() != null) {
									definedType = J2EEVersionConstants.APPLICATION_CLIENT_TYPE;
								} else if (module.getWeb() != null) {
									definedType = J2EEVersionConstants.WEB_TYPE;
								}
							}
						} else { //J2EE 1.4 or below, rely solely on DD
							org.eclipse.jst.j2ee.application.Application app = (org.eclipse.jst.j2ee.application.Application) ddObj;
							org.eclipse.jst.j2ee.application.Module module = app.getFirstModule(archivePath.toString());
							//if the archive isn't found, do a smart search for it
							if(module == null){
								IPath noDevicePath = archivePath.setDevice(null);
								for(int i=1; i<noDevicePath.segmentCount() && module == null; i++){
									String stringPath = noDevicePath.removeFirstSegments(i).toString();
									module = app.getFirstModule(stringPath);
								}
							}
							if (null != module) {
								if (module.isEjbModule()) {
									definedType = J2EEVersionConstants.EJB_TYPE;
								} else if (module.isConnectorModule()) {
									definedType = J2EEVersionConstants.CONNECTOR_TYPE;
								} else if (module.isJavaModule()) {
									definedType = J2EEVersionConstants.APPLICATION_CLIENT_TYPE;
								} else if (module.isWebModule()) {
									definedType = J2EEVersionConstants.WEB_TYPE;
								}
							} else { //J2EE 1.4 or below, and not in DD, treat as utility
								JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(null);
								archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
								return simpleArchive;
							}
						}
						if (definedType != J2EEVersionConstants.UNKNOWN) {
							String ddToCheck = null;
							switch (definedType) {
							case J2EEVersionConstants.EJB_TYPE:
								ddToCheck = J2EEConstants.EJBJAR_DD_URI;
								break;
							case J2EEVersionConstants.CONNECTOR_TYPE:
								ddToCheck = J2EEConstants.RAR_DD_URI;
								break;
							case J2EEVersionConstants.APPLICATION_CLIENT_TYPE:
								ddToCheck = J2EEConstants.APP_CLIENT_DD_URI;
								break;
							case J2EEVersionConstants.WEB_TYPE:
								ddToCheck = J2EEConstants.WEBAPP_DD_URI;
								break;
							}
							IArchive wrappedForDD = wrapForDD(simpleArchive, definedType, new Path(ddToCheck));
							if (wrappedForDD != null) {
								return wrappedForDD;
							}
							// else there is no DD and we need to decide on a
							// version (letting RARs fall through)
							switch (definedType) {
							case J2EEVersionConstants.EJB_TYPE: {
								JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.EJB_TYPE, JavaEEQuickPeek.EJB_3_0_ID, JavaEEQuickPeek.JEE_5_0_ID);
								archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
								wrapArchive(simpleArchive, new Path(J2EEConstants.EJBJAR_DD_URI));
								return simpleArchive;
							}
							case J2EEVersionConstants.APPLICATION_CLIENT_TYPE: {
								JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.APPLICATION_CLIENT_TYPE, JavaEEQuickPeek.JEE_5_0_ID, JavaEEQuickPeek.JEE_5_0_ID);
								archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
								wrapArchive(simpleArchive, new Path(J2EEConstants.APPLICATION_DD_URI));
								return simpleArchive;
							}
							case J2EEVersionConstants.WEB_TYPE: {
								JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.WEB_TYPE, JavaEEQuickPeek.WEB_2_5_ID, JavaEEQuickPeek.JEE_5_0_ID);
								archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
								wrapArchive(simpleArchive, new Path(J2EEConstants.WEBAPP_DD_URI));
								return simpleArchive;
							}
							}
						}
					} catch (ArchiveModelLoadException e) {
						org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin.logError(e);
					}
				}
			}
		}
		
		
		String[] deploymentDescriptorsToCheck = new String[] { J2EEConstants.APPLICATION_DD_URI, J2EEConstants.APP_CLIENT_DD_URI, J2EEConstants.EJBJAR_DD_URI, J2EEConstants.WEBAPP_DD_URI,
				J2EEConstants.RAR_DD_URI };
		int[] typeToVerify = new int[] { J2EEVersionConstants.APPLICATION_TYPE, J2EEVersionConstants.APPLICATION_CLIENT_TYPE, J2EEVersionConstants.EJB_TYPE, J2EEVersionConstants.WEB_TYPE,
				J2EEConstants.CONNECTOR_TYPE };
		for (int i = 0; i < deploymentDescriptorsToCheck.length; i++) {
			final int currentType = typeToVerify[i];
			final IPath deploymentDescriptorPath = new Path(deploymentDescriptorsToCheck[i]);
			IArchive wrappedForDD = wrapForDD(simpleArchive, currentType, deploymentDescriptorPath);
			if(wrappedForDD != null){
				return wrappedForDD;
			}
		}
		IPath archivePath = simpleArchive.getPath();
		if (archivePath == null) {
			Object obj = simpleArchive.getArchiveOptions().getOption(ArchiveOptions.ARCHIVE_PATH);
			if (null != obj) {
				archivePath = (IPath) obj;
			}
		}

		if (archivePath != null) {
			String lastSegment = archivePath.lastSegment().toLowerCase();
			if (lastSegment.endsWith(DOT_EAR)) {
				JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.APPLICATION_TYPE, JavaEEQuickPeek.JEE_5_0_ID, JavaEEQuickPeek.JEE_5_0_ID);
				archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
				wrapArchive(simpleArchive, new Path(J2EEConstants.APPLICATION_DD_URI));
				return simpleArchive;
			} else if (lastSegment.endsWith(DOT_WAR)) {
				JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.WEB_TYPE, JavaEEQuickPeek.WEB_2_5_ID, JavaEEQuickPeek.JEE_5_0_ID);
				archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
				wrapArchive(simpleArchive, new Path(J2EEConstants.WEBAPP_DD_URI));
				return simpleArchive;
			} else if (lastSegment.endsWith(DOT_JAR)) {
				IPath manifestPath = new Path(J2EEConstants.MANIFEST_URI);
				if (simpleArchive.containsArchiveResource(manifestPath)) {
					InputStream in = null;
					try {
						IArchiveResource manifestResource = simpleArchive.getArchiveResource(manifestPath);
						in = manifestResource.getInputStream();
						Manifest manifest = new Manifest(in);
						Attributes attributes = manifest.getMainAttributes();
						String mainClassName = attributes.getValue("Main-Class");
						if (mainClassName != null) {
							JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.APPLICATION_CLIENT_TYPE, JavaEEQuickPeek.JEE_5_0_ID, JavaEEQuickPeek.JEE_5_0_ID);
							archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
							wrapArchive(simpleArchive, new Path(J2EEConstants.APPLICATION_DD_URI));
							return simpleArchive;
						}
					} catch (FileNotFoundException e) {
						ArchiveUtil.warn(e);
					} catch (IOException e) {
						ArchiveUtil.warn(e);
					} finally {
						if (in != null) {
							try {
								in.close();
							} catch (IOException e) {
								ArchiveUtil.warn(e);
							}
						}
					}
				}
				Object discriminateEJB30 = simpleArchive.getArchiveOptions().getOption(DISCRIMINATE_EJB_ANNOTATIONS);
				if (null == discriminateEJB30 || ((Boolean) discriminateEJB30).booleanValue()) {
					if (isEJBArchive(simpleArchive)) {
						JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(JavaEEQuickPeek.EJB_TYPE, JavaEEQuickPeek.EJB_3_0_ID, JavaEEQuickPeek.JEE_5_0_ID);
						archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
						wrapArchive(simpleArchive, new Path(J2EEConstants.EJBJAR_DD_URI));
						return simpleArchive;
					}
				}

			}
		}

		return simpleArchive;
	}

	private IArchive wrapForDD(final IArchive simpleArchive, final int currentType, final IPath deploymentDescriptorPath) {
		if (simpleArchive.containsArchiveResource(deploymentDescriptorPath)) {
			InputStream in = null;
			IArchiveResource dd;
			try {
				dd = simpleArchive.getArchiveResource(deploymentDescriptorPath);
				in = dd.getInputStream();
				JavaEEQuickPeek quickPeek = new JavaEEQuickPeek(in);
				if (quickPeek.getType() == currentType && quickPeek.getVersion() != JavaEEQuickPeek.UNKNOWN){
					if(isBinary(simpleArchive) || !simpleArchive.containsModelObject(deploymentDescriptorPath)){
						archiveToJavaEEQuickPeek.put(simpleArchive, quickPeek);
						wrapArchive(simpleArchive, deploymentDescriptorPath);
						return simpleArchive;
					}
				}
			} catch (FileNotFoundException e) {
				ArchiveUtil.warn(e);
			} catch (IOException e) {
				ArchiveUtil.warn(e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						ArchiveUtil.warn(e);
					}
				}
			}
		}
		return null;
	}
		
	public static boolean isBinary(IArchive anArchive){
		IArchiveLoadAdapter loadAdapter = null;
		if(anArchive.getArchiveOptions().hasOption(WRAPPED_LOAD_ADAPTER)){
			loadAdapter = (IArchiveLoadAdapter)anArchive.getArchiveOptions().getOption(WRAPPED_LOAD_ADAPTER);
		} else {
			loadAdapter = (IArchiveLoadAdapter)anArchive.getArchiveOptions().getOption(ArchiveOptions.LOAD_ADAPTER);
		}
		if(loadAdapter instanceof JavaEEBinaryComponentLoadAdapter){
			return true;
		} else if(loadAdapter instanceof ZipFileArchiveLoadAdapterImpl){
			return true;
		}
		return false;
	}
	
	public static IArchive findArchive(Object modelObject){
		if(modelObject instanceof EObject){
			EObject eObject = (EObject)modelObject;
			return JavaEEEMFArchiveAdapterHelper.findArchive(eObject);
		}
		return null;
	}
	
	public static IVirtualComponent findComponent(IArchive anArchive){
		IArchiveLoadAdapter loadAdapter = null;
		if(anArchive.getArchiveOptions().hasOption(WRAPPED_LOAD_ADAPTER)){
			loadAdapter = (IArchiveLoadAdapter)anArchive.getArchiveOptions().getOption(WRAPPED_LOAD_ADAPTER);
		} else {
			loadAdapter = (IArchiveLoadAdapter)anArchive.getArchiveOptions().getOption(ArchiveOptions.LOAD_ADAPTER);
		}
		if(loadAdapter instanceof JavaEEBinaryComponentLoadAdapter){
			return ((JavaEEBinaryComponentLoadAdapter)loadAdapter).getArchiveComponent();
		}
		return null;
	}
	

	public static class JavaEEWrappingLoadAdapter implements IArchiveLoadAdapter {

		private IArchive simpleArchive;
		private IArchiveLoadAdapter simpleLoadAdapter;
		private IPath deploymentDescriptorPath;
		private JavaEEEMFArchiveAdapterHelper emfHelper;

		public JavaEEWrappingLoadAdapter(IArchive simpleArchive, IPath deploymentDescriptorPath) {
			this.simpleArchive = simpleArchive;
			this.simpleLoadAdapter = this.simpleArchive.getLoadAdapter();
			this.deploymentDescriptorPath = deploymentDescriptorPath;
			this.emfHelper = new JavaEEEMFArchiveAdapterHelper(this.simpleArchive);
		}

		public void close() {
			simpleLoadAdapter.close();
		}

		public boolean containsArchiveResource(IPath resourcePath) {
			return simpleLoadAdapter.containsArchiveResource(resourcePath);
		}

		public boolean containsModelObject(IPath modelObjectPath) {
			if (simpleLoadAdapter.containsArchiveResource(modelObjectPath)) {
				return true;
			}
			if (IArchive.EMPTY_MODEL_PATH == modelObjectPath) {
				modelObjectPath = deploymentDescriptorPath;
			}
			return emfHelper.containsModelObject(modelObjectPath);
		}

		public IArchiveResource getArchiveResource(IPath resourcePath) throws FileNotFoundException {
			return simpleLoadAdapter.getArchiveResource(resourcePath);
		}

		public List<IArchiveResource> getArchiveResources() {
			return simpleLoadAdapter.getArchiveResources();
		}

		public InputStream getInputStream(IArchiveResource archiveResource) throws IOException, FileNotFoundException {
			return simpleLoadAdapter.getInputStream(archiveResource);
		}

		public Object getModelObject(IPath modelObjectPath) throws ArchiveModelLoadException {
			if (simpleLoadAdapter.containsModelObject(modelObjectPath)) {
				return simpleLoadAdapter.getModelObject(modelObjectPath);
			}
			if (IArchive.EMPTY_MODEL_PATH == modelObjectPath) {
				modelObjectPath = deploymentDescriptorPath;
			}
			return emfHelper.getModelObject(modelObjectPath);
		}

		public IArchive getArchive() {
			return simpleLoadAdapter.getArchive();
		}

		public void setArchive(IArchive archive) {
			simpleLoadAdapter.setArchive(archive);
		}

		public IArchiveLoadAdapter getWrappedLoadAdatper() {
			return simpleLoadAdapter;
		}

		public String toString() {
			return simpleLoadAdapter.toString();
		}

	};

	private static void wrapArchive(final IArchive simpleArchive, final IPath deploymentDescriptorPath) {
		IArchiveLoadAdapter wrappingEMFLoadAdapter = new JavaEEWrappingLoadAdapter(simpleArchive, deploymentDescriptorPath);
		simpleArchive.getArchiveOptions().setOption(ArchiveOptions.LOAD_ADAPTER, wrappingEMFLoadAdapter);
		simpleArchive.getArchiveOptions().setOption(WRAPPED_LOAD_ADAPTER, simpleArchive.getLoadAdapter());
		((ArchiveImpl) simpleArchive).setLoadAdapter(wrappingEMFLoadAdapter);
	}

	private static final char[] RUNTIME_VISIBLE = "RuntimeVisibleAnnotations".toCharArray(); //$NON-NLS-1$

	private static final char[] STATELESS = "Ljavax/ejb/Stateless;".toCharArray();//$NON-NLS-1$

	private static final char[] STATEFUL = "Ljavax/ejb/Stateful;".toCharArray();//$NON-NLS-1$

	private static final char[] MESSAGEDRIVEN = "Ljavax/ejb/MessageDriven;".toCharArray();//$NON-NLS-1$

	public boolean isEJBArchive(IArchive archive) {
		// first check for the deployment descriptor
		if (archiveToJavaEEQuickPeek.containsKey(archive)) {
			JavaEEQuickPeek qp = JavaEEArchiveUtilities.INSTANCE.getJavaEEQuickPeek(archive);
			if (qp.getType() == JavaEEQuickPeek.EJB_TYPE) {
				return true;
			}
		}

		List<IArchiveResource> archiveResources = archive.getArchiveResources();
		for (IArchiveResource archiveResource : archiveResources) {
			if (archiveResource.getType() == IArchiveResource.FILE_TYPE) {
				if (archiveResource.getPath().lastSegment().endsWith(DOT_CLASS)) {
					InputStream ioStream = null;
					try {
						ioStream = archiveResource.getInputStream();
						IClassFileReader classFileReader = ToolFactory.createDefaultClassFileReader(ioStream, IClassFileReader.CLASSFILE_ATTRIBUTES);
						IClassFileAttribute[] attributes = classFileReader.getAttributes();
						for (IClassFileAttribute attribute : attributes) {
							char[] attributeName = attribute.getAttributeName();
							if (Arrays.equals(attributeName, RUNTIME_VISIBLE)) {
								IRuntimeVisibleAnnotationsAttribute annotationsAttribute = (IRuntimeVisibleAnnotationsAttribute) attribute;
								IAnnotation[] annotations = annotationsAttribute.getAnnotations();
								for (IAnnotation annotation : annotations) {
									char[] typedName = annotation.getTypeName();
									if (Arrays.equals(typedName, STATELESS) || Arrays.equals(typedName, STATEFUL) || Arrays.equals(typedName, MESSAGEDRIVEN)) {
										return true;
									}
								}
							}
						}
					} catch (FileNotFoundException e) {
						ArchiveUtil.warn(e);
					} catch (IOException e) {
						ArchiveUtil.warn(e);
					} finally {
						if (null != ioStream) {
							try {
								ioStream.close();
							} catch (IOException e) {
								ArchiveUtil.warn(e);
							}
						}
						ioStream = null;
					}
				}
			}
		}
		return false;
	}

	public Manifest getManifest(IArchive archive) {
		Manifest manifest = null;
		IPath manifestPath = new Path(J2EEConstants.MANIFEST_URI);
		if (archive.containsArchiveResource(manifestPath)) {
			InputStream in = null;
			try {
				IArchiveResource manifestResource = archive.getArchiveResource(manifestPath);
				in = manifestResource.getInputStream();
				manifest = new Manifest(in);
			} catch (FileNotFoundException e) {
				ArchiveUtil.warn(e);
			} catch (IOException e) {
				ArchiveUtil.warn(e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						ArchiveUtil.warn(e);
					}
				}
			}
		}
		return manifest;
	}
}
