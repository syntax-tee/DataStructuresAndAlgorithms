package com.taiye.ogunlade.java.kunal.linearsearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println("Maximum Wealth " + maximumWealth(accounts));

        System.out.println("Maximum Wealth II " + maximumWealthEnhanced(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        // person rol
        // account col
        int max = Integer.MIN_VALUE;


        for (int person = 0; person < accounts.length; person++) { //row
            int sum = 0;
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
}
