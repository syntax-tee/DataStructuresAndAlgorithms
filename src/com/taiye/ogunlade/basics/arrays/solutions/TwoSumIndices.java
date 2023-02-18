package com.taiye.ogunlade.basics.arrays.solutions;

import java.util.Arrays;

public class TwoSumIndices {

    //Brute Force Approach
    //Complexity O(n2)
    public static void main(String[] args) {

        int[] arrays = {1, 2, 4,9, 5};
        System.out.println(Arrays.toString(findSumIndices(arrays, 6)));
    }

    public static int[] findSumIndices(int[] arr, int n) {
        int[] result = new int[2]; // to store the pair of values.

        for (int i = 0; i < arr.length; i++) { //traverse arr
            for (int j = i + 1; j < arr.length; j++) { //traverse arr again
                if (arr[i] + arr[j] == n) { // find where sum is equal to n
                    result[0] = i;
                    result[1] = j;
                    return result; // return the pair of numbers
                }
            }
        }
        return arr;
    }


}
