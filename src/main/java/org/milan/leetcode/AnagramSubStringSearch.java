package org.milan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/description/">...</a>}
 *
 * @author Milan Rathod
 */
public class AnagramSubStringSearch {

  public List<Integer> findAnagrams(String s, String p) {
    if (s == null || p == null || s.length() < p.length()) {
      return Collections.emptyList();
    }

    int n = s.length();
    int m = p.length();
    List<Integer> result = new ArrayList<>();
    int[] countP = new int[256], countS = new int[256];

    for (int i = 0; i < m; i++) {
      countP[p.charAt(i)]++;
      countS[s.charAt(i)]++;
    }

    for (int i = m; i < n; i++) {
      if (Arrays.equals(countP, countS)) {
        result.add(i - m);
      }
      countS[s.charAt(i)]++;
      countS[s.charAt(i - m)]--;
    }

    if (Arrays.equals(countP, countS)) {
      result.add(n - m);
    }
    return result;
  }
}
