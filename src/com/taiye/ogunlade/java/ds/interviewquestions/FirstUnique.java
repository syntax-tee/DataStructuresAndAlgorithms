package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.HashSet;
import java.util.LinkedHashSet;

class FirstUnique {

    static LinkedHashSet<Integer> nonRepeatingNums;
    static HashSet<Integer> repeatingNums;
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};

        FirstUnique(nums);

        System.out.println("Result " + showFirstUnique());
    }


    public static void FirstUnique(int[] nums) {
        nonRepeatingNums = new LinkedHashSet<>();
        repeatingNums = new HashSet<>();

        if (nums == null || nums.length == 0) {
            return;
        }
        // Adding each input number in the FirstUnique object
        for (int num : nums) {
            add(num);
        }
    }

    public static int showFirstUnique() {
        return nonRepeatingNums.size() == 0 ? -1 : nonRepeatingNums.iterator().next();
    }

    public static void add(int value) {
        if (repeatingNums.contains(value)) {
            // Number is a previously known repeating number.
            return;
        }
        if (!nonRepeatingNums.add(value)) {
            // Number has now become a repeating number, so remove it from nonRepeatingNums
            // Set and add it to repeatingNums set.
            nonRepeatingNums.remove(value);
            repeatingNums.add(value);
        }
    }

}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */