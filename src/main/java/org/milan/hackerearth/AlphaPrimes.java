package org.milan.hackerearth;

/**
 * Problem Statement {@link @https://www.hackerearth.com/problem/algorithm/chandu-and-primes-1/}
 *
 * @author Milan Rathod
 */
public class AlphaPrimes {

    private static final int[] count;

    static {
        boolean[] arr = new boolean[1000001];
        for (int i = 2; i < arr.length; i++)
            arr[i] = true;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                for (int j = i << 1; j < arr.length; j += i)
                    arr[j] = false;
            }
        }

        for (int i = 2, j = 10; i < arr.length; i++) {
            if (i == j)
                j *= 10;

            if (arr[i]) {
                for (int k = j + i; k < arr.length; k += j)
                    arr[k] = true;
            }
        }

        count = new int[1000001];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i])
                count[i] = count[i - 1] + 1;
            else
                count[i] = count[i - 1];
        }
    }

    public int getCount(int left, int right) {

        return count[right] - count[left - 1];

    }
}
