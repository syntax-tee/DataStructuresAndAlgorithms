package com.taiye.ogunlade.java.ds.interviewquestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EqualSublists {
    static Node head, tail;

    static class Node {
        int data;
        Node next;

        Node(int newData) {
            data = newData;
        }
    }

    static void add(int newData) {
        if (head == null) {
            head = new Node(newData);
            tail = head;
        } else {
            tail.next = new Node(newData);
            tail = tail.next;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();

        Scanner fileIn = new Scanner(new File("in.txt"));

        while (fileIn.hasNextInt()) {
            add(fileIn.nextInt());
        }
        fileIn.close();
        printList(head);

        boolean hasPartition = equalSublists();
        System.out.println(hasPartition ? "YES" : "NO");
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        System.out.println("Elapsed /  Run Time " + elapsedTime);

    }

    static void printList(Node list) {
        while (list != null) {
            System.out.print(list.data);
            list = list.next;
            if (list != null) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static boolean equalSublists() {
        return equalSublists(head, 0, 0, 0, 0);
    }

    static boolean equalSublists(Node current, int subSum1, int subSum2, int sub1Length, int sub2Length) {
        if (current == null) {
            return (Math.abs(subSum1 - subSum2) <= 1) && subSum1 == subSum2;
        }
        // Either add or subtract the current node from either sublist 1 or sublist 2
        // When you add or subtract the node then make sure to add 1 to the proper length
        return equalSublists(current.next, subSum1 + current.data, subSum2, sub1Length + 1, sub2Length) ||
                equalSublists(current.next, subSum1 - current.data, subSum2, sub1Length + 1, sub2Length) ||
                equalSublists(current.next, subSum1, subSum2 + current.data, sub1Length, sub2Length + 1) ||
                equalSublists(current.next, subSum1, subSum2 - current.data, sub1Length, sub2Length + 1);
    }


}
