package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Converts binary tree to its mirror view
 * <p>
 * Also check if two trees are mirror of each other
 *
 * @author Milan Rathod
 */
public class MirrorTree {

    /**
     * Get Mirror Tree of a tree - Recursive approach
     *
     * @param root root of a tree
     * @return root of a mirror tree
     */
    public Node<Integer> mirrorTree(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return null;
        }

        // Mirror of left sub tree
        mirrorTree(root.left);

        // Mirror of right sub tree
        mirrorTree(root.right);

        // Swap left and right children
        Node<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    /**
     * Get Mirror Tree of a tree - Iterative approach
     *
     * @param root root of a tree
     */
    public void mirrorTreeIterative(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.add(root);

        // Do BFS. While doing BFS, keep swapping left and right children
        while (!queue.isEmpty()) {

            // Pop top node from queue
            Node<Integer> current = queue.poll();

            Node<Integer> temp = current.left;
            current.left = current.right;
            current.right = temp;

            // Push left and right children
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    /**
     * @param src    root of source tree
     * @param target root of target tree
     * @return true if both trees are mirror of each other otherwise false
     */
    public boolean isMirror(Node<Integer> src, Node<Integer> target) {
        // Both the nodes are empty
        if (src == null && target == null) {
            return true;
        }

        // If only one is empty
        if (src == null || target == null) {
            return false;
        }

        // Both the nodes are non-empty
        return (src.key.equals(target.key)
                && isMirror(src.left, target.right)
                && isMirror(src.right, target.left));
    }

}
