package com.taiye.ogunlade.basics.stack;

import com.taiye.ogunlade.basics.linkedlist.Node;

public class StackLinkedList<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    //O(1)
    public void push(T newData) {
         this.count++;
        if (this.root == null) {
            this.root = new Node<>(newData);
        } else {
            Node oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }

    //O(1)
    public int size() {
        return this.count;
    }

    //O(1)
    public boolean isEmpty() {
        return this.root == null;
    }

    //O(1)
    public T pop() {
        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return itemToPop;
    }

    //0(1)
    public T peek() {
        return this.root.getData();
    }
}
