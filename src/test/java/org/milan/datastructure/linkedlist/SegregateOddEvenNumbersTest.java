package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SegregateOddEvenNumbers}
 *
 * @author Milan Rathod
 */
class SegregateOddEvenNumbersTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(11));

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(0);
    }

    @Test
    void testSegregate() {
        SegregateOddEvenNumbers segregateOddEvenNumbers = new SegregateOddEvenNumbers();

        LinkedList.Node<Integer> segregatedHead = segregateOddEvenNumbers.segregate(linkedList.getHead());

        LinkedList<Integer> newList = new LinkedList<>(segregatedHead);

        assertEquals(7, newList.getSize());

        assertEquals(6, newList.searchByIndex(1).getData().intValue());

        assertEquals(11, newList.searchByIndex(4).getData().intValue());
    }
}