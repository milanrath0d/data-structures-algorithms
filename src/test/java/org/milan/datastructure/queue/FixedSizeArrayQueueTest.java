package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;
import org.milan.exception.EmptyQueueException;
import org.milan.exception.FullQueueException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link FixedSizeArrayQueue}
 *
 * @author Milan Rathod
 */
class FixedSizeArrayQueueTest {

    @Test
    void testQueueOperations() {
        FixedSizeArrayQueue queue = new FixedSizeArrayQueue(4);

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
    void testFullQueueException() {
        FixedSizeArrayQueue queue = new FixedSizeArrayQueue(2);

        assertTrue(queue.isEmpty());

        // Enqueue operations
        queue.enqueue(4);
        queue.enqueue(2);

        assertTrue(queue.isFull());

        assertThrows(FullQueueException.class, () -> {
            queue.enqueue(3);
        });
    }

    @Test
    void testEmptyQueueException() {
        FixedSizeArrayQueue queue = new FixedSizeArrayQueue(2);

        assertTrue(queue.isEmpty());

        assertThrows(EmptyQueueException.class, queue::dequeue);
    }
}