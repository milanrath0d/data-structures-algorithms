package org.milan.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Refer {@link @https://leetcode.com/problems/jump-game-vi/}
 *
 * @author Milan Rathod
 */
public class JumpGame {

    /**
     * Using dynamic programming
     * <p>
     * Time complexity: O(n*n)
     * Space complexity: O(n)
     *
     * @param arr array of integers
     * @return maximum possible jumps
     */
    public int maxJumps(int[] arr, int k) {

        int n = arr.length;

        int[] jumps = new int[n];

        Arrays.fill(jumps, Integer.MIN_VALUE);

        jumps[0] = arr[0];

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= k && i - j >= 0; j++) {
                jumps[i] = Math.max(jumps[i], jumps[i - j] + arr[i]);
            }
        }

        return jumps[n - 1];
    }

    /**
     * Using dynamic programming
     * <p>
     * Time complexity: O(n*n)
     * Space complexity: O(n)
     *
     * @param arr array of integers
     * @return maximum possible jumps
     */
    public int maxJumpsV2(int[] arr, int k) {

        int n = arr.length;

        int[] jumps = new int[n];

        PriorityQueue<Point> maxHeap = new PriorityQueue<>((o1, o2) -> o2.value - o1.value);

        jumps[0] = arr[0];

        maxHeap.add(new Point(0, arr[0]));

        for (int i = 1; i < n; i++) {

            while (maxHeap.peek().index + k < i) {
                maxHeap.poll();
            }

            jumps[i] = arr[i] + jumps[maxHeap.peek().index];
            maxHeap.add(new Point(i, jumps[i]));
        }

        return jumps[n - 1];
    }

    private static class Point {
        private final int index;

        private final int value;

        public Point(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
