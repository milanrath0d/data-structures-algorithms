package org.milan.geeksforgeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Refer {@link @https://www.geeksforgeeks.org/find-all-strings-that-match-specific-pattern-in-a-dictionary/}
 *
 * @author Milan Rathod
 */
public class DictionaryPatternMatching {

    /**
     * Time complexity: O(N*K) where k is word's length
     * Space complexity: O(N)
     *
     * @param dictionary dictionary of words
     * @param pattern    pattern to match
     * @return list of matched words with pattern
     */
    public List<String> findMatchedWords(List<String> dictionary, String pattern) {
        int n = pattern.length();

        String hash = encode(pattern);

        List<String> outputList = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() == pattern.length() && encode(word).equals(hash)) {
                outputList.add(word);
            }
        }

        return outputList;
    }

    /**
     * Time complexity: O(N*K) where k is word's length
     * Space complexity: O(N)
     *
     * @param dictionary dictionary of words
     * @param pattern    pattern to match
     * @return list of matched words with pattern
     */
    public List<String> findMatchedWordsV2(List<String> dictionary, String pattern) {
        int n = pattern.length();

        List<String> outputList = new ArrayList<>();

        for (String word : dictionary) {
            if (word.length() == pattern.length() && check(pattern, word)) {
                outputList.add(word);
            }
        }

        return outputList;
    }

    private String encode(String str) {
        Map<Character, Integer> map = new HashMap<>();

        StringBuilder output = new StringBuilder();

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, counter++);
            }

            output.append(map.get(ch));
        }

        return output.toString();
    }

    private boolean check(String pattern, String word) {
        int[] ch = new int[128];
        int n = pattern.length();

        for (int i = 0; i < n; i++) {
            if (ch[pattern.charAt(i)] == 0) {
                ch[pattern.charAt(i)] = word.charAt(i);
            } else if (ch[pattern.charAt(i)] != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
