package org.milan.datastructure.tree;

import java.util.List;

/**
 * @author Milan Rathod
 */
public class MinMaxInBinaryTree {

    private int maxElement;

    private int minElement;

    public MinMaxInBinaryTree() {
        maxElement = Integer.MIN_VALUE;
        minElement = Integer.MAX_VALUE;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public int getMinElement() {
        return minElement;
    }

    public void compute(Node<Integer> root) {

        // Base condition
        if (root == null)
            return;

        Node<Integer> current = root;
        while (current != null) {
            if (current.left == null) {
                maxElement = Math.max(maxElement, current.key);
                minElement = Math.min(minElement, current.key);
                current = current.right;
            } else {
                // Find the inorder predecessor of current
                Node<Integer> predecessor = current.left;

                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                // Make current as right child of its inorder predecessor
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    // Revert the changes made in the 'if' part
                    // to restore the original tree
                    // i.e. fix the right child of predecessor
                    predecessor.right = null;
                    maxElement = Math.max(maxElement, current.key);
                    minElement = Math.min(minElement, current.key);
                    current = current.right;
                }

            }
        }
    }

}
