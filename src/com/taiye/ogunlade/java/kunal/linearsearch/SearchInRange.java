package com.taiye.ogunlade.java.kunal.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 34, 56, 78, 8, 9, 12};
        System.out.println(linearSearch(arr, 56,0,5));
    }

    static int linearSearch(int[] arr, int target,int start, int end) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int index = start; index <= end; index++) {
            // check for element at every index it is target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MIN_VALUE;
    }
}
