package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link RoysLifeCycle}
 *
 * @author Milan Rathod
 */
class RoysLifeCycleTest {

    @Test
    void testGetLongestCodingStreakPerDay() {

        RoysLifeCycle roysLifeCycle = new RoysLifeCycle();

        int result = roysLifeCycle.getLongestCodingStreakPerDay("SSSSEEEECCCCEECCCC");

        assertEquals(4, result);

        result = roysLifeCycle.getLongestCodingStreakPerDay("CCCCCSSSSEEECCCCSS");

        assertEquals(5, result);

        result = roysLifeCycle.getLongestCodingStreakPerDay("SSSSSEEESSCCCCCCCS");

        assertEquals(7, result);

        result = roysLifeCycle.getLongestCodingStreakPerDay("EESSSSCCCCCCSSEEEE");

        assertEquals(6, result);

        assertEquals(9, roysLifeCycle.getLongestCodingStreakAcross());
    }
}