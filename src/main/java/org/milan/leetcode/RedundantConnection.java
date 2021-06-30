package org.milan.leetcode;

/**
 * Refer {@link @https://leetcode.com/problems/redundant-connection/}
 *
 * @author Milan Rathod
 */
public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {

        // parent array used for creating subsets
        int[] parent = new int[edges.length];

        // Iterate through all edges of graph, find subset of both
        // vertices of every edge, if both subsets are same, then
        // there is cycle in graph.
        for (int[] edge : edges) {
            int src = edge[0];
            int dest = edge[1];

            // Find subsets in which src and destination vertices are present
            int x = find(parent, src - 1);
            int y = find(parent, dest - 1);

            // Check if x and y are same then cycle exists return current edge
            if (x == y) {
                return edge;
            }

            // Take union of x and y
            union(parent, x, y);
        }

        return null;
    }

    /**
     * Find subset in which given element belongs to
     * It might take O(n) time to find
     */
    private int find(int[] parent, int i) {
        if (parent[i] == 0)
            return i;

        return find(parent, parent[i]);
    }

    /**
     * Do union of two elements and placed both into same subsets
     * It might take O(n) time to perform
     */
    private void union(int[] parent, int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);

        parent[xSet] = ySet;
    }
}
