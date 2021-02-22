package org.milan.datastructure.tree;

import org.milan.datastructure.linkedlist.LinkedList;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/sorted-linked-list-to-balanced-bst/}
 *
 * @author Milan Rathod
 */
public class SortedLL2BST {

    private LinkedList.Node<Integer> head;

    /**
     * Convert sorted singly linked list to balanced binary search tree
     *
     * @param count total nodes in linked list
     * @param head  head of the linked list
     * @return root of the tree
     */
    public Node<Integer> convert(LinkedList.Node<Integer> head, int count) {

        // Base condition
        if (head == null) {
            throw new IllegalStateException("Linked list is empty");
        }

        this.head = head;

        return convertUtil(count);
    }

    /**
     * Utility function to convert sorted singly linked list to balanced binary search tree
     *
     * @param count total nodes in linked list
     * @return root of the tree
     */
    private Node<Integer> convertUtil(int count) {

        // Base condition
        if (count <= 0) {
            return null;
        }

        Node<Integer> left = convertUtil(count / 2);

        Node<Integer> root = new Node<>(head.getData());

        root.left = left;

        head = head.getNext();

        root.right = convertUtil(count - count / 2 - 1);

        return root;
    }
}
