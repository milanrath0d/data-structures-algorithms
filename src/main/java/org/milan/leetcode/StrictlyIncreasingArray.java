package org.milan.leetcode;

/**
 * TODO refactor this
 * <p>
 * Refer {@link @https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/}
 *
 * @author Milan Rathod
 */
public class StrictlyIncreasingArray {

    public static void main(String[] args) {
        System.out.println(new StrictlyIncreasingArray().canBeIncreasing(new int[]{1, 1, 1}));
    }

    public boolean canBeIncreasing(int[] nums) {
        // Stores the count of numbers that
        // are needed to be removed
        int count = 0;

        int n = nums.length;

        // Store the index of the element
        // that needs to be removed
        int index = -1;

        // Traverse the range [1, N - 1]
        for (int i = 1; i < n; i++) {

            // If arr[i-1] is greater than
            // or equal to arr[i]
            if (nums[i - 1] >= nums[i]) {

                // Increment the count by 1
                count++;

                // Update index
                index = i;
            }
        }

        // If count is greater than one
        if (count > 1)
            return false;

        // If no element is removed
        if (count == 0)
            return true;

        // If only the last or the
        // first element is removed
        if (index == n - 1 || index == 1)
            return true;

        // If a[index] is removed
        if (nums[index - 1] < nums[index + 1])
            return true;

        // If a[index - 1] is removed
        if (nums[index - 2] < nums[index])
            return true;

        return false;
    }

}
