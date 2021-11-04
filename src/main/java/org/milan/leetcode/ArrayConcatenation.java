package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/concatenation-of-array/}
 *
 * @author Milan Rathod
 */
public class ArrayConcatenation {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] output = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            output[i] = nums[i % n];
        }

        return output;
    }
}
