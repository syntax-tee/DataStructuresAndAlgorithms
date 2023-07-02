package com.taiye.ogunlade.java.kunal.linearsearch;

public class FindEvenNum {
    public static void main(String[] args) {
        int arr[] = {1, 34, 56, 78, 8, 9, 12};
        int arr2[] = {1, 3, 9};
        int arr3[] = {18, 124, 9, 1764, 98, 1};
        //  System.out.println(even(arr2));
        System.out.println();

        System.out.println(even(14));
    }

    static int even(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                return nums[i];
            }
        }
        return -1;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * 1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;  // num /= 10
        }

        return count;
    }

    // find numbers that contains even number of digits
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
}
