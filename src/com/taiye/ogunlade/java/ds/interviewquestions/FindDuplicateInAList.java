package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicateInAList {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,1,3,5,3,4,3);
        System.out.println("Repeated number "+ repeatedNumber(nums));
    }
    public static int repeatedNumber(final List<Integer> list) {
        if(list.size() <= 1) {
            return -1;
        }

        int[] count = new int[list.size() - 1];

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i) - 1;
            count[n]++;

            if (count[n] > 1) {
                return list.get(i);
            }
        }

        return -1;
    }

    public static int repeatedNumber2(final List<Integer> list) {
        if (list.size() <= 1) {
            return -1;
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                return list.get(i);
            }
        }

        return -1;
    }
}
