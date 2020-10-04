package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link RemoveDuplicates}
 *
 * @author Milan Rathod
 */
class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicatesSorted() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(1));
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        LinkedList.Node<Integer> newHead = removeDuplicates.removeDuplicatesSorted(linkedList.getHead());

        linkedList = new LinkedList<>(newHead);

        assertEquals(4, linkedList.getSize());
    }

    @Test
    void testRemoveDuplicatesUnsorted() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(1));
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        LinkedList.Node<Integer> newHead = removeDuplicates.removeDuplicatesUnsorted(linkedList.getHead());

        linkedList = new LinkedList<>(newHead);

        assertEquals(4, linkedList.getSize());
    }
}