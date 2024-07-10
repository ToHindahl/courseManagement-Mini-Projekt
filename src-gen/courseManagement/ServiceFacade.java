/**
 */
package courseManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.ServiceFacade#getResult <em>Result</em>}</li>
 *   <li>{@link courseManagement.ServiceFacade#getStudent <em>Student</em>}</li>
 *   <li>{@link courseManagement.ServiceFacade#getCourse <em>Course</em>}</li>
 *   <li>{@link courseManagement.ServiceFacade#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see courseManagement.CourseManagementPackage#getServiceFacade()
 * @model
 * @generated
 */
public interface ServiceFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link courseManagement.Result}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see courseManagement.CourseManagementPackage#getServiceFacade_Result()
	 * @model containment="true"
	 * @generated
	 */
	EList<Result> getResult();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link courseManagement.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see courseManagement.CourseManagementPackage#getServiceFacade_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link courseManagement.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see courseManagement.CourseManagementPackage#getServiceFacade_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference list.
	 * The list contents are of type {@link courseManagement.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference list.
	 * @see courseManagement.CourseManagementPackage#getServiceFacade_Program()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getProgram();

} // ServiceFacade
