package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialNumbersTest {

    @Test
    void minCost() {
        SpecialNumbers specialNumbers = new SpecialNumbers();

        long minCost = specialNumbers.minCost(4, 7, 8);

        assertEquals(32, minCost);

        minCost = specialNumbers.minCost(804289384, 846930887, 681692778);

        assertEquals(113822129813944002L, minCost);

        minCost = specialNumbers.minCost(714636916, 957747794, 424238336);

        assertEquals(42850764530461332L, minCost);
    }
}