package org.milan.algorithm.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link MinimumPlatforms}
 *
 * @author Milan Rathod
 */
class MinimumPlatformsTest {

    private MinimumPlatforms minimumPlatforms;

    @BeforeEach
    void setup() {
        minimumPlatforms = new MinimumPlatforms();
    }

    @Test
    void testComputeMinimumPlatforms() {
        int result = minimumPlatforms.getMinimumPlatforms(new int[]{900, 940, 950, 1100, 1200, 1200},
                new int[]{910, 1200, 1130, 1200, 1900, 2000});

        assertEquals(3, result);
    }

    @Test
    void testComputeMinimumPlatformsV2() {
        int result = minimumPlatforms.getMinimumPlatformsV2(new int[]{900, 940, 950, 1100, 1200, 1200},
                new int[]{910, 1200, 1130, 1200, 1900, 2000});

        assertEquals(3, result);
    }
}