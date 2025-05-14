package com.dsa.bst;

public class BinaryTreeTest {

    public static BinarySearchTree deleteNode(BinarySearchTree root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.value) {
            root.leftNode = deleteNode(root.leftNode, key);
        } else if (key > root.value) {
            root.rightNode = deleteNode(root.leftNode, key);
        } else {
            // one child or No child
            if (root.leftNode == null) {
                return root.rightNode;
            } else if (root.rightNode == null) {
                return root.leftNode;
            }
            // both the children
            root.value = getMinRightNodeValue( root.rightNode);
            root.rightNode = deleteNode(root.rightNode,  root.value);

        }

        return root;
    }

    public static Integer getMinRightNodeValue(BinarySearchTree root )
    {

        return root.value;
    }
}
