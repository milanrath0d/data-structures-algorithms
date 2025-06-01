package org.milan.algorithm.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/longest-increasing-subsequence/">...</a>}
 *
 * @author Milan Rathod
 */
public class LongestIncreasingSubsequence {

    /**
     * Find longest increasing subsequence using dynamic programming
     * <p>
     * Time complexity: O(n*n)
     * Space complexity: O(n)
     *
     * @param arr input array
     * @return length of longest increasing subsequence
     */
    public int find(int[] arr) {

        int n = arr.length;

        int[] dp = new int[n];

        int i, j;

        // Initialize lis values as 1
        Arrays.fill(dp, 1);

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Get maximum of all lis values
        return Arrays.stream(dp).max().orElse(1);
    }

    /**
     * Finds the length of the longest increasing subsequence in the input array
     * using dynamic programming with memoization.
     * <p>
     * Time complexity: O(n*n)
     * Space complexity: O(n*n)
     *
     * @param arr the input array of integers
     * @return the length of the longest increasing subsequence
     */
    public int findV2(int[] arr) {
        int n = arr.length;

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return findV2Recursive(arr, 0, -1, dp);
    }

    private int findV2Recursive(int[] arr, int index, int previousIndex, int[][] dp) {
        if (index == arr.length) {
            return 0;
        }

        if (dp[index][previousIndex + 1] != -1) {
            return dp[index][previousIndex + 1];
        }

        int notTake = findV2Recursive(arr, index + 1, previousIndex, dp);

        int take = 0;
        if (previousIndex == -1 || arr[index] > arr[previousIndex]) {
            take = 1 + findV2Recursive(arr, index + 1, index, dp);
        }

        dp[index][previousIndex + 1] = Math.max(notTake, take);
        return dp[index][previousIndex + 1];
    }

    /**
     * Find longest increasing subsequence
     * <p>
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     *
     * @param arr input array
     * @return length of longest increasing subsequence
     */
    public int findV3(int[] arr) {
        int n = arr.length;

        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > result.getLast()) {
                result.add(arr[i]);
            } else {
                int low = Collections.binarySearch(result, arr[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                result.set(low, arr[i]);
            }
        }

        return result.size();
    }
}
