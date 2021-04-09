package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link IntersectionPoint}
 *
 * @author Milan Rathod
 */
class IntersectionPointTest {

    private LinkedList<Integer> firstLinkedList;

    private LinkedList<Integer> secondLinkedList;

    private IntersectionPoint intersectionPoint;

    @BeforeEach
    void setup() {
        firstLinkedList = new LinkedList<>(new LinkedList.Node<>(5));

        firstLinkedList.insertAtEnd(10);
        firstLinkedList.insertAtEnd(15);
        firstLinkedList.insertAtEnd(20);
        firstLinkedList.insertAtEnd(25);

        secondLinkedList = new LinkedList<>(new LinkedList.Node<>(3));

        secondLinkedList.insertAtEnd(7);
        secondLinkedList.insertAtEnd(20);
        secondLinkedList.insertAtEnd(25);

        intersectionPoint = new IntersectionPoint();
    }

    @Test
    void testFind() {
        LinkedList.Node<Integer> intersectedNode = intersectionPoint.find(firstLinkedList.getHead(), secondLinkedList.getHead());

        assertEquals(20, intersectedNode.getData().intValue());
    }
}