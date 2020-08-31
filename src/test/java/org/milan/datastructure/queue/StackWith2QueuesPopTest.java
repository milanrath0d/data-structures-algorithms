package org.milan.datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link StackWith2QueuesPop}
 *
 * @author Milan Rathod
 */
class StackWith2QueuesPopTest {

    @Test
    void testStackOperations() {
        StackWith2QueuesPop stackWith2QueuesPop = new StackWith2QueuesPop();

        assertEquals(0, stackWith2QueuesPop.size());

        stackWith2QueuesPop.push(1);
        stackWith2QueuesPop.push(2);
        stackWith2QueuesPop.push(3);

        assertEquals(3, stackWith2QueuesPop.pop());

        assertEquals(2, stackWith2QueuesPop.size());
    }
}