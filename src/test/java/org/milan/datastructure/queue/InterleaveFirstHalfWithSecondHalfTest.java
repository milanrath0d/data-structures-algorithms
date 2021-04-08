package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link InterleaveFirstHalfWithSecondHalf}
 *
 * @author Milan Rathod
 */
class InterleaveFirstHalfWithSecondHalfTest {

    @Test
    void testInterleaveQueue() {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);

        InterleaveFirstHalfWithSecondHalf interleaveFirstHalfWithSecondHalf = new InterleaveFirstHalfWithSecondHalf();

        interleaveFirstHalfWithSecondHalf.interleaveQueue(queue);

        assertEquals(10, Objects.requireNonNull(queue.poll()).intValue());
        assertEquals(12, Objects.requireNonNull(queue.poll()).intValue());
        assertEquals(11, Objects.requireNonNull(queue.poll()).intValue());
        assertEquals(13, Objects.requireNonNull(queue.poll()).intValue());
    }
}