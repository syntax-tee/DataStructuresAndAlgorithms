package com.taiye.ogunlade.java.kunal.array;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.stream().toList());
    }
}
