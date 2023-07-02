package com.taiye.ogunlade.java.kunal.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 14, 20, 36, 48};
        int ans = binarySearch(arr, 14);
        System.out.println("Target is on "+ ans +" index ");
    }

    // return the index
    // return -1 if it does not exist
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = start + end / 2; might be possible that start+ end exceeds integer size limit
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }










}
