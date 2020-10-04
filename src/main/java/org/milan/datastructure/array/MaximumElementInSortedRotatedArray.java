package org.milan.datastructure.array;

/**
 * Refer {@link @https://www.geeksforgeeks.org/maximum-element-in-a-sorted-and-rotated-array/?ref=rp}
 *
 * @author Milan Rathod
 */
public class MaximumElementInSortedRotatedArray {

    /**
     * Time complexity: O(logn)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @return maximum element in given array
     */
    public int findMaximum(int[] arr) {

        // Base conditions
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // If there is only one element left
            if (low == high) {
                return arr[high];
            }

            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid + 1] < arr[mid]) {
                return arr[mid];
            } else if (mid > low && arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            } else if (arr[low] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // TODO improve this
        return -1;
    }

}
