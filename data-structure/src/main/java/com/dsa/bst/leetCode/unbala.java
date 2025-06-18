package com.dsa.bst.leetCode;

import com.dsa.tree.traversal.BtreeNode;

class BtreeHeightBalanceCheck {


    public boolean isBalanced(BtreeNode root) {

        if (root == null) {
            return true;
        }
        Boolean[] unbalanced = {false};

        int leftHeight = heightOfNode(root.getLeftNode(), unbalanced);
        int rightHeight = heightOfNode(root.getRightNode(), unbalanced);

        // System.out.println("recahed final leftHeight " + leftHeight + "unbalanced "+ unbalanced) ;
        // System.out.println("recahed final rightHeight " + rightHeight);
        return Math.abs(leftHeight - rightHeight) <= 1 && !unbalanced[0];

    }

    public int heightOfNode(BtreeNode root, Boolean[] unbalanced) {
        if (root == null || unbalanced[0]) {
            return 0;
        }


        int leftHeight = heightOfNode(root.getLeftNode(), unbalanced);

        int rightHeight = heightOfNode(root.getRightNode(), unbalanced);

        if (Math.abs(leftHeight - rightHeight) > 1) {

            unbalanced[0] = true;
            return 0;
        }

        return Math.max(leftHeight, rightHeight) + 1;


    }
}