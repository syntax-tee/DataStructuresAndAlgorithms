package com.taiye.ogunlade.java.ds.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DLLl list = new DLLl();
        list.insertFirst(44);
        list.insertFirst(17);
        list.insertFirst(2);
        list.insertFirst(3);
        list.deleteFirst();
        list.insert(8,3);
        list.display();

        LL LL = new LL();
        LL.insertFirst(23);
        LL.insertFirst(54);
        LL.insertFirst(76);
        LL.insertLast(99);

        LL.display();

        System.out.println("Display reverse ");
        LL.display();


        LinkedList<String> courses = new LinkedList<>();
        courses.add("CSC 501 Spring 2023");
       courses.add("CSC 470 Spring 2023");

        System.out.println(courses.toString());

    }
}
