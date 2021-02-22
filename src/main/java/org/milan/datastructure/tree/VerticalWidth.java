package org.milan.datastructure.tree;

/**
 * @author Milan Rathod
 */
public class VerticalWidth {

    static int minimum, maximum = 0;

    /**
     * Using preorder traversal
     * <p>
     * Time complexity: O(n)
     *
     * @param root root of the binary tree
     * @return vertical width of binary tree
     */
    public int get(Node<Integer> root) {
        preOrderGetUtil(root, 0);
        return maximum - minimum + 1;
    }

    private void preOrderGetUtil(Node<Integer> root, int current) {
        if (root == null) {
            return;
        }

        // Traverse left
        preOrderGetUtil(root.left, current - 1);

        if (current < minimum) {
            minimum = current;
        }

        if (current > maximum) {
            maximum = current;
        }

        // Traverse right
        preOrderGetUtil(root.right, current + 1);
    }
}
