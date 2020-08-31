package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;
import org.milan.exception.EmptyQueueException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for {@link DynamicArrayQueue}
 *
 * @author Milan Rathod
 */
class DynamicArrayQueueTest {

    @Test
    void testQueueOperations() {
        DynamicArrayQueue queue = new DynamicArrayQueue(4);

        assertTrue(queue.isEmpty());

        // Enqueue operations
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);

        assertTrue(queue.isFull());

        assertEquals(4, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(1, queue.dequeue());

        assertTrue(queue.isEmpty());
    }

    @Test
    void testEmptyQueueException() {
        DynamicArrayQueue queue = new DynamicArrayQueue(4);

        assertTrue(queue.isEmpty());

        assertThrows(EmptyQueueException.class, queue::dequeue);
    }

}