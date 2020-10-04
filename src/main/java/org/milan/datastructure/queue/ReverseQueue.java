package org.milan.datastructure.queue;

import java.util.Queue;
import java.util.Stack;

/**
 * @author Milan Rathod
 */
public class ReverseQueue {

    /**
     * Refer {@link @https://www.geeksforgeeks.org/reversing-a-queue/}
     * <p>
     * Time complexity: O(N)
     * Space complexity: O(N)
     *
     * @param queue queue for which contents to be reversed
     */
    public void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Pop the elements from queue and push it to stack
        // Topmost element of the stack is last element of queue
        while (!queue.isEmpty()) {
            stack.add(queue.poll());
        }

        // Pop the elements for stack and push it to queue
        // Last element of queue will become first element
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    /**
     * Refer {@link @https://www.geeksforgeeks.org/reversing-queue-using-recursion/}
     * <p>
     * Time complexity: O(N)
     * Space complexity: O(1)
     *
     * @param queue queue for which contents to be reversed
     */
    public void reverseV2(Queue<Integer> queue) {
        // Base case
        if (queue.isEmpty())
            return;

        // Dequeue current item (from front)
        int data = queue.peek();
        queue.remove();

        // Reverse remaining queue
        reverseV2(queue);

        // Enqueue current item (to rear)
        queue.add(data);
    }

}
