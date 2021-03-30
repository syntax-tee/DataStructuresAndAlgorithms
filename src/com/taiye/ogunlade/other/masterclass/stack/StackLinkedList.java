package com.taiye.ogunlade.other.masterclass.stack;

import com.taiye.ogunlade.other.masterclass.linkedlist.Node;

public class StackLinkedList<T> {

    private Node<T> first;
    private  int count;

    public void push(T data) {
        Node newNode = new Node(data);
        newNode.setNext(first);
        first = newNode;
        count++;
    }

    public void pop(){
        Node temp = first;
        first = first.getNext();
        count--;
        System.out.println();
        System.out.println("Deleted item from stack "+temp.getData());
    }

    //O(1)
    public int size() {
        return this.count;
    }

    //O(1)
    public boolean isEmpty() {
        return first == null;
    }


    //0(1)
    public T peek() {
        return this.first.getData();
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(2);
        stackLinkedList.push("Taiye");
        stackLinkedList.push("Bro Bush");
        System.out.println("Size "+ stackLinkedList.size());
        stackLinkedList.printList();
        stackLinkedList.pop();
        stackLinkedList.printList();
        System.out.println("Size "+ stackLinkedList.size());
    }

    public void printList(){
        Node current = first;
        System.out.print("Head ->");
        while (current!= null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
