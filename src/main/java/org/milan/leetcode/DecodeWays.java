package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/decode-ways/}
 *
 * @author Milan Rathod
 */
public class DecodeWays {

    public int find(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int n = str.length();

        int[] dp = new int[n + 1];

        // 1 way to decode empty string
        dp[0] = 1;

        // For one letter string check if leading 0 is there or not
        dp[1] = str.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {

            // Current digit
            int curr = str.charAt(i - 1) - '0';

            // Previous digit
            int prev = str.charAt(i - 2) - '0';

            if (curr >= 1 && curr <= 9) {
                dp[i] += dp[i - 1];
            }

            if ((prev * 10 + curr) >= 10 && (prev * 10 + curr) <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
