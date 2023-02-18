package com.taiye.ogunlade.basics.other.masterclass.tree.bst;

public class App {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();

        System.out.println();
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(15));


        System.out.println("Min data "+ intTree.min());

        System.out.println("Max data "+ intTree.max());


        intTree.traverseInOrder();
        System.out.println();

        intTree.reverseBinaryTree();

        System.out.println();
        intTree.traverseInOrder();


    }
}
