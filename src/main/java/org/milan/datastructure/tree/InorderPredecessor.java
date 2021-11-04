package org.milan.datastructure.tree;

/**
 * In order predecessor of binary tree
 *
 * @author Milan Rathod
 */
public class InorderPredecessor {

    public Node<Integer> find(Node<Integer> root, Node<Integer> x) {

        // If left child is not null
        if (x.left != null) {
            return findRightMostNode(x.left);
        } else {
            Node<Integer> leftMostNode = findLeftMostNode(root);

            return !leftMostNode.key.equals(x.key) ? findInorderRec(root, null, x) : null;
        }
    }

    private Node<Integer> findInorderRec(Node<Integer> root, Node<Integer> temp, Node<Integer> x) {
        if (root == null)
            return null;

        if (root == x || (temp = findInorderRec(root.right, temp, x)) != null ||
            (temp = findInorderRec(root.left, temp, x)) != null) {
            if (temp != null) {
                if (root.right == temp) {
                    return root;
                }
            }

            return root;
        }

        return null;
    }

    private Node<Integer> findLeftMostNode(Node<Integer> root) {
        while (root != null && root.left != null) {
            root = root.left;
        }

        return root;
    }

    private Node<Integer> findRightMostNode(Node<Integer> root) {
        while (root != null && root.right != null) {
            root = root.right;
        }

        return root;
    }

}
