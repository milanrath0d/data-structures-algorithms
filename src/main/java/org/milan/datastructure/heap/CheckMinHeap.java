package org.milan.datastructure.heap;

/**
 * Refer {@link @https://www.geeksforgeeks.org/given-level-order-traversal-binary-tree-check-tree-min-heap/}
 *
 * @author Milan Rathod
 */
public class CheckMinHeap {

    /**
     * Check if given level order traversal of tree
     * is min heap or not
     *
     * @param arr given level order traversal
     */
    public boolean isMinHeap(int[] arr) {
        int n = arr.length;

        // First non leaf node is at index n/2 -1
        // Check whether each parent is greater than child
        for (int i = (n / 2 - 1); i >= 0; i--) {
            // Left child will be at index 2*i + 1
            // Right child will be at index 2*i + 2
            if (((2 * i + 1 < n) && arr[i] > arr[2 * i + 1]) ||
                    ((2 * i + 2 < n) && arr[i] > arr[2 * i + 2])) {
                return false;
            }
        }
        return true;
    }
}
