package com.ds;

public class Main {

    //********* Constructor *********/
    public static void main(String[] args) {
        // Create a new 'Student' class instance
        // with name "David" and email "david@email.com" values
        Student student = new Student("David", "david@email.com");
        // Set properties values for the 'student' object
        student.age = 35;
        student.weight = 75.5f;
        student.height = 1.77;

        // Get student 'name' from 'student' and print it (String)
        System.out.println("Name " + student.name);
        // Get student 'age' from 'student' and print it (int)
        System.out.println(student.age + " years");
        // Get student 'weight' from 'student' and print it (float)
        System.out.println(student.weight + " kg");
        // Get student 'height' from 'student' and print it (double)
        System.out.println(student.height + " m");
        // Call to 'imc' function from 'student' and
        // store returned value into 'userIMC' var
        float userIMC = student.imc();
        // Print 'userIMC' var (float)
        System.out.println("IMC " + userIMC);

        // Call to 'userAgeAndHeight' function with 'student' age and height values
        // and print returned value (String)
        System.out.println(userAgeAndHeight(student.age, student.height));
    }


    //********* Private functions *********/
    private static String userAgeAndHeight(int userAge, double userHeight) {
        // Return concatenated String with 'userAge' parameter value and 'userHeight' parameter value
        return "User age: " + userAge + " years, and height: " + userHeight + " m";
    }
}