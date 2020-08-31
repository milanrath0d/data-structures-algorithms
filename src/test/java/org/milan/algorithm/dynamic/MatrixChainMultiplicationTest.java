package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MatrixChainMultiplication}
 *
 * @author Milan Rathod
 */
class MatrixChainMultiplicationTest {

    @Test
    void testFindMinimum() {
        int[] d = new int[] {1, 2, 3, 4};

        MatrixChainMultiplication matrixChainMultiplication = new MatrixChainMultiplication();

        int result = matrixChainMultiplication.findMinimum(d);

        assertEquals(18, result);
    }
}