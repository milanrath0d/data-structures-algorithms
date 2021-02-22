package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import java.util.List;

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

        assertEquals(7, roysLifeCycle.getLongestCodingStreakPerDay(List.of("SSSSEEEECCCCEECCCC",
                "CCCCCSSSSEEECCCCSS", "SSSSSEEESSCCCCCCCS", "EESSSSCCCCCCSSEEEE")));

        assertEquals(9, roysLifeCycle.getLongestCodingStreakAcross());
    }
}