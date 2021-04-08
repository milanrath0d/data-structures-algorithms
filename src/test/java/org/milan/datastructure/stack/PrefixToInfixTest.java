package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PrefixToInfix}
 *
 * @author Milan Rathod
 */
class PrefixToInfixTest {

    @Test
    void testConversion() {
        PrefixToInfix prefixToInfix = new PrefixToInfix();

        assertEquals("((A+B)*(C-D))", prefixToInfix.conversion("*+AB-CD"));
    }
}