package org.milan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer {@link @https://leetcode.com/problems/reverse-linked-list-ii/}
 *
 * @author Milan Rathod
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        // In case of empty list return null
        if (head == null) {
            return null;
        }

        int count = 1;

        // Move curr and prev until they reach proper starting point in the list
        ListNode curr = head;

        ListNode prev = null;

        while (curr != null && count < left) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        // A node before the subList's node
        ListNode beforeNode = prev;

        // Sublist's first node
        ListNode subHead = curr;

        ListNode next;

        // Reverse the sublist
        while (curr != null && count <= right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // Fix the connections
        if (beforeNode != null) {
            beforeNode.next = prev;
        } else {
            head = prev;
        }

        subHead.next = curr;

        return head;
    }

    public ListNode reverseBetweenV2(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        List<Integer> arr = toList(head);

        while (left < right) {
            int t = arr.get(left - 1);
            arr.set(left - 1, arr.get(right - 1));
            arr.set(right - 1, t);

            left++;
            right--;
        }

        ListNode dummy = head;

        for (int i = 0; i < arr.size(); i++) {
            dummy.val = arr.get(i);
            dummy = dummy.next;
        }

        return head;
    }

    private List<Integer> toList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return list;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

