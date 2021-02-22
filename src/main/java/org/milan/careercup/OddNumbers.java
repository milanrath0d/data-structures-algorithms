package org.milan.careercup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find two numbers which are present odd number of times in integer array
 * <p>
 * {@link @https://www.careercup.com/question?id=16306671}
 *
 * @author Milan Rathod
 */
public class OddNumbers {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param arr given array
     * @return list of integers which are present in array odd number of times
     */
    public List<Integer> findOddNumbers(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> outputList = new ArrayList<>();

        for (int element : arr) {
            Integer frequency = map.get(element);
            map.put(element, (frequency == null) ? 1 : frequency + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                outputList.add(entry.getKey());
            }
        }
        return outputList;
    }

}