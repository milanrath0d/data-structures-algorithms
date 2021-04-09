package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link MatrixSorting}
 *
 * @author Milan Rathod
 */
class MatrixSortingTest {

    @Test
    void sort() {
        MatrixSorting matrixSorting = new MatrixSorting();

        int[][] matrix = {{5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}};

        int[][] sortedMatrix = matrixSorting.sort(matrix, matrix.length);

        assertEquals(1, sortedMatrix[0][0]);
        assertEquals(5, sortedMatrix[1][1]);
        assertEquals(9, sortedMatrix[2][2]);
    }
}