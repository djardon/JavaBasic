package com.ds.classes;

import java.util.ArrayList;

public class School {
    //********* Properties *********/
    public String name;
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Subject> subjects = new ArrayList<>();
    public ArrayList<Teacher> teachers = new ArrayList<>();


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
            if(subject == null || subject.students.size() < schoolSubject.students.size()) {
                subject = schoolSubject;
            }
        }

        return subject;
    }

    /** 6.- Devolver la 'subject' con más 'teachers'*/
    public Subject subjectMoreTeachers() {
        Subject subject = null;

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // If subject is null this 'schoolSubject' is subject with more teachers
            // or if subject isn't null, if subject 'teachersName' length is less than
            // this 'schoolSubject.teachersName' length, this 'schoolSubject' is subject with more teachers
            if(subject == null || subject.teachers.size() < schoolSubject.teachers.size()) {
                subject = schoolSubject;
            }
        }

        return subject;
    }

    public ArrayList<Subject> subjectsNStudents(int minNumStudents) {
        // Function returns subjects with more than 'minNumStudents' students
        ArrayList<Subject> subjectsStudents = new ArrayList<>();

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // if this 'schoolSubject.studentsName' length is greater than 'minNumStudents'
            // add to 'subjectsStudents' list
            if(schoolSubject.students.size() > minNumStudents) {
                subjectsStudents.add(schoolSubject);
            }
        }

        return subjectsStudents;
    }

    /** 7.- Devolver las 'subjects' con más de 'minNumTeachers' teachers */
    public ArrayList<Subject> subjectsNTeachers(int minNumTeachers) {
        // Function returns subjects with more than 'minNumTeachers' teachers
        ArrayList<Subject> subjectsTeachers = new ArrayList<>();

        // Loop over all subjects
        for (Subject schoolSubject : subjects) {
            // if this 'schoolSubject.teachersName' length is greater than 'minNumTeachers'
            // add to 'subjectsTeachers' list
            if(schoolSubject.teachers.size() > minNumTeachers) {
                subjectsTeachers.add(schoolSubject);
            }
        }

        return subjectsTeachers;
    }

    private ArrayList<Subject> studentSubjects(Student student) {
        // Function returns subjects of the 'student'
        ArrayList<Subject> studentSubjects = new ArrayList<>();

        for (Subject subject : subjects) {
            if(isNameInList(student.name, subject.studentsNames())) {
                studentSubjects.add(subject);
                break;
            }
        }

        return studentSubjects;
    }

    /** 3.- Devolver todas las 'subjects' de un 'teacher' */
    public ArrayList<Subject> subjectsOfTeacher(Teacher teacher) {
        ArrayList<Subject> teachersSubjects = new ArrayList<>();

        for (Subject subject : subjects) {
            if(isNameInList(teacher.name, subject.teachersNames())) {
                teachersSubjects.add(subject);
            }
        }

        return teachersSubjects;
    }


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
    public ArrayList<Student> studentsOfTeacher(Teacher teacher) {
        ArrayList<Student> teacherStudents = new ArrayList<>();

        for (Subject subject : subjects) {
            if(isNameInList(teacher.name, subject.teachersNames())) {
                /* for (String studentName : subject.studentsName) {
                    teacherStudents.add(studentName);
                } */
                // 'Arrays.asList' cast 'String[]' -> 'ArrayList<String>'
                // Arrays.asList(subject.studentsName)
                teacherStudents.addAll(subject.students);
            }
        }

        return teacherStudents;
    }


    //*********** TEACHERS ************/
    /** 1.- Devolver el número de 'teachers' */
    public int teachersCount() {
        return teachers.size();
    }

    /** 4.- Devolver todos los 'teachers' que están en más de 'minNumSubjects' subjects */
    public ArrayList<Teacher> teachersNSubjects(int minNumSubjects) {
        ArrayList<Teacher> teachersWithSubjects = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if(subjectsOfTeacher(teacher).size() > minNumSubjects) {
                teachersWithSubjects.add(teacher);
            }
        }

        return teachersWithSubjects;
    }

    /** 5.- Devolver todos los 'teachers' que tienen más de 'minNumStudents' students */
    public ArrayList<Teacher> teachersNStudents(int minNumStudents) {
        ArrayList<Teacher> teachersWithStudents = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if(studentsOfTeacher(teacher).size() > minNumStudents) {
                teachersWithStudents.add(teacher);
            }
        }

        return teachersWithStudents;
    }


    //*********** Private functions ************/

    /** 0.- Cambiar el nombre a las dos funciones y el nombre de los parámetros,
     * para poder utilizarlas tanto con 'student', 'teacher' como con 'subject'*/
    private boolean isNameInList(String nameToCompare, String[] names) {
        // For over each 'name' in 'names' list
        for (String name : names) {
            if(compareNames(nameToCompare, name)) {
                // If 'nameToCompare' it's equal to this 'name'
                // stop execution and return true
               return true;
            }
        }

        // If execution finish then return false because 'nameToCompare'
        // not exists in 'names' list
        return false;
    }

    private boolean compareNames(String name1, String name2) {
        // Compare 'Strings', if are equals return 0 then return true
        return (name1.compareToIgnoreCase(name2) == 0);
    }
}