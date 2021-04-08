package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link DoublyLinkedList}
 *
 * @author Milan Rathod
 */
class DoublyLinkedListTest {

    private DoublyLinkedList<Integer> doublyLinkedList;

    @BeforeEach
    void setup() {
        doublyLinkedList = new DoublyLinkedList<>(new DoublyLinkedList.Node<>(5));
    }

    @Test
    void testInsertBeforeHead() {
        assertEquals(1, doublyLinkedList.getSize());

        doublyLinkedList.insertBeforeHead(10);

        assertTrue(doublyLinkedList.contains(10));

        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    void testInsertAfterSpecifiedNode() {
        assertEquals(1, doublyLinkedList.getSize());

        doublyLinkedList.insertAfterSpecifiedNode(5, 10);

        assertTrue(doublyLinkedList.contains(10));

        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    void testInsertAfterSpecifiedPosition() {
        assertEquals(1, doublyLinkedList.getSize());

        doublyLinkedList.insertAfterSpecifiedPosition(10, 0);

        assertTrue(doublyLinkedList.contains(10));

        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    void testInsertAtEnd() {
        assertEquals(1, doublyLinkedList.getSize());

        doublyLinkedList.insertAtEnd(10);

        assertTrue(doublyLinkedList.contains(10));

        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    void testDeleteNodeByKey() {
        doublyLinkedList.insertAtEnd(10);

        assertEquals(2, doublyLinkedList.getSize());

        doublyLinkedList.deleteNodeByKey(10);

        assertFalse(doublyLinkedList.contains(10));

        assertEquals(1, doublyLinkedList.getSize());
    }

    @Test
    void testDeleteNodeByPosition() {
        doublyLinkedList.insertAtEnd(10);

        assertEquals(2, doublyLinkedList.getSize());

        doublyLinkedList.deleteNodeByPosition(1);

        assertFalse(doublyLinkedList.contains(10));

        assertEquals(1, doublyLinkedList.getSize());
    }
}