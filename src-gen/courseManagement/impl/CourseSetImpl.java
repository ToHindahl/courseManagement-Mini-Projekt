/**
 */
package courseManagement.impl;

import courseManagement.Advanced;
import courseManagement.Course;
import courseManagement.CourseManagementFactory;
import courseManagement.CourseManagementPackage;
import courseManagement.CourseSet;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.impl.CourseSetImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseSetImpl extends MinimalEObjectImpl.Container implements CourseSet {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseManagementPackage.Literals.COURSE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<Course>(Course.class, this,
					CourseManagementPackage.COURSE_SET__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CourseSet allPrereqs() {
        CourseSet allPrereqs = CourseManagementFactory.eINSTANCE.createCourseSet();
        for (Course course : elements) {
            getAllPrereqs(course, allPrereqs);
        }
        return allPrereqs;
	}
	
	private void getAllPrereqs(Course course, CourseSet allPrereqs) {
		if (course.getClass() == AdvancedImpl.class) {
			Advanced aCourse = (Advanced) course;
	        for (Course prereq : aCourse.getPrereqs()) {
	            if (!allPrereqs.getElements().contains(prereq)) {
	                allPrereqs.getElements().add(prereq);
	                getAllPrereqs(prereq, allPrereqs);
	            }
	        }
		}

    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseManagementPackage.COURSE_SET__ELEMENTS:
			return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CourseManagementPackage.COURSE_SET__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Course>) newValue);
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
		case CourseManagementPackage.COURSE_SET__ELEMENTS:
			getElements().clear();
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
		case CourseManagementPackage.COURSE_SET__ELEMENTS:
			return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CourseManagementPackage.COURSE_SET___ALL_PREREQS:
			return allPrereqs();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CourseSetImpl
