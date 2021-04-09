package org.milan.misc;

import java.util.Arrays;

/**
 * Refer {@link @https://www.geeksforgeeks.org/sort-given-matrix/}
 * <p>
 * Time complexity: O(n2*logn) -- sort the given n*n array
 * Space complexity: O(n*n)
 *
 * @author Milan Rathod
 */
public class MatrixSorting {

    public int[][] sort(int[][] matrix, int n) {

        // Temp array of size n*n
        int[] temp = new int[n * n];

        int k = 0;

        // Copy all elements of matrix into temp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[k++] = matrix[i][j];
            }
        }

        // Sort the given temp array
        Arrays.sort(temp);

        k = 0;

        // Copy back all temp array to matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[k++];
            }
        }

        return matrix;
    }
}
