package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link VegetableMarket}
 *
 * @author Milan Rathod
 */
class VegetableMarketTest {

    @Test
    void testMinimumToBuy() {
        VegetableMarket vegetableMarket = new VegetableMarket();

        int result = vegetableMarket.minimumToBuy(List.of(3, 8, 4, 1, 7), 22);

        assertEquals(7, result);

        result = vegetableMarket.minimumToBuy(List.of(3, 8, 4, 1, 7), 25);

        assertEquals(-1, result);
    }
}