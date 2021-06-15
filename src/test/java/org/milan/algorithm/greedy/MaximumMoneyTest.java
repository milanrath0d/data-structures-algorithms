package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumMoney}
 *
 * @author Milan Rathod
 */
class MaximumMoneyTest {

    @Test
    void find() {
        MaximumMoney maximumMoney = new MaximumMoney();

        int result = maximumMoney.find(6, 3);

        assertEquals(11, result);

        result = maximumMoney.find(4, 4);

        assertEquals(8, result);
    }
}