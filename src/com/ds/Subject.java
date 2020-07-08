package com.ds;

public class Subject {
    String name;
    SubjectType type;
    int year;
    String studentName;

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
}
