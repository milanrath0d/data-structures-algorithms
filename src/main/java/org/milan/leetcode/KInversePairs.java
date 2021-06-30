package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/k-inverse-pairs-array/}
 *
 * @author Milan Rathod
 */
public class KInversePairs {

    public int find(int n, int k) {
        int[] dp = new int[k + 1];
        int M = 1000000007;
        for (int i = 1; i <= n; i++) {
            int[] temp = new int[k + 1];
            temp[0] = 1;
            for (int j = 1; j <= k; j++) {
                int val = (dp[j] + M - ((j - i) >= 0 ? dp[j - i] : 0)) % M;
                temp[j] = (temp[j - 1] + val) % M;
            }
            dp = temp;
        }
        return ((dp[k] + M - (k > 0 ? dp[k - 1] : 0)) % M);
    }
}
