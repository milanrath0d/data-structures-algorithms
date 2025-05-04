package org.milan.leetcode;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/longest-repeating-character-replacement/">...</a>}
 *
 * @author Milan Rathod
 */
public class MaxConsecutiveOnesAfterFlippingZeroes {

  public int longestOnes(int[] nums, int k) {
    int left = 0;
    int right = 0;
    int maxLength = 0;
    int countZeroes = 0;

    while (right < nums.length) {
      if (nums[right] == 0) {
        countZeroes++;
      }

      while (countZeroes > k) {
        if (nums[left] == 0) {
          countZeroes--;
        }
        left++;
      }

      maxLength = Math.max(maxLength, right - left + 1);
      right++;
    }

    return maxLength;

  }
}
