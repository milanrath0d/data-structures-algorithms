package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumSum}
 *
 * @author Milan Rathod
 */
class MaximumSumTest {

    private MaximumSum maximumSum;

    private int[] arr;

    @BeforeEach
    void setup() {
        maximumSum = new MaximumSum();

        arr = new int[]{5, 5, 10, 40, 50, 35};
    }

    @Test
    void testFindMax() {
        int result = maximumSum.findMax(arr);

        assertEquals(80, result);
    }

    @Test
    void testFindMaxV2() {
        int result = maximumSum.findMaxV2(arr);

        assertEquals(80, result);
    }
}