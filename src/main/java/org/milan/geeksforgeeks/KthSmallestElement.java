package org.milan.geeksforgeeks;

import org.milan.algorithm.sorting.QuickSort;

/**
 * refer {@link @https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/}
 *
 * @author Milan Rathod
 */
public class KthSmallestElement {

    /**
     * Time complexity: O(n) average case O(n*n) worst case
     */
    public int smallestElement(int[] arr, int k) {
        return smallestElementUtil(arr, 0, arr.length - 1, k);
    }

    private int smallestElementUtil(int[] arr, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            // Partition the given array around last element as pivot
            int pivot = QuickSort.partition(arr, low, high);

            // If pivot is same as k
            if (pivot - low == k - 1) {
                return arr[pivot];
            } else if (pivot - low > k - 1) {
                return smallestElementUtil(arr, low, pivot - 1, k);
            } else {
                return smallestElementUtil(arr, pivot + 1, high, k - pivot + low - 1);
            }
        }
        return Integer.MAX_VALUE;
    }

}
