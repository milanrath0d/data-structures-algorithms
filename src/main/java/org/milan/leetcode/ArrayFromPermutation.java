package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/build-array-from-permutation/}
 *
 * @author Milan Rathod
 */
public class ArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
