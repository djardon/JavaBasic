package com.ds.interfaces;

public class Animal {
    public String name;
    public String color;
    public Gender gender;
    protected Type type;

    public enum Gender {
        MALE,
        FEMALE
    }

    public enum Type {
        MAMIFERO,
        OVIPARO
    }

    public void setType(Type type) {
        this.type = type;
    }
}