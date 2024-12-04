package com.rsc.dsa.dynamicStructures.tree.test;

import com.rsc.dsa.dynamicStructures.tree.Tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree t1 = new Tree<Integer>();
        t1.add(5);
        t1.add(3);
        t1.add(6);
        t1.add(4);
        t1.add(8);
        t1.add(7);
        t1.add(35);
        t1.add(23);
        t1.add(99);
        t1.add(-5);
        t1.remove(35);
        t1.remove(-5);
        t1.remove(8);
        System.out.println("\nPrinting in order");
        t1.printInOrder(t1.getRoot());
        //System.out.println("\nPrinting pre-order");
        //t1.printPreOrder(t1.getRoot());
        //System.out.println("\nPrinting post-order");
        //t1.printPostOrder(t1.getRoot());
    }
}
