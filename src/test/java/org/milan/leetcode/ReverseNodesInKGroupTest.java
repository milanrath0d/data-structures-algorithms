package org.milan.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for {@link ReverseNodesInKGroup}
 *
 * @author Milan Rathod
 */
class ReverseNodesInKGroupTest {

    @BeforeEach
    void init() {

    }

    @Test
    void reverseKGroup() {
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

        ListNode listNode = new ListNode(1);

        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
    }
}