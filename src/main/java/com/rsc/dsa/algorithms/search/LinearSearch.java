package com.rsc.dsa.algorithms.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] list = new int[10];
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i < list.length; i++) {
            list[i] = (int) Math.floor(Math.random() * 100);
        }

        System.out.print("[ ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("]");

        System.out.println("Number?");
        int searched = reader.nextInt();

        //Linear search
        boolean found = false;
        for(int i = 0; i < list.length; i++) {
            if(list[i] == searched) {
                found = true;
                System.out.println("Found at position " + (i+1) + "!");
                break;
            }
        }

        if(found == false) {
            System.out.println("Not found!");
        }

    }

}
