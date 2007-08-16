/*******************************************************************************
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.internal.componentcore;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jst.j2ee.commonarchivecore.internal.Archive;
import org.eclipse.jst.j2ee.commonarchivecore.internal.EJBJarFile;
import org.eclipse.jst.j2ee.commonarchivecore.internal.exception.OpenFailureException;
import org.eclipse.jst.j2ee.commonarchivecore.internal.helpers.ArchiveTypeDiscriminator;
import org.eclipse.jst.j2ee.commonarchivecore.internal.impl.EJBJarFileImpl;
import org.eclipse.jst.j2ee.commonarchivecore.internal.strategy.EjbJar11ImportStrategyImpl;
import org.eclipse.jst.j2ee.commonarchivecore.internal.strategy.LoadStrategy;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;

public class EJBBinaryComponentHelper extends EnterpriseBinaryComponentHelper {

	public static boolean handlesComponent(IVirtualComponent component) {
		EJBBinaryComponentHelper helper = null;
		try {
			helper = new EJBBinaryComponentHelper(component);
			return helper.isArchiveValid();
		} catch (Exception e) {
			return false;
		} finally {
			helper.dispose();
		}
	}

	protected static class Discriminator extends EjbJar11ImportStrategyImpl.Discriminator {

		private static Discriminator instance;

		public static Discriminator getInstance() {
			if (instance == null) {
				instance = new Discriminator();
			}
			return instance;
		}

		public Archive createConvertedArchive() {
			ReferenceCountedEJBJarFileImpl archive = new ReferenceCountedEJBJarFileImpl();
			return archive;
		}
	}

	protected static class ReferenceCountedEJBJarFileImpl extends EJBJarFileImpl implements IReferenceCountedArchive {

		private int count = 0;

		public void access() {
			synchronized (this) {
				count++;
			}
		}

		public void close() {
			synchronized (this) {
				count--;
				if (count > 0) {
					return;
				}
			}
			physicallyClose(this);
		}
		
		public void forceClose(){
			count = 0;
			super.close();
		}
		
		private EnterpriseBinaryComponentHelper helper = null;
		
		public EnterpriseBinaryComponentHelper getEnterpriseBinaryComponentHelper() {
			return helper;
		}

		public void setEnterpriseBinaryComponentHelper(EnterpriseBinaryComponentHelper helper) {
			this.helper = helper;
		}
		
		protected LoadStrategy createLoadStrategyForReopen(Archive parent) throws IOException {
			try {
				return createBinaryLoadStrategy(getEnterpriseBinaryComponentHelper());
			} catch (OpenFailureException e) {
				throw new IOException(e.getMessage());
			}
		}
	}

	protected ArchiveTypeDiscriminator getDiscriminator() {
		return Discriminator.getInstance();
	}

	public EJBBinaryComponentHelper(IVirtualComponent component) {
		super(component);
	}

	public EObject getPrimaryRootObject() {
		return ((EJBJarFile) getArchive()).getDeploymentDescriptor();
	}

}