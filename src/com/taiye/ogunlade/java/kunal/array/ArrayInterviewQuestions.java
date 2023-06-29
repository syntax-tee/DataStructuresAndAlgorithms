package com.taiye.ogunlade.java.kunal.array;

public class ArrayInterviewQuestions {
    public static void main(String[] args) {
            /*
                arr1 = [1,3,5]
                arr2 = [2,4,6]
                median = 3.5
             */

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6,4};

        median(arr1, arr2);

        ;
        System.out.println("Search array " + search(arr1, 3));
        System.out.println("Unique "+ areUnique(arr2));

    }

    static void median(int[] arr1, int[] arr2) {

    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean searchAreDifferent(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            if (search(y, x[i]) != -1)
                return false;
        }
        return true;
    }

    static  boolean areUnique(int[] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if( x[i] == x[j])
                    return false;
            }
        }
        return true;
    }
}




