package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/min-stack/}
 *
 * @author Milan Rathod
 */
public class MinStack {

    private StackNode head;

    public void push(int val) {
        if (head == null) {
            head = new StackNode(val, val);
        } else {
            head = new StackNode(val, Math.min(head.min, val), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }

    private static class StackNode {
        int value;

        int min;

        StackNode next;

        public StackNode(int value, int min) {
            this(value, min, null);
        }

        public StackNode(int value, int min, StackNode next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}
