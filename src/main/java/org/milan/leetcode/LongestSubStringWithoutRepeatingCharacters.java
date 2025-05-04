package org.milan.leetcode;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">...</a>}
 *
 * @author Milan Rathod
 */
public class LongestSubStringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String input) {
    int n = input.length();
    int maxLength = 0;
    int left = 0;
    int right = 0;
    
    // Use a boolean array to track character presence (covers ASCII characters)
    boolean[] charPresent = new boolean[256];

    while (right < n) {
      char currentChar = input.charAt(right);

      // If a character is already present, remove characters from the left
      // until the current character is no longer present
      while (charPresent[currentChar]) {
        charPresent[input.charAt(left)] = false;
        left++;
      }

      charPresent[currentChar] = true;
      maxLength = Math.max(maxLength, right - left + 1);
      right++;
    }
    return maxLength;
  }
}
