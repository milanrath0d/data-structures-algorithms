package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link PrefixToPostfix}
 *
 * @author Milan Rathod
 */
class PrefixToPostfixTest {

    @Test
    void testConversion() {
        PrefixToPostfix prefixToPostfix = new PrefixToPostfix();

        assertEquals("AB+CD-*", prefixToPostfix.conversion("*+AB-CD"));
    }
}