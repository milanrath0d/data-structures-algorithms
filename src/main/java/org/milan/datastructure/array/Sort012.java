package org.milan.datastructure.array;

import org.milan.util.ArrayUtil;

/**
 * Problem: {@link @https://www.geeksforgeeks.org/sort-array-0s-1s-2s-simple-counting/?ref=lbp}
 *
 * @author Milan Rathod
 */
public class Sort012 {

    /**
     * Using linear search
     * <p>
     * This method traverse given array multiple times
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr given array of integers
     * @return sorted array
     */
    public int[] sort(int[] arr) {
        int onesCount = 0;
        int zerosCount = 0;
        int twosCount = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    zerosCount++;
                    break;
                case 1:
                    onesCount++;
                    break;
                case 2:
                    twosCount++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + arr[i]);
            }
        }

        int i = 0;

        while (i < zerosCount) {
            arr[i++] = 0;
        }

        while (i < onesCount + zerosCount) {
            arr[i++] = 1;
        }

        while (i < twosCount + onesCount + zerosCount) {
            arr[i++] = 2;
        }

        return arr;
    }

    /**
     * Using solution of Dutch national flag problem
     * <p>
     * This method traverse given array only once
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr given array of integers
     * @return sorted array
     */
    public int[] sortV2(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    ArrayUtil.swap(arr, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    ArrayUtil.swap(arr, mid, high--);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + arr[mid]);

            }
        }

        return arr;
    }
}
