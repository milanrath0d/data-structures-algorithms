package org.milan.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link RotateMatrix}
 *
 * @author Milan Rathod
 */
class RotateMatrixTest {

    private RotateMatrix rotateMatrix;

    private int[][] matrix;

    @BeforeEach
    void setup() {
        rotateMatrix = new RotateMatrix();

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    }

    @Test
    void rotate() {
        rotateMatrix.rotate(matrix, matrix.length);

        assertArrayEquals(new int[]{4, 8, 12, 16}, matrix[0]);
        assertArrayEquals(new int[]{3, 7, 11, 15}, matrix[1]);
        assertArrayEquals(new int[]{2, 6, 10, 14}, matrix[2]);
        assertArrayEquals(new int[]{1, 5, 9, 13}, matrix[3]);
    }

    @Test
    void rotateV2() {
        rotateMatrix.rotateV2(matrix, matrix.length);
    }
}