package org.milan.datastructure.tree;

/**
 * Refer {@link @https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/}
 *
 * @author Milan Rathod
 */
public class CheckBinarySearchTree {

    private Node<Integer> prev;

    public CheckBinarySearchTree() {
        prev = null;
    }

    /**
     * Check if given binary tree is BST or not
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root root of the tree
     * @return true if BST otherwise false
     */
    public boolean isBST(Node<Integer> root) {
        return isBSTUtil(root, null, null);
    }

    /**
     * Check if given binary tree is BST or not
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root root of the tree
     * @return true if BST otherwise false
     */
    public boolean isBSTUsingInOrder(Node<Integer> root) {
        if (root != null) {
            if (!isBSTUsingInOrder(root.left)) {
                return false;
            }

            if (prev != null && root.key <= prev.key) {
                return false;
            }

            prev = root;

            return isBSTUsingInOrder(root.right);
        }
        return true;
    }

    /**
     * Utility function to recursively check if given binary tree is BST or not
     */
    private boolean isBSTUtil(Node<Integer> root, Node<Integer> left, Node<Integer> right) {
        // Empty tree is BST
        if (root == null)
            return true;

        // If left node exist then it's data should be less than root's data
        if (left != null && root.key <= left.key) {
            return false;
        }

        // If right node exist then it's data should be less than root's data
        if (right != null && root.key >= right.key) {
            return false;
        }

        // Check the left and right subtree recursively
        return (isBSTUtil(root.left, left, root) && isBSTUtil(root.right, root, right));
    }

}
