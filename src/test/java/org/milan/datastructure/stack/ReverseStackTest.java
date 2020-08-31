package org.milan.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link ReverseStack}
 *
 * @author Milan Rathod
 */
class ReverseStackTest {

    private ReverseStack reverseStack;

    private Stack<Integer> stack;

    @BeforeEach
    void setup() {
        stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        reverseStack = new ReverseStack(stack);
    }

    @Test
    void testReverse() {
        reverseStack.reverse();

        assertEquals(3, stack.size());

        assertEquals(34, stack.pop().intValue());

        assertEquals(3, stack.pop().intValue());

        assertEquals(31, stack.pop().intValue());

        assertTrue(stack.isEmpty());
    }
}