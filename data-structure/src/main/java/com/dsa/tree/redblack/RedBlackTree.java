package com.dsa.tree.redblack;


class RedBlackTree {
    private Node root;

    public void insert(int data) {
        Node node = new Node(data);
        root = insertRecursive(root, node);
        fixViolations(node);
    }

    private Node insertRecursive(Node root, Node node) {
        if (root == null) return node;

        if (node.data < root.data) {
            root.left = insertRecursive(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = insertRecursive(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    private void fixViolations(Node node) {
        while (node != root && node.parent.isRed) {
            Node grandparent = node.parent.parent;
            if (node.parent == grandparent.left) {
                Node uncle = grandparent.right;
                if (uncle != null && uncle.isRed) {
                    grandparent.isRed = true;
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node = grandparent;
                } else {
                    if (node == node.parent.right) {
                        node = node.parent;
                        leftRotate(node);
                    }
                    node.parent.isRed = false;
                    grandparent.isRed = true;
                    rightRotate(grandparent);
                }
            } else {
                Node uncle = grandparent.left;
                if (uncle != null && uncle.isRed) {
                    grandparent.isRed = true;
                    node.parent.isRed = false;
                    uncle.isRed = false;
                    node = grandparent;
                } else {
                    if (node == node.parent.left) {
                        node = node.parent;
                        rightRotate(node);
                    }
                    node.parent.isRed = false;
                    grandparent.isRed = true;
                    leftRotate(grandparent);
                }
            }
        }
        root.isRed = false; // Root should always be black
    }

    private void leftRotate(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;
        if (rightChild.left != null) rightChild.left.parent = node;

        rightChild.parent = node.parent;
        if (node.parent == null) root = rightChild;
        else if (node == node.parent.left) node.parent.left = rightChild;
        else node.parent.right = rightChild;

        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rightRotate(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;
        if (leftChild.right != null) leftChild.right.parent = node;

        leftChild.parent = node.parent;
        if (node.parent == null) root = leftChild;
        else if (node == node.parent.right) node.parent.right = leftChild;
        else node.parent.left = leftChild;

        leftChild.right = node;
        node.parent = leftChild;
    }


}

