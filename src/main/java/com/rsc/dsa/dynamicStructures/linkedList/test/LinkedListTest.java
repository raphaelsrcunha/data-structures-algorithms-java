package com.rsc.dsa.dynamicStructures.linkedList.test;

import com.rsc.dsa.dynamicStructures.linkedList.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<Integer>();
        l1.push(1);
        System.out.println(l1);
        l1.push(4);
        System.out.println(l1);
        l1.push(7);
        System.out.println(l1);
        l1.push(23);
        System.out.println(l1);
        l1.push(12);
        System.out.println(l1);
        l1.clean();
        System.out.println(l1);
        l1.push(5);
        l1.push(1);
        System.out.println(l1);
        l1.push(8);
        l1.push(12);
        System.out.println(l1);
        System.out.println(l1.find(12));
        System.out.println(l1.findByPosition(2));
        System.out.println(l1.find(13));
        System.out.println(l1);
        l1.push(2, 33);
        System.out.println(l1);

        System.out.println("\nLISTA 2\n");
        LinkedList l2 = new LinkedList<Integer>();
        l2.push(0,1);
        l2.popFirst();
        l2.push(2);
        l2.push(4);
        l2.push(5);
        l2.push(0, 0);
        l2.push(3,3);
        System.out.println(l2);
        l2.popFirst();
        System.out.println(l2);
        l2.push(0, 10);
        l2.push(5, 33);
        l2.popLast();
        l2.popLast();
        l2.popLast();
        l2.popLast();
        l2.popLast();
        l2.popLast();
        l2.push(0, 0);
        l2.push(1, 1);
        l2.push(2);
        l2.pushAtTheBeginning(33);
        l2.popLast();
        l2.popFirst();
        System.out.println(l2);
        System.out.println(l2.find(1));
        l2.push(2);
        l2.push(3);
        l2.pop(0);
        l2.pop(1);
        l2.pop(1);

    }

}
