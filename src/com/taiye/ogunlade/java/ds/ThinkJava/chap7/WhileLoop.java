package com.taiye.ogunlade.java.ds.ThinkJava.chap7;

public class WhileLoop {
    public static void main(String[] args) {
        printTable(7);
    }

    public static void printRow(int n, int cols){
        int i = 1;
        for (i = 1; i <= cols ; i = i+1) {
            System.out.printf("%4d", n * i);
        }
        System.out.println(i);
    }

    public static  void printTable(int rows){
        for (int i = 0; i <= rows; i = i+1) {
            printRow(i,rows);
        }
    }
}
