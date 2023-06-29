package com.taiye.ogunlade.java.kunal.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);
    }
}