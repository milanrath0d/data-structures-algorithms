package org.milan.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem: Balance Brackets
 * <p>
 * refer {@link @https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/}
 *
 * @author Milan Rathod
 */
public class BalanceBrackets {

    public boolean checkBalance(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if ((ch == ')') && (!stack.isEmpty())) {

                if ((stack.peek() == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                if (ch == ')') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
