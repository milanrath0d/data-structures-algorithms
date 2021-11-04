package org.milan.hackerearth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link BinaryMatrix}
 *
 * @author Milan Rathod
 */
class BinaryMatrixTest {

    @Test
    void testMaxRowValue() {
        BinaryMatrix binaryMatrix = new BinaryMatrix();

        int result = binaryMatrix.maxRowValue(new int[][]{
            {0, 1, 0, 0},
            {1, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 1}});

        assertEquals(2, result);
    }
}