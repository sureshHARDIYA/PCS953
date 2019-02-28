/**
 */
package org.henshin.moviedb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.henshin.moviedb.Movie#getTitle <em>Title</em>}</li>
 *   <li>{@link org.henshin.moviedb.Movie#getRating <em>Rating</em>}</li>
 *   <li>{@link org.henshin.moviedb.Movie#getYear <em>Year</em>}</li>
 *   <li>{@link org.henshin.moviedb.Movie#getType <em>Type</em>}</li>
 *   <li>{@link org.henshin.moviedb.Movie#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.henshin.moviedb.MoviedbPackage#getMovie()
 * @model
 * @generated
 */
public interface Movie extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.henshin.moviedb.MoviedbPackage#getMovie_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.henshin.moviedb.Movie#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(Double)
	 * @see org.henshin.moviedb.MoviedbPackage#getMovie_Rating()
	 * @model
	 * @generated
	 */
	Double getRating();

	/**
	 * Sets the value of the '{@link org.henshin.moviedb.Movie#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(Double value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see org.henshin.moviedb.MoviedbPackage#getMovie_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link org.henshin.moviedb.Movie#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.henshin.moviedb.MovieType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.henshin.moviedb.MovieType
	 * @see #setType(MovieType)
	 * @see org.henshin.moviedb.MoviedbPackage#getMovie_Type()
	 * @model default=""
	 * @generated
	 */
	MovieType getType();

	/**
	 * Sets the value of the '{@link org.henshin.moviedb.Movie#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.henshin.moviedb.MovieType
	 * @see #getType()
	 * @generated
	 */
	void setType(MovieType value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link org.henshin.moviedb.Person}.
	 * It is bidirectional and its opposite is '{@link org.henshin.moviedb.Person#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see org.henshin.moviedb.MoviedbPackage#getMovie_Persons()
	 * @see org.henshin.moviedb.Person#getMovies
	 * @model opposite="movies"
	 * @generated
	 */
	EList<Person> getPersons();

} // Movie
