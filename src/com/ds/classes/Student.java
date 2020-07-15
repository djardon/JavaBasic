package com.ds.classes;

public class Student extends Person {
    //********* Properties *********/
    public String email;


    //********* Constructor *********/
    public Student() { }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }


    //********* Public functions *********/
    public boolean isValidEmail() {
        // Return 'true' when 'email' is not empty or blank
        return !email.isBlank();
    }
}
