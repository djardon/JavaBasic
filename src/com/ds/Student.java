package com.ds;

public class Student {
    //********* Vars *********/
    // Default all vars accessibility are 'Public'
    String name;
    String email;
    int age;
    float weight;
    double height;

    //********* Constructor *********/
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //********* Public functions *********/
    public float imc() {
        // '(weight / heightSquare())' operation return a double value
        // with '(float)' cast double to float
        return (float) (weight / heightSquare());
    }

    public boolean isOver18() {
        // We could also return the result of the comparison negation '!(age < 18)'
        return age >= 18;
    }

    public boolean isValidEmail() {
        // Return 'true' when 'email' is not empty or blank
        return !email.isBlank();
    }

    //********* Private functions *********/
    private double heightSquare() {
        return height * height;
    }
}
