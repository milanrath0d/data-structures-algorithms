package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link AddTwoLists}
 *
 * @author Milan Rathod
 */
class AddTwoListsTest {

    @Test
    void testAdd() {
        LinkedList<Integer> firstLinkedList = new LinkedList<>(new LinkedList.Node<>(5));
        firstLinkedList.insertAtEnd(0);
        firstLinkedList.insertAtEnd(8);

        LinkedList<Integer> secondLinkedList = new LinkedList<>(new LinkedList.Node<>(6));
        secondLinkedList.insertAtEnd(6);
        secondLinkedList.insertAtEnd(8);

        AddTwoLists addTwoLists = new AddTwoLists();

        LinkedList.Node<Integer> newHead = addTwoLists.add(firstLinkedList.getHead(), secondLinkedList.getHead());

        LinkedList<Integer> newLinkedList = new LinkedList<>(newHead);

        assertEquals(4, newLinkedList.getSize());

        assertEquals(1, newLinkedList.searchByIndex(0).getData().intValue());

        assertEquals(7, newLinkedList.searchByIndex(1).getData().intValue());

        assertEquals(6, newLinkedList.searchByIndex(2).getData().intValue());

        assertEquals(1, newLinkedList.searchByIndex(3).getData().intValue());
    }
}