package com.rsc.dsa.dynamicStructures.linkedList;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;
    private final int NOT_FOUND = -1;

    public void push(T element) {
        Node<T> cell = new Node<T>(element);
        if(length == 0) {
            pushAtTheBeginning(element);
            return;
        } else {
            this.last.setNext(cell); // here we set the 'next' attribute to the last node
        }
        this.last = cell; // here we change the list's 'last' attribute to the node we just created
        this.length++;
    }

    public void pushAtTheBeginning(T element) {
        if(this.length == 0) {
            Node<T> newNode = new Node(element);
            this.first = newNode;
            this.last = newNode;
        } else {
            Node<T> newNode = new Node<T>(element, this.first);
            this.first = newNode;
        }
        length++;
    }

    public void push(int position, T element) {

        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("This position does not exist!");
        }

        if(this.length == 0 || position == 0) {
            pushAtTheBeginning(element);
        } else if(position == length) {
            push(element);
        } else {
            Node<T> previousNode = findByNode(position-1);
            Node<T> nextNode = previousNode.getNext();
            Node<T> node = new Node(element, nextNode);
            previousNode.setNext(node);
            this.length++;
        }
    }

    public T popFirst() {
        if(this.length == 0) {
            throw new RuntimeException("List is empty");
        }

        T removed = this.first.getElement();

        this.first = this.first.getNext();

        if(this.first == null) {
            this.last = null;
        }

        this.length--;

        return removed;
    }

    public T popLast() {
        if(this.length == 0) {
            throw new RuntimeException("List is empty");
        }

        if(this.length == 1) {
            return this.popFirst();
        }

        T removed = this.last.getElement();
        Node<T> secondToLast = this.findByNode(this.length-2);

        secondToLast.setNext(null);
        this.last = secondToLast;
        this.length--;

        return removed;
    }

    public T pop(int position) {

        if(!this.isValidPosition(position)) {
            throw new IllegalArgumentException("This position does not exist!");
        }

        if(position == 0) {
            return this.popFirst();
        }

        Node<T> previousNode = findByNode(position-1);

        Node<T> node = previousNode.getNext();
        T removed = node.getElement();

        if(this.length > 2) {
            Node<T> nextNode = node.getNext();
            previousNode.setNext(nextNode);
        } else {
            previousNode.setNext(null);
        }

        this.length--;
        node.setNext(null);
        node.setElement(null);

        return removed;
    }

    public int getLength() {
        return this.length;
    }

    public void clean() {
        for(Node<T> current = this.first; current != null;) {
            Node<T> next = current.getNext();
            current.setElement(null);
            current.setNext(null);
            current = next;
        }
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    private boolean isValidPosition(int position) {
        if(!(position >= 0 && position <= this.length)) {
            return false;
        }
        return true;
    }

    private Node<T> findByNode(int position) {

        if(!isValidPosition(position)) {
            throw new IllegalArgumentException("This position does not exist!");
        }

        Node<T> currentNode = this.first;
        for(int i = 0; i < position; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public T findByPosition(int position) {
        return findByNode(position).getElement();
    }

    public int find(T element) {
        Node<T> current = this.first;
        int position = 0;
        while(current != null) {
            if(current.getElement().equals(element)) {
                return position;
            }
            position++;
            current = current.getNext();
        }
        return NOT_FOUND;
    }

    @Override
    public String toString() {

        if(this.length == 0) return "[]";

        StringBuilder builder = new StringBuilder("[");

        Node<T> current = this.first;

        for(int i = 0; i < this.length - 1; i++) {
            builder.append(current.getElement()).append(", ");
            current = current.getNext();
        }

        builder.append(current.getElement());

        builder.append("]");

        return builder.toString();
    }
}
