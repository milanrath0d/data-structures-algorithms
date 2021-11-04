package org.milan.leetcode;

import java.util.*;

/**
 * Refer {@link @https://leetcode.com/problems/word-pattern/}
 *
 * @author Milan Rathod
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!map.containsKey(ch)) {
                if (set.contains(word)) {
                    return false;
                }
                map.put(ch, word);
                set.add(word);
            } else if (!map.get(ch).equals(word)) {
                return false;
            }
        }

        return true;
    }

    public boolean wordPatternV2(String pattern, String s) {
        String[] words = s.split("\\s");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!Objects.equals(map.put(String.valueOf(ch), i), map.put(word, i))) {
                return false;
            }
        }

        return true;
    }
}
