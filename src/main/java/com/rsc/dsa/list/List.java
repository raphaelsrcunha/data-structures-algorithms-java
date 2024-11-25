package com.rsc.dsa.list;

public class List {

    private String[] elements;
    private int realLength;

    public List(int length) {
        this.elements = new String[length];
        realLength = 0;
    }

    public boolean push(String element) {
        if(!isFull()) {
            this.elements[realLength] = element;
            realLength++;
            return true;
        }
        return false;
    }

    public boolean push(int position, String element) {

        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }

        if(this.isFull()) {
            throw new IllegalArgumentException("List is full");
        }

        for(int i = this.realLength-1; i >= position; i--) {
            this.elements[i+1] = this.elements[i];
        }

        this.elements[position] = element;
        this.realLength++;

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

    public String search(int position) {
        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }
        return this.elements[position];
    }

    public int search(String element) {
        for(int i = 0; i < this.realLength(); i++) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

}
