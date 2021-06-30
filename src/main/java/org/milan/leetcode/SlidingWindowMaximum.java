package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Refer {@link @https://leetcode.com/problems/sliding-window-maximum/}
 *
 * @author Milan Rathod
 */
public class SlidingWindowMaximum {

    /**
     * Get all maximum elements of k sliding windows
     * <p>
     * Time complexity: O(n + k)
     * Space complexity: O(k)
     *
     * @param nums input array
     * @param k    window size
     * @return list of integers of maximum elements
     */
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Stores index of array element
        Deque<Integer> deque = new ArrayDeque<>(k);

        int n = nums.length;

        int[] output = new int[n - k + 1];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove the elements which are out of window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }

            // For every element, the previous smaller element is useless so remove it from deque
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            // Add new element at the deque
            deque.addLast(i);

            if (i >= k - 1) {
                output[index++] = nums[deque.peek()];
            }
        }

        return output;
    }

    /**
     * Get maximum element from window of size k
     * <p>
     * Time Complexity: O(n*k)
     *
     * @param nums input array of integers
     * @param k    window length
     * @return list of maximum elements in all windows of length k
     */
    public int[] maxSlidingWindowV2(int[] nums, int k) {
        int max;

        List<Integer> outputList = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            max = nums[i];

            for (int j = 1; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }
            }
            outputList.add(max);
        }

        return outputList.stream().mapToInt(value -> value).toArray();
    }
}
