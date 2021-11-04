package org.milan.leetcode;

import org.milan.util.ArrayUtil;

import java.util.Random;

/**
 * Refer {@link @https://leetcode.com/problems/shuffle-an-array/}
 *
 * @author Milan Rathod
 */
public class ShuffleArrayII {

    private final int[] nums;

    private final Random random;

    public ShuffleArrayII(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /**
     * @return Resets the array to its original configuration and return it
     */
    public int[] reset() {
        return nums;
    }

    /**
     * @return a random shuffling of the array
     */
    public int[] shuffle() {
        if (nums == null) {
            return null;
        }

        int[] cloned = nums.clone();

        for (int i = 1; i < cloned.length; i++) {
            int j = random.nextInt(i + 1);
            ArrayUtil.swap(cloned, i, j);
        }

        return cloned;
    }
}
