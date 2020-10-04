package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for {@link DeleteNodeWithoutHead}
 *
 * @author Milan Rathod
 */
class DeleteNodeWithoutHeadTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void init() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(5));
        linkedList.insertAfterSpecifiedPosition(10, 0);
        linkedList.insertAfterSpecifiedPosition(15, 1);
        linkedList.insertAfterSpecifiedPosition(20, 2);
        linkedList.insertAfterSpecifiedPosition(25, 3);
    }

    @Test
    void testDelete() {
        DeleteNodeWithoutHead deleteNodeWithoutHead = new DeleteNodeWithoutHead();

        deleteNodeWithoutHead.delete(linkedList.searchByIndex(2));

        assertEquals(4, linkedList.computeSize());
    }

    @Test
    void testDelete_LastNode() {
        DeleteNodeWithoutHead deleteNodeWithoutHead = new DeleteNodeWithoutHead();

        assertThrows(IllegalArgumentException.class, () -> deleteNodeWithoutHead.delete(linkedList.searchByIndex(4)));
    }
}