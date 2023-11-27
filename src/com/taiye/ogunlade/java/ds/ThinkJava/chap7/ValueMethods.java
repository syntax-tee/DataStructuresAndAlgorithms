package com.taiye.ogunlade.java.ds.ThinkJava.chap7;

public class ValueMethods {

    public static void main(String[] args) {
        int expected = 3;
        int actual = 4;
        double radius = 3.14;
        int angle = 4;

        double error = Math.abs(expected - actual);
        double height = radius * Math.sin(angle);
        System.out.println("Error " + error);
        System.out.println("Height " + height);
        countup(3);
    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }


    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static double circleArea(double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double calculateArea(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
