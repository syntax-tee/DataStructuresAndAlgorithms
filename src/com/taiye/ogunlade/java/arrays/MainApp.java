package com.taiye.ogunlade.java.arrays;

import com.taiye.ogunlade.java.linkedlist.cicular.CircularLinkedList;
import com.taiye.ogunlade.java.linkedlist.singly.impl.MySinglyLinkedList;
import com.taiye.ogunlade.java.linkedlist.singly.SinglyLinkedList;


public class MainApp {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList();
        linkedList.addFirst(4);
        linkedList.addLast(5);
        linkedList.addLast(6);

        System.out.println("Size " + linkedList.getSize());
        System.out.println("Is Empty? " + linkedList.isEmpty());
        System.out.println("First " + linkedList.first());
        System.out.println("Last " + linkedList.last());

        MySinglyLinkedList<String> stringList = new MySinglyLinkedList<>();
        stringList.addFirst("T");
        stringList.addFirst("A");
        stringList.addFirst("I");

        System.out.println("MySinglyLinkedList");
        System.out.println("SIZE "+stringList.getSize());
        System.out.println("FIRST  "+stringList.first());
        System.out.println(stringList.removeFirst());
        System.out.println(stringList.getHead().getElement());

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addFirst(3);
        circularLinkedList.addFirst(4);
        circularLinkedList.addLast(8);

        System.out.println("Size "+circularLinkedList.getSize());
        System.out.println("First "+ circularLinkedList.last());
        System.out.println("Last "+ circularLinkedList.first());
        System.out.println("remove first "+circularLinkedList.removeFirst());
        System.out.println("first "+circularLinkedList.first());
    }
}
