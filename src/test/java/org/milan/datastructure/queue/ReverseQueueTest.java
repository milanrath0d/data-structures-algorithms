package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link ReverseQueue}
 *
 * @author Milan Rathod
 */
class ReverseQueueTest {

    @Test
    void testReverse() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        ReverseQueue reverseQueue = new ReverseQueue();

        reverseQueue.reverse(queue);

        assertFalse(queue.isEmpty());
        assertEquals(60, queue.poll());
        assertEquals(50, queue.poll());
        assertEquals(40, queue.poll());
        assertEquals(30, queue.poll());
        assertEquals(20, queue.poll());
        assertEquals(10, queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testReverseV2() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        ReverseQueue reverseQueue = new ReverseQueue();

        reverseQueue.reverseV2(queue);

        assertFalse(queue.isEmpty());
        assertEquals(60, queue.poll());
        assertEquals(50, queue.poll());
        assertEquals(40, queue.poll());
        assertEquals(30, queue.poll());
        assertEquals(20, queue.poll());
        assertEquals(10, queue.poll());
        assertTrue(queue.isEmpty());
    }
}