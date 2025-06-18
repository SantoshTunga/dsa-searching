package com.dsa.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BtreePostOrderTraversal {


    public void postOrderTraverSalTest() {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        BtreeNode root = createBTreeFromSortedArray(arr, 0, 6);
        Queue<BtreeNode> queue = new LinkedList<>();

        System.out.println(" Btree Root value" + root.getValue());
        queue.add(root);
        postOrderTraverSal(queue);

    }

    public void postOrderTraverSal(Queue<BtreeNode> queue) {

        while (!queue.isEmpty()) {

            BtreeNode root = queue.poll();
            System.out.println(" queue value" + root.getValue());

            if (root.getLeftNode() != null) {
                queue.add(root.getLeftNode());
            }
            if (root.getRightNode() != null) {
                queue.add(root.getRightNode());
            }

        }

    }

    public static BtreeNode createBTreeFromSortedArray(int[] arr, int l, int h) {

        /** need to change it tow while loop and  we need a queue **/

        if (l > h) {
            return null;
        }

        int mid = (l + h) / 2;
        BtreeNode root = new BtreeNode(arr[mid]);
        System.out.println(" createBTreeFromSortedArray  Root value" + root.getValue());
        root.setLeftNode(createBTreeFromSortedArray(arr, l, mid - 1));
        root.setRightNode(createBTreeFromSortedArray(arr, mid + 1, h));
        return root;

    }

}
