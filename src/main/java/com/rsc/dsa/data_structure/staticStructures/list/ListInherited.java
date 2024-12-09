package com.rsc.dsa.data_structure.staticStructures.list;

import com.rsc.dsa.data_structure.staticStructures.StaticStructure;

public class ListInherited<T> extends StaticStructure<T> {

    public ListInherited() {
        super();
    }

    public ListInherited(int length) {
        super(length);
    }

    public boolean push(T element) throws Exception {
        return super.push(element);
    }

    public boolean push(int position, T element) {
        return super.push(position, element);
    }

    public void increaseCapacity() {
        super.increaseCapacity();
    }

    public void pop(int position) {
        super.pop(position);
    }

    public void pop(T element) {
        super.pop(element);
    }

    public boolean isFull() {
        return super.isFull();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int realLength() {
        return super.realLength();
    }

    public String toString() {
        return super.toString();
    }

    public boolean isValidPosition(int position) {
        return super.isValidPosition(position);
    }

    public T search(int position) {
        return null;
    }

    public int search(T element) {
        return super.search(element);
    }
}
