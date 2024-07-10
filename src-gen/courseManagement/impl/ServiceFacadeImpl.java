/**
 */
package courseManagement.impl;

import courseManagement.Course;
import courseManagement.CourseManagementPackage;
import courseManagement.Program;
import courseManagement.Result;
import courseManagement.ServiceFacade;
import courseManagement.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.impl.ServiceFacadeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link courseManagement.impl.ServiceFacadeImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link courseManagement.impl.ServiceFacadeImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link courseManagement.impl.ServiceFacadeImpl#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceFacadeImpl extends MinimalEObjectImpl.Container implements ServiceFacade {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> result;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> program;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseManagementPackage.Literals.SERVICE_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<Result>(Result.class, this,
					CourseManagementPackage.SERVICE_FACADE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this,
					CourseManagementPackage.SERVICE_FACADE__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this,
					CourseManagementPackage.SERVICE_FACADE__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Program> getProgram() {
		if (program == null) {
			program = new EObjectContainmentEList<Program>(Program.class, this,
					CourseManagementPackage.SERVICE_FACADE__PROGRAM);
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseManagementPackage.SERVICE_FACADE__RESULT:
			return ((InternalEList<?>) getResult()).basicRemove(otherEnd, msgs);
		case CourseManagementPackage.SERVICE_FACADE__STUDENT:
			return ((InternalEList<?>) getStudent()).basicRemove(otherEnd, msgs);
		case CourseManagementPackage.SERVICE_FACADE__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
		case CourseManagementPackage.SERVICE_FACADE__PROGRAM:
			return ((InternalEList<?>) getProgram()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseManagementPackage.SERVICE_FACADE__RESULT:
			return getResult();
		case CourseManagementPackage.SERVICE_FACADE__STUDENT:
			return getStudent();
		case CourseManagementPackage.SERVICE_FACADE__COURSE:
			return getCourse();
		case CourseManagementPackage.SERVICE_FACADE__PROGRAM:
			return getProgram();
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
		case CourseManagementPackage.SERVICE_FACADE__RESULT:
			getResult().clear();
			getResult().addAll((Collection<? extends Result>) newValue);
			return;
		case CourseManagementPackage.SERVICE_FACADE__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Student>) newValue);
			return;
		case CourseManagementPackage.SERVICE_FACADE__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case CourseManagementPackage.SERVICE_FACADE__PROGRAM:
			getProgram().clear();
			getProgram().addAll((Collection<? extends Program>) newValue);
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
		case CourseManagementPackage.SERVICE_FACADE__RESULT:
			getResult().clear();
			return;
		case CourseManagementPackage.SERVICE_FACADE__STUDENT:
			getStudent().clear();
			return;
		case CourseManagementPackage.SERVICE_FACADE__COURSE:
			getCourse().clear();
			return;
		case CourseManagementPackage.SERVICE_FACADE__PROGRAM:
			getProgram().clear();
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
		case CourseManagementPackage.SERVICE_FACADE__RESULT:
			return result != null && !result.isEmpty();
		case CourseManagementPackage.SERVICE_FACADE__STUDENT:
			return student != null && !student.isEmpty();
		case CourseManagementPackage.SERVICE_FACADE__COURSE:
			return course != null && !course.isEmpty();
		case CourseManagementPackage.SERVICE_FACADE__PROGRAM:
			return program != null && !program.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceFacadeImpl
