package org.milan.datastructure.array;

import org.milan.datastructure.misc.Euclid;

/**
 * refer {@link @https://www.geeksforgeeks.org/array-rotation/}
 *
 * @author Milan Rathod
 */
public class ArrayRotation {

    /**
     * Time complexity: O(N*d)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @param d   rotation count
     */
    public void rotate(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            rotateByOne(arr);
        }
    }

    /**
     * Time complexity: O(N)
     * Space complexity: O(1)
     *
     * @param arr given array
     * @param d   rotation count
     */
    public void rotateV2(int[] arr, int d) {

        int n = arr.length;

        // To handle if d >= n
        d = d % n;

        Euclid euclid = new Euclid();

        int gcd = euclid.gcd(d, n);
        for (int i = 0; i < gcd; i++) {
            // Move ith values of blocks
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    private void rotateByOne(int[] arr) {
        int temp = arr[0];
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }
}
