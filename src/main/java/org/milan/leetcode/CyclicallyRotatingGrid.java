package org.milan.leetcode;

/**
 * TODO complete this
 * <p>
 * Refer {@link @https://leetcode.com/problems/cyclically-rotating-a-grid/}
 *
 * @author Milan Rathod
 */
public class CyclicallyRotatingGrid {

    public static void main(String[] args) {
        CyclicallyRotatingGrid cyclicallyRotatingGrid = new CyclicallyRotatingGrid();

//        int[][] grid = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};

//        int[][] grid = {{40, 10}, {30,20}};

        int[][] grid = {{10, 1, 4, 8}, {6, 6, 3, 10}, {7, 4, 7, 10}, {1, 10, 6, 1}, {2, 1, 1, 10}, {3, 8, 9, 2}, {7, 1, 10, 10}, {7, 1, 4, 9}, {2, 2, 4, 2}, {10, 7, 5, 10}};


        int[][] mat = cyclicallyRotatingGrid.rotateGrid(grid, 1);


        // Print rotated matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }

    public int[][] rotateGrid(int[][] grid, int k) {

        while (k-- > 0) {
            int prev, curr;
            int row = 0, col = 0;
            int n = grid.length;
            int m = grid[0].length;

            while (row < m && col < n) {

                if (row + 1 == m || col + 1 == n)
                    break;

                // Store the first element of next
                // row, this element will replace
                // first element of current row
                prev = grid[row + 1][m - 1];

                // Move elements of first row
                // from the remaining rows
                for (int i = m - 1; i >= col; i--) {
                    curr = grid[row][i];
                    grid[row][i] = prev;
                    prev = curr;
                }
                row++;

                // Move elements of first column
                // from the remaining columns
                for (int i = row; i < m; i++) {
                    curr = grid[i][col];
                    grid[i][col] = prev;
                    prev = curr;
                }
                n--;

                // Move elements of last row
                // from the remaining rows
                if (row < m) {
                    for (int i = col; i < m; i++) {
                        curr = grid[m - 1][i];
                        grid[m - 1][i] = prev;
                        prev = curr;
                    }
                }
                m--;

                // Move elements of first column
                // from the remaining rows
                if (col < n) {
                    for (int i = m - 1; i >= row; i--) {
                        curr = grid[i][m - col];
                        grid[i][m - col] = prev;
                        prev = curr;
                    }
                }
                col++;
            }

        }

        return grid;
    }

}
