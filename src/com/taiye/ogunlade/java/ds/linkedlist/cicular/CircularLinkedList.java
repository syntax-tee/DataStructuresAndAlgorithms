package com.taiye.ogunlade.java.ds.linkedlist.cicular;


import com.taiye.ogunlade.java.ds.linkedlist.singly.impl.MyNode;

public class CircularLinkedList<E> {

    private MyNode<E> tail = null;

    public MyNode<E> getTail() {
        return tail;
    }

    private int size = 0;

    public CircularLinkedList() {

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public E first() {
        if (isEmpty()) return null;
        return tail.getElement();
    }


    public void rotate() {
        if (tail != null)
            tail = tail.getNext();
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new MyNode<>(e, null);
            tail.setNext(tail);
        } else {
            MyNode<E> newest = new MyNode<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        MyNode<E> head = tail.getNext();
        if (head == tail) tail = null;
        else
            tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }
}
