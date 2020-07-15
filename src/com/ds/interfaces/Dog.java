package com.ds.interfaces;

public class Dog extends Animal implements Pet {
    public Dog(String name, Gender gender, String color) {
        this.name = name;
        this.gender = gender;
        this.color = color;

        setType(Type.MAMIFERO);
    }

    public Type getType() {
        return type;
    }

    /** PET interface */
    @Override
    public String speak() {
        return "woof";
    }
}