package com.ds;

import java.util.ArrayList;

public class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    /** Function returns number of students **/
    public int studentsCount() {
        return students.size();
    }

    /** Function returns number of subjects **/
    public int subjectsCount() {
        return subjects.size();
    }

    /** Function returns subject with more students **/
    public Subject subjectMoreStudents() {
        Subject subject = null;

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // If subject is null this 'schoolSubject' is subject with more student
            // or if subject isn't null, if subject 'studentsName' length is less than
            // this 'schoolSubject.studentsName' length, this 'schoolSubject' is subject with more students
            if(subject == null || subject.studentsName.length < schoolSubject.studentsName.length) {
                subject = schoolSubject;
            }
        }

        return subject;
    }

    // Function returns subjects with more than N students
    public ArrayList<Subject> subjectsNStudents(int numStudents) {
        ArrayList<Subject> subjectsStudents = new ArrayList<>();

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // if this 'schoolSubject.studentsName' length is greater than 'numStudents'
            // add to 'subjectsStudents' list
            if(schoolSubject.studentsName.length > numStudents) {
                subjectsStudents.add(schoolSubject);
            }
        }

        return subjectsStudents;
    }

    // Function returns students in more than 1 subject
    public ArrayList<Student> studentsNSubjects(int numSubjects) {
        ArrayList<Student> studentsNSubjects = new ArrayList<>();

        for (Student student : students) {
            // Obtenemos el listado de asignaturas en las que está el 'student'
            // y lo guardamos en la variable 'studentSubjects'
            ArrayList<Subject> studentSubjects = studentSubjects(student);

            if(studentSubjects.size() > numSubjects) {
                studentsNSubjects.add(student);
            }
        }

        return studentsNSubjects;
    }

    // Devuelve el listado de asignaturas en las que está el estudiante 'student'
    private ArrayList<Subject> studentSubjects(Student student) {
        ArrayList<Subject> studentSubjects = new ArrayList<>();

        for (Subject subject : subjects) {
            if(isStudentNameInList(student.name, subject.studentsName)) {
                studentSubjects.add(subject);
                break;
            }
        }

        return studentSubjects;
    }

    private boolean isStudentNameInList(String studentName, String[] studentsName) {
        for (String name : studentsName) {
            if(compareStudentNameAndName(studentName, name)) {
               return true;
            }
        }

        return false;
    }

    private boolean compareStudentNameAndName(String student, String name) {
        return (student.compareToIgnoreCase(name) == 0);
    }
}