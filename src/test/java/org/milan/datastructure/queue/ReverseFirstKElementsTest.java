package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseFirstKElementsTest {

    @Test
    void testReverse() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        ReverseFirstKElements reverseFirstKElements = new ReverseFirstKElements();

        reverseFirstKElements.reverse(queue, 4);

        assertFalse(queue.isEmpty());
        assertEquals(40, queue.poll());
        assertEquals(30, queue.poll());
        assertEquals(20, queue.poll());
        assertEquals(10, queue.poll());
        assertEquals(50, queue.poll());
        assertEquals(60, queue.poll());
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

        ReverseFirstKElements reverseFirstKElements = new ReverseFirstKElements();

        reverseFirstKElements.reverseV2(queue, 4);

        assertFalse(queue.isEmpty());
        assertEquals(40, queue.poll());
        assertEquals(30, queue.poll());
        assertEquals(20, queue.poll());
        assertEquals(10, queue.poll());
        assertEquals(50, queue.poll());
        assertEquals(60, queue.poll());
        assertTrue(queue.isEmpty());
    }
}