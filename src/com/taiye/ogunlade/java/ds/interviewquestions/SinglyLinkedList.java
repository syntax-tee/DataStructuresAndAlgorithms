package com.taiye.ogunlade.java.ds.interviewquestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.time.Instant;
import java.util.Scanner;

public class SinglyLinkedList {
     static Node head;
        private Node tail;
        private int size;


        public void readValues(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void displayNode() {
            Node current = head;
            if (head == null) {
                return;
            }
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }


        private class Node {
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }

            public static Node middleNode(Node head) {
                Node slow = head;
                Node fast = head;

                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow;

            }
        }

        public static void main(String[] args) throws FileNotFoundException {
            EqualSublists("in.txt");
        }
        private static void EqualSublists(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (file.exists()) {
                Scanner inputScanner = new Scanner(file);
                SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
                while (inputScanner.hasNext()) {
                    if (inputScanner.hasNextInt()) {
                        singlyLinkedList.readValues(inputScanner.nextInt());
                    }
                }
                inputScanner.close();
                singlyLinkedList.displayNode();

            } else {
                System.out.println("No file found");
            }
            boolean hasPartition = equalSublists();
            System.out.println(hasPartition ? "YES" : "NO");

            System.out.println("Current Time "+ Time.from(Instant.now()));
        }
        static boolean equalSublists() {
            return equalSublists(head, 0, 0, 0, 0, "", "");
        }

        static boolean equalSublists(Node current, int subSum1, int subSum2, int sub1Length, int sub2Length, String s1, String s2) {
            if(current == null) {
                boolean check = (Math.abs(sub1Length - sub2Length) <= 1) && subSum1 == subSum2;
                if(check) {//For debugging only
                    System.out.println(s1 + " | " + s2);
                }
                return check;
            }

            // Either add or subtract the current node from either sublist 1 or sublist 2
            // When you add or subtract the node then make sure to add 1 to the proper length
            return equalSublists(current.next, subSum1 + current.value, subSum2, sub1Length + 1, sub2Length, s1 + current.value + " ", s2) ||
                    equalSublists(current.next, subSum1 - current.value, subSum2, sub1Length + 1, sub2Length, s1 + "-"+current.value + " ", s2) ||
                    equalSublists(current.next, subSum1, subSum2 + current.value, sub1Length, sub2Length + 1, s1, s2 + current.value + " ") ||
                    equalSublists(current.next, subSum1, subSum2 - current.value, sub1Length, sub2Length + 1, s1, s2 + "-"+current.value + " ");
        }



}
