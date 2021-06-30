package org.milan.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Milan Rathod
 */
public class GlobalMaximum {

    public static void main(String[] args) {
        System.out.println(findMaximum(Arrays.asList(1, 2, 3, 4), 3));
        System.out.println(findMaximum(Arrays.asList(2, 3, 5, 9), 3));
    }

    public static int findMaximum(List<Integer> arr, int m) {

        int[] nums = arr.stream().mapToInt(value -> value).toArray();

        int n = nums.length;

        int start = 0;
        int end = nums[n - 1] - nums[0];

        int ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If subsequence can be formed with min diff mid and size m
            if (isSubsequencePossible(nums, n, m, mid)) {
                ans = mid;

                // Right half
                start = mid + 1;
            } else {

                // Left half
                end = mid - 1;
            }
        }
        return ans;
    }


    private static boolean isSubsequencePossible(int[] arr, int n, int m, int mid) {
        int count = 1;
        int lastPosition = arr[0];

        // If a subsequence of size m with min diff equals to mid is possible return true
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPosition >= mid) {
                lastPosition = arr[i];
                count++;
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }

}
