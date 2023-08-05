package com.taiye.ogunlade;

public class Person {

    public static void main(String[] args) {


        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}
