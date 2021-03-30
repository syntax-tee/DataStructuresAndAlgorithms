package com.taiye.ogunlade.linkedlist.newimpl;

public class DoublyNode<T> {

    private T data;
    private DoublyNode next;
    private DoublyNode prev;


    public DoublyNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  data.toString();
    }

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }
}
