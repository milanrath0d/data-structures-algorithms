package org.milan.test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class HE1 {

    public static void main(String[] args) {

        System.out.println(segmentV2(3, List.of(2, 5, 4, 6, 8)));

        System.out.println(segmentV2(2, List.of(1, 1, 1)));

        System.out.println(segmentV2(1, List.of(1, 2, 3, 1, 2)));
    }

    public static int segment(int x, List<Integer> space) {

        if (space.size() == 1) {
            return space.get(0);
        }

        int max = Integer.MIN_VALUE;

        int previousMin = Integer.MAX_VALUE;

        for (int i = 0; i < space.size() - x; i++) {

            int currentMin = Integer.MAX_VALUE;

            for (int j = i; j < i + x; j++) {

                currentMin = Math.min(currentMin, space.get(j));
            }

            max = Math.max(max, currentMin);
        }

        return max;
    }

    public static int segmentV2(int x, List<Integer> space) {
        // Stores index of array element
        Deque<Integer> deque = new ArrayDeque<>(x);

        int n = space.size();

        int[] output = new int[n - x + 1];

        int index = 0;

        for (int i = 0; i < space.size(); i++) {

            // Remove the elements which are out of window
            while (!deque.isEmpty() && deque.peek() <= i - x) {
                deque.removeFirst();
            }

            // For every element, the previous smaller element is useless so remove it from deque
            while (!deque.isEmpty() && space.get(i) < space.get(deque.peekLast())) {
                deque.removeLast();
            }

            // Add new element at the deque
            deque.addLast(i);

            if (i >= x - 1) {
                output[index++] = space.get(deque.peek());
            }
        }

        return Arrays.stream(output).max().getAsInt();
    }
}
