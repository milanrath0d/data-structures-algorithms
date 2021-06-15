package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link IntegerDistribution}
 *
 * @author Milan Rathod
 */
class IntegerDistributionTest {

    @Test
    void getMinAndMax() {
        IntegerDistribution integerDistribution = new IntegerDistribution();

        long[] result = integerDistribution.getMinAndMax(new long[]{1, 2, 3, 4});

        assertArrayEquals(new long[]{6, 10}, result);
    }
}