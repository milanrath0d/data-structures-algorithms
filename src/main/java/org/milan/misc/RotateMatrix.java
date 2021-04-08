package org.milan.misc;

/**
 * Refer {@link @https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/} and
 * {@link @https://www.geeksforgeeks.org/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/}
 *
 * @author Milan Rathod
 */
public class RotateMatrix {

    /**
     * Time complexity: O(N*N)
     * Space complexity: O(1)
     *
     * @param matrix given matrix for which 90 rotation should done
     * @param N      size of square matrix
     */
    public void rotate(int[][] matrix, int N) {

        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {

            // Consider elements in group of 4 in current square
            for (int y = x; y < N - x - 1; y++) {

                // Store current cell in temp variable
                int temp = matrix[x][y];

                // Move values from right to top
                matrix[x][y] = matrix[y][N - 1 - x];

                // Move values from bottom to right
                matrix[y][N - 1 - x] = matrix[N - 1 - x][N - 1 - y];

                // Move values from left to bottom
                matrix[N - 1 - x][N - 1 - y] = matrix[N - 1 - y][x];

                // Assign temp to left
                matrix[N - 1 - y][x] = temp;
            }
        }
    }

    /**
     * Time complexity: O(N*N)
     * Space complexity: O(1)
     *
     * @param matrix given matrix for which 90 rotation should done
     * @param N      size of square matrix
     */
    public void rotateV2(int[][] matrix, int N) {

        for (int j = 0; j < N; j++) {

            for (int i = N - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
