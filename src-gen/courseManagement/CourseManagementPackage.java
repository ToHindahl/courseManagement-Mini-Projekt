/**
 */
package courseManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see courseManagement.CourseManagementFactory
 * @model kind="package"
 * @generated
 */
public interface CourseManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "courseManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/courseManagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "courseManagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourseManagementPackage eINSTANCE = courseManagement.impl.CourseManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link courseManagement.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.ProgramImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Enrolled</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ENROLLED = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courseManagement.impl.CourseSetImpl <em>Course Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.CourseSetImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getCourseSet()
	 * @generated
	 */
	int COURSE_SET = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Course Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>All Prereqs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET___ALL_PREREQS = 0;

	/**
	 * The number of operations of the '<em>Course Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link courseManagement.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.StudentImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Transcript</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TRANSCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COMPLETED = 2;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Can Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___CAN_COMPLETE__COURSE = 0;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link courseManagement.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.CourseImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___IS_ELECTIVE = 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link courseManagement.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.ResultImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courseManagement.impl.AdvancedImpl <em>Advanced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.AdvancedImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getAdvanced()
	 * @generated
	 */
	int ADVANCED = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED__TITLE = COURSE__TITLE;

	/**
	 * The feature id for the '<em><b>Prereqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED__PREREQS = COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Advanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_FEATURE_COUNT = COURSE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED___IS_ELECTIVE = COURSE___IS_ELECTIVE;

	/**
	 * The number of operations of the '<em>Advanced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link courseManagement.impl.IntroductoryImpl <em>Introductory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.IntroductoryImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getIntroductory()
	 * @generated
	 */
	int INTRODUCTORY = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY__TITLE = COURSE__TITLE;

	/**
	 * The number of structural features of the '<em>Introductory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY_FEATURE_COUNT = COURSE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Elective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY___IS_ELECTIVE = COURSE___IS_ELECTIVE;

	/**
	 * The number of operations of the '<em>Introductory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRODUCTORY_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link courseManagement.impl.ServiceFacadeImpl <em>Service Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.impl.ServiceFacadeImpl
	 * @see courseManagement.impl.CourseManagementPackageImpl#getServiceFacade()
	 * @generated
	 */
	int SERVICE_FACADE = 7;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__COURSE = 2;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE__PROGRAM = 3;

	/**
	 * The number of structural features of the '<em>Service Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FACADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link courseManagement.Grade <em>Grade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.Grade
	 * @see courseManagement.impl.CourseManagementPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 8;

	/**
	 * The meta object id for the '{@link courseManagement.Semester <em>Semester</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseManagement.Semester
	 * @see courseManagement.impl.CourseManagementPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 9;

	/**
	 * Returns the meta object for class '{@link courseManagement.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see courseManagement.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the reference list '{@link courseManagement.Program#getEnrolled <em>Enrolled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enrolled</em>'.
	 * @see courseManagement.Program#getEnrolled()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Enrolled();

	/**
	 * Returns the meta object for the containment reference '{@link courseManagement.Program#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required</em>'.
	 * @see courseManagement.Program#getRequired()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Required();

	/**
	 * Returns the meta object for the containment reference '{@link courseManagement.Program#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Courses</em>'.
	 * @see courseManagement.Program#getCourses()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Courses();

	/**
	 * Returns the meta object for the attribute '{@link courseManagement.Program#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see courseManagement.Program#getLabel()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Label();

	/**
	 * Returns the meta object for class '{@link courseManagement.CourseSet <em>Course Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Set</em>'.
	 * @see courseManagement.CourseSet
	 * @generated
	 */
	EClass getCourseSet();

	/**
	 * Returns the meta object for the reference list '{@link courseManagement.CourseSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see courseManagement.CourseSet#getElements()
	 * @see #getCourseSet()
	 * @generated
	 */
	EReference getCourseSet_Elements();

	/**
	 * Returns the meta object for the '{@link courseManagement.CourseSet#allPrereqs() <em>All Prereqs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Prereqs</em>' operation.
	 * @see courseManagement.CourseSet#allPrereqs()
	 * @generated
	 */
	EOperation getCourseSet__AllPrereqs();

	/**
	 * Returns the meta object for class '{@link courseManagement.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see courseManagement.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the reference '{@link courseManagement.Student#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see courseManagement.Student#getProgram()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Program();

	/**
	 * Returns the meta object for the reference list '{@link courseManagement.Student#getTranscript <em>Transcript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transcript</em>'.
	 * @see courseManagement.Student#getTranscript()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Transcript();

	/**
	 * Returns the meta object for the containment reference '{@link courseManagement.Student#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completed</em>'.
	 * @see courseManagement.Student#getCompleted()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Completed();

	/**
	 * Returns the meta object for the attribute '{@link courseManagement.Student#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see courseManagement.Student#getSemester()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Semester();

	/**
	 * Returns the meta object for the attribute '{@link courseManagement.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courseManagement.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the '{@link courseManagement.Student#canComplete(courseManagement.Course) <em>Can Complete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Complete</em>' operation.
	 * @see courseManagement.Student#canComplete(courseManagement.Course)
	 * @generated
	 */
	EOperation getStudent__CanComplete__Course();

	/**
	 * Returns the meta object for class '{@link courseManagement.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see courseManagement.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link courseManagement.Course#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see courseManagement.Course#getTitle()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Title();

	/**
	 * Returns the meta object for the '{@link courseManagement.Course#isElective() <em>Is Elective</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Elective</em>' operation.
	 * @see courseManagement.Course#isElective()
	 * @generated
	 */
	EOperation getCourse__IsElective();

	/**
	 * Returns the meta object for class '{@link courseManagement.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see courseManagement.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the reference '{@link courseManagement.Result#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see courseManagement.Result#getKey()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Key();

	/**
	 * Returns the meta object for the attribute '{@link courseManagement.Result#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see courseManagement.Result#getValue()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_Value();

	/**
	 * Returns the meta object for class '{@link courseManagement.Advanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advanced</em>'.
	 * @see courseManagement.Advanced
	 * @generated
	 */
	EClass getAdvanced();

	/**
	 * Returns the meta object for the containment reference list '{@link courseManagement.Advanced#getPrereqs <em>Prereqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prereqs</em>'.
	 * @see courseManagement.Advanced#getPrereqs()
	 * @see #getAdvanced()
	 * @generated
	 */
	EReference getAdvanced_Prereqs();

	/**
	 * Returns the meta object for class '{@link courseManagement.Introductory <em>Introductory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Introductory</em>'.
	 * @see courseManagement.Introductory
	 * @generated
	 */
	EClass getIntroductory();

	/**
	 * Returns the meta object for class '{@link courseManagement.ServiceFacade <em>Service Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Facade</em>'.
	 * @see courseManagement.ServiceFacade
	 * @generated
	 */
	EClass getServiceFacade();

	/**
	 * Returns the meta object for the containment reference list '{@link courseManagement.ServiceFacade#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see courseManagement.ServiceFacade#getResult()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link courseManagement.ServiceFacade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see courseManagement.ServiceFacade#getStudent()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Student();

	/**
	 * Returns the meta object for the containment reference list '{@link courseManagement.ServiceFacade#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see courseManagement.ServiceFacade#getCourse()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link courseManagement.ServiceFacade#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see courseManagement.ServiceFacade#getProgram()
	 * @see #getServiceFacade()
	 * @generated
	 */
	EReference getServiceFacade_Program();

	/**
	 * Returns the meta object for enum '{@link courseManagement.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grade</em>'.
	 * @see courseManagement.Grade
	 * @generated
	 */
	EEnum getGrade();

	/**
	 * Returns the meta object for enum '{@link courseManagement.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester</em>'.
	 * @see courseManagement.Semester
	 * @generated
	 */
	EEnum getSemester();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourseManagementFactory getCourseManagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link courseManagement.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.ProgramImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Enrolled</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ENROLLED = eINSTANCE.getProgram_Enrolled();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__REQUIRED = eINSTANCE.getProgram_Required();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__COURSES = eINSTANCE.getProgram_Courses();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__LABEL = eINSTANCE.getProgram_Label();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.CourseSetImpl <em>Course Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.CourseSetImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getCourseSet()
		 * @generated
		 */
		EClass COURSE_SET = eINSTANCE.getCourseSet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_SET__ELEMENTS = eINSTANCE.getCourseSet_Elements();

		/**
		 * The meta object literal for the '<em><b>All Prereqs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_SET___ALL_PREREQS = eINSTANCE.getCourseSet__AllPrereqs();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.StudentImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__PROGRAM = eINSTANCE.getStudent_Program();

		/**
		 * The meta object literal for the '<em><b>Transcript</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__TRANSCRIPT = eINSTANCE.getStudent_Transcript();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__COMPLETED = eINSTANCE.getStudent_Completed();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__SEMESTER = eINSTANCE.getStudent_Semester();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Can Complete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___CAN_COMPLETE__COURSE = eINSTANCE.getStudent__CanComplete__Course();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.CourseImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TITLE = eINSTANCE.getCourse_Title();

		/**
		 * The meta object literal for the '<em><b>Is Elective</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___IS_ELECTIVE = eINSTANCE.getCourse__IsElective();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.ResultImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__KEY = eINSTANCE.getResult_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__VALUE = eINSTANCE.getResult_Value();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.AdvancedImpl <em>Advanced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.AdvancedImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getAdvanced()
		 * @generated
		 */
		EClass ADVANCED = eINSTANCE.getAdvanced();

		/**
		 * The meta object literal for the '<em><b>Prereqs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVANCED__PREREQS = eINSTANCE.getAdvanced_Prereqs();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.IntroductoryImpl <em>Introductory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.IntroductoryImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getIntroductory()
		 * @generated
		 */
		EClass INTRODUCTORY = eINSTANCE.getIntroductory();

		/**
		 * The meta object literal for the '{@link courseManagement.impl.ServiceFacadeImpl <em>Service Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.impl.ServiceFacadeImpl
		 * @see courseManagement.impl.CourseManagementPackageImpl#getServiceFacade()
		 * @generated
		 */
		EClass SERVICE_FACADE = eINSTANCE.getServiceFacade();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__RESULT = eINSTANCE.getServiceFacade_Result();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__STUDENT = eINSTANCE.getServiceFacade_Student();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__COURSE = eINSTANCE.getServiceFacade_Course();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_FACADE__PROGRAM = eINSTANCE.getServiceFacade_Program();

		/**
		 * The meta object literal for the '{@link courseManagement.Grade <em>Grade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.Grade
		 * @see courseManagement.impl.CourseManagementPackageImpl#getGrade()
		 * @generated
		 */
		EEnum GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '{@link courseManagement.Semester <em>Semester</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseManagement.Semester
		 * @see courseManagement.impl.CourseManagementPackageImpl#getSemester()
		 * @generated
		 */
		EEnum SEMESTER = eINSTANCE.getSemester();

	}

} //CourseManagementPackage
