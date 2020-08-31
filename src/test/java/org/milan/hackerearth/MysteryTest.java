package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * test class for {@link Mystery}
 *
 * @author Milan Rathod
 */
class MysteryTest {

    @Test
    void testSolve() {
        Mystery mystery = new Mystery();
        int result = mystery.solve(14, 5, 9);

        assertEquals(464, result);
    }
}