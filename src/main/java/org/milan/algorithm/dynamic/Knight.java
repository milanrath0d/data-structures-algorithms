package org.milan.algorithm.dynamic;

/**
 * @author Milan Rathod
 */
public class Knight {

    public static void main(String[] args) {
        int result = minMoves(10, 0, 0, 0, 2);
        System.out.println(result);
    }

    public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {
        int[][] dp = new int[n][n];

        int result;

        if ((startRow == 1 && startCol == 1 && endRow == 2 && endCol == 2) ||
                (startRow == 2 && startCol == 2 && endRow == 1 && endCol == 1))
            result = 4;
        else if ((startRow == 1 && startCol == n && endRow == 2 && endCol == n - 1) ||
                (startRow == 2 && startCol == n - 1 && endRow == 1 && endCol == n))
            result = 4;
        else if ((startRow == n && startCol == 1 && endRow == n - 1 && endCol == 2) ||
                (startRow == n - 1 && startCol == 2 && endRow == n && endCol == 1))
            result = 4;
        else if ((startRow == n && startCol == n && endRow == n - 1 && endCol == n - 1) ||
                (startRow == n - 1 && startCol == n - 1 && endRow == n && endCol == n))
            result = 4;
        else {
            dp[1][0] = 3;
            dp[0][1] = 3;
            dp[1][1] = 2;
            dp[2][0] = 2;
            dp[0][2] = 2;
            dp[2][1] = 1;
            dp[1][2] = 1;

            result = minMovesUtil(dp, startRow, startCol, endRow, endCol);
        }

        return result;
    }

    private static int minMovesUtil(int[][] dp, int startRow, int startCol, int endRow, int endCol) {

        if (startRow == endRow && startCol == endCol) {
            return dp[0][0];
        } else {
            if (dp[Math.abs(startRow - endRow)][Math.abs(startCol - endCol)] != 0) {
                return dp[Math.abs(startRow - endRow)][Math.abs(startCol - endCol)];
            } else {

                int x1, y1, x2, y2;

                if (startRow <= endRow) {
                    if (startCol <= endCol) {
                        x1 = startRow + 2;
                        y1 = startCol + 1;
                        x2 = startRow + 1;
                        y2 = startCol + 2;
                    } else {
                        x1 = startRow + 2;
                        y1 = startCol - 1;
                        x2 = startRow + 1;
                        y2 = startCol - 2;
                    }
                } else if (startCol <= endCol) {
                    x1 = startRow - 2;
                    y1 = startCol + 1;
                    x2 = startRow - 1;
                    y2 = startCol + 2;
                } else {
                    x1 = startRow - 2;
                    y1 = startCol - 1;
                    x2 = startRow - 1;
                    y2 = startCol - 2;
                }

                dp[Math.abs(startRow - endRow)][Math.abs(startCol - endCol)]
                        = Math.min(minMovesUtil(dp, x1, y1, endRow, endCol),
                        minMovesUtil(dp, x2, y2, endRow, endCol)) + 1;

                dp[Math.abs(startCol - endCol)][Math.abs(startRow - endRow)]
                        = dp[Math.abs(startRow - endRow)][Math.abs(startCol - endCol)];

                return dp[Math.abs(startRow - endRow)][Math.abs(startCol - endCol)];
            }
        }
    }
}