package com.ds;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public LinkedList(T value) {
        this.head = new Node<>(value);
        this.last = this.head;
    }

    public T get(int index) {
        Node<T> element = this.head;
        int currentIndex = 0;
        if (this.head == null){
            throw new IndexOutOfBoundsException("list is currently empty, no element at index specified");
        }
        while(true) {
            if (currentIndex == index) {
                break;
            }
            if (element.getNext() == null) {
                throw new IndexOutOfBoundsException("provided index does not exist in the list yet, last index present is :" +
                        (currentIndex -1));
            }
            element = element.getNext();
            currentIndex++;

        }
        return element.getValue();
    }

    public void put(T value) {
        Node<T> newNode = new Node<>(value);
        if (this.head == null ) {
            this.head = newNode;
            this.last = newNode;
        }
        else  {
            last.next = newNode;
            last = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> element = this.head;
        while(true) {
            if (element == null) {
                builder.append("null");
                break;
            }
            builder.append(element.getValue());
            builder.append(" --> ");
            element = element.next;
        }
        return builder.toString();
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }
    }
}
