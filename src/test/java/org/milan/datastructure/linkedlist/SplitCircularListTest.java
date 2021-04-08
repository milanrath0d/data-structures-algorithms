package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SplitCircularList}
 *
 * @author Milan Rathod
 */
class SplitCircularListTest {

    private CircularLinkedList<Integer> circularLinkedList;

    @BeforeEach
    void setup() {
        circularLinkedList = new CircularLinkedList<>(new CircularLinkedList.Node<>(5));

        circularLinkedList.insertAtEnd(10);
        circularLinkedList.insertAtEnd(15);
        circularLinkedList.insertAtEnd(20);
        circularLinkedList.insertAtEnd(25);
    }

    @Test
    void testSplit() {
        SplitCircularList splitCircularList = new SplitCircularList();

        List<CircularLinkedList.Node<Integer>> splitHeads = splitCircularList.split(circularLinkedList.getHead());

        assertEquals(5, splitHeads.get(0).getData().intValue());

        assertEquals(20, splitHeads.get(1).getData().intValue());
    }
}