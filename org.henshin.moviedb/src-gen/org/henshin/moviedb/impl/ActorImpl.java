/**
 */
package org.henshin.moviedb.impl;

import org.eclipse.emf.ecore.EClass;

import org.henshin.moviedb.Actor;
import org.henshin.moviedb.MoviedbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActorImpl extends PersonImpl implements Actor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoviedbPackage.Literals.ACTOR;
	}

} //ActorImpl
