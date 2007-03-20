/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebFactory.java,v 1.1 2007/03/20 18:04:46 jsholl Exp $
 */
package org.eclipse.jst.javaee.web.internal.metadata;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.jst.javaee.web.AuthConstraint;
import org.eclipse.jst.javaee.web.ErrorPage;
import org.eclipse.jst.javaee.web.Filter;
import org.eclipse.jst.javaee.web.FilterMapping;
import org.eclipse.jst.javaee.web.FormLoginConfig;
import org.eclipse.jst.javaee.web.LocaleEncodingMapping;
import org.eclipse.jst.javaee.web.LocaleEncodingMappingList;
import org.eclipse.jst.javaee.web.LoginConfig;
import org.eclipse.jst.javaee.web.MimeMapping;
import org.eclipse.jst.javaee.web.SecurityConstraint;
import org.eclipse.jst.javaee.web.Servlet;
import org.eclipse.jst.javaee.web.ServletMapping;
import org.eclipse.jst.javaee.web.SessionConfig;
import org.eclipse.jst.javaee.web.UserDataConstraint;
import org.eclipse.jst.javaee.web.WebApp;
import org.eclipse.jst.javaee.web.WebAppDeploymentDescriptor;
import org.eclipse.jst.javaee.web.WebResourceCollection;
import org.eclipse.jst.javaee.web.WelcomeFileList;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.javaee.web.internal.metadata.WebPackage
 * @generated
 */
public interface WebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebFactory eINSTANCE = org.eclipse.jst.javaee.web.internal.impl.WebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Auth Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auth Constraint</em>'.
	 * @generated
	 */
	AuthConstraint createAuthConstraint();

	/**
	 * Returns a new object of class '<em>Error Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Page</em>'.
	 * @generated
	 */
	ErrorPage createErrorPage();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Filter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Mapping</em>'.
	 * @generated
	 */
	FilterMapping createFilterMapping();

	/**
	 * Returns a new object of class '<em>Form Login Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Login Config</em>'.
	 * @generated
	 */
	FormLoginConfig createFormLoginConfig();

	/**
	 * Returns a new object of class '<em>Locale Encoding Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Locale Encoding Mapping</em>'.
	 * @generated
	 */
	LocaleEncodingMapping createLocaleEncodingMapping();

	/**
	 * Returns a new object of class '<em>Locale Encoding Mapping List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Locale Encoding Mapping List</em>'.
	 * @generated
	 */
	LocaleEncodingMappingList createLocaleEncodingMappingList();

	/**
	 * Returns a new object of class '<em>Login Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Config</em>'.
	 * @generated
	 */
	LoginConfig createLoginConfig();

	/**
	 * Returns a new object of class '<em>Mime Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Mapping</em>'.
	 * @generated
	 */
	MimeMapping createMimeMapping();

	/**
	 * Returns a new object of class '<em>Security Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Constraint</em>'.
	 * @generated
	 */
	SecurityConstraint createSecurityConstraint();

	/**
	 * Returns a new object of class '<em>Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servlet</em>'.
	 * @generated
	 */
	Servlet createServlet();

	/**
	 * Returns a new object of class '<em>Servlet Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servlet Mapping</em>'.
	 * @generated
	 */
	ServletMapping createServletMapping();

	/**
	 * Returns a new object of class '<em>Session Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Config</em>'.
	 * @generated
	 */
	SessionConfig createSessionConfig();

	/**
	 * Returns a new object of class '<em>User Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Data Constraint</em>'.
	 * @generated
	 */
	UserDataConstraint createUserDataConstraint();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	WebApp createWebApp();

	/**
	 * Returns a new object of class '<em>App Deployment Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Deployment Descriptor</em>'.
	 * @generated
	 */
	WebAppDeploymentDescriptor createWebAppDeploymentDescriptor();

	/**
	 * Returns a new object of class '<em>Resource Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Collection</em>'.
	 * @generated
	 */
	WebResourceCollection createWebResourceCollection();

	/**
	 * Returns a new object of class '<em>Welcome File List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Welcome File List</em>'.
	 * @generated
	 */
	WelcomeFileList createWelcomeFileList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebPackage getWebPackage();

} //WebFactory
