package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ReverseStack}
 *
 * @author Milan Rathod
 */
class ReverseStackTest {

    private ReverseStack reverseStack;

    @BeforeEach
    void setUp() {
        reverseStack = new ReverseStack();
    }

    @Test
    void testReverse() {
        reverseStack.push(10);
        reverseStack.push(20);
        reverseStack.push(30);

        reverseStack.reverse();

        assertEquals(10, reverseStack.pop());

        assertEquals(20, reverseStack.pop());

        assertEquals(30, reverseStack.pop());
    }
}