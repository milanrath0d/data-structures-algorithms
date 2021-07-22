package org.milan.leetcode;

import java.util.PriorityQueue;

/**
 * Refer {@link @https://leetcode.com/problems/eliminate-maximum-number-of-monsters/}
 *
 * @author Milan Rathod
 */
public class EliminateMonsters {

    public int eliminateMaximum(int[] dist, int[] speed) {

        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < dist.length; i++) {
            priorityQueue.add(dist[i] * 1.0 / speed[i]);
        }

        int count = 0;

        double min = 0;

        while (!priorityQueue.isEmpty() && priorityQueue.poll() > min) {
            min += 1.0;
            count++;
        }

        return count;
    }

}
