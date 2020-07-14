package com.ds;

import com.ds.classes.Student;
import com.ds.classes.Subject;
import com.ds.classes.Teacher;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    //********* Constructor *********/
    public static void main(String[] args) {
        /*********** STUDENTS ************/
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

        /*********** SUBJECTS ************/
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
        studentsName[5] = "David";

        Option 2
        new String[]{"Alicia", "José", "Marc", "Roberto", "Luis", "David"}
        */

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alicia", "alicia@email.com"));
        students.add(new Student("José", "jose@email.com"));
        students.add(new Student("Marc", "marc@email.com"));
        students.add(new Student("Roberto", "roberto@email.com"));
        students.add(new Student("Luis", "luis@email.com"));
        students.add(new Student("David", "david@email.com"));
        subjectIOS.setStudents(students);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("David", 35, Teacher.Type.HEAD_TEACHER, Teacher.Gender.MALE));
        teachers.add(new Teacher("Sara", 37, Teacher.Type.HEAD_TEACHER, Teacher.Gender.FEMALE));
        teachers.add(new Teacher("Carlos", 33, Teacher.Type.CO_TEACHER, Teacher.Gender.MALE));
        subjectIOS.setTeachers(teachers);

        // Create a new 'Subject' class instance
        // with name "Android" and year "2020" values
        Subject subjectAndroid = new Subject("Android", 2020, Subject.SubjectType.ANDROID);
        // Set 'studentsName' property value for the 'subjectAndroid' object
        // new String[]{"Alicia", "Manuel", "Marc", "Javier", "Luis", "Marta"}
        subjectAndroid.students.add(new Student("Alicia", "alicia@email.com"));
        subjectAndroid.students.add(new Student("Manuel", "manuel@email.com"));
        subjectAndroid.students.add(new Student("Marc", "marc@email.com"));
        subjectAndroid.students.add(new Student("Javier", "javier@email.com"));
        subjectAndroid.students.add(new Student("Luis", "luis@email.com"));
        subjectAndroid.students.add(new Student("Marta", "marta@email.com"));

        subjectAndroid.teachers.add(new Teacher("David", 35, Teacher.Type.HEAD_TEACHER, Teacher.Gender.MALE));
        subjectAndroid.teachers.add(new Teacher("Carlos", 33, Teacher.Type.CO_TEACHER, Teacher.Gender.MALE));


        /*********** PRINTS ************/
        System.out.println("*********************** Student ***********************");
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

        /*********** CLASS & LISTS ************/
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
        // Print all unique students names from 'subject1' and 'subject2'
        // EXAMPLE_OUTPUT -> "Alicia", "José", "Manuel", "Marc", "Roberto", "Javier", "Luis", "David", "Marta"

        // 1.- Create new list for save unique students name
        ArrayList<String> uniqueStudentsName = new ArrayList<>();

        // 2.- For over 'subject1.students' list one by one
        for (Student student : subject1.students) {
            // 2.1.- Add each 'subject1' student 'name' into 'uniqueStudentsName' list
            uniqueStudentsName.add(student.name);
        }

        // 3.- For over 'subject2.studentsName' list one by one
        for (int index = 0; index < subject2.students.size(); index++) {
            // Get student name from 'subject2.studentsName' for position 'index'
            Student student = subject2.students.get(index);
            // 3.1.- Check if 'name' exists in 'uniqueStudentsName' list
            if(!uniqueStudentsName.contains(student.name)) {
                // 3.1.1.- If not exists, Add 'subject2' student 'name' into 'uniqueStudentsName' list
                uniqueStudentsName.add(student.name);
            }

            /* The previous code:
            if(!uniqueStudentsName.contains(name)) {
                // 3.1.1.- If not exists, Add 'subject2' student 'name' into 'uniqueStudentsName' list
                uniqueStudentsName.add(name);
            }

            Do the same that the follow code:
            boolean exists = false;
            for (String studentName: uniqueStudentsName) {
                if(name.equalsIgnoreCase(studentName)) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                uniqueStudentsName.add(name);
            }*/
        }

        // Sort 'uniqueStudentsName' list, order Ascending a..z
        Collections.sort(uniqueStudentsName);

        // 4.- Print each 'name' in 'uniqueStudentsName'
        for (String name : uniqueStudentsName) {
            System.out.println(name);
        }

        /* Print each name in 'uniqueStudentsName' reversed, order Descending z..a
        Option 1:
        Collections.reverse(uniqueStudentsName);

        Option 2:
        // For over all 'uniqueStudentsName',
        // start in last index 'uniqueStudentsName.size() - 1'
        for (int index = uniqueStudentsName.size() - 1; index >= 0; index--) {
            String name = uniqueStudentsName.get(index);
            System.out.println(name);
        }
        */
    }

    private static void printSubjectsOfStudents(String name, Subject subject1, Subject subject2) {
        // EXAMPLE_OUTPUT -> "Student 'David' subjects: 'iOS', 'Android'"

        // 1.- Create new list for save subjects of student
        ArrayList<String> subjects = new ArrayList<>();

        // 2.- For over each 'students' in 'subject1.students'
        for (Student student: subject1.students) {
            // 2.1.- Check if this 'student.name' is equals to parameter 'name'
            if(name.compareToIgnoreCase(student.name) == 0) {
                // 2.1.1.- If it's equals, add 'subject1.name' into 'subjects' list
                subjects.add(subject1.name);
                // 2.1.2.- For exit, because the student is in this subject
                break;
            }
        }

        // 3.- For over each 'students' in 'subject2.students'
        for (Student student: subject2.students) {
            // 3.1.- Check if this 'student.name' is equals to parameter 'name'
            if (name.compareToIgnoreCase(student.name) == 0) {
                // 3.1.1.- If it's equals, add 'subject2.name' into 'subjects' list
                subjects.add(subject2.name);
                // 3.1.2.- For exit, because the student is in this subject
                break;
            }
        }

        System.out.println();
        // Print parameter 'name'
        System.out.print("Student " + name + " subjects: ");

        // 4.- For over each subject in 'subjects' list
        for (String subject: subjects) {
            // 4.1.- Print each 'subject' name
            System.out.print(subject + " ");
        }
        System.out.println();
    }
}