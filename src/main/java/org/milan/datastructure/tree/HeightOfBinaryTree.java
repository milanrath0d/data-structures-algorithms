package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

import static org.milan.datastructure.tree.BinarySearchTree.EMPTY_TREE;

/**
 * Find height of the given binary tree
 *
 * @author Milan Rathod
 */
public class HeightOfBinaryTree {

    /**
     * Find height/depth of the binary tree
     *
     * @param root root of the tree
     * @return height of the tree
     */
    public int find(Node<Integer> root) {
        if (root == null) return 0;

        // Compute height of each sub tree
        int leftHeight = find(root.left);
        int rightHeight = find(root.right);

        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    /**
     * Find height/depth of the binary tree
     *
     * @param root root of the tree
     * @return height of the tree
     */
    public int findIterative(Node<Integer> root) {

        if (root == null) {
            throw new IllegalStateException(EMPTY_TREE);
        }

        int maxHeight = 0;

        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int nodeCount = queue.size();

            maxHeight++;

            while (nodeCount > 0) {
                Node<Integer> node = queue.remove();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

                nodeCount--;
            }
        }

        return maxHeight;
    }

}
