package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestElementTest {

    @Test
    void testSmallestElement() {
        int[] arr = new int[]{12, 3, 5, 7, 4, 19, 26};

        KthSmallestElement kthSmallestElement = new KthSmallestElement();

        int result = kthSmallestElement.smallestElement(arr, 3);

        assertEquals(5, result);
    }
}