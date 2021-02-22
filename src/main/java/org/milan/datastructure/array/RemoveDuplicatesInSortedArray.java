package org.milan.datastructure.array;

import java.util.Arrays;

/**
 * Refer {@link @https://www.geeksforgeeks.org/remove-duplicates-sorted-array/}
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * @author Milan Rathod
 */
public class RemoveDuplicatesInSortedArray {

    public int[] removeDuplicates(int[] arr) {

        int n = arr.length;

        // Base conditions
        if (n == 0 || n == 1) {
            return arr;
        }

        // To store index of next unique element
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // Store the last element as whether it is unique or repeated,
        // it hasn't stored previously
        arr[j++] = arr[n - 1];

        // NOTE: you can return index of all unique elements in given arr here to avoid space complexity
        return Arrays.copyOfRange(arr, 0, j);
    }
}
