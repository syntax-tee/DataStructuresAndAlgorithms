package com.taiye.ogunlade.java.kunal.array.linkedlist.singly.impl;

public class MyNode<E> {

    private E element;
    private MyNode<E> next;


    public MyNode(E element, MyNode<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
