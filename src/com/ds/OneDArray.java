package com.ds;

public class OneDArray {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 7;
        numbers[3] = 12;
        numbers[4] = 51;

        for (int number : numbers) {
            System.out.println(number);
        }


        // create a array of object type, (Student for now)
        Student[] students = new Student[4];
        students[0] = new Student("lalu", 42, "patna");
        students[1] = new Student("nitish", 44, "patna");
        students[2] = new Student("rabri", 41, "patna");

        for (Student student :students) {

            System.out.println(student);
        }

    }

}
