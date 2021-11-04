package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link ArrayFromPermutation}
 *
 * @author Milan Rathod
 */
class ArrayFromPermutationTest {

    @Test
    void buildArray() {
        ArrayFromPermutation arrayFromPermutation = new ArrayFromPermutation();

        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, arrayFromPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4}));

        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, arrayFromPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }
}