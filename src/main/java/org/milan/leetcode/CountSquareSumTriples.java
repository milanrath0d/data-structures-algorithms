package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/count-square-sum-triples/}
 *
 * @author Milan Rathod
 */
public class CountSquareSumTriples {

    public int countTriples(int n) {

        int count = 0;

        for (int a = 1; a <= n; a++) {

            for (int b = 1; b <= n; b++) {

                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                if (c % 1 == 0 && c <= n) {
                    count++;
                }
            }
        }

        return count;
    }
}
