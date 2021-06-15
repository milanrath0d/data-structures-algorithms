package org.milan.geeksforgeeks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link PatternJumping}
 *
 * @author Milan Rathod
 */
class PatternJumpingTest {

    private PatternJumping patternJumping;

    @BeforeEach
    void setUp() {
        patternJumping = new PatternJumping();
    }

    @Test
    void isJumpPossible() {
        assertTrue(patternJumping.isJumpPossible(16));

        assertFalse(patternJumping.isJumpPossible(15));

        assertFalse(patternJumping.isJumpPossible(31));
    }

    @Test
    void isJumpPossibleV2() {
        assertTrue(patternJumping.isJumpPossibleV2(16));

        assertFalse(patternJumping.isJumpPossibleV2(15));

        assertFalse(patternJumping.isJumpPossibleV2(31));
    }
}