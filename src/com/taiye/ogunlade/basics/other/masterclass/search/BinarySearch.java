package com.taiye.ogunlade.basics.other.masterclass.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = {-5, 1, 5, 7, 23, 36, 43};
        System.out.println("Binary Search  " + binarySearchIterative(intArray, 43));
    }


    public static int binarySearchIterative(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }
}
