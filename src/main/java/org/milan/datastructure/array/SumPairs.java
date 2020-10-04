package org.milan.datastructure.array;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

/**
 * @author Milan Rathod
 */
public class SumPairs {

    /**
     * Refer {@link @https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/}
     * <p>
     * Find all pairs for which their sum equal to given value of sum
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param arr input array of integers
     * @param sum sum
     * @return list of pairs
     */
    public List<Pair<Integer, Integer>> getAllPairs(int[] arr, int sum) {
        Set<Integer> mapping = new HashSet<>();

        List<Pair<Integer, Integer>> output = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];

            if (mapping.contains(temp)) {
                output.add(ImmutablePair.of(arr[i], temp));
            }
            mapping.add(arr[i]);
        }
        return output;
    }

    /**
     * Refer {@link @https://www.geeksforgeeks.org/check-exist-two-elements-array-whose-sum-equal-sum-rest-array/}
     * <p>
     * Check for a two elements whose sum equal to sum of rest of the array
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param arr input array of integers
     * @return list of pairs
     */
    public boolean checkPair(int[] arr) {

        // Find sum of the array
        int sum = Arrays.stream(arr).sum();

        // If sum of the array is not even then return empty pairs i.e. no pairs exists
        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;

        List<Pair<Integer, Integer>> pairs = getAllPairs(arr, sum);

        return pairs != null && !pairs.isEmpty();
    }

}