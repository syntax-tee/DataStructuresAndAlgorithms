package com.taiye.ogunlade.java.ds.linkedlist.singly;

import com.taiye.ogunlade.java.ds.linkedlist.singly.impl.MyNode;

public class SinglyLinkedList<E> {
    private MyNode<E> head = null;
    private MyNode<E> tail = null;
    private int size = 0;

    public MyNode<E> getHead() {
        return head;
    }

    public MyNode<E> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new MyNode<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e) {
        MyNode<E> newest = new MyNode<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
