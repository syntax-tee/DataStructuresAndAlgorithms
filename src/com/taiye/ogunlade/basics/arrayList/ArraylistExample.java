package com.taiye.ogunlade.basics.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Taiye");
        list.add("Kehinde");
        list.add("Victoria");

        Object[] array = list.toArray();

        for(Object s:array){
            System.out.println(s);
        }
    }
}
