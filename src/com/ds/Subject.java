package com.ds;

public class Subject {
    String name;
    SubjectType type;
    int year;
    String[] studentsName;

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
        // Print all 'SubjectType' enum values
        for (SubjectType type : SubjectType.values()) {
            System.out.println("Subject type: " + type);
        }
    }

    public void setStudents(String[] names) {
        studentsName = names;
    }

    public void printAllStudentsName() {
        // Print all students name
        for (String name : studentsName) {
            System.out.println("Subject " + this.name + " student name: " + name);
        }
    }
}
