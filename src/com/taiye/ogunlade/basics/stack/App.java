package com.taiye.ogunlade.basics.stack;

public class App {
    public static void main(String[] args) {

        StackArray<String> names = new StackArray<>();
        System.out.println("Is stack empty? " +names.isEmpty());
        names.push("Taiye");
        names.push("Kehinde");
        names.push("Idowu");
        System.out.println("Size "+ names.size());
        System.out.println(names.pop());
        System.out.println("Size "+ names.size());
        System.out.println(names.toString());

    }
}
