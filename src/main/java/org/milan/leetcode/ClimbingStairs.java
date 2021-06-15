package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/min-cost-climbing-stairs/}
 *
 * @author Milan Rathod
 */
public class ClimbingStairs {

    public int minCost(int[] cost) {
        for (int i = cost.length - 3; i >= 0; i--)
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        return Math.min(cost[0], cost[1]);
    }
}
