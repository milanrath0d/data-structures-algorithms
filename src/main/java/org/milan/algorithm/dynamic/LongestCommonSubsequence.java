package org.milan.algorithm.dynamic;

import java.util.Arrays;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/}
 *
 * @author Milan Rathod
 */
public class LongestCommonSubsequence {

    /**
     * Find longest common subsequence by recursive method
     * <p>
     * Time complexity: O(2power(n))
     *
     * @param s1 first string
     * @param s2 second string
     * @return length of longest common subsequence
     */
    public int lcsByRecursion(String s1, String s2) {
        return lcsUtil(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
    }

    /**
     * Find length of longest common subsequence by dynamic programming method (i.e. Tabulated)
     * <p>
     * Time complexity: O(mn)
     *
     * @param s1 first string
     * @param s2 second string
     * @return length of longest common subsequence
     */
    public int lcsByDynamic(String s1, String s2) {
        int[][] L = lcsDynamicUtil(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        return L[s1.length()][s2.length()];
    }

    /**
     * Find length of longest common subsequence by dynamic programming method (i.e. Memoization)
     * <p>
     * Time complexity: O(mn)
     *
     * @param s1 first string
     * @param s2 second string
     * @return length of longest common subsequence
     */
    public int lcsByDynamicV2(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return lcsDynamicV2Util(s1, s2, m, n, dp);
    }

    /**
     * Find longest common subsequence by dynamic programming method (i.e. Tabulated)
     * <p>
     * Time complexity: O(mn)
     *
     * @param s1 first string
     * @param s2 second string
     * @return longest common subsequence
     */
    public String findLcs(String s1, String s2) {
        int m = s1.length();

        int n = s2.length();

        int[][] L = lcsDynamicUtil(s1.toCharArray(), s2.toCharArray(), m, n);

        int index = L[m][n];

        int temp = index;

        // Create a character array to store lcs string
        char[] lcs = new char[index + 1];

        // Set the terminating char
        lcs[index] = ' ';

        int i = m, j = n;
        while (i > 0 && j > 0) {

            // If current character in s1 and s2 are same then current character is part of lcs
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

                // Put current character in result
                lcs[index - 1] = s1.charAt(i - 1);

                // Decrement values of i, j and index
                i--;
                j--;
                index--;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int k = 0; k < temp; k++) {
            stringBuilder.append(lcs[k]);
        }
        return stringBuilder.toString();
    }

    private int lcsDynamicV2Util(String s1, String s2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            dp[m][n] = 1 + lcsDynamicV2Util(s1, s2, m - 1, n - 1, dp);
        } else {
            dp[m][n] = Math.max(lcsDynamicV2Util(s1, s2, m - 1, n, dp), lcsDynamicV2Util(s1, s2, m, n - 1, dp));
        }

        return dp[m][n];
    }

    /**
     * Utility function to compute lcs using dynamic programming
     */
    private int[][] lcsDynamicUtil(char[] X, char[] Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];

        // Following steps build L[m+1][n+1] in bottom up fashion.
        // Note that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L;
    }

    /**
     * Utility function to compute lcs using recursion
     */
    private int lcsUtil(char[] x, char[] y, int m, int n) {
        // Base condition
        if (m == 0 || n == 0) {
            return 0;
        }

        if (x[m - 1] == y[n - 1]) {
            return 1 + lcsUtil(x, y, m - 1, n - 1);
        } else {
            return Math.max(lcsUtil(x, y, m - 1, n), lcsUtil(x, y, m, n - 1));
        }
    }

}
