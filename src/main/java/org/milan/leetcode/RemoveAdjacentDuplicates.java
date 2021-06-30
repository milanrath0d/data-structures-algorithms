package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Refer {@link @https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/}
 *
 * @author Milan Rathod
 */
public class RemoveAdjacentDuplicates {

    public String removeDuplicates(String str) {

        // Stack for storing array elements
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            // If stack is empty or current element is not equal to top of the stack, push it to stack
            if (stack.isEmpty() || str.charAt(i) != stack.peek()) {
                stack.push(str.charAt(i));
            } else {
                // Remove adjacent duplicate from stack
                stack.pop();
            }
        }

        // Used for returning final string
        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        // Since we are fetching elements from stack, first reverse the string and then return
        return output.reverse().toString();
    }

}
