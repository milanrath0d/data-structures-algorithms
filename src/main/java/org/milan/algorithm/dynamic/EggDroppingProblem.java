package org.milan.algorithm.dynamic;

/**
 * Refer {@link @https://www.geeksforgeeks.org/egg-dropping-puzzle-dp-11/}
 *
 * @author Milan Rathod
 */
public class EggDroppingProblem {

    /**
     * Recursive approach
     * <p>
     * Time complexity: exponential
     * Space complexity: O(1)
     *
     * @param n number of eggs
     * @param k number of floors
     */
    public int minimumTrialsRecursive(int n, int k) {

        // If there are no floors no trials needed
        // If there is only one floor one trial needed
        if (k == 1 || k == 0) {
            return k;
        }

        // If there is only one egg then we need k trials for k floors
        if (n == 1) {
            return k;
        }

        int min = Integer.MAX_VALUE;
        int x, out;

        for (x = 1; x <= k; x++) {
            out = Math.max(minimumTrialsRecursive(n - 1, x - 1), minimumTrialsRecursive(n, k - x));

            if (out < min) {
                min = out;
            }
        }
        return min + 1;
    }

    /**
     * Dynamic Programming
     * <p>
     * Time complexity: O(n*k*k)
     * Space complexity: O(n*k)
     *
     * @param n number of eggs
     * @param k number of floors
     */
    public int minimumTrials(int n, int k) {

        // A 2D table where entry store[i][j] will represent minimum
        // number of tried needed for i eggs and j floors
        int[][] store = new int[n + 1][k + 1];

        // We need one trial for one floor and zero trial for zero floor
        for (int i = 1; i <= n; i++) {
            store[i][1] = 1;
            store[i][0] = 0;
        }

        // We need j trials for one egg and j floors
        for (int j = 1; j <= k; j++) {
            store[1][j] = j;
        }

        int out;

        // Fill the rest of the entries in the table
        // using optimal substructure property
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                store[i][j] = Integer.MAX_VALUE;

                for (int x = 1; x <= j; x++) {
                    out = 1 + Math.max(store[i - 1][x - 1], store[i][j - x]);
                    if (out < store[i][j]) {
                        store[i][j] = out;
                    }
                }
            }
        }

        return store[n][k];
    }

}
