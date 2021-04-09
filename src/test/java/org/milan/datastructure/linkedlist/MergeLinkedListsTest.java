package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MergeLinkedLists}
 *
 * @author Milan Rathod
 */
class MergeLinkedListsTest {

    private LinkedList<Integer> firstLinkedList;

    private LinkedList<Integer> secondLinkedList;

    private MergeLinkedLists mergeLinkedLists;

    @BeforeEach
    void setup() {
        firstLinkedList = new LinkedList<>(new LinkedList.Node<>(5));

        firstLinkedList.insertAtEnd(10);
        firstLinkedList.insertAtEnd(15);
        firstLinkedList.insertAtEnd(20);
        firstLinkedList.insertAtEnd(25);

        secondLinkedList = new LinkedList<>(new LinkedList.Node<>(3));

        secondLinkedList.insertAtEnd(7);
        secondLinkedList.insertAtEnd(30);

        mergeLinkedLists = new MergeLinkedLists();
    }

    @Test
    void testMergeByIterative() {
        LinkedList.Node<Integer> mergedHead = mergeLinkedLists.mergeByIterative(firstLinkedList.getHead(), secondLinkedList.getHead());

        LinkedList<Integer> mergedLinkedList = new LinkedList<>(mergedHead);

        assertEquals(8, mergedLinkedList.getSize());

        assertEquals(3, mergedLinkedList.searchByIndex(0).getData().intValue());

        assertEquals(10, mergedLinkedList.searchByIndex(3).getData().intValue());

        assertEquals(30, mergedLinkedList.searchByIndex(7).getData().intValue());
    }

    @Test
    void testMergeByRecursive() {
        LinkedList.Node<Integer> mergedHead = mergeLinkedLists.mergeByRecursive(firstLinkedList.getHead(), secondLinkedList.getHead());

        LinkedList<Integer> mergedLinkedList = new LinkedList<>(mergedHead);

        assertEquals(8, mergedLinkedList.getSize());

        assertEquals(3, mergedLinkedList.searchByIndex(0).getData().intValue());

        assertEquals(10, mergedLinkedList.searchByIndex(3).getData().intValue());

        assertEquals(30, mergedLinkedList.searchByIndex(7).getData().intValue());
    }
}