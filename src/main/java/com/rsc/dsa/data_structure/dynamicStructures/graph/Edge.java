package com.rsc.dsa.data_structure.dynamicStructures.graph;

public class Edge<T> {

    private double weight;
    private Vertex<T> source;
    private Vertex<T> destination;

    public Edge(double weight, Vertex<T> source, Vertex<T> destination) {
        this.weight = weight;
        this.source = source;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex<T> getSource() {
        return source;
    }

    public void setSource(Vertex<T> source) {
        this.source = source;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public void setDestination(Vertex<T> destination) {
        this.destination = destination;
    }
}
