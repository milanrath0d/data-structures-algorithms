package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for {@link ReverseLinkedList}
 *
 * @author Milan Rathod
 */
class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(1));

        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);

        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void testReverseByIterative() {
        LinkedList.Node<Integer> newHead = reverseLinkedList.reverseByIterative(linkedList.getHead());

        assertNotNull(newHead);

        assertEquals(6, newHead.getData().intValue());

        assertEquals(6, linkedList.size(newHead));
    }

    @Test
    void testReverseByRecursive() {
        LinkedList.Node<Integer> newHead = reverseLinkedList.reverseByRecursive(linkedList.getHead());

        assertNotNull(newHead);

        assertEquals(6, newHead.getData().intValue());

        assertEquals(6, linkedList.size(newHead));
    }
}