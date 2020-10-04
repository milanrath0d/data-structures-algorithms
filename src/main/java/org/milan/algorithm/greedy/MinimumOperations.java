package org.milan.algorithm.greedy;

/**
 * Refer {@link @https://www.geeksforgeeks.org/minimum-cost-to-reach-a-point-n-from-0-with-two-different-operations-allowed/}
 *
 * @author Milan Rathod
 */
public class MinimumOperations {

    public int minimumCost(int N, int P, int Q) {
        // Initialize cost to 0
        int cost = 0;

        // going backwards until we
        // reach initial position
        while (N > 0) {

            if ((N & 1) > 0) {
                cost += P;
                N--;
            } else {
                int temp = N / 2;

                // if 2*X jump is
                // better than X+1
                if (temp * P > Q)
                    cost += Q;
                    // if X+1 jump is better
                else
                    cost += P * temp;

                N /= 2;
            }
        }

        // return cost
        return cost;
    }
}
