package com.ds;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> progress = new LinkedList<>();
        progress.put(10);
        progress.put(20);
        progress.put(25);
        progress.put(35);
        System.out.println(progress.get(3));
        System.out.println(progress);

    }
}
