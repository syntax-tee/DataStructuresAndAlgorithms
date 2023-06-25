package com.taiye.ogunlade.java.linkedlist.singly.impl;

public class MySinglyLinkedList<E> {
    private MyNode<E> head;

    private MyNode<E> tail;

    int size = 0;

    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new MyNode<>(element, head);
        if (size == 0)
            tail = head;
        size++;
    }


    public void addLast(E element) {
        MyNode<E> newest = new MyNode<>(element, null);
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

    public boolean isEmpty() {
        return size == 0;
    }

    public MyNode<E> getHead() {
        return head;
    }

    public MyNode<E> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MySinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
