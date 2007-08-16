/**
 * 
 */
package org.eclipse.jst.j2ee.internal.dialogs;

import java.text.MessageFormat;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jst.j2ee.internal.plugin.J2EEUIMessages;
import org.eclipse.jst.j2ee.internal.project.J2EEProjectUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.wst.server.core.IRuntime;


/**
 * @author Administrator
 *
 */
public class RuntimeSelectionDialog extends MessageDialog {
	private IProject project = null;
	private String configuredMessage;

	/**
	 * @param parentShell
	 * @param dialogTitle
	 * @param dialogTitleImage
	 * @param dialogMessage
	 * @param dialogImageType
	 * @param dialogButtonLabels
	 * @param defaultIndex
	 */
	public RuntimeSelectionDialog(Shell parentShell, String dialogTitle,
			Image dialogTitleImage, String dialogMessage, int dialogImageType,
			String[] dialogButtonLabels, int defaultIndex, IProject project) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage,
				dialogImageType, dialogButtonLabels, defaultIndex);
		this.project = project;
		this.configuredMessage = MessageFormat.format(J2EEUIMessages.getResourceString("DEPLOY_RUNTIME_CONFIGURED"), new String []{project.getName()});
	}
	
	protected Control createCustomArea(Composite parent) {

		//Composite composite = new Composite(parent, 0);
		createHyperLink(parent);
		return parent;

	}
	
	private void createHyperLink(Composite parent) {
		Hyperlink link = new Hyperlink(parent,SWT.None);
		GridData layout = new GridData(GridData.HORIZONTAL_ALIGN_END);
		layout.horizontalSpan = 2;
		link.setLayoutData(layout);
		link.setUnderlined(true);
		Color color = new Color(parent.getDisplay(),new RGB(0,0,255) );
		link.setForeground(color);
		link.setText("Configure Target Runtime...");
		link.addHyperlinkListener(new IHyperlinkListener() {
			public static final String DATA_NO_LINK = "PropertyAndPreferencePage.nolink"; //$NON-NLS-1$

			public void hyperlinkUpdate(HyperlinkEvent e) {
			}

			public void linkEntered(org.eclipse.ui.forms.events.HyperlinkEvent e) {
			}

			public void linkExited(org.eclipse.ui.forms.events.HyperlinkEvent e) {
			}

			public void linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent e) {
				String id = getPreferencePageID();
				PreferencesUtil.createPropertyDialogOn(getShell(), project, id, new String[]{id}, DATA_NO_LINK).open(); //
				//(getShell(), id, new String[]{id}, DATA_NO_LINK).open();
				try {
					updateWidgets();
				} catch (Exception ie) {

				}
			}

			private String getPreferencePageID() {
				return "org.eclipse.wst.common.project.facet.ui.internal.RuntimesPropertyPage";
			}
		});
		
	}
	
	private void updateWidgets() {
		if (getTargetRuntime() != null) {
		  messageLabel.setText(configuredMessage);
		  imageLabel.setImage(this.getInfoImage());
		} else {
		  messageLabel.setText(message);
		  imageLabel.setImage(getErrorImage());
		}
				
	}

	private IRuntime getTargetRuntime() {
		try {
			IRuntime runtime = J2EEProjectUtilities.getServerRuntime(project);
			return runtime;
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

}
