package com.taiye.ogunlade.java.kunal.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(44);
//        list.insertFirst(17);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.deleteFirst();
//        list.insert(8,3);
//        list.display();

        DLL dll = new DLL();
        dll.insertFirst(23);
        dll.insertFirst(54);
        dll.insertFirst(76);
        dll.insertLast(99);

        dll.display();

        System.out.println("Display reverse ");
        dll.displayReverse();


        LinkedList<String> courses = new LinkedList<>();
        courses.add("CSC 501 Spring 2023");
        courses.add("CSC 470 Spring 2023");

        System.out.println(courses.toString());

    }
}
