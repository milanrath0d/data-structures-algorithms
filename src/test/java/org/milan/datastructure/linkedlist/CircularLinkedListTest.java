package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link CircularLinkedList}
 *
 * @author Milan Rathod
 */
class CircularLinkedListTest {

    private CircularLinkedList<Integer> circularLinkedList;

    @BeforeEach
    void setup() {
        circularLinkedList = new CircularLinkedList<>(new CircularLinkedList.Node<>(5));
    }

    @Test
    void testInsertAfterSpecifiedPosition() {
        assertEquals(1, circularLinkedList.getSize());

        circularLinkedList.insertAfterSpecifiedPosition(10, 0);

        assertTrue(circularLinkedList.contains(10));

        assertEquals(2, circularLinkedList.getSize());
    }

    @Test
    void testInsertBeforeHead() {
        assertEquals(1, circularLinkedList.getSize());

        circularLinkedList.insertBeforeHead(10);

        assertTrue(circularLinkedList.contains(10));

        assertEquals(2, circularLinkedList.getSize());
    }

    @Test
    void testInsertAtEnd() {
        assertEquals(1, circularLinkedList.getSize());

        circularLinkedList.insertAtEnd(10);

        assertTrue(circularLinkedList.contains(10));

        assertEquals(2, circularLinkedList.getSize());
    }

    @Test
    void testDeleteNodeByPosition() {
        circularLinkedList.insertAtEnd(10);

        assertEquals(2, circularLinkedList.getSize());

        circularLinkedList.deleteNodeByPosition(0);

        assertFalse(circularLinkedList.contains(5));

        assertEquals(1, circularLinkedList.getSize());
    }

    @Test
    void testDeleteNodeByKey() {
        circularLinkedList.insertAtEnd(10);

        assertEquals(2, circularLinkedList.getSize());

        circularLinkedList.deleteNodeByKey(10);

        assertFalse(circularLinkedList.contains(10));

        assertEquals(1, circularLinkedList.getSize());
    }
}