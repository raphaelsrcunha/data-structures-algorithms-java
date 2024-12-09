package com.rsc.dsa.algorithms.search;

import java.util.Scanner;

public class BinarySearch {

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

        //Ordering list
        int temp;
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = i+1; j < list.length; j++) {
                if(list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        System.out.println("Ordered List");
        System.out.print("[ ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("]");

        System.out.println("Number?");
        int searched = reader.nextInt();

        //Binary search
        boolean found = false;

        int beginning = 0;
        int end = list.length - 1;
        int middle;

        while(beginning <= end) {
            middle = (int) ((beginning+end)/2);
            if(searched == list[middle]) {
                found = true;
                System.out.println("Found at position " + (middle+1) + "!");
                break;
            }
            else if (list[middle] <= searched) {
                beginning = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        if(found == false) {
            System.out.println("Not found!");
        }


    }

}
