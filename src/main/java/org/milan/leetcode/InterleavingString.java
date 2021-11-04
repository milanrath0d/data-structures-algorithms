package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/interleaving-string/}
 *
 * @author Milan Rathod
 */
public class InterleavingString {

    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();

        // If length of s3 is not same as sum of lengths of s1 and s3
        if (s3.length() != m + n) {
            return false;
        }

        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty string s3 can be formed from empty s1 and empty s2
        dp[0][0] = true;

        for (int i = 1; i <= m; i++) {
            dp[i][0] = (s3.charAt(i - 1) == s1.charAt(i - 1)) && dp[i - 1][0];
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = (s3.charAt(j - 1) == s2.charAt(j - 1)) && dp[0][j - 1];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = ((s3.charAt(i + j - 1) == s1.charAt(i - 1)) && dp[i - 1][j]) ||
                    ((s3.charAt(i + j - 1) == s2.charAt(j - 1)) && dp[i][j - 1]);
            }
        }

        return dp[m][n];
    }
}
