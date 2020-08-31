package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestIncreasingSubsequence}
 *
 * @author Milan Rathod
 */
class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence;

    private int[] arr;

    @BeforeEach
    void setUp() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();

        arr = new int[]{10, 22, 9, 33, 21, 50, 41, 60};
    }

    @Test
    void testFind() {
        int result = longestIncreasingSubsequence.find(arr);

        assertEquals(5, result);
    }

    @Test
    void testFindV2() {
        int result = longestIncreasingSubsequence.findV2(arr);

        assertEquals(5, result);

        assertArrayEquals(new int[]{10, 22, 33, 41, 60}, longestIncreasingSubsequence.getSubsequence());
    }
}