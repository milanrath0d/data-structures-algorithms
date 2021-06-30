package org.milan.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * TODO solve this
 * <p>
 * Refer {@link @https://leetcode.com/problems/maximum-alternating-subsequence-sum/}
 *
 * @author Milan Rathod
 */
public class MaximumAlternatingSubsequenceSum {

    public static void main(String[] args) {
        MaximumAlternatingSubsequenceSum maximumAlternatingSubsequenceSum = new MaximumAlternatingSubsequenceSum();

        System.out.println(maximumAlternatingSubsequenceSum.maxAlternatingSum(new int[]{4, 2, 5, 3}));

        System.out.println(maximumAlternatingSubsequenceSum.maxAlternatingSum(new int[]{5, 6, 7, 8}));

        System.out.println(maximumAlternatingSubsequenceSum.maxAlternatingSum(new int[]{6, 2, 1, 2, 4, 5}));
    }

    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;

        List<Integer> increasingList = new LinkedList<>();

        List<Integer> decreasingList = new LinkedList<>();

        increasingList.add(nums[0]);

        boolean flag = true;

        for (int i = 0; i < n; ) {


            if (flag) {
                int temp = Integer.MAX_VALUE;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] > nums[j]) {
                        temp = Math.min(temp, nums[j]);
                    } else {
                        i = j - 1;
                        break;
                    }
                }

                if (temp != 0) {
                    decreasingList.add(temp);
                    flag = false;
                }
            } else {
                int temp = Integer.MIN_VALUE;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] < nums[j]) {
                        temp = Math.max(temp, nums[j]);
                    } else {
                        i = j - 1;
                        break;
                    }
                }

                if (temp != 0) {
                    increasingList.add(temp);
                    flag = true;
                }
            }

        }

        int sum1 = increasingList.stream().mapToInt(integer -> integer).sum();
        int sum2 = decreasingList.stream().mapToInt(integer -> integer).sum();

        return sum1 - sum2;
    }

}
