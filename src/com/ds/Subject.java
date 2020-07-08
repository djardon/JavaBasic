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
    public void printSubjectType() {
        switch (type) {
            case iOS -> System.out.println("Subject type: " + type);
            case ANDROID -> System.out.println("Subject type: " + type);
            default -> System.out.println("Subject type: " + type);
        }
    }
}
