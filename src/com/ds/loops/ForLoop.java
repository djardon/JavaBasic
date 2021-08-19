package com.ds.loops;

import com.ds.classes.Subject;

public class ForLoop {

    public void doLoop() {
        System.out.println("LOOPS FOR");
        System.out.println("Print all ages between 0 and 18");
        for (int age = 0; age < 18; age++) {
            System.out.println(age);
        }

        System.out.println("Print all pair numbers between 2 and 100");
        for (int pair = 2; pair < 100; pair = pair + 2) {
            System.out.println(pair);
        }

        System.out.println("Print all pair numbers between 2 and 20");
        for (int pair = 2; pair < 100; pair = pair + 2) {
            if(pair == 20) {
                System.out.println("Stop 'for' at " + pair);
                // Exit loop
                break;
            }
            System.out.println(pair);
        }

        System.out.println("Print all pair numbers between 2 and 100 exclude 20");
        for (int pair = 2; pair < 100; pair = pair + 2) {
            if(pair == 20) {
                // Jump to next iteration
                continue;
            }
            System.out.println(pair);
        }

        System.out.println("Print all SubjectTypes");
        for (Subject.SubjectType type : Subject.SubjectType.values()) {
            switch (type) {
                case iOS -> System.out.println(" iOS type");
                case ANDROID -> System.out.println(" Android type");
                default -> System.out.println(" Otras cosas inútiles");
            }
        }
    }
}