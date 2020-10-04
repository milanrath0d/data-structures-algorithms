package org.milan.datastructure.heap;

import java.util.Arrays;

/**
 * refer {@link @https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/}
 *
 * @author Milan Rathod
 */
public class KthLargestElement {

    /**
     * Naive approach: perform deletion k times in max heap
     * <p>
     * Time complexity: O(k*logn)
     *
     * @param arr given array
     * @param k   kth element
     * @return kth largest element
     */
    public int find(int[] arr, int k) {

        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }

        BinaryHeap binaryHeap = buildMaxBinaryHeap(arr);

        Arrays.stream(arr, 0, k - 1).forEach(value -> binaryHeap.delete());

        return binaryHeap.delete();
    }

    /**
     * Second approach: use of priority queue
     * <p>
     * Timex complexity: O(k*logk)
     *
     * @param arr given array
     * @param k   kth element
     * @return kth largest element
     */
    public int findV2(int[] arr, int k) {

        // Base case
        if (k > arr.length || k < 1) {
            throw new IllegalArgumentException("value of k is not valid");
        }

        BinaryHeap binaryHeap = buildMaxBinaryHeap(arr);

        return KthSmallestElement.getKthElement(binaryHeap, k);
    }

    /**
     * Build maximum binary heap from given array and return
     */
    private BinaryHeap buildMaxBinaryHeap(int[] arr) {
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);

        binaryHeap.buildHeap(arr);

        return binaryHeap;
    }
}
