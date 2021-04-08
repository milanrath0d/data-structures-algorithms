package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link SegregateZerosAndOnes}
 *
 * @author Milan Rathod
 */
class SegregateZerosAndOnesTest {

    @Test
    void testSegregate() {
        SegregateZerosAndOnes segregateZerosAndOnes = new SegregateZerosAndOnes();

        int[] arr = new int[]{0, 1, 0, 1, 0, 1};

        segregateZerosAndOnes.segregate(arr);

        assertArrayEquals(arr, new int[]{0, 0, 0, 1, 1, 1});
    }
}