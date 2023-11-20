package com.taiye.ogunlade.java.ds.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
              1 2 3 4
              5 6 7 8
              9 10 11 12
         */

        int[][] arr2D = new int[3][4]; // row 3 column 4

        int[][] arr = new int[2][2];

        int max = Integer.MIN_VALUE;
        int[] arrayMax = new int[0];

        System.out.println("Take input for 2D array");
        // INPUT
        // For each row
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { // length of each column
                arr[row][col] = in.nextInt();
            }

        }
        // OUTPUT
        // For each row and colum



        System.out.println("For each row and colum");
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { // length of each column
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

        // Using for loop to print each row and column
        System.out.println("Using for loop to print each row and column");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Using enhanced forloop for output
        System.out.println("Using enhanced forloop for output");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static int getMax2D(int[][] arr,int row, int col) {
        int max = Integer.MIN_VALUE;
        if(max < arr[row][col]) {
            max = arr[row][col];
        }
        return max;
    }
}
