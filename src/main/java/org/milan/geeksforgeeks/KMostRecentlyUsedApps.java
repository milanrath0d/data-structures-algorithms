package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://www.geeksforgeeks.org/program-for-k-most-recently-used-mru-apps/}
 *
 * @author Milan Rathod
 */
public class KMostRecentlyUsedApps {

    public int[] find(int[] arr, int k) {

        int n = arr.length;

        int index = k % n;

        int value = arr[index];
        int temp = index;

        while (temp > 0) {
            arr[temp] = arr[--temp];
        }

        arr[0] = value;

        return arr;
    }
}
