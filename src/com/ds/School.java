package com.ds;

import java.util.ArrayList;

public class School {
    //********* Properties *********/
    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Subject> subjects = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();


    //********* Constructor *********/
    public School(String name) {
        this.name = name;
    }


    //********* Public functions *********/
    //*********** SUBJECTS ************/
    public int subjectsCount() {
        // Function returns number of subjects
        return subjects.size();
    }

    public Subject subjectMoreStudents() {
        // Function returns subject with more students
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


    /** 6.- Devolver la 'subject' con más 'teachers'*/


    public ArrayList<Subject> subjectsNStudents(int minNumStudents) {
        // Function returns subjects with more than 'minNumStudents' students
        ArrayList<Subject> subjectsStudents = new ArrayList<>();

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // if this 'schoolSubject.studentsName' length is greater than 'minNumStudents'
            // add to 'subjectsStudents' list
            if(schoolSubject.studentsName.length > minNumStudents) {
                subjectsStudents.add(schoolSubject);
            }
        }

        return subjectsStudents;
    }


    /** 7.- Devolver las 'subjects' con más de 'minNumTeachers' teachers */


    private ArrayList<Subject> studentSubjects(Student student) {
        // Function returns subjects of the 'student'
        ArrayList<Subject> studentSubjects = new ArrayList<>();

        for (Subject subject : subjects) {
            if(isStudentNameInList(student.name, subject.studentsName)) {
                studentSubjects.add(subject);
                break;
            }
        }

        return studentSubjects;
    }

    /** 3.- Devolver todas las 'subjects' de un 'teacher' */


    //*********** STUDENTS ************/
    public int studentsCount() {
        // Function returns number of students
        return students.size();
    }

    public ArrayList<Student> studentsNSubjects(int minNumSubjects) {
        // Function returns students in more than 'minNumSubjects' subjects
        ArrayList<Student> studentsNSubjects = new ArrayList<>();

        // For over each 'student' in 'students' list
        for (Student student : students) {
            // Call to 'studentSubjects()' function with this 'student'
            // for get all student subjects and save get it in 'studentSubjects' list
            ArrayList<Subject> studentSubjects = studentSubjects(student);

            // If 'studentSubjects' list size it's greater than 'minNumSubjects'
            if(studentSubjects.size() > minNumSubjects) {
                // Add this 'student' into 'studentsNSubjects' list
                studentsNSubjects.add(student);
            }
        }

        return studentsNSubjects;
    }

    /** 2.- Devolver todos los 'students' de un 'teacher' */


    //*********** TEACHERS ************/
    /** 1.- Devolver el número de 'teachers' */

    /** 4.- Devolver todos los 'teachers' que están en más de 'minNumSubjects' subjects */

    /** 5.- Devolver todos los 'teachers' que tienen más de 'minNumStudents' students */


    //*********** Private functions ************/

    /** 0.- Cambiar el nombre a las dos funciones y el nombre de los parámetros,
     * para poder utilizarlas tanto con 'teacher' como con 'student'*/

    private boolean isStudentNameInList(String studentName, String[] studentsName) {
        // For over each 'name' in 'studentsName' list
        for (String name : studentsName) {
            if(compareStudentNameAndName(studentName, name)) {
                // If 'studentName' it's equal to this 'name'
                // stop execution and return true
               return true;
            }
        }

        // If execution finish then return false because 'studentName'
        // not exists in 'studentsName' list
        return false;
    }

    private boolean compareStudentNameAndName(String student, String name) {
        // Compare 'Strings', if are equals return 0 then return true
        return (student.compareToIgnoreCase(name) == 0);
    }
}