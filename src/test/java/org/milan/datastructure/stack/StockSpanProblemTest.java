package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link StockSpanProblem}
 *
 * @author Milan Rathod
 */
class StockSpanProblemTest {

    @Test
    void testCalculateSpan() {
        StockSpanProblem stockSpanProblem = new StockSpanProblem();

        int[] result = stockSpanProblem.calculateSpan(new int[]{10, 4, 5, 90, 120, 80}, 6);

        assertArrayEquals(new int[]{1, 1, 2, 4, 5, 1}, result);
    }
}