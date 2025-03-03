package courseManagement;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {

    private Resource resource;
    private ResourceSet resourceSet;
    private CourseManagementFactory factory;
    private ServiceFacade university;

	@Override
    public void start(Stage primaryStage) {

    
    	
        primaryStage.setTitle("Studienprogramm Verwaltung");

        
        factory = CourseManagementFactory.eINSTANCE;
        university = factory.createServiceFacade();
        

        primaryStage.setTitle("Studienprogramm Verwaltung");

        // Hauptcontainer
        VBox root = new VBox(10);

        // Komponenten
        Button addProgramButton = new Button("Programm hinzufügen");
        Button addStudentButton = new Button("Student hinzufügen");
        Button joinProgramButton = new Button("Student zu Programm zuordnen");
        Button addIntroductoryCourseButton = new Button("Einführungskurs hinzufügen");
        Button addAdvancedCourseButton = new Button("Weiterführenden Kurs hinzufügen");
        Button completeCoursesButton = new Button("Kurs abschließen");
        Button loadDataButton = new Button("Daten laden");
        Button saveDataButton = new Button("Daten speichern");

        // Komponenten zum Container hinzufügen
        root.getChildren().addAll(
            addProgramButton, addStudentButton, joinProgramButton, addAdvancedCourseButton, addIntroductoryCourseButton, 
            completeCoursesButton, loadDataButton, saveDataButton
        );

        // Event Handler hinzufügen (wird später implementiert)
        addProgramButton.setOnAction(e -> addProgram());
        addStudentButton.setOnAction(e -> addStudent());
        joinProgramButton.setOnAction(e -> joinProgram());
        addIntroductoryCourseButton.setOnAction(e -> addIntroductoryCourse());
        addAdvancedCourseButton.setOnAction(e -> addAdvancedCourse());
        completeCoursesButton.setOnAction(e -> completeCourses());
        loadDataButton.setOnAction(e -> loadData());
        saveDataButton.setOnAction(e -> saveData());

        // Scene erstellen und anzeigen
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    

	private void joinProgram() {
    	if (university.getStudent().isEmpty() || university.getProgram().isEmpty()) {
            showAlert("Fehler", "Es müssen zuerst Studenten und Programme angelegt werden.");
            return;
        }

        ChoiceDialog<Student> studentDialog = new ChoiceDialog<>(university.getStudent().get(0), university.getStudent());
        studentDialog.setTitle("Student auswählen");
        studentDialog.setHeaderText("Wählen Sie einen Studenten aus:");
        studentDialog.setContentText("Student:");

        Optional<Student> studentResult = studentDialog.showAndWait();
        if (studentResult.isPresent() && studentResult.get().getProgram() == null) {
            Student student = studentResult.get();

            ChoiceDialog<Program> programDialog = new ChoiceDialog<>(university.getProgram().get(0), university.getProgram());
            programDialog.setTitle("Programm auswählen");
            programDialog.setHeaderText("Wählen Sie ein Programm aus:");
            programDialog.setContentText("Programm:");

            Optional<Program> programResult = programDialog.showAndWait();
            if (programResult.isPresent()) {
                Program program = programResult.get();

                student.setProgram(program);
                showAlert("Erfolgreich", "Student erfolgreich für Programm eingeschrieben!");
            }
        } else if (studentResult.get().getProgram() != null) {
        	showAlert("Error", "Student belegt bereits ein Programm!");
        }
	}

	private void addProgram() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Programm hinzufügen");
        dialog.setHeaderText("Geben Sie den Namen des Programms ein:");
        dialog.setContentText("Programmname:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> {
            Program program = factory.createProgram();
            program.setLabel(name);
            program.setCourses(factory.createCourseSet());
            university.getProgram().add(program);
        });
    }

    private void addStudent() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Student hinzufügen");
        dialog.setHeaderText("Geben Sie den Namen des Studenten ein:");
        dialog.setContentText("Studentenname:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> {
            Student student = factory.createStudent();
            student.setName(name);
            university.getStudent().add(student);
        });
    }

    private void addAdvancedCourse() {
    	if (university.getStudent().isEmpty() || university.getProgram().isEmpty() || university.getCourse().isEmpty()) {
    		System.out.println(university.getStudent().toString());
    		System.out.println(university.getProgram().toString());
    		System.out.println(university.getCourse().toString());
            showAlert("Fehler", "Es müssen zuerst Studenten, Programme und ein Einführungskurs angelegt werden.");
            return;
        }
        ChoiceDialog<Program> programDialog = new ChoiceDialog<>(university.getProgram().get(0), university.getProgram());
        programDialog.setTitle("Programm auswählen");
        programDialog.setHeaderText("Wählen Sie ein Programm aus:");
        programDialog.setContentText("Programm:");

        Optional<Program> programResult = programDialog.showAndWait();
        if (programResult.isPresent()) {
            Program program = programResult.get();
            	ChoiceDialog<Course> requieredCourseDialog = new ChoiceDialog<>(program.getCourses().getElements().get(0), program.getCourses().getElements());
            	requieredCourseDialog.setTitle("Programm auswählen");
            	requieredCourseDialog.setHeaderText("Wählen Sie ein Programm aus:");
            	requieredCourseDialog.setContentText("Programm:");
            	
            	Optional<Course> requiredResult = requieredCourseDialog.showAndWait();
            	
            	if (requiredResult.isPresent()) {
                	TextInputDialog dialog = new TextInputDialog();
        	        dialog.setTitle("Kurs hinzufügen");
        	        dialog.setHeaderText("Geben Sie den Namen des Kurses ein:");
        	        dialog.setContentText("Kursname:");
        	
        	        Optional<String> result = dialog.showAndWait();
        	        result.ifPresent(name -> {
        	            Advanced course = factory.createAdvanced();
        	            course.setTitle(name);
        	            course.getPrereqs().add(requiredResult.get());
        	            program.getCourses().getElements().add(course);
        	            university.getCourse().add(course);
        	        });
            	}
            }

        }
    
    private void addIntroductoryCourse() {
    	if (university.getStudent().isEmpty() || university.getProgram().isEmpty()) {
    		System.out.println(university.getStudent().toString());
    		System.out.println(university.getProgram().toString());
            showAlert("Fehler", "Es müssen zuerst Studenten und Programme angelegt werden.");
            return;
        }
    	  ChoiceDialog<Program> programDialog = new ChoiceDialog<>(university.getProgram().get(0), university.getProgram());
          programDialog.setTitle("Programm auswählen");
          programDialog.setHeaderText("Wählen Sie ein Programm aus:");
          programDialog.setContentText("Programm:");

          Optional<Program> programResult = programDialog.showAndWait();
          if (programResult.isPresent()) {
              Program program = programResult.get();
              	TextInputDialog dialog = new TextInputDialog();
      	        dialog.setTitle("Einführungskurs hinzufügen");
      	        dialog.setHeaderText("Geben Sie den Namen des Kurses ein:");
      	        dialog.setContentText("Kursname:");
      	
      	        Optional<String> result = dialog.showAndWait();
      	        result.ifPresent(name -> {
      	            Course course = factory.createIntroductory();
      	            course.setTitle(name);
      	            program.getCourses().getElements().add(course);
      	            university.getCourse().add(course);
      	        });}
    }

    private void completeCourses() {
    	if (university.getStudent().isEmpty() || university.getProgram().isEmpty() || university.getCourse().isEmpty()) {
    		System.out.println(university.getStudent().toString());
    		System.out.println(university.getProgram().toString());
    		System.out.println(university.getCourse().toString());
            showAlert("Fehler", "Es müssen zuerst Studenten, Kurse und Programme angelegt werden.");
            return;
        }

        ChoiceDialog<Student> studentDialog = new ChoiceDialog<>(university.getStudent().get(0), university.getStudent());
        studentDialog.setTitle("Student auswählen");
        studentDialog.setHeaderText("Wählen Sie einen Studenten aus:");
        studentDialog.setContentText("Student:");

        Optional<Student> studentResult = studentDialog.showAndWait();
        if (studentResult.isPresent()) {
            Student student = studentResult.get();

            List<Course> completableCourses = new ArrayList<>();
            for (Course course : student.getProgram().getCourses().getElements()) {
                if (student.canComplete(course)) {
                    completableCourses.add(course);
                }
            }

            if (completableCourses.isEmpty()) {
                showAlert("Information", "Keine Kurse können derzeit abgeschlossen werden.");
                return;
            }

            ChoiceDialog<Course> courseDialog = new ChoiceDialog<>(completableCourses.get(0), completableCourses);
            courseDialog.setTitle("Kurs abschließen");
            courseDialog.setHeaderText("Wählen Sie einen abzuschließenden Kurs aus:");
            courseDialog.setContentText("Kurs:");

            Optional<Course> courseResult = courseDialog.showAndWait();
            if (courseResult.isPresent()) {
                ChoiceDialog<Grade> gradeDialog = new ChoiceDialog<>(Grade.A, Grade.VALUES);
                gradeDialog.setTitle("Kurs abschließen");
                gradeDialog.setHeaderText("Wählen Sie einen abzuschließenden Kurs aus:");
            	
                Optional<Grade> gradeResult = gradeDialog.showAndWait();
                if (gradeResult.isPresent()) {
                	Course course = courseResult.get();
                	Grade grade = gradeResult.get();
                	Result result = factory.createResult();
                	result.setKey(course);
                	result.setValue(grade);
                	student.getTranscript().add(result);
                	university.getResult().add(result);
                	if (student.getCompleted() == null) {
                		CourseSet cs = factory.createCourseSet();
                		cs.getElements().add(course);
                		student.setCompleted(cs);
                	} else {
                		student.getCompleted().getElements().add(course);
                	}
                	showAlert("Information", "Kurs erfolgreich abgeschlossen.");
                }
                
            }
        }
    }


    private void loadData() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Daten laden");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("XMI Files", "*.xmi")
        );
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            resourceSet = new ResourceSetImpl();
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());

            resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));

            try {
                resource.load(null);
                university = (ServiceFacade) resource.getContents().get(0);
                showAlert("Information", "Daten erfolgreich geladen.");
            } catch (IOException e) {
                e.printStackTrace();
                showAlert("Fehler", "Fehler beim Laden der Daten: " + e.getMessage());
            }
        }
    }

    private void saveData() {
    	

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Daten speichern");
        fileChooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("XMI Files", "*.xmi")
        );
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            resourceSet = new ResourceSetImpl();
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
            resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
            resource.getContents().clear();
            resource.getContents().add(university);

            try {
                resource.save(null);
                showAlert("Information", "Daten erfolgreich gespeichert.");
            } catch (IOException e) {
                e.printStackTrace();
                showAlert("Fehler", "Fehler beim Speichern der Daten: " + e.getMessage());
            }
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
