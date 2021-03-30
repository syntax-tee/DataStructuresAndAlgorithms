package com.taiye.ogunlade.other.masterclass.queue;

import com.taiye.ogunlade.other.masterclass.linkedlist.Node;

public class QueueLinkedList<T> {

    Node<T> front, rear;
    private int count;


    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        Node temp = new Node(data);
        if (this.rear == null) {
         this.front = this.rear = temp;
         return;
        }
        this.rear.setNext(temp);
        this.rear = temp;
        count++;
    }

    public Node dequeue(){
        if(this.front == null){
            return null;
        }
        Node temp = this.front;
        this.front = this.front.getNext();

        if(this.front == null){
            this.rear = null;
        }
        count--;
        return temp;
    }

    public void printList() {
        Node current = front;
        System.out.print("Head ->");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public int size() {
        return this.count;
    }

    public static void main(String[] args) {
        QueueLinkedList<Integer>  myQueue = new QueueLinkedList<>();
        myQueue.enqueue(10);
        myQueue.enqueue(100);
        myQueue.enqueue(1000);

        System.out.println(myQueue.size());

        System.out.println(" Deuqe "+myQueue.dequeue());
        System.out.println(myQueue.size());

        myQueue.printList();
    }
}
