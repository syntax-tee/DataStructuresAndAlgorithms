package com.taiye.ogunlade.java.dsa.array.linkedlist.doubly;

public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList(Node<E> header, Node<E> trailer) {
        this.header = new Node<>(null, null, null);
        this.trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public Node<E> getHeader() {
        return header;
    }

    public void setHeader(Node<E> header) {
        this.header = header;
    }

    public Node<E> getTrailer() {
        return trailer;
    }

    public void setTrailer(Node<E> trailer) {
        this.trailer = trailer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E last() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public  E first(){
        if(isEmpty()) return null;
        return header.getNext().getElement();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
