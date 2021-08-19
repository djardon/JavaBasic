package com.ds;

import com.ds.classes.*;

import java.util.Random;

public class MainSchool {

    //********* Constructor *********/
    public static void main(String[] args) {
        // 1.- Crear nueva instancia de School
        School school = new School("Neoland");

        // 2.- Añadir al menos 10 alumnos a la escuela
        school.students.add(new Student("Alicia", "alicia@email.com"));
        school.students.add(new Student("José", "jose@email.com"));
        school.students.add(new Student("Marc", "marc@email.com"));
        school.students.add(new Student("Roberto", "roberto@email.com"));
        school.students.add(new Student("Luis", "luis@email.com"));
        school.students.add(new Student("David", "david@email.com"));
        school.students.add(new Student("Marta", "marta@email.com"));
        school.students.add(new Student("Sara", "sara@email.com"));
        school.students.add(new Student("Óliver", "oliver@email.com"));
        school.students.add(new Student("Ángel", "angel@email.com"));

        // 3.- Añadir al menos 6 profesores a la escuela
        school.teachers.add(new Teacher("David", 35, Teacher.Type.HEAD_TEACHER, Teacher.Gender.MALE));
        school.teachers.add(new Teacher("Sara", 37, Teacher.Type.HEAD_TEACHER, Teacher.Gender.FEMALE));
        school.teachers.add(new Teacher("Carlos", 33, Teacher.Type.CO_TEACHER, Teacher.Gender.MALE));
        school.teachers.add(new Teacher("Aurora", 28, Teacher.Type.CO_TEACHER, Teacher.Gender.FEMALE));
        school.teachers.add(new Teacher("Camino", 31, Teacher.Type.HEAD_TEACHER, Teacher.Gender.FEMALE));
        school.teachers.add(new Teacher("Sean", 36, Teacher.Type.CO_TEACHER, Teacher.Gender.MALE));

        // 4.- Añadir al menos 4 asignaturas a la escuela
        school.subjects.add(new Subject("iOS", 2020, Subject.SubjectType.iOS));
        school.subjects.add(new Subject("Android", 2020, Subject.SubjectType.ANDROID));
        school.subjects.add(new Subject("Fullstack", 2018, Subject.SubjectType.FULLSTACK));
        school.subjects.add(new Subject("Data Science", 2019, Subject.SubjectType.DATA_SCIENCE));

        // 5.- Añadir a cada asignatura profesores y estudiantes (de forma aleatoria opcional)
        /*Random randomNumber = new Random();
        int teacherPosition;
        int studentPosition;
        for (Subject subject : school.subjects) {
            // Add teachers
            teacherPosition = randomNumber.nextInt(school.teachers.size());
            subject.teachers.add(school.teachers.get(teacherPosition));
            teacherPosition = randomNumber.nextInt(school.teachers.size());
            subject.teachers.add(school.teachers.get(teacherPosition));

            // Add students
            studentPosition = randomNumber.nextInt(school.students.size());
            subject.students.add(school.students.get(studentPosition));
            studentPosition = randomNumber.nextInt(school.students.size());
            subject.students.add(school.students.get(studentPosition));
            studentPosition = randomNumber.nextInt(school.students.size());
            subject.students.add(school.students.get(studentPosition));
            studentPosition = randomNumber.nextInt(school.students.size());
            subject.students.add(school.students.get(studentPosition));
            studentPosition = randomNumber.nextInt(school.students.size());
            subject.students.add(school.students.get(studentPosition));
        }*/

        Random random = new Random();
        for (Student student : school.students) {
            for (Subject subject : school.subjects) {
                if (random.nextBoolean()) {
                    subject.students.add(student);
                }
            }
        }

        for (Teacher teacher : school.teachers) {
            for (Subject subject : school.subjects) {
                if (random.nextBoolean()) {
                    subject.teachers.add(teacher);
                }
            }
        }


        /*********** PRINTS ************/
        System.out.println("*********************** School ***********************");

        System.out.println("Subjects");
        // 1.- Todas las asignaturas
        for (Subject subject : school.subjects) {
            System.out.println(subject.name);
        }

        System.out.println();
        // 2.- Asignatura con más estudiantes
        System.out.println("Subject with more students: " + school.subjectMoreStudents().name);

        System.out.println();
        // 3.- Asignatura con más profesores
        System.out.println("Subject with more teachers: " + school.subjectMoreTeachers().name);

        System.out.println();
        // 4.- Estudiantes con más de 2 asignaturas
        System.out.println("Students more 2 subjects:");
        for (Student student : school.studentsNSubjects(2)) {
            System.out.println(student.name);
        }

        System.out.println();
        // 5.- Profesores con más de 2 asignaturas
        System.out.println("Teachers more 2 subjects:");
        for (Teacher teacher : school.teachersNSubjects(2)) {
            System.out.println(teacher.name);
        }

        System.out.println();
        // 6.- Asignaturas con más de 4 estudiantes
        System.out.println("Subjects more 4 students:");
        for (Subject subject : school.subjectsNStudents(4)) {
            System.out.println(subject.name);
        }

        System.out.println();
        // 7.- Asignaturas con más de 2 profesores
        System.out.println("Subjects more 2 teachers:");
        for (Subject subject : school.subjectsNTeachers(2)) {
            System.out.println(subject.name);
        }

        System.out.println();
        // 8.- Por cada estudiante pintar sus asignaturas
        for (Student student : school.students) {
            System.out.println();
            System.out.println("Student " + student.name + " subjects:");
            for (Subject subject : school.subjectsOfStudent(student)) {
                System.out.println(subject.name);
            }
        }

        System.out.println();
        // 9.- Por cada profesor pintar sus asignaturas
        for (Teacher teacher : school.teachers) {
            System.out.println();
            System.out.println("Teacher " + teacher.name + " subjects:");
            for (Subject subject : school.subjectsOfTeacher(teacher)) {
                System.out.println(subject.name);
            }
        }

        System.out.println();
        // 10.- Por cada profesor pintar sus estudiantes
        for (Teacher teacher : school.teachers) {
            System.out.println();
            System.out.println("Teacher " + teacher.name + " students:");
            for (Student student : school.studentsOfTeacher(teacher)) {
                System.out.println(student.name);
            }
        }

        System.out.println();
        // 11.- Por cada profesor pintar el tipo de profesor con una breve descripción
        for (Teacher teacher : school.teachers) {
            /*
            if(teacher.getType() == Teacher.Type.HEAD_TEACHER) {
                System.out.println("Head teacher");
                System.out.println("Profesor principal");
            } else if(teacher.getType() == Teacher.Type.CO_TEACHER) {
                System.out.println("Co teacher");
                System.out.println("Profesor secundario");
            }
            */

            switch (teacher.getType()) {
                case HEAD_TEACHER -> {
                    System.out.println("Head teacher");
                    System.out.println("Profesor principal");
                }

                case CO_TEACHER -> {
                    System.out.println("Co teacher");
                    System.out.println("Profesor secundario");
                }
            }
        }

        // 12.- Por cada profesor pintar el género
        for (Teacher teacher : school.teachers) {
            printGender(teacher.gender);
        }

        // 13.- Por cada estudiante pintar el género
        for (Student student : school.students) {
            printGender(student.gender);
        }
    }

    private static void printGender(Person.Gender gender) {
        switch (gender) {
            case MALE -> System.out.println("Masculino");
            case FEMALE -> System.out.println("Femenino");
            case OTHER -> System.out.println("Otro");
        }
    }
}
