package com.taiye.ogunlade.logic.array;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args) {
        int[] items = new int[]{2,11, 3};
        System.out.println(Arrays.toString(maxEnd3(items)));
    }

    public static int[] maxEnd3(int[] nums) {
        int last = nums.length - 1;
        int first = nums[0];
        int[] populateArray = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(last >= first) {
                max = last;
            } else {
                max = first;
            }
            populateArray[i] = max;
        }
        return populateArray;
    }

}
