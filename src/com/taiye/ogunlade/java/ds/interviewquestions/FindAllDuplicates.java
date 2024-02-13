package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2,3,2,3,2,3};
        System.out.println("Duplicate " + findDuplicate3(nums));
    }

    public static int findDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return nums[i];
        }

        return -1;
    }

    public static int findDuplicate2(int[] nums) {
        Set<Integer> trackDuplicate = new HashSet<Integer>();
        for (int num : nums) {
            if (trackDuplicate.contains(num))
                return num;
            trackDuplicate.add(num);
        }
        return -1;
    }

    public static boolean findDuplicate3(int[] nums) {
        Set<Integer> trackDuplicate = new HashSet<Integer>();
        for (int num : nums) {
            if (trackDuplicate.contains(num))
                return true;
            trackDuplicate.add(num);
        }
        return false;
    }






    static boolean countNode(Node head)
    {
        int count = 0;

        while (head.next != null)
        {

            // Starting from the next node
            Node ptr = head.next;
            while (ptr != null)
            {

                // If some duplicate node is found
                if (head.data == ptr.data)
                {
                    count++;
                    break;
                }
                ptr = ptr.next;
            }

            head = head.next;
        }

        // Return the count of duplicate nodes
        return count  == 3;
    }

    static class Node
    {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
