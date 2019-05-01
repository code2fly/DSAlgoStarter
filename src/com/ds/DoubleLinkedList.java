package com.ds;

public class DoubleLinkedList<T> {
    private Node<T> head;
    private int size;

    public DoubleLinkedList(T data){
        this.head = new Node<>(data);
        this.size = 1;
    }

    public DoubleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // add
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            this.head = newNode;
            size++;
            return;
        }
        newNode.next = this.head;
        this.head.previous = newNode;
        this.head = newNode;
        size++;

    }

    // delete (only for the first element)
    public void delete() {
        this.head = this.head.next;
    }

    // display (basically override the toString() method)


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> currentNode = this.head;
        if (this.head == null) {
            return "null";
        }
        while(currentNode != null) {
            builder.append(currentNode.value);
            builder.append(" --> ");
            currentNode = currentNode.next;
        }
        builder.append("null");
        return builder.toString();
    }

    private static class Node<T> {

        private Node<T> previous;
        private T value;
        private Node<T> next;

        public Node(Node<T> previous, T value, Node<T> next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.previous = null;
            this.value = value;
            this.next = null;
        }
    }
}
