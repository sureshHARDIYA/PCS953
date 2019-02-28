/**
 */
package org.henshin.moviedb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.henshin.moviedb.Couple;
import org.henshin.moviedb.MoviedbPackage;
import org.henshin.moviedb.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Couple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.henshin.moviedb.impl.CoupleImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link org.henshin.moviedb.impl.CoupleImpl#getP2 <em>P2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoupleImpl extends GroupImpl implements Couple {
	/**
	 * The cached value of the '{@link #getP1() <em>P1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP1()
	 * @generated
	 * @ordered
	 */
	protected Person p1;

	/**
	 * The cached value of the '{@link #getP2() <em>P2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP2()
	 * @generated
	 * @ordered
	 */
	protected Person p2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoviedbPackage.Literals.COUPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getP1() {
		if (p1 != null && p1.eIsProxy()) {
			InternalEObject oldP1 = (InternalEObject) p1;
			p1 = (Person) eResolveProxy(oldP1);
			if (p1 != oldP1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoviedbPackage.COUPLE__P1, oldP1, p1));
			}
		}
		return p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetP1() {
		return p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP1(Person newP1) {
		Person oldP1 = p1;
		p1 = newP1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoviedbPackage.COUPLE__P1, oldP1, p1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getP2() {
		if (p2 != null && p2.eIsProxy()) {
			InternalEObject oldP2 = (InternalEObject) p2;
			p2 = (Person) eResolveProxy(oldP2);
			if (p2 != oldP2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoviedbPackage.COUPLE__P2, oldP2, p2));
			}
		}
		return p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetP2() {
		return p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP2(Person newP2) {
		Person oldP2 = p2;
		p2 = newP2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoviedbPackage.COUPLE__P2, oldP2, p2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MoviedbPackage.COUPLE__P1:
			if (resolve)
				return getP1();
			return basicGetP1();
		case MoviedbPackage.COUPLE__P2:
			if (resolve)
				return getP2();
			return basicGetP2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MoviedbPackage.COUPLE__P1:
			setP1((Person) newValue);
			return;
		case MoviedbPackage.COUPLE__P2:
			setP2((Person) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MoviedbPackage.COUPLE__P1:
			setP1((Person) null);
			return;
		case MoviedbPackage.COUPLE__P2:
			setP2((Person) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MoviedbPackage.COUPLE__P1:
			return p1 != null;
		case MoviedbPackage.COUPLE__P2:
			return p2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CoupleImpl
