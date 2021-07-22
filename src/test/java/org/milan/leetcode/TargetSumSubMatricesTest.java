package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Milan Rathod
 */
class TargetSumSubMatricesTest {

    @Test
    void maxSumSubMatrix() {
        TargetSumSubMatrices targetSumSubMatrices = new TargetSumSubMatrices();

        assertEquals(5, targetSumSubMatrices.maxSumSubMatrix(
                new int[][]{{1, -1}, {-1, 1}}, 0
        ));
    }
}