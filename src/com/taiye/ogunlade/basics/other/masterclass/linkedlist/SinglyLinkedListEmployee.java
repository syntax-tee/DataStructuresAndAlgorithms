//package com.taiye.ogunlade.basics.other.masterclass.linkedlist;
//
//public class SinglyLinkedListEmployee<T> {
//
//    private T data;
//    private Node head;
//    private int size;
//
//    public void insertToFront(T data) {
//      Node newNode = new Node(data);
//      newNode.setNext(head);
//      head = newNode;
//      size++;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public  Node removeFromFront(){
//        if(isEmpty()) return null;
//
//        Node removednode = head;
//        head = head.getNext();
//        size--;
//        removednode.setNext(null);
//        return  removednode;
//    }
//
//    public void printList(){
//        Node current = head;
//        System.out.print("Head ->");
//        while (current!= null){
//            System.out.print(current);
//            System.out.print(" -> ");
//            current = current.getNext();
//        }
//        System.out.print("null");
//    }
//
//   public  boolean isEmpty(){
//        return  head == null;
//    }
//}
