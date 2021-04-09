package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Refer {@link @https://www.geeksforgeeks.org/difference-between-sums-of-odd-and-even-levels/}
 *
 * @author Milan Rathod
 */
public class OddEvenLevelSumDifference {

    /**
     * Recursive approach
     */
    public int get(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return 0;
        }

        return root.key - get(root.left) - get(root.right);
    }

    /**
     * Iterative approach
     */
    public int getV2(Node<Integer> root) {

        // Base condition
        if (root == null)
            return 0;

        // Queue used for level order traversal
        Queue<Node<Integer>> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int level = 0;

        int evenSum = 0, oddSum = 0;

        while (nodeQueue.size() != 0) {

            int size = nodeQueue.size();

            level++;

            // Traverse for complete level
            while (size > 0) {
                Node<Integer> temp = nodeQueue.remove();

                // Check if level is odd/even and accordingly update
                // the evenSum or oddSum
                if (level % 2 == 0)
                    evenSum += temp.key;
                else
                    oddSum += temp.key;

                // check for left child
                if (temp.left != null)
                    nodeQueue.add(temp.left);

                // check for right child
                if (temp.right != null)
                    nodeQueue.add(temp.right);

                size--;
            }
        }

        return (oddSum - evenSum);
    }
}
