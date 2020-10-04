package org.milan.datastructure.heap;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/merge-two-binary-max-heaps/}
 *
 * @author Milan Rathod
 */
public class MergeTwoMaxHeaps {

    private final BinaryHeap binaryHeap;

    public MergeTwoMaxHeaps(int capacity) {
        this.binaryHeap = new BinaryHeap(capacity);
    }

    /**
     * Merge two max heaps by first merging both the array representation of max heaps
     * and then calling buildHeap to build heap from merged array
     * <p>
     * Time complexity: O(m + n)
     * Space complexity: O(m + n)
     *
     * @param a array representation of first max heap
     * @param b array representation of second max heap
     * @param m size of first max heap
     * @param n size of second max heap
     * @return merged max heap
     */
    public int[] merge(int[] a, int[] b, int m, int n) {

        int[] mergedArray = new int[m + n];

        // Copy first array
        if (m >= 0) System.arraycopy(a, 0, mergedArray, 0, m);

        // Copy second array
        if (n >= 0) System.arraycopy(b, 0, mergedArray, m, n);

        // Call buildHeap to build heap from array
        binaryHeap.buildHeap(mergedArray);

        return binaryHeap.getStore();
    }
}
