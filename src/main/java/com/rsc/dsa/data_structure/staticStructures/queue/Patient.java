package com.rsc.dsa.staticStructures.queue;

public class Patient implements Comparable<Patient>{

    private String name;
    private int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient o) {
        if(this.priority < o.getPriority()) {
            return -1;
        }

        if(this.priority > o.getPriority()) {
            return 1;
        }

        return 0;
    }
}
