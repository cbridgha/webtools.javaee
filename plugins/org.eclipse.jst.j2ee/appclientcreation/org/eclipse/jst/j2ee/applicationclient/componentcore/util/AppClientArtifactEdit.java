/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.applicationclient.componentcore.util;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jst.j2ee.application.ApplicationPackage;
import org.eclipse.jst.j2ee.application.Module;
import org.eclipse.jst.j2ee.client.ApplicationClient;
import org.eclipse.jst.j2ee.client.ApplicationClientResource;
import org.eclipse.jst.j2ee.client.ClientFactory;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.CommonarchiveFactory;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.OpenFailureException;
import org.eclipse.jst.j2ee.componentcore.EnterpriseArtifactEdit;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.archive.operations.AppClientComponentLoadStrategyImpl;
import org.eclipse.jst.j2ee.internal.common.XMLResource;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.wst.common.componentcore.ArtifactEdit;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.ModuleCoreNature;
import org.eclipse.wst.common.componentcore.UnresolveableURIException;
import org.eclipse.wst.common.componentcore.internal.ArtifactEditModel;
import org.eclipse.wst.common.componentcore.internal.StructureEdit;
import org.eclipse.wst.common.componentcore.internal.impl.ModuleURIUtil;
import org.eclipse.wst.common.componentcore.internal.util.IArtifactEditFactory;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;

public class AppClientArtifactEdit extends EnterpriseArtifactEdit implements IArtifactEditFactory {
	
	/**
	 * <p>
	 * Identifier used to link AppClientArtifactEdit to a AppClientEditAdapterFactory {@see
	 * AppClientEditAdapterFactory} stored in an AdapterManger (@see AdapterManager)
	 * </p>
	 */

	public static final Class ADAPTER_TYPE = AppClientArtifactEdit.class;

	/**
	 * 
	 */
	public AppClientArtifactEdit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param aHandle
	 * @param toAccessAsReadOnly
	 * @throws IllegalArgumentException
	 */
	public AppClientArtifactEdit(IProject aProject, boolean toAccessAsReadOnly) throws IllegalArgumentException {
		super(aProject, toAccessAsReadOnly);		
	}
	
	public AppClientArtifactEdit(IProject aProject, boolean toAccessAsReadOnly, boolean forCreate) throws IllegalArgumentException {
		super(aProject, toAccessAsReadOnly, forCreate, J2EEProjectUtilities.APPLICATION_CLIENT);		
	}

	public AppClientArtifactEdit(ArtifactEditModel anArtifactEditModel) {
		super(anArtifactEditModel);		
	}

	/**
	 * <p>Note: This method is for internal use only. Clients should not call this method.</p>
	 * @param aNature
	 * @param aModule
	 * @param toAccessAsReadOnly
	 */
	protected AppClientArtifactEdit(ModuleCoreNature aNature, IVirtualComponent aModule, boolean toAccessAsReadOnly) {
		super(aNature, aModule, toAccessAsReadOnly);		
	}
	
	/**
	 * <p>
	 * Retrieves the underlying resource from the ArtifactEditModel using defined URI.
	 * </p>
	 * 
	 * @return Resource
	 *  
	 */

	public Resource getDeploymentDescriptorResource() {
		return getArtifactEditModel().getResource(J2EEConstants.APP_CLIENT_DD_URI_OBJ);
	}
	
	/**
	 * <p>
	 * Obtains the ApplicationClient (@see ApplicationClient) root object from the ApplicationClientResource. If the root object does
	 * not exist, then one is created (@link addAppClientJarIfNecessary(getAppClientXmiResource())).
	 * The root object contains all other resource defined objects.
	 * </p>
	 * 
	 * @return EObject
	 *  
	 */
	public EObject getDeploymentDescriptorRoot() {
		List contents = getDeploymentDescriptorResource().getContents();
		if (contents.size() > 0)
			return (EObject) contents.get(0);
		addAppClientIfNecessary(getApplicationClientXmiResource());
		return (EObject) contents.get(0);
	}
	
	/**
	 * 
	 * @return ApplicationClientResource from (@link getDeploymentDescriptorResource())
	 *  
	 */

	public ApplicationClientResource getApplicationClientXmiResource() {
		return (ApplicationClientResource) getDeploymentDescriptorResource();
	}
	
	/**
	 * <p>
	 * Creates a deployment descriptor root object (ApplicationClient) and populates with data. Adds the root
	 * object to the deployment descriptor resource.
	 * </p>
	 * 
	 * <p>
	 * 
	 * @param aModule
	 *            A non-null pointing to a {@see XMLResource}
	 * 
	 * Note: This method is typically used for JUNIT - move?
	 * </p>
	 */
	protected void addAppClientIfNecessary(XMLResource aResource) {

		if (aResource != null && aResource.getContents().isEmpty()) {
			ApplicationClient appClient = ClientFactory.eINSTANCE.createApplicationClient();
			aResource.getContents().add(appClient);
			URI moduleURI = getArtifactEditModel().getModuleURI();
			try {
				appClient.setDisplayName(StructureEdit.getDeployedName(moduleURI));
			} catch (UnresolveableURIException e) {
				//Ignore
			}
			aResource.setID(appClient, J2EEConstants.APP_CLIENT_ID);
			//TODO add more mandatory elements
		}
	}
	
	/**
	 * <p>
	 * Method used for adding a j2ee project to an ear project; subclasses must override to create a
	 * new instance of the correct kind of Module
	 * </p>
	 */
	public Module createNewModule() {
		return ((ApplicationPackage) EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI)).getApplicationFactory().createJavaClientModule();
	}
	
	/**
	 * 
	 * @return ApplicationClient from (@link getDeploymentDescriptorRoot())
	 *  
	 */
	public ApplicationClient getApplicationClient() {
		return (ApplicationClient) getDeploymentDescriptorRoot();
	}
	
	/**
	 * <p>
	 * Retrieves J2EE version information from ApplicationClientResource.
	 * </p>
	 * 
	 * @return an integer representation of a J2EE Spec version
	 *  
	 */

	public int getJ2EEVersion() {
		return getApplicationClientXmiResource().getJ2EEVersionID();
	}
	
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchComponent}. Instances of ArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an ArtifactEdit facade for a specific {@see WorkbenchComponent}&nbsp;that
	 * will not be used for editing. Invocations of any save*() API on an instance returned from
	 * this method will throw exceptions.
	 * </p>
	 * <p>
	 * <b>The following method may return null. </b>
	 * </p>
	 * 
	 * @param aModule
	 *            A valid {@see WorkbenchComponent}&nbsp;with a handle that resolves to an
	 *            accessible project in the workspace
	 * @return An instance of ArtifactEdit that may only be used to read the underlying content
	 *         model
	 */
	public static AppClientArtifactEdit getAppClientArtifactEditForRead(IProject aProject) {
		AppClientArtifactEdit artifactEdit = null;
		try {
			if (isValidApplicationClientModule(ComponentCore.createComponent(aProject))) 
				artifactEdit = new AppClientArtifactEdit(aProject, true, false);
		} catch (Exception e) {
			artifactEdit = null;
		}
		return artifactEdit;
	}
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchComponent}. Instances of ArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an ArtifactEdit facade for a specific {@see WorkbenchComponent}&nbsp;that
	 * will be used for editing.
	 * </p>
	 * <p>
	 * <b>The following method may return null. </b>
	 * </p>
	 * 
	 * @param aModule
	 *            A valid {@see WorkbenchComponent}&nbsp;with a handle that resolves to an
	 *            accessible project in the workspace
	 * @return An instance of ArtifactEdit that may be used to modify and persist changes to the
	 *         underlying content model
	 */
	public static AppClientArtifactEdit getAppClientArtifactEditForWrite(IProject aProject) {
		AppClientArtifactEdit artifactEdit = null;
		try {
			if (isValidApplicationClientModule(ComponentCore.createComponent(aProject)))
				artifactEdit = new AppClientArtifactEdit(aProject, false, false);
		} catch (Exception e) {
			artifactEdit = null;
		}
		return artifactEdit;
	}
	
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchComponent}. Instances of AppClientArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an AppClientArtifactEdit facade for a specific {@see WorkbenchComponent}&nbsp;that will not
	 * be used for editing. Invocations of any save*() API on an instance returned from this method
	 * will throw exceptions.
	 * </p>
	 * <p>
	 * <b>This method may return null. </b>
	 * </p>
	 * <p>Note: This method is for internal use only. Clients should not call this method.</p>
	 * @param aModule
	 *            A valid {@see WorkbenchComponent}&nbsp;with a handle that resolves to an accessible
	 *            project in the workspace
	 * @return An instance of AppClientArtifactEdit that may only be used to read the underlying content
	 *         model
	 * @throws UnresolveableURIException
	 *             could not resolve uri.
	 */
	public static AppClientArtifactEdit getAppClientArtifactEditForRead(IVirtualComponent aModule) {
		if (aModule == null)
			return null;
		return getAppClientArtifactEditForRead(aModule.getProject());
	}
	
	/**
	 * <p>
	 * Returns an instance facade to manage the underlying edit model for the given
	 * {@see WorkbenchComponent}. Instances of AppClientArtifactEdit that are returned through this method
	 * must be {@see #dispose()}ed of when no longer in use.
	 * </p>
	 * <p>
	 * Use to acquire an AppClientArtifactEdit facade for a specific {@see WorkbenchComponent}&nbsp;that
	 * will be used for editing.
	 * </p>
	 * <p>
	 * <b>This method may return null. </b>
	 * </p>
	 * <p>Note: This method is for internal use only. Clients should not call this method.</p>
	 * @param aModule
	 *            A valid {@see WorkbenchComponent}&nbsp;with a handle that resolves to an accessible
	 *            project in the workspace
	 * @return An instance of AppClientArtifactEdit that may be used to modify and persist changes to the
	 *         underlying content model
	 */
	public static AppClientArtifactEdit getAppClientArtifactEditForWrite(IVirtualComponent aModule) {
		if (aModule == null)
			return null;
		return getAppClientArtifactEditForWrite(aModule.getProject());
	}
	
	/**
	 * <p>Note: This method is for internal use only. Clients should not call this method.</p>
	 * @param module
	 *            A {@see WorkbenchComponent}
	 * @return True if the supplied module
	 *         {@see ArtifactEdit#isValidEditableModule(WorkbenchComponent)}and the moduleTypeId is a
	 *         JST module
	 */
	public static boolean isValidApplicationClientModule(IVirtualComponent aModule) throws UnresolveableURIException {
		if (!isValidEditableModule(aModule))
			return false;
		return J2EEProjectUtilities.isApplicationClientProject(aModule.getProject());
	}

	public EObject createModelRoot() {
	    return createModelRoot(getJ2EEVersion());
	}
    /* (non-Javadoc)
     * @see org.eclipse.jst.j2ee.internal.modulecore.util.EnterpriseArtifactEdit#createModelRoot(java.lang.Integer)
     */
    public EObject createModelRoot(int version) {
        ApplicationClientResource res = (ApplicationClientResource)getDeploymentDescriptorResource();
		res.setModuleVersionID(version);
	    addAppClientIfNecessary(res);
		return ((ApplicationClientResource)getDeploymentDescriptorResource()).getRootObject();
    }

	public ArtifactEdit createArtifactEditForRead(IVirtualComponent aComponent) {
		
		return getAppClientArtifactEditForRead(aComponent);
	}

	public ArtifactEdit createArtifactEditForWrite(IVirtualComponent aComponent) {
		
		return getAppClientArtifactEditForWrite(aComponent);
	}

	public Archive asArchive(boolean includeSource) throws OpenFailureException{
		AppClientComponentLoadStrategyImpl loader = new AppClientComponentLoadStrategyImpl(getComponent());
		loader.setExportSource(includeSource);
		String uri = ModuleURIUtil.getHandleString(getComponent());
		return CommonarchiveFactory.eINSTANCE.openApplicationClientFile(loader, uri);
	}
	
	public static void createDeploymentDescriptor(IProject project, int version) {
		AppClientArtifactEdit appClientEdit = new AppClientArtifactEdit(project,false,true);
		try {
			appClientEdit.createModelRoot(version);
			appClientEdit.save(null);
		} finally {
			appClientEdit.dispose();
		} 
	}
}
