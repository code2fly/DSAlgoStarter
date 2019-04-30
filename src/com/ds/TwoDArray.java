package com.ds;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] data = new int[3][4];
        data[0][0] = 1;
        data[0][1] = 2;
        data[0][2] = 3;
        data[1][0] = 4;
        data[1][1] = 5;
        data[1][2] = 6;
        data[2][0] = 7;
        data[2][1] = 8;
        data[2][2] = 9;
        data[2][3] = 10;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
