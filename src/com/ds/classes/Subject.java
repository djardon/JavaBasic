package com.ds;

import java.util.ArrayList;

public class Subject {
    //********* Properties *********/
    String name;
    SubjectType type;
    int year;

    /** 1.- Change to ArrayList<Student>  */
    ArrayList<Student> students = new ArrayList<Student>();
    /** 2.- Change to ArrayList<Teacher>  */
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();

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

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String[] teachersNames() {
        String[] names = new String[teachers.size()];

        for (int index = 0; index < teachers.size(); index++) {
            names[index] = teachers.get(index).name;
        }

        return names;
    }

    public String[] studentsNames() {
        String[] names = new String[students.size()];

        for (int index = 0; index < students.size(); index++) {
            names[index] = students.get(index).name;
        }

        return names;
    }


    public void printAllStudentsName() {
        for (Student student : students) {
            // Print each student 'name' in 'students' list
            // Word 'this' it's the current instance of a class 'Subject'
            System.out.println("Subject " + this.name + " student name: " + student.name);
        }
    }

    public void printAllTeachersName() {
        for (Teacher teacher : teachers) {
            // Print each teacher 'name' in 'teachers' list
            // Word 'this' it's the current instance of a class 'Subject'
            System.out.println("Subject " + this.name + " teacher name: " + teacher.name);
        }
    }
}