package org.milan.misc;

/**
 * Problem: {@link @https://codeforces.com/problemset/problem/965/D}
 * <p>
 * Two pointers sliding window problem
 *
 * @author Milan Rathod
 */
public class SingleUseStones {

    public int maxFrogsCrossingRiver(int w, int l, int[] river) {
        int sum = 0;

        for (int i = 0; i < l; i++) {
            sum += river[i];
        }

        int minValue = sum;

        for (int i = l; i < w - 1; i++) {
            sum = sum - river[i - l] + river[i];
            minValue = Math.min(minValue, sum);
        }

        return minValue;
    }
}
