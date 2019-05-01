package com.ds.hash;

public class HashTableArrayDemo {

    public static void main(String[] args) {

        HashTableArray<Integer, String> marksToStudentMapping = new HashTableArray<>(10);
        marksToStudentMapping.put(30, "raju");
        marksToStudentMapping.put(45, "lalu");
        marksToStudentMapping.put(93, "rabri");

        try {
            System.out.println(marksToStudentMapping.get(93));
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }


    }
}
