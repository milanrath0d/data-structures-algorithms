package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;
import org.milan.exception.EmptyQueueException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link QueueWith1Stack}
 *
 * @author Milan Rathod
 */
class QueueWith1StackTest {

    @Test
    void testEnqueueDequeueOperations() {
        QueueWith1Stack queueWith1Stack = new QueueWith1Stack();

        assertTrue(queueWith1Stack.isEmpty());

        queueWith1Stack.enqueue(1);
        queueWith1Stack.enqueue(2);
        queueWith1Stack.enqueue(3);

        assertFalse(queueWith1Stack.isEmpty());

        assertEquals(1, queueWith1Stack.dequeue());

        assertEquals(2, queueWith1Stack.dequeue());

        assertEquals(3, queueWith1Stack.dequeue());

        assertTrue(queueWith1Stack.isEmpty());
    }

    @Test
    void testEmptyQueueException() {
        QueueWith1Stack queueWith1Stack = new QueueWith1Stack();

        assertTrue(queueWith1Stack.isEmpty());

        assertThrows(EmptyQueueException.class, queueWith1Stack::dequeue);
    }
}