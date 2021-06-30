package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BuySellStock}
 *
 * @author Milan Rathod
 */
class BuySellStockTest {

    @Test
    void maxProfit() {
        BuySellStock buySellStock = new BuySellStock();

        assertEquals(5, buySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        assertEquals(0, buySellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}