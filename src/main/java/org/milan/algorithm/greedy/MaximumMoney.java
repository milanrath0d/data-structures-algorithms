package org.milan.algorithm.greedy;

/**
 * Refer {@link @https://www.geeksforgeeks.org/maximum-money-that-can-be-withdrawn-in-two-steps/}
 *
 * @author Milan Rathod
 */
public class MaximumMoney {

    public int find(int x, int y) {
        int maximumMoney = 0;

        int index = 2;
        while (index-- > 0) {
            if (x > y) {
                maximumMoney += x;
                x = x - 1;
            } else {
                maximumMoney += y;
                y = y - 1;
            }
        }

        return maximumMoney;
    }


}
