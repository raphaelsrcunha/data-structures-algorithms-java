package com.rsc.dsa.list;

public class List {

    private String[] list;
    private int realLength;

    public List(int length) {
        this.list = new String[length];
        realLength = 0;
    }

    public boolean push(String element) throws Exception {

        if(isFull()) {
           this.increaseCapacity();
        }

        this.list[realLength] = element;
        realLength++;
        return true;
    }

    public boolean push(int position, String element) {

        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }

        if(this.isFull()) {
            this.increaseCapacity();
        }

        for(int i = this.realLength-1; i >= position; i--) {
            this.list[i+1] = this.list[i];
        }

        this.list[position] = element;
        this.realLength++;

        return true;
    }

    public void increaseCapacity() {
        if(this.realLength == this.list.length) {
            String[] newList = new String[2*this.list.length];
            for(int i = 0; i < this.list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }

    public void pop(int position) {
        for(int i = position; i < this.realLength; i++) {
            list[i] = list[i+1];
        }
        this.realLength--;
    }

    public void pop(String element) {

        int position = this.search(element);

        if (position == -1) {
            throw new IllegalArgumentException("This element does not exist in this list");
        }

        this.pop(position);

    }

    public boolean isFull() {
        if(realLength < this.list.length) {
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
            s.append(list[i]);
            s.append(", ");
        }

        if(this.realLength > 0) {
            s.append(list[realLength -1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean isValidPosition(int position) {
        if(!(position >= 0 && position < this.list.length)) {
            return false;
        }
        return true;
    }

    public String search(int position) {
        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("Position invalid");
        }
        return this.list[position];
    }

    public int search(String element) {
        for(int i = 0; i < this.realLength(); i++) {
            if(this.list[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

}
