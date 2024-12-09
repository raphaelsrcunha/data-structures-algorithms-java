package com.rsc.dsa.staticStructures.stack;

import com.rsc.dsa.staticStructures.StaticStructure;

public class Stack<T> extends StaticStructure<T> {

    public Stack() {
        super();
    }

    public Stack(int length) {
        super(length);
    }

    public boolean push(T element) throws Exception {
        return super.push(element);
    }

    public boolean pop() {
        return super.pop();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek() throws Exception {
        return super.peek();
    }

}
