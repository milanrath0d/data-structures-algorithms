package org.milan.datastructure.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/}
 *
 * @author Milan Rathod
 */
public class ConvertBSTToBalancedBST {

    public Node<Integer> convert(Node<Integer> root) {
        List<Node<Integer>> sortedNodes = new LinkedList<>();

        inOrder(root, sortedNodes);

        return convertUtil(sortedNodes, 0, sortedNodes.size() - 1);
    }

    private void inOrder(Node<Integer> root, List<Node<Integer>> list) {
        if (root != null) {
            // Traverse left subtree
            inOrder(root.left, list);

            // Visit the root and append it to list
            list.add(root);

            // Traverse right subtree
            inOrder(root.right, list);
        }
    }

    private Node<Integer> convertUtil(List<Node<Integer>> nodes, int start, int end) {

        // Base condition
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node<Integer> node = nodes.get(mid);

        node.left = convertUtil(nodes, start, mid - 1);
        node.right = convertUtil(nodes, mid + 1, end);

        return node;
    }
}
