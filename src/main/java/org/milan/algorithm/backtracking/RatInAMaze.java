package org.milan.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Rat in a maze
 * <p>
 * refer {@link @<a href="https://www.geeksforgeeks.org/rat-in-a-maze/">...</a>}
 *
 * @author Milan Rathod
 */
public class RatInAMaze {

    /**
     * Using backtracking
     *
     * @param maze given maze
     * @return result list of all the possible paths
     */
    public List<String> solveMaze(int[][] maze) {
        List<String> result = new ArrayList<>();
        
        // Check if maze is valid and starting/ending points are accessible
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return result;
        }
        
        int n = maze.length;
        
        // Check if starting and ending points are valid
        if (maze[0][0] == 1 && maze[n-1][n-1] == 1) {
            // Create a visited array to keep track of visited cells
            boolean[][] visited = new boolean[n][n];
            
            // Start exploration from (0,0) with empty path
            explore(0, 0, maze, "", result, visited);
        }

        return result;
    }

    /**
     * Recursive Utility function to solve this problem
     * 
     * @param x current x-coordinate
     * @param y current y-coordinate
     * @param maze the maze grid
     * @param path current path string
     * @param result list to store valid paths
     * @param visited array to track visited cells
     */
    private void explore(int x, int y, int[][] maze, String path, List<String> result, boolean[][] visited) {
        int n = maze.length;
        
        // If x & y co-ordinates are destination, add path to result
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }
        
        // Mark current cell as visited
        visited[x][y] = true;
        
        // Try all four directions: Down, Left, Right, Up
        
        // Down
        if (isValid(x + 1, y, maze, visited)) {
            explore(x + 1, y, maze, path + "D", result, visited);
        }
        
        // Left
        if (isValid(x, y - 1, maze, visited)) {
            explore(x, y - 1, maze, path + "L", result, visited);
        }
        
        // Right
        if (isValid(x, y + 1, maze, visited)) {
            explore(x, y + 1, maze, path + "R", result, visited);
        }
        
        // Up
        if (isValid(x - 1, y, maze, visited)) {
            explore(x - 1, y, maze, path + "U", result, visited);
        }
        
        // Backtrack: mark current cell as unvisited
        visited[x][y] = false;
    }

    /**
     * Checks if a position is valid to move to
     * 
     * @param x x-coordinate
     * @param y y-coordinate
     * @param maze the maze grid
     * @param visited array tracking visited cells
     * @return true if the position is valid to move to
     */
    private boolean isValid(int x, int y, int[][] maze, boolean[][] visited) {
        // Check if x,y is within bounds, the cell is not blocked, and not already visited
        return (x >= 0 && x < maze.length && 
                y >= 0 && y < maze.length && 
                maze[x][y] == 1 && 
                !visited[x][y]);
    }

}
