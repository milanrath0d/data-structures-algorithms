package org.milan.leetcode;

import java.util.Arrays;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/edit-distance/description/">...</a>}
 *
 * @author Milan Rathod
 */
public class EditDistance {

    /**
     * Calculates the minimum distance between two strings using the memoization approach,
     * which optimally reduces redundant calculations by storing intermediate results.
     *
     * @param word1 the first input string
     * @param word2 the second input string
     * @return the minimum number of operations required to convert word1 into word2,
     * where operations can be insertion, deletion, or replacement of a character
     */
    public int minDistanceUsingMemoization(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return minDistanceUsingMemoizationRecursive(word1, word2, m, n, dp);
    }

    /**
     * Calculates the minimum number of operations required to convert one string into another
     * using a tabulation (iterative dynamic programming) approach. The allowed operations are
     * insertion, deletion, or replacement of a character.
     *
     * @param word1 the first input string
     * @param word2 the second input string
     * @return the minimum number of operations required to convert word1 into word2
     */
    public int minDistanceUsingTabulation(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        return dp[m][n];
    }

    private int minDistanceUsingMemoizationRecursive(String word1, String word2, int m, int n, int[][] dp) {
        if (m == 0) {
            return n;
        }

        if (n == 0) {
            return m;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            dp[m][n] = minDistanceUsingMemoizationRecursive(word1, word2, m - 1, n - 1, dp);
        } else {
            int replace = minDistanceUsingMemoizationRecursive(word1, word2, m - 1, n, dp);
            int insert = minDistanceUsingMemoizationRecursive(word1, word2, m, n - 1, dp);
            int delete = minDistanceUsingMemoizationRecursive(word1, word2, m - 1, n - 1, dp);
            dp[m][n] = 1 + Math.min(replace, Math.min(insert, delete));
        }
        return dp[m][n];
    }
}
