package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link LinkedList}
 *
 * @author Milan Rathod
 */
class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAfterSpecifiedPosition(10, 0);
        linkedList.insertAfterSpecifiedPosition(15, 1);
    }

    @Test
    void testInsertBeforeHead() {
        assertEquals(3, linkedList.getSize());

        linkedList.insertBeforeHead(1);

        assertTrue(linkedList.contains(1));

        assertEquals(1, linkedList.searchByIndex(0).data.intValue());

        assertEquals(4, linkedList.getSize());
    }

    @Test
    void testInsertAfterSpecifiedNode() {
        assertEquals(3, linkedList.getSize());

        linkedList.insertAfterSpecifiedNode(10, 12);

        assertTrue(linkedList.contains(12));

        assertEquals(12, linkedList.searchByIndex(2).data.intValue());

        assertEquals(4, linkedList.getSize());
    }

    @Test
    void testInsertAfterSpecifiedPosition() {
        assertEquals(3, linkedList.getSize());

        linkedList.insertAfterSpecifiedPosition(12, 1);

        assertTrue(linkedList.contains(12));

        assertEquals(12, linkedList.searchByIndex(2).data.intValue());

        assertEquals(4, linkedList.getSize());
    }

    @Test
    void testInsertAtEnd() {
        assertEquals(3, linkedList.getSize());

        linkedList.insertAtEnd(20);

        assertTrue(linkedList.contains(20));

        assertEquals(20, linkedList.searchByIndex(3).data.intValue());

        assertEquals(4, linkedList.getSize());
    }

    @Test
    void testDeleteNodeByKey() {
        assertEquals(3, linkedList.getSize());

        linkedList.deleteNodeByKey(15);

        assertEquals(2, linkedList.getSize());

        assertFalse(linkedList.contains(15));
    }

    @Test
    void testDeleteNodeByPosition() {
        assertEquals(3, linkedList.getSize());

        linkedList.deleteNodeByPosition(1);

        assertEquals(2, linkedList.getSize());

        assertFalse(linkedList.contains(10));
    }

    @Test
    void testQuickSort() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAtEnd(25);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(10);

        linkedList.quickSort();

        assertArrayEquals(new Integer[]{5, 10, 20, 25, 30}, linkedList.toArray(Integer.class));
    }

    @Test
    void testSort() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAtEnd(25);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(10);

        linkedList.sort();

        assertArrayEquals(new Integer[]{5, 10, 20, 25, 30}, linkedList.toArray(Integer.class));
    }
}