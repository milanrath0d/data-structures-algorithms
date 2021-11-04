package org.milan.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * refer {@link @https://www.geeksforgeeks.org/count-words-appear-exactly-two-times-array-words/}
 *
 * @author Milan Rathod
 */
public class TwiceCounter {

    /**
     * @param str array of strings
     * @param n   array size
     * @return count of words which occurred twice
     */
    public int countWords(String[] str, int n) {
        // Map to store count of each word
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(str[i])) {
                int get = map.get(str[i]);
                map.put(str[i], get + 1);
            } else {
                map.put(str[i], 1);
            }
        }

        return (int) map
            .entrySet()
            .stream()
            .filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 2)
            .count();
    }
}
