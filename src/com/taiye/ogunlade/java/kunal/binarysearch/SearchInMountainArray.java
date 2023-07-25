package com.taiye.ogunlade.java.kunal.binarysearch;

public class SearchInMountainArray implements MountainArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 1};


        search(arr, 5);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearchOrderAgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearchOrderAgnostic(arr, target, peak + 1, arr.length - 1);
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {

                // you're in decreasing part of the array
                end = mid;

            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static int binarySearchOrderAgnostic(int[] arr, int target, int start, int end) {

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

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int length(int index) {
        return 0;
    }
}
