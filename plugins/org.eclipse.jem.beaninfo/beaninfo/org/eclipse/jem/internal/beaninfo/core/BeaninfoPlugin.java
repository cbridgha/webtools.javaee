/*******************************************************************************
 * Copyright (c) 2001, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jem.internal.beaninfo.core;
/*


 */


import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import org.eclipse.jem.internal.beaninfo.adapters.BeaninfoNature;
import org.eclipse.jem.internal.proxy.core.*;
import org.eclipse.jem.internal.proxy.core.ContainerPathContributionMapping.ContainerContributionEntry;
import org.eclipse.jem.internal.proxy.core.IConfigurationContributionInfo.ContainerPaths;
import org.eclipse.jem.java.JavaClass;
import org.eclipse.jem.util.logger.proxy.Logger;
import org.eclipse.jem.util.logger.proxyrender.EclipseLogger;
import org.eclipse.jem.util.plugin.JEMUtilPlugin;


/**
 * The plugin class for the org.eclipse.jem.internal.proxy.core plugin.
 */

public class BeaninfoPlugin extends Plugin {
	public static final String PI_BEANINFO_PLUGINID = "org.eclipse.jem.beaninfo";	// Plugin ID, used for QualifiedName. //$NON-NLS-1$
	public static final String PI_BEANINFO_OVERRIDES = "overrides";	// ID of the overrides extension point. //$NON-NLS-1$
	
	private static BeaninfoPlugin BEANINFO_PLUGIN = null;
		
	public BeaninfoPlugin() {	
		BEANINFO_PLUGIN = this;
	}
	
	/**
	 * Accessor method to get the singleton plugin.
	 */
	public static BeaninfoPlugin getPlugin() {
		return BEANINFO_PLUGIN;
	}
	
	/**
	 * Special Override file name used when need to apply an override to a class that is at the root.
	 * A root is one that doesn't have a super type. These are <code>java.lang.Object</code>, interfaces, and any
	 * undefined classes (i.e. classes that don't actually exist).
	 */
	public static final String ROOT = "..ROOT.."; //$NON-NLS-1$
	

	/**
	 * Special override scheme to refer to the current java class. (As in "X:ROOT#//@root").
	 * @since 1.2.0
	 */
	public static final String ROOT_SCHEMA = "X"; //$NON-NLS-1$
	
	/**
	 * Special override opaque part to refer to the current java class. (As in "X:ROOT#//@root").
	 * @since 1.2.0
	 */
	public static final String ROOT_OPAQUE = "ROOT"; //$NON-NLS-1$
	
	/**
	 * The extension used on any override file when you pass in a path through the method that takes a string.
	 */
	public static final String OVERRIDE_EXTENSION = "override";	//$NON-NLS-1$
		
	
	/*
	 * Map of open natures. This map is needed because on shutdown of beaninfo plugin we need
	 * to shutdown the natures. If we don't do that there is a slight possibility of an error
	 * because proxy plugin will shutdown and this can cause a callback into beaninfo which has
	 * already been shutdown. It calls back through the registry listener that BeaninfoNature
	 * added to the registry to notify that the registry is being shutdown.
	 * 
	 * Also BeanInfoCacheController needs to know so that it can tell it the project is closing or
	 * being deleted or that it needs to be cleared due to a clear request.
	 */
	private Map openNatures;
	
	private ContainerPathContributionMapping beaninfoEntryContributionsMapping;
	private ContainerPathContributionMapping contributorContributionsMapping;
	private Map pluginToBeaninfoEntryContributions;
	private Map pluginToContributors;
	
	/*
	 * Override contributions from extension point.
	 * ocFragments: Array of fragments paths. When a match is found for a path, the index
	 * 		is the index into the ocContainerIds and ocPluginIds array for the contributions.
	 * ocContainerIds: The first dimension is the index of the fragment that the list of OverrideContributions is for.
	 * 		The second dimension is the array of contributions for that fragment, one per container id.
	 * ocPluginIds: The first dimension is the index of the fragment that the list of OverrideContributions is for.
	 * 		The second dimension is the array of contributions for that fragment, one per plugin id.
	 * 
	 * If a particular fragment doesn't have any entries of container and/or plugin, then EMPTY_OC is used for that
	 * entry so that we don't need to check for null.
	 * 
	 * How this is used is for a particular path requested, the ocFragments will be searched for the fragments that
	 * are appropriate, then the index of the entry is used to walk through the OC[] array returned from the ocContainerIds
	 * or ocPluginIds. Each contribution would be checked to see if the container id/plugin id is in the visible classpath (through 
	 * the info data stored in the persistent property). If it is, then the overrides from that contribution will be used.
	 */
	private IPath ocFragments[];
	private OverrideContribution[][] ocContainerIds;
	private OverrideContribution[][] ocPluginIds;
	
	private static final OverrideContribution[] EMPTY_OC = new OverrideContribution[0];	// Used for an empty contribution list for a fragment.

	public synchronized BeaninfoEntry[] getContainerIdBeanInfos(String containerID, String[] containerPaths) {
		if (beaninfoEntryContributionsMapping == null)
			processBeanInfoContributionExtensionPoint();
		return (BeaninfoEntry[]) beaninfoEntryContributionsMapping.getContributors(containerID, containerPaths);
	}
	
	public synchronized BeaninfoEntry[] getPluginBeanInfos(String pluginid) {
		if (pluginToBeaninfoEntryContributions == null)
			processBeanInfoContributionExtensionPoint();
		return (BeaninfoEntry[]) pluginToBeaninfoEntryContributions.get(pluginid);
	}
	
	public synchronized IConfigurationElement[] getPluginContributors(String pluginid) {
		if (pluginToContributors == null)
			processBeanInfoContributionExtensionPoint();
		return (IConfigurationElement[]) pluginToContributors.get(pluginid);
	}	
	
	public synchronized IConfigurationElement[] getContainerIdContributors(String containerID, String[] containerPaths) {
		if (contributorContributionsMapping == null)
			processBeanInfoContributionExtensionPoint();
		return (IConfigurationElement[]) contributorContributionsMapping.getContributors(containerID, containerPaths);
	}	
	
	public static final String PI_BEANINFO_CONTRIBUTION_EXTENSION_POINT = PI_BEANINFO_PLUGINID+".registrations"; //$NON-NLS-1$
	public static final String PI_REGISTRATION = "registration"; //$NON-NLS-1$
	public static final String PI_BEANINFO = "beaninfo";  //$NON-NLS-1$
	public static final String PI_OVERRIDE = "override"; //$NON-NLS-1$
	public static final String PI_CONTRIBUTOR = "contributor"; //$NON-NLS-1$
	public static final String PI_PACKAGE = "package"; //$NON-NLS-1$
	public static final String PI_PATH = "path"; //$NON-NLS-1$
	
	protected synchronized void processBeanInfoContributionExtensionPoint() {
		ContributorExtensionPointInfo info = ProxyPlugin.processContributionExtensionPoint(PI_BEANINFO_CONTRIBUTION_EXTENSION_POINT);
		ConfigurationElementReader reader = new ConfigurationElementReader();
		// Process the container IDs first. We can't use the info directly because the actual configuration elements of interest are
		// sub-elements of the info. The info contains the container path that we need.
		beaninfoEntryContributionsMapping = new ContainerPathContributionMapping(BeaninfoEntry.class);
		contributorContributionsMapping = new ContainerPathContributionMapping(IConfigurationElement.class);

		Map fragmentsToIds = new HashMap();
		for (Iterator iter = info.containerPathContributions.containerIdToContributions.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry= (Map.Entry) iter.next();
			String containerid = (String) entry.getKey();
			ContainerContributionEntry[] contribElements = (ContainerContributionEntry[]) entry.getValue();
			for (int i = 0; i < contribElements.length; i++) {
				ContainerContributionEntry contribElement = contribElements[i];
				IConfigurationElement element = (IConfigurationElement) contribElement.getContribution();
				if (PI_REGISTRATION.equals(element.getName())) {
					IConfigurationElement[] children = element.getChildren();
					for (int j = 0; j < children.length; j++) {
						IConfigurationElement child = children[j];
						if (PI_BEANINFO.equals(child.getName())) {
							// This is a beaninfo entry
							BeaninfoEntry be = BeaninfoEntry.readEntry(reader, child, null);
							if (be != null)
								beaninfoEntryContributionsMapping.addContribution(containerid, contribElement.getContainerPathPattern(), be);
						} else if (PI_OVERRIDE.equals(child.getName())) {
							addOverrideEntry(fragmentsToIds, true, containerid, contribElement.getContainerPathPattern(), child);
						}
					}
				} else if (PI_CONTRIBUTOR.equals(element.getName())) {
					contributorContributionsMapping.addContribution(containerid, contribElement.getContainerPathPattern(), element);
				}
			}
		}
			
		beaninfoEntryContributionsMapping.finalizeMapping();
		contributorContributionsMapping.finalizeMapping();
		
		// Now process the plugin IDs.
		pluginToBeaninfoEntryContributions = new HashMap(info.pluginToContributions.size());		
		for (Iterator iter = info.pluginToContributions.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry= (Map.Entry) iter.next();
			String pluginId = (String) entry.getKey();
			IConfigurationElement[] configElements = (IConfigurationElement[]) entry.getValue();
			for (int i = 0; i < configElements.length; i++) {
				IConfigurationElement element = configElements[i];
				if (PI_REGISTRATION.equals(element.getName())) {
					IConfigurationElement[] children = element.getChildren();
					for (int j = 0; j < children.length; j++) {
						IConfigurationElement child = children[j];
						if (PI_BEANINFO.equals(child.getName())) {
							// This is a beaninfo entry
							BeaninfoEntry be = BeaninfoEntry.readEntry(reader, child, null);
							if (be != null)
								addEntry(pluginToBeaninfoEntryContributions, pluginId, be);
						} else if (PI_OVERRIDE.equals(child.getName())) {
							addOverrideEntry(fragmentsToIds, false, pluginId, null, child);
						}
					}
				} else if (PI_CONTRIBUTOR.equals(element.getName())) {
						if (pluginToContributors == null)
							pluginToContributors = new HashMap(5);	// These are rare, don't create until necessary.
						addEntry(pluginToContributors, pluginId, element);
					}
				}
			}
			
		// Now go through and turn all of the contribution lists into arrays.
		for (Iterator iter = pluginToBeaninfoEntryContributions.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();
			entry.setValue(((List) entry.getValue()).toArray(new BeaninfoEntry[((List) entry.getValue()).size()]));
		}
		
		if (pluginToContributors == null)
				pluginToContributors = Collections.EMPTY_MAP;	// Since we don't have any.
		else {
			for (Iterator iter = pluginToContributors.entrySet().iterator(); iter.hasNext();) {
				Map.Entry entry = (Map.Entry) iter.next();
				entry.setValue(((List) entry.getValue()).toArray(new IConfigurationElement[((List) entry.getValue()).size()]));
			}			
		}
		
		// Now handle the entire list of fragments.
		ocFragments = new IPath[fragmentsToIds.size()];
		ocContainerIds = new OverrideContribution[ocFragments.length][];
		ocPluginIds = new OverrideContribution[ocFragments.length][];
		Iterator iter;
		int fragIndex;
		for (iter = fragmentsToIds.entrySet().iterator(), fragIndex=0; iter.hasNext(); fragIndex++) {
			Map.Entry mapEntry = (Map.Entry) iter.next();
			ocFragments[fragIndex] = (IPath) mapEntry.getKey();
			Map[] mapValue = (Map[]) mapEntry.getValue();
			if (mapValue[0] == null)
				ocContainerIds[fragIndex] = EMPTY_OC;
			else {
				Map containers = mapValue[0];
				List ocContributions = new ArrayList();
				for (Iterator ocIterator = containers.entrySet().iterator(); ocIterator.hasNext();) {
					Map.Entry containerEntry = (Map.Entry) ocIterator.next();
					String containerID = (String) containerEntry.getKey();
					for (Iterator patternIterator = ((Map) containerEntry.getValue()).entrySet().iterator(); patternIterator.hasNext();) {
						Map.Entry patternEntry = (Entry) patternIterator.next();
						OverrideContribution oc = new OverrideContribution();
						oc.id = containerID;
						oc.pattern = (Pattern) patternEntry.getKey();
						List[] ocLists = (List[]) patternEntry.getValue();
						oc.pluginIds = (String[]) ocLists[0].toArray(new String[ocLists[0].size()]);
						oc.paths = (String[]) ocLists[1].toArray(new String[ocLists[1].size()]);
						ocContributions.add(oc);
					}
				}
				ocContainerIds[fragIndex] = (OverrideContribution[]) ocContributions.toArray(new OverrideContribution[ocContributions.size()]);
			}
			if (mapValue[1] == null)
				ocPluginIds[fragIndex] = EMPTY_OC;
			else {
				Map plugins = mapValue[1];
				OverrideContribution[] ocContribution = ocPluginIds[fragIndex] = new OverrideContribution[plugins.size()];
				int ocIndex;
				Iterator ocIterator;
				for (ocIterator = plugins.entrySet().iterator(), ocIndex=0; ocIterator.hasNext(); ocIndex++) {
					Map.Entry pluginEntry = (Map.Entry) ocIterator.next();
					OverrideContribution oc = ocContribution[ocIndex] = new OverrideContribution();
					oc.id = (String) pluginEntry.getKey();
					List[] ocLists = (List[]) pluginEntry.getValue();
					oc.pluginIds = (String[]) ocLists[0].toArray(new String[ocLists[0].size()]);
					oc.paths = (String[]) ocLists[1].toArray(new String[ocLists[1].size()]);
				}
			}			
		}
	}
	
	/*
	 * Add an entry to the map. If the key doesn't exist, create an entry as an array. Then add the entry to array.
	 */
	private void addEntry(Map map, Object key, Object entry) {
		List mapEntry = (List) map.get(key);
		if (mapEntry == null) {
			mapEntry = new ArrayList(1);
			map.put(key, mapEntry);
		}
		mapEntry.add(entry);
	}
	
	/*
	 * Add an entry to the map.
	 * id is the container path pattern/plugin id.
	 * 
	 * The structure of the map is:
	 * 	key: fragment name
	 * 	value: Map[2], where [0] is for container id, and [1] is for plugin ids.
	 * 		Map[x]:
	 * 			key: container/plugin id
	 * 			value: Map(pattern->List(FinalOverride)) for container, of FinalOverride for plugin. 
	 * 
	 * FinalOverride: List[2], where [0] is list of plugin ids for the override, and [1] is list of paths for the override files relative to that plugin id.
	 * 
	 * After all done these maps/list will be boiled down to the arrays that will be used for lookup.
	 */
	private void addOverrideEntry(Map map, boolean container, Object id, Pattern pattern, IConfigurationElement entry) {
		
		String packageName = entry.getAttribute(PI_PACKAGE);
		String plugin = null;
		String pathString = entry.getAttribute(PI_PATH);
		IPath fragment = null; 
		if (packageName != null && packageName.length() > 0 && pathString != null && pathString.length() > 0) { 
			fragment = new Path(packageName.replace('.', '/'));
			if (pathString.charAt(pathString.length()-1) != '/')
				pathString += '/';
			if (pathString.charAt(0) != '/')
				plugin = entry.getDeclaringExtension().getContributor().getName();
			else {
				if (pathString.length() > 4) {
					int pend = pathString.indexOf('/', 1);
					if (pend == -1 || pend >= pathString.length()-1)
						return;	// invalid
					plugin = pathString.substring(1, pend);
					pathString = pathString.substring(pend+1);
				} else
					return;	// invalid
			}
		}
		if (pathString.length() < 2)
			return;	// invalid

		Map[] mapEntry = (Map[]) map.get(fragment);
		if (mapEntry == null) {
			mapEntry = new HashMap[2];
			map.put(fragment, mapEntry);
		}
		List[] idEntry;
		if (container) {
			if (mapEntry[0] == null)
				mapEntry[0] = new HashMap(2);
			
			Map patternMap = (Map) mapEntry[0].get(id);
			if (patternMap == null)
				mapEntry[0].put(id, patternMap = new HashMap());
			
			idEntry = (List[]) patternMap.get(pattern);
			if (idEntry == null) {
				patternMap.put(pattern, idEntry = new List[] { new ArrayList(1), new ArrayList(1)});
			}
		} else {
			if (mapEntry[1] == null)
				mapEntry[1] = new HashMap(2);

			idEntry = (List[]) mapEntry[1].get(id);
			if (idEntry == null) {
				mapEntry[1].put(id, idEntry = new List[] { new ArrayList(1), new ArrayList(1)});
			}
		}
		idEntry[0].add(plugin);
		idEntry[1].add(pathString);


	}	
			
	/*
	 * This is an list of overrides that are available as a contribution for a specific fragment.
	 * <ul>
	 * <li>The id of this contribution. Either container (Pattern) or plugin id depending on which list it was in..
	 * <li>The plugins array lists the plugin ids for all of the paths in this contribution.
	 * <li>The paths array lists the folder path under that corresponding plugin from "pluginIds".
	 * </ul> 
	 * <p>
	 * 
	 * @since 1.0.0
	 */
	private static class OverrideContribution {
		public String id;
		public Pattern pattern;	// Used only for containers.
		public String[] pluginIds;
		public String[] paths;
	}
	
	/**
	 * The runnable is to used to apply override. 
	 * <p>
	 * This will be called in sequence for each override path found. It is send in on the apply overrides call. This
	 * interface implementation is private.
	 * <p>
	 * Clients (implementers of the IBeanInfoContributor) will be passed in the subinterface <code>IContributorOverrideRunnable</code> which
	 * inherits from this interface.
	 * <p>
	 * This interface is not intended to be implemented by clients. 
	 * 
	 * @since 1.0.0
	 * @see BeaninfoPlugin#applyOverrides(IProject, String, String, ResourceSet, IOverrideRunnable)
	 */
	public interface IOverrideRunnable {
		/**
		 * This will be called with the directory path to use. It will be called over and over for every
		 * override path found for a package. The path will be complete, including trailing '/'.
		 * It will be in a URI format for a directory. The overriderunnable implementation will then append the filename call (i.e. classbeingintrospected.override) to get a complete path.
		 * <p>
		 * Clients (IBeanInfoContributor implementers) can call this to apply a specific override file to the current
		 * class being processed.
		 * 
		 * @param overridePath the path will be complete, including trailing '/'. It will be in a URI format for a directory. The override file name (classname.override) will be appended to this and retrieved and applied.
		 * 
		 * @since 1.0.0
		 */
		public void run(String overridePath);
		
		/**
		 * This will be called with the actual resource to use. This will be called by special contributors that want
		 * a special explicit override resource to be used.
		 * <p>
		 * Contributors should use the ResourceSet that was passed into them. This is so that anything java class that
		 * the override resource points to will be found.
		 * <p>
		 * This resource will be automatically removed by BeanInfo after being applied. It must not be left around because
		 * in the process of being applied it will be modified, so it could not be reused. 
		 *  
		 * @param overrideResource the resource to apply to the current class. NOTE: This resource WILL be removed from
		 * the resource set it is in automatically by this call. It won't be left around because the action of apply
		 * will actually modify the resource.
		 * 
		 * @since 1.0.0
		 */
		public void run(Resource overrideRes);
	}
	
	/**
	 * IBeanInfoContributor runnable to use to apply overrides.
	 * <p>
	 * An implementation of this will be passed in to IBeanInfoContributor's so that they can call back to apply the overrides. They
	 * should call the appropriate run method once for each override to be applied. The run can be called more than once from each IBeanInfoContributor.
	 * <p>
	 * It inherits from <code>IOverrideRunnable</code>, so see that for more methods to call.
	 * <p>
	 * This interface is not intended to be implemented by clients.
	 * 
	 * @see BeaninfoPlugin.IOverrideRunnable for more methods that can be called.
	 * @since 1.0.0
	 */
	public interface IContributorOverrideRunnable extends IOverrideRunnable {
		
		/**
		 * Tests if path has already been contributed once for the current class.
		 * <p>
		 * This can be called by the IBeanInfoContributor for overrides to test if the path (same path as for the IOverrideRunnable.run(String) method)
		 * has already been contributed once for this class. It can be used to save time. However it is not necessary because
		 * BeanInfo will not permit it to be contributed more than once for a class.
		 * 
		 * @param path
		 * @return <code>true</code> if used already.
		 * 
		 * @see IOverrideRunnable#run(String)
		 * @since 1.0.0
		 */
		public boolean pathContributed(String path);
		
		/**
		 * Tests if the URI has already been contributed once for the current class.
		 * <p>
		 * This can be called by an IBeanInfoContributor for overrides to see if the URI (same path as the URI from the IOverrideRunnable.run(Resource) method)
		 * has already been contributed once for this class. It can be used to save time. However, not necessary because
		 * BeanInfo will not permit the URI to be contributed more than once for a class.
		 * 
		 * @param resourceURI
		 * @return <code>true</code> if used already.
		 * 
		 * @see IOverrideRunnable#run(Resource)
		 * @since 1.0.0
		 */
		public boolean resourceContributed(URI resourceURI);
	}
	
	private static final String[] NO_PATHS = new String[0];
	
	/**
	 * Return just the contributed override paths (through the BeanInfo registrations). Does not include any paths that are contributed from
	 * IBeanInfoContributor's. This is used by the BeanInfoClassAdapter to load the overrides files into one cache file so that it can
	 * be done at one time the next time it is needed.
	 * 
	 * @param project
	 * @param packageName
	 * @return array of path strings to the override. The files may not exist, they is just possible overrides. 
	 * 
	 * @since 1.1.0
	 */
	public String[] getOverridePaths(IProject project, String packageName) {
		final IPath packagePath = new Path(packageName.replace('.', '/')+'/');
		List overridePaths = new ArrayList();
		try {
			IConfigurationContributionInfo info = (IConfigurationContributionInfo) project.getSessionProperty(BeaninfoNature.CONFIG_INFO_SESSION_KEY);
			if (info == null) {
				// It hasn't been created yet, so we need to create our own internal version here.
				info = ProxyLaunchSupport.createDefaultConfigurationContributionInfo(JavaCore.create(project));					
				BeaninfoNature.computeBeanInfoConfigInfo(info);
			}
			synchronized (this) {
				if (ocFragments == null)
					processBeanInfoContributionExtensionPoint(); // We haven't processed them yet.
			}
			
			// Cache of tested patterns. (Pattern->Boolean). If a pattern has been tested against all visible container paths we don't need to test the
			// pattern again if it is found again. (Note: This works for efficiency because ProxyPlugin uses the same pattern instance for
			// same pattern found while processing one extension point). The value is true if the pattern matches a visible container path.
			Map testedPatterns = new HashMap();	
			for (int fragmentIndex = 0; fragmentIndex < ocFragments.length; fragmentIndex++) {
				if (ocFragments[fragmentIndex].isPrefixOf(packagePath)) {
					String leftOver = null;	// The left over portion of the package. This will be set first time needed. 
					OverrideContribution[] cntrContributions = ocContainerIds[fragmentIndex];
					for (int ocindex = 0; ocindex < cntrContributions.length; ocindex++) {
						OverrideContribution contribution = cntrContributions[ocindex];
						Boolean tested = (Boolean) testedPatterns.get(contribution.pattern);
						if (tested == null) {
							tested = Boolean.FALSE;
							ContainerPaths containerPaths = (ContainerPaths) info.getContainerIds().get(contribution.id);
							if (containerPaths != null) {
								String[] visible = containerPaths.getVisibleContainerPaths();
								for (int i = 0; i < visible.length; i++) {
									if (contribution.pattern.matcher(visible[i]).matches()) {
										tested = Boolean.TRUE;
										break;
									}
								}
							}
							testedPatterns.put(contribution.pattern, tested);
						}
						
						if (tested.booleanValue()) {
							for (int cindex = 0; cindex < contribution.pluginIds.length; cindex++) {
								// Because of URIConverters and normalization in org.eclipse.jem.util stuff, we
								// need to have plugin uri's in the form "platform:/plugin/pluginname".
								// Bundle's don't return this format. They return bundle:/stuff
								// So we will simple create it of the platform:/plugin format.
								// To save time, we will first see if we have the bundle.
								Bundle bundle = Platform.getBundle(contribution.pluginIds[cindex]);
								if (bundle != null) {
									if (leftOver == null)
										leftOver = getLeftOver(ocFragments[fragmentIndex], packagePath);
									overridePaths.add(JEMUtilPlugin.PLATFORM_PROTOCOL+":/"+JEMUtilPlugin.PLATFORM_PLUGIN+'/'+bundle.getSymbolicName()+'/'+contribution.paths[cindex]+leftOver); //$NON-NLS-1$
								}
							}
						}
					}
					
					OverrideContribution[] pluginContributions = ocPluginIds[fragmentIndex];
					for (int ocindex = 0; ocindex < pluginContributions.length; ocindex++) {
						OverrideContribution contribution = pluginContributions[ocindex];
						Boolean visible = (Boolean) info.getPluginIds().get(contribution.id);
						if (visible != null && visible.booleanValue()) {
							for (int cindex = 0; cindex < contribution.pluginIds.length; cindex++) {
								Bundle bundle = Platform.getBundle(contribution.pluginIds[cindex]);
								if (bundle != null) {
									if (leftOver == null)
										leftOver = getLeftOver(ocFragments[fragmentIndex], packagePath);
									overridePaths.add(JEMUtilPlugin.PLATFORM_PROTOCOL+":/"+JEMUtilPlugin.PLATFORM_PLUGIN+'/'+bundle.getSymbolicName()+'/'+contribution.paths[cindex]+leftOver); //$NON-NLS-1$
								}
							}
						}
					}
				}
			}
		} catch (CoreException e) {
			getLogger().log(e, Level.INFO);
		}
		return overridePaths.isEmpty() ? NO_PATHS : (String[]) overridePaths.toArray(new String[overridePaths.size()]);
	}
	
	/**
	 * Apply the runnable to all of the override paths that are applicable to the 
	 * given package name. It will run through the explicit contributors and the IContainers that implement IBeanInfoContributor.
	 * <p>
	 * The package name uses '.' to delineate the fragments of the name,
	 * i.e. use "<code>java.lang</code>" as a package name.
	 * <p>
	 * Note: This is not meant to be called by clients. It is public only because an internal class in another package needs to call it.
	 * TODO This should be package-protected. Later the other class will be moved into this package.
	 * 
	 * @param project the project to run against.
	 * @param packageName
	 * @param className class name of the class that is being overridden.
	 * @param javaClass the java class the overrides will be applied to.
	 * @param resource set that contributors can use to temporarily load dynamic override files.
	 * @param runnable use this runnable to actually apply overrides.
	 * 
	 * @since 1.0.0
	 */
	public void applyOverrides(final IProject project, String packageName, final String className, final JavaClass javaClass, final ResourceSet rset, final IOverrideRunnable runnable) {
		final IPath packagePath = new Path(packageName.replace('.', '/')+'/');
		try {
			IConfigurationContributionInfo info = (IConfigurationContributionInfo) project.getSessionProperty(BeaninfoNature.CONFIG_INFO_SESSION_KEY);
			if (info == null) {
				// It hasn't been created yet, so we need to create our own internal version here.
				info = ProxyLaunchSupport.createDefaultConfigurationContributionInfo(JavaCore.create(project));					
				BeaninfoNature.computeBeanInfoConfigInfo(info);
			}
			final IBeanInfoContributor[] explicitContributors = (IBeanInfoContributor[]) project.getSessionProperty(BeaninfoNature.BEANINFO_CONTRIBUTORS_SESSION_KEY);
			synchronized (this) {
				if (ocFragments == null)
					processBeanInfoContributionExtensionPoint(); // We haven't processed them yet.
			}

			final Set usedPaths = new HashSet(10);	// Set of used paths. So that the contributors don't supply a path already used. This could cause problems if they did.
			final IContributorOverrideRunnable contribRunnable = new IContributorOverrideRunnable() {
				public void run(String overridePath) {
					if (!usedPaths.contains(overridePath)) {
						usedPaths.add(overridePath);
						runnable.run(overridePath);
					}
				}
				
				public void run(Resource overrideRes) {
					if (!usedPaths.contains(overrideRes.getURI())) {
						usedPaths.add(overrideRes.getURI());
						try {
							runnable.run(overrideRes);
						} finally {
							overrideRes.getResourceSet().getResources().remove(overrideRes);
						}
					}
				}
				
				public boolean pathContributed(String path) {
					return usedPaths.contains(path);
				}
				
				public boolean resourceContributed(URI resourceURI) {
					return usedPaths.contains(resourceURI);
				}
			};
			
			// Run through the containers that implement IBeanInfoContributor.
			for (Iterator iter = info.getContainers().entrySet().iterator(); iter.hasNext();) {
				Map.Entry mapEntry = (Map.Entry) iter.next();
				final IClasspathContainer container = (IClasspathContainer) mapEntry.getKey();
				if (container instanceof IBeanInfoContributor && ((Boolean) mapEntry.getValue()).booleanValue()) {
					SafeRunner.run(new ISafeRunnable() {
						public void handleException(Throwable exception) {
							// Standard run logs to .log
						}
						public void run() throws Exception {
							((IBeanInfoContributor) container).runOverrides(packagePath, className, javaClass, rset, contribRunnable);						
						}
					});
				}
			}
			
			// Run through the explicit contributors.
			for (int i=0; i<explicitContributors.length; i++) {
				final int ii = i;
				SafeRunner.run(new ISafeRunnable() {
					public void handleException(Throwable exception) {
						// Standard run logs to .log
					}
					public void run() throws Exception {
						explicitContributors[ii].runOverrides(packagePath, className, javaClass, rset, contribRunnable);						
					}
				});
			}			
		} catch (CoreException e) {
			getLogger().log(e, Level.INFO);
		}
	}
	
	private String getLeftOver(IPath fragment, IPath packagePath) {
		return packagePath.removeFirstSegments(fragment.segmentCount()).toString();
	}
	
	private Logger logger;
	public Logger getLogger() {
		if (logger == null)
			logger = EclipseLogger.getEclipseLogger(this);
		return logger;
	}
	
	/**
	 * Add that a BeanInfo nature is active. This is used to tell it to shutdown when beaninfo shuts down.
	 * TODO <package-protected> because only BeanInfoNature should call it. (public for now but when we make
	 * BeanInfoNature an API it will be moved into the same package as BeanInfoPlugin).
	 * 
	 * @param nature
	 * 
	 * @since 1.0.0
	 */
	public void addBeanInfoNature(BeaninfoNature nature) {
		if (openNatures == null)
			openNatures = new HashMap();
		openNatures.put(nature.getProject(), nature);
	}
	
	/**
	 * Mark that a BeanInfo nature is not active. This is used to tell it to shutdown when beaninfo shuts down.
	 * TODO <package-protected> because only BeanInfoNature should call it. (public for now but when we make
	 * BeanInfoNature an API it will be moved into the same package as BeanInfoPlugin).
	 * 
	 * @param nature
	 * 
	 * @since 1.0.0
	 */
	public void removeBeanInfoNature(BeaninfoNature nature) {
		if (openNatures != null)
			openNatures.remove(nature.getProject());
	}
	
	/**
	 * Return the registered nature, if any, for the project. This will not cause the
	 * nature to be created.
	 * <p>
	 * <package-protected> because only BeanInfoCacheController should access it.
	 * @param project
	 * @return nature for project or <code>null</code> if not registered.
	 * 
	 * @since 1.1.0
	 */
	BeaninfoNature getNature(IProject project) {
		return (BeaninfoNature) openNatures.get(project);
	}
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		if (openNatures != null && !openNatures.isEmpty()) {
			for (Iterator natureItr = openNatures.values().iterator(); natureItr.hasNext();) {
				BeaninfoNature nature = (BeaninfoNature) natureItr.next();
				nature.shutdown();
			}
		}
			
		super.stop(context);
	}
}


