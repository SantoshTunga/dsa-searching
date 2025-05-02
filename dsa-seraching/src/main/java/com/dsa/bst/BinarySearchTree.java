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

  /** Btree print follows the Traversal order, in this case it is In-order Tra **/
    public static void printBtree(BinarySearchTree node) {
        if (node == null) {
            return;
        }

        printBtree(node.leftNode);
        System.out.println("value " + node.value);
        printBtree(node.rightNode);
    }

    public static BinarySearchTree insertBSTBySortedArray(Integer[] values, int l, int h) {

        if (l > h) {
            return null;
        }

        int mid = (h+l)/2; // l+((h-l+1)/2) shift right to make balance

        System.out.println("Root "+ values[mid]);
        BinarySearchTree teeNode = new BinarySearchTree(values[mid]);

        teeNode.leftNode = insertBSTBySortedArray(values, l, mid - 1);

        teeNode.rightNode = insertBSTBySortedArray(values, mid + 1, h);

        return teeNode;
    }

    /**
     * recursive  approach
     **/
    public static BinarySearchTree insertBSTByElement(BinarySearchTree treeNode, int x) {


        if (treeNode == null) {
            treeNode = new BinarySearchTree(x);
        } else if (treeNode.value > x) {
            treeNode.leftNode = insertBSTByElement(treeNode, x);
        } else if (treeNode.value < x) {
            treeNode.rightNode = insertBSTByElement(treeNode, x);
        }

        return treeNode;
    }

    /**
     * iterative  approach, two node already present
     **/
    public static void insertBSTByElementIterative(BinarySearchTree treeNode, int x) {


        while (treeNode != null) {
            if (treeNode.value > x) {
                if (treeNode.leftNode == null) {
                    treeNode.leftNode = new BinarySearchTree(x);
                    return;
                } else {
                    treeNode = treeNode.leftNode;
                }
            } else if (treeNode.value < x) {
                if (treeNode.rightNode == null) {
                    treeNode.rightNode = new BinarySearchTree(x);
                    return;
                } else {
                    treeNode = treeNode.rightNode;
                }
            } else {
                return;
            }


        }


    }

    public static BinarySearchTree deleteTreeNode(BinarySearchTree root, int value) {
        if (root == null) {
            return null;
        }

        if (root.value < value) {
            root.leftNode = deleteTreeNode(root.leftNode, value);
        } else if (root.value > value) {
            root.rightNode = deleteTreeNode(root.rightNode, value);
        } else {

            if (root.leftNode == null) {
                return root.rightNode;
            } else if (root.rightNode == null) {
                return root.leftNode;
            }

            // two children

            root.value = findRightMin(root.rightNode);
            root.rightNode = deleteTreeNode(root.rightNode, root.value);
        }


        return root;
    }


    public static Integer findRightMin(BinarySearchTree root) {
        while (root.leftNode != null) {
            root = root.leftNode;
        }

        return root.value;

    }

}
