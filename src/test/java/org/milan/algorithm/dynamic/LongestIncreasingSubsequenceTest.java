package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestIncreasingSubsequence}
 *
 * @author Milan Rathod
 */
class LongestIncreasingSubsequenceTest {

    @Test
    void find() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

        assertEquals(5, longestIncreasingSubsequence.find(new int[]{10, 22, 9, 33, 21, 50, 41, 60}));

        assertEquals(3, longestIncreasingSubsequence.find(new int[]{3, 10, 2, 11}));

        assertEquals(4, longestIncreasingSubsequence.find(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));

        assertEquals(4, longestIncreasingSubsequence.find(new int[]{0, 1, 0, 3, 2, 3}));

        assertEquals(1, longestIncreasingSubsequence.find(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void findV2() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

        assertEquals(5, longestIncreasingSubsequence.findV2(new int[]{10, 22, 9, 33, 21, 50, 41, 60}));

        assertEquals(3, longestIncreasingSubsequence.findV2(new int[]{3, 10, 2, 11}));

        assertEquals(4, longestIncreasingSubsequence.findV2(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));

        assertEquals(4, longestIncreasingSubsequence.findV2(new int[]{0, 1, 0, 3, 2, 3}));

        assertEquals(1, longestIncreasingSubsequence.findV2(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void findV3() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

        assertEquals(5, longestIncreasingSubsequence.findV3(new int[]{10, 22, 9, 33, 21, 50, 41, 60}));

        assertEquals(3, longestIncreasingSubsequence.findV3(new int[]{3, 10, 2, 11}));

        assertEquals(4, longestIncreasingSubsequence.findV3(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));

        assertEquals(4, longestIncreasingSubsequence.findV3(new int[]{0, 1, 0, 3, 2, 3}));

        assertEquals(1, longestIncreasingSubsequence.findV3(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}