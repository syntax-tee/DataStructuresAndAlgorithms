package com.taiye.ogunlade.java.ds.array;

public class Flexible2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        var sum = 0;

        for (int row = 0; row < arr.length; row++) {
            sum = sum+ arr[row][row] +arr[row-1-row][row];

            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
