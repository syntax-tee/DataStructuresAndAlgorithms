package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatess {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 4, 5};

        System.out.println(" Duplicate " + findDuplicate1(nums));
    }

    // Brute Force Approach
    public static boolean findDuplicate1(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                    ans.add(nums[i]);
                    break;
                }
            }
        }
        return count == 3;
    }

    public static List<Integer> findDuplicate2(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                ans.add(nums[i]);
                i++;        // skip over next element
            }
        }

        return ans;
    }
}
