package com.ds;

import java.util.Arrays;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray<Integer> marks = new DynamicArray<>(Integer.class, 3);
        System.out.println(String.format("current size of array : %s , data = %s",
                marks.getLength(), Arrays.toString(marks.getCurrentArray())));

        marks.put(70);

        System.out.println(String.format("current size of array : %s , data = %s",
                marks.getLength(), Arrays.toString(marks.getCurrentArray())));
        marks.put(80);

        System.out.println(String.format("current size of array : %s , data = %s",
                marks.getLength(), Arrays.toString(marks.getCurrentArray())));
        marks.put(90);

        System.out.println(String.format("current size of array : %s , data = %s",
                marks.getLength(), Arrays.toString(marks.getCurrentArray())));
        marks.put(60);

        System.out.println(String.format("current size of array : %s , data = %s",
                marks.getLength(), Arrays.toString(marks.getCurrentArray())));


    }

}
