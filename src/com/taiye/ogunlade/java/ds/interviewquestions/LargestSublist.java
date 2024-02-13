package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestSublist {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        int maxLength = largestSublist(list);
        System.out.println("Largest sublist length: " + maxLength);
    }
    public static int largestSublist(List<Integer> list) {
        if (list.size() < 2) {
            return 0;
        }

        Map<Integer, List<IntegerPair>> sums = new HashMap<>();
        int maxLength = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) - list.get(j);
                List<IntegerPair> sublists = sums.getOrDefault(sum, new ArrayList<>());

                boolean found = false;
                for (IntegerPair pair : sublists) {
                    if (pair.getFirst() == j) {
                        found = true;
                        int length = pair.getSecond() + 1;
                        if (length > maxLength) {
                            maxLength = length;
                        }
                        break;
                    }
                }

                if (!found) {
                    sublists.add(new IntegerPair(j, 1));
                    sums.put(sum, sublists);
                }
            }
        }

        return maxLength;
    }
}
