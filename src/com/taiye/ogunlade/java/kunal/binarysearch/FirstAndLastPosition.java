package com.taiye.ogunlade.java.kunal.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println("Find First and Last Occurrence " + Arrays.toString(searchRange(arr, 7)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // Check for first occurrence
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

              /**
                        OR
                    int start = search(nums, target, true);
                    int end = search(nums, target, false);
                    ans[0] = start;
                    ans[1] = end;
             **/
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            //  find the middle element
            //  int mid = (start + end) / 2;
            //  might be possible that (start + end) exceeds the range of int in java

            int mid = start + (end - start) / 2;
            int midValue = arr[mid];

            if (target < midValue) {
                end = mid - 1;
            } else if (target > midValue) {
                start = mid + 1;
            } else {
                // ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
