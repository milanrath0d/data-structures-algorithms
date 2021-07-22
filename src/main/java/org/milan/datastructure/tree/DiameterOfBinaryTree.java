package org.milan.datastructure.tree;

/**
 * Refer {@link @https://leetcode.com/problems/diameter-of-binary-tree/}
 *
 * @author Milan Rathod
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        Result result = new Result();
        height(root, result);
        return result.output;
    }

    private int height(Node<Integer> root, Result result) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left, result);
        int rightHeight = height(root.right, result);

        result.output = Math.max(result.output, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    private static class Result {
        int output = Integer.MIN_VALUE;
    }
}
