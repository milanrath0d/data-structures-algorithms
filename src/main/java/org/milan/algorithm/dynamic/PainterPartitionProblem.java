package org.milan.algorithm.dynamic;

/**
 * Refer {@link @https://www.geeksforgeeks.org/painters-partition-problem/}
 *
 * @author Milan Rathod
 */
public class PainterPartitionProblem {

    /**
     * Time complexity: O(k*N*N*N)
     * Space complexity: O(k*N)
     *
     * @param arr given array of integers consists of n boards
     * @param n   n boards
     * @param k   no. of painters
     * @return minimum time to paint all boards
     */
    public int partition(int[] arr, int n, int k) {

        int[][] dp = new int[k + 1][n + 1];

        // Only one board
        for (int i = 1; i <= k; i++) {
            dp[i][1] = arr[0];
        }

        // Only one painter
        for (int i = 1; i <= n; i++) {
            dp[1][i] = sum(arr, 0, i - 1);
        }

        // 2 to k partitions
        for (int i = 2; i <= k; i++) {

            // 2 to n boards
            for (int j = 2; j <= n; j++) {

                // Track minimum
                int best = Integer.MAX_VALUE;

                for (int p = 1; p <= j; p++) {
                    best = Math.min(best, Math.max(dp[i - 1][p], sum(arr, p, j - 1)));
                }

                dp[i][j] = best;
            }
        }

        return dp[k][n];
    }

    private int sum(int[] arr, int from, int to) {
        int total = 0;

        for (int i = from; i <= to; i++) {
            total += arr[i];
        }
        return total;
    }
}

