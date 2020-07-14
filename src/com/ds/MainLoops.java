package com.ds;

import com.ds.lists.ListArrays;
import com.ds.lists.Lists;
import com.ds.loops.ForLoop;
import com.ds.loops.WhileLoop;

public class MainLoops {
    //********* Constructor *********/
    public static void main(String[] args) {
        /*********** LOOPS ************/
        System.out.println("*********************** LOOPS ***********************");
        ForLoop loop = new ForLoop();
        loop.doLoop();
        (new ForLoop()).doLoop();
        (new WhileLoop()).doLoop();

        /*********** LISTS ************/
        System.out.println("*********************** LISTS ***********************");
        (new Lists()).showListData();

        System.out.println("*********************** ARRAY LISTS ***********************");
        (new ListArrays()).showListData();
    }
}
