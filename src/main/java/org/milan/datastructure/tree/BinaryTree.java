package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * Binary Tree with basic operations
 *
 * @author Milan Rathod
 */
public class BinaryTree<T extends Comparable<T>> {

    /**
     * root of the binary tree
     */
    private final Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootKey) {
        this.root = new Node<>(rootKey);
    }

    public Node<T> getRoot() {
        return root;
    }

    /**
     * Find Maximum element in given tree
     *
     * @param root root of the tree
     * @return maximum node key
     */
    public T findMaximumElement(Node<T> root) {
        if (root == null) {
            return null;
        }

        T max = root.key;

        T leftMax = findMaximumElement(root.left);
        T rightMax = findMaximumElement(root.right);

        if (leftMax != null && leftMax.compareTo(max) > 0) {
            max = leftMax;
        }

        if (rightMax != null && rightMax.compareTo(max) > 0) {
            max = rightMax;
        }

        return max;
    }

    /**
     * Find Maximum element in given tree iterative approach
     *
     * @param root root of the tree
     * @return maximum node key
     */
    public T findMaximumElementIterative(Node<T> root) {
        // Base condition
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Queue<Node<T>> queue = new LinkedList<>();

        Node<T> temp = root;

        queue.offer(temp);

        T maxElement = temp.key;

        while (!queue.isEmpty()) {

            temp = queue.poll();

            if (temp.key.compareTo(maxElement) > 0) {
                maxElement = temp.key;
            }

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return maxElement;
    }

    /**
     * Find Minimum element in given tree
     *
     * @param root root of the tree
     * @return minimum node key
     */
    public T findMinimumElement(Node<T> root) {
        if (root == null) {
            return null;
        }

        T min = root.key;
        T leftMin = findMinimumElement(root.left);
        T rightMin = findMinimumElement(root.right);

        if (leftMin != null && leftMin.compareTo(min) < 0) {
            min = leftMin;
        }

        if (rightMin != null && rightMin.compareTo(min) < 0) {
            min = rightMin;
        }

        return min;
    }

    /**
     * check if node with given key is present in tree
     *
     * @param root root of the tree
     * @param key  node key
     * @return true if present otherwise false
     */
    public boolean isPresent(Node<T> root, int key) {
        // Base condition
        if (root == null) {
            return false;
        }

        if (root.key.equals(key)) {
            return true;
        }
        return isPresent(root.left, key) || isPresent(root.right, key);
    }

    /**
     * check if node with given key is present in tree iterative approach
     *
     * @param root root of the tree
     * @param key  node key
     * @return true if present otherwise false
     */
    public boolean isPresentIterative(Node<T> root, int key) {
        // Base condition
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Queue<Node<T>> queue = new LinkedList<>();

        Node<T> temp = root;

        queue.offer(temp);

        while (!queue.isEmpty()) {

            temp = queue.poll();

            if (temp.key.equals(key)) {
                return true;
            }

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return false;
    }

    /**
     * Get Mirror Tree of a tree - Recursive approach
     *
     * @param root root of a tree
     * @return root of a mirror tree
     */
    public Node<T> mirrorTree(Node<T> root) {

        // Base condition
        if (root == null) {
            return null;
        }

        // Mirror of left sub tree
        mirrorTree(root.left);

        // Mirror of right sub tree
        mirrorTree(root.right);

        // Swap left and right children
        Node<T> temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    /**
     * Get Mirror Tree of a tree - Iterative approach
     *
     * @param root root of a tree
     */
    public void mirrorTreeIterative(Node<T> root) {

        // Base condition
        if (root == null) {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();

        queue.add(root);

        // Do BFS. While doing BFS, keep swapping left and right children
        while (!queue.isEmpty()) {

            // Pop top node from queue
            Node<T> current = queue.poll();

            Node<T> temp = current.left;
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
     * @return true if identical otherwise false
     */
    public boolean isIdentical(Node<T> src, Node<T> target) {
        // Both the nodes are empty
        if (src == null && target == null) {
            return true;
        }

        // If only one is empty
        if (src == null || target == null) {
            return false;
        }

        // Both the nodes are non-empty
        return (src.key == target.key
                && isIdentical(src.left, target.left)
                && isIdentical(src.right, target.right));
    }

    /**
     * @param src    root of source tree
     * @param target root of target tree
     * @return true if both trees are mirror of each other otherwise false
     */
    public boolean isMirror(Node<T> src, Node<T> target) {
        // Both the nodes are empty
        if (src == null && target == null) {
            return true;
        }

        // If only one is empty
        if (src == null || target == null) {
            return false;
        }

        // Both the nodes are non-empty
        return (src.key == target.key
                && isMirror(src.left, target.right)
                && isMirror(src.right, target.left));
    }
}
