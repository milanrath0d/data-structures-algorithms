package org.milan.datastructure.array;

/**
 * Refer {@link @https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/}
 *
 * @author Milan Rathod
 */
public class MinimumElementInSortedRotatedArray {

    /**
     * Time complexity: O(logn)
     * Space complexity: O(1)
     * <p>
     * NOTE: If all elements are same then this method
     * will take worst case time complexity of O(n)
     *
     * @param arr given array
     * @return minimum element in given array
     */
    public int findMinimum(int[] arr) {

        // Base conditions
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            return Math.min(arr[0], arr[1]);
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // If there is only one element left
            if (low == high) {
                return arr[low];
            }

            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid + 1] < arr[mid]) {
                return arr[mid + 1];
            } else if (mid > low && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // TODO improve this
        return -1;
    }
}
