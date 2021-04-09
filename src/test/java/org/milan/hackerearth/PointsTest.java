package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Points}
 *
 * @author Milan Rathod
 */
class PointsTest {

    @Test
    void testFindWays() {
        Points points = new Points();

        long result = points.findWays(new long[]{1, 10, 20, 30, 50}, 5, 19);

        assertEquals(1, result);
    }
}