package com.taiye.ogunlade.java.kunal.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1, 34, 56, 78, 8, 9, 12};
        System.out.println(linearSearch(arr, 78));
        System.out.println(linearSearchElem(arr, 78));
        System.out.println(linearSearchElemBoolean(arr, 78));
    }

    // search in the array return index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index it is target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }

    static int linearSearchElem(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            // check for element at every index it is target
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE; // edge case returning Integer.MAX value becuase -1 might be part of the array elements
    }


    static boolean linearSearchElemBoolean(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            // check for element at every index it is target
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
