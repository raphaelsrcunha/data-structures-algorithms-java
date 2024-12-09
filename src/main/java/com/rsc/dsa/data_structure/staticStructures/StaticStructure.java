package com.rsc.dsa.data_structure.staticStructures;

public class StaticStructure<T> {

    protected T[] elements;
    protected int realLength;

    public StaticStructure() {
        this(10);
    }

    public StaticStructure(int length) {
        this.elements = (T[]) new Object[length];
        this.realLength = 0;
    }

    protected boolean push(T element) throws Exception {

        if(isFull()) {
            this.increaseCapacity();
        }

        this.elements[realLength] = element;
        realLength++;
        return true;
    }

    protected boolean push(int position, T element) {

        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }

        if(this.isFull()) {
            this.increaseCapacity();
        }

        for(int i = this.realLength-1; i >= position; i--) {
            this.elements[i+1] = this.elements[i];
        }

        this.elements[position] = element;
        this.realLength++;

        return true;
    }

    protected void increaseCapacity() {
        if(this.realLength == this.elements.length) {
            T[] newList = (T[]) new Object[2*this.elements.length];
            for(int i = 0; i < this.elements.length; i++) {
                newList[i] = elements[i];
            }
            elements = newList;
        }
    }

    protected void pop(int position) {
        for(int i = position+1; i < this.realLength; i++) {
            elements[i-1] = elements[i];
        }
        this.elements[realLength-1] = null;
        this.realLength--;
    }

    protected void pop(T element) {
        int position = this.search(element);
        if (position == -1) {
            throw new IllegalArgumentException("This element does not exist in this list");
        }
        this.pop(position);
    }

    protected boolean pop() {
        if(this.isEmpty()) {
            return false;
        }

        this.elements[realLength-1] = null;
        this.realLength--;
        return true;
    }

    public boolean isFull() {
        if(realLength < this.elements.length) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return realLength == 0;
    }

    public int realLength() {
        return this.realLength;
    }

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.realLength -1; i++) {
            s.append(elements[i]);
            s.append(", ");
        }

        if(this.realLength > 0) {
            s.append(elements[realLength -1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean isValidPosition(int position) {
        if(!(position >= 0 && position < this.elements.length)) {
            return false;
        }
        return true;
    }

    protected T search(int position) {
        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }
        return this.elements[position];
    }

    protected int search(T element) {
        for(int i = 0; i < this.realLength(); i++) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T peek() throws Exception {
        if(realLength == 0) {
            return null;
        }
        return this.elements[realLength-1];
    }
}
