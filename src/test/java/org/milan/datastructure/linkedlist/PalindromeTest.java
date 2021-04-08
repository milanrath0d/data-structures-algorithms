package org.milan.datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link Palindrome}
 *
 * @author Milan Rathod
 */
class PalindromeTest {

    private LinkedList<Integer> linkedList;

    private Palindrome palindrome;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>(new LinkedList.Node<>(5));

        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(15);
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(5);

        palindrome = new Palindrome();
    }

    @Test
    void testUsingStack() {
        assertTrue(palindrome.usingStack(linkedList.getHead()));
    }

    @Test
    void testUsingRecursion() {
        assertTrue(palindrome.usingRecursion(linkedList.getHead()));
    }
}