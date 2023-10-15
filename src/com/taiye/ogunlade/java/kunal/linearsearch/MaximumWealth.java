package com.taiye.ogunlade.java.kunal.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println("Maximum Wealth " + maximumWealth(accounts));

        System.out.println("Maximum Wealth II " + maximumWealthEnhanced(accounts));
        List<Integer> listA = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();
        List<Integer> listD = new ArrayList<>();
        List<Integer> listE = new ArrayList<>();
        List<Integer> listF = new ArrayList<>();
        List<Integer> listG = new ArrayList<>();
        List<Integer> listH = new ArrayList<>();

        listA.add(5);
        listC.add(5);
        listD.add(1);
        listD.add(2);
        listD.add(1);
        listD.add(3);
        listD.add(4);
        listE.add(1);
        listE.add(9);
        listE.add(2);
        listE.add(2);
        listE.add(2);
        listF.add(4);
        listF.add(5);
        listF.add(1);
        listF.add(9);
        listF.add(7);
        listG.add(3);
        listG.add(5);
        listG.add(3);
        listG.add(7);
        listG.add(6);
        listH.add(4);
        listH.add(3);
        listH.add(1);
        listH.add(7);
        listH.add(3);

        List listB = new ArrayList();
        listB.add(listA);
        listB.add(listC);
        listB.add(listD);
        listB.add(listE);
        listB.add(listF);
        listB.add(listG);
        listB.add(listH);


        findHigh(listB);
        System.out.println("high " +
                "" +
                "for"+findHigh2(listB));

    }

    public static int maximumWealth(int[][] accounts) {
        // person rol
        // account col
        int max = Integer.MIN_VALUE;


        for (int person = 0; person < accounts.length; person++) { //row
            int sum = 0;
            System.out.println("Person "+ person);
            for (int account = 0; account < accounts[person].length; account++) { // col
                sum += accounts[person][account];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static int maximumWealthEnhanced(int[][] accounts) {
        // person rol
        // account col
        int max = Integer.MIN_VALUE;


        for (int[] ints : accounts) { //row
            int sum = 0;
            for (int anInt : ints) { // col
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    private static int findHigh(List<List<Integer>> elevation){
//        for (List<Integer> row: elevation) {
//            System.out.println("row");
//            System.out.println(row);
//
//            for (Integer col: row){
//                System.out.println("Col");
//                System.out.println(col);
//            }
//        }
        return  0;
    }

    private static int findHigh2(List<List<Integer>> elevation){
        int max = 0;
        for (int row = 1; row < elevation.size(); row++) {
            System.out.println("row");
            System.out.println(row);
            int sum = 0;

                for (int col = 1; col < elevation.get(row).size(); col++) { // col
                    System.out.println("Col"+ col);
                      sum += elevation.get(row).get(col);
                }

                if(sum > max){
                    max = sum;
                }

        }
        return  max;
    }
}
