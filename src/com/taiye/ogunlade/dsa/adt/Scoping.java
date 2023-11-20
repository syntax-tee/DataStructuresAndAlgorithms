package com.taiye.ogunlade.dsa.adt;

public class Scoping {
    static int x = 2;
    static int y = 3;
    static int z = 0;

    public static void main(String[] args) {
        sub1();
    }

    static int sub1() {
        var y = 7;
        x += 1;
        sub2();
        return x;
    }

    static int sub2() {
        y = y + x;
        sub3();
        return y;
    }

    static int sub3() {
         z = y * x;
        System.out.printf("X is %d", x);
        System.out.printf("Y is %d", y);
        System.out.printf("Z is %d", z);

        return z;
    }
}

