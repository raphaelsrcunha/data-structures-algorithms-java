package com.rsc.dsa;

import com.rsc.dsa.list.ListInherited;
import com.rsc.dsa.queue.Patient;
import com.rsc.dsa.queue.PriorityQueue;
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

        Patient p1 = new Patient("p1", 1);
        Patient p2 = new Patient("p2", 4);
        Patient p3 = new Patient("p3", 2);
        Patient p4 = new Patient("p4", 100);

        PriorityQueue pq1 = new PriorityQueue();
        System.out.println(pq1);
        pq1.add(p1);
        pq1.add(p2);
        pq1.add(p3);
        pq1.add(p4);
        System.out.println(pq1);
    }
}