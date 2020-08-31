package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link RotateList}
 *
 * @author Milan Rathod
 */
class RotateListTest {

    @Test
    void testRotate() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(1));
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);

        RotateList rotateList = new RotateList();

        LinkedList.Node<Integer> newHead = rotateList.rotate(linkedList.getHead(), 2);

        linkedList = new LinkedList<>(newHead);

        assertEquals(5, linkedList.getSize());

        assertEquals(4, linkedList.searchByIndex(0).getData().intValue());

        assertEquals(5, linkedList.searchByIndex(1).getData().intValue());

        assertEquals(1, linkedList.searchByIndex(2).getData().intValue());
    }
}