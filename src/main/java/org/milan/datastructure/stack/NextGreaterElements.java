package org.milan.datastructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/next-greater-element/}
 *
 * @author Milan Rathod
 */
public class NextGreaterElements {

    /**
     * Find next greater elements for each array elements
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     * worst time complexity occurs when array is sorted in decreasing order
     * <p>
     * Issue: Does not print in same order
     *
     * @param input array of integers
     * @return array consists of next greater elements
     */
    public String[] findAll(int[] input) {
        Stack<Integer> stack = new Stack<>();

        List<String> outList = new ArrayList<>();

        stack.push(input[0]);

        for (int i = 1; i < input.length; i++) {
            int next = input[i];

            if (!stack.isEmpty()) {

                int element = stack.pop();

                // If the popped element is smaller than next
                // add it to output, keep popping while elements are smaller until stack is empty
                while (element < next) {
                    outList.add(element + "--" + next);
                    if (stack.isEmpty()) break;
                    element = stack.pop();
                }

                // If the element is greater than next push the element back
                if (element > next) {
                    stack.push(element);
                }

            }

            // Push next to stack so that we can find next greater for it
            stack.push(next);
        }

        while (!stack.isEmpty()) {
            Integer element = stack.pop();
            outList.add(element + "--" + -1);
        }
        return outList.toArray(new String[]{});
    }

    /**
     * Find next greater elements for each array elements
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n) (can be avoided if reverse print order is followed)
     * worst time complexity occurs when array is sorted in decreasing order
     * <p>
     *
     * @param input array of integers
     * @return array consists of next greater elements
     */
    public String[] findAllV2(int[] input) {
        Stack<Integer> stack = new Stack<>();

        String[] output = new String[input.length];

        for (int i = input.length - 1; i >= 0; i--) {

            // Pop till we get greater element on top or stack is empty
            while (!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }

            String temp = input[i] + "--";

            // If stack got empty means there is no element on right which is
            // greater than the current element.
            // If not empty then the next greater element is on top of the stack
            if (stack.isEmpty()) {
                output[i] = temp + -1;
            } else {
                output[i] = temp + stack.peek();
            }

            stack.push(input[i]);
        }

        return output;
    }

}
