package com.taiye.ogunlade.java.ds.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.stream().toList());

        System.out.println("Value at Index (3) == " + list.get(3));
        System.out.println("Size " + list.size());
        System.out.println();

        list.forEach(Object::toString);

        System.out.println("Contains " + list.contains(4));

//        System.out.println("Set 2 index to " + list.set(2, 4));

        list.iterator().forEachRemaining(Object::toString);

        System.out.println("Input additional 5 items to the list ");

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println(list);
    }
}
