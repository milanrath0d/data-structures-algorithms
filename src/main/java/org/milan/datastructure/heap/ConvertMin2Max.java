package org.milan.datastructure.heap;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/convert-min-heap-to-max-heap/}
 *
 * @author Milan Rathod
 */
public class ConvertMin2Max {

    /**
     * Convert min heap to max heap
     * <p>
     * Time complexity: O(n)
     *
     * @param arr array representation of min heap
     * @return array representation of max heap
     */
    public int[] convert(int[] arr) {
        int length = arr.length;

        // Initialize the binary tree
        // Not a good place
        BinaryHeap binaryHeap = new BinaryHeap(length);

        // Build max heap from array which is min heap
        binaryHeap.buildHeap(arr);

        return binaryHeap.getStore();
    }
}
