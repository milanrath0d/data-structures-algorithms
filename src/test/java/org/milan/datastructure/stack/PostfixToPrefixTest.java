package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class {@link PostfixToPrefix}
 *
 * @author Milan Rathod
 */
class PostfixToPrefixTest {

    @Test
    void testConversion() {
        PostfixToPrefix postfixToPrefix = new PostfixToPrefix();

        assertEquals("*+AB-CD", postfixToPrefix.conversion("AB+CD-*"));
    }
}