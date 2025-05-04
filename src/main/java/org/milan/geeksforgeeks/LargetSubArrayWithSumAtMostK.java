package org.milan.geeksforgeeks;

/**
 * Refer {@link @link <a href="https://www.geeksforgeeks.org/longest-subarray-sum-elements-atmost-k/">...</a>}
 *
 * @author Milan Rathod
 */
public class LargetSubArrayWithSumAtMostK {

    public int find(int[] arr, int k) {
        // Initialize maxLength to 0
        int maxLength = 0;

        // Initialize sum to 0
        int sum = 0;

        // Initialize start index to 0
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            // If the current element is greater than k, reset the sum and start index
            if (arr[end] > k) {
                sum = 0;
                start = end + 1;
                continue;
            }
            sum += arr[end];

            while (sum > k) {
                sum -= arr[start++];
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
