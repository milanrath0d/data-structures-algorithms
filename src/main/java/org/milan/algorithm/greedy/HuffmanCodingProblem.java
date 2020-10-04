package org.milan.algorithm.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Refer {@link @https://www.geeksforgeeks.org/huffman-coding-greedy-algo-3/}
 * <p>
 * Time complexity: O(nlogn) where n is number of unique characters. If there are n nodes then
 * extractMin is called 2*(n-1) times take O(logn) time as it called minHeapify method
 *
 * @author Milan Rathod
 */
public class HuffmanCodingProblem {

    static class Node {
        int data;

        char ch;

        Node left;

        Node right;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] frequencies = {5, 9, 12, 13, 16, 45};

        // Creating priority queue i.e. min heap
        PriorityQueue<Node> queue = new PriorityQueue<>(chars.length, Comparator.comparingInt(o -> o.data));

        for (int i = 0; i < chars.length; i++) {

            Node node = new Node();

            node.ch = chars[i];
            node.data = frequencies[i];

            queue.add(node);
        }

        // Root node
        Node root = null;

        while (queue.size() > 1) {
            Node firstNode = queue.poll();

            Node secondNode = queue.poll();

            Node newNode = new Node();

            newNode.ch = '-';

            // Sum of frequency of two nodes and assign it to new node
            newNode.data = firstNode.data + secondNode.data;

            // First extracted node as left child
            newNode.left = firstNode;

            // Second extracted node as right child
            newNode.right = secondNode;

            // Mark new node as root
            root = newNode;

            queue.add(newNode);
        }

        print(root, "");
    }

    private static void print(Node root, String s) {
        // If left and right children are null then it is leaf node
        if (root.left == null && root.right == null && Character.isLetter(root.ch)) {
            System.out.println(root.ch + " : " + s);
            return;
        }

        print(root.left, s + "0");
        print(root.right, s + "1");
    }

}
