package org.milan.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Refer {@link @https://leetcode.com/problems/find-k-closest-elements/}
 *
 * @author Milan Rathod
 */
public class KClosestElements {

    /**
     * Time complexity: O(n)
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (right - left >= k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
    }

    public List<Integer> findClosestElementsV2(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
    }
}
