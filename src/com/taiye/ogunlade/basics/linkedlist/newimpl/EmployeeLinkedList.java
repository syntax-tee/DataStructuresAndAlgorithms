//package com.taiye.ogunlade.basics.linkedlist.newimpl;
//
//public class EmployeeLinkedList {
//    private Node head;
//    private int size;
//
//
//    public void addToFront(Employee employee) {
//        Node node = new Node(employee);
//        node.setNext(head);
//        head = node;
//        size++;
//    }
//
//    public Node removeFromFront() {
//        if (isEmpty()) return null;
//        Node removeNode = head;
//        head = head.getNext();
//        size--;
//        removeNode.setNext(null);
//        return removeNode;
//    }
//
//    public void printList() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current);
//            current = current.getNext();
//        }
//        System.out.println("null");
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public  Node getMiddleNode(){
//        Node fastPointer = this.head;
//        Node slowPointer = this.head;
//
//        while (fastPointer.getNext()!= null && fastPointer.getNext().getNext()!= null){
//            fastPointer = fastPointer.getNext().getNext();
//            slowPointer = slowPointer.getNext();
//        }
//
//        return slowPointer;
//    }
//
//    public void reverse(){
//        Node currentNode = this.head;
//        Node previousNode = null;
//        Node nextNode = null;
//
//        while (currentNode!= null){
//            nextNode = currentNode.getNext();
//            currentNode.setNext(previousNode);
//            previousNode =currentNode;
//            currentNode = nextNode;
//        }
//        this.head = previousNode;
//    }
//}
