package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link CustomStack}
 *
 * @author Milan Rathod
 */
class CustomStackTest {

    @Test
    void testForIntegerType() {
        CustomStack<Integer> customStack = new CustomStack<>();

        assertTrue(customStack.isEmpty());

        // Push 4 integers to stack
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);

        assertEquals(4, customStack.size());

        Integer result = customStack.pop();

        assertEquals(4, result.intValue());

        result = customStack.pop();

        assertEquals(3, result.intValue());

        assertEquals(2, customStack.size());

        // Push 6 integers to stack
        customStack.push(5);
        customStack.push(6);
        customStack.push(7);
        customStack.push(8);
        customStack.push(9);
        customStack.push(10);

        assertEquals(8, customStack.size());

        assertTrue(customStack.contains(10));

        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();

        assertEquals(4, customStack.size());

        customStack.clear();

        assertTrue(customStack.isEmpty());
    }
}