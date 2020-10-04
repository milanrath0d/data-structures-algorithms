package org.milan.datastructure.queue;

import java.util.Queue;
import java.util.Stack;

/**
 * refer {@link @https://www.geeksforgeeks.org/reversing-first-k-elements-queue/}
 *
 * @author Milan Rathod
 */
public class ReverseFirstKElements {

    public void reverse(Queue<Integer> queue, int k) {

        if (queue.isEmpty() || k > queue.size())
            return;
        if (k <= 0)
            return;

        Stack<Integer> stack = new Stack<>();

        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    public void reverseV2(Queue<Integer> queue, int k) {

        reverseUtil(queue, k);

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    private void reverseUtil(Queue<Integer> queue, int k) {
        // Base case
        if (queue.isEmpty() || queue.size() <= Math.abs(queue.size() - k))
            return;

        // Dequeue current item (from front)
        int data = queue.peek();
        queue.remove();

        // Reverse remaining queue
        reverseUtil(queue, k);

        // Enqueue current item (to rear)
        queue.add(data);
    }
}
