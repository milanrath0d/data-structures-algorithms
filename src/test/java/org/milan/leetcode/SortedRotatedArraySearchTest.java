package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SortedRotatedArraySearch}
 *
 * @author Milan Rathod
 */
class SortedRotatedArraySearchTest {

    @Test
    void findElement() {
        SortedRotatedArraySearch sortedRotatedArraySearch = new SortedRotatedArraySearch();

        assertEquals(1, sortedRotatedArraySearch.findElement(new int[]{3, 4, 5, 6, 1, 2}, 4));

        assertEquals(-1, sortedRotatedArraySearch.findElement(new int[]{3, 4, 5, 6, 1, 2}, 7));

        assertEquals(-1, sortedRotatedArraySearch.findElement(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

}