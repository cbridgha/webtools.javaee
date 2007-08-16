/**
 * <copyright>
 * </copyright>
 *
 * $Id: TaglibFactory.java,v 1.3 2006/07/14 15:07:02 jlanuti Exp $
 */
package org.eclipse.jst.j2ee.taglib.internal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.j2ee.taglib.TaglibPackage
 * @generated
 */
public interface TaglibFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaglibFactory eINSTANCE = org.eclipse.jst.j2ee.taglib.internal.impl.TaglibFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Lib</em>'.
	 * @generated
	 */
	TagLib createTagLib();

	/**
	 * Returns a new object of class '<em>JSP Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Tag</em>'.
	 * @generated
	 */
	JSPTag createJSPTag();

	/**
	 * Returns a new object of class '<em>JSP Tag Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Tag Attribute</em>'.
	 * @generated
	 */
	JSPTagAttribute createJSPTagAttribute();

	/**
	 * Returns a new object of class '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validator</em>'.
	 * @generated
	 */
	Validator createValidator();

	/**
	 * Returns a new object of class '<em>JSP Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSP Variable</em>'.
	 * @generated
	 */
	JSPVariable createJSPVariable();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Tag File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag File</em>'.
	 * @generated
	 */
	TagFile createTagFile();

	/**
	 * Returns a new object of class '<em>Tld Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tld Extension</em>'.
	 * @generated
	 */
	TldExtension createTldExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaglibPackage getTaglibPackage();

} //TaglibFactory
