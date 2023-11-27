package com.taiye.ogunlade.java.ds.TIJ.chap8;

public class WorkingWithString {
    public static void main(String[] args) {
        Alphabet();
        fruitTraversal("Banana");
        System.out.println(reverse("Anomaly"));
    }

    private static void Alphabet() {
        System.out.println("Roman alphabet");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
        System.out.println();
    }

    static void fruitTraversal(String fruit) {
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.print(letter);
        }
    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
          r = r + s.charAt(i);
        }
        return r;
    }
}
