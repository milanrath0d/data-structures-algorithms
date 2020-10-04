package org.milan.datastructure.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link KthSmallestElement}
 *
 * @author Milan Rathod
 */
class KthSmallestElementTest {

    private KthSmallestElement kthSmallestElement;

    private int[] arr;

    @BeforeEach
    void setUp() {
        arr = new int[]{10, 50, 40, 75, 60, 65, 45};

        kthSmallestElement = new KthSmallestElement();
    }

    @Test
    void testFind() {
        assertEquals(60, kthSmallestElement.find(arr, 5));
    }

    @Test
    void testFindV2() {
        assertEquals(65, kthSmallestElement.findV2(arr, 6));
    }
}