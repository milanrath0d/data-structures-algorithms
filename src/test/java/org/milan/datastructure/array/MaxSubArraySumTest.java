package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaxSubArraySum}
 *
 * @author Milan Rathod
 */
class MaxSubArraySumTest {

    private MaxSubArraySum maxSubArraySum;

    @BeforeEach
    void setup() {
        maxSubArraySum = new MaxSubArraySum();
    }

    @Test
    void testFind() {
        int[] input = {-2, -3, 4, -1, -2, 1, 5, -3};

        int result = maxSubArraySum.find(input);

        assertEquals(7, result);
    }

    @Test
    void testFind_NegativeNumbers() {
        int[] input = {-2, -3, -3};

        int result = maxSubArraySum.find(input);

        assertEquals(-2, result);
    }
}