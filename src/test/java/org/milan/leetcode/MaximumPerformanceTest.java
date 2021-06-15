package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumPerformance}
 *
 * @author Milan Rathod
 */
class MaximumPerformanceTest {

    @Test
    void maxPerformance() {
        MaximumPerformance maximumPerformance = new MaximumPerformance();

        int[] speed = new int[]{2, 10, 3, 1, 5, 8};

        int[] efficiency = new int[]{5, 4, 3, 9, 7, 2};

        assertEquals(60, maximumPerformance.maxPerformance(6, speed, efficiency, 2));

        assertEquals(68, maximumPerformance.maxPerformance(6, speed, efficiency, 3));

        assertEquals(72, maximumPerformance.maxPerformance(6, speed, efficiency, 4));
    }
}