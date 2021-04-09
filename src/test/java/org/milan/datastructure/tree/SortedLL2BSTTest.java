package org.milan.datastructure.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.datastructure.linkedlist.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SortedLL2BST}
 *
 * @author Milan Rathod
 */
class SortedLL2BSTTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(1));

        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(7);
    }

    @Test
    void testConvert() {
        SortedLL2BST sortedLL2BST = new SortedLL2BST();

        Node<Integer> root = sortedLL2BST.convert(linkedList.getHead(), 7);

        assertEquals(4, root.key);
    }
}