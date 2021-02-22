package org.milan.datastructure.tree;

/**
 * Refer {@link @https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/}
 *
 * @author Milan Rathod
 */
public class RemoveKeysOutsideRange {

    public Node<Integer> remove(Node<Integer> root, int min, int max) {

        // Base case
        if (root == null)
            return null;

        root.left = remove(root.left, min, max);
        root.right = remove(root.right, min, max);

        if (root.key < min) {
            return root.right;
        }

        if (root.key > max) {
            return root.left;
        }
        return root;
    }
}
