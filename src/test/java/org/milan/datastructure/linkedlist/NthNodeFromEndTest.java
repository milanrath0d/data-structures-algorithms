package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link NthNodeFromEnd}
 *
 * @author Milan Rathod
 */
class NthNodeFromEndTest {

    private LinkedList<Integer> linkedList;

    private NthNodeFromEnd nthNodeFromEnd;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(1));

        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);

        nthNodeFromEnd = new NthNodeFromEnd();
    }

    @Test
    void testFind() {
        LinkedList.Node<Integer> result = nthNodeFromEnd.find(linkedList.getHead(), 3);

        assertEquals(4, result.data.intValue());

        result = nthNodeFromEnd.find(linkedList.getHead(), 6);

        assertEquals(1, result.data.intValue());
    }

    @Test
    void testFindV2() {
        LinkedList.Node<Integer> result = nthNodeFromEnd.findV2(linkedList.getHead(), 3);

        assertEquals(4, result.data.intValue());

        result = nthNodeFromEnd.find(linkedList.getHead(), 6);

        assertEquals(1, result.data.intValue());
    }
}