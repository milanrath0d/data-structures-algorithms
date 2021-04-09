package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/}
 *
 * @author Milan Rathod
 */
public class MorisInorderTraversal {

    public List<Integer> traverse(Node<Integer> root) {
        List<Integer> outputList = new LinkedList<>();

        traversalUtil(root, outputList);

        return outputList;
    }

    private void traversalUtil(Node<Integer> root, List<Integer> outputList) {

        // Base condition
        if (root == null)
            return;

        Node<Integer> current = root;
        while (current != null) {
            if (current.left == null) {
                outputList.add(current.key);
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
                    outputList.add(current.key);
                    current = current.right;
                }

            }
        }
    }
}
