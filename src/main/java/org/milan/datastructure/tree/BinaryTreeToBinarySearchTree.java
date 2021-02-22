package org.milan.datastructure.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/binary-tree-to-binary-search-tree-conversion/}
 *
 * @author Milan Rathod
 */
public class BinaryTreeToBinarySearchTree {

    public void binaryToBST(Node<Integer> root) {
        LinkedList<Integer> list = new LinkedList<>();

        inOrderStore(root, list);

        Collections.sort(list);

        listToBST(list, root);
    }

    private void inOrderStore(Node<Integer> node, List<Integer> list) {
        if (node != null) {
            inOrderStore(node.left, list);
            list.add(node.key);
            inOrderStore(node.right, list);
        }
    }

    private void listToBST(LinkedList<Integer> list, Node<Integer> root) {
        if (root == null)
            return;

        // First update the left subtree
        listToBST(list, root.left);

        root.key = list.poll();

        // Finally update the right subtree
        listToBST(list, root.right);
    }
}
