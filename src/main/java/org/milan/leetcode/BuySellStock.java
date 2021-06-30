package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/best-time-to-buy-and-sell-stock/l}
 *
 * @author Milan Rathod
 */
public class BuySellStock {

    public int maxProfit(int[] prices) {

        // Base case
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;

        int bought = prices[0];

        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > bought) {
                maxProfit = Math.max(maxProfit, prices[i] - bought);
            } else {
                bought = prices[i];
            }
        }

        return maxProfit;
    }

}
