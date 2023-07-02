package com.taiye.ogunlade.java.kunal.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 14, 20, 36, 48};
        int ans = binarySearchOrderAgnostic(arr, 4);
        System.out.println("Target is on " + ans + " index ");
    }


    private static int binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find ascending or descending sort
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
