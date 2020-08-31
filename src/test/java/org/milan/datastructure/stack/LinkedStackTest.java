package org.milan.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for {@link LinkedStack}
 *
 * @author Milan Rathod
 */
class LinkedStackTest {

    private LinkedStack<Integer> linkedStack;

    @BeforeEach
    void setup() {
        linkedStack = new LinkedStack<>();
    }

    @Test
    void testPush() {
        assertTrue(linkedStack.isEmpty());

        linkedStack.push(10);

        linkedStack.push(20);

        assertFalse(linkedStack.isEmpty());

        assertEquals(2, linkedStack.size());
    }

    @Test
    void testPop() {
        linkedStack.push(10);

        assertFalse(linkedStack.isEmpty());

        assertEquals(10, linkedStack.pop().intValue());

        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void testPeek() {
        linkedStack.push(10);

        assertFalse(linkedStack.isEmpty());

        assertEquals(10, linkedStack.peek().intValue());

        assertFalse(linkedStack.isEmpty());
    }

}