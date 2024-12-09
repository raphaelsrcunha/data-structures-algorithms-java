package com.rsc.dsa.staticStructures.queue;

public class PriorityQueue<T> extends Queue<T> {

    public void add(T element) {

        Comparable<T> elementComparable = (Comparable<T>) element;

        int i;

        for(i = 0; i < this.realLength; i++) {
            System.out.println(elementComparable.compareTo(this.elements[i]));
            if(elementComparable.compareTo(this.elements[i]) > 0) {
                this.add(element, i);
            }

        }
    }

    private void add(T element, int position) {
        this.add(element, position);
    }

}
