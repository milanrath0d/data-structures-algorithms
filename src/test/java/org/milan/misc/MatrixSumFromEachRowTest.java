package org.milan.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MatrixSumFromEachRow}
 *
 * @author Milan Rathod
 */
class MatrixSumFromEachRowTest {

    @Test
    void testMaxSum() {
        int[][] input = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

        MatrixSumFromEachRow matrixSumFromEachRow = new MatrixSumFromEachRow();

        int result = matrixSumFromEachRow.maxSum(input);

        assertEquals(18, result);

        input = new int[][]{{4, 5, 6},
            {4, 5, 6},
            {4, 5, 6}};

        result = matrixSumFromEachRow.maxSum(input);

        assertEquals(15, result);
    }
}