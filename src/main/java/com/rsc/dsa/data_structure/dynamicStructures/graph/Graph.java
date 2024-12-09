package com.rsc.dsa.dynamicStructures.graph;

import java.util.ArrayList;

public class Graph<T> {

    private ArrayList<Vertex<T>> vertices;
    private ArrayList<Edge<T>> edges;

    public Graph() {
        vertices = new ArrayList<Vertex<T>>();
        edges = new ArrayList<Edge<T>>();
    }

    public void addVertex(T element){

    }

    public void addEdge(Double weight, T source, T destination) {

    }
}
