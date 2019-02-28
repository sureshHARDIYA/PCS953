/**
 */
package org.henshin.moviedb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.henshin.moviedb.Group#getCommonMovies <em>Common Movies</em>}</li>
 * </ul>
 *
 * @see org.henshin.moviedb.MoviedbPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Movies</b></em>' reference list.
	 * The list contents are of type {@link org.henshin.moviedb.Movie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Movies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Movies</em>' reference list.
	 * @see org.henshin.moviedb.MoviedbPackage#getGroup_CommonMovies()
	 * @model
	 * @generated
	 */
	EList<Movie> getCommonMovies();

} // Group
