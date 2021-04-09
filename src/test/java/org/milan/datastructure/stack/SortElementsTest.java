package org.milan.datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SortElements}
 *
 * @author Milan Rathod
 */
class SortElementsTest {

    private Stack<Integer> inputStack;

    private SortElements sortElements;

    @BeforeEach
    void setup() {
        inputStack = new Stack<>();
        inputStack.push(34);
        inputStack.push(3);
        inputStack.push(31);
        inputStack.push(98);
        inputStack.push(92);
        inputStack.push(23);

        sortElements = new SortElements();
    }

    @Test
    void testSortIterative() {
        Stack<Integer> sortedStack = sortElements.sortIterative(inputStack);

        testAssertion(sortedStack);
    }

    @Test
    void testSortRecursive() {
        sortElements.sortRecursive(inputStack);

        testAssertion(inputStack);
    }

    private void testAssertion(Stack<Integer> sortedStack) {
        assertEquals(6, sortedStack.size());

        assertEquals(98, sortedStack.pop().intValue());

        assertEquals(92, sortedStack.pop().intValue());

        assertEquals(34, sortedStack.pop().intValue());

        assertEquals(31, sortedStack.pop().intValue());

        assertEquals(23, sortedStack.pop().intValue());

        assertEquals(3, sortedStack.pop().intValue());
    }
}