package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;
import org.milan.exception.EmptyQueueException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link QueueWith2Stacks}
 *
 * @author Milan Rathod
 */
class QueueWith2StacksTest {

    @Test
    void testEnqueueDequeueOperations() {
        QueueWith2Stacks q2s = new QueueWith2Stacks();

        assertTrue(q2s.isEmpty());

        q2s.enqueue(1);
        q2s.enqueue(2);
        q2s.enqueue(3);

        assertFalse(q2s.isEmpty());

        assertEquals(1, q2s.dequeue());

        assertEquals(2, q2s.dequeue());

        assertEquals(3, q2s.dequeue());

        assertTrue(q2s.isEmpty());
    }

    @Test
    void testEmptyQueueException() {
        QueueWith2Stacks q2s = new QueueWith2Stacks();

        assertTrue(q2s.isEmpty());

        assertThrows(EmptyQueueException.class, q2s::dequeue);
    }
}