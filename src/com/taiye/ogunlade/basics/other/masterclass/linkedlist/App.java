package com.taiye.ogunlade.basics.other.masterclass.linkedlist;

public class App {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);


//        SinglyLinkedListEmployee list = new SinglyLinkedListEmployee();
//        System.out.println("is empty "+ list.isEmpty());
//        list.insertToFront(janeJones);
//        list.insertToFront(johnDoe);
//        list.insertToFront(marySmith);
//        list.insertToFront(mikeWilson);
//        list.printList();
//        System.out.println();
//        System.out.println("List size "+list.getSize());
//        System.out.println("Is empty "+ list.isEmpty());
//        list.removeFromFront();
//        list.printList();


        DoublyLinkedListEmployee dlist = new DoublyLinkedListEmployee();
        System.out.println("is empty "+ dlist.isEmpty());
        dlist.insertToFront(janeJones);
        dlist.insertToFront(johnDoe);
        dlist.insertToFront(marySmith);
        dlist.insertToFront(mikeWilson);
        dlist.printList();
        System.out.println();
        System.out.println("List size "+dlist.getSize());
        System.out.println("Is empty "+ dlist.isEmpty());
        dlist.printList();



    }
}
