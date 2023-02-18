package com.taiye.ogunlade.basics.linkedlist.newimpl;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        System.out.println(employeeLinkedList.isEmpty());
        employeeLinkedList.addToFront(new Employee("Taiye", "Emma", 1));
        employeeLinkedList.addToFront(new Employee("Kenny", "Samuel", 1));
        employeeLinkedList.addToFront(new Employee("Victoria", "Samuel", 1));
        employeeLinkedList.printList();
        employeeLinkedList.removeFromFront();
        employeeLinkedList.printList();
        System.out.println("middle node "+employeeLinkedList.getMiddleNode());
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.reverse();
        employeeLinkedList.printList();


        DoublyEmployeeLinkedList doublyEmployeeLinkedList = new DoublyEmployeeLinkedList();
        System.out.println(doublyEmployeeLinkedList.isEmpty());
        doublyEmployeeLinkedList.addToFront(new Employee("Taiye", "Emma", 1));
        doublyEmployeeLinkedList.addToFront(new Employee("Kenny", "Samuel", 1));
        doublyEmployeeLinkedList.addToFront(new Employee("Victoria", "Samuel", 1));
        doublyEmployeeLinkedList.printList();
        doublyEmployeeLinkedList.removeFront();
        doublyEmployeeLinkedList.printList();
        System.out.println(doublyEmployeeLinkedList.getSize());
    }
}
