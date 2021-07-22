package org.milan.leetcode;

/**
 * Search a key in a sorted and rotated array
 * <p>
 * Refer {@link @https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/}
 * {@link @https://leetcode.com/problems/search-in-rotated-sorted-array/}
 *
 * @author Milan Rathod
 */
public class SortedRotatedArraySearch {

    /**
     * Find key in given sorted and rotated array using binary search
     * <p>
     * Time complexity: O(logn)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @param key key to be searched
     * @return index if present or -1 if not present
     */
    public int findElement(int[] arr, int key) {
        return findElementUtil(arr, 0, arr.length - 1, key);
    }

    /**
     * Utility function to find element in given array using binary search
     */
    private int findElementUtil(int[] inputArray, int low, int high, int key) {

        // check if given array is null or empty
        if (inputArray == null || inputArray.length == 0) {
            return -1;
        }

        // check if given array has only one element
        if (inputArray.length == 1) {
            return inputArray[0] == key ? 0 : -1;
        }

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (inputArray[mid] == key) {
            return mid;
        }

        if (inputArray[low] <= inputArray[mid]) {
            // if inputArray[low...mid] is sorted
            if (key >= inputArray[low] && key <= inputArray[mid]) {
                return findElementUtil(inputArray, low, mid - 1, key);
            }
            return findElementUtil(inputArray, mid + 1, high, key);
        } else {
            // inputArray[mid...high] is sorted.
            if (inputArray[mid] <= key && inputArray[high] >= key) {
                return findElementUtil(inputArray, mid + 1, high, key);
            }
            return findElementUtil(inputArray, low, mid - 1, key);
        }
    }
}