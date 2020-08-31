package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link RemoveAdjacentDuplicates}
 *
 * @author Milan Rathod
 */
class RemoveAdjacentDuplicatesTest {

    @Test
    void testRemove() {
        RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();

        Stack<Integer> result = removeAdjacentDuplicates.remove(new int[]{1, 5, 6, 8, 8, 0, 1, 1, 0, 6, 5});

        assertEquals(1, result.size());

        assertEquals(1, result.pop().intValue());

        assertTrue(result.isEmpty());

        result = removeAdjacentDuplicates.remove(new int[]{1, 9, 6, 8, 8, 0, 1, 1, 0, 6, 5});

        assertEquals(3, result.size());

        assertEquals(5, result.pop().intValue());
        assertEquals(9, result.pop().intValue());
        assertEquals(1, result.pop().intValue());

        assertTrue(result.isEmpty());
    }
}