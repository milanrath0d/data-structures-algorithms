package org.milan.leetcode;

/**
 * @author Milan Rathod
 */
public class RangeSumQuery {

    private final int[] nums;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
