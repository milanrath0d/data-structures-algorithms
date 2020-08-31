package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link PartitionList}
 *
 * @author Milan Rathod
 */
class PartitionListTest {

    @Test
    void partition() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(1));
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(2);

        PartitionList partitionList = new PartitionList();

        LinkedList.Node<Integer> partitionHead = partitionList.partition(linkedList.getHead(), 3);

        linkedList = new LinkedList<>(partitionHead);

        assertEquals(6, linkedList.getSize());

        assertEquals(2, linkedList.searchByIndex(1).getData().intValue());

        assertEquals(4, linkedList.searchByIndex(3).getData().intValue());

        assertEquals(5, linkedList.searchByIndex(5).getData().intValue());
    }
}