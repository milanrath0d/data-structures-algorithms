package org.milan.datastructure.tree;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/print-binary-tree-vertical-order/}
 *
 * @author Milan Rathod
 */
public class VerticalTraversal {

    /**
     * Vertical traversal of given tree using level order traversal
     * <p>
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     *
     * @param root root of the binary tree
     * @return list of strings of vertical traversal
     */
    public List<String> traverse(BinaryTree.Node root) {

        // Store horizontal distance as key and value as list of nodes
        Map<Integer, List<BinaryTree.Node>> map = new TreeMap<>();

        traverseUtil(root, map);

        List<String> outIntegerList = new ArrayList<>();

        map.forEach((integer, nodes) -> outIntegerList.add(nodes.toString()));

        return outIntegerList;
    }

    /**
     * Utility function to perform actual vertical traversal and store the results in map
     */
    public void traverseUtil(BinaryTree.Node root, Map<Integer, List<BinaryTree.Node>> map) {
        // Base case
        if (root == null) {
            return;
        }

        int hd = 0;

        Queue<Pair<BinaryTree.Node, Integer>> queue = new ArrayDeque<>();

        queue.add(ImmutablePair.of(root, hd));

        while (!queue.isEmpty()) {
            Pair<BinaryTree.Node, Integer> current = queue.poll();

            hd = current.getValue();

            root = current.getKey();

            List<BinaryTree.Node> nodeList = map.get(hd);

            if (nodeList == null) {
                nodeList = new ArrayList<>();
            }
            nodeList.add(root);

            map.put(hd, nodeList);

            if (root.left != null) {
                queue.add(ImmutablePair.of(root.left, hd - 1));
            }

            if (root.right != null) {
                queue.add(ImmutablePair.of(root.right, hd + 1));
            }
        }
    }

    /**
     * Vertical traversal of given tree
     * <p>
     * Time complexity: O(w*n) w is width of binary tree
     * and n is number of nodes in binary tree
     * <p>
     * Worst case time complexity is O(n*n) when binary tree is complete tree
     *
     * @param root root of the binary tree
     */
    public void traverseV2(BinaryTree.Node root) {

        Values value = new Values();

        findMinMax(root, value, 0);

        for (int line = value.min; line <= value.max; line++) {
            traverseV2Util(root, line, 0);
            System.out.println();
        }
    }

    private void traverseV2Util(BinaryTree.Node node, int line, int hd) {
        if (node == null) {
            return;
        }

        if (hd == line) {
            System.out.print(node.key + " ");
        }

        traverseV2Util(node.left, line, hd - 1);
        traverseV2Util(node.right, line, hd + 1);
    }

    private void findMinMax(BinaryTree.Node node, Values value, int hd) {

        // Base case
        if (node == null) {
            return;
        }

        if (hd < value.min) {
            value.min = hd;
        } else if (hd > value.max) {
            value.max = hd;
        }

        // Recur for left and right subtrees
        findMinMax(node.left, value, hd - 1);
        findMinMax(node.right, value, hd + 1);
    }

    static class Values {
        int min, max;
    }

}
