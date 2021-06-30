package org.milan.leetcode;

import java.util.Arrays;

/**
 * TODO refactor this
 * <p>
 * Refer {@link @https://leetcode.com/problems/maximum-product-difference-between-two-pairs/}
 *
 * @author Milan Rathod
 */
public class MaximumProductDifference {

    public static void main(String[] args) {
        MaximumProductDifference maximumProductDifference = new MaximumProductDifference();

        System.out.println(maximumProductDifference.maxProductDifference(new int[]{5, 6, 2, 7, 4}));

        System.out.println(maximumProductDifference.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int s1 = nums[n - 1];
        int s2 = nums[n - 2];
        int s3 = nums[0];
        int s4 = nums[1];

        return (s1 * s2) - (s3 * s4);
    }
}
