package com.rsc.dsa;

import com.rsc.dsa.list.ListInherited;
import com.rsc.dsa.queue.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        ListInherited list = new ListInherited();

        Queue<Integer> q1 = new Queue<Integer>(3);
        System.out.println(q1.toString());
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

        q1.add(3);
        q1.add(5);
        q1.add(6);
        System.out.println(q1.peek());
        q1.add(15);
        System.out.println(q1.remove());
        q1.add(16);
        System.out.println(q1.peek());
        System.out.println(q1.realLength());
        q1.add(5);
        System.out.println(q1.remove());
        System.out.println(q1.toString());
    }
}