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
                } else { // equal or higher to the right
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

    public boolean remove(T element) {

        Node<T> current = this.root;
        Node<T> fatherOfCurrent = new Node<T>(null);

        while(element != null) {
            if(current.getElement().equals(element)) {
                break;
            } else if(element.compareTo(current.getElement()) == -1) {
                fatherOfCurrent = current;
                current = current.getLeft();
            } else {
                fatherOfCurrent = current;
                current = current.getRight();
            }
        }

        if(current != null) {

            //Element has two children
            if(current.getRight() != null) {

                Node<T> substitute = current.getRight();
                Node<T> fatherOfSubstitute = current;
                while(substitute.getLeft() != null) {
                    fatherOfSubstitute = substitute;
                    substitute = substitute.getLeft();
                }
                if(current.getElement().compareTo(fatherOfCurrent.getElement()) == -1) {
                    fatherOfCurrent.setLeft(substitute);
                } else {
                    fatherOfCurrent.setRight(substitute);
                }

            } else if(current.getLeft() != null) { // children on left
                //esquerda e tudo à direita, até que não tenha próximo. esse é o elemento que deve substituir
                Node<T> substitute = current.getLeft();
                Node<T> fatherOfSubstitute = current;
                while(substitute.getRight() != null) {
                    fatherOfSubstitute = substitute;
                    substitute = substitute.getRight();
                }
                if(current.getElement().compareTo(fatherOfCurrent.getElement()) == -1) {
                    fatherOfCurrent.setLeft(substitute);
                } else {
                    fatherOfCurrent.setRight(substitute);
                }
            } else if(current.getRight() != null) { // children on right

            } else { // no children
                if(current.getElement().compareTo(fatherOfCurrent.getElement()) == -1) {
                    fatherOfCurrent.setLeft(null);
                } else {
                    fatherOfCurrent.setRight(null);
                }
            }

            return true;
        } else {
            return false;
        }

    }

    public void printInOrder(Node<T> current) {
        if (current != null) {
            printInOrder(current.getLeft());
            System.out.println(current.getElement());
            printInOrder(current.getRight());
        }
    }

    public void printPreOrder(Node<T> current) {
        if (current != null) {
            System.out.println(current.getElement());
            printPreOrder(current.getLeft());
            printPreOrder(current.getRight());
        }
    }

    public void printPostOrder(Node<T> current) {
        if (current != null) {
            printPostOrder(current.getLeft());
            printPostOrder(current.getRight());
            System.out.println(current.getElement());
         }
    }

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
