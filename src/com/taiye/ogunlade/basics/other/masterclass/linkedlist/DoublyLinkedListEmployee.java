package com.taiye.ogunlade.basics.other.masterclass.linkedlist;

import com.taiye.ogunlade.basics.linkedlist.newimpl.DoublyNode;

public class DoublyLinkedListEmployee<Employee> {

    private int size;
    private DoublyNode head;
    private DoublyNode tail;


    public void insertToFront(Employee employee) {
        DoublyNode node = new DoublyNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        DoublyNode node = new DoublyNode(employee);
        if (head == null) {
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public DoublyNode removeFront() {
        if (isEmpty()) return null;

        DoublyNode removeNode = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current);
            current = current.getNext();
        }
        System.out.println("null");
    }
}
