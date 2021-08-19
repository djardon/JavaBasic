package com.ds.extras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class MainExtras {

    public static void main(String[] args) {
        /******* DATE *********/
        printDayNow();

        LocalDateTime dateTime = LocalDateTime.now();
        formatDate(dateTime);

        String dateString = "2020-07-16T09:36:57";
        parseDate(dateString);


        System.out.println();
        /******* HashMap *********/
        // HashMap<KEY, VALUE>
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("SPAIN", "MADRID");
        capitalCities.put("ENGLAND", "LONDON");
        capitalCities.put("GERMANY", "BERLIN");

        capitalCities.replace("SPAIN", "PRIEGO");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("SPAIN"));

        capitalCities.remove("SPAIN");
        System.out.println(capitalCities.containsValue("MADRID"));

        System.out.println();
        /******* HashSet *********/
        // Unique values
        HashSet<String> names = new HashSet<>();
        names.add("David");
        names.add("José");
        names.add("Marc");
        names.add("Luis");
        names.add("Roberto");
        names.add("Alicia");
        names.add("David");

        System.out.println(names);
        System.out.println(names.contains("Alicia"));

        for (String item : names) {
            System.out.println(item);
        }

        System.out.println();
        /******* LAMBDA *********/
        lambdaFunction();
    }

    private static void printDayNow() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        // LocalDate.of(2019, Month.JULY, 16);
        date = LocalDate.of(2019, 07, 16);
        System.out.println(date);
    }

    private static void formatDate(LocalDateTime dateTime) {
        try {
            System.out.println(dateTime);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Day' EEEE 'Month' MMMM 'Year' yyyy");
            System.out.println(formatter.format(dateTime));
            formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println(formatter.format(dateTime));
        } catch (Exception e) {
            System.out.println("Error format date");
        }
    }

    private static void parseDate(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
            System.out.println(formatter.parse(dateString));
        } catch (Exception e) {
            System.out.println("Error parsing date");
        }
    }






    private static void lambdaFunction() {
        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Roberto");
        names.add("Alicia");
        names.add("Luis");
        names.add("Jose");
        names.add("Marc");
        names.add("Carlos");

        names.forEach( (name) -> { System.out.println(name); });

        /*
        for (String name : names) {
            System.out.println(name);
        }
        */
    }
}
