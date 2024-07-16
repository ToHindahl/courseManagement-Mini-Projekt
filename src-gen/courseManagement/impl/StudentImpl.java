/**
 */
package courseManagement.impl;

import courseManagement.Course;
import courseManagement.CourseManagementFactory;
import courseManagement.CourseManagementPackage;
import courseManagement.CourseSet;
import courseManagement.Grade;
import courseManagement.Introductory;
import courseManagement.Program;
import courseManagement.Result;
import courseManagement.Semester;
import courseManagement.Student;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseManagement.impl.StudentImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link courseManagement.impl.StudentImpl#getTranscript <em>Transcript</em>}</li>
 *   <li>{@link courseManagement.impl.StudentImpl#getCompleted <em>Completed</em>}</li>
 *   <li>{@link courseManagement.impl.StudentImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link courseManagement.impl.StudentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends MinimalEObjectImpl.Container implements Student {
	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

	/**
	 * The cached value of the '{@link #getTranscript() <em>Transcript</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscript()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> transcript;

	/**
	 * The cached value of the '{@link #getCompleted() <em>Completed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleted()
	 * @generated
	 * @ordered
	 */
	protected CourseSet completed;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final Semester SEMESTER_EDEFAULT = Semester.ONE;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester = SEMESTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseManagementPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (program != null && program.eIsProxy()) {
			InternalEObject oldProgram = (InternalEObject) program;
			program = (Program) eResolveProxy(oldProgram);
			if (program != oldProgram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourseManagementPackage.STUDENT__PROGRAM,
							oldProgram, program));
			}
		}
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program basicGetProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseManagementPackage.STUDENT__PROGRAM, oldProgram, newProgram);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject) program).eInverseRemove(this, CourseManagementPackage.PROGRAM__ENROLLED,
						Program.class, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject) newProgram).eInverseAdd(this, CourseManagementPackage.PROGRAM__ENROLLED,
						Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseManagementPackage.STUDENT__PROGRAM, newProgram,
					newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getTranscript() {
		if (transcript == null) {
			transcript = new EObjectResolvingEList<Result>(Result.class, this,
					CourseManagementPackage.STUDENT__TRANSCRIPT);
		}
		return transcript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSet getCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompleted(CourseSet newCompleted, NotificationChain msgs) {
		CourseSet oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseManagementPackage.STUDENT__COMPLETED, oldCompleted, newCompleted);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompleted(CourseSet newCompleted) {
		if (newCompleted != completed) {
			NotificationChain msgs = null;
			if (completed != null)
				msgs = ((InternalEObject) completed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CourseManagementPackage.STUDENT__COMPLETED, null, msgs);
			if (newCompleted != null)
				msgs = ((InternalEObject) newCompleted).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CourseManagementPackage.STUDENT__COMPLETED, null, msgs);
			msgs = basicSetCompleted(newCompleted, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseManagementPackage.STUDENT__COMPLETED,
					newCompleted, newCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseManagementPackage.STUDENT__SEMESTER,
					oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseManagementPackage.STUDENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean canComplete(Course c) {
		System.out.println("Check canComplete: " + c.toString() + ", " + this.toString() + ", " + this.getTranscript().toString());
		CourseSet allPrereqs = CourseManagementFactory.eINSTANCE.createCourseSet();
		allPrereqs.getElements().add(c);
		System.out.println(allPrereqs.allPrereqs().getElements().toString());
        for (Course prereq : allPrereqs.allPrereqs().getElements()) {
        	if(c instanceof Introductory) {
        		for (Result r : this.getTranscript()) {
            		if (r.getKey().equals(prereq)) {
            			Grade rFromC = r.getValue();
            			if (rFromC == Grade.F) {
            				System.out.println("check2 false");
            				return false;
            			} else {
            				return true;
            			}
            		}
            	}
        		return true;
        	} else {
        		for (Result r : this.getTranscript()) {
            		if (r.getKey().equals(prereq)) {
            			Grade rFromC = r.getValue();
            			if (rFromC == Grade.F) {
            				System.out.println("check2 false");
            				return false;
            			} else {
            				return true;
            			}
            		}
            	}
            	System.out.println("check1 false");
    			return false;	
        	}
        	
        }
        System.out.println("check true");
        return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseManagementPackage.STUDENT__PROGRAM:
			if (program != null)
				msgs = ((InternalEObject) program).eInverseRemove(this, CourseManagementPackage.PROGRAM__ENROLLED,
						Program.class, msgs);
			return basicSetProgram((Program) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseManagementPackage.STUDENT__PROGRAM:
			return basicSetProgram(null, msgs);
		case CourseManagementPackage.STUDENT__COMPLETED:
			return basicSetCompleted(null, msgs);
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
		case CourseManagementPackage.STUDENT__PROGRAM:
			if (resolve)
				return getProgram();
			return basicGetProgram();
		case CourseManagementPackage.STUDENT__TRANSCRIPT:
			return getTranscript();
		case CourseManagementPackage.STUDENT__COMPLETED:
			return getCompleted();
		case CourseManagementPackage.STUDENT__SEMESTER:
			return getSemester();
		case CourseManagementPackage.STUDENT__NAME:
			return getName();
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
		case CourseManagementPackage.STUDENT__PROGRAM:
			setProgram((Program) newValue);
			return;
		case CourseManagementPackage.STUDENT__TRANSCRIPT:
			getTranscript().clear();
			getTranscript().addAll((Collection<? extends Result>) newValue);
			return;
		case CourseManagementPackage.STUDENT__COMPLETED:
			setCompleted((CourseSet) newValue);
			return;
		case CourseManagementPackage.STUDENT__SEMESTER:
			setSemester((Semester) newValue);
			return;
		case CourseManagementPackage.STUDENT__NAME:
			setName((String) newValue);
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
		case CourseManagementPackage.STUDENT__PROGRAM:
			setProgram((Program) null);
			return;
		case CourseManagementPackage.STUDENT__TRANSCRIPT:
			getTranscript().clear();
			return;
		case CourseManagementPackage.STUDENT__COMPLETED:
			setCompleted((CourseSet) null);
			return;
		case CourseManagementPackage.STUDENT__SEMESTER:
			setSemester(SEMESTER_EDEFAULT);
			return;
		case CourseManagementPackage.STUDENT__NAME:
			setName(NAME_EDEFAULT);
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
		case CourseManagementPackage.STUDENT__PROGRAM:
			return program != null;
		case CourseManagementPackage.STUDENT__TRANSCRIPT:
			return transcript != null && !transcript.isEmpty();
		case CourseManagementPackage.STUDENT__COMPLETED:
			return completed != null;
		case CourseManagementPackage.STUDENT__SEMESTER:
			return semester != SEMESTER_EDEFAULT;
		case CourseManagementPackage.STUDENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		case CourseManagementPackage.STUDENT___CAN_COMPLETE__COURSE:
			return canComplete((Course) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semester: ");
		result.append(semester);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
