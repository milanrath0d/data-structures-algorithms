package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/}
 *
 * @author Milan Rathod
 */
public class SearchInRowWiseColumnWiseSortedMatrix {

    /**
     * Time complexity: O(n + m)
     * Space complexity: O(1)
     *
     * @param matrix row wise and column wise sorted matrix
     * @param x      element to be searched
     * @return true if found otherwise false
     */
    public boolean search(int[][] matrix, int x) {

        int n = matrix.length;

        int i = 0;

        int j = matrix[0].length - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                return true;
            }

            if (matrix[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

    /**
     * Time complexity: O(log(n) + log(m))
     * Space complexity: O(1)
     *
     * @param matrix row wise and column wise sorted matrix
     * @param target element to be searched
     * @return true if found otherwise false
     */
    public boolean searchV2(int[][] matrix, int target) {
        int m = matrix.length;
        if (m < 1) return false;
        int n = matrix[0].length;

        return searchUtil(matrix, new int[]{0, 0}, new int[]{m - 1, n - 1}, target);
    }

    private boolean searchUtil(int[][] matrix, int[] upperLeft, int[] lowerRight, int target) {
        if (upperLeft[0] > lowerRight[0] || upperLeft[1] > lowerRight[1]
            || lowerRight[0] >= matrix.length || lowerRight[1] >= matrix[0].length)
            return false;
        if (lowerRight[0] - upperLeft[0] == 0 && lowerRight[1] - upperLeft[1] == 0)
            return matrix[upperLeft[0]][upperLeft[1]] == target;
        int rowMid = (upperLeft[0] + lowerRight[0]) >> 1;
        int colMid = (upperLeft[1] + lowerRight[1]) >> 1;
        int diff = matrix[rowMid][colMid] - target;
        if (diff > 0) {
            return searchUtil(matrix, upperLeft, new int[]{rowMid, colMid}, target)
                || searchUtil(matrix, new int[]{upperLeft[0], colMid + 1}, new int[]{rowMid, lowerRight[1]}, target)
                || searchUtil(matrix, new int[]{rowMid + 1, upperLeft[1]}, new int[]{lowerRight[0], colMid}, target);
        } else if (diff < 0) {
            return searchUtil(matrix, new int[]{upperLeft[0], colMid + 1}, new int[]{rowMid, lowerRight[1]}, target)
                || searchUtil(matrix, new int[]{rowMid + 1, upperLeft[1]}, new int[]{lowerRight[0], colMid}, target)
                || searchUtil(matrix, new int[]{rowMid + 1, colMid + 1}, lowerRight, target);
        } else return true;
    }

}
