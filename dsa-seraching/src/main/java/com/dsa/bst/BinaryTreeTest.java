package com.dsa.bst;

public class BinaryTreeTest {

    public static BinarySearchTree insertBySortedArray(Integer[] values, int l, int h) {

        if (l > h) {
            return null;
        }

        int mid = (l + h) / 2;

        BinarySearchTree teeNode = new BinarySearchTree(values[mid]);

        teeNode.leftNode = insertBySortedArray(values, l, mid - 1);

        teeNode.rightNode = insertBySortedArray(values, mid + 1, h);

        return teeNode;
    }
}
