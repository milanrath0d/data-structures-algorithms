package org.milan.datastructure.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link StackUsingHeap}
 *
 * @author Milan Rathod
 */
class StackUsingHeapTest {

    @Test
    void test() {
        StackUsingHeap stackUsingHeap = new StackUsingHeap();

        stackUsingHeap.push(10);
        stackUsingHeap.push(5);

        assertEquals(5, stackUsingHeap.pop());
        assertEquals(10, stackUsingHeap.pop());
    }

}