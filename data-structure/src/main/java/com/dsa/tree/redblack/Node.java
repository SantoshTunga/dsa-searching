package com.dsa.tree.redblack;

class Node {
    int data;
    Node parent;
    Node left;
    Node right;
    boolean isRed;

    public Node(int data) {
        this.data = data;
        isRed = true; // New nodes are red by default
        left = right = parent = null;
    }
}