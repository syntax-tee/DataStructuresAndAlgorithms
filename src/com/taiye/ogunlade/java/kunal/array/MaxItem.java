package com.taiye.ogunlade.java.kunal.array;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 45,3, 23, 9, 18};

        System.out.println("findMax "+findMax(arr));

        int end = arr.length - 1;
        int start = arr[0];

        System.out.println("findMaxInRange "+findMaxInRange(arr, start, end));

        System.out.println("findMaxInRange "+findMaxInRange(arr, 3, 5));

    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        if(arr == null){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    static int findMaxInRange(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;

        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
