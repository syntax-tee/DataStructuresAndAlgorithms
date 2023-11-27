package com.taiye.ogunlade.logic.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class plusTwo {
    public static void main(String[] args) {
        int[] item1 = new int[]{1,2, 3};
        int[] item2 = new int[]{4,5, 6};


      var result =  plusTwo(item1,item2);
        System.out.println("Result "+ Arrays.toString(result));
    }

    public static int[] plusTwo(int[] a, int[] b){
        int[] newArrayA = new int[a.length];
        int[] newArrayB = new int[b.length];
        int[] mergedArray = new int[a.length+b.length];


        for (int i = 0; i < a.length; i++) {
            System.out.println("Item A "+ a);
            mergedArray[i] = a[i];
            for (int j = 0; j < b.length; j++) {
                // System.out.println("Item B "+ b);
                // mergedArray[j] = b[j];
            }
        }
        return mergedArray;
    }
}
