package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link ReshapeMatrix}
 *
 * @author Milan Rathod
 */
class ReshapeMatrixTest {

    @Test
    void matrixReshape() {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();

        int[][] arr = new int[][]{{1, 2}, {3, 4}};

        assertTrue(Arrays.deepEquals(new int[][]{{1, 2, 3, 4}}, reshapeMatrix.matrixReshape(arr, 1, 4)));

        assertTrue(Arrays.deepEquals(arr, reshapeMatrix.matrixReshape(arr, 2, 2)));

        assertTrue(Arrays.deepEquals(arr, reshapeMatrix.matrixReshape(arr, 3, 2)));
    }
}