package org.milan.leetcode;

import java.util.Arrays;

/**
 * Refer {@link @https://leetcode.com/problems/candy/}
 *
 * @author Milan Rathod
 */
public class Candy {

    public int candy(int[] ratings) {

        int n = ratings.length;

        int[] count = new int[n];

        // Since each child must have at least one candy
        Arrays.fill(count, 1);

        // Traverse the array from left to right
        // If the rating of element at (i + 1) index is greater than ith index element
        // then set the count of (i + 1)th element as one more than the ith element count
        for (int i = 0; i < n - 1; i++) {
            if (ratings[i] < ratings[i + 1]) {
                count[i + 1] = count[i] + 1;
            }
        }

        // Traverse the array from right to left
        // If the rating of element at (i - 1) index is greater than ith index element and count of ith element is less
        // than one more than (i - 1)th element's count then set the count of (i - 1)th element as one more than the ith element count
        for (int i = n - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && (count[i - 1] < (count[i] + 1))) {
                count[i - 1] = count[i] + 1;
            }
        }

        return Arrays.stream(count).reduce(0, Integer::sum);
    }
}
