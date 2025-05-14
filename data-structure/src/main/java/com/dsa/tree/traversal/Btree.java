package com.dsa.tree.traversal;

import java.util.Stack;

public class Btree {

    Btree leftNode;
    Btree rightNode;
    Integer value;

    Btree() {

    }

    Btree(Integer value) {
        this.value = value;
    }
    public static Btree insertBSTBySortedArray(Integer[] values, int l, int h) {

        if (l > h) {
            return null;
        }

        int mid = (h+l)/2; // l+((h-l+1)/2) shift right to make balance

        System.out.println("Root "+ values[mid]);
        Btree teeNode = new Btree(values[mid]);

        teeNode.leftNode = insertBSTBySortedArray(values, l, mid - 1);

        teeNode.rightNode = insertBSTBySortedArray(values, mid + 1, h);

        return teeNode;
    }

  /** Btree print follows the Traversal order, in this case it is In-order Tra **/
    public static void printBtree(Btree node) {
        if (node == null) {
            return;
        }
        System.out.println(" recursive  inOrderTraversal");
        printBtree(node.leftNode);
        System.out.println("value " + node.value);
        printBtree(node.rightNode);
    }

    /** iterative approach **/
    public static void inOrderTraversal(Btree node) {
        if (node == null) {
            return;
        }
        System.out.println("iterative inOrderTraversal");
        Stack<Btree> stack = new Stack<>();

        while ( node !=null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.leftNode;
            }
            node = stack.pop();
            System.out.println("value " + node.value);
            node = node.rightNode;
        }

    }
}
