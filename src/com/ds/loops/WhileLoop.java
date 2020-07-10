package com.ds.loops;

public class WhileLoop {

    public void doLoop() {
        System.out.println("LOOPS WHILE");

        System.out.println("Print all ages between 0 and 18");
        // Print all ages between 0 and 18
        int age = 0;
        while (age < 18) {
            System.out.println(age);
            age++;
        }

        System.out.println("Print all pair numbers between 2 and 100");
        // Print all pair numbers between 2 and 100
        int pair = 2;
        while (pair < 100) {
            System.out.println(pair);
            pair = pair + 2;
        }

        System.out.println("Print all numbers between 0 and 77");
        // Print all numbers between 0 and 77
        int number = 0;
        do {
            System.out.println(number);
            number++;
        } while (number < 77);
    }
}