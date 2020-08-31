package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link InfixToPrefix}
 *
 * @author Milan Rathod
 */
class InfixToPrefixTest {

    @Test
    void testConversion() {
        InfixToPrefix infixToPrefix = new InfixToPrefix();

        assertEquals("*-A/BC-/AKL", infixToPrefix.conversion("(A-B/C)*(A/K-L)"));
    }
}