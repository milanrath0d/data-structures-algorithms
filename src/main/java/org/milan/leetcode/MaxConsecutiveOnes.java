package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/max-consecutive-ones/}
 *
 * @author Milan Rathod
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = 0;

        int n = nums.length;

        int current = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }

        return Math.max(max, current);
    }
}
