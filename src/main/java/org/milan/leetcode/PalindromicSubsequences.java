package org.milan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Refer {@link @https://leetcode.com/problems/unique-length-3-palindromic-subsequences/}
 *
 * @author Milan Rathod
 */
public class PalindromicSubsequences {

    public int countPalindromicSubsequence(String str) {
        int n = str.length();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (str.charAt(i) == str.charAt(k)) {
                        set.add("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                    }

                }

            }

        }

        return set.size();
    }
}
