package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link ReverseInGroupSize}
 *
 * @author Milan Rathod
 */
class ReverseInGroupSizeTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(15);
        linkedList.insertAtEnd(20);
    }

    @Test
    void testReverseByGroupSize() {
        ReverseInGroupSize reverseInGroupSize = new ReverseInGroupSize();

        LinkedList.Node<Integer> reversedHead = reverseInGroupSize.reverseByGroupSize(linkedList.getHead(), 3);

        LinkedList<Integer> reversedLinkedList = new LinkedList<>(reversedHead);

        assertEquals(4, reversedLinkedList.getSize());

        assertEquals(15, reversedLinkedList.searchByIndex(0).getData().intValue());

        assertEquals(10, reversedLinkedList.searchByIndex(1).getData().intValue());

        assertEquals(5, reversedLinkedList.searchByIndex(2).getData().intValue());

        assertEquals(20, reversedLinkedList.searchByIndex(3).getData().intValue());
    }
}