package org.milan.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Complement}
 *
 * @author Milan Rathod
 */
class ComplementTest {

    private Complement complement;

    @BeforeEach
    void init() {
        complement = new Complement();
    }

    @Test
    void testOnesComplement() {
        assertEquals("0011", complement.onesComplement("1100"));
    }

    @Test
    void testTwosComplement() {
        assertEquals("0100", complement.twosComplement("1100"));

        assertEquals("01001", complement.twosComplement("10111"));
    }
}