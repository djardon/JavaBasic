package com.ds.interfaces;

public class Bird extends Animal implements Pet {

    @Override
    public String speak() {
        return "pio pio";
    }

}