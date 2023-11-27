package com.taiye.ogunlade.java.ds.ThinkJava.chap8;


import java.util.Random;

/***
 *  Think in Java Chapter 8
 */
public class WorkingWithArrays {
    public static void main(String[] args) {

        int numValues = 8;
        int[] array = randomArray(numValues);
        printArray(array);

        int[] numbers = new int[]{1,22,23,4,5,6};

        System.out.println(" IN range "+inRange(numbers,112,205));

        System.out.println("Index of Max "+ indexOfMaxForLoop(numbers));

    }

    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print("," + a[i]);
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

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    static int indexOfMaxForLoop(int[] arr) {
        int max = 0;
        int indexOfMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax  = i;
            }
        }

        return indexOfMax;
    }

    static int indexOfMaxEnhanced(int[] numbers) {
        int indexOfMax = 0;
        int max = 0;

        for (int num:numbers) {
            if (num > max) {
                max = numbers[num];
                indexOfMax  = num;
            }
        }

        return indexOfMax;
    }



}
