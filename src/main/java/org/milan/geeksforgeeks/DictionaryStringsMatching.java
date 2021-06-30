package org.milan.geeksforgeeks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Refer {@link @https://www.geeksforgeeks.org/check-if-the-given-string-of-words-can-be-formed-from-words-present-in-the-dictionary/}
 *
 * @author Milan Rathod
 */
public class DictionaryStringsMatching {

    /**
     * Hashing based solution
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * Where n is size of dictionary
     *
     * @param dictionary dictionary of words
     * @param words      words to be matched in dictionary
     * @return true if all words are present in dictionary otherwise false
     */
    public boolean isMatched(List<String> dictionary, List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String text : dictionary) {
            if (!map.containsKey(text)) {
                map.put(text, 1);
            } else {
                map.put(text, map.get(text) + 1);
            }
        }

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    /**
     * Hashing based solution
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * Where n is size of dictionary
     * <p>
     * TODO complete this
     *
     * @param dictionary dictionary of words
     * @param words      words to be matched in dictionary
     * @return true if all words are present in dictionary otherwise false
     */
    public boolean isMatchedV2(List<String> dictionary, List<String> words) {
        return false;
    }

}
