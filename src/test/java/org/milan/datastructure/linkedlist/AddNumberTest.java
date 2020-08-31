package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link AddNumber}
 *
 * @author Milan Rathod
 */
class AddNumberTest {

    private AddNumber addNumber;

    @BeforeEach
    void setup() {
        addNumber = new AddNumber();
    }

    @Test
    void testAdd() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(1));

        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        addNumber.add(linkedList.getHead(), 5);

        assertEquals(5, linkedList.searchByIndex(3).data.intValue());
        assertEquals(0, linkedList.searchByIndex(4).data.intValue());
    }

    @Test
    void testAdd_newNodeAddition() {
        LinkedList<Integer> linkedList = new LinkedList<>(new LinkedList.Node<>(9));

        linkedList.insertAtEnd(9);

        LinkedList.Node<Integer> head = addNumber.add(linkedList.getHead(), 5);

        assertEquals(3, linkedList.size(head));

        assertEquals(1, head.getData().intValue());
        assertEquals(0, head.getNext().getData().intValue());
        assertEquals(4, head.getNext().getNext().getData().intValue());
    }
}