package org.milan.algorithm.dynamic;

/**
 * You are given an array of N integers.
 * You have to find the minimum cost that is required to cross the array by jumping from one element to another.
 * You need to start from the first element of the array and you can jump in both the directions,
 * but the length of forward jump must be two and length of backward jump must be one.
 * <p>
 * The cost of the forward and backward jump is the value of the element from which you are jumping.
 * <p>
 * If you are at the last element of the array then you can jump out of the array and
 * cost of that jump will be the value of the last element of array
 * <p>
 * Example:
 * N = 5 and arr = [1,2,3,4,100]
 * Cost of forward jump from 1st element to 3rd element is 1,
 * Cost of backward jump from 3rd element to 2nd element is 3,
 * Cost of forward jump from 2nd element to 4th element is 2,
 * Cost of forward jump from 4th element to out of the array is 4.
 * Total cost = 1 + 3 + 2 + 4 = 10
 *
 * @author Milan Rathod
 */
public class OptimumJump {

    public int find(int[] arr, int n) {
        int[] dp = new int[n];

        dp[0] = arr[0];

        if (n == 1 || n == 2) {
            return dp[0];
        } else {
            dp[1] = dp[0] + arr[1] + arr[2];
        }

        for (int i = 2; i < n; i++) {
            if (i == n - 1) {
                dp[i] = dp[i - 2] + arr[i];
            } else {
                dp[i] = Math.min(dp[i - 2] + arr[i], dp[i - 1] + arr[i] + arr[i + 1]);
            }
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
