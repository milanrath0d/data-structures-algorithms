package org.milan.algorithm.dynamic;

import java.util.Arrays;

/**
 * Problem: {@link @<a href="https://www.geeksforgeeks.org/subset-sum-problem-dp-25/">...</a>}
 *
 * @author Milan Rathod
 */
public class SubsetSum {

    /**
     * Check if subset of sum exists in given array in recursive way
     * <p>
     * Time complexity: O(2power(n))
     *
     * @param arr given array of integers
     * @param n   number of elements
     * @param sum sum
     * @return true if subset of sum exists otherwise false
     */
    public boolean isSubsetSum(int[] arr, int n, int sum) {
        // Base cases
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        // If last element is greater than sum, ignore it
        if (arr[n - 1] > sum) {
            return isSubsetSum(arr, n - 1, sum);
        }

        // Check if sum can be obtained by including/excluding last element
        return isSubsetSum(arr, n - 1, sum - arr[n - 1]) || isSubsetSum(arr, n - 1, sum);
    }

    /**
     * Checks whether a subset with the given sum exists in the array using
     * dynamic programming with memoization.
     *
     * @param arr array of integers
     * @param n   total number of elements in the array
     * @param sum target sum to check for the subset
     * @return true if a subset with the given sum exists, otherwise false
     */
    public boolean isSubsetSumV2(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return isSubsetSumV2Util(arr, n, sum, dp);
    }

    private boolean isSubsetSumV2Util(int[] arr, int n, int sum, int[][] dp) {
        // Base cases
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (dp[n][sum] != -1) {
            return dp[n][sum] == 1;
        }

        // If last element is greater than sum, ignore it
        if (arr[n - 1] > sum) {
            dp[n][sum] = isSubsetSum(arr, n - 1, sum) ? 1 : 0;
        } else {
            // Check if sum can be obtained by including/excluding last element
            dp[n][sum] = isSubsetSum(arr, n - 1, sum - arr[n - 1]) || isSubsetSum(arr, n - 1, sum) ? 1 : 0;
        }

        return dp[n][sum] == 1;
    }

    /**
     * Determines if there is a subset of the given array with a sum equal to the specified value.
     * This method uses dynamic programming to solve the subset sum problem in a tabular format.
     *
     * @param arr array of integers
     * @param n   total number of elements in the array
     * @param sum target sum to check for the subset
     * @return true if a subset with the given sum exists, otherwise false
     */
    public boolean isSubsetSumV3(int[] arr, int n, int sum) {
        // The value of subset[i][j] will be true if there is
        // a subset of set[0..j-1] with sum equal to i
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // If sum is 0 then answer is true
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1]) {
                    // Exclude the current element
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Include or exclude
                    dp[i][j] = dp[i - 1][j]
                        || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    /**
     * Check if subset of sum exists in given array in dynamic programming
     * <p>
     * Time complexity: O(sum*n)
     * Space complexity: O(sum)
     *
     * @param arr given array of integers
     * @param n   number of elements
     * @param sum sum
     * @return true if subset of sum exists otherwise false
     */
    public boolean isSubsetSumV4(int[] arr, int n, int sum) {

        // The value of subset[i%2][j] will be true
        // if there exists a subset of sum j in
        // arr[0, 1, ...., i-1]
        boolean[][] dp = new boolean[2][sum + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // A subset with sum 0 is always possible
                if (j == 0)
                    dp[i % 2][j] = true;

                // If there exists no element no sum
                    // is possible
                else if (i == 0)
                    dp[i % 2][j] = false;
                else if (arr[i - 1] <= j)
                    dp[i % 2][j] = dp[(i + 1) % 2]
                        [j - arr[i - 1]] || dp[(i + 1) % 2][j];
                else
                    dp[i % 2][j] = dp[(i + 1) % 2][j];
            }
        }

        return dp[n % 2][sum];
    }

}
