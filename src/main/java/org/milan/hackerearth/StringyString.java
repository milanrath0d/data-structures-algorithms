package org.milan.hackerearth;

import java.util.List;

/**
 * You are given N strings and one of them is invalid.
 * Every string has a weight equal to the sum of the weight of its characters.
 * The weights of characters are represented as follows:
 * <p>
 * Weight of a is 1
 * Weight of b is 2
 * Weight of c is 3
 * and so on.
 * <p>
 * You can perform the following operations on the strings:
 * <p>
 * Select a string and increase its weight by 1
 * Select a string and decrease its weight by 1
 * Your objective is to equalize weights of all strings except one (we call it invalid string)
 * by performing these operations any number of times.
 * Find the invalid string i.e equalize all strings except the invalid string to some weight w
 * such that number of required operations are minimum.
 * <p>
 * Example: Input: List<String> strings
 * {"chakshu", "pekka", "punk", "golem", "tyagi"}
 * <p>
 * Weight of string 'chakshu' is 3 + 8 + 1 +  11 + 18 + 8 + 20 = 71,
 * similarly for 'pekka',  'punk',  'golem' &  'tyagi' it is 44, 62, 52 & 62 respectively.
 * Now consider chakshu as invalid string, operations required to equalize rest are 28.
 * If pekka is invalid 19 operations are required.
 * If punk is invalid we need 37 moves to equalize.
 * Similarly for golem & tyagi we need 27 & 37 operations.
 * So pekka is a invalid string, as removing it requires least moves.
 *
 * @author Milan Rathod
 */
public class StringyString {

    public String invalidString(List<String> strings) {
        int n = strings.size();

        int[] weights = new int[n];

        // Calculates weights for all strings
        for (int i = 0; i < n; i++) {
            String input = strings.get(i);

            for (int j = 0; j < input.length(); j++) {
                weights[i] += input.charAt(j) - 96;
            }
        }

        int index = 0;
        int value = Integer.MAX_VALUE;

        int[] totals = new int[265];

        // Calculate totals
        for (int i = 1; i <= 260; i++) {
            for (int j = 0; j < n; j++) {
                totals[i] += Math.abs(weights[j] - i);
            }
        }

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = 260;
            int ans = 0;

            while (low <= high) {

                int mid = (low + high) / 2;

                int val1 = totals[mid] - Math.abs(weights[i] - mid);
                int val2 = totals[mid + 1] - Math.abs(weights[i] - mid - 1);
                if (val1 <= val2) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    ans = mid + 1;
                    low = mid + 1;
                }
            }

            int temp = totals[ans] - Math.abs(weights[i] - ans);
            if (value > temp) {
                index = i;
                value = temp;
            }
        }

        return strings.get(index);
    }
}
