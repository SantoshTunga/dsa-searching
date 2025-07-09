package com.dsa.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BtreeLevelOrderTraversal {


    public static void levelOrderTraversal() {

        Integer[] treeArr = {10, 20, 30, 40, 50, 60, 70};
        BtreeNode root = BtreeInOrderTraversal.insertBSTBySortedArray(treeArr, 0, treeArr.length - 1);
        Queue<BtreeNode> queueNode = new LinkedList<>();
        queueNode.add(root);

        while (!queueNode.isEmpty()) {
            BtreeNode node = queueNode.poll();
            System.out.println("node vale" + node.getValue());

            if (node.getLeftNode() != null) {
                queueNode.add(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                queueNode.add(node.getRightNode());
            }

        }

    }

    public static int maxWidthOfTree() {
        Integer[] treeArr = {10, 20, 30, 40, 50, 60, 70};
        BtreeNode root = BtreeInOrderTraversal.insertBSTBySortedArray(treeArr, 0, treeArr.length - 1);
        Queue<BtreeNode> queueNode = new LinkedList<>();
        queueNode.add(root);
        // if root is null or empty return zero
        int maxSize = 1;

        while (!queueNode.isEmpty()) {
            maxSize = queueNode.size();
            for (int i = 0; i < maxSize; i++) {
                BtreeNode btreeNode = queueNode.poll();
                if (btreeNode.getLeftNode() != null) {
                    queueNode.add(btreeNode.getLeftNode());
                }
                if (btreeNode.getRightNode() != null) {
                    queueNode.add(btreeNode.getRightNode());
                }
            }
            maxSize = Math.max(maxSize, queueNode.size());

        }
        return maxSize;
    }
}
