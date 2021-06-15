package org.milan.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Refer {@link @https://leetcode.com/problems/maximum-performance-of-a-team/}
 *
 * @author Milan Rathod
 */
public class MaximumPerformance {

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] ord = new int[n][2];

        for (int i = 0; i < n; i++) {
            ord[i] = new int[]{efficiency[i], speed[i]};
        }

        Arrays.sort(ord, (o1, o2) -> Integer.compare(o2[0], o1[0]));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        long totalSpeed = 0;
        long best = 0;

        for (int[] pair : ord) {
            int currentSpeed = pair[1];
            priorityQueue.add(currentSpeed);
            if (priorityQueue.size() <= k) {
                totalSpeed += currentSpeed;
            } else {
                totalSpeed += currentSpeed - priorityQueue.poll();
            }
            best = Math.max(best, totalSpeed * pair[0]);
        }
        return (int) (best % 1000000007);
    }
}
