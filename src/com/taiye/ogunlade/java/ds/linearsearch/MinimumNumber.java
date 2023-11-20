package com.taiye.ogunlade.java.ds.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10, 34, 56, 78, 8, 9, 12};
        System.out.println("Minimum " + findMinimum(arr));
    }


    static int findMinimum(int[] arr) {
        int min = arr[0];

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
