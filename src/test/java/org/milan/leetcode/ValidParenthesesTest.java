package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link ValidParentheses}
 *
 * @author Milan Rathod
 */
class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();

        assertTrue(validParentheses.isValid("()"));

        assertTrue(validParentheses.isValid("()[]{}"));

        assertFalse(validParentheses.isValid("(]"));

        assertFalse(validParentheses.isValid("([)]"));

        assertTrue(validParentheses.isValid("{[]}"));
    }
}