package org.eclipse.jst.j2ee.internal.web.operations;

import java.util.*;
import org.eclipse.jst.j2ee.internal.common.operations.*;

public class FilterTemplate
{
  protected static String nl;
  public static synchronized FilterTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    FilterTemplate result = new FilterTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "import ";
  protected final String TEXT_5 = ";";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = "/**" + NL + " * Servlet Filter implementation class ";
  protected final String TEXT_9 = NL + " *" + NL + " * @web.filter" + NL + " *   name=\"";
  protected final String TEXT_10 = "\"" + NL + " *   display-name=\"";
  protected final String TEXT_11 = "\"";
  protected final String TEXT_12 = NL + " *   description=\"";
  protected final String TEXT_13 = "\"";
  protected final String TEXT_14 = NL + " *" + NL + " * @web.filter-mapping";
  protected final String TEXT_15 = NL + " *   url-pattern=\"";
  protected final String TEXT_16 = "\"";
  protected final String TEXT_17 = NL + " *   servlet-name=\"";
  protected final String TEXT_18 = "\"";
  protected final String TEXT_19 = NL + " *   dispatcher=\"";
  protected final String TEXT_20 = "\"";
  protected final String TEXT_21 = NL + " *" + NL + " * @web.filter-init-param" + NL + " *    name=\"";
  protected final String TEXT_22 = "\"" + NL + " *    value=\"";
  protected final String TEXT_23 = "\"";
  protected final String TEXT_24 = NL + " *    description=\"";
  protected final String TEXT_25 = "\"";
  protected final String TEXT_26 = NL + " */";
  protected final String TEXT_27 = NL + "public ";
  protected final String TEXT_28 = "abstract ";
  protected final String TEXT_29 = "final ";
  protected final String TEXT_30 = "class ";
  protected final String TEXT_31 = " extends ";
  protected final String TEXT_32 = " implements ";
  protected final String TEXT_33 = ", ";
  protected final String TEXT_34 = " {";
  protected final String TEXT_35 = NL + NL + "    /**" + NL + "     * Default constructor. " + NL + "     */" + NL + "    public ";
  protected final String TEXT_36 = "() {" + NL + "        // TODO Auto-generated constructor stub" + NL + "    }";
  protected final String TEXT_37 = NL + "       " + NL + "    /**" + NL + "     * @see ";
  protected final String TEXT_38 = "#";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = ")" + NL + "     */" + NL + "    public ";
  protected final String TEXT_41 = "(";
  protected final String TEXT_42 = ") {" + NL + "        super(";
  protected final String TEXT_43 = ");" + NL + "        // TODO Auto-generated constructor stub" + NL + "    }";
  protected final String TEXT_44 = NL + NL + "\t/**" + NL + "     * @see ";
  protected final String TEXT_45 = "#";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = ")" + NL + "     */" + NL + "    public ";
  protected final String TEXT_48 = " ";
  protected final String TEXT_49 = "(";
  protected final String TEXT_50 = ") {" + NL + "        // TODO Auto-generated method stub";
  protected final String TEXT_51 = NL + "\t\t\treturn ";
  protected final String TEXT_52 = ";";
  protected final String TEXT_53 = NL + "    }";
  protected final String TEXT_54 = NL + NL + "\t/**" + NL + "\t * @see Filter#destroy()" + NL + "\t */" + NL + "\tpublic void destroy() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t}";
  protected final String TEXT_55 = NL + NL + "\t/**" + NL + "\t * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)" + NL + "\t */" + NL + "\tpublic void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t// place your code here" + NL + "" + NL + "\t\t// pass the request along the filter chain" + NL + "\t\tchain.doFilter(request, response);" + NL + "\t}";
  protected final String TEXT_56 = NL + NL + "\t/**" + NL + "\t * @see Filter#init(FilterConfig)" + NL + "\t */" + NL + "\tpublic void init(FilterConfig fConfig) throws ServletException {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t}";
  protected final String TEXT_57 = NL + NL + "}";
  protected final String TEXT_58 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CreateFilterTemplateModel model = (CreateFilterTemplateModel) argument; 
    
	model.removeFlags(CreateJavaEEArtifactTemplateModel.FLAG_QUALIFIED_SUPERCLASS_NAME); 

    
	if (model.getJavaPackageName() != null && model.getJavaPackageName().length() > 0) {

    stringBuffer.append(TEXT_1);
    stringBuffer.append( model.getJavaPackageName() );
    stringBuffer.append(TEXT_2);
    
	}

    stringBuffer.append(TEXT_3);
     
	Collection<String> imports = model.getImports();
	for (String anImport : imports) { 

    stringBuffer.append(TEXT_4);
    stringBuffer.append( anImport );
    stringBuffer.append(TEXT_5);
     
	}

    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append( model.getClassName() );
     
	if (model.isAnnotated()) { 

    stringBuffer.append(TEXT_9);
    stringBuffer.append( model.getFilterName() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( model.getFilterName() );
    stringBuffer.append(TEXT_11);
    
		if (model.getDescription() != null && model.getDescription().length() > 0) { 

    stringBuffer.append(TEXT_12);
    stringBuffer.append( model.getDescription() );
    stringBuffer.append(TEXT_13);
     
		} 
		
		List<IFilterMappingItem> mappings = model.getFilterMappings();
 		for (IFilterMappingItem mapping : mappings) { 

    stringBuffer.append(TEXT_14);
    
			if (mapping.isUrlPatternType()) { 

    stringBuffer.append(TEXT_15);
    stringBuffer.append( mapping.getName() );
    stringBuffer.append(TEXT_16);
    
			} else if (mapping.isServletNameType()) { 

    stringBuffer.append(TEXT_17);
    stringBuffer.append( mapping.getName() );
    stringBuffer.append(TEXT_18);
    
			}
		 
			String dispatcher = model.getDispatcherList(mapping);
			if (dispatcher.length() > 0) { 

    stringBuffer.append(TEXT_19);
    stringBuffer.append( dispatcher );
    stringBuffer.append(TEXT_20);
     
			} 
		} 

		List<String[]> initParams = model.getInitParams();
		if (initParams != null && initParams.size() > 0) {
			for (int i = 0; i < initParams.size(); i++) {
				String name = model.getInitParam(i, CreateFilterTemplateModel.NAME);
				String value = model.getInitParam(i, CreateFilterTemplateModel.VALUE);
				String description = model.getInitParam(i, CreateFilterTemplateModel.DESCRIPTION); 

    stringBuffer.append(TEXT_21);
    stringBuffer.append( name );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( value );
    stringBuffer.append(TEXT_23);
    
				if (description != null && description.length() > 0) { 

    stringBuffer.append(TEXT_24);
    stringBuffer.append( description );
    stringBuffer.append(TEXT_25);
    
				}
			} 
		} 
	}

    stringBuffer.append(TEXT_26);
    
	if (model.isPublic()) { 

    stringBuffer.append(TEXT_27);
     
	} 

	if (model.isAbstract()) { 

    stringBuffer.append(TEXT_28);
    
	}

	if (model.isFinal()) {

    stringBuffer.append(TEXT_29);
    
	}

    stringBuffer.append(TEXT_30);
    stringBuffer.append( model.getClassName() );
    
	String superClass = model.getSuperclassName();
 	if (superClass != null && superClass.length() > 0) {

    stringBuffer.append(TEXT_31);
    stringBuffer.append( superClass );
    
	}

	List<String> interfaces = model.getInterfaces(); 
 	if ( interfaces.size() > 0) { 

    stringBuffer.append(TEXT_32);
    
	}
	
 	for (int i = 0; i < interfaces.size(); i++) {
   		String INTERFACE = (String) interfaces.get(i);
   		if (i > 0) {

    stringBuffer.append(TEXT_33);
    
		}

    stringBuffer.append( INTERFACE );
    
	}

    stringBuffer.append(TEXT_34);
     
	if (!model.hasEmptySuperclassConstructor()) { 

    stringBuffer.append(TEXT_35);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_36);
     
	} 

	if (model.shouldGenSuperclassConstructors()) {
		List<Constructor> constructors = model.getConstructors();
		for (Constructor constructor : constructors) {
			if (constructor.isPublic() || constructor.isProtected()) { 

    stringBuffer.append(TEXT_37);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( constructor.getParamsForJavadoc() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( constructor.getParamsForDeclaration() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( constructor.getParamsForCall() );
    stringBuffer.append(TEXT_43);
    
			} 
		} 
	} 

    
	if (model.shouldImplementAbstractMethods()) {
		for (Method method : model.getUnimplementedMethods()) { 

    stringBuffer.append(TEXT_44);
    stringBuffer.append( method.getContainingJavaClass() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( method.getParamsForJavadoc() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( method.getReturnType() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( method.getParamsForDeclaration() );
    stringBuffer.append(TEXT_50);
     
			String defaultReturnValue = method.getDefaultReturnValue();
			if (defaultReturnValue != null) { 

    stringBuffer.append(TEXT_51);
    stringBuffer.append( defaultReturnValue );
    stringBuffer.append(TEXT_52);
    
			} 

    stringBuffer.append(TEXT_53);
     
		}
	} 

     if (model.shouldGenDestroy()) { 
    stringBuffer.append(TEXT_54);
     } 
     if (model.shouldGenDoFilter()) { 
    stringBuffer.append(TEXT_55);
     } 
     if (model.shouldGenInit()) { 
    stringBuffer.append(TEXT_56);
     } 
    stringBuffer.append(TEXT_57);
    stringBuffer.append(TEXT_58);
    return stringBuffer.toString();
  }
}
