package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Tree with basic operations
 *
 * @author Milan Rathod
 */
public class BinaryTree<T extends Comparable<T>> {

    /**
     * Root of the binary tree
     */
    private final Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootKey) {
        this.root = new Node<>(rootKey);
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    /**
     * Find maximum element in given tree
     *
     * @param root root of the tree
     * @return maximum node key
     */
    public T findMaximumElement(Node<T> root) {

        // Base condition
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
     * Find maximum element in given tree iterative approach
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
     * Find minimum element in given tree
     *
     * @param root root of the tree
     * @return minimum node key
     */
    public T findMinimumElement(Node<T> root) {

        // Base condition
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
     * Find minimum element in given tree iterative approach
     *
     * @param root root of the tree
     * @return minimum node key
     */
    public T findMinimumElementIterative(Node<T> root) {

        // Base condition
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }

        Queue<Node<T>> queue = new LinkedList<>();

        Node<T> temp = root;

        queue.offer(temp);

        T minElement = temp.key;

        while (!queue.isEmpty()) {

            temp = queue.poll();

            if (temp.key.compareTo(minElement) < 0) {
                minElement = temp.key;
            }

            if (temp.left != null) queue.add(temp.left);

            if (temp.right != null) queue.add(temp.right);
        }

        return minElement;
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
     * Check if given binary tree is foldable or not
     *
     * @param root root of binary tree
     * @return true if foldable otherwise false
     */
    public boolean isFoldable(Node<T> root) {
        return root == null || isFoldableUtil(root.left, root.right);
    }

    /**
     * Utility function to compute if binary tree is foldable or not
     */
    private boolean isFoldableUtil(Node<T> src, Node<T> target) {

        // If both left and right subtrees are null return true
        if (src == null && target == null) {
            return true;
        }

        // If either left or right subtree is null return false
        if (src == null || target == null) {
            return false;
        }

        return isFoldableUtil(src.left, target.right) &&
            isFoldableUtil(src.right, target.left);
    }

}
