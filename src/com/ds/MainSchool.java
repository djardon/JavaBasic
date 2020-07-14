package com.ds;

import com.ds.classes.School;
import com.ds.classes.Student;
import com.ds.classes.Subject;
import com.ds.classes.Teacher;

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
    }
}
