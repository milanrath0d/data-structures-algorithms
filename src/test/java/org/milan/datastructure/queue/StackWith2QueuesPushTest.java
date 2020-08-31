package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link StackWith2QueuesPush}
 *
 * @author Milan Rathod
 */
class StackWith2QueuesPushTest {

    @Test
    void testStackOperations() {
        StackWith2QueuesPush stackWith2QueuesPush = new StackWith2QueuesPush();

        assertEquals(0, stackWith2QueuesPush.size());

        stackWith2QueuesPush.push(1);
        stackWith2QueuesPush.push(2);
        stackWith2QueuesPush.push(3);

        assertEquals(3, stackWith2QueuesPush.pop());

        assertEquals(2, stackWith2QueuesPush.size());
    }
}