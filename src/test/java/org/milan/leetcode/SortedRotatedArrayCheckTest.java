package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SortedRotatedArrayCheck}
 *
 * @author Milan Rathod
 */
class SortedRotatedArrayCheckTest {

    @Test
    void check() {
        SortedRotatedArrayCheck sortedRotatedArrayCheck = new SortedRotatedArrayCheck();

        assertTrue(sortedRotatedArrayCheck.check(new int[]{3, 4, 5, 1, 2}));

        assertFalse(sortedRotatedArrayCheck.check(new int[]{2, 1, 3, 4}));

        assertTrue(sortedRotatedArrayCheck.check(new int[]{1, 2, 3}));

        assertTrue(sortedRotatedArrayCheck.check(new int[]{1, 1, 1}));

        assertTrue(sortedRotatedArrayCheck.check(new int[]{2, 1}));
    }
}