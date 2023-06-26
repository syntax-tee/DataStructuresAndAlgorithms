package com.taiye.ogunlade.java.kunal.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        reversArray(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Springfield";
        reversString(name);
        // System.out.println(name);
    }

    static void reversArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void reversString(String str) {
        // two pointer (start) and (end)
        int start = 0; //start index
        char[] tempChar = str.toCharArray(); // convert string to char
        int end = str.toCharArray().length - 1; // end of string index

        for (start = 0;  start < end; start++) {
            char temp = tempChar[start];
            tempChar[start] = tempChar[end];
            tempChar[end] = temp;
            end--;
        }

        for(char c: tempChar){
            System.out.print(c);
        }
    }
}
