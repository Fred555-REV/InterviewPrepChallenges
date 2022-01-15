package com.challenges.solutions.binarysearchtree;

public class BinaryTree {
    private BSTreeNode root;

    public BinaryTree() {
    }

    public BSTreeNode getRoot() {
        return root;
    }

    public BSTreeNode addNode(int value) {
        if (root == null) {
            root = new BSTreeNode(value);
            ;
            return root;
        }
        if (value > root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(new BSTreeNode(value));
                return root.getLeft();
            } else {
                return addNode(root.getLeft(), value);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new BSTreeNode(value)); // WHOOPS
                return root.getRight();
            } else {
                return addNode(root.getRight(), value);
            }
        }
//        System.out.println(node);
    }

    public BSTreeNode addNode(BSTreeNode current, int value) {
        if (value > current.getValue()) {
            if (current.getLeft() != null) {
                addNode(current.getLeft(), value);
            } else {
                current.setLeft(new BSTreeNode(value));
                return current.getLeft();
            }
        } else {
            if (current.getRight() != null) {
                addNode(current.getRight(), value);
            } else {
                current.setRight(new BSTreeNode(value));
                return current.getRight();
            }
        }
        return null;
    }

    public Boolean searchNode(BSTreeNode current, int value) {
        if (value == current.getValue()) {
            return true;
        }
        if (value > current.getValue()) {
            if (current.getLeft() != null) {
                searchNode(current.getLeft(), value);
            }
        }
        if(value < current.getValue()){
            if (current.getRight() != null) {
                searchNode(current.getRight(), value);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
