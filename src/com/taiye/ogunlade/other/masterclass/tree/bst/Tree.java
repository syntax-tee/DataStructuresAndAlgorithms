package com.taiye.ogunlade.other.masterclass.tree.bst;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            if (value < subtreeRoot.getData()) {
                return subtreeRoot.getLeftChild();
            }
        }
        return subtreeRoot;
    }


    public int min() {
        if (root != null) {
            return root.min();
        }
        return -1;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return -1;
    }

    public void reverseBinaryTree(){
        root.reverseBinaryTree(root);
    }

}
