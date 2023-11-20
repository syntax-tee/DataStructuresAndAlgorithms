package com.taiye.ogunlade.java.ds.binarysearch2D;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 8, 5},
                {7, 10, 9, 3}
        };

        int[] result = searchIn2DArray(matrix, 8);
        System.out.println("Result " + Arrays.toString(result));
    }

    static int[] searchIn2DArray(int[][] matrix, int target) {

        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
