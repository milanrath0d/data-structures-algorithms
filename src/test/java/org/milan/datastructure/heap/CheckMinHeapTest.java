package org.milan.datastructure.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link CheckMinHeap}
 *
 * @author Milan Rathod
 */
class CheckMinHeapTest {

    @Test
    void isMinHeap() {
        CheckMinHeap checkMinHeap = new CheckMinHeap();

        int[] arr = new int[]{10, 15, 14, 25, 30};

        assertTrue(checkMinHeap.isMinHeap(arr));
    }
}