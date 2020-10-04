package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://www.geeksforgeeks.org/painters-partition-problem/}
 *
 * @author Milan Rathod
 */
public class PainterPartitionProblem {

    /**
     * Exponential time complexity
     *
     * @param arr given array of integers consists of n boards
     * @param n   n boards
     * @param k   no. of painters
     * @return minimum time to paint all boards
     */
    public int partition(int[] arr, int n, int k) {

        // If only one board is there return 0th index value
        if (n == 1) {
            return arr[0];
        }

        // If only one painter is available then sum all boards
        if (k == 1) {
            return sum(arr, 0, n - 1);
        }

        int best = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            best = Math.min(best, Math.max(partition(arr, i, k - 1), sum(arr, i, n - 1)));
        }

        return best;
    }

    private int sum(int[] arr, int from, int to) {
        int total = 0;

        for (int i = from; i <= to; i++) {
            total += arr[i];
        }
        return total;
    }
}
