package org.milan.datastructure.array;

/**
 * refer {@link @https://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/}
 *
 * @author Milan Rathod
 */
public class MaximumElement {

    public int find(int[] arr) {
        return findUtil(arr, 0, arr.length - 1);
    }

    private int findUtil(int[] arr, int low, int high) {

        // Base case -- only one element present in arr
        if (low == high) {
            return arr[low];
        }

        // If two elements are present
        if (high == low + 1 && arr[high] > arr[low]) {
            return arr[high];
        } else if (high == low + 1 && arr[high] < arr[low]) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        // If mid element is greater then it's adjacent elements then return
        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return arr[mid];
        } else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
            // If mid element is greater then its next element and smaller then it's previous element
            // then maximum lies on left side
            return findUtil(arr, low, mid - 1);
        } else {
            return findUtil(arr, mid + 1, high);
        }
    }
}
