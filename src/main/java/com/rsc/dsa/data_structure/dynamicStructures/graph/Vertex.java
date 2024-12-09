package com.rsc.dsa.data_structure.dynamicStructures.graph;

import java.util.ArrayList;

public class Vertex<T> {

    private T element;
    private ArrayList<Edge<T>> inputEdges;
    private ArrayList<Edge<T>> outputEdges;

    public Vertex(T element) {
        this.element = element;
        this.inputEdges = new ArrayList<Edge<T>>();
        this.outputEdges = new ArrayList<Edge<T>>();
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void addEdgeOnInputEdges(Edge<T> edge) {
        this.inputEdges.add(edge);
    }

    public void addEdgeOnOutputEdges(Edge<T> edge) {
        this.outputEdges.add(edge);
    }
}
