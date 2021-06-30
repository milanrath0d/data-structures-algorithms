package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class for {@link ReverseLinkedListII}
 *
 * @author Milan Rathod
 */
class ReverseLinkedListIITest {

    @Test
    void reverseBetween() {
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();

        ListNode listNode = getTestNode();

        ListNode newListNode = reverseLinkedListII.reverseBetween(listNode, 2, 4);

        assertEqualsUtil(newListNode);

        listNode = new ListNode(5);

        newListNode = reverseLinkedListII.reverseBetween(listNode, 1, 1);

        assertEquals(5, newListNode.val);
        assertNull(newListNode.next);
    }

    @Test
    void reverseBetweenV2() {
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();

        ListNode listNode = getTestNode();

        ListNode newListNode = reverseLinkedListII.reverseBetweenV2(listNode, 2, 4);

        assertEqualsUtil(newListNode);

        listNode = new ListNode(5);

        newListNode = reverseLinkedListII.reverseBetweenV2(listNode, 1, 1);

        assertEquals(5, newListNode.val);
        assertNull(newListNode.next);
    }

    private ListNode getTestNode() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        return listNode;
    }

    private void assertEqualsUtil(ListNode newListNode) {
        assertEquals(1, newListNode.val);
        assertEquals(4, newListNode.next.val);
        assertEquals(3, newListNode.next.next.val);
        assertEquals(2, newListNode.next.next.next.val);
        assertEquals(5, newListNode.next.next.next.next.val);
    }
}