package org.milan.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/minimum-window-substrin">...</a>g/}
 *
 * @author Milan Rathod
 */
public class MinimumWindowSubString {

  public String minWindow(String s, String t) {
    if (s.isEmpty() || t.isEmpty() || s.length() < t.length()) {
      return "";
    }

    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();
    for (char c : t.toCharArray()) {
      tMap.put(c, tMap.getOrDefault(c, 0) + 1);
    }

    int left = 0;
    int right = 0;
    int startIndex = -1;
    int minLength = Integer.MAX_VALUE;
    int count = 0;

    while (right < s.length()) {
      char rightChar = s.charAt(right);
      sMap.put(rightChar, sMap.getOrDefault(rightChar, 0) + 1);

      if (tMap.containsKey(rightChar) && sMap.get(rightChar) <= tMap.get(rightChar)) {
        count++;
      }

      if (count == t.length()) {
        while ((sMap.getOrDefault(s.charAt(left), 0) > tMap.getOrDefault(s.charAt(left), 0) || !tMap.containsKey(s.charAt(left)))) {
          char leftChar = s.charAt(left);
          if (sMap.get(leftChar) > tMap.getOrDefault(leftChar, 0)) {
            sMap.put(leftChar, sMap.get(leftChar) - 1);
          }
          left++;
        }
        if (right - left + 1 < minLength) {
          startIndex = left;
          minLength = right - left + 1;
        }
      }
      right++;
    }

    if (startIndex == -1) {
      return "";
    }

    return s.substring(startIndex, startIndex + minLength);
  }

}
