package org.milan.datastructure.array;

import static java.util.Arrays.binarySearch;

/**
 * refer {@link @https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/}
 *
 * @author Milan Rathod
 */
public class CountOccurrencesInSortedArray {

    /**
     * This method first find index of x using binary search method
     * and then find occurrences of x in left and right side and returns total count
     * <p>
     * Time complexity: O(logn + count)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @param x   element for which number of occurrences to be counted
     * @return number of occurrences of x
     */
    public int count(int[] arr, int x) {
        int n = arr.length;

        int index = binarySearch(arr, 0,
                n, x);

        // If element is not present
        if (index < 0)
            return 0;

        // Count elements on left side.
        int count = 1;
        int left = index - 1;
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;
        }

        // Count elements
        // on right side.
        int right = index + 1;
        while (right < n && arr[right] == x) {
            count++;
            right++;
        }

        return count;
    }

    /**
     * This method first find first occurrence and last occurrence of x using binary search
     * and then return total count based on (lastIndex - firstIndex + 1) equation
     * <p>
     * Time complexity: O(logn)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @param x   element for which number of occurrences to be counted
     * @return number of occurrences of x
     */
    public int countV2(int[] arr, int x) {
        int n = arr.length;

        // Get the index of first occurrence of x
        int i = first(arr, 0, n - 1, x);

        // If x doesn't exist in arr then return 0
        if (i == -1)
            return 0;

        // Get the index of last occurrence of x
        // Note that we are only looking in the
        // subarray after first occurrence
        int j = last(arr, i, n - 1, x);

        return j - i + 1;
    }


    /**
     * Returns first instance of x in given array using binary search if present otherwise -1
     */
    private int first(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = (low + high) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return first(arr, mid + 1, high, x);
            } else {
                return first(arr, low, mid - 1, x);
            }
        }
        return -1;
    }

    /**
     * Returns last instance of x in given array using binary search if present otherwise -1
     */
    private int last(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid - 1), x);
            else
                return last(arr, (mid + 1), high, x);
        }
        return -1;
    }
}
