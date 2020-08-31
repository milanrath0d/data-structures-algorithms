package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumSteps}
 *
 * @author Milan Rathod
 */
class MinimumStepsTest {

    private MinimumSteps minimumSteps;

    @BeforeEach
    void setUp() {
        minimumSteps = new MinimumSteps();
    }

    @Test
    void testMinSteps() {
        int result = minimumSteps.minSteps(0, 2, 0);

        assertEquals(3, result);
    }

    @Test
    void testMinStepsV2() {
        int result = minimumSteps.minSteps(5);

        assertEquals(5, result);
    }
}