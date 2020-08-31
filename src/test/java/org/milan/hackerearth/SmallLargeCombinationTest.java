package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link SmallLargeCombination}
 *
 * @author Milan Rathod
 */
class SmallLargeCombinationTest {

    @Test
    void testComputeSmallLargeCount() {
        SmallLargeCombination smallLargeCombination = new SmallLargeCombination();
        long result = smallLargeCombination.computeSmallLargeCount(new long[]{5, 2, 3, 1, 4});

        assertEquals(3, result);
    }
}