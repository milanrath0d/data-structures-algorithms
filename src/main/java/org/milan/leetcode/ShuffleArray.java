package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/shuffle-the-array/}
 *
 * @author Milan Rathod
 */
public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int[] output = new int[2 * n];

        for (int i = 0; i < n; i++) {
            output[2 * i] = nums[i];
            output[2 * i + 1] = nums[n + i];
        }

        return output;
    }
}
