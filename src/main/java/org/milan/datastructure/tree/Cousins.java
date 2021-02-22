package org.milan.datastructure.tree;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/}
 *
 * @author Milan Rathod
 */
public class Cousins {

    /**
     * This approach first find level of first and second nodes and check if both are same
     * After that check if both are not siblings
     *
     * @param root   root of the binary tree
     * @param first  first node
     * @param second second node
     * @return true if first and second nodes are cousins otherwise false
     */
    public boolean isCousins(Node<Integer> root, Node<Integer> first, Node<Integer> second) {
        return level(root, first, 1) == level(root, second, 1) && !isSiblings(root, first, second);
    }

    private int level(Node<Integer> root, Node<Integer> node, int level) {

        // Base case
        if (root == null) {
            return 0;
        }

        if (root == node || root.key.equals(node.key)) {
            return level;
        }

        int temp = level(root.left, node, level + 1);

        return temp != 0 ? temp : level(root.right, node, level + 1);
    }

    public boolean isSiblings(Node<Integer> root, Node<Integer> first, Node<Integer> second) {

        // Base case
        if (root == null) {
            return false;
        }

        if (root.left != null && root.right != null) {
            int left = root.left.key;
            int right = root.right.key;
            if (left == first.key && right == second.key) {
                return true;
            } else if (left == second.key && right == first.key) {
                return true;
            }
        }

        if (root.left != null) {
            return isSiblings(root.left, first, second);
        }

        if (root.right != null) {
            return isSiblings(root.right, first, second);
        }

        return false;
    }

    /**
     * This approach uses level order traversal
     *
     * @param root   root of the binary tree
     * @param first  first node
     * @param second second node
     * @return true if first and second nodes are cousins otherwise false
     */
    public boolean isCousinsV2(Node<Integer> root, Node<Integer> first, Node<Integer> second) {

        // Parent of first node
        Node<Integer> firstParent = null;

        // Parent of second node
        Node<Integer> secondParent = null;

        // Queue used for performing level order traversal
        // Each element of queue is pair of node and parent node
        Queue<Pair<Node<Integer>, Node<Integer>>> queue = new LinkedList<>();

        // Add root and some dummy node as its parent to queue
        queue.add(ImmutablePair.of(root, new Node<>(-1)));

        while (!queue.isEmpty()) {

            int level = queue.size();

            while (level != 0) {
                Pair<Node<Integer>, Node<Integer>> node = queue.poll();

                // Check if current node is first/second node
                if (node.getKey().key.equals(first.key)) {
                    firstParent = node.getValue();
                }

                if (node.getKey().key.equals(second.key)) {
                    secondParent = node.getValue();
                }

                if (node.getKey().left != null) {
                    queue.add(ImmutablePair.of(node.getKey().left, node.getKey()));
                }

                if (node.getKey().right != null) {
                    queue.add(ImmutablePair.of(node.getKey().right, node.getKey()));
                }

                level--;

                // If both nodes are found in current level then no need to traverse further
                if (firstParent != null && secondParent != null) {
                    break;
                }
            }

            // Check if both nodes are not siblings
            if (firstParent != null && secondParent != null) {
                return firstParent != secondParent;
            }

            if (firstParent != null || secondParent != null) {
                return false;
            }

        }

        return false;
    }
}
