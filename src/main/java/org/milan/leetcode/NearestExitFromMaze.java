package org.milan.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Refer {@link @https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/}
 *
 * @author Milan Rathod
 */
public class NearestExitFromMaze {

    private static final int[] rowNum = {-1, 0, 0, 1};
    private static final int[] colNum = {0, -1, 1, 0};

    public int nearestExit(char[][] maze, int[] entrance) {

        int m = maze.length;
        int n = maze[0].length;

        boolean[][] visited = new boolean[m][n];

        visited[entrance[0]][entrance[1]] = true;

        Queue<Node> queue = new LinkedList<>();

        Point startingPoint = new Point(entrance[0], entrance[1]);

        Node node = new Node(startingPoint, 0);

        queue.add(node);

        int minSteps = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            Point point = curr.point;

            if (isDestination(point, startingPoint, m, n)) {
                minSteps = Math.min(minSteps, curr.distance);
            }

            for (int i = 0; i < 4; i++) {
                int currentRow = point.x + rowNum[i];
                int currentColumn = point.y + colNum[i];

                if (isValid(currentRow, currentColumn, m, n) &&
                    maze[currentRow][currentColumn] != '+' &&
                    !visited[currentRow][currentColumn]) {
                    visited[currentRow][currentColumn] = true;
                    Node tempNode = new Node(new Point(currentRow, currentColumn), curr.distance + 1);
                    queue.add(tempNode);
                }
            }
        }

        return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
    }

    private boolean isDestination(Point point, Point startingPoint, int m, int n) {
        // Check for starting point
        if (point.x == startingPoint.x && point.y == startingPoint.y) {
            return false;
        } else {
            return point.x == 0 || point.x == m - 1 || point.y == 0 || point.y == n - 1;
        }
    }

    static boolean isValid(int row, int col, int m, int n) {
        return (row >= 0) && (row < m) &&
            (col >= 0) && (col < n);
    }

    private static class Node {
        Point point;
        int distance;

        public Node(Point point, int distance) {
            this.point = point;
            this.distance = distance;
        }
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
