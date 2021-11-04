package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link ShuffleArrayII}
 *
 * @author Milan Rathod
 */
class ShuffleArrayIITest {

    @Test
    void testOperations() {
        int[] arr = new int[]{1, 2, 3};

        ShuffleArrayII shuffleArrayII = new ShuffleArrayII(arr);

        shuffleArrayII.shuffle();

        assertArrayEquals(arr, shuffleArrayII.reset());

        shuffleArrayII.shuffle();
    }

}