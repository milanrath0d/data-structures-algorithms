package org.milan.datastructure.heap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link BinaryHeap}
 *
 * @author Milan Rathod
 */
class BinaryHeapTest {

    private BinaryHeap binaryHeap;

    @BeforeEach
    void setUp() {
        binaryHeap = new BinaryHeap(10);
        int[] input = new int[]{13, 1, 4, 6, 2, 5, 17};

        // Using this to create binary heap from array of integers
        binaryHeap.buildHeap(input);
    }

    @Test
    void testGetParent() {
        assertEquals(0, binaryHeap.getParent(1));
        assertEquals(-1, binaryHeap.getParent(0));
    }

    @Test
    void testGetLeft() {
        assertEquals(3, binaryHeap.getLeft(1));
        assertEquals(-1, binaryHeap.getLeft(3));
    }

    @Test
    void testGetRight() {
        assertEquals(4, binaryHeap.getRight(1));
        assertEquals(-1, binaryHeap.getRight(4));
    }

    @Test
    void testDelete() {
        assertEquals(17, binaryHeap.delete());
    }

    @Test
    void testInsert() {
        binaryHeap.insert(7);

        assertEquals(7, binaryHeap.getElement(1));
        assertEquals(6, binaryHeap.getElement(3));
    }

    @Test
    void testSort_ascending() {
        int[] input = new int[]{4, 10, 3, 5, 1};

        BinaryHeap testBinaryHeap = new BinaryHeap(5);

        testBinaryHeap.sort(input);

        assertArrayEquals(new int[]{1, 3, 4, 5, 10}, testBinaryHeap.getStore());
    }

    @Test
    void testSort_descending() {
        int[] input = new int[]{4, 10, 3, 5, 1};

        BinaryHeap testBinaryHeap = new BinaryHeap(5, HeapType.MIN);

        testBinaryHeap.sort(input);

        assertArrayEquals(new int[]{10, 5, 4, 3, 1}, testBinaryHeap.getStore());
    }

    @Test
    void testIsMinHeap() {
        int[] arr = new int[]{10, 15, 14, 25, 30};

        BinaryHeap binaryHeap = new BinaryHeap(arr.length);

        assertTrue(binaryHeap.isMinHeap(arr));
    }

    @Test
    void testIndexOf() {
        assertEquals(2, binaryHeap.indexOf(13));
        assertEquals(-1, binaryHeap.indexOf(12));
        assertEquals(0, binaryHeap.indexOf(17));
    }
}