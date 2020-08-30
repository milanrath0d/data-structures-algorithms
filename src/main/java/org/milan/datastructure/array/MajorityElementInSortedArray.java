package org.milan.datastructure.array;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/check-for-majority-element-in-a-sorted-array/}
 *
 * @author Milan Rathod
 */
public class MajorityElementInSortedArray {

    /**
     * Using linear search
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr input array
     * @param x   given element
     * @return true if given element is majority element otherwise false
     */
    public boolean isMajority(int[] arr, int x) {

        int n = arr.length;

        // Get last index according to odd/even size
        int lastIndex = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int i = 0; i < lastIndex; i++) {

            // Check if x is present and is present more than n/2 times
            if (arr[i] == x && arr[i + n / 2] == x) {
                return true;
            }
        }

        return false;
    }

    /**
     * Using binary search
     * <p>
     * Time complexity: O(logn)
     * Space complexity: O(1)
     *
     * @param arr input array
     * @param x   given element
     * @return true if given element is majority element otherwise false
     */
    public boolean isMajorityV2(int[] arr, int x) {

        int index = binarySearch(arr, 0, arr.length, x);

        int n = arr.length;

        return x != -1 && ((index + n / 2) <= n - 1) && arr[index + n / 2] == x;
    }

    /**
     * Returns first instance of x in given array using binary search if present otherwise -1
     */
    private int binarySearch(int[] arr, int low, int high, int x) {

        if (high >= low) {
            int mid = (low + high) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, high, x);
            } else {
                return binarySearch(arr, low, mid - 1, x);
            }
        }

        return -1;
    }

}
