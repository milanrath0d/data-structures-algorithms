package org.milan.datastructure.array;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/}
 *
 * @author Milan Rathod
 */
public class SegregateZerosAndOnes {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     * <p>
     * This method traverse an array only once
     *
     * @param arr given input array of integers
     */
    public void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Increment left pointer when arr[left] is zero
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Decrement right pointer when arr[left] is one
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // If left is smaller than right then there is 1 at left and 0 at right side
            // swap them
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
