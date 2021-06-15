package org.milan.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Refer {@link @https://www.hackerrank.com/challenges/sock-merchant/problem}
 *
 * @author Milan Rathod
 */
public class SalesByMatch {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param n   size of given array
     * @param arr given array
     * @return matching pairs
     */
    public int sockMerchant(int n, List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (map.containsKey(temp)) {
                map.computeIfPresent(temp, (key, val) -> val + 1);
            } else {
                map.put(temp, 1);
            }
        }

        int count = 0;

        for (Integer value : map.values()) {
            count += value / 2;
        }
        return count;
    }
}
