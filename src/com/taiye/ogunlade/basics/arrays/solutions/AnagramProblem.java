package com.taiye.ogunlade.basics.arrays.solutions;

import java.util.Arrays;

public class AnagramProblem {

    public static void main(String[] args) {
        char[] s1 = {'r', 'e', 's', 't', 'f', 'u', 'l'};
        char[] s2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};

        AnagramProblem anagramProblem = new AnagramProblem();
        System.out.println("is anagram ? "+anagramProblem.solve(s1, s2));

    }

    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;

        //O(NlogN)
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) return false;
        }
        return true;
    }
}
