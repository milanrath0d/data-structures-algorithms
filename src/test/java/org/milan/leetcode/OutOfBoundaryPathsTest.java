package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link OutOfBoundaryPaths}
 *
 * @author Milan Rathod
 */
class OutOfBoundaryPathsTest {

    @Test
    void findPaths() {
        OutOfBoundaryPaths outOfBoundaryPaths = new OutOfBoundaryPaths();

        assertEquals(6, outOfBoundaryPaths.findPaths(2, 2, 2, 0, 0));

        assertEquals(12, outOfBoundaryPaths.findPaths(1, 3, 3, 0, 1));
    }
}