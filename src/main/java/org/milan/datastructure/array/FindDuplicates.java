package org.milan.datastructure.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Milan Rathod
 */
public class FindDuplicates {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr given array of integers
     * @return array of duplicate elements
     */
    public int[] find(int[] arr) {
        Set<Integer> output = new HashSet<>();

        // First check all the values present in array
        // go to that values as indexes and increment by size of array
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }

        // Now check which value exists more than once
        // by dividing with the array size
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / arr.length > 1) {
                output.add(i);
            }
        }

        return output.stream().mapToInt(i -> i).toArray();
    }
}
