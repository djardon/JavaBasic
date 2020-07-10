package com.ds;

public class Teacher {
    //********* Properties *********/
    String name;
    String email;
    int age;
    Gender gender;
    float salary;
    /** 1.- La variable 'type' tiene que ser privada*/
    Type type;

    //********* Enums *********/
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    enum Type {
        HEAD_TEACHER,
        CO_TEACHER
    }


    //********* Constructor *********/
    public Teacher(String name, int age, Type type, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        /** 4.- Utilizar la nueva función 'setType' para inicializar el valor 'type'*/
        this.type = type;
        updateSalaryByType(this.type);
    }

    //********* Getters & Setters *********/
    /**  2.- Crear el get para la variable 'type' */

    /**  3.- Crear el set para la variable 'type' */
    /**  5.- Añadir en la función 'setType', la lógica para que cuando seteo
     * un nuevo valor del 'type' se actualice el 'salary' */


    //********* Private functions *********/
    private void updateSalaryByType(Type teacherType) {
        // Update 'salary' according 'teacherType' value
        salary = switch (teacherType) {
            case HEAD_TEACHER -> 60_000;
            case CO_TEACHER -> 45_000;
        };
    }
}
