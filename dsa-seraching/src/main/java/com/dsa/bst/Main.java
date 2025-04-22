package com.dsa.bst;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer [] values = {10,20,30,40,50};
        //var node = new BinarySearchTree();
        BinarySearchTree node = BinarySearchTree.insertBST(  values,0,(values.length-1));
        BinarySearchTree.printBtree(node);

    }
}