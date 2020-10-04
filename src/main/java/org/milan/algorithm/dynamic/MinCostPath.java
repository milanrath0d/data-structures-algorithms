package org.milan.algorithm.dynamic;

/**
 * refer {@link @https://www.geeksforgeeks.org/min-cost-path-dp-6/}
 *
 * @author Milan Rathod
 */
public class MinCostPath {

    /**
     * @param cost given cost array
     * @param m    destination row index
     * @param n    destination column index
     * @return minimum cost
     */
    public int minCost(int[][] cost, int m, int n) {
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        } else if (m == 0 && n == 0) {
            return cost[m][n];
        } else {
            return cost[m][n] + min(minCost(cost, m - 1, n - 1),
                    minCost(cost, m, n - 1), minCost(cost, m - 1, n));
        }
    }

    /**
     * DP Solution
     * <p>
     * Time complexity: O(mn)
     * Space complexity: O(mn)
     *
     * @param cost given cost array
     * @param m    destination row index
     * @param n    destination column index
     * @return minimum cost
     */
    public int minCostV2(int[][] cost, int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        dp[0][0] = cost[0][0];

        /* Initialize first column of total cost(tc) array */
        for (int i = 1; i <= m; i++)
            dp[i][0] = dp[i - 1][0] + cost[i][0];

        /* Initialize first row of tc array */
        for (int j = 1; j <= n; j++)
            dp[0][j] = dp[0][j - 1] + cost[0][j];

        /* Construct rest of the tc array */
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = min(dp[i - 1][j - 1],
                        dp[i - 1][j],
                        dp[i][j - 1]) + cost[i][j];

        return dp[m][n];
    }

    /**
     * DP Solution
     * <p>
     * Time complexity: O(mn)
     * Space complexity: O(1)
     *
     * @param cost given cost array
     * @param m    destination row index
     * @param n    destination column index
     * @return minimum cost
     */
    public int minCostV3(int[][] cost, int m, int n) {

        /* Initialize first column of total cost(tc) array */
        for (int i = 1; i <= m; i++)
            cost[i][0] += cost[i - 1][0];

        /* Initialize first row of tc array */
        for (int j = 1; j <= n; j++)
            cost[0][j] += cost[0][j - 1];

        /* Construct rest of the tc array */
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                cost[i][j] += min(cost[i - 1][j - 1],
                        cost[i - 1][j],
                        cost[i][j - 1]);

        return cost[m][n];
    }

    private int min(int x, int y, int z) {
        return x < y ? Math.min(x, z) : Math.min(y, z);
    }
}
