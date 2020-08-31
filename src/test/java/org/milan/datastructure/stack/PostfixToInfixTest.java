package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PostfixToInfix}
 *
 * @author Milan Rathod
 */
class PostfixToInfixTest {

    @Test
    void testConversion() {
        PostfixToInfix postfixToInfix = new PostfixToInfix();

        assertEquals("((a*b)+c)", postfixToInfix.conversion("ab*c+"));
    }
}