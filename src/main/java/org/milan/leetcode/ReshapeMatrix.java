package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/reshape-the-matrix/}
 *
 * @author Milan Rathod
 */
public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        int total = m * n;

        if (total != r * c || (n == r && m == c)) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < total; i++) {
            result[i / c][i % c] = mat[i / m][i % m];
        }

        return result;
    }

}
