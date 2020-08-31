package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link InfixToPostfix}
 *
 * @author Milan Rathod
 */
class InfixToPostfixTest {

    @Test
    void testConversion() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();

        String result = infixToPostfix.conversion("a+b*c+d");

        assertEquals("abc*+d+", result);

        result = infixToPostfix.conversion("a*b-(c+d)+e");

        assertEquals("ab*cd+-e+", result);
    }
}