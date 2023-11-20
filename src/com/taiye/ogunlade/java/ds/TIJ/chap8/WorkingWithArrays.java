package com.taiye.ogunlade.java.ds.TIJ.chap8;


import java.util.Random;

/***
 *  Think in Java Chapter 8
 */
public class WorkingWithArrays {
    public static void main(String[] args) {

        double[] a = new double[3];
        double[] b = a;

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        int numValues = 8;
        int[] array = randomArray(numValues);
        printArray(array);

    }

    public static void printArray(int[] a) {
        System.out.println("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.println("," + a[i]);
        }
        System.out.println("}");
    }

    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static double sum(double[] a) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }
}
