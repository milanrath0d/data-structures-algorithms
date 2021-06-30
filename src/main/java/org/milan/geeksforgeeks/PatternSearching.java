package org.milan.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: String pattern searching
 * <p>
 * Naive Approach:
 * {@link @https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/}
 * <p>
 * KMP (Knuth Morris Pratt) Pattern Searching:
 * {@link @https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/}
 *
 * @author Milan Rathod
 */
public class PatternSearching {

    /**
     * Naive approach
     * <p>
     * Time complexity: O(m*n)
     *
     * @param text    text
     * @param pattern pattern
     * @return list of indexes where pattern is matched in text
     */
    public List<Integer> search(String text, String pattern) {
        List<Integer> output = new ArrayList<>();

        int m = pattern.length();
        int n = text.length();

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // Pattern matched
            if (j == m) {
                output.add(i);
            }
        }

        return output;
    }

    /**
     * KMP (Knuth Morris Pratt) Pattern Searching
     * <p>
     * Time complexity: O(m*n)
     * TODO complete this
     *
     * @param text    text
     * @param pattern pattern
     * @return list of indexes where pattern is matched in text
     */
    public List<Integer> searchV2(String text, String pattern) {
        return null;
    }
}
