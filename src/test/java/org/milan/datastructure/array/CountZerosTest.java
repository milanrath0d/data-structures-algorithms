package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountZerosTest {

    @Test
    void testCount() {
        CountZeros countZeros = new CountZeros();
        int[] arr = {1, 1, 1, 0, 0, 0, 0, 0};

        int result = countZeros.count(arr);

        assertEquals(5, result);
    }
}