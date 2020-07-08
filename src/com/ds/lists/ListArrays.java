package com.ds.lists;

import java.util.ArrayList;

public class ListArrays {
    public void showListData() {
        // Create new instance empty list
        ArrayList<String> stringList = new ArrayList<>();
        // Add element to list
        stringList.add("David");
        stringList.add("Sara");
        stringList.add("Carlos");
        stringList.add("José");
        stringList.add("Manuel");

        System.out.println("ArrayList length: " + stringList.size());

        // Check if index is out of bounds
        int index = 0;
        if(index >= 0 && index < stringList.size()) {
            System.out.println("ArrayList get value at 0: " + stringList.get(index));
        }

        // Remove element at index
        stringList.remove(0);
        System.out.println("ArrayList strings remove 0 length: " + stringList.size());
        System.out.println("ArrayList string value at 0: " + stringList.get(0));

        // Clear all list data
        stringList.clear();
        System.out.println("ArrayList strings clear length: " + stringList.size());
    }
}
