package org.milan.datastructure.tree;

/**
 * Refer {@link @https://www.geeksforgeeks.org/given-a-binary-tree-how-do-you-remove-all-the-half-nodes/}
 *
 * @author Milan Rathod
 */
public class RemoveHalfNodes {

    /**
     * Remove all nodes with only one child
     *
     * @param root root of the binary tree
     * @return root of updated binary tree
     */
    public Node<Integer> remove(Node<Integer> root) {
        if (root == null)
            return null;

        root.left = remove(root.left);
        root.right = remove(root.right);

        if (root.left == null && root.right == null)
            return root;

        // If current node is a half node with left child Null then
        // it's right child is returned and replaced it in the given tree
        if (root.left == null) {
            return root.right;
        }

        // If current nodes is a half node with right child NULL then
        // it's right child is returned and replaces it in the given tree
        if (root.right == null) {
            return root.left;
        }

        return root;
    }
}
