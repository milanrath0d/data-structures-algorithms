package org.milan.careercup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link PerfectSquare}
 *
 * @author Milan Rathod
 */
class PerfectSquareTest {

    @Test
    void testIsPerfectSquare() {
        PerfectSquare perfectSquare = new PerfectSquare();

        boolean result = perfectSquare.isPerfectSquare(25, true);

        assertTrue(result);

        result = perfectSquare.isPerfectSquare(29, true);

        assertFalse(result);

        result = perfectSquare.isPerfectSquare(25, false);

        assertTrue(result);

        result = perfectSquare.isPerfectSquare(29, false);

        assertFalse(result);
    }
}