package com.dsa.tree.traversal;

public class BtreeTestMain {
    public static void main(String[] args) {

        // Integer[] values = {10, 20, 30, 40, 50};
        // var node = new BinarySearchTree();
        // BtreeNode node = BtreeInOrderTraversal.insertBSTBySortedArray(values, 0, 4);

        //  BtreeInOrderTraversal.printBtreeNode(node);
        //  BtreeInOrderTraversal.inOrderTraversal(node);

        // BtreePostOrderTraversal btreePostOrderTraversal = new BtreePostOrderTraversal();
        // btreePostOrderTraversal.postOrderTraverSalTest();

        System.out.println(" Max width of the Tree is " + BtreeLevelOrderTraversal.maxWidthOfTree());
    }
}
