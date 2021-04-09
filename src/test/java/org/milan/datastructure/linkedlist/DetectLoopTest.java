package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class for {@link DetectLoop}
 *
 * @author Milan Rathod
 */
class DetectLoopTest {

    private LinkedList<Integer> linkedList;

    private DetectLoop detectLoop;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAfterSpecifiedPosition(10, 0);
        linkedList.insertAfterSpecifiedPosition(15, 1);

        detectLoop = new DetectLoop();
    }

    @Test
    void testDetectLoop_LoopExists() {
        assertNull(detectLoop.detect(linkedList.getHead()));
    }

    @Test
    void testDetectLoop_LoopNotExists() {
        linkedList.insertAtEnd(20);

        LinkedList.Node<Integer> node = linkedList.searchByIndex(2);

        node.next = linkedList.searchByIndex(0);

        assertEquals(5, detectLoop.detect(linkedList.getHead()).getData().intValue());
    }
}