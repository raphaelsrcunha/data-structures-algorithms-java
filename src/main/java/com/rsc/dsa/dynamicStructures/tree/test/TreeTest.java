package com.rsc.dsa.dynamicStructures.tree.test;

import com.rsc.dsa.dynamicStructures.tree.Tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree t1 = new Tree<Integer>();
        t1.add(5);
        System.out.println(t1);
        t1.add(3);
        t1.add(6);
        System.out.println(t1);
        t1.add(4);
        t1.add(8);
        t1.add(7);
        System.out.println(t1);
    }
}
