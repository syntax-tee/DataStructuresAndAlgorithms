package com.taiye.ogunlade.java.ds.interviewquestions;

public class LLinkedList {
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



}
