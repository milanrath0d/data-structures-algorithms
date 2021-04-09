package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class {@link JumpOut}
 *
 * @author Milan Rathod
 */
class JumpOutTest {

    @Test
    void testMinimumLengthJump() {
        JumpOut jumpOut = new JumpOut();
        int result = jumpOut.minimumLengthJump(new int[]{4, 2, 4, 2, 3}, 5);

        assertEquals(3, result);
    }
}