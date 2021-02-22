package org.milan.datastructure.tree;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/}
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Milan Rathod
 */
public class ConvertBST2DLL {

    /**
     * Previous node pointer to point to previous visited node
     */
    private Node<Integer> prev;

    private Node<Integer> head;

    /**
     * Convert binary search tree to doubly linked list
     *
     * @param root root of the tree
     * @return head node of doubly linked list
     */
    public Node<Integer> convert(Node<Integer> root) {
        convertUtil(root);
        return head;
    }

    public Node<Integer> convertV2(Node<Integer> root) {
        // Base condition
        if (root == null) {
            throw new IllegalStateException("tree is empty");
        }

        // Node is root of binary tree
        Node<Integer> node = convertUtilV2(root);

        // Convert it to head of doubly linked list
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    /**
     * Utility function to convert binary search tree to doubly linked list
     *
     * @param root root of the tree
     */
    private Node<Integer> convertUtilV2(Node<Integer> root) {
        if (root == null) {
            return null;
        }

        // Convert the left subtree and link it to root
        if (root.left != null) {
            Node<Integer> left = convertUtilV2(root.left);

            // Find in order predecessor
            // After this loop, left will point to in order predecessor
            while (left.right != null) {
                left = left.right;
            }

            // Make root as next of predecessor
            left.right = root;

            // Make predecessor as prev of root
            root.left = left;
        }

        // Convert the right subtree and link it to root
        if (root.right != null) {

            Node<Integer> right = convertUtilV2(root.right);

            // Find in order successor.
            // After this loop, right will point to the in order successor
            while (right.left != null) {
                right = right.left;
            }

            // Make root as prev of successor
            right.left = root;

            // Make successor as next of root
            root.right = right;
        }
        return root;
    }

    /**
     * Utility function to convert binary search tree to doubly linked list
     *
     * @param root root of the tree
     */
    private void convertUtil(Node<Integer> root) {

        // Base condition
        if (root == null) {
            return;
        }

        // Visit left subtree
        convertUtil(root.left);

        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;

        // Visit right subtree
        convertUtil(root.right);
    }
}
