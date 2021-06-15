package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/search-a-2d-matrix/}
 *
 * @author Milan Rathod
 */
public class SearchInSortedMatrix {

    public boolean isPresent(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            // Check left and right most elements of the row
            if (target == matrix[mid][0] || target == matrix[mid][m - 1]) {
                return true;
            }

            if (target > matrix[mid][0] && target < matrix[mid][m - 1]) {
                return binarySearch(matrix, n, m, target, mid);
            }

            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    private boolean binarySearch(int[][] matrix, int n, int m, int target, int rowNumber) {
        int low = 0;
        int high = m - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (matrix[rowNumber][mid] == target) {
                return true;
            }

            if (matrix[rowNumber][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}
