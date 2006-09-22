package org.eclipse.jst.j2ee.refactor.operations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jem.util.RegistryReader;
import org.eclipse.jst.j2ee.internal.plugin.J2EEPlugin;

public class OptionalRefactorHandler implements IOptionalRefactorHandler{

	private static final String EXTENSION_POINT = "optionalRefactorHandler"; //$NON-NLS-1$
	private static final String TAG_OPTIONAL_REFACTOR = "optionalRefactorHandler"; //$NON-NLS-1$
	private static final String ATT_CLASS = "class"; //$NON-NLS-1$
	
	private static OptionalRefactorHandler instance = new OptionalRefactorHandler();
	private IOptionalRefactorHandler [] handlers = null;
	
	private OptionalRefactorHandler () {
		SafeRunner.run(new ISafeRunnable() {

			public void handleException(Throwable exception) {
				J2EEPlugin.logError(0, exception.getMessage(), exception);
			}

			public void run() throws Exception {
				OptionalRefactorHandlerRegistryReader reader = new OptionalRefactorHandlerRegistryReader();
				reader.readRegistry();
				handlers = reader.getHandlers();
			}

		});
	}
	
	public static OptionalRefactorHandler getInstance() {
		return instance;
	}
	
    /* (non-Javadoc)
     * @see org.eclipse.jst.j2ee.refactor.operations.IOptionalRefactorHandler#shouldRefactorDeletedProject(org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata)
     */
    public boolean shouldRefactorDeletedProject(final ProjectRefactorMetadata metadata) {
        for(int i=0;i<handlers.length; i++){
            if(!handlers[i].shouldRefactorDeletedProject(metadata)){
                return false;
            }
        }
        return true;
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jst.j2ee.refactor.operations.IOptionalRefactorHandler#shouldRefactorRenamedProject(org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata)
     */
    public boolean shouldRefactorRenamedProject(final ProjectRefactorMetadata metadata) {
        for(int i=0;i<handlers.length; i++){
            if(!handlers[i].shouldRefactorRenamedProject(metadata)){
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jst.j2ee.refactor.operations.IOptionalRefactorHandler#shouldRefactorDependentProjectOnDelete(org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata, org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata)
     */
    public boolean shouldRefactorDependentProjectOnDelete(final ProjectRefactorMetadata deletedMetadata, ProjectRefactorMetadata dependentMetadata) {
        for(int i=0;i<handlers.length; i++){
            if(!handlers[i].shouldRefactorDependentProjectOnDelete(deletedMetadata, dependentMetadata)){
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jst.j2ee.refactor.operations.IOptionalRefactorHandler#shouldRefactorDependentProjectOnRename(org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata, org.eclipse.jst.j2ee.refactor.operations.ProjectRefactorMetadata)
     */
    public boolean shouldRefactorDependentProjectOnRename(final ProjectRefactorMetadata renamedMetadata, ProjectRefactorMetadata dependentMetadata) {
        for(int i=0;i<handlers.length; i++){
            if(!handlers[i].shouldRefactorDependentProjectOnRename(renamedMetadata, dependentMetadata)){
                return false;
            }
        }
        return true;
    }
    

	private class OptionalRefactorHandlerRegistryReader extends RegistryReader {

		private List handlers = new ArrayList(); 
		
		public OptionalRefactorHandlerRegistryReader() {
			super(J2EEPlugin.PLUGIN_ID, EXTENSION_POINT);
		} 

		/**
		 * @see org.eclipse.wst.common.frameworks.internal.RegistryReader#readElement(org.eclipse.core.runtime.IConfigurationElement)
		 */
		public boolean readElement(final IConfigurationElement element) {
			if (TAG_OPTIONAL_REFACTOR.equals(element.getName())) {

				/*
				 * Because the only instance of this type is created from a static singleton field, and
				 * the registry is initialized in the constructor of this type, other threads cannot
				 * compete with readElement() for access to <i>descriptors</i>
				 */
				final IOptionalRefactorHandler[] handlerArray = new IOptionalRefactorHandler[1];

				SafeRunner.run(new ISafeRunnable() {

					public void handleException(Throwable exception) {
						J2EEPlugin.logError(0, exception.getMessage(), exception);
					}

					public void run() throws Exception {
						handlerArray[0] = (IOptionalRefactorHandler) element.createExecutableExtension(ATT_CLASS);
					}

				});

				handlers.add(handlerArray[0]);
				return true;
			}
			return false;
		}
		
		public IOptionalRefactorHandler [] getHandlers() {
			IOptionalRefactorHandler [] handlersArray = new IOptionalRefactorHandler[handlers.size()];
			for(int i=0;i<handlersArray.length;i++){
				handlersArray[i] = (IOptionalRefactorHandler)handlers.get(i);
			}
			return handlersArray;
		}
	}
	
}
