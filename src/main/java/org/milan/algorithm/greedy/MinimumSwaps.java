package org.milan.algorithm.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://www.geeksforgeeks.org/minimum-swaps-bracket-balancing/?ref=lbp}
 *
 * @author Milan Rathod
 */
public class MinimumSwaps {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param s input string of brackets
     * @return minimum number of swaps required for bracket balancing
     */
    public long swapCount(String s) {

        char[] arr = s.toCharArray();

        // Keep track of '['
        List<Integer> pos = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == '[')
                pos.add(i);
        }

        int count = 0; // To count number of encountered '['
        int p = 0;  // To track position of next '[' in pos
        long sum = 0; // To store result

        for (int i = 0; i < arr.length; ++i) {
            // Increment count and move p to next position
            if (arr[i] == '[') {
                ++count;
                ++p;
            } else if (arr[i] == ']')
                --count;

            // We have encountered an unbalanced part of string
            if (count < 0) {
                // Increment sum by number of swaps required
                // i.e. position of next '[' - current position
                sum += pos.get(p) - i;
                char temp = arr[i];
                arr[i] = arr[pos.get(p)];
                arr[pos.get(p)] = temp;
                ++p;

                // Reset count to 1
                count = 1;
            }
        }
        return sum;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param s input string of brackets
     * @return minimum number of swaps required for bracket balancing
     */
    public long swapCountV2(String s) {
        char[] chars = s.toCharArray();

        // stores total number of Left and Right
        // brackets encountered
        int countLeft = 0, countRight = 0;
        // swap stores the number of swaps required
        // imbalance maintains the number of imbalance pair
        int swap = 0, imbalance = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[') {
                // increment count of Left bracket
                countLeft++;
                if (imbalance > 0) {
                    // swaps count is last swap count + total
                    // number imbalanced brackets
                    swap += imbalance;
                    // imbalance decremented by 1 as it solved
                    // only one imbalance of Left and Right
                    imbalance--;
                }
            } else if (chars[i] == ']') {
                // increment count of Right bracket
                countRight++;
                // imbalance is reset to current difference
                // between Left and Right brackets
                imbalance = (countRight - countLeft);
            }
        }
        return swap;
    }
}
