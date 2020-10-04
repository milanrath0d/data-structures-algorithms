package org.milan.datastructure.array;

public class CountZeros {

    /**
     * Time complexity: O(logn)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @return count number of zeros
     */
    public int count(int[] arr) {
        int n = arr.length;

        // Find index of first zero in given array
        int first = firstZero(arr, 0, n - 1);

        // If 0 is not present at all, return 0
        if (first == -1)
            return 0;

        return (n - first);
    }

    /**
     * Find first occurrence of zero if present otherwise return -1
     */
    private int firstZero(int[] arr, int low, int high) {
        if (high >= low) {
            // Check if mid element is first 0
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
                return mid;

            if (arr[mid] == 1) // If mid element is not 0
                return firstZero(arr, (mid + 1), high);
            else // If mid element is 0, but not first 0
                return firstZero(arr, low, (mid - 1));
        }
        return -1;
    }
}
