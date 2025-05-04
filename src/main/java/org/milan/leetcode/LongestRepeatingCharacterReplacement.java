package org.milan.leetcode;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/longest-repeating-character-replacement/">...</a>}
 *
 * @author Milan Rathod
 */
public class LongestRepeatingCharacterReplacement {

  public int characterReplacement(String s, int k) {
    int[] count = new int[26];
    int maxLength = 0;
    int maxCount = 0;
    int left = 0;
    int right = 0;

    while (right < s.length()) {
      final int endChar = s.charAt(right) - 'A';

      count[endChar]++;
      maxCount = Math.max(maxCount, count[endChar]);

      if (right - left + 1 - maxCount > k) {
        final int leftChar = s.charAt(left) - 'A';
        count[leftChar]--;
        left++;
      }

      maxLength = Math.max(maxLength, right - left + 1);
      right++;
    }
    return maxLength;
  }

}
