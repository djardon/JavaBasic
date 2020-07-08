package com.ds.lists;

public class Lists {

    public void showListData() {
        System.out.println("LIST STRINGS");
        // Create list with 10 empty values
        String[] stringList = new String[10];
        // Add elemten to list
        stringList[0] = "David";
        stringList[1] = "Luis";
        stringList[2] = "Marc";
        stringList[3] = "Alicia";
        stringList[4] = "Roberto";
        stringList[5] = "Carlos";
        stringList[6] = "Sara";
        stringList[7] = "Óliver";
        stringList[8] = "Ángel";
        stringList[9] = "José";
        System.out.println("List strings length: " + stringList.length);
        System.out.println("List string value at 0: " + stringList[0]);

        // Print all names
        //for (String name : stringList) {
        //    System.out.println("Name: " + name);
        //}

        // Print all names exclude position 7
        /*for (int i = 0; i < stringList.length; i++) {
            if(i == 7) {
                continue;
            }
            System.out.println("Name: " + stringList[i]);
        }*/

        // Print all names contains 'a' or 'A' or 'á' or 'Á'
        /*for (String name : stringList) {
            if(name.contains("a") || name.contains("A") || name.contains("á") || name.contains("Á")) {
                System.out.println("Name: " + name);
            }
        }*/

        // Print all names contains 'l'
        /*for (String name : stringList) {
            if(name.contains("l")) {
                System.out.println("Name: " + name);
            }
        }*/

        // Print all names with length >= 5
        /*for (String name : stringList) {
            if(name.length() >= 5) {
                System.out.println("Name: " + name);
            }
        }*/

        System.out.println("LIST NUMBERS");
        // Create int list with initials values
        int[] numbers = {7, 12, 14, 19, 20, 11, 33, 55, 10, 1};
        System.out.println("List numbers length: " + numbers.length);
        System.out.println("List numbers value at 0: " + numbers[0]);

        // Print all numbers multiples of 2
        /*for (int number : numbers) {
            if(number % 2 == 0) {
                System.out.println("Number: " + number);
            }
        }*/
    }
}
