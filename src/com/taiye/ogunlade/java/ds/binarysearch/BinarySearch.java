package com.taiye.ogunlade.java.ds.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 14, 20, 36, 4, 8};
        int[] arr1 = {24, 13, 5, 9, 6, 2};
        int ans = binarySearch(arr1, 6);
        System.out.println("Target is onnn " + ans + " index ");
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
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
        return -1;
    }

    private static int binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find ascending or descending sort
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
