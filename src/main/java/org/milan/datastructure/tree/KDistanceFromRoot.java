package org.milan.datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Refer to {@link @https://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/}
 * and {@link @https://www.geeksforgeeks.org/print-nodes-k-distance-root-iterative/}
 *
 * @author Milan Rathod
 */
public class KDistanceFromRoot {

    /**
     * Recursive approach
     *
     * @param root root of the binary tree
     * @param k    k level
     * @return list of all nodes at kth level from root
     */
    public List<Integer> getAll(Node<Integer> root, int k) {
        List<Integer> outputList = new ArrayList<>();
        getAllUtil(root, outputList, k);
        return outputList;
    }

    /**
     * Iterative approach
     *
     * @param root root of the binary tree
     * @param k    k level
     * @return list of all nodes at kth level from root
     */
    public List<Integer> getAllIterative(Node<Integer> root, int k) {

        Queue<Node<Integer>> queue = new LinkedList<>();

        int level = 0;

        List<Integer> list = new ArrayList<>();

        queue.add(root);

        // extra null is added to keep track
        // of all the nodes to be added before
        // level is incremented by 1
        queue.add(null);

        while (queue.size() > 0) {

            Node<Integer> temp = queue.remove();

            // print when level is equal to k
            if (level == k && temp != null) {
                list.add(temp.key);
            }

            if (temp == null) {
                if (queue.peek() != null)
                    queue.add(null);
                level += 1;

                // break the loop if level exceeds
                // the given level number
                if (level > k)
                    break;
            } else {
                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
        }

        return list;
    }

    private void getAllUtil(Node<Integer> root, List<Integer> list, int k) {

        // Base condition
        if (root == null) {
            return;
        }

        if (k == 0) {
            list.add(root.key);
        } else {
            getAllUtil(root.left, list, k - 1);
            getAllUtil(root.right, list, k - 1);
        }
    }
}
