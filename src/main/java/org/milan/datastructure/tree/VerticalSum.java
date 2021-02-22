package org.milan.datastructure.tree;

import org.milan.datastructure.linkedlist.DoublyLinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/vertical-sum-in-a-given-binary-tree/}
 *
 * @author Milan Rathod
 */
public class VerticalSum {

    /**
     * Find vertical sum using in order recursive traversal
     * <p>
     * Using Hashing technique
     *
     * @param root root of the tree
     * @return List of sums for each vertical level
     */
    public List<Integer> computeSum(Node<Integer> root) {
        // Base condition
        if (root == null) {
            throw new IllegalStateException("binary tree is empty");
        }

        Map<Integer, Integer> map = new HashMap<>();

        sumUtil(root, 0, map);

        return new ArrayList<>(map.values());
    }

    /**
     * Find vertical sum using in order recursive traversal
     * <p>
     * Using doubly linked list
     *
     * @param root root of the tree
     * @return List of sums for each vertical level
     */
    public List<Integer> sumUsingDLL(Node<Integer> root) {
        // Base condition
        if (root == null) {
            throw new IllegalStateException("binary tree is empty");
        }

        // Create doubly linked list to store sum of vertical lines
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>(0);

        sumUsingDLLUtil(root, dll.getHead());

        DoublyLinkedList.Node<Integer> temp = dll.getHead();

        // Move temp to leftmost node
        while (temp.getPrev() != null) {
            temp = temp.getPrev();
        }

        List<Integer> outputList = new ArrayList<>();

        // Iterating through each nodes
        while (temp != null) {
            outputList.add(temp.getData());
            temp = temp.getNext();
        }

        return outputList;
    }


    /**
     * Utility function to calculate vertical sum of each vertical lines
     *
     * @param root    root of the tree
     * @param dllNode doubly linked list node
     */
    private void sumUsingDLLUtil(Node<Integer> root, DoublyLinkedList.Node<Integer> dllNode) {

        // Add current node's data to its vertical line
        dllNode.setData(dllNode.getData() + root.key);

        // Recursively process for left subtree
        if (root.left != null) {
            if (dllNode.getPrev() == null) {
                dllNode.setPrev(new DoublyLinkedList.Node<>(0));
                dllNode.getPrev().setNext(dllNode);
            }
            sumUsingDLLUtil(root.left, dllNode.getPrev());
        }

        // Recursively process for right subtree
        if (root.right != null) {
            if (dllNode.getNext() == null) {
                dllNode.setNext(new DoublyLinkedList.Node<>(0));
                dllNode.getNext().setPrev(dllNode);
            }
            sumUsingDLLUtil(root.right, dllNode.getNext());
        }
    }

    /**
     * Utility function to calculate vertical sum of each vertical lines
     *
     * @param root root of the tree
     * @param hd   horizontal distance
     * @param map  map to store key as horizontal distance and value as sum of vertical line
     */
    private void sumUtil(Node<Integer> root, int hd, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }

        // Traverse left subtree with horizontal distance as hd - 1
        sumUtil(root.getLeft(), hd - 1, map);

        // Update vertical sum for this horizontal distance
        int previousSum = map.getOrDefault(hd, 0);
        map.put(hd, previousSum + root.getKey());

        // Traverse right subtree with horizontal distance as hd + 1
        sumUtil(root.getRight(), hd + 1, map);
    }

}
