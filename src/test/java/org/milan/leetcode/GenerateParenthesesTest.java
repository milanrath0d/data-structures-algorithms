package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link GenerateParentheses}
 *
 * @author Milan Rathod
 */
class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        GenerateParentheses generateParentheses = new GenerateParentheses();

        assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"),
            generateParentheses.generateParenthesis(3));

        assertEquals(Collections.singletonList("()"), generateParentheses.generateParenthesis(1));
    }
}