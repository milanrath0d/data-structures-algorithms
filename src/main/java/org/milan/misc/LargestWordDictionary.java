package org.milan.misc;

import java.util.List;

/**
 * Refer {@linkplain @https://www.geeksforgeeks.org/find-largest-word-dictionary-deleting-characters-given-string/}
 *
 * @author Milan Rathod
 */
public class LargestWordDictionary {

    /**
     * @param dictionary dictionary of words
     * @param str        matching string
     * @return largest word present in dictionary which is subsequence of str
     */
    public String findLargestWord(List<String> dictionary, String str) {
        String result = "";
        int length = 0;

        for (String word : dictionary) {
            if (length <= word.length() && isSubSequence(word, str)) {
                if (word.length() == length && result.compareTo(word) > 0) {
                    result = word;
                } else if (word.length() != length) {
                    result = word;
                    length = word.length();
                }
            }
        }

        return result;
    }

    /**
     * Check if given word is subsequence of str
     */
    private boolean isSubSequence(String word, String str) {
        int m = word.length();
        int n = str.length();

        int j = 0;

        // Traverse word and str and compare current
        // character of str with unmatched character of word
        // if matched then move ahead in word
        for (int i = 0; i < n && j < m; i++) {
            if (str.charAt(i) == word.charAt(j)) {
                j++;
            }
        }

        // If all character of word are found in str
        return j == m;
    }
}
