package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/}
 *
 * @author Milan Rathod
 */
public class BoundedMaximum {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int bucket1 = 0;
        int bucket2 = 0;

        int count = 0;

        for (int element : nums) {
            bucket1 = element < left ? bucket1 + 1 : 0;
            bucket2 = element <= right ? bucket2 + 1 : 0;
            count += bucket2 - bucket1;
        }

        return count;
    }

}
