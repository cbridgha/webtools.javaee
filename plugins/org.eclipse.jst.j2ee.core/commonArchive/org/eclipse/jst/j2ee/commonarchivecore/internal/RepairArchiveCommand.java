/*******************************************************************************
 * Copyright (c) 2001, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.j2ee.commonarchivecore.internal;



import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.jst.j2ee.commonarchivecore.internal.helpers.ArchiveConstants;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.jee.archive.internal.ArchiveUtil;


/**
 * Insert the type's description here. Creation date: (02/27/01 2:20:44 PM)
 * 
 * @author: Administrator
 */
public class RepairArchiveCommand extends AbstractCommand {
	protected Archive archive;
	protected static Map directoryNames;

	/**
	 * RepairMetaInfCommand constructor comment.
	 * 
	 * @param label
	 *            java.lang.String
	 * @param description
	 *            java.lang.String
	 */
	public RepairArchiveCommand(Archive anArchive) {
		super("Repair Archive", CommonArchiveResourceHandler.Repairs_all_entries_in_the); // = "Repairs all entries in the META-INF and/or WEB-INF directories to be the correct case"//$NON-NLS-1$
		archive = anArchive;
		//Ensure Initiailization
		getDirectoryNames();
	}

	/**
	 * @see com.ibm.etools.common.command.Command
	 */
	public void execute() {
		List files = archive.getFiles();
		for (int i = 0; i < files.size(); i++) {
			File aFile = (File) files.get(i);
			if (aFile.isArchive()) {
				new RepairArchiveCommand((Archive) aFile).execute();
			} else {
				String upperUri = aFile.getURI().toUpperCase();
				Iterator keysAndValues = directoryNames.entrySet().iterator();
				while (keysAndValues.hasNext()) {
					String uri = aFile.getURI();
					Map.Entry entry = (Map.Entry) keysAndValues.next();
					String key = (String) entry.getKey();
					String value = (String) entry.getValue();
					if (upperUri.startsWith(key) && !uri.startsWith(value)) {
						String tail = uri.substring(key.length());
						aFile.setURI(value.concat(tail));
						break;
					}
				}
			}
		}
	}

	/**
	 * Insert the method's description here. Creation date: (03/14/01 5:55:14 PM)
	 * 
	 * @return java.util.Set
	 */
	protected static java.util.Map getDirectoryNames() {
		if (directoryNames == null) {
			directoryNames = new HashMap(6);
			directoryNames.put(J2EEConstants.META_INF.toUpperCase(), J2EEConstants.META_INF);
			directoryNames.put(J2EEConstants.WEB_INF.toUpperCase(), J2EEConstants.WEB_INF);
			directoryNames.put(ArchiveConstants.WEBAPP_LIB_URI.toUpperCase(), ArchiveConstants.WEBAPP_LIB_URI);
			directoryNames.put(ArchiveConstants.WEBAPP_CLASSES_URI.toUpperCase(), ArchiveConstants.WEBAPP_CLASSES_URI);
		}
		return directoryNames;
	}

	public Collection getResult() {
		return Arrays.asList(new Object[]{archive});
	}

	/**
	 * Insert the method's description here. Creation date: (03/14/01 6:46:16 PM)
	 * 
	 * @param args
	 *            java.lang.String[]
	 */
	public static void main(String[] args) {
		if (!validateArgs(args))
			return;
		try {
			Archive anArchive = CommonArchiveFactoryRegistry.INSTANCE.getCommonArchiveFactory().primOpenArchive(args[0]);
			new RepairArchiveCommand(anArchive).execute();
			anArchive.saveAs(args[1]);
		} catch (Exception ex) {
			System.out.println(CommonArchiveResourceHandler.Repair_command_failed___ex_EXC_); // = "Repair command failed - exception stack trace:"
			ex.printStackTrace();
		}
	}

	protected boolean prepare() {
		return true;
	}

	/**
	 * @see com.ibm.etools.common.command.Command
	 */
	public void redo() {
		//Default
	}

	protected static boolean validateArgs(String[] args) {
		if (!(args.length == 2)) {
			org.eclipse.jem.util.logger.proxy.Logger.getLogger().logError(CommonArchiveResourceHandler.RepairArchiveCommand_usage); // = "RepairArchiveCommand usage:  <sourceJarFilePath> <destinationPath>"
			return false;
		}
		java.io.File file = new java.io.File(args[0]);
		boolean isZip = false;
		java.util.zip.ZipFile zip = null;
		try {
			zip = ArchiveUtil.newZipFile(file);
			isZip = true;
		} catch (java.io.IOException ex) {
			isZip = false;
		} finally {
			if (zip != null)
				try {
					zip.close();
				} catch (java.io.IOException ex) {
					//Ignore
				}
		}
		if (!isZip && !file.isDirectory()) {
			System.out.println(CommonArchiveResourceHandler.RepairArchiveCommand_usage1_ERROR_); // = "RepairArchiveCommand usage: sourceJarFilePath must point to a valid archive or directory of an inflated archive"
			return false;
		}
		if (new java.io.File(args[1]).canWrite()) {
			System.out.println(CommonArchiveResourceHandler.getString(CommonArchiveResourceHandler.repair_usage_ERROR_, (new Object[]{args[1]}))); // = "RepairArchiveCommand usage: cannot write to destinationPath "
			return false;
		}
		return true;
	}
}
