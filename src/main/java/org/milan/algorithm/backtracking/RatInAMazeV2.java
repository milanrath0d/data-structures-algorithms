package org.milan.algorithm.backtracking;

/**
 * Problem: Rat in a maze
 * <p>
 * refer {@link @<a href="https://www.geeksforgeeks.org/rat-in-a-maze-with-multiple-steps-jump-allowed/">...</a>}
 *
 * @author Milan Rathod
 */
public class RatInAMazeV2 {

    private int[][] solution;

    /**
     * Using backtracking
     *
     * @param maze given maze
     * @return true if solution exists otherwise false
     */
    public boolean solveMaze(int[][] maze) {
        solution = new int[maze.length][maze.length];

        return explore(0, 0, maze, solution);
    }

    /**
     * Recursive Utility function to solve this problem
     */
    private boolean explore(int x, int y, int[][] maze, int[][] solution) {

        // If x & y co-ordinates are destination return true
        if (x == maze.length - 1 && y == maze.length - 1) {
            solution[x][y] = 1;
            return true;
        }

        // Check if maze [x][y] is valid
        if (isValid(x, y, maze)) {

            // Mark x, y as part of solution
            solution[x][y] = 1;

            // Extra step here since multiple jumps are allowed
            for (int i = 1; i <= maze[x][y]; i++) {
                // Move forward in x direction
                if (explore(x + i, y, maze, solution))
                    return true;

                // If moving in x direction does not give solution move down in y direction
                if (explore(x, y + i, maze, solution))
                    return true;
            }

            // Backtrack - if moving forward and down does not works
            solution[x][y] = 0;
            return false;
        }
        return false;
    }

    /**
     * x and y are valid indexes for next move in maze
     */
    private boolean isValid(int x, int y, int[][] maze) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] != 0);
    }

    /**
     * @return Get solution for given maze
     */
    public int[][] getSolution() {
        return solution;
    }

}
