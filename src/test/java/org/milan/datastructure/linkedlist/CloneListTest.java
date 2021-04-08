package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link CloneList}
 *
 * @author Milan Rathod
 */
class CloneListTest {

    private DoublyLinkedList<Integer> doublyLinkedList;

    private CloneList cloneList;

    @BeforeEach
    void setup() {
        doublyLinkedList = new DoublyLinkedList<>(new DoublyLinkedList.Node<>(5));

        doublyLinkedList.insertAtEnd(10);
        doublyLinkedList.insertAtEnd(15);
        doublyLinkedList.insertAtEnd(20);

        doublyLinkedList.getHead().next.prev = doublyLinkedList.getHead().next.next.next;

        cloneList = new CloneList();
    }

    @Test
    void testClone() {
        DoublyLinkedList<Integer> clonedList = cloneList.clone(doublyLinkedList.getHead());

        assertEquals(4, clonedList.getSize());
    }

    @Test
    void testCloneV2() {
        DoublyLinkedList<Integer> clonedList = cloneList.cloneV2(doublyLinkedList.getHead());

        assertEquals(4, clonedList.getSize());
    }
}