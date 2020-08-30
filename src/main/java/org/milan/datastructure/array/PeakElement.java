package org.milan.datastructure.array;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/}
 * <p>
 * Find peak element in given array
 *
 * @author Milan Rathod
 */
public class PeakElement {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr input array
     * @return index of peak element or -1 if peak element doesn't exists
     */
    public int find(int[] arr) {

        int n = arr.length;

        if (n == 1 || arr[0] >= arr[1]) {
            return 0;
        } else if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i <= n - 2; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Time complexity: O(logn)
     * Space complexity: O(1)
     * <p>
     * Using Divide and Conquer method
     *
     * @param arr input array
     * @return index of peak element
     */
    public int findV2(int[] arr) {
        return findPeakUtil(arr, 0, arr.length - 1, arr.length);
    }

    private int findPeakUtil(int[] arr, int low, int high, int n) {

        int mid = low + (high - low) / 2;

        // Compare middle element with its neighbours
        if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
            return mid;
        }
        // If middle element is not peak element and its left neighbour is greater than left half must have peak element
        else if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return findPeakUtil(arr, low, mid - 1, n);
        } else {
            return findPeakUtil(arr, mid + 1, high, n);
        }
    }

}
