package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link LinkedStack}
 *
 * @author Milan Rathod
 */
class LinkedStackTest {

    @Test
    void testStackOperations() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();

        assertTrue(linkedStack.isEmpty());

        linkedStack.push(10);

        linkedStack.push(20);

        assertFalse(linkedStack.isEmpty());

        assertEquals(2, linkedStack.size());

        assertEquals(20, linkedStack.peek().intValue());

        assertEquals(2, linkedStack.size());

        assertEquals(20, linkedStack.pop().intValue());

        assertEquals(10, linkedStack.pop().intValue());

        assertTrue(linkedStack.isEmpty());
    }

}