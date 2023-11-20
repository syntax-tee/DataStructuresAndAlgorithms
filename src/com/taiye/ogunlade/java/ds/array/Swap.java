package com.taiye.ogunlade.java.ds.array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void swap(char[] tempChar, int start, int end) {
        char temp = tempChar[start];
        tempChar[start] = tempChar[end];
        tempChar[end] = temp;
    }
}
