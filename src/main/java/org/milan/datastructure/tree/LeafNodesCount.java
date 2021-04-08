package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Milan Rathod
 */
public class LeafNodesCount {

    /**
     * Get number of leaves in given binary tree
     * Recursive approach
     *
     * @param root root of the tree
     * @return total leaves in tree
     */
    public int getTotalLeafNodes(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return getTotalLeafNodes(root.left) + getTotalLeafNodes(root.right);
        }
    }

    /**
     * Get number of leaves in given binary tree
     * Iterative approach
     *
     * @param root root of the tree
     * @return total leaves in tree
     */
    public int getTotalLeafNodesIterative(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return 0;
        }

        int totalLeafNodes = 0;

        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            Node<Integer> curr = queue.poll();

            if (curr.left == null && curr.right == null) {
                totalLeafNodes++;
            }

            if (curr.left != null) queue.offer(curr.left);

            if (curr.right != null) queue.offer(curr.right);
        }

        return totalLeafNodes;
    }

}
