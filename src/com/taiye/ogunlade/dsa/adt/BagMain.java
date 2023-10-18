package com.taiye.ogunlade.dsa.adt;

public class BagMain {
    public static void main(String[] args) {
        //instances of wrapper type
        Integer numCount = new Integer(10);
        C ckay = new C();
        BagInterface<C> aBag = new ArrayBag();
        aBag.add(ckay);

    }

    static class C {

    }
}
