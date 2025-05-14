package com.dsa.bst;


public class Main {
    public static void main(String[] args) {

        Integer [] values = {10,20,30,40,50};
       // var node = new BinarySearchTree();
        var node =  BinarySearchTree.insertBSTBySortedArray( values,0,4);

        BinarySearchTree.printBtree(node);

    }
}