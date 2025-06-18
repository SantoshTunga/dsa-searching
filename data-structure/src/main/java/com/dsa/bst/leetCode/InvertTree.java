package com.dsa.bst.leetCode;

import com.dsa.tree.traversal.BtreeNode;

public class InvertTree {

    public BtreeNode invertTree(BtreeNode root) {

        if (root == null) {
            return null;
        }

        BtreeNode temp = root.getLeftNode();
        root.setLeftNode(invertTree(root.getRightNode()));
        root.setRightNode(invertTree(temp));


        return root;

    }
}

