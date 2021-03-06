package com.taiye.ogunlade.other.deepdive.stack;

interface  StackInterface<X> {

    void push(X newItem);

    X pop();

    boolean contains(X item);

    X access(X item);

    int size();
}
