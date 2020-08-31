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

    private BinaryHeap binaryHeap;

    private KthSmallestElement kthSmallestElement;

    @BeforeEach
    void setUp() throws Exception {
        binaryHeap = new BinaryHeap(7, HeapType.MIN);

        binaryHeap.buildHeap(new int[]{10, 50, 40, 75, 60, 65, 45});

        kthSmallestElement = new KthSmallestElement(binaryHeap);
    }

    @Test
    void testFind() {
        assertEquals(60, kthSmallestElement.find(5));
    }

    @Test
    void testFindV2() {
        assertEquals(65, kthSmallestElement.findV2(6));
    }
}