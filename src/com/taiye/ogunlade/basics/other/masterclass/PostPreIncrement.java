package com.taiye.ogunlade.basics.other.masterclass;

public class PostPreIncrement {
    public static void main(String[] args) {
        int v = 5;
        int p = 8;
        System.out.println("Post increment V "+ v++);
        System.out.println("Post decrement P "+ p--);
        System.out.println("Value of V after increment "+ v);
        System.out.println("Value of P after decrement "+ p);


        int u = 10;
        int t  = 14;
        System.out.println("Pre increment "+ ++u);
        System.out.println("Pre decrement "+ --t);
        System.out.println("Value of U after increment "+ u);
        System.out.println("Value of T after decrement "+ t);

        String name ="Taiye";
        System.out.println("Post increment for loop");
        for (int i = 0; i<name.length();i++){
            System.out.println(i);
        }

        System.out.println("Pre increment for loop");
        for (int i = 1; i<name.length();++i){
            System.out.println(i);
        }
    }
}
