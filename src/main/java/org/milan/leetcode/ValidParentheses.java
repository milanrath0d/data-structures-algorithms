package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Milan Rathod
 */
public class ValidParentheses {

    public boolean isValid(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty() || !isParenthesesMatching(stack.pop(), ch)) {
                // Returns false if stack is empty or popped opening bracket is not matching with closing bracket
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isParenthesesMatching(char src, char target) {
        return (src == '(' && target == ')') || (src == '{' && target == '}') || (src == '[' && target == ']');
    }

}
