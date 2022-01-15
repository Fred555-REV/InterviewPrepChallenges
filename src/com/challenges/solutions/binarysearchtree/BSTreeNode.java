package com.challenges.solutions.binarysearchtree;

public class BSTreeNode {
    private int value;
    private BSTreeNode left;
    private BSTreeNode right;

    public BSTreeNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BSTreeNode getLeft() {
        return left;
    }

    public BSTreeNode getRight() {
        return right;
    }

    public void setLeft(BSTreeNode left) {
        this.left = left;
    }

    public void setRight(BSTreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BSTreeNode{" +
                "\nvalue=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
