/**
 */
package courseManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.Student#getProgram <em>Program</em>}</li>
 *   <li>{@link courseManagement.Student#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link courseManagement.Student#getCompleted <em>Completed</em>}</li>
 *   <li>{@link courseManagement.Student#getSemester <em>Semester</em>}</li>
 *   <li>{@link courseManagement.Student#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see courseManagement.CourseManagementPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link courseManagement.Program#getEnrolled <em>Enrolled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see courseManagement.CourseManagementPackage#getStudent_Program()
	 * @see courseManagement.Program#getEnrolled
	 * @model opposite="enrolled"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link courseManagement.Student#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Transcript</b></em>' reference list.
	 * The list contents are of type {@link courseManagement.Result}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transcript</em>' reference list.
	 * @see courseManagement.CourseManagementPackage#getStudent_Transcript()
	 * @model
	 * @generated
	 */
	EList<Result> getTranscript();

	/**
	 * Returns the value of the '<em><b>Completed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' containment reference.
	 * @see #setCompleted(CourseSet)
	 * @see courseManagement.CourseManagementPackage#getStudent_Completed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CourseSet getCompleted();

	/**
	 * Sets the value of the '{@link courseManagement.Student#getCompleted <em>Completed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' containment reference.
	 * @see #getCompleted()
	 * @generated
	 */
	void setCompleted(CourseSet value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link courseManagement.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see courseManagement.Semester
	 * @see #setSemester(Semester)
	 * @see courseManagement.CourseManagementPackage#getStudent_Semester()
	 * @model required="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link courseManagement.Student#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see courseManagement.Semester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courseManagement.CourseManagementPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courseManagement.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canComplete(Course c);

} // Student
