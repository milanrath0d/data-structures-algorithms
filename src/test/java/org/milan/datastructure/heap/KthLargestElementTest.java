package org.milan.datastructure.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementTest {

    private KthLargestElement kthLargestElement;

    private int[] arr;

    @BeforeEach
    void setUp() {
        arr = new int[]{10, 50, 40, 75, 60, 65, 45};

        kthLargestElement = new KthLargestElement();
    }

    @Test
    void testFind() {
        int result = kthLargestElement.find(arr, 3);

        assertEquals(60, result);
    }

    @Test
    void testFindV2() {
        int result = kthLargestElement.findV2(arr, 3);

        assertEquals(65, result);
    }
}