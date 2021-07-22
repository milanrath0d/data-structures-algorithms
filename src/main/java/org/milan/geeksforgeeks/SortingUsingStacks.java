package org.milan.geeksforgeeks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

/**
 * Refer {@link @https://www.geeksforgeeks.org/sorting-array-using-stacks/}
 * {@link @https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/}
 *
 * @author Milan Rathod
 */
public class SortingUsingStacks {

    public Deque<Integer> sortStack(Deque<Integer> stack) {

        Deque<Integer> temp = new ArrayDeque<>();

        while (!stack.isEmpty()) {
            Integer curr = stack.pop();

            if (temp.isEmpty() || temp.peek() > curr) {
                temp.push(curr);
            } else {
                while (!temp.isEmpty() && temp.peek() < curr) {
                    stack.push(temp.pop());
                }
                temp.push(curr);
            }
        }
        return temp;
    }

    public int[] sortArray(int[] arr) {

        Deque<Integer> stack = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayDeque::new));

        Deque<Integer> sortedStack = sortStack(stack);

        return sortedStack.stream().mapToInt(value -> value).toArray();
    }
}
