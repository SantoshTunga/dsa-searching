package com.dsa.tree.traversal;

public class BtreeTestMain {
    public static void main(String[] args) {

        Integer [] values = {10,20,30,40,50};
        // var node = new BinarySearchTree();
        var node =  Btree.insertBSTBySortedArray( values,0,4);

        Btree.printBtree(node);
        Btree.inOrderTraversal(node);
    }
}
