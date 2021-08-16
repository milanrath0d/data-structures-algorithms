package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/}
 *
 * @author Milan Rathod
 */
public class ArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return convertUtil(nums, 0, nums.length - 1);
    }

    private TreeNode convertUtil(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        if (low == high) {
            return new TreeNode(nums[low]);
        }
        int mid = low + (high - low) / 2;
        return new TreeNode(nums[mid], convertUtil(nums, low, mid - 1), convertUtil(nums, mid + 1, high));
    }
}
