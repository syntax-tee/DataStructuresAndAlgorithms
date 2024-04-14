package com.taiye.ogunlade.java.ds.interviewquestions;

public class DoublyLinkedList {
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


    public static void displayNode() {
        DoublyLinkedList.Node current = head;
        if (head == null) {
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {


        Node node = new Node(3);
        Node node1 = new Node(5);
        node.next = node1;

        displayNode();
    }

}
