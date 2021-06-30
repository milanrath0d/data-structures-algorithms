package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/number-of-matching-subsequences/}
 *
 * @author Milan Rathod
 */
public class MatchingSubsequences {

    public int find(String s, String[] words) {

        int count = 0;

        for (String word : words) {

            if (isSubsequence(word, s)) {
                count++;
            }

        }

        return count;
    }

    public boolean isSubsequence(String word, String input) {

        int prev = 0;

        for (char ch : word.toCharArray()) {
            int index = input.indexOf(ch, prev);

            if (index == -1) {
                return false;
            }

            prev = index + 1;
        }

        return true;
    }

}
