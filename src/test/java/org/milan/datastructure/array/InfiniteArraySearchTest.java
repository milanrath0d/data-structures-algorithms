package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link InfiniteArraySearch}
 *
 * @author Milan Rathod
 */
class InfiniteArraySearchTest {

    private InfiniteArraySearch infiniteArraySearch;

    @BeforeEach
    void setUp() {
        infiniteArraySearch = new InfiniteArraySearch();
    }

    @Test
    void testSearch_ElementExists() {
        int index = infiniteArraySearch.search(new int[]{1, 2, 5, 7, 10, 20, 25, 30, 35, 40}, 30);
        assertTrue(index > 0);
    }

    @Test
    void testSearch_ElementNotExists() {
        int index = infiniteArraySearch.search(new int[]{1, 2, 5, 7, 10, 20, 25, 30, 35, 40}, 32);
        assertFalse(index > 0);
    }
}