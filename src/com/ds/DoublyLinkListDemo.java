package com.ds;

public class DoublyLinkListDemo {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> progress = new DoubleLinkedList<>();
        progress.add(10);
        progress.add(20);
        progress.add(30);
        System.out.println(progress);
        progress.delete();
        progress.add(40);
        System.out.println(progress);

    }
}
