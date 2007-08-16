/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.modulecore.util;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jst.j2ee.componentcore.util.EARArtifactEdit;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.wst.common.componentcore.ArtifactEdit;
import org.eclipse.wst.common.componentcore.internal.ArtifactEditModel;


/**
 * <p>
 * Adapts {@see org.eclipse.wst.common.modulecore.ArtifactEditModel}s to
 * {@see org.eclipse.jst.j2ee.internal.modulecore.util.EARArtifactEdit}&nbsp; facades.
 * </p>
 */
public class EarEditAdapterFactory implements IAdapterFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
	 */
	public Object getAdapter(Object adaptableObject, Class adapterType) {

		if (adapterType == EARArtifactEdit.ADAPTER_TYPE || adapterType == ArtifactEdit.ADAPTER_TYPE) {
			ArtifactEditModel editModel = (ArtifactEditModel) adaptableObject;
			if (J2EEProjectUtilities.isEARProject(editModel.getProject()))
				return new EARArtifactEdit((ArtifactEditModel) adaptableObject);
		}
		return null;

	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
	 */
	public Class[] getAdapterList() {

		return new Class[]{ArtifactEdit.class, EARArtifactEdit.class};
	}
}
