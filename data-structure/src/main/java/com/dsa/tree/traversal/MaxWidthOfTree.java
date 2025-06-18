package com.dsa.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {

    public void getMaxWidthOfTree(BtreeNode root, Queue<BtreeNode> nodeQueue, int levelSize) {

        if (!nodeQueue.isEmpty()) {
            int currentCount = 0;
            BtreeNode current = nodeQueue.poll();

            if (current.getLeftNode() != null) {
                nodeQueue.add(current.getLeftNode());
            }
            
            if (current.getRightNode() != null) {
                nodeQueue.add(current.getLeftNode());
            }

        }

    }

    public void getMaxWidthTest() {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        BtreeNode root = BtreePostOrderTraversal.createBTreeFromSortedArray(arr, 0, 6);
        Queue<BtreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int levelSize = 1;
    }
}
