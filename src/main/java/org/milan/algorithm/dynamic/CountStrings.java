package org.milan.algorithm.dynamic;

/**
 * refer {@link @https://www.geeksforgeeks.org/count-strings-can-formed-using-b-c-given-constraints/}
 *
 * @author Milan Rathod
 */
public class CountStrings {

    /**
     * Recursive approach with exponential time complexity
     */
    public int count(int n, int bCount, int cCount) {

        // Base cases
        if (bCount < 0 || cCount < 0) {
            return 0;
        } else if (n == 0 || (bCount == 0 && cCount == 0)) {
            return 1;
        }

        return count(n - 1, bCount, cCount) +
                count(n - 1, bCount - 1, cCount) +
                count(n - 1, bCount, cCount - 1);
    }

    /**
     * Dynamic Programming solution
     * <p>
     * Time & Space complexity: O(n)
     */
    public int countDP(int n, int bCount, int cCount) {

        int[][][] dp = new int[n + 1][bCount + 1][cCount + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= bCount; j++) {
                for (int k = 0; k <= cCount; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return countDPUtil(dp, n, bCount, cCount);
    }

    private int countDPUtil(int[][][] dp, int n, int bCount, int cCount) {
        // Base cases
        if (bCount < 0 || cCount < 0) {
            return 0;
        } else if (n == 0 || (bCount == 0 && cCount == 0)) {
            return 1;
        }

        if (dp[n][bCount][cCount] != -1) {
            return dp[n][bCount][cCount];
        }

        dp[n][bCount][cCount] = count(n - 1, bCount, cCount) +
                count(n - 1, bCount - 1, cCount) +
                count(n - 1, bCount, cCount - 1);

        return dp[n][bCount][cCount];
    }
}
