package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DeleteNodeWithoutHead}
 *
 * @author Milan Rathod
 */
class DeleteNodeWithoutHeadTest {

    @Test
    void testDelete() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(5));
        linkedList.insertAfterSpecifiedPosition(10, 0);
        linkedList.insertAfterSpecifiedPosition(15, 1);
        linkedList.insertAfterSpecifiedPosition(20, 2);
        linkedList.insertAfterSpecifiedPosition(25, 3);

        DeleteNodeWithoutHead deleteNodeWithoutHead = new DeleteNodeWithoutHead();

        deleteNodeWithoutHead.delete(linkedList.searchByIndex(2));

        LinkedList.Node<Integer> head = linkedList.getHead();
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        assertEquals(4, count);
    }
}