package com.taiye.ogunlade.java.ds.binarysearch;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 43, 56, 75};
         boolean result = binarySearchRecursive(arr, 4);
        System.out.println(result);
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);

            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
                // return binarySearchRecursive(array, x, left, mid - 1);
            } else {
                left = mid + 1;
            }
            // return binarySearchRecursive(array, x, mid + 1, right);
        }
        return false;
    }
}
