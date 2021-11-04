package org.milan.leetcode;

import java.util.Arrays;

/**
 * Refer {@link @https://leetcode.com/problems/valid-triangle-number/}
 *
 * @author Milan Rathod
 */
public class ValidTriangleNumber {

    public int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int result = 0;

        for (int i = 2; i < nums.length; i++) {

            int start = 0;
            int end = i - 1;

            while (start < end) {
                if (nums[start] + nums[end] > nums[i]) {
                    result += (end - start);
                    end--;
                } else {
                    start++;
                }
            }

        }

        return result;
    }

}
