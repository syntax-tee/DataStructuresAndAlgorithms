package com.taiye.ogunlade.queue;

public class App {

    public static void main(String[] args) {
        QueueLinkedList<Integer>  myQueue = new QueueLinkedList<>();
        myQueue.enqueue(10);
        myQueue.enqueue(100);
        myQueue.enqueue(1000);

        System.out.println(myQueue.size());

        System.out.println(" Deuqe "+myQueue.dequeue());
        System.out.println(myQueue.size());

        myQueue.traverseLinkedList();
    }
}
