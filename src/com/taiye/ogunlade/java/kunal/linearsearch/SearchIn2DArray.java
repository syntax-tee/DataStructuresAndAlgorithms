package com.taiye.ogunlade.java.kunal.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 5},
                {45, 6, 8, 3},
                {35, 7, 9, 17, 28},
                {21, 34, 5},
        };


        int target = 34;
        System.out.println();

        System.out.println(Arrays.toString(search2DArray(arr, target)));
        System.out.println(maxIn2DArray(arr));
    }

    static int[] search2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int maxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }

    static int maxIn2DArrayEnhanced(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }


}
