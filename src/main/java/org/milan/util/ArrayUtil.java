package org.milan.util;

import java.util.Arrays;

/**
 * Utility for arrays
 *
 * @author Milan Rathod
 */
public final class ArrayUtil {

    /**
     * private constructor
     */
    private ArrayUtil() {
    }

    /**
     * Swap two elements of array
     *
     * @param arr  given array of integers
     * @param src  source element's index
     * @param dest destination element's index
     */
    public static void swap(int[] arr, int src, int dest) {
        int temp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = temp;
    }

    /**
     * Sort the given array of integers in descending order
     *
     * @param arr given array of integers
     */
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        int[] temp = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < n; i++) {
            arr[i] = temp[n - i - 1];
        }
    }
}
