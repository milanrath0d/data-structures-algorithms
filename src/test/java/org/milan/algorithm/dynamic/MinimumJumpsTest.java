package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link @}
 *
 * @author Milan Rathod
 */
class MinimumJumpsTest {

    private int[] arr;

    private MinimumJumps minimumJumps;

    @BeforeEach
    void setUp() {
        arr = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        minimumJumps = new MinimumJumps();
    }

    @Test
    void testMinJumps() {
        int result = minimumJumps.minJumps(arr);

        assertEquals(3, result);
    }

    @Test
    void testMinJumpsV2() {
        int result = minimumJumps.minJumpsV2(arr);

        assertEquals(3, result);
    }
}