package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test Class for {@link SortBySwapping}
 *
 * @author Milan Rathod
 */
class SortBySwappingTest {

    @Test
    void TestIsSortPossible() {
        SortBySwapping sortBySwapping = new SortBySwapping();

        boolean result = sortBySwapping.isSortPossible(new int[]{1, 2, 5, 3, 4, 6}, new int[]{0, 1, 1, 1, 0});

        assertTrue(result);

        result = sortBySwapping.isSortPossible(new int[]{1, 2, 4, 5, 3, 6}, new int[]{0, 1, 1, 1, 0});

        assertTrue(result);

        result = sortBySwapping.isSortPossible(new int[]{2, 3, 1, 4, 5, 6}, new int[]{0, 1, 1, 1, 1});

        assertFalse(result);

        result = sortBySwapping.isSortPossible(new int[]{4, 3, 2, 1}, new int[]{1, 1, 1});

        assertTrue(result);
    }
}