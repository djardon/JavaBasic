package com.ds;

public class Subject {
    //********* Properties *********/
    String name;
    SubjectType type;
    int year;
    String[] studentsName;
    String[] teachersName;

    //********* Enums *********/
    public enum SubjectType {
        iOS,
        ANDROID,
        FULLSTACK,
        DATA_SCIENCE
    }


    //********* Constructor *********/
    public Subject(String name, int year, SubjectType type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }


    //********* Public functions *********/
    public static void printAllSubjectTypes() {
        // 'SubjectType.values()' return all possibles values of the Enum
        for (SubjectType type : SubjectType.values()) {
            // Print each subject type 'type' in 'SubjectType.values()' list
            System.out.println("Subject type: " + type);
        }
    }

    public void setStudents(String[] names) {
        studentsName = names;
    }

    public void printAllStudentsName() {
        for (String name : studentsName) {
            // Print each student 'name' in 'studentsName' list
            // Word 'this' it's the current instance of a class 'Subject'
            System.out.println("Subject " + this.name + " student name: " + name);
        }
    }
}