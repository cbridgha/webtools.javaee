/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.commonarchivecore.internal.strategy;



import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;

/**
 * Represents a supertype for all the archive strategies.
 */
public interface ArchiveStrategy {
	public Archive getArchive();

	public void setArchive(Archive archive);
}
