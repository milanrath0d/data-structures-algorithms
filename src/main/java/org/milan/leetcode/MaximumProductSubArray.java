package org.milan.leetcode;

/**
 * @author Milan Rathod
 */
public class MaximumProductSubArray {

    public int find(int[] arr) {
        int max = arr[0];

        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax * arr[i]);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
