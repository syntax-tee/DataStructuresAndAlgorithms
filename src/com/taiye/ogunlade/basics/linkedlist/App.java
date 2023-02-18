package com.taiye.ogunlade.basics.linkedlist;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.insert(3);
        list.insert(6);
        list.insert(5);
        System.out.println("Size of Array " + list.size());
        list.remove(3);
        list.traverseList();
        System.out.println("Size of Array " + list.size());

        List<Person>  persons = new LinkedList<Person>();
        persons.insert(new Person("Emmanuel",24));
        persons.insert(new Person("Samuel",27));
        persons.traverseList();
    }
}
