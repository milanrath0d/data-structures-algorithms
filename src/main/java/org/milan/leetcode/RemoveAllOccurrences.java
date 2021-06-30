package org.milan.leetcode;

import java.util.Stack;

/**
 * TODO refactor this
 * <p>
 * Refer {@link @https://leetcode.com/problems/remove-all-occurrences-of-a-substring/}
 *
 * @author Milan Rathod
 */
public class RemoveAllOccurrences {

    public static void main(String[] args) {
        RemoveAllOccurrences removeAllOccurrences = new RemoveAllOccurrences();
        System.out.println(removeAllOccurrences.removeOccurrences("axxxxyyyyb", "xy"));
        System.out.println(removeAllOccurrences.removeOccurrences("daabcbaabcbc", "abc"));
    }

    public String removeOccurrences(String str, String part) {

        int n = str.length();

        int m = part.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Push character into the stack
            stack.add(str.charAt(i));

            if (stack.size() >= m) {

                // Create empty String to
                // store characters of stack
                String l = "";

                // Traverse the String K in reverse
                for (int j = m - 1; j >= 0; j--) {

                    // If any of the characters
                    // differ, it means that K
                    // is not present in the stack
                    if (part.charAt(j) != stack.peek()) {

                        // Push the elements
                        // back into the stack
                        int f = 0;
                        while (f != l.length()) {
                            stack.add(l.charAt(f));
                            f++;
                        }

                        break;
                    }

                    // Store the String
                    else {
                        l = stack.peek() + l;

                        // Remove top element
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.reverse().toString();
    }

}
