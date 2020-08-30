package org.milan.algorithm.dynamic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimumJumpTest {

    @Test
    void find() {
        int[] arr = new int[]{1, 2, 3, 4, 100};
        OptimumJump optimumJump = new OptimumJump();

        int result = optimumJump.find(arr, arr.length);

        assertEquals(10, result);
    }
}