package com.ds.classes;

public class Teacher {
    //********* Properties *********/
    public String name;
    public String email;
    public int age;
    public Gender gender;
    public float salary;
    /** 1.- La variable 'type' tiene que ser privada*/
    private Type type;

    //********* Enums *********/
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public enum Type {
        HEAD_TEACHER,
        CO_TEACHER
    }


    //********* Constructor *********/
    public Teacher(String name, int age, Type type, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        /** 4.- Utilizar la nueva función 'setType' para inicializar el valor 'type'*/
        setType(type);
    }

    //********* Getters & Setters *********/
    /**  2.- Crear el get para la variable 'type' */
    public Type getType() {
        return type;
    }

    /**  3.- Crear el set para la variable 'type' */
    public void setType(Type type) {
        this.type = type;
        /**  5.- Añadir en la función 'setType', la lógica para que cuando seteo
         * un nuevo valor del 'type' se actualice el 'salary' */
        updateSalaryByType(this.type);
    }


    //********* Private functions *********/
    private void updateSalaryByType(Type teacherType) {
        // Update 'salary' according 'teacherType' value
        salary = switch (teacherType) {
            case HEAD_TEACHER -> 60_000;
            case CO_TEACHER -> 45_000;
        };
    }
}
