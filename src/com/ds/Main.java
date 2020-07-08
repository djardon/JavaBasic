package com.ds;

import com.ds.lists.ListArrays;
import com.ds.lists.Lists;
import com.ds.loops.ForLoop;
import com.ds.loops.WhileLoop;

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
        // Set 'studentName' property value for the 'subjectIOS' object
        subjectIOS.studentName = student.name;

        // Create a new 'Subject' class instance
        // with name "Android" and year "2020" values
        Subject subjectAndroid = new Subject("Android", 2020, Subject.SubjectType.ANDROID);
        // Set 'studentName' property value for the 'subjectAndroid' object
        subjectAndroid.studentName = student2.name;


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
    }


    //********* Private functions *********/
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
            // Get subject 'studentName' from 'subject' and print it (String)
            System.out.println("Student: " + subject.studentName);
        } else {
            // If 'subject' is null print message
            System.out.println("Subject is null");
        }
    }

    private static String userAgeAndHeight(int userAge, double userHeight) {
        // Return concatenated String with 'userAge' parameter value and 'userHeight' parameter value
        return "User age: " + userAge + " years, and height: " + userHeight + " m";
    }
}