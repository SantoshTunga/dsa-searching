package com.dsa.tree.traversal;

import java.util.Stack;

public class BtreeInOrderTraversal {


    public static BtreeNode insertBSTBySortedArray(Integer[] values, int l, int h) {

        if (l > h) {
            return null;
        }

        int mid = (h + l) / 2; // l+((h-l+1)/2) shift right to make balance

        System.out.println("Root " + values[mid]);
        BtreeNode teeNode = new BtreeNode(values[mid]);

        teeNode.setLeftNode(insertBSTBySortedArray(values, l, mid - 1));

        teeNode.setRightNode(insertBSTBySortedArray(values, mid + 1, h));

        return teeNode;
    }

    /**
     * BtreeNode print follows the Traversal order, in this case it is In-order Tra
     **/
    public static void printBtreeNode(BtreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(" recursive  inOrderTraversal");
        printBtreeNode(node.getLeftNode());
        System.out.println("value " + node.getValue());
        printBtreeNode(node.getRightNode());
    }

    /**
     * iterative approach
     **/
    public static void inOrderTraversal(BtreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println("iterative inOrderTraversal");
        Stack<BtreeNode> stack = new Stack<>();

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeftNode();
            }
            node = stack.pop();
            System.out.println("value " + node.getValue());
            node = node.getRightNode();
        }

    }
}
