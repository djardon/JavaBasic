package com.ds;

import com.ds.lists.ListArrays;
import com.ds.lists.Lists;
import com.ds.loops.ForLoop;
import com.ds.loops.WhileLoop;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    //********* Constructor *********/
    public static void main(String[] args) {
        // Create a new 'Student' class instance
        // with name "David" and email "david@email.com" values
        Student student = new Student("David", "david@email.com");
        // Set properties values for the 'student' object
        student.age = 35;
        // Set 'weight' property values for the 'student' object
        student.weight = 75.5f;
        // Set 'height' property values for the 'student' object
        student.height = 1.77;

        // Create a new 'Student' class instance
        // with name "Carlos" and email "carlos@email.com" values
        Student student2 = new Student("Carlos", "carlos@email.com");
        // Set 'age' property values for the 'student2' object
        student2.age = 33;
        // Set 'weight' property values for the 'student2' object
        student2.weight = 95.5f;
        // Set 'height' property values for the 'student2' object
        student2.height = 2.77;


        // Create a new 'Subject' class instance
        // with name "iOS" and year "2020" values
        Subject subjectIOS = new Subject("iOS", 2020, Subject.SubjectType.iOS);
        // Set 'studentsName' property value for the 'subjectIOS' object
        /* Option 1
        String[] studentsName = new String[6];
        studentsName[0] = "Alicia";
        studentsName[1] = "José";
        studentsName[2] = "Marc";
        studentsName[3] = "Roberto";
        studentsName[4] = "Luis";
        studentsName[5] = "David";*/
        subjectIOS.setStudents(new String[]{"Alicia", "José", "Marc", "Roberto", "Luis", "David"});

        // Create a new 'Subject' class instance
        // with name "Android" and year "2020" values
        Subject subjectAndroid = new Subject("Android", 2020, Subject.SubjectType.ANDROID);
        // Set 'studentsName' property value for the 'subjectAndroid' object
        subjectAndroid.setStudents(new String[]{"Alicia", "Manuel", "Marc", "Javier", "Luis", "Marta"});


        System.out.println("*********************** Student ***********************");
        // Get student 'school' name and print it (String)
        // System.out.println("School " + Student.school);
        Student.printSchool();
        // Call function 'printStudentData' with parameter value 'student'
        printStudentData(student);
        // Call function 'printStudentData' with parameter value 'student2'
        printStudentData(student2);
        // Call function 'printStudentData' with parameter value 'null'
        printStudentData(null);

        System.out.println("*********************** Subject ***********************");
        // Call to 'printSubjectType' from 'subject' print (String)
        Subject.printAllSubjectTypes();
        // Call function 'printSubjectData' with parameter value 'subjectIOS'
        printSubjectData(subjectIOS);
        // Call function 'printSubjectData' with parameter value 'subjectAndroid'
        printSubjectData(subjectAndroid);
        // Call function 'printSubjectData' with parameter value 'null'
        printSubjectData(null);

        System.out.println("*********************** LOOPS ***********************");
        // ForLoop loop = new ForLoop();
        // loop.doLoop();
        (new ForLoop()).doLoop();
        (new WhileLoop()).doLoop();

        System.out.println("*********************** LISTS ***********************");
        (new Lists()).showListData();

        System.out.println("*********************** ARRAY LISTS ***********************");
        (new ListArrays()).showListData();

        System.out.println("*********************** SUBJECTS STUDENTS ***********************");
        printUniqueSubjectsStudents(subjectIOS, subjectAndroid);
        printSubjectsOfStudents("David", subjectIOS, subjectAndroid);
    }


    //********* Private functions *********/
    private static String userAgeAndHeight(int userAge, double userHeight) {
        // Return concatenated String with 'userAge' parameter value and 'userHeight' parameter value
        return "User age: " + userAge + " years, and height: " + userHeight + " m";
    }

    private static void printStudentData(Student student) {
        // Check if 'student' is null
        if(student != null) {
            // If 'student' isn't null
            // Get student 'name' from 'student' and print it (String)
            System.out.println("Name " + student.name);
            // Get student 'age' from 'student' and print it (int)
            System.out.println(student.age + " years");
            // Get student 'weight' from 'student' and print it (float)
            System.out.println(student.weight + " kg");
            // Get student 'height' from 'student' and print it (double)
            System.out.println(student.height + " m");
            // Call to 'imc' function from 'student' and
            // store returned value into 'studentIMC' var
            float studentIMC = student.imc();
            // Print 'userIMC' var (float)
            System.out.println("IMC " + studentIMC);
            // Get 'imcDescription' from 'student' and print returned value (String)
            System.out.println("IMC description " + student.imcDescription());

            // Call to 'userAgeAndHeight' function with 'student' age and height values
            // and print returned value (String)
            System.out.println(userAgeAndHeight(student.age, student.height));
        } else {
            // If 'student' is null print message
            System.out.println("Student is null");
        }
    }

    private static void printSubjectData(Subject subject) {
        // Check if 'subject' is null
        if(subject != null) {
            // If 'subject' isn't null
            // Get subject 'name' from 'subject' and print it (String)
            System.out.println("Subject name: " + subject.name);
            // Get subject 'year' from 'subject' and print it (int)
            System.out.println("Year: " + subject.year);
            // Call to 'printAllStudentsName' from 'subject' and print it (String[])
            System.out.println("Subject Students");
            subject.printAllStudentsName();
        } else {
            // If 'subject' is null print message
            System.out.println("Subject is null");
        }
    }

    private static void printUniqueSubjectsStudents(Subject subject1, Subject subject2) {
        // Imprimir el nombre de todos los Alumnos de las asignaturas subject1 y subject2 sin repeticiones
        // Salida -> "Alicia", "José", "Manuel", "Marc", "Roberto", "Javier", "Luis", "David", "Marta"

        // 1.- Crear nuevo listado de nombre de alumnos
        ArrayList<String> studentsName = new ArrayList<>();

        // 2.- Recorrer listado nombres alumnos de subject1
        for (String name : subject1.studentsName) {
            // 2.1.- Añadir cada nombre al nuevo listado
            studentsName.add(name);
        }

        // 3.- Recorrer listado nombres alumnos de subject2
        for (int index = 0; index < subject2.studentsName.length; index++) {
            String name = subject2.studentsName[index];
            // 3.1.- Comprobar si el nombre ya existe en el nuevo listado 'studentsName'
            if(!studentsName.contains(name)) {
                // 3.1.1.- Si no existe, añadir el nombre al nuevo listado 'studentsName
                studentsName.add(name);
            }

            /*boolean exists = false;
            for (String studentName: studentsName) {
                if(name.equalsIgnoreCase(studentName)) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                studentsName.add(name);
            }*/
        }

        // Sort 'studentsName' list order Ascending a..z
        Collections.sort(studentsName);

        // 4.- Escribir todos los nombres del nuevo listado de nombres de alumnos 'studentsName'
        for (String name : studentsName) {
            System.out.println(name);
        }

        /* Print list 'studentsName' reversed
        Option 1: Collections.reverse(studentsName);

        Option 2:
        for (int index = studentsName.size() - 1; index >= 0; index--) {
            String name = studentsName.get(index);
            System.out.println(name);
        }
        */
    }

    private static void printSubjectsOfStudents(String name, Subject subject1, Subject subject2) {
        // Example INPUT -> name = "David"
        // OUTPUT -> "Student David subjects: iOS, Android"

        // 1.- Crear un listado donde guardar nombres de asignatura del estudiante
        ArrayList<String> subjects = new ArrayList<>();

        // 2.- Recorrer el listado de nombres de estudiantes 'studentsName' de 'subject1'
        for (String studentName: subject1.studentsName) {
            // 2.1.- Comprobar si existe el nombre del estudiante 'name'
            if(name.compareToIgnoreCase(studentName) == 0) {
                // 2.1.1.- Si existe, almacenas el nombre de la asignatura en el listado de asignaturas
                subjects.add(subject1.name);
                // 2.1.2.- Paramos de recorrer el listado
                break;
            }
        }

        // 3.- Recorrer el listado de nombres de estudiantes 'studentsName' de 'subject2'
        for (String studentName: subject2.studentsName) {
            // 3.1.- Comprobar si existe el nombre del estudiante 'name'
            if (name.compareToIgnoreCase(studentName) == 0) {
                // 3.1.1.- Si existe, almacenas el nombre de la asignatura en el listado de asignaturas
                subjects.add(subject2.name);
                // 3.1.2.- Paramos de recorrer el listado
                break;
            }
        }

        // 4.- Recorrer el listado de asignaturas
        System.out.println();
        System.out.print("Student " + name + " subjects: ");
        for (String subject: subjects) {
            // 4.1.- Escribir cada nombre de asignatura
            System.out.print(subject + " ");
        }
        System.out.println();
    }
}