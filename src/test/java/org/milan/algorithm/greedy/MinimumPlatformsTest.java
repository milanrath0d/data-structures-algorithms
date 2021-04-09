package org.milan.algorithm.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumPlatforms}
 *
 * @author Milan Rathod
 */
class MinimumPlatformsTest {

    private MinimumPlatforms minimumPlatforms;

    private int[] arrivals;

    private int[] departures;

    @BeforeEach
    void setup() {
        minimumPlatforms = new MinimumPlatforms();

        arrivals = new int[]{900, 940, 950, 1100, 1500, 1800};

        departures = new int[]{910, 1200, 1120, 1130, 1900, 2000};
    }

    @Test
    void getMinimumPlatformsNaive() {
        int result = minimumPlatforms.getMinimumPlatformsNaive(arrivals, departures);

        assertEquals(3, result);
    }

    @Test
    void getMinimumPlatforms() {
        int result = minimumPlatforms.getMinimumPlatforms(arrivals, departures);

        assertEquals(3, result);
    }

    @Test
    void getMinimumPlatformsV2() {
        int result = minimumPlatforms.getMinimumPlatformsV2(arrivals, departures);

        assertEquals(3, result);
    }
}