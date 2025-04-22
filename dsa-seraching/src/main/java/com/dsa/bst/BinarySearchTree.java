package com.dsa.bst;

public class BinarySearchTree {

    BinarySearchTree leftNode;
    BinarySearchTree rightNode;
    Integer value;

    BinarySearchTree() {

    }

    BinarySearchTree(Integer value) {
        this.value = value;
    }


    public static void printBtree(BinarySearchTree node) {
        if (node == null) {
            return;
        }

        printBtree(node.leftNode);
        System.out.println("value " + node.value);
        printBtree(node.rightNode);
    }

    public static BinarySearchTree insertBST(Integer[] values, int l, int h) {

        if (l > h) {
            return null;
        }

        int mid = (l + h) / 2;

        BinarySearchTree teeNode = new BinarySearchTree(values[mid]);

        teeNode.leftNode = insertBST(values, l, mid - 1);

        teeNode.rightNode = insertBST(values, mid + 1, h);

        return teeNode;
    }

}
