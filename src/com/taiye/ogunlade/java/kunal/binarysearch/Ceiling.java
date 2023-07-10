package com.taiye.ogunlade.java.kunal.binarysearch;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 14, 20, 36, 48};
        int result = ceiling(arr, 8);
        System.out.println("Find element greater than or equal to " + result);
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            // find the middle element
            //  int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the range of int in java

            int mid = start + (end - start) / 2;
            int midValue = arr[mid];

            if (target < midValue) {
                end = mid - 1;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
