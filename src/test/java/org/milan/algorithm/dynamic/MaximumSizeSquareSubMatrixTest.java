package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumSizeSquareSubMatrix}
 *
 * @author Milan Rathod
 */
class MaximumSizeSquareSubMatrixTest {

    @Test
    void testFindMaximum() {
        int[][] matrix = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        MaximumSizeSquareSubMatrix maximumSizeSquareSubMatrix = new MaximumSizeSquareSubMatrix();

        int result = maximumSizeSquareSubMatrix.findMaximum(matrix);

        assertEquals(3, result);
    }
}