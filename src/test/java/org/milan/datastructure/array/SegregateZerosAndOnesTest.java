package org.milan.datastructure.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SegregateZerosAndOnesTest {

    @Test
    void segregate() {
        SegregateZerosAndOnes segregateZerosAndOnes = new SegregateZerosAndOnes();

        int[] arr = new int[]{0, 1, 0, 1, 0, 1};

        segregateZerosAndOnes.segregate(arr);

        Assert.assertArrayEquals(arr, new int[]{0, 0, 0, 1, 1, 1});
    }
}