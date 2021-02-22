package org.milan.datastructure.tree;

import java.util.Stack;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/zigzag-tree-traversal/}
 *
 * @author Milan Rathod
 */
public class ZigZagTraversal {

    /**
     * Return Zig zag tree traversal
     *
     * @param root root of the tree
     * @return zig zag order
     */
    public String traverse(Node<Integer> root) {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        StringBuilder stringBuilder = new StringBuilder();

        Stack<Node<Integer>> currentLevel = new Stack<>();
        Stack<Node<Integer>> nextLevel = new Stack<>();

        boolean leftToRight = true;
        currentLevel.push(root);

        while (!currentLevel.isEmpty()) {
            Node<Integer> current = currentLevel.pop();

            stringBuilder.append(current.key);
            stringBuilder.append(" ");

            if (leftToRight) {
                if (current.left != null) {
                    nextLevel.push(current.left);
                }

                if (current.right != null) {
                    nextLevel.push(current.right);
                }
            } else {
                if (current.right != null) {
                    nextLevel.push(current.right);
                }

                if (current.left != null) {
                    nextLevel.push(current.left);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node<Integer>> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }

        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}