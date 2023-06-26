package com.taiye.ogunlade.java.kunal.array;

import java.util.Scanner;

public class ArraysExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        // datatype[] var_name = new datatype[size]


        int[] rownos = new int[5];

        int[] row_nos = {23, 12, 34, 56, 46};

        String[] arr = new String[4];
      /*
         Array of primitives
       */

        int[] arrr = new int[5];

        arrr[0] = 23;
        arrr[1] = 45;
        arrr[2] = 233;
        arrr[3] = 543;
        arrr[4] = 3;

        System.out.println("Input  values ");


        /*
          Input using for loop
         */
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = in.nextInt();
        }

        /*
         printing from an array
         */

        for (int i = 0; i < arrr.length; i++) {
            System.out.println("Using forloop " + arrr[i]);
        }

        System.out.println();

        for (int num : arrr) {
            System.out.println("Using foreach " + num);
        }

        System.out.println();

        System.out.println("Array static method " + java.util.Arrays.toString(arrr));

        /*
           Array of String object
         */

        String[] str = new String[4];
        System.out.println("Input Strings ");

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        // MODIFY
        str[0] = "Taiye";

        System.out.println(java.util.Arrays.toString(str));


        

    }
}
