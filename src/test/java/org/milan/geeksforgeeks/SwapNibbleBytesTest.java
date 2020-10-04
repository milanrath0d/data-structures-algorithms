package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNibbleBytesTest {

    @Test
    void testSwap() {
        SwapNibbleBytes swapNibbleBytes = new SwapNibbleBytes();

        assertEquals(70 ,swapNibbleBytes.swap(100));
    }
}