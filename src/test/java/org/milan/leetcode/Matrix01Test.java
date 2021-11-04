package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link Matrix01}
 *
 * @author Milan Rathod
 */
class Matrix01Test {

    @Test
    void updateMatrix() {
        Matrix01 matrix01 = new Matrix01();

        int[][] arr = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        int[][] result = matrix01.updateMatrix(arr);

        assertTrue(Arrays.deepEquals(arr, result));

        arr = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        result = matrix01.updateMatrix(arr);

        assertTrue(Arrays.deepEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}, result));
    }
}