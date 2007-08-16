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

package org.eclipse.jst.j2ee.internal.model.translator.webservices;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jst.j2ee.common.CommonPackage;
import org.eclipse.jst.j2ee.internal.J2EEConstants;
import org.eclipse.jst.j2ee.internal.model.translator.common.CommonTranslators;
import org.eclipse.jst.j2ee.webservice.internal.WebServiceConstants;
import org.eclipse.jst.j2ee.webservice.wscommon.WscommonPackage;
import org.eclipse.jst.j2ee.webservice.wsdd.WsddPackage;
import org.eclipse.wst.common.internal.emf.resource.ConstantAttributeTranslator;
import org.eclipse.wst.common.internal.emf.resource.GenericTranslator;
import org.eclipse.wst.common.internal.emf.resource.IDTranslator;
import org.eclipse.wst.common.internal.emf.resource.RootTranslator;
import org.eclipse.wst.common.internal.emf.resource.Translator;




public class WsddTranslator extends RootTranslator implements WsddXmlMapperI, J2EEConstants{
	public static WsddTranslator INSTANCE = new WsddTranslator();
	private static Translator[] children10;
	private static Translator[] children11;

	private static WsddPackage WSDD_PKG = WsddPackage.eINSTANCE;
	private static WscommonPackage WSCOMMON_PKG = WscommonPackage.eINSTANCE;
	private static CommonPackage COMMON_PKG = CommonPackage.eINSTANCE;
	
	protected WsddTranslator() {
		super(WEBSERVICES, WsddPackage.eINSTANCE.getWebServices());
	}
	
	/* (non-Javadoc)
	 * @see com.ibm.etools.emf2xml.impl.Translator#getChildren(java.lang.Object, int)
	 */
	public Translator[] getChildren(Object o, int versionID) {
	    
		

		switch (versionID) {
			case (J2EE_1_2_ID) :
			case (J2EE_1_3_ID) :
				if (children10 == null)
				{
					children10 = create10Children();
				}
				return children10;	
			default :
				if (children11 == null)
				{
					children11 = create11Children();
				}
				return children11; 
		}
	}


	protected Translator[] create10Children() {
		return new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(DESCRIPTION, COMMON_PKG.getCompatibilityDescriptionGroup_Description()),
			new Translator(DISPLAY_NAME, COMMON_PKG.getCompatibilityDescriptionGroup_DisplayName()),			
			new Translator(SMALL_ICON, COMMON_PKG.getCompatibilityDescriptionGroup_SmallIcon()),			
			new Translator(LARGE_ICON, COMMON_PKG.getCompatibilityDescriptionGroup_LargeIcon()),			
			create10WebServiceDescTranslator()
		};
	}

	protected Translator[] create11Children() {
		
		return new Translator[] {
			IDTranslator.INSTANCE,
			new ConstantAttributeTranslator(XML_NS, J2EE_NS_URL),
			new ConstantAttributeTranslator(XML_NS_XSI, XSI_NS_URL),
			new ConstantAttributeTranslator(XSI_SCHEMA_LOCATION, J2EE_NS_URL+' '+WebServiceConstants.WEBSERVICE_SCHEMA_LOC),
			new ConstantAttributeTranslator(VERSION, WebServiceConstants.WEBSERVICE_SCHEMA_VERSION),			  
			CommonTranslators.DESCRIPTIONS_TRANSLATOR,
			CommonTranslators.DISPLAYNAMES_TRANSLATOR,
			CommonTranslators.ICONS_TRANSLATOR,			
			create11WebServiceDescTranslator()
		};
	}

	public Translator create10WebServiceDescTranslator() {
		GenericTranslator result = new GenericTranslator(WEBSERVICE_DESCRIPTION, WSDD_PKG.getWebServices_WebServiceDescriptions());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(DESCRIPTION, WSDD_PKG.getWebServiceDescription_Description()),			
			new Translator(DISPLAY_NAME, WSDD_PKG.getWebServiceDescription_DisplayName()),			
			new Translator(SMALL_ICON, WSDD_PKG.getWebServiceDescription_SmallIcon()),			
			new Translator(LARGE_ICON, WSDD_PKG.getWebServiceDescription_LargeIcon()),						
			new Translator(WEBSERVICE_DESCRIPTION_NAME, WSDD_PKG.getWebServiceDescription_WebServiceDescriptionName()),
			new Translator(WSDL_FILE, WSDD_PKG.getWebServiceDescription_WsdlFile()),			
			new Translator(JAXRPC_MAPPING_FILE, WSDD_PKG.getWebServiceDescription_JaxrpcMappingFile()),			
			create10PortComponentTranslator()			  
		});
		return result;	
	}

	public Translator create11WebServiceDescTranslator() {
	    
		GenericTranslator result = new GenericTranslator(WEBSERVICE_DESCRIPTION, WSDD_PKG.getWebServices_WebServiceDescriptions());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			create11DescriptionTranslator(WSDD_PKG.getWebServiceDescription_DescriptionType()),
			create11DisplayNameTranslator(WSDD_PKG.getWebServiceDescription_DisplayNameType()),			
			create11IconTranslator(WSDD_PKG.getWebServiceDescription_IconType()),			
			new Translator(WEBSERVICE_DESCRIPTION_NAME, WSDD_PKG.getWebServiceDescription_WebServiceDescriptionName()),
			new Translator(WSDL_FILE, WSDD_PKG.getWebServiceDescription_WsdlFile()),			
			new Translator(JAXRPC_MAPPING_FILE, WSDD_PKG.getWebServiceDescription_JaxrpcMappingFile()),			
			create11PortComponentTranslator()			  
		});
		return result;	
	}



	public Translator create10PortComponentTranslator() {
		GenericTranslator result = new GenericTranslator(PORT_COMPONENT, WSDD_PKG.getWebServiceDescription_PortComponents());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(DESCRIPTION, WSDD_PKG.getPortComponent_Description()),			
			new Translator(DISPLAY_NAME, WSDD_PKG.getPortComponent_DisplayName()),			
			new Translator(SMALL_ICON, WSDD_PKG.getPortComponent_SmallIcon()),			
			new Translator(LARGE_ICON, WSDD_PKG.getPortComponent_LargeIcon()),						
			new Translator(PORT_COMPONENT_NAME, WSDD_PKG.getPortComponent_PortComponentName()),
			create10WsdlPortTranslator(),
			new Translator(SERVICE_ENPOINT_INTERFACE, WSDD_PKG.getPortComponent_ServiceEndpointInterface()),
			createServiceImplBeanTranslator(),
			createHandler10Translator()
		});
		return result;	
	}

	public Translator create11PortComponentTranslator() {
		GenericTranslator result = new GenericTranslator(PORT_COMPONENT, WSDD_PKG.getWebServiceDescription_PortComponents());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(DESCRIPTION, WSDD_PKG.getPortComponent_Description()),			
			new Translator(DISPLAY_NAME, WSDD_PKG.getPortComponent_DisplayName()),			
			new Translator(SMALL_ICON, WSDD_PKG.getPortComponent_SmallIcon()),			
			new Translator(LARGE_ICON, WSDD_PKG.getPortComponent_LargeIcon()),				
			new Translator(PORT_COMPONENT_NAME, WSDD_PKG.getPortComponent_PortComponentName()),
			CommonTranslators.createQNameTranslator(WSDL_PORT, WSDD_PKG.getPortComponent_WsdlPort()),
			new Translator(SERVICE_ENPOINT_INTERFACE, WSDD_PKG.getPortComponent_ServiceEndpointInterface()),
			createServiceImplBeanTranslator(),
			createHandler11Translator()
		});
		return result;	
	}

	public Translator create10WsdlPortTranslator() {
		GenericTranslator result = new GenericTranslator(WSDL_PORT, WSDD_PKG.getPortComponent_WsdlPort());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(NAMESPACEURI, COMMON_PKG.getQName_NamespaceURI()),
			new Translator(LOCALPART, COMMON_PKG.getQName_LocalPart())			
		});
		return result;	
	}


	public Translator createServiceImplBeanTranslator() {
		GenericTranslator result = new GenericTranslator(SERVICE_IMPL_BEAN, WSDD_PKG.getPortComponent_ServiceImplBean());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new ServletLinkTranslator(),
			new EJBLinkTranslator()
		});
		return result;	
	}


	public Translator createHandler10Translator() {
		GenericTranslator result = new GenericTranslator(HANDLER, WSDD_PKG.getPortComponent_Handlers());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(DESCRIPTION, COMMON_PKG.getCompatibilityDescriptionGroup_Description()),
			new Translator(DISPLAY_NAME, COMMON_PKG.getCompatibilityDescriptionGroup_DisplayName()),			
			new Translator(SMALL_ICON, COMMON_PKG.getCompatibilityDescriptionGroup_SmallIcon()),			
			new Translator(LARGE_ICON, COMMON_PKG.getCompatibilityDescriptionGroup_LargeIcon()),			
			new Translator(HANDLER_NAME, WSDD_PKG.getHandler_HandlerName()),
			new Translator(HANDLER_CLASS, WSDD_PKG.getHandler_HandlerClass()),			
			create10InitParamTranslator(),
			create10SOAPHeaderTranslator(),
			new SOAPRoleTranslator()
		});
		return result;	
	}

	public Translator createHandler11Translator() {
		GenericTranslator result = new GenericTranslator(HANDLER, WSDD_PKG.getPortComponent_Handlers());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			CommonTranslators.DESCRIPTIONS_TRANSLATOR,
			CommonTranslators.DISPLAYNAMES_TRANSLATOR,
			CommonTranslators.ICONS_TRANSLATOR,			
			new Translator(HANDLER_NAME, WSDD_PKG.getHandler_HandlerName()),
			new Translator(HANDLER_CLASS, WSDD_PKG.getHandler_HandlerClass()),			
			create11InitParamTranslator(),
			CommonTranslators.createQNameTranslator(SOAP_HEADER, WSDD_PKG.getHandler_SoapHeaders()),
			new SOAPRoleTranslator()
		});
		return result;	
	}

	public Translator create10InitParamTranslator() {
		GenericTranslator result = new GenericTranslator(INIT_PARAM, WSDD_PKG.getHandler_InitParams());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(PARAM_NAME, WSCOMMON_PKG.getInitParam_ParamName()),
			new Translator(PARAM_VALUE, WSCOMMON_PKG.getInitParam_ParamValue()),			
			new Translator(DESCRIPTION, WSCOMMON_PKG.getInitParam_Description())			
		});
		return result;	
	}

	public Translator create11InitParamTranslator() {
		GenericTranslator result = new GenericTranslator(INIT_PARAM, WSDD_PKG.getHandler_InitParams());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			create11DescriptionTranslator(WSCOMMON_PKG.getInitParam_DescriptionTypes()),						  
			new Translator(PARAM_NAME, WSCOMMON_PKG.getInitParam_ParamName()),
			new Translator(PARAM_VALUE, WSCOMMON_PKG.getInitParam_ParamValue())
		});
		return result;	
	}


	public Translator create10SOAPHeaderTranslator() {
		GenericTranslator result = new GenericTranslator(SOAP_HEADER, WSDD_PKG.getHandler_SoapHeaders());
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(NAMESPACEURI, COMMON_PKG.getQName_NamespaceURI()),
			new Translator(LOCALPART, COMMON_PKG.getQName_LocalPart())			
		});
		return result;	
	}

	public Translator create11DescriptionTranslator(EStructuralFeature afeature) {
		GenericTranslator result = new GenericTranslator(DESCRIPTION, afeature);
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(LANG, COMMON_PKG.getDescription_Lang(), Translator.DOM_ATTRIBUTE),
			new Translator(Translator.TEXT_ATTRIBUTE_VALUE, COMMON_PKG.getDescription_Value())
		});
		return result;
	}
	public  Translator create11DisplayNameTranslator(EStructuralFeature afeature) {
		GenericTranslator result = new GenericTranslator(DISPLAY_NAME, afeature);
		result.setChildren(new Translator[] {
			IDTranslator.INSTANCE,
			new Translator(LANG, COMMON_PKG.getDisplayName_Lang(), Translator.DOM_ATTRIBUTE),
			new Translator(Translator.TEXT_ATTRIBUTE_VALUE, COMMON_PKG.getDisplayName_Value())
		});
		return result;
	}

	private Translator create11IconTranslator(EStructuralFeature afeature) {
		GenericTranslator result = new GenericTranslator(ICON, afeature);
		result.setChildren(new Translator[] {
			new Translator(LANG, COMMON_PKG.getIconType_Lang(), Translator.DOM_ATTRIBUTE),		  
			IDTranslator.INSTANCE,
			new Translator(SMALL_ICON, COMMON_PKG.getIconType_SmallIcon()),
			new Translator(LARGE_ICON, COMMON_PKG.getIconType_LargeIcon())
		});
		return result;
	}
	
}

