package com.taiye.ogunlade.java.ds.linkedlist.singly;

public class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    int countNodes(Node head) {
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
