package org.eclipse.jem.internal.beaninfo.ui;
/*******************************************************************************
 * Copyright (c)  2001, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*
 *  $RCSfile: SearchPathListLabelProvider.java,v $
 *  $Revision: 1.1.4.1 $  $Date: 2003/12/08 22:32:20 $ 
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.ArchiveFileFilter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.misc.OverlayComposite;

import org.eclipse.jem.internal.beaninfo.adapters.*;

public class SearchPathListLabelProvider extends LabelProvider {

	IWorkspaceRoot fRoot;

	// Shared images
	private Image fJarIcon, fExtJarIcon;
	private Image fFolderImage, fProjectImage, fVariableImage;
	private Image fMissingLibaryImage, fMissingVariableImage;
	private Image fMissingFolderImage, fMissingProjectImage;
	private Image fPackageImage;

	// Local images, will be disposed.
	private Image fPluginImage;
	private Image fBeanImage;
	private Image fMissingPackageImage;
	private Image fBlankImage;
	private HashMap fBeanedImages = new HashMap(); // Key of image to a composite with a bean attached
	private HashMap fPackagedImages = new HashMap();
	private HashMap fMissingPackagedImages = new HashMap();
	private HashMap fNormalImages = new HashMap();	// Need to composite normal images w/blank so that they are the same size as the composited ones.
	// Key of image to a composite with a package attached

	public SearchPathListLabelProvider() {
		fRoot = ResourcesPlugin.getWorkspace().getRoot();
		ImageRegistry reg = JavaPlugin.getDefault().getImageRegistry();

		fJarIcon = reg.get(JavaPluginImages.IMG_OBJS_JAR);
		fExtJarIcon = reg.get(JavaPluginImages.IMG_OBJS_EXTJAR);
		fFolderImage = reg.get(JavaPluginImages.IMG_OBJS_PACKFRAG_ROOT);

		fVariableImage = reg.get(JavaPluginImages.IMG_OBJS_ENV_VAR);

		IWorkbench workbench = JavaPlugin.getDefault().getWorkbench();
		fProjectImage = workbench.getSharedImages().getImage(IDE.SharedImages.IMG_OBJ_PROJECT);

		fMissingLibaryImage = reg.get(JavaPluginImages.IMG_OBJS_MISSING_JAR);
		fMissingVariableImage = reg.get(JavaPluginImages.IMG_OBJS_MISSING_ENV_VAR);
		fMissingFolderImage = reg.get(JavaPluginImages.IMG_OBJS_MISSING_PACKFRAG_ROOT);
		fMissingProjectImage = workbench.getSharedImages().getImage(IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED);

		fPackageImage = reg.get(JavaPluginImages.IMG_OBJS_PACKAGE);

		try {
			ImageDescriptor pin =
				ImageDescriptor.createFromURL(
					new URL(BeaninfoUIPlugin.getPlugin().getDescriptor().getInstallURL(), "icons/plugin_obj.gif")); //$NON-NLS-1$
			fPluginImage = pin.createImage();

			pin =
				ImageDescriptor.createFromURL(
					new URL(BeaninfoUIPlugin.getPlugin().getDescriptor().getInstallURL(), "icons/javabean.gif")); //$NON-NLS-1$
			fBeanImage = pin.createImage();

			pin =
				ImageDescriptor.createFromURL(
					new URL(
						BeaninfoUIPlugin.getPlugin().getDescriptor().getInstallURL(),
						"icons/package_obj_missing.gif")); //$NON-NLS-1$
			fMissingPackageImage = pin.createImage();
			
			pin =
				ImageDescriptor.createFromURL(
					new URL(
						BeaninfoUIPlugin.getPlugin().getDescriptor().getInstallURL(),
						"icons/blank.gif")); //$NON-NLS-1$
			fBlankImage = pin.createImage();			
		} catch (MalformedURLException e) {
			if (fPluginImage == null)
				fPluginImage = ImageDescriptor.getMissingImageDescriptor().createImage();
			if (fBeanImage == null)
				fBeanImage = ImageDescriptor.getMissingImageDescriptor().createImage();
			if (fMissingPackageImage == null)
				fMissingPackageImage = ImageDescriptor.getMissingImageDescriptor().createImage();
			if (fBlankImage == null)
				fBlankImage = ImageDescriptor.getMissingImageDescriptor().createImage();
		}

	}

	public String getText(Object element) {
		if (element instanceof BPListElement) {
			BPListElement bpentry = (BPListElement) element;
			IBeaninfosDocEntry docEntry = (IBeaninfosDocEntry) bpentry.getEntry();
			IPath path = docEntry.getPath();
			String pathString = null;
			switch (docEntry.getKind()) {
				case IClasspathEntry.CPE_LIBRARY :
					IResource resource = fRoot.findMember(path);
					if (resource instanceof IFolder) {
						pathString =
							MessageFormat.format(BeanInfoUIMessages.getString("LabelProvider.Library.Folder"), new Object[] { path.makeRelative().toString()}); //$NON-NLS-1$
					} else if (resource instanceof IFile) {
						if (ArchiveFileFilter.isArchivePath(path)) {
							// Internal library
							String[] args =
								new String[] { path.lastSegment(), path.removeLastSegments(1).makeRelative().toString()};
							pathString = MessageFormat.format(BeanInfoUIMessages.getString("LabelProvider.Library.(PathLastSegment,PathRelative)"), args); //$NON-NLS-1$
						}
					} else {
						if (ArchiveFileFilter.isArchivePath(path)) {
							// External library
							String[] args =
								new String[] { path.lastSegment(), path.removeLastSegments(1).toString()};
							pathString = MessageFormat.format(BeanInfoUIMessages.getString("LabelProvider.Library.(PathLastSegment,PathExceptLast)"), args); //$NON-NLS-1$
						} else {
							// should not come here
							pathString = path.makeRelative().toString();
						}
					}
					break;

				case IClasspathEntry.CPE_VARIABLE :
					String name = path.makeRelative().toString();
					IPath entryPath = JavaCore.getClasspathVariable(path.segment(0));
					if (entryPath != null)
						pathString =
							MessageFormat.format(
								BeanInfoUIMessages.getString("LabelProvider.Variable.(name,PathOSString)"), //$NON-NLS-1$
								new Object[] { name, entryPath.append(path.removeFirstSegments(1)).toOSString()});
					else
						pathString = name;
					break;

				case IClasspathEntry.CPE_PROJECT :
					pathString = path.toString();
					break;

				case IClasspathEntry.CPE_SOURCE :
					pathString = path.makeRelative().toString();
					break;

				case BeaninfoEntry.BIE_PLUGIN :
					pathString = path.toString();
					break;
				default :
					// no path, so probably a search entry within a beaninfo entry.
			}

			if (docEntry instanceof SearchpathEntry) {
				// There could be a package involved too if this is not a project or registered var entry
				String packageName = ((SearchpathEntry) docEntry).getPackage();
				if (packageName != null && packageName.length() > 0)
					if (pathString != null)
						return MessageFormat.format(BeanInfoUIMessages.getString("LabelProvider.(packageName,Path)"), new Object[] { packageName, pathString }); //$NON-NLS-1$
					else
						return packageName;
			}

			if (pathString != null)
				return pathString;
			else
				return "?"; //$NON-NLS-1$
		}
		return super.getText(element);
	}

	public Image getImage(Object element) {
		Image returnedImage = null;
		boolean imageIsNormal = true;	// Whether this is a normal sized image (which will need compositing with blank)
		if (element instanceof BPListElement) {
			BPListElement bpentry = (BPListElement) element;
			IBeaninfosDocEntry docEntry = (IBeaninfosDocEntry) bpentry.getEntry();
			IPath path = docEntry.getPath();
			Image pathImage = null;
			switch (docEntry.getKind()) {
				case IClasspathEntry.CPE_SOURCE :
					if (!bpentry.isMissing())
						pathImage = fFolderImage;
					else
						pathImage = fMissingFolderImage;
					break;

				case IClasspathEntry.CPE_LIBRARY :
					if (!bpentry.isMissing()) {
						IResource resource = fRoot.findMember(path);
						if (resource instanceof IFolder)
							pathImage = fFolderImage;
						else if (resource instanceof IFile)
							pathImage = fJarIcon;
						else
							pathImage = fExtJarIcon;
					} else
						pathImage = fMissingLibaryImage;
					break;

				case IClasspathEntry.CPE_PROJECT :
					if (!bpentry.isMissing())
						pathImage = fProjectImage;
					else
						pathImage = fMissingProjectImage;
					break;

				case IClasspathEntry.CPE_VARIABLE :
					if (!bpentry.isMissing())
						pathImage = fVariableImage;
					else
						pathImage = fMissingVariableImage;
					break;

				case BeaninfoEntry.BIE_PLUGIN:
					pathImage = fPluginImage;
					break;
					
				default :
					// probably a searchentry under beaninfo entry, no path icon to decorate.
					break;
			}

			if (bpentry instanceof BPSearchListElement) {
				SearchpathEntry se = (SearchpathEntry) docEntry;
				BPSearchListElement bpse = (BPSearchListElement) bpentry;
				if (se.getPackage() != null) {
					if (pathImage != null) {
						if (!bpse.isPackageMissing()) {
							// Need to decorate with a package symbol.
							imageIsNormal = false;
							returnedImage = (Image) fPackagedImages.get(pathImage); // See if we've already created the image
							if (returnedImage == null) {
								OverlayComposite oc = new OverlayComposite(pathImage.getImageData());
								oc.setRightExtension(fPackageImage.getImageData());
								returnedImage = oc.createImage();
								fPackagedImages.put(pathImage, returnedImage);
							}
						} else {
							// Need to decorate with a missing package symbol.
							imageIsNormal = false;
							returnedImage = (Image) fMissingPackagedImages.get(pathImage); // See if we've already created the image
							if (returnedImage == null) {
								OverlayComposite oc = new OverlayComposite(pathImage.getImageData());
								oc.setRightExtension(fMissingPackageImage.getImageData());
								returnedImage = oc.createImage();
								fMissingPackagedImages.put(pathImage, returnedImage);
							}
						}
					}
				}
					
				if (pathImage == null && returnedImage == null)
					if (!bpse.isPackageMissing())
						returnedImage = fPackageImage; // Just a package image
					else
						returnedImage = fMissingPackageImage;	// Just the missing package image.
				else if (returnedImage == null)
					returnedImage = pathImage;
			} else {
				if (pathImage != null) {
					// It is a beaninfo entry, need to decorate with the bean.
					imageIsNormal = false;
					returnedImage = (Image) fBeanedImages.get(pathImage); // See if we've already created the image
					if (returnedImage == null) {
						OverlayComposite oc = new OverlayComposite(pathImage.getImageData());
						oc.setRightExtension(fBeanImage.getImageData());
						returnedImage = oc.createImage();
						fBeanedImages.put(pathImage, returnedImage);
					}
				}
				if (returnedImage == null)
					returnedImage = fBeanImage; // Shouldn't occur.
			}
		}
		
		if (imageIsNormal && returnedImage != null) {
			// We need to composite it with blank so that the result will be the same size
			// as composited images. If this isn't done, the viewer will stretch the image
			// to match the same size as the composited images and things will look aweful.
			Image newReturned = (Image) fNormalImages.get(returnedImage);
			if (newReturned == null) {
				OverlayComposite oc = new OverlayComposite(returnedImage.getImageData());
				oc.setRightExtension(fBlankImage.getImageData());
				newReturned = oc.createImage();
				fNormalImages.put(returnedImage, newReturned);
			}
			returnedImage = newReturned;
		}
		return returnedImage;
	}

	/*
	 * @see IBaseLabelProvider#dispose()
	 */
	public void dispose() {
		super.dispose();

		fPluginImage.dispose();
		fBeanImage.dispose();
		fMissingPackageImage.dispose();
		fBlankImage.dispose();
		for (Iterator itr = fBeanedImages.values().iterator(); itr.hasNext();) {
			((Image) itr.next()).dispose();
		}
		for (Iterator itr = fPackagedImages.values().iterator(); itr.hasNext();) {
			((Image) itr.next()).dispose();
		}
		for (Iterator itr = fMissingPackagedImages.values().iterator(); itr.hasNext();) {
			((Image) itr.next()).dispose();
		}
		for (Iterator itr = fNormalImages.values().iterator(); itr.hasNext();) {
			((Image) itr.next()).dispose();
		}		
	}

}