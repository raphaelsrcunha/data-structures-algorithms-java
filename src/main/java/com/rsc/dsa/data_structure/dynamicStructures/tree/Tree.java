package com.rsc.dsa.data_structure.dynamicStructures.tree;

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
        if (this.root == null) return false; // Empty tree

        Node<T> current = this.root;
        Node<T> fatherOfCurrent = null;

        // search node
        while (current != null && !current.getElement().equals(element)) {
            fatherOfCurrent = current;
            if (element.compareTo(current.getElement()) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        if (current == null) {
            return false;
        }

        // Case 1: Node with two children
        if (current.getLeft() != null && current.getRight() != null) {
            Node<T> substitute = current.getRight();
            Node<T> fatherOfSubstitute = current;

            // Find lower element of right subtree
            while (substitute.getLeft() != null) {
                fatherOfSubstitute = substitute;
                substitute = substitute.getLeft();
            }

            current.setElement(substitute.getElement());

            // Remove the substitute from the original position
            if (fatherOfSubstitute.getLeft() == substitute) {
                fatherOfSubstitute.setLeft(substitute.getRight());
            } else {
                fatherOfSubstitute.setRight(substitute.getRight());
            }
        }
        // Case 2: Node with only one or no children
        else {
            Node<T> child = (current.getLeft() != null) ? current.getLeft() : current.getRight();

            if (fatherOfCurrent == null) {
                // In case of current node is the root
                this.root = child;
            } else if (current == fatherOfCurrent.getLeft()) {
                fatherOfCurrent.setLeft(child);
            } else {
                fatherOfCurrent.setRight(child);
            }
        }

        return true;
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
