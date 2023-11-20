//package com.taiye.ogunlade.java.ds.queue;
//
//public class QueueLinkedList<T extends Comparable<T>> {
//
//    private Node<T> firstNode;
//    private Node<T> lastNode;
//    private int count;
//
//    public QueueLinkedList() {
//
//    }
//
//    public boolean isEmpty() {
//        return this.firstNode == null;
//    }
//
//    public int size() {
//        return this.count;
//    }
//
//    //O(1)
//    public void enqueue(T newData) {
//        this.count++;
//        Node<T> oldLastNode = this.lastNode;
//        this.lastNode = new Node<>(newData);
//        this.lastNode.setNextNode(null);
//
//        if (isEmpty()) {
//            this.firstNode = new Node<>(newData);
//        } else {
//            oldLastNode.setNextNode(this.lastNode);
//        }
//    }
//
//    //0(1)
//    public T dequeue() {
//        this.count--;
//        T dataToDequeue = this.firstNode.getData();
//        this.firstNode = this.firstNode.getNextNode();
//        if(isEmpty()){
//            this.lastNode = null;
//        }
//        return dataToDequeue;
//    }
//
//    public void traverseLinkedList() {
//        if (this.firstNode == null) return;
//        Node<T> actualNode = this.firstNode;
//        while (actualNode!= null){
//            System.out.print(actualNode +"->");
//            actualNode = actualNode.getNextNode();
//        }
//    }
//
//}
