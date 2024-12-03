package com.rsc.dsa.dynamicStructures.tree;

public class Tree<T extends Comparable> {

    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void add(T element) {
        Node<T> newNode = new Node(element);
        if(this.root == null) {
            this.root = newNode;
        }else {
            Node<T> current = this.root;
            while(true) {
                if(newNode.getElement().compareTo(current.getElement()) == -1) {
                    if(current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else {
                    if(current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
