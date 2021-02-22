package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

import static org.milan.datastructure.tree.BinarySearchTree.EMPTY_TREE;

/**
 * Refer {@link @https://www.geeksforgeeks.org/find-level-maximum-sum-binary-tree/}
 *
 * @author Milan Rathod
 */
public class MaximumLevelSum {

    /**
     * Find maximum level sum of the binary tree
     *
     * @param root root of the tree
     * @return maximum level sum of the tree
     */
    public int find(Node<Integer> root) {

        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        int maxSum = 0;

        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            int count = queue.size();

            int currentSum = 0;

            while (count-- > 0) {
                Node<Integer> curr = queue.poll();

                currentSum += curr.key;

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
