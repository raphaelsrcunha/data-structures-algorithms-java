package com.rsc.dsa.data_structure.staticStructures.queue;

import com.rsc.dsa.data_structure.staticStructures.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

    public Queue() {
        super();
    }

    public Queue(int length) {
        super(length);
    }

    public void add(T element) throws Exception {
        super.push(element);
    }

    public T remove() {
        if(this.isEmpty()) {
            return null;
        }

        T elementToBeRemoved = this.elements[0];

        this.pop(0);

        return elementToBeRemoved;
    }

    public T peek() {
        if(this.isEmpty()) {
            return null;
        }
        return this.elements[0];
    }

}
