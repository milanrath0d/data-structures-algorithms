package org.milan.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

/**
 * Refer {@link @https://practice.geeksforgeeks.org/problems/frequency-game/1}
 *
 * @author Milan Rathod
 */
public class FrequencyGame {

    /**
     * Time and Space complexity: O(n)
     *
     * @param arr given array
     * @return maximum element with minimum frequency
     */
    public int findLargeButMinimumFrequencyElement(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int largestElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.getOrDefault(largestElement, Integer.MAX_VALUE) > entry.getValue()) {
                largestElement = entry.getKey();
            } else if (map.get(largestElement).equals(entry.getValue())) {
                if (largestElement < entry.getKey())
                    largestElement = entry.getKey();
            }
        }
        return largestElement;
    }
}
