package org.milan.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Refer {@link @<a href="https://leetcode.com/problems/sliding-window-maximum/">...</a>}
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
     * @return integers list of maximum elements
     */
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Stores index of an array element
        Deque<Integer> deque = new ArrayDeque<>(k);

        int n = nums.length;

        int[] output = new int[n - k + 1];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }

            // Remove smaller elements as they cannot be the maximum
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }

            // Add current element's index
            deque.addLast(i);

            // Add to the result if we've reached window size
            if (i >= k - 1) {
                output[index++] = nums[deque.peekFirst()];
            }
        }

        return output;
    }

    /**
     * Get a maximum element from a window of size k
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
