package org.milan.hackerearth;

/**
 * Problem: {@link @https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/linear-search-problem-1/}
 *
 * @author Milan Rathod
 */
public class LastOccurrence {

    /**
     * @param arr input array
     * @param M   element
     * @return last occurrence of element M in given array if present otherwise -1
     */
    public int get(int[] arr, int M) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (M == arr[i]) {
                return i + 1;
            }
        }

        return -1;
    }

}
