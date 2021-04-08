package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Array2Stacks}
 *
 * @author Milan Rathod
 */
class Array2StacksTest {

    @Test
    void testStackOperations() {
        Array2Stacks<Integer> a2s = new Array2Stacks<>(Integer.class, 10);
        a2s.push(1, 5);
        Integer result = a2s.pop(1);
        assertEquals(5, result);

        a2s.push(2, 10);
        result = a2s.pop(2);
        assertEquals(10, result);
    }
}