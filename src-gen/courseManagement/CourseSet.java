/**
 */
package courseManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.CourseSet#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see courseManagement.CourseManagementPackage#getCourseSet()
 * @model
 * @generated
 */
public interface CourseSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link courseManagement.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see courseManagement.CourseManagementPackage#getCourseSet_Elements()
	 * @model
	 * @generated
	 */
	EList<Course> getElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CourseSet allPrereqs();

} // CourseSet
