package org.milan.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * In order successor of binary tree
 *
 * @author Milan Rathod
 */
public class InorderSuccessor {

    private static class PreviousNode {
        Node<Integer> previousNode;

        public PreviousNode() {
            this.previousNode = null;
        }
    }

    public Node<Integer> find(Node<Integer> root, Node<Integer> x) {
        // TODO refactor this
        List<Node<Integer>> resultNode = new ArrayList<>();

        findUtil(root, new PreviousNode(), resultNode, x);
        return resultNode.get(0);
    }

    public Node<Integer> findV2(Node<Integer> root, Node<Integer> x) {

        // If right child is not null
        if (x.right != null) {
            return findLeftMostNode(x.right);
        } else {
            Node<Integer> rightMost = findRightMostNode(root);

            return !rightMost.key.equals(x.key) ? findInorderRec(root, null, x) : null;
        }
    }

    private Node<Integer> findInorderRec(Node<Integer> root, Node<Integer> temp, Node<Integer> x) {
        if (root == null)
            return null;

        if (root == x || (temp = findInorderRec(root.left, temp, x)) != null ||
                (temp = findInorderRec(root.right, temp, x)) != null) {
            if (temp != null) {
                if (root.left == temp) {
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

    private void findUtil(Node<Integer> root, PreviousNode previousNode, List<Node<Integer>> resultNode, Node<Integer> x) {
        if (root.right != null) {
            findUtil(root.right, previousNode, resultNode, x);
        }

        if (root == x) {
            resultNode.add(previousNode != null ? previousNode.previousNode : null);
        }

        previousNode.previousNode = root;

        if (root.left != null) {
            findUtil(root.left, previousNode, resultNode, x);
        }
    }


}
