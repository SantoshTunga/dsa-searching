package com.dsa.tree.traversal;

public class BtreeNode {

    private int value;
    private BtreeNode leftNode;
    private BtreeNode rightNode;

    BtreeNode() {

    }

    BtreeNode(int value) {
        this.value = value;
    }

    BtreeNode(int value, BtreeNode leftNode, BtreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BtreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BtreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BtreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BtreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
