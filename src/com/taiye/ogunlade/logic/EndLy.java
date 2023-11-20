package com.taiye.ogunlade.logic;

public class EndLy {
    public static void main(String[] args) {
        var result = endsLy("Socially");
        System.out.println(result);
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly") && str.equalsIgnoreCase(str);
    }
}
