package org.milan.hackerearth;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.binarySearch;

/**
 * Vegetable Market Problem
 * <p>
 * Problem: {@link @https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/vegetable-market-ea2b4462/}
 *
 * @author Milan Rathod
 */
public class VegetableMarket {

    public int minimumToBuy(List<Integer> stalls, int query) {
        return calculateMinimumQuantity(stalls.stream().mapToInt(i -> i).toArray(), query);
    }

    /**
     * Calculate Minimum Quantity required to fulfil requirement of vegetable distribution
     */
    private int calculateMinimumQuantity(int[] arr, int total) {

        int totalQuantitiesOfAllStalls = Arrays.stream(arr).sum();

        // Check if requirement can be fulfilled
        if (totalQuantitiesOfAllStalls < total) {
            return -1;
        }

        // Start the iteration
        int minimum = total / arr.length;

        int tempTotal = 0;

        while (true) {
            for (int element : arr) {
                tempTotal += Math.min(element, minimum);
            }

            if (tempTotal >= total) {
                return minimum;
            }

            tempTotal = 0;

            minimum++;
        }
    }

}
